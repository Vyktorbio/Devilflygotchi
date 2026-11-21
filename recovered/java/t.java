/*
 * Decompiled with CFR 0.152.
 */
public abstract class t {
    private Object b;
    public int a;
    public int f;
    private int e;
    private int d;

    protected t() {
        this.a(null, 0, 0, 0);
    }

    protected void a(Object object, int n2, int n3, int n4) {
        this.b = object;
        this.e = n2;
        this.a = n3;
        this.f = n4;
        this.d = 0;
    }

    protected void a(byte[] byArray, int n2, int n3) {
        this.a(this.b, this.e + this.d, byArray, n2, n3);
        ++this.d;
    }

    protected abstract void a(Object var1, int var2, byte[] var3, int var4, int var5);
}

