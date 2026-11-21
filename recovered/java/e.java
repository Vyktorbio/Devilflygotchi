/*
 * Decompiled with CFR 0.152.
 */
public class e {
    private long a;
    private long c;
    private long e;
    private boolean b;
    private boolean d;

    public e() {
        this.f();
    }

    public void a(long l2, int n2) {
        this.a(l2, (long)n2 * 1000L);
    }

    public void a(long l2, long l3) {
        this.a = l2;
        this.c = l3;
        this.e = 0L;
        this.b = true;
        this.d = false;
    }

    public void f() {
        this.a = 0L;
        this.c = 0L;
        this.e = 0L;
        this.b = false;
        this.d = false;
    }

    public void d(long l2) {
        if (this.b() && !this.d()) {
            this.d = true;
            this.e = l2;
        }
    }

    public void c(long l2) {
        if (this.b() && this.d()) {
            this.a += l2 - this.e;
            this.e = 0L;
            this.d = false;
        }
    }

    public void a(long l2) {
        this.a += l2;
        if (this.a < 0L) {
            this.a = 0L;
        }
    }

    public void b(long l2) {
        this.e += l2;
        if (this.e < 0L) {
            this.e = 0L;
        }
    }

    public long c() {
        return this.a;
    }

    public long g() {
        return this.a + this.c;
    }

    public long e() {
        return this.c;
    }

    public long a() {
        return this.e;
    }

    public boolean e(long l2) {
        if (this.b()) {
            if (this.d()) {
                l2 = this.e;
            }
            if (this.c <= l2 - this.a) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        return this.b;
    }

    public boolean d() {
        return this.d;
    }
}

