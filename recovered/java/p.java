/*
 * Decompiled with CFR 0.152.
 */
import java.util.Random;

public abstract class p
implements i {
    static b m;
    static Random F;
    public static int A;
    public static int z;
    static boolean t;
    static int B;
    static int i;
    private static int v;
    private static int p;
    private static int f;
    private static int q;
    private static int o;
    static int b;
    private static int d;
    private int a = 0;
    static int u;

    public p() {
        F = new Random(System.currentTimeMillis());
    }

    public final void a(b b2) {
        m = b2;
        A = b.q;
        z = b.o;
    }

    public static final int b() {
        return F.nextInt();
    }

    public static final int c(int n2) {
        return (F.nextInt() >>> 1) % n2;
    }

    public void h() {
        B = 0;
        i = 0;
        v = B;
        p = i;
        f = B;
        q = i;
        o = 0;
        t = true;
    }

    public final void a(int n2, int n3) {
        this.e(n3);
        this.g(n2);
    }

    public final void g(int n2) {
        if (v != n2) {
            o = 1;
            v = n2;
        }
    }

    public final void e(int n2) {
        if (p != n2) {
            o = 1;
            p = n2;
        }
    }

    public final void g() {
        if (o > 0 && --o == 0) {
            f = v;
            q = p;
            t = true;
        }
    }

    public final boolean i() {
        return t;
    }

    public final int k() {
        return f;
    }

    public final int m() {
        return q;
    }

    public final void e() {
        m.a();
        u = -1;
        b = 0;
    }

    public final void l() {
        b = m.b();
        u = m.e();
        switch (u) {
            case 21: 
            case 22: {
                if (o == 0) break;
                u = -1;
            }
        }
        d = b;
        if (this.a > 0) {
            --this.a;
            this.e();
        }
    }

    public final void b(int n2) {
        b.a(n2);
    }

    public static final int a(int n2, int n3, int n4) {
        if ((n4 & 0x20) != 0) {
            n2 -= n3;
        }
        if ((n4 & 0x40) != 0) {
            n2 -= n3 / 2;
        }
        return n2;
    }

    public static final int b(int n2, int n3, int n4) {
        if ((n4 & 2) != 0) {
            n2 -= n3;
        }
        if ((n4 & 4) != 0) {
            n2 -= n3 / 2;
        }
        return n2;
    }

    public final void d() {
        System.gc();
    }

    static {
        d = 0;
    }
}

