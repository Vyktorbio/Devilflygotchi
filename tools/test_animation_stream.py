import unittest
from animation_stream import decode_sequence

class TestAnimation(unittest.TestCase):
    def test_frame_and_stop(self):
        stream = b'\x02\x00' + bytes([3,1,0,123,0,0,0,0,0,0,0,254,0,0])
        result = decode_sequence(stream,0)
        self.assertEqual(result["frames"][0].duration,3)
        self.assertEqual(result["frames"][0].image_indices,(123,))
        self.assertEqual(result["terminator"],-2)
    def test_truncated(self):
        with self.assertRaises(ValueError):
            decode_sequence(b'\x02\x00\x03\x01\x00',0)
    def test_outside(self):
        with self.assertRaises(ValueError):
            decode_sequence(b'\x00',1)

if __name__ == "__main__":
    unittest.main()
