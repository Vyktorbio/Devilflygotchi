/*
 * Decompiled with CFR 0.152.
 */
public class h {
    private static o[] b = null;
    private static int[] c = new int[5];
    private static int[] a = new int[5];
    private static int d;

    public h() {
        for (int i2 = 0; i2 < 5; ++i2) {
            h.c[i2] = -1;
            h.a[i2] = 0;
        }
        b = null;
        d = -1;
    }

    public void a(o[] oArray) {
        b = oArray;
        d = -1;
    }

    public void a(int n2) {
        h.c[++h.d] = n2;
        h.a[h.d] = 0;
    }

    public boolean b() {
        h.c[h.d] = -1;
        h.a[h.d] = 0;
        --d;
        return this.a();
    }

    public boolean a() {
        return d < 0;
    }

    public int c() {
        return c[d];
    }

    public short b(int n2) {
        return b[c[d]].a(a[d] + n2);
    }

    public void d() {
        int n2 = d;
        a[n2] = a[n2] + (b[c[d]].a(a[d]) % 100 + 1);
    }

    public void c(int n2) {
        h.a[h.d] = n2;
    }
}

