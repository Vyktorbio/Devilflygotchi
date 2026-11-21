/*
 * Decompiled with CFR 0.152.
 */
public class o {
    private byte[] a = null;

    public void a(byte[] byArray) {
        this.a = byArray;
    }

    public short a(int n2) {
        return (short)((this.a[n2 * 2 + 1] & 0xFF) << 8 | this.a[n2 * 2 + 0] & 0xFF);
    }
}

