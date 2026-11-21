"""Read-only parser of class u animation byte stream (Java ME).

Sequence table uses little-endian 16-bit offsets. Positive-duration
records consist of a 3-byte header followed by 8-byte drawing commands.
No action labels are inferred.
"""
from dataclasses import dataclass

@dataclass(frozen=True)
class Frame:
    sequence: int
    step: int
    duration: int
    draw_count: int
    image_indices: tuple[int, ...]

def signed8(n):
    return n - 256 if n > 127 else n

def decode_sequence(data: bytes, sequence: int, max_steps: int = 1024):
    if sequence < 0 or sequence * 2 + 2 > len(data):
        raise ValueError("Sequence index outside table")
    pos = int.from_bytes(data[2*sequence:2*sequence+2], "little")
    frames = []
    for step in range(max_steps):
        if pos + 3 > len(data):
            raise ValueError("Truncated animation header")
        duration = signed8(data[pos])
        count = signed8(data[pos+1])
        control = signed8(data[pos+2])
        if duration <= 0:
            return {"sequence":sequence, "frames":frames,
                    "terminator":duration, "control":(count,control), "offset":pos}
        if count < 0 or pos + 3 + count*8 > len(data):
            raise ValueError("Invalid draw count or truncated data")
        indices = tuple(int.from_bytes(data[pos+3+j*8:pos+5+j*8],
                                        "little", signed=True) for j in range(count))
        frames.append(Frame(sequence,step,duration,count,indices))
        pos += 3 + count*8
    raise ValueError("Exceeded max_steps without terminator")
