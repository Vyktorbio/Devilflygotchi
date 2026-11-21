/*
 * Decompiled with CFR 0.152.
 */
public class ab {
    private int d = 0;
    private int c = 0;
    private int a = 0;
    private int b = 0;

    private int a() {
        if (this.b > this.d) {
            this.b = this.d;
        }
        if (this.b < this.c) {
            this.b = this.c;
        }
        return this.b;
    }

    public void a(int n2, int n3, int n4) {
        this.d = n4;
        this.c = n3;
        this.a = n2;
        this.b();
    }

    public void b() {
        this.b(this.a);
    }

    public int b(int n2) {
        this.b = n2;
        this.a();
        return this.b;
    }

    public int c() {
        return this.b;
    }

    public int a(int n2) {
        this.b(this.b + n2);
        return this.b;
    }
}

