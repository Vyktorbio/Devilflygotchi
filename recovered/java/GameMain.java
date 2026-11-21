/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import java.util.Hashtable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class GameMain
extends a
implements i,
ad,
ae,
r {
    static final int[][] aB = new int[][]{{0, 0, 0, 1, 2, 0, 4, 2, 6, -1}, {0, 1, 0, 1, 0, 2, 0, 61, 1, 0, 6, 6, 7, 0, 12, 17, 8, 0, 29, 14, 9, 0, 43, 8, 10, 0, 70, 2, 12, -1}, {-1}, {70, 0, 70, 2, 12, -1}, {-1}};
    static Image[] q = new Image[378];
    static Image[] bc = null;
    static byte[] K = new byte[11216];
    static o[] ap = new o[61];
    static y aq = null;
    static l aV = null;
    static g aF = null;
    static z bg = null;
    static h aj = null;
    static k bf = null;
    static u[] an = new u[4];
    static w n = null;
    static int u;
    static int aJ;
    static int bd;
    static int aR;
    static int I;
    static int aW;
    static int aO;
    static int ar;
    static int U;
    boolean c;
    static int E;
    static int aS;
    static int aA;
    static int A;
    static int ag;
    static int Q;
    static int ba;
    static int ay;
    static int aM;
    static int bh;
    static int h;
    static int f;
    static int W;
    static int N;
    static int Z;
    static int aU;
    static String[] V;
    static int am;
    static int aP;
    static int ad;
    static int G;
    static int aE;
    static int az;
    static int H;
    static int be;
    static int y;
    static int bb;
    static int C;
    static q g;
    static int aY;
    static int aQ;
    static int ak;
    static int z;
    static int aG;
    static int X;
    static int aD;
    static int af;
    static int Y;
    static long L;
    static long O;
    static long aw;
    static long aI;
    private Image ai;
    private boolean as = false;
    private int l = 0;
    int a;
    int[] ao = null;
    boolean aT = false;
    private int F;
    private int ab;
    private long ac = 0L;
    int M = -999;
    static int R;
    static int S;
    static int d;
    static int bi;
    static int B;
    static int aZ;
    static int J;
    static int aK;
    static int T;
    public static int D;
    public static int ae;
    public static int i;
    private static Hashtable ax;
    private static Hashtable at;
    static int au;
    public static int[][] e;

    public GameMain() {
        u = 0;
        aJ = -1;
        bd = -1;
        aR = -1;
        I = 0;
        aW = -1;
        aO = -1;
    }

    public void A() {
        int n2;
        this.ab = -1;
        this.a = -1;
        aq = new y(b.b, b.c, 512, 256);
        if (aq == null) {
            b.a(null);
            return;
        }
        aq.a(this.aX);
        aq.d(0);
        aq.h();
        aq.a(0, 0);
        aq.e();
        aq.a(ad.o, ad.p, ad.j, ad.m);
        for (n2 = 0; n2 < 4; ++n2) {
            GameMain.an[n2] = new u();
            if (an[n2] != null) continue;
            b.a(null);
            return;
        }
        aF = new g();
        if (aF == null) {
            b.a(null);
            return;
        }
        aF.b(49);
        for (n2 = 0; n2 < 49; ++n2) {
            aF.a(n2, ae.t[n2 * 3 + 0], ae.t[n2 * 3 + 1], ae.t[n2 * 3 + 2]);
        }
        bg = new z();
        if (bg == null) {
            b.a(null);
            return;
        }
        bg.c(33);
        aj = new h();
        if (aj == null) {
            b.a(null);
            return;
        }
        bf = new k();
        if (bf == null) {
            b.a(null);
            return;
        }
        bf.a();
        aV = new l();
        if (aV == null) {
            b.a(null);
            return;
        }
        this.b();
        try {
            w.r = this.getAppProperty("NAMCO-AVAILABLE-LANGUAGES");
        }
        catch (Exception exception) {
            w.r = "de_en_es_fr_it";
        }
        if (aF.c(5) != 0) {
            this.c = true;
            ay = aF.c(6);
        } else {
            this.c = false;
            int n3 = 0;
            String string = "en";
            try {
                string = this.getAppProperty("NAMCO-DEFAULT-LANGUAGE");
            }
            catch (Exception exception) {
                // empty catch block
            }
            n3 = 0;
            while (true) {
                if (n3 >= w.g.length) break;
                if (w.g[n3].substring(0, 2).equals(string.toLowerCase())) {
                    ay = n3;
                    break;
                }
                ++n3;
            }
        }
        this.t();
        aq.a(false);
        if (aF.c(2) != 0) {
            aq.a(true);
        }
        this.f();
        bd = 0;
        aJ = -1;
        U = 0;
    }

    public void P() {
        aq.b(0);
        aq.n();
        if (!aj.a()) {
            aF.c();
            bg.c();
        }
        this.e(-1);
    }

    public void d() {
        aq.b(0);
        aq.e();
    }

    public void y() {
        aq.b(0);
        aq.p();
        this.d(2);
    }

    public void G() {
        k.b(System.currentTimeMillis() + (long)aF.c(8) * 1000L);
        aq.b();
        aq.l();
        if (this.B() == 1) {
            this.y();
        }
        if (this.B() == 2) {
            if (this.j()) {
                this.d(3);
                this.c(false);
            } else {
                return;
            }
        }
        if (this.B() == 3) {
            boolean bl = true;
            bl = this.h();
            if (bl) {
                if (u == 3) {
                    this.T();
                    aJ = -1;
                }
                aq.e();
                aq.o();
                this.d(0);
            } else {
                aq.f();
                this.aX.c();
                return;
            }
        }
        if (bd != aR) {
            aR = bd;
            u = 1;
        }
        while (u != aJ) {
            aJ = u;
            switch (u) {
                case 0: {
                    if (this.c) {
                        I = 3;
                        aq.a(6, 7);
                        break;
                    }
                    I = 1;
                    break;
                }
                case 1: {
                    if (this.i()) break;
                    u = bd;
                    break;
                }
                case 2: {
                    this.Q();
                    break;
                }
                case 3: {
                    this.K();
                    break;
                }
                case 4: {
                    this.I();
                }
            }
        }
        switch (u) {
            case 0: {
                this.a(0, 2, 2000L, 3000L);
                if (I != 1 && I != 3) {
                    I = 1;
                }
                this.F();
                if (!this.as) break;
                bd = 2;
                break;
            }
            case 1: {
                if (!this.l()) break;
                u = bd;
                break;
            }
            case 2: {
                this.R();
                break;
            }
            case 3: {
                this.e();
                break;
            }
            case 4: {
                this.s();
            }
        }
        aq.f();
        aq.g();
        if (aq.i()) {
            ar |= 0xFFFFFFFF;
        }
        ++U;
        this.aX.c();
    }

    public void g(Graphics graphics) {
        aq.a(graphics);
        if (this.aT) {
            this.a(graphics, GameMain.n.b, -1);
            return;
        }
        if (this.B() == 3) {
            this.d(graphics);
        }
        if (this.B() != 0) {
            return;
        }
        if (u != aJ) {
            return;
        }
        switch (u) {
            case 0: {
                this.i(graphics);
                break;
            }
            case 1: {
                this.k(graphics);
                break;
            }
            case 2: {
                this.c(graphics);
                break;
            }
            case 3: {
                this.e(graphics);
                break;
            }
            case 4: {
                this.h(graphics);
            }
        }
        this.n(graphics);
        aq.a(graphics, null);
        ar = 0;
    }

    public void n(Graphics graphics) {
        if (n != null) {
            int n2;
            int n3 = aq.k();
            if (n3 != 0) {
                if (y.E > y.e) {
                    this.a(graphics, GameMain.n.a[n3], 0);
                } else {
                    this.b(graphics, GameMain.n.a[n3], 0);
                }
            }
            if ((n2 = aq.m()) != 0) {
                if (y.E > y.e) {
                    this.a(graphics, GameMain.n.a[n2], 1);
                } else {
                    this.b(graphics, GameMain.n.a[n2], 1);
                }
            }
        }
    }

    public void a(Graphics graphics, String string, int n2) {
        int n3 = y.h.stringWidth(string) + bc[1].getWidth() * 2;
        int n4 = this.p();
        int n5 = 1;
        int n6 = y.E - n4;
        if (n2 != 0) {
            n5 = y.e - 1 - n3;
        }
        for (int i2 = 0; i2 < i.aL.length; ++i2) {
            for (int i3 = 0; i3 < i2; ++i3) {
                aq.a(graphics, i.aL[i3]);
                aq.a(graphics, n5 + (i.aL.length - i2) + i3, n6 + i2, n3 - (i.aL.length - i2 + i3) * 2, 1, 17, 1);
            }
            aq.a(graphics, i.aL[i2]);
            aq.a(graphics, n5 + (0 + i2), n6 + (1 + i2) + (i2 == 0 ? 2 : 0), n3 - (0 + i2) * 2, n4 - (2 + i2) * 1 - (i2 == 0 ? 2 : 0), 17, 1);
        }
        aq.a(graphics, i.aL[1]);
        aq.a(graphics, n5 + n3 - 3, n6 + 4, 2, 2, 33, 1);
        aq.a(graphics, n5 + 3, n6 + 4, 2, 2, 17, 1);
        aq.a(graphics, 0x202020);
        this.a(graphics, string, n5 + n3 / 2, y.E - 1, 66, 1);
    }

    public void b(Graphics graphics, String string, int n2) {
        int n3 = y.h.stringWidth(string) + bc[1].getWidth() * 2;
        int n4 = this.p();
        int n5 = y.e - 1 - n3;
        int n6 = y.E - n4;
        if (n2 != 0) {
            n6 = 0;
        }
        for (int i2 = 0; i2 < i.aL.length; ++i2) {
            int n7;
            aq.a(graphics, i.aL[i2]);
            if (n2 != 0) {
                for (n7 = 0; n7 < i2; ++n7) {
                    aq.a(graphics, i.aL[n7]);
                    aq.a(graphics, n5 + (i.aL.length - i2) + n7, n6 + n4 - i2, n3 - (i.aL.length - i2 + n7) * 2, 1, 18, 1);
                }
                aq.a(graphics, i.aL[i2]);
                aq.a(graphics, n5 + (0 + i2), n6 + n4 - (1 + i2) - (i2 == 0 ? 2 : 0), n3 - (0 + i2) * 2, n4 - (2 + i2) * 1 - (i2 == 0 ? 2 : 0), 18, 1);
                continue;
            }
            for (n7 = 0; n7 < i2; ++n7) {
                aq.a(graphics, i.aL[n7]);
                aq.a(graphics, n5 + (i.aL.length - i2) + n7, n6 + i2, n3 - (i.aL.length - i2 + n7) * 2, 1, 17, 1);
            }
            aq.a(graphics, i.aL[i2]);
            aq.a(graphics, n5 + (0 + i2), n6 + (1 + i2) + (i2 == 0 ? 2 : 0), n3 - (0 + i2) * 2, n4 - (2 + i2) * 1 - (i2 == 0 ? 2 : 0), 17, 1);
        }
        aq.a(graphics, i.aL[1]);
        if (n2 != 0) {
            aq.a(graphics, n5 + n3 - 3, n6 + n4 - 4, 2, 2, 34, 1);
            aq.a(graphics, n5 + 3, n6 + n4 - 4, 2, 2, 18, 1);
        } else {
            aq.a(graphics, n5 + n3 - 3, n6 + 4, 2, 2, 33, 1);
            aq.a(graphics, n5 + 3, n6 + 4, 2, 2, 17, 1);
        }
        aq.a(graphics, 0x202020);
        this.a(graphics, string, n5 + n3 / 2, n6 + 2, 65, 1);
    }

    public int p() {
        return bc[1].getHeight() + y.k;
    }

    public void N() {
        aA = Z / 8;
        E = W + Z;
        aS = 0;
    }

    public int L() {
        block6: {
            block7: {
                block8: {
                    block5: {
                        if (aS != 0) break block5;
                        int n2 = E;
                        if ((E -= aA) <= W) {
                            aq.a(3, 0);
                            E = W;
                            aS = 1;
                        }
                        for (int i2 = 0; i2 < 4; ++i2) {
                            an[i2].b(an[i2].a() + (E - n2), an[i2].d());
                        }
                        break block6;
                    }
                    if (aS != 1) break block7;
                    if (this.M()) break block8;
                    if (y.u != 3) break block6;
                }
                aq.e();
                aq.a(0, 0);
                aq.a(4102);
                aS = 2;
                break block6;
            }
            if (aS == 2) {
                int n3 = E;
                if ((E += aA) >= W + Z) {
                    E = W + Z;
                    aS = 3;
                }
                for (int i3 = 0; i3 < 4; ++i3) {
                    an[i3].b(an[i3].a() + (E - n3), an[i3].d());
                }
            }
        }
        return aS;
    }

    public void f(Graphics graphics) {
        int n2 = bf.c();
        int n3 = bf.f();
        int n4 = bf.d();
        int n5 = q[41].getWidth() / 5;
        int n6 = q[40].getWidth() / 5;
        int n7 = E + Z;
        int n8 = N + aU / 2;
        this.a(graphics, 41, n4, 2, n7, n8, 0, 34, true);
        this.a(graphics, 40, n3, 2, n7 -= n5 * 2, n8, 0, 34, true);
        aq.a(graphics, q[42], n7 -= n6 * 2, n8, 34, 1);
        this.a(graphics, 40, n2 % 12, 2, n7 -= q[42].getWidth(), n8, 0, 34, false);
        int n9 = q[32].getWidth() / 2;
        int n10 = q[32].getHeight();
        aq.a(graphics, q[32], n9 * (n2 / 12), 0, n9, n10, E, N + aU, 18, 1);
        n9 = q[39].getWidth() / 2;
        n10 = q[39].getHeight();
        for (int i2 = 0; i2 < 5; ++i2) {
            int n11 = n9;
            if (4 - n4 % 5 != i2) {
                n11 = 0;
            }
            aq.a(graphics, q[39], n11, 0, n9, n10, E + Z - i2 * n9, N + aU, 34, 1);
        }
    }

    public void T() {
        if (!aj.a()) {
            aF.c();
            bg.c();
            boolean bl = false;
            while (!(bl = aj.b())) {
            }
        }
    }

    public long a(long l2, long l3) {
        long l4 = l3;
        for (int i2 = 0; i2 < 31; ++i2) {
            long l5;
            int n2 = 2 + i2;
            if (!bg.b(n2) || bg.d(n2) || (l5 = bg.e(n2) - l2) >= l4) continue;
            l4 = l5;
        }
        return l4;
    }

    public void u() {
        long l2 = bf.e();
        long l3 = this.k();
        if (l3 > l2) {
            long l4 = l2 - l3;
            this.b(l4);
            k.b(l3 += l4);
            this.a(29, true);
            do {
                this.a(true);
            } while (!aj.a());
        }
        while (l3 < l2 && aF.c(35) <= 0) {
            k.b(l3);
            int n2 = this.a(l3);
            if (n2 >= 0) {
                this.a(30 + (n2 - 2), true);
                do {
                    this.a(true);
                } while (!aj.a());
            }
            l3 += this.a(l3, l2);
        }
        k.b(l2);
        this.c(l2);
        this.e(-1);
    }

    public int a(long l2) {
        long l3 = 0L;
        int n2 = -1;
        int n3 = 30;
        do {
            long l4;
            int n4;
            if (!bg.b(n4 = n3 + 2) || bg.d(n4) || !bg.e(n4, l2) || (l4 = l2 - bg.e(n4)) < l3) continue;
            l3 = l4;
            n2 = n4;
        } while (--n3 >= 0);
        return n2;
    }

    public void a(int n2, boolean bl) {
        A = 0;
        ag = 0;
        if (!bl) {
            aF.d();
            bg.d();
            this.c(n2);
        }
        aj.a(n2);
    }

    public void a(boolean bl) {
        if (aj.a()) {
            return;
        }
        boolean bl2 = true;
        while (bl2) {
            int n2;
            short s2;
            block125: {
                block127: {
                    block126: {
                        int n3;
                        block118: {
                            block124: {
                                block123: {
                                    block122: {
                                        block121: {
                                            block120: {
                                                block119: {
                                                    block113: {
                                                        block117: {
                                                            block116: {
                                                                block115: {
                                                                    block114: {
                                                                        int n4;
                                                                        int n5;
                                                                        s2 = aj.b(0);
                                                                        if (s2 == 1002) {
                                                                            if (!bl) {
                                                                                n2 = aj.b(1);
                                                                                n3 = aj.b(2);
                                                                                if (n3 == 0) {
                                                                                    n3 += aF.c(11);
                                                                                }
                                                                                an[n2].a(n3);
                                                                                this.f(n3);
                                                                                if (aF.c(11) >= 0) {
                                                                                    an[n2].a(0, 78 + aF.c(11) * 25);
                                                                                }
                                                                                if (aF.c(41) >= 0) {
                                                                                    an[n2].a(1, 19 + aF.c(41) * 4);
                                                                                }
                                                                                if (n3 == 15 || n3 == 17) {
                                                                                    for (n5 = 0; n5 < 8; ++n5) {
                                                                                        n4 = 27;
                                                                                        if (aF.c(20) <= n5) {
                                                                                            n4 = 10;
                                                                                        }
                                                                                        an[n2].a(2 + n5, n4);
                                                                                    }
                                                                                }
                                                                            }
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 1104) {
                                                                            n2 = aj.b(1);
                                                                            n3 = aj.b(2);
                                                                            n5 = aj.b(3);
                                                                            n4 = aj.b(4);
                                                                            if (bl) {
                                                                                aj.d();
                                                                            } else if (an[n2].f() || n3 >= 0 && n3 <= an[n2].i()) {
                                                                                aj.d();
                                                                            } else if (y.u == 3 && n4 != 0) {
                                                                                aq.a(4102);
                                                                                aq.e();
                                                                                if (n5 >= 0) {
                                                                                    aj.c(n5 / 2);
                                                                                } else {
                                                                                    aj.d();
                                                                                }
                                                                            } else {
                                                                                bl2 = false;
                                                                            }
                                                                        }
                                                                        if (s2 == 1203) {
                                                                            n2 = aj.b(1);
                                                                            n3 = aq.h(aj.b(2));
                                                                            n5 = aq.h(aj.b(3));
                                                                            an[n2].b(n3, n5);
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 1303) {
                                                                            n2 = aj.b(1);
                                                                            n3 = an[n2].a() + aq.h(aj.b(2));
                                                                            n5 = an[n2].d() + aq.h(aj.b(3));
                                                                            an[n2].b(n3, n5);
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 1401) {
                                                                            n2 = aj.b(1);
                                                                            an[n2].e();
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 2002) {
                                                                            n2 = aj.b(1);
                                                                            n3 = aj.b(2);
                                                                            this.a(n2, (long)n3);
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 2104) {
                                                                            n2 = aj.b(1);
                                                                            n3 = aj.b(2);
                                                                            n5 = aj.b(3);
                                                                            n4 = aj.b(4);
                                                                            long l2 = k.a(n3, n5, n4);
                                                                            this.a(n2, (long)((int)(l2 / 1000L)));
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 2202) {
                                                                            n2 = aj.b(1);
                                                                            n3 = aF.c(aj.b(2));
                                                                            this.a(n2, (long)n3);
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 2401) {
                                                                            n2 = aj.b(1);
                                                                            bg.d(n2, bf.e());
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 2301) {
                                                                            n2 = aj.b(1);
                                                                            bg.c(n2, bf.e());
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 2501) {
                                                                            n2 = aj.b(1);
                                                                            if (n2 < 0) {
                                                                                for (n3 = 0; n3 < 31; ++n3) {
                                                                                    bg.a(2 + n3);
                                                                                }
                                                                            } else {
                                                                                bg.a(n2);
                                                                            }
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 2601) {
                                                                            n2 = aj.b(1);
                                                                            aF.b(n2, bf.c());
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 3002) {
                                                                            n2 = aj.b(1);
                                                                            n3 = aj.b(2);
                                                                            aF.b(n2, n3);
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 3102) {
                                                                            n2 = aj.b(1);
                                                                            n3 = aF.c(aj.b(2));
                                                                            aF.b(n2, n3);
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 3202) {
                                                                            n2 = aj.b(1);
                                                                            n3 = aj.b(2);
                                                                            aF.a(n2, n3);
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 3302) {
                                                                            n2 = aj.b(1);
                                                                            n3 = aF.c(aj.b(2));
                                                                            aF.a(n2, n3);
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 3402) {
                                                                            n2 = aj.b(1);
                                                                            n3 = aj.b(2);
                                                                            if (n3 <= 0) {
                                                                                n3 = 1;
                                                                            }
                                                                            n5 = y.c(n3);
                                                                            aF.b(n2, n5);
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 3501) {
                                                                            n2 = aj.b(1);
                                                                            if (n2 < 0) {
                                                                                for (n3 = 0; n3 < 38; ++n3) {
                                                                                    aF.a(11 + n3);
                                                                                }
                                                                            } else {
                                                                                aF.a(n2);
                                                                            }
                                                                            aj.d();
                                                                        }
                                                                        if (s2 == 4004) {
                                                                            n2 = aF.c(aj.b(1));
                                                                            n3 = aj.b(3);
                                                                            n5 = aj.b(2);
                                                                            if (this.a(n2, n5, n3)) {
                                                                                aj.c(aj.b(4) / 2);
                                                                            } else {
                                                                                aj.d();
                                                                            }
                                                                        }
                                                                        if (s2 == 4104) {
                                                                            n2 = aF.c(aj.b(1));
                                                                            n3 = aF.c(aj.b(3));
                                                                            n5 = aj.b(2);
                                                                            if (this.a(n2, n5, n3)) {
                                                                                aj.c(aj.b(4) / 2);
                                                                            } else {
                                                                                aj.d();
                                                                            }
                                                                        }
                                                                        if (s2 == 4204) {
                                                                            n2 = 0;
                                                                            if (bg.b(aj.b(1))) {
                                                                                n2 = 1;
                                                                            }
                                                                            n3 = aj.b(3);
                                                                            n5 = aj.b(2);
                                                                            if (this.a(n2, n5, n3)) {
                                                                                aj.c(aj.b(4) / 2);
                                                                            } else {
                                                                                aj.d();
                                                                            }
                                                                        }
                                                                        if (s2 != 4302) break block113;
                                                                        bl2 = false;
                                                                        if ((ag & 1) == 0) {
                                                                            aq.e();
                                                                            n2 = aj.b(1);
                                                                            n3 = aj.b(2);
                                                                            aF.b(40, n2);
                                                                            aF.b(39, n3);
                                                                            bg.a(0, bf.e(), 20);
                                                                            ag |= 1;
                                                                        }
                                                                        if (y.u == 17) break block114;
                                                                        if (y.u == 19) break block114;
                                                                        if (y.u != 1) break block115;
                                                                    }
                                                                    aq.a(4102);
                                                                    aq.e();
                                                                    n2 = aF.c(39) ^ 1;
                                                                    aF.b(39, n2);
                                                                }
                                                                if (this.M()) {
                                                                    aq.a(4102);
                                                                    bl2 = true;
                                                                }
                                                                if (this.x()) break block116;
                                                                if (!bg.e(0, bf.e())) break block117;
                                                            }
                                                            if (this.x()) {
                                                                aq.a(4102);
                                                            }
                                                            aF.b(39, -1);
                                                            bl2 = true;
                                                        }
                                                        if (bl2) {
                                                            aq.e();
                                                            aj.d();
                                                            ag &= 0xFFFFFFFE;
                                                        }
                                                    }
                                                    if (s2 != 4400) break block118;
                                                    bl2 = false;
                                                    if ((ag & 8) == 0) {
                                                        bg.a(0, bf.e(), 20);
                                                        ag |= 8;
                                                    }
                                                    if (y.u == 1) break block119;
                                                    if (y.u != 16) break block120;
                                                }
                                                aq.a(4102);
                                                aF.b(39, 0);
                                                bl2 = true;
                                            }
                                            if (y.u == 2) break block121;
                                            if (y.u != 18) break block122;
                                        }
                                        aq.a(4102);
                                        aF.b(39, 1);
                                        bl2 = true;
                                    }
                                    if (this.x()) break block123;
                                    if (!bg.e(0, bf.e())) break block124;
                                }
                                if (this.x()) {
                                    aq.a(4102);
                                }
                                aF.b(39, -1);
                                bl2 = true;
                            }
                            if (bl2) {
                                aq.e();
                                aj.d();
                                ag &= 0xFFFFFFF7;
                            }
                        }
                        if (s2 == 4500) {
                            n2 = an[2].k();
                            n3 = an[1].k();
                            if (n3 >= 6 && n3 <= 9) {
                                if (n2 >= 6 && n2 <= 10 && aF.c(39) != 0) {
                                    aq.a(4102);
                                    aF.a(42, 1);
                                    aj.d();
                                }
                                if ((n2 >= 0 && n2 <= 2 || n2 >= 14 && n2 <= 15) && aF.c(39) == 0) {
                                    aq.a(4102);
                                    aF.a(42, 1);
                                    aj.d();
                                }
                            } else if (an[1].f()) {
                                aj.d();
                            }
                            bl2 = false;
                        }
                        if (s2 == 4601) {
                            n2 = 10;
                            if ((n2 += (aF.c(16) + aF.c(21)) / 3) > y.c(100)) {
                                aj.c(aj.b(1) / 2);
                            } else {
                                aj.d();
                            }
                        }
                        if (s2 == 5000) {
                            this.S();
                            aj.d();
                        }
                        if (s2 == 5102) {
                            bl2 = false;
                            if ((ag & 4) == 0) {
                                A = aj.b(1);
                                n2 = 4107;
                                if (aj.b(2) == 0) {
                                    n2 = 4108;
                                }
                                aq.a(n2);
                                ag |= 4;
                            }
                            if (--A < 0) {
                                ag &= 0xFFFFFFFB;
                                A = 0;
                                aj.d();
                                bl2 = true;
                            }
                        } else if (s2 == 5200) {
                            bl2 = false;
                            if ((ag & 2) == 0) {
                                bg.a(0, bf.e(), 20);
                                ag |= 2;
                            }
                            if (this.o()) {
                                ag &= 0xFFFFFFFD;
                                aj.d();
                            }
                        }
                        if (s2 == 8002) {
                            n2 = aj.b(1);
                            n3 = aj.b(2);
                            aq.a(n2, n3);
                            aj.d();
                        }
                        if (s2 == 8101) {
                            if (!bl) {
                                n2 = aj.b(1);
                                if (aF.c(3) != 0) {
                                    aq.b(n2);
                                }
                            }
                            aj.d();
                        }
                        if (s2 == 8202) {
                            if (!bl) {
                                n2 = aj.b(1);
                                n3 = aj.b(2);
                                if (n2 < 0) {
                                    aq.n();
                                } else {
                                    aq.a(ad.s[n2]);
                                }
                                if (n3 != 0) {
                                    bl2 = false;
                                }
                            }
                            aj.d();
                        }
                        if (s2 == 9601) {
                            n2 = aj.b(1);
                            aj.d();
                            aj.a(n2);
                            this.c(n2);
                        }
                        if (s2 != 9702) break block125;
                        if (!bl) break block126;
                        aj.d();
                        break block125;
                    }
                    bl2 = false;
                    if ((ag & 0x10) == 0) {
                        A = aj.b(1);
                        ag |= 0x10;
                    }
                    n2 = aj.b(2);
                    if (--A < 0) break block127;
                    if (y.u != 3 || n2 == 0) break block125;
                }
                ag &= 0xFFFFFFEF;
                A = 0;
                aj.d();
                bl2 = true;
            }
            if (s2 == 9801) {
                n2 = aj.b(1);
                aj.c(n2 / 2);
            }
            if (s2 != 9900) continue;
            bl2 = false;
            if (aj.b()) continue;
            n2 = aj.c();
            this.c(n2);
            bl2 = true;
        }
    }

    public void m(Graphics graphics) {
        if ((ag & 1) != 0) {
            this.a(graphics, aF.c(40));
        }
        if ((ag & 2) != 0) {
            this.p(graphics);
        }
        if ((ag & 4) != 0) {
            this.s(graphics);
        }
    }

    public void a(Graphics graphics, int n2) {
        int n3 = W + q[34].getWidth();
        aq.a(graphics, q[n2], n3, N, 17, 1);
        aq.a(graphics, q[34], W, N + aU / 2 * aF.c(39), 17, 1);
    }

    public void s(Graphics graphics) {
        int n2 = aF.c(42);
        int n3 = aF.c(43) - n2;
        int n4 = q[38].getWidth() / 2;
        int n5 = q[38].getHeight();
        aq.a(graphics, q[38], 0, 0, n4, n5, W + aq.h(2), N + aq.h(-2), 17, 1);
        aq.a(graphics, q[36], W + Z + aq.h(-2), N, 33, 1);
        n4 = q[40].getWidth() / 5;
        n5 = q[40].getHeight() / 2;
        aq.a(graphics, q[40], n4 * (n2 % 5), n5 * (n2 / 5), n4, n5, W + aq.h(6), N + aU, 18, 1);
        aq.a(graphics, q[35], W + Z / 2, N + aU, 66, 1);
        aq.a(graphics, q[40], n4 * (n3 % 5), n5 * (n3 / 5), n4, n5, W + aq.h(48), N + aU, 18, 1);
    }

    public void S() {
        int n2 = aF.c(11) * 10;
        aF.b(26, ae.r[n2 + 0]);
        aF.b(27, ae.r[n2 + 1]);
        aF.b(28, ae.r[n2 + 2]);
        aF.b(29, ae.r[n2 + 3]);
        aF.b(31, ae.r[n2 + 5]);
        aF.b(32, ae.r[n2 + 7]);
        aF.b(30, ae.r[n2 + 8]);
        aF.b(33, ae.r[n2 + 9]);
        aF.b(15, ae.r[n2 + 4]);
        aF.b(17, ae.r[n2 + 6]);
        if (aF.c(14) >= aF.c(15)) {
            aF.b(14, aF.c(15));
        }
        if (aF.c(16) < aF.c(17)) {
            aF.b(16, aF.c(17));
        }
    }

    public void a(int n2, long l2) {
        int n3;
        long l3 = l2;
        bg.d(n2, 0L);
        if (n2 == 14) {
            n3 = aF.c(23) + aF.c(21) + (10 - aF.c(16));
            l3 += (long)(n3 * 5 * 60);
        }
        if (n2 == 11) {
            n3 = aF.c(13) - 2 + (aF.c(14) / 2 - 2);
            l3 += (long)(n3 * 5 * 60);
        }
        if (n2 == 16) {
            n3 = aF.c(14) / 2 - 2 + aF.c(22);
            l3 += (long)(n3 * 5 * 60);
        }
        if (n2 == 6) {
            l3 = k.a(bf.e(), aF.c(26), 0, 0);
        }
        if (n2 == 7) {
            l3 = k.a(bf.e(), aF.c(27), 0, 0);
        }
        if (n2 == 8) {
            l3 = 259200000L;
        }
        if (n2 == 18) {
            n3 = bf.c();
            int n4 = bf.f();
            if (n3 % 2 == 0) {
                if (n4 >= 30) {
                    n3 = (n3 + 2) % 24;
                }
            } else {
                n3 = (n3 + 1) % 24;
            }
            l3 = k.a(bf.e(), n3, 30, 0);
        }
        if (n2 == 30) {
            n3 = (bf.c() + 1) % 24;
            if (n3 % 2 != 0) {
                n3 = (n3 + 1) % 24;
            }
            l3 = k.a(bf.e(), n3, 0, 0);
        }
        if (n2 == 31) {
            n3 = (bf.c() + 1) % 24;
            l3 = k.a(bf.e(), n3, 0, 0);
        }
        if (n2 == 2 || n2 == 3 || n2 == 4 || n2 == 5) {
            l3 = 43200000L;
        }
        if (l2 >= 0L) {
            l3 = l2 * 1000L;
        }
        bg.a(n2, bf.e(), l3);
    }

    public void b(long l2) {
        for (int i2 = 0; i2 < 33; ++i2) {
            bg.a(i2, l2);
            bg.b(i2, l2);
        }
        long l3 = this.k();
        this.c(l3 + l2);
    }

    public void c(long l2) {
        aF.b(9, (int)((l2 & 0xFFFFFFFF00000000L) >> 32));
        aF.b(10, (int)((l2 & 0xFFFFFFFFL) >> 0));
    }

    public long k() {
        long l2 = 0L;
        l2 |= ((long)aF.c(9) & 0xFFFFFFFFL) << 32;
        return l2 |= ((long)aF.c(10) & 0xFFFFFFFFL) << 0;
    }

    public boolean a(int n2, int n3, int n4) {
        if (n3 == 0 && n2 == n4) {
            return true;
        }
        if (n3 == 1 && n2 != n4) {
            return true;
        }
        if (n3 == 2 && n2 > n4) {
            return true;
        }
        return n3 == 3 && n2 < n4;
    }

    public boolean h() {
        block6: {
            block5: {
                if (y.u == 17) break block5;
                if (y.u == 19) break block5;
                if (y.u != 1) break block6;
            }
            aq.a(4102);
            Q ^= 1;
        }
        if (this.M()) {
            aq.a(4102);
            if (Q != 0) {
                GameMain gameMain = this;
                gameMain.aX.d();
                return false;
            }
            Q = 0;
            return true;
        }
        return false;
    }

    public void d(Graphics graphics) {
        aq.a(graphics, 0xFFFFFF);
        aq.a(graphics, 0, 0, y.e, y.E, 17, 1);
        this.a(graphics, GameMain.n.d, GameMain.n.i, Q);
    }

    public void H() {
        aq.e();
        ay = aF.c(6);
        aM = 0;
        ba = 0;
    }

    public boolean D() {
        boolean bl;
        block16: {
            block12: {
                block15: {
                    block13: {
                        block14: {
                            bl = false;
                            aq.a(0, 0);
                            if (ba != 0) break block12;
                            if (n.c(w.r) <= 1) break block13;
                            if (y.u == 17) {
                                ay = (ay + w.g.length - 1) % w.g.length;
                            }
                            if (y.u == 19) break block14;
                            if (y.u != 1) break block13;
                        }
                        ay = (ay + 1) % w.g.length;
                    }
                    if (this.M()) break block15;
                    if (n.c(w.r) != 1) break block16;
                }
                aq.e();
                bg.a(1, bf.e(), 1);
                aM = 0;
                ba = 1;
                break block16;
            }
            if (ba == 1) {
                if (aM != 0) {
                    this.t();
                    aF.b(6, ay);
                    aF.b(5, 1);
                    ba = 2;
                }
                ++aM;
            } else if (ba == 2) {
                if (bg.e(1, bf.e())) {
                    ba = 0;
                    bl = true;
                }
            }
        }
        return bl;
    }

    public boolean E() {
        if (y.u == 21) {
            aF.b(2, 1);
            aq.a(true);
            aq.a(4102);
            return true;
        }
        if (y.u == 22) {
            aF.b(2, 0);
            aq.a(false);
            return true;
        }
        return false;
    }

    public void r(Graphics graphics) {
        this.a(graphics, GameMain.n.p, -1);
    }

    public void j(Graphics graphics) {
        if (n.c(w.r) > 1) {
            this.a(graphics, GameMain.n.q, ay);
        }
        if (ba == 1 || ba == 2) {
            this.a(graphics, GameMain.n.b, -1);
        }
    }

    public void v() {
        String string = "en";
        try {
            string = this.getAppProperty("NAMCO-DEFAULT-LANGUAGE").toLowerCase();
        }
        catch (Exception exception) {
            string = "en";
        }
        if (string.compareTo("fr") != 0 && string.compareTo("de") != 0) {
            string = "en";
        }
        String string2 = "/title_" + string + "_" + aF.c(7) + ".png";
        try {
            this.ai = Image.createImage((String)string2);
            if (this.ab != ay || this.a != aF.c(7)) {
                this.F = 0 - this.ai.getHeight();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.ab = ay;
        this.a = aF.c(7);
    }

    public void t() {
        n = null;
        aq.d();
        n = new w(w.g[ay]);
        if (n == null) {
            b.a(null);
        }
        this.v();
    }

    public boolean O() {
        return ba != 0;
    }

    public void K() {
        int n2;
        W = y.e / 2 - q[8].getWidth() / 2;
        N = i.P[1] + q[8].getHeight() / 4 * 1;
        Z = q[8].getWidth();
        aU = q[8].getHeight() / 4 * 2;
        aj.a(ap);
        for (n2 = 0; n2 < 4; ++n2) {
            an[n2].a(aq, K, 57, W + Z / 2, N + aU, 18);
        }
        n2 = 7;
        aW = 0;
        I = 4;
        if (aF.c(1) == 0) {
            this.u();
            if (aO >= 0) {
                aW = aO;
                aO = -1;
            }
            if (aW == 2) {
                aq.a(3, 0);
            } else {
                if (aW == 0) {
                    aq.a(3, 0);
                } else {
                    aq.a(0, 0);
                }
                aF.b(48, 0);
            }
            n2 = 10;
        } else {
            aq.a(0, 0);
        }
        this.a(n2, false);
        aq.e();
        bg.a(0, bf.e(), 20);
        bh = -1;
        h = -1;
        ar |= 0xFFFFFFFF;
    }

    public void e() {
        int n2;
        block56: {
            block59: {
                block64: {
                    block65: {
                        block63: {
                            block62: {
                                block61: {
                                    block60: {
                                        block54: {
                                            block58: {
                                                block57: {
                                                    block55: {
                                                        if (bf.g() > bf.e()) {
                                                            this.y();
                                                            this.c(true);
                                                            return;
                                                        }
                                                        if (f != 0) {
                                                            f = 0;
                                                            ar |= 2;
                                                        }
                                                        if (this.r()) {
                                                            f |= 1;
                                                        }
                                                        if (this.M()) {
                                                            f |= 2;
                                                        }
                                                        if (this.x()) {
                                                            f |= 4;
                                                        }
                                                        if (f > 0) {
                                                            aq.a(4102);
                                                            ar |= 2;
                                                        }
                                                        if (y.u != -1) {
                                                            bg.a(0, bf.e(), 20);
                                                        }
                                                        if (y.u == 10) {
                                                            this.n();
                                                        }
                                                        if (y.u == 11) {
                                                            this.a();
                                                        }
                                                        if (I != 4) {
                                                            n2 = this.a(bf.e());
                                                            if (n2 >= 0) {
                                                                this.a(30 + (n2 - 2), false);
                                                                aW = I;
                                                                I = 4;
                                                                ar |= 0xFFFFFFFF;
                                                            }
                                                        }
                                                        if (I != 0) break block54;
                                                        if (y.u != 21) break block55;
                                                        aq.a(4102);
                                                        this.a(4, 0, 0L, 0L);
                                                        aO = 0;
                                                        bd = 4;
                                                        break block56;
                                                    }
                                                    if (aF.c(35) == 0 && aF.c(34) != 0) {
                                                        if (this.r()) {
                                                            bh = 0;
                                                            if (y.u == 16) {
                                                                bh = 6;
                                                            }
                                                            aq.a(4102);
                                                            aq.a(4, 0);
                                                            I = 1;
                                                            ar |= 0xFFFFFFFF;
                                                        } else if (this.M()) {
                                                            aF.b(48, 1);
                                                            aq.e();
                                                            aq.a(4102);
                                                            aq.a(0, 0);
                                                            this.N();
                                                            I = 2;
                                                            ar |= 0xFFFFFFFF;
                                                        }
                                                    }
                                                    if (aF.c(35) == 1 && (this.M() || this.r())) {
                                                        aq.e();
                                                        aq.a(4102);
                                                        this.a(9, false);
                                                        aW = I;
                                                        I = 4;
                                                    }
                                                    if (aF.c(35) != 2) break block56;
                                                    n2 = -1;
                                                    if (y.u == 16) {
                                                        n2 = 3;
                                                    }
                                                    if (y.u == 18) break block57;
                                                    if (y.u != 3) break block58;
                                                }
                                                n2 = 0;
                                            }
                                            if (n2 >= 0) {
                                                aq.a();
                                                aq.e();
                                                this.a(0, false);
                                                this.g(n2);
                                                aW = I;
                                                I = 4;
                                            }
                                            break block56;
                                        }
                                        if (I != 1) break block59;
                                        if (!this.M()) break block60;
                                        aq.a();
                                        this.g(0);
                                        this.a(0 + bh, false);
                                        aW = I;
                                        I = 4;
                                        break block56;
                                    }
                                    h = bh--;
                                    if (y.u == 16) {
                                        // empty if block
                                    }
                                    if (y.u == 18) break block61;
                                    if (y.u != 1) break block62;
                                }
                                ++bh;
                            }
                            if (bh != 3) {
                                if (y.u == 17) {
                                    bh = (bh + 8 - 4) % 8;
                                }
                                if (y.u == 19) {
                                    bh = (bh + 4) % 8;
                                }
                            }
                            if (bh == h) break block63;
                            if (bh < 0 || bh > 6) {
                                I = 0;
                            }
                            aq.a(4102);
                            ar |= 1;
                            break block64;
                        }
                        if (this.x()) break block65;
                        if (!bg.e(0, bf.e())) break block64;
                    }
                    if (this.x()) {
                        aq.a(4102);
                    }
                    I = 0;
                }
                if (I != 1) {
                    aq.e();
                    aq.a(3, 0);
                    bg.a(0, bf.e(), 20);
                    bh = -1;
                    h = -1;
                    ar |= 0xFFFFFFFF;
                }
                break block56;
            }
            if (I == 2) {
                n2 = this.L();
                if (n2 == 3) {
                    aF.b(48, 0);
                    this.a(10, false);
                    aW = 0;
                    I = 4;
                    ar |= 0xFFFFFFFF;
                }
                if (n2 == 1) {
                    if (y.u == 21) {
                        aq.a(4102);
                        this.a(4, 0, 0L, 0L);
                        aO = 2;
                        bd = 4;
                    }
                }
            } else if (I == 4) {
                this.a(false);
                if (aj.a()) {
                    aq.e();
                    bg.a(0, bf.e(), 20);
                    this.c(bf.e());
                    aF.d();
                    bg.d();
                    if (aF.c(35) > 0) {
                        aF.b(48, 0);
                        bh = -1;
                        h = -1;
                        aW = 0;
                    }
                    if (aW == 0 || aW == 2) {
                        bh = -1;
                        h = -1;
                        aq.a(3, 0);
                    }
                    if (aW == 1) {
                        aq.a(4, 0);
                    }
                    I = aW;
                    aW = -1;
                    ar |= 0xFFFFFFFF;
                } else if (y.u == 21) {
                    aq.a(4102);
                    this.a(4, 0, 0L, 0L);
                    aO = 0;
                    bd = 4;
                }
            }
        }
        for (n2 = 0; n2 < 4; ++n2) {
            an[n2].b();
        }
    }

    public void e(Graphics graphics) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = N;
        graphics.setColor(0);
        graphics.fillRect(0, 0, y.e, y.E);
        if (this.aX.k) {
            this.K();
            this.aX.k = false;
        }
        int n10 = N + aU / 2 - q[8].getHeight() / 2;
        aq.a(graphics, q[8], 0, q[8].getHeight() / 4, q[8].getWidth(), q[8].getHeight() / 2, W, N, 17, 1);
        for (n8 = 0; n8 < 4; ++n8) {
            an[n8].a(graphics, q);
        }
        this.m(graphics);
        if (I == 2) {
            this.f(graphics);
        }
        aq.a(graphics, q[8], 0, 0, q[8].getWidth(), q[8].getHeight() / 4, W, N, 18, 1);
        aq.a(graphics, q[8], 0, q[8].getHeight() / 4 * 3, q[8].getWidth(), q[8].getHeight() / 4, W, N + aU, 17, 1);
        n8 = 70 + aF.c(7) * 2;
        int n11 = n8 + 0;
        int n12 = n8 + 1;
        if ((ar & 0xFFFFFFFF) == -1) {
            aq.a(graphics, q[n11], 0, 0, q[n11].getWidth(), N, y.e >> 1, 0, 65, 1);
        }
        if ((ar & 2) != 0) {
            aq.a(graphics, q[n11], 0, n10, q[n11].getWidth(), y.E - n10, y.e >> 1, n10, 65, 1);
            n7 = (y.e - q[n11].getWidth()) / 2;
            for (n6 = 0; n6 < 3; ++n6) {
                if ((f & 1 << n6) == 0) continue;
                aq.a(graphics, q[n12], n7 + i.P[4 + 2 * n6], i.P[5 + 2 * n6], 17, 1);
            }
        }
        if (q[n11].getWidth() < y.e) {
            graphics.setColor(0);
            graphics.fillRect(0, 0, y.e - q[n11].getWidth() >> 1, y.E);
            graphics.fillRect(q[n11].getWidth() + (y.e - q[n11].getWidth() >> 1), 0, y.e - q[n11].getWidth() >> 1, y.E);
        }
        n7 = q[6].getWidth() / 4;
        n6 = q[6].getHeight() / 2;
        if ((I == 1 || I == 4) && bh >= 0) {
            n5 = n7 * (bh % 4);
            n4 = n6 * (bh / 4);
            n3 = W + n7 * (bh % 4);
            n2 = N + (aU + n6) * (bh / 4);
            aq.a(graphics, q[6], n5, n4, n7, n6, n3, n2, 18, 1);
            if (aF.c(4) != 0) {
                this.q(graphics);
            }
        }
        if (bg.b(13) || bg.b(15) || bg.b(21) || bg.b(17) || bg.b(19) && aF.c(25) != 0) {
            n5 = 3 * n7;
            n4 = 1 * n6;
            n3 = W + n7 * 3;
            n2 = N + (aU + n6) * 1;
            aq.a(graphics, q[6], n5, n4, n7, n6, n3, n2, 18, 1);
        }
        aq.a(graphics, q[n11], 0, n10, q[n11].getWidth(), q[8].getHeight(), y.e >> 1, n10, 65, 1);
        N = n9;
    }

    public void q(Graphics graphics) {
        int n2 = this.a(GameMain.n.n) + y.n * 4;
        int n3 = y.k + 2 + 4;
        int n4 = N + aU / 2 - q[8].getHeight() / 2;
        aq.a(graphics, 0);
        this.a(graphics, y.e / 2, (n4 += bh / 4 * (q[8].getHeight() + n3)) + 0, n2 - 0, n3 - 0, 4, 4, 66, 1);
        aq.a(graphics, 0xFFFFFF);
        this.a(graphics, y.e / 2, n4 - 2, n2 - 4, n3 - 4, 4, 4, 66, 1);
        aq.a(graphics, 0);
        this.a(graphics, GameMain.n.n[bh], y.e / 2, n4 - n3 / 2 + y.k / 2, 66, 1);
    }

    public boolean M() {
        block3: {
            block2: {
                if (y.u == 20) break block2;
                if (y.u != 2) break block3;
            }
            return true;
        }
        return false;
    }

    public boolean x() {
        block3: {
            block2: {
                if (y.u == 21) break block2;
                if (y.u != 3) break block3;
            }
            return true;
        }
        return false;
    }

    public boolean r() {
        block3: {
            block2: {
                if (y.u == 16) break block2;
                if (y.u == 18) break block2;
                if (y.u == 17) break block2;
                if (y.u == 19) break block2;
                if (y.u != 1) break block3;
            }
            return true;
        }
        return false;
    }

    public void I() {
        this.c(bf.e());
        this.T();
        aE = aF.c(7);
        am = 0;
        aP = 0;
        ad = 0;
        G = 0;
        H = 0;
        be = 0;
        y = 0;
        az = 0;
        aq.e();
        aq.a(4, 0);
        ar |= 0xFFFFFFFF;
        I = 0;
    }

    public void s() {
        int n2;
        block77: {
            block97: {
                block96: {
                    block95: {
                        block92: {
                            block94: {
                                block93: {
                                    block89: {
                                        block91: {
                                            block90: {
                                                block88: {
                                                    block81: {
                                                        block87: {
                                                            block86: {
                                                                block85: {
                                                                    block84: {
                                                                        block83: {
                                                                            block82: {
                                                                                block78: {
                                                                                    block80: {
                                                                                        block79: {
                                                                                            block73: {
                                                                                                block76: {
                                                                                                    block75: {
                                                                                                        block74: {
                                                                                                            if (I != 1) {
                                                                                                                if (y.u == 10) {
                                                                                                                    this.n();
                                                                                                                }
                                                                                                                if (y.u == 11) {
                                                                                                                    this.a();
                                                                                                                }
                                                                                                            }
                                                                                                            if (I != 0) break block73;
                                                                                                            if (y.u == 17) {
                                                                                                                aq.a(4102);
                                                                                                                am = (am + GameMain.n.A.length - 1) % GameMain.n.A.length;
                                                                                                            }
                                                                                                            if (y.u == 19) break block74;
                                                                                                            if (y.u != 1) break block75;
                                                                                                        }
                                                                                                        aq.a(4102);
                                                                                                        am = (am + 1) % GameMain.n.A.length;
                                                                                                    }
                                                                                                    if (y.u == 20) break block76;
                                                                                                    if (y.u != 2) break block77;
                                                                                                }
                                                                                                aq.e();
                                                                                                aq.a(4102);
                                                                                                this.j(am);
                                                                                                break block77;
                                                                                            }
                                                                                            if (I != 1) break block78;
                                                                                            if (y.u == 17) {
                                                                                                aq.a(4102);
                                                                                                aP = (aP + V.length - 1) % V.length;
                                                                                                if (aP == 4) {
                                                                                                    if (n.c(w.r) == 1) {
                                                                                                        aP = (aP + V.length - 1) % V.length;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            if (y.u == 19) break block79;
                                                                                            if (y.u != 1) break block80;
                                                                                        }
                                                                                        aq.a(4102);
                                                                                        aP = (aP + 1) % V.length;
                                                                                        if (aP == 4) {
                                                                                            if (n.c(w.r) == 1) {
                                                                                                aP = (aP + 1) % V.length;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    n2 = -1;
                                                                                    if (y.u == 10) {
                                                                                        n2 = this.i(0);
                                                                                    }
                                                                                    if (y.u == 11) {
                                                                                        n2 = this.i(1);
                                                                                    }
                                                                                    if (this.M()) {
                                                                                        n2 = aP;
                                                                                    }
                                                                                    if (n2 >= 0) {
                                                                                        aq.a(4102);
                                                                                        this.h(n2);
                                                                                    }
                                                                                    break block77;
                                                                                }
                                                                                if (I != 2) break block81;
                                                                                if (y.u == 17) break block82;
                                                                                if ((y.b & 0x20000) == 0) break block83;
                                                                            }
                                                                            if (aP > 0) {
                                                                                --aP;
                                                                            }
                                                                        }
                                                                        if (y.u == 19) break block84;
                                                                        if ((y.b & 0x80000) == 0) break block85;
                                                                    }
                                                                    if (aP < V.length - be) {
                                                                        ++aP;
                                                                    }
                                                                }
                                                                if (y.u == 18) break block86;
                                                                if (y.u != 1) break block87;
                                                            }
                                                            aq.a(4102);
                                                            H = (H + 1) % 3;
                                                            this.b(H);
                                                            aP = 0;
                                                        }
                                                        if (y.u == 16) {
                                                            aq.a(4102);
                                                            H = (H + 3 - 1) % 3;
                                                            this.b(H);
                                                            aP = 0;
                                                        }
                                                        if (this.M()) {
                                                            aq.a(4102);
                                                            I = 0;
                                                        }
                                                        break block77;
                                                    }
                                                    if (I != 3) break block88;
                                                    if (this.M()) {
                                                        I = 0;
                                                    }
                                                    break block77;
                                                }
                                                if (I != 4) break block89;
                                                if (y.u == 17) break block90;
                                                if (y.u == 19) break block90;
                                                if (y.u != 1) break block91;
                                            }
                                            aq.a(4102);
                                            aP ^= 1;
                                        }
                                        if (this.M()) {
                                            aq.e();
                                            if (aP == 0) {
                                                aq.a(4097);
                                                aq.a(5, 0);
                                                aF.b(8, 0);
                                                aF.b(1, 1);
                                                this.e(-1);
                                                I = 8;
                                            } else {
                                                aq.a(4102);
                                                I = 0;
                                            }
                                        }
                                        break block77;
                                    }
                                    if (I != 5) break block92;
                                    if (y.u == 17) break block93;
                                    if (y.u == 19) break block93;
                                    if (y.u != 1) break block94;
                                }
                                aq.a(4102);
                                aP ^= 1;
                            }
                            if (this.M()) {
                                aq.e();
                                if (aP == 0) {
                                    GameMain gameMain = this;
                                    gameMain.aX.d();
                                    return;
                                }
                                aq.a(4102);
                                I = 0;
                            }
                            break block77;
                        }
                        if (I != 6) break block95;
                        aq.e();
                        b.f = true;
                        I = 0;
                        break block77;
                    }
                    if (I != 7) break block96;
                    if (this.D()) {
                        aq.a(4, 0);
                        I = 1;
                        this.j(0);
                    }
                    break block77;
                }
                if (I != 8) break block77;
                if (this.M()) break block97;
                if (y.u != 21) break block77;
            }
            aq.a(4102);
            this.a(0, 0, 0L, 0L);
            bd = 2;
        }
        if (this.x()) {
            this.aT = true;
            this.aX.repaint();
            this.aX.serviceRepaints();
            if (I != 8 && !this.O()) {
                aq.e();
                aq.a(4102);
                if (I == 0) {
                    this.e(-1);
                    n2 = 2;
                    if (aE != aF.c(7)) {
                        n2 = 3;
                    }
                    this.a(n2, 0, 0L, 0L);
                    bd = 3;
                    V = null;
                } else if (I == 7) {
                    I = 1;
                } else {
                    I = 0;
                    V = null;
                }
            }
            this.aT = false;
        }
    }

    public void h(Graphics graphics) {
        int n2;
        int n3;
        if ((ar & 0xFFFFFFFF) == -1) {
            n3 = 0;
            while (true) {
                if (n3 >= y.E / q[9].getHeight() + 1) break;
                aq.a(graphics, q[9], y.e - y.n * 2, n3 * q[9].getHeight(), 33, 1);
                ++n3;
            }
            aq.a(graphics, 9198253);
            aq.a(graphics, 0, 0, y.e - q[9].getWidth() - y.n * 2, y.E, 17, 1);
            aq.a(graphics, 9217461);
            aq.a(graphics, y.e, 0, y.n * 2, y.E, 33, 1);
        }
        if (I == 0) {
            n3 = this.a(graphics, GameMain.n.v);
            this.a(graphics, GameMain.n.A, am, n3, 0);
        }
        if (I == 1 || I == 7) {
            n3 = y.h.stringWidth(V[az]) + y.k;
            n2 = this.a(graphics, GameMain.n.l);
            this.a(graphics, V, aP, n2, n3);
            this.o(graphics);
            if (I == 7) {
                this.j(graphics);
            }
        }
        if (I == 2) {
            aq.a(graphics, 128);
            aq.a(graphics, 0, 0, y.e, y.E, 17, 1);
            n3 = be;
            if (V.length - aP < be) {
                n3 = V.length - aP;
            }
            aq.a(graphics, 0xFFFF40);
            for (n2 = 0; n2 < n3; ++n2) {
                this.a(graphics, V[aP + n2], 4, y.k + (y.k + 1) * n2 + y / 2, 18, 1);
            }
            String string = "<<" + Integer.toString(H + 1) + "/" + 3 + ">>";
            this.a(graphics, string, y.e, y.E, 34, 1);
            this.b(graphics);
        }
        if (I == 3) {
            aq.a(graphics, 128);
            aq.a(graphics, 0, 0, y.e, y.E, 17, 1);
            aq.a(graphics, 0xFFFF40);
            for (n3 = 0; n3 < GameMain.n.m.length; ++n3) {
                this.a(graphics, GameMain.n.m[n3], 4, y.k + (y.k + 1) * n3, 18, 1);
            }
        }
        if (I == 4) {
            n3 = this.a(graphics, GameMain.n.c);
            this.a(graphics, GameMain.n.k, aP, n3, 0);
        }
        if (I == 5) {
            n3 = this.a(graphics, GameMain.n.j);
            this.a(graphics, GameMain.n.k, aP, n3, 0);
        }
        if (I == 8) {
            n3 = this.a(graphics, GameMain.n.o);
            this.a(graphics, GameMain.n.t, 0, n3, 0);
        }
    }

    public int a(Graphics graphics, String[] stringArray) {
        int n2 = this.a(stringArray) + y.n * 2;
        int n3 = y.k * stringArray.length + (stringArray.length - 1) * 1 + 2;
        int n4 = y.e / 2;
        int n5 = y.E / 16;
        aq.a(graphics, 0xFFFFFF);
        this.a(graphics, n4, n5 - 2, n2 + 4, n3 + 4, 4, 4, 65, 1);
        aq.a(graphics, 0xFF2020);
        this.a(graphics, n4, n5 - 0, n2 + 0, n3 + 0, 4, 4, 65, 1);
        aq.a(graphics, 0xFFFFFF);
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            this.a(graphics, stringArray[i2], n4, n5 + 1 + y.k + (y.k + (stringArray.length - 1) * 1) * i2, 66, 1);
        }
        return n3 + y.E / 16 * 2;
    }

    public void a(Graphics graphics, String[] stringArray, int n2, int n3, int n4) {
        int n5 = stringArray.length + 2;
        int n6 = y.k + 2;
        int n7 = y.k * n5 + (n5 - 1) * 2;
        int n8 = n3 + ((y.E - this.p() - n3) / 2 - n7 / 2);
        int n9 = this.a(stringArray);
        if (n9 < n4) {
            n9 = n4;
        }
        n9 += y.n * 2;
        n8 += y.k + n6 / 2;
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            if (stringArray[i2].length() == 0) continue;
            int n10 = 8274;
            if (n2 == i2) {
                n10 = 0xFFFF40;
                aq.a(graphics, 128);
                this.a(graphics, y.e / 2, n8, n9, n6, 4, 4, 68, 1);
                aq.a(graphics, q[7], y.e / 2 - n9 / 2 - y.n / 2, n8, 36, 1);
                aq.a(graphics, q[7], 0, 0, -1, -1, 2, y.e / 2 + n9 / 2 + y.n / 2, n8, 20, 1);
            }
            String string = stringArray[i2];
            int n11 = y.h.stringWidth(string);
            int n12 = stringArray[i2].indexOf("@");
            if (n12 >= 0) {
                string = stringArray[i2].substring(0, n12);
            }
            aq.a(graphics, n10);
            this.a(graphics, string, y.e / 2 - n11 / 2, n8, 20, 1);
            graphics.setClip(0, 0, y.e, y.E);
            if (i2 == az) {
                ad = y.e / 2 + n11 / 2;
                G = n8;
            }
            n8 += n6;
        }
    }

    public void b(Graphics graphics) {
        if (V.length <= be) {
            return;
        }
        int n2 = 2;
        int n3 = y.E - this.p() - 4;
        aq.a(graphics, 0xFFFF40);
        aq.b(graphics, y.e - 1, 0, n2 + 4 - 1, n3 + 4 - 1, 33, 1);
        int n4 = (n3 << 16) / V.length;
        int n5 = (aP * n4 >> 16) + 2;
        int n6 = be * n4 >> 16;
        if (n6 == 0) {
            n6 = 1;
        }
        aq.a(graphics, y.e - 2, n5, n2, n6, 33, 1);
    }

    public void o(Graphics graphics) {
        aq.a(graphics, 0xFFFF40);
        aq.a(graphics, ad, G, y.k, y.k - 1, 0, 360, 36, 1);
        aq.a(graphics, i.x[aF.c(7)]);
        aq.a(graphics, ad - 1, G, y.k - 2, y.k - 1 - 2, 0, 360, 36, 1);
    }

    public int i(int n2) {
        int n3 = 0;
        for (int i2 = 0; i2 < 6; ++i2) {
            if (i2 != 1 || i2 == n2) {
                // empty if block
            }
            if (i2 != 3 || i2 == n2) {
                // empty if block
            }
            if (n3 == n2) break;
            ++n3;
        }
        return n3;
    }

    public void n() {
        int n2 = aF.c(2) ^ 1;
        aF.b(2, n2);
        aq.a(false);
        if (n2 != 0) {
            aq.a(true);
            aq.a(4102);
        }
    }

    public void a() {
        int n2 = aF.c(3) ^ 1;
        aF.b(3, n2);
        int n3 = 0;
        if (n2 != 0) {
            n3 = 10;
        }
        aq.b(n3);
    }

    public void h(int n2) {
        int n3;
        int n4 = 0;
        if (n2 == n4) {
            this.n();
            GameMain.V[n4] = this.a(2, GameMain.n.B[0]);
        }
        if (n2 == ++n4) {
            this.a();
            GameMain.V[n4] = this.a(3, GameMain.n.B[1]);
        }
        if (n2 == ++n4) {
            n3 = aF.c(4) ^ 1;
            aF.b(4, n3);
            GameMain.V[n4] = this.a(4, GameMain.n.B[2]);
        }
        if (n2 == ++n4) {
            n3 = (aF.c(7) + 1) % i.x.length;
            aF.b(7, n3);
            this.v();
        }
        if (w.z > 1 && n2 == ++n4) {
            this.H();
            I = 7;
        }
        if (n2 == ++n4) {
            I = 0;
        }
    }

    /*
     * Unable to fully structure code
     */
    public void j(int var1_1) {
        block9: {
            block10: {
                GameMain.I = 1 + var1_1;
                GameMain.aP = 0;
                if (GameMain.I != 1) break block10;
                var2_2 = GameMain.n.B.length;
                GameMain.V = new String[var2_2];
                var3_3 = 0;
                for (var4_4 = 0; var4_4 < GameMain.n.B.length; ++var4_4) {
                    block12: {
                        block15: {
                            block14: {
                                block13: {
                                    block11: {
                                        if (var4_4 != 0) break block11;
                                        GameMain.V[var3_3] = this.a(2, GameMain.n.B[var4_4]);
                                        break block12;
                                    }
                                    if (var4_4 != 1) break block13;
                                    GameMain.V[var3_3] = this.a(3, GameMain.n.B[var4_4]);
                                    break block12;
                                }
                                if (var4_4 != 2) break block14;
                                GameMain.V[var3_3] = this.a(4, GameMain.n.B[var4_4]);
                                break block12;
                            }
                            if (var4_4 != 3) break block15;
                            GameMain.V[var3_3] = GameMain.n.B[var4_4];
                            var5_5 = 0;
                            while (true) {
                                if (var5_5 >= (y.k + (y.n - 1)) / y.n) break;
                                v0 = var3_3;
                                GameMain.V[v0] = GameMain.V[v0] + "@";
                                ++var5_5;
                            }
                            GameMain.az = var3_3;
                            break block12;
                        }
                        if (var4_4 != 4) ** GOTO lbl-1000
                        if (GameMain.n.c(w.r) == 1) {
                            GameMain.V[var3_3] = "";
                        } else lbl-1000:
                        // 2 sources

                        {
                            GameMain.V[var3_3] = GameMain.n.B[var4_4];
                        }
                    }
                    if (++var3_3 < var2_2) {
                        continue;
                    }
                    break block9;
                }
                break block9;
            }
            if (GameMain.I == 2) {
                GameMain.H = 0;
                this.b(GameMain.H);
            } else if (GameMain.I == 3) {
                this.b(4);
            } else {
                GameMain.aP = 1;
            }
        }
    }

    public void b(int n2) {
        this.aT = true;
        this.aX.repaint();
        this.aX.serviceRepaints();
        int n3 = y.e - y.n * 2;
        int n4 = y.E - this.p();
        if (n2 == 0) {
            V = w.a(GameMain.n.e, n3, aq);
        }
        if (n2 == 1) {
            V = w.a(GameMain.n.x, n3, aq);
        }
        if (n2 == 2) {
            V = w.a(GameMain.n.f, n3, aq);
        }
        if (n2 == 4) {
            GameMain.n.m = w.a(GameMain.n.m, n3, aq);
        }
        be = n4 / (y.k + 1);
        y = n4 % (y.k + 1);
        this.aT = false;
    }

    public String a(int n2, String string) {
        String string2 = string + GameMain.n.w[aF.c(n2)];
        return string2;
    }

    public void g(int n2) {
        bb = n2;
    }

    public boolean o() {
        block21: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block18: {
                                block20: {
                                    block19: {
                                        if (aF.c(35) != 2) break block18;
                                        if (y.u == 18) break block19;
                                        if (y.u != 3) break block20;
                                    }
                                    aq.a(4102);
                                    while (++bb == 1 || bb == 2) {
                                    }
                                }
                                if (y.u == 16) {
                                    aq.a(4102);
                                    while (--bb == 1 || bb == 2) {
                                    }
                                }
                                if (bb < 0 || bb >= 4) {
                                    return true;
                                }
                                break block21;
                            }
                            if (y.u == 19) break block22;
                            if (y.u == 18) break block22;
                            if (y.u == 20) break block22;
                            if (y.u != 2) break block23;
                        }
                        aq.a(4102);
                        bb = (bb + 1) % 4;
                    }
                    if (y.u == 17) break block24;
                    if (y.u == 16) break block24;
                    if (y.u != 1) break block25;
                }
                aq.a(4102);
                bb = (bb + 4 - 1) % 4;
            }
            if (this.x()) {
                aq.e();
                aq.a(4102);
                return true;
            }
            if (bg.e(0, bf.e())) {
                return true;
            }
        }
        return false;
    }

    public void p(Graphics graphics) {
        int n2 = q[29].getWidth();
        int n3 = q[29].getHeight() / 4;
        aq.a(graphics, q[29], 0, bb * n3, n2, n3, W, N, 17, 1);
        if (bb == 0) {
            n2 = q[33].getWidth();
            n3 = q[33].getHeight() / 2;
            aq.a(graphics, q[33], 0, 0, n2, n3, W + Z, N + aU, 34, 1);
            this.a(graphics, 41, aF.c(12), 2, W + aq.h(6), N + aU, aq.h(5), 18, false);
        }
        if (bb == 1) {
            this.a(graphics, 37, aF.c(13));
        }
        if (bb == 2) {
            this.a(graphics, 38, (aF.c(14) + 1) / 2);
        }
        if (bb == 3) {
            n2 = q[33].getWidth();
            n3 = q[33].getHeight() / 2;
            aq.a(graphics, q[33], 0, n3, n2, n3, W + Z, N + aU, 34, 1);
            this.a(graphics, 41, aF.c(16) * 5, 3, W + aq.h(6), N + aU, aq.h(5), 18, false);
        }
    }

    public void a(Graphics graphics, int n2, int n3) {
        int n4 = q[n2].getWidth() / 2;
        int n5 = q[n2].getHeight();
        for (int i2 = 0; i2 < 4; ++i2) {
            int n6 = 0;
            if (n3 > i2) {
                ++n6;
            }
            aq.a(graphics, q[n2], n6 * n4, 0, n4, n5, W + n4 * i2, N + aU, 18, 1);
        }
    }

    public void J() {
        C = 1;
    }

    public boolean g() {
        boolean bl;
        block8: {
            block7: {
                bl = false;
                if (y.u == 17) break block7;
                if (y.u == 19) break block7;
                if (y.u != 1) break block8;
            }
            aq.a(4102);
            C ^= 1;
        }
        if (this.M()) {
            aq.e();
            if (C == 0) {
                GameMain gameMain = this;
                gameMain.aX.d();
            } else {
                bl = true;
            }
        }
        if (this.x()) {
            aq.e();
            bl = true;
        }
        return bl;
    }

    public void a(Graphics graphics) {
        this.a(graphics, GameMain.n.j, GameMain.n.k, C);
    }

    public void w() {
        aF.b(0, 1);
        aF.b(1, 1);
        this.c(bf.e());
    }

    public boolean b() {
        aV.a(this.aX, "record", 2);
        byte[] byArray = aF.a();
        aV.b(0, byArray.length + 4);
        byArray = null;
        byArray = bg.a();
        aV.b(1, byArray.length + 4);
        byArray = null;
        if (!aV.c()) {
            aV.f();
            if (aV.d()) {
                b.a(null);
                return false;
            }
        } else {
            this.a(-1);
        }
        if (aF.c(0) == 0) {
            this.w();
            this.e(-1);
        }
        return true;
    }

    public void a(int n2) {
        byte[] byArray;
        aV.e();
        if (aV.d()) {
            b.a(null);
            return;
        }
        if ((n2 & 1) != 0) {
            aV.a(0, 0, 0);
            byArray = this.q();
            aF.a(byArray);
            byArray = null;
        }
        if ((n2 & 2) != 0) {
            aV.a(1, 0, 0);
            byArray = this.q();
            bg.a(byArray);
            byArray = null;
        }
    }

    public byte[] q() {
        int n2 = aV.a();
        byte[] byArray = new byte[n2];
        if (byArray == null) {
            b.a(null);
            return null;
        }
        aV.b(byArray, 0, n2);
        return byArray;
    }

    public void e(int n2) {
        byte[] byArray;
        if ((n2 & 1) != 0) {
            byArray = aF.a();
            aV.a(0, 0, 0);
            aV.a(byArray.length);
            aV.a(byArray, 0, byArray.length);
            byArray = null;
        }
        if ((n2 & 2) != 0) {
            byArray = bg.a();
            aV.a(1, 0, 0);
            aV.a(byArray.length);
            aV.a(byArray, 0, byArray.length);
            byArray = null;
        }
        aV.b();
        if (aV.d()) {
            b.a(null);
            return;
        }
        aF.d();
        bg.d();
    }

    public void a(int n2, int n3, long l2, long l3) {
        aQ = n2;
        ak = n3;
        z = 0;
        aG = 0;
        X = 0;
        aD = 0;
        af = 0;
        Y = 0;
        L = l2;
        O = l3;
        aw = 0L;
        aI = 0L;
        aY = 0;
    }

    public boolean i() {
        int n2 = aB[aQ][z];
        if (n2 < 0) {
            return false;
        }
        int n3 = 0;
        int n4 = 1;
        while (aB[aQ][n4] >= 0) {
            n3 += aB[aQ][n4 + 2];
            n4 += 4;
        }
        aD = n3;
        af = (aD + 4) / 5;
        ++z;
        if (!this.z()) {
            return false;
        }
        this.a(n2, 378);
        aq.e();
        if (ak != 0) {
            aq.a(2, 0);
        }
        return true;
    }

    public boolean z() {
        if (aB[aQ][z] < 0) {
            return false;
        }
        int n2 = aB[aQ][z + 0];
        int n3 = aB[aQ][z + 1];
        int n4 = aB[aQ][z + 2];
        int n5 = aB[aQ][z + 3];
        if (n2 == 0 && n5 == 2) {
            n3 += aF.c(7) * n4;
            n5 += aF.c(7);
        }
        if (n2 == 0 && n5 == 12) {
            n3 += aF.c(7) * n4;
            n5 += aF.c(7);
        }
        if (n2 == 0 && n5 == 16) {
            n3 += aF.c(11) * n4;
            n5 += aF.c(11);
        }
        g = null;
        aq.d();
        g = new q();
        if (g == null) {
            b.a(null);
            return false;
        }
        g.a("/pack" + n5 + ".bin", 0, af);
        if (g.d()) {
            b.a(null);
            return false;
        }
        for (int i2 = 0; i2 < n4; ++i2) {
            if (n2 == 0) {
                g.a(x.a(q, 0, n3 + i2, 1, i2));
            }
            if (n2 == 1) {
                g.a(x.a(K, 1, n3 + i2, 1, i2));
            }
            if (n2 == 2) {
                g.a(x.a(ap, 2, n3 + i2, 1, i2));
            }
            if (!g.d()) continue;
            b.a(null);
            return false;
        }
        z += 4;
        return true;
    }

    public boolean l() {
        block18: {
            block14: {
                int n2;
                block15: {
                    block17: {
                        long l2;
                        block16: {
                            if (aw == 0L) {
                                aw = bf.e();
                            }
                            if (aY == 0) {
                                if (y.u == 21 && ak != 0) {
                                    aq.e();
                                    aq.a(4102);
                                    aq.a(4, 0);
                                    aI = bf.e();
                                    aY = 1;
                                    this.J();
                                    return false;
                                }
                            }
                            if (aY == 1) {
                                if (y.u == 10) {
                                    this.n();
                                }
                                if (y.u == 11) {
                                    this.a();
                                }
                                if (this.g()) {
                                    aq.a(4102);
                                    aq.a(2, 0);
                                    aw += bf.e() - aI;
                                    aY = 0;
                                }
                                return false;
                            }
                            boolean bl = g.i();
                            if (g.d()) {
                                b.a(null);
                                return false;
                            }
                            if (!bl) break block14;
                            n2 = g.e();
                            if (this.z()) break block15;
                            aG = aD;
                            if (Y >= 2) break block16;
                            if (ak != 0) break block17;
                        }
                        if ((l2 = bf.e() - aw) >= L) {
                            if (y.u != -1) {
                                l2 = O;
                            }
                        }
                        if (l2 >= O) {
                            aQ = -1;
                            return true;
                        }
                    }
                    ++Y;
                    break block18;
                }
                X += n2;
                break block18;
            }
            aG = X + g.e();
        }
        return false;
    }

    public void k(Graphics graphics) {
        this.l(graphics);
        if (aY == 1) {
            this.a(graphics);
        }
    }

    public void a(int n2, int n3) {
        for (int i2 = n3 - 1; i2 >= n2; --i2) {
            GameMain.q[i2] = null;
        }
        aq.d();
    }

    public void f(int n2) {
        int n3;
        int n4;
        int n5;
        int n6 = r.aC[n2];
        if (n6 < 0) {
            return;
        }
        int n7 = aF.c(11);
        int n8 = n7 * 43;
        for (n5 = 0; n5 < n6; ++n5) {
            n8 += ae.v[n5];
        }
        n5 = 0;
        for (int i2 = 0; i2 < ae.v[n6]; ++i2) {
            if (ae.w[n8 + i2] < 0 || q[n4 = (n3 = 78 + n7 * 25) + (ae.w[n8 + i2] & 0xFF)] != null) continue;
            this.a(78, 378);
            n5 = 1;
            break;
        }
        if (n5 == 0) {
            return;
        }
        g = null;
        aq.d();
        g = new q();
        if (g == null) {
            b.a(null);
            return;
        }
        if (g.d()) {
            b.a(null);
            return;
        }
        String string = "/pack" + (16 + n7) + ".bin";
        g.a(string, 0, 1);
        if (g.d()) {
            b.a(null);
            return;
        }
        n3 = 0;
        for (n4 = 0; n4 < 25; ++n4) {
            for (int i3 = 0; i3 < ae.v[n6]; ++i3) {
                if (ae.w[n8 + i3] < 0 || (ae.w[n8 + i3] & 0xFF) != n4) continue;
                int n9 = 78 + n7 * 25;
                int n10 = n9 + (ae.w[n8 + i3] & 0xFF);
                if (q[n10] == null) {
                    g.a(x.a(q, 0, n10, 1, n4));
                }
                if (g.d()) {
                    b.a(null);
                    return;
                }
                ++n3;
                break;
            }
            if (n3 >= ae.v[n6]) break;
        }
        g.i();
        if (g.d()) {
            b.a(null);
            return;
        }
    }

    public void c(int n2) {
        if (ae.b[n2][0] < 0) {
            return;
        }
        this.a(51, 70);
        g = null;
        aq.d();
        g = new q();
        if (g == null) {
            b.a(null);
            return;
        }
        if (g.d()) {
            b.a(null);
            return;
        }
        String string = "/pack11.bin";
        g.a(string, 0, 1);
        if (g.d()) {
            b.a(null);
            return;
        }
        int n3 = 0;
        for (int i2 = 0; i2 < 19; ++i2) {
            int n4 = 0;
            while (ae.b[n2][n4] >= 0) {
                short s2 = ae.b[n2][n4];
                if (s2 == 51 + i2) {
                    if (q[s2] == null) {
                        g.a(x.a(q, 0, (int)s2, 1, i2));
                    }
                    if (g.d()) {
                        b.a(null);
                        return;
                    }
                    ++n3;
                    break;
                }
                ++n4;
            }
            if (ae.b[n2][n3] < 0) break;
        }
        g.i();
        if (g.d()) {
            b.a(null);
            return;
        }
    }

    public void l(Graphics graphics) {
        if (ak == 0) {
            return;
        }
        int n2 = this.p();
        aq.a(graphics, 0xFFFFFF);
        aq.a(graphics, 0, 0, y.e, y.E, 17, 1);
        if (ak == 2) {
            aq.a(graphics, bc[0], y.e / 2, (y.E - n2) / 2, 68, 1);
        } else {
            int n3;
            int n4 = GameMain.n.C.length;
            int n5 = y.k * n4 + n4 * (y.k / 6);
            int n6 = y.k / 3 * 2;
            int n7 = n3 = (y.E - (bc[0].getHeight() + n5 + n6 + n2)) / 4;
            aq.a(graphics, bc[0], y.e / 2, n7, 65, 1);
            n7 += bc[0].getHeight() + n3;
            int n8 = aG * 100 / aD;
            int n9 = y.e / 10 * 8;
            int n10 = (n9 - 2) * n8 / 100;
            aq.a(graphics, 0);
            aq.a(graphics, (y.e - n9) / 2 + 0, n7 + 0, n9 - 0, n6 - 0, 17, 1);
            aq.a(graphics, 0xFFFFFF);
            aq.a(graphics, (y.e - n9) / 2 + 1, n7 + 1, n9 - 2, n6 - 2, 17, 1);
            aq.a(graphics, 3586797);
            aq.a(graphics, (y.e - n9) / 2 + 1, n7 + 1, n10, n6 - 2, 17, 1);
            n7 += n6 + n3;
            int n11 = aF.c(6);
            aq.a(graphics, 0);
            for (int i2 = 0; i2 < GameMain.n.C.length; ++i2) {
                this.a(graphics, GameMain.n.C[i2], y.e / 2, n7 + y.k + (y.k + y.k / 6) * i2, 66, 1);
            }
        }
    }

    public void f() {
        bc = new Image[i.ah.length];
        if (bc == null) {
            b.a(null);
            return;
        }
        for (int i2 = 0; i2 < i.ah.length; ++i2) {
            try {
                GameMain.bc[i2] = Image.createImage((String)i.ah[i2]);
                continue;
            }
            catch (Exception exception) {
                b.a(null);
            }
        }
    }

    public void Q() {
        aq.e();
        if (aF.c(5) == 0) {
            aq.a(2, 0);
            I = 1;
        } else {
            aq.a(0);
            aq.a(2, 1);
            I = 0;
        }
        aO = -1;
    }

    public void R() {
        block12: {
            block10: {
                block11: {
                    if (y.u == 10) {
                        this.n();
                        if (I == 0 && aF.c(2) != 0) {
                            aq.a(0);
                        }
                    }
                    if (y.u == 11) {
                        this.a();
                    }
                    if (I != 0) break block10;
                    if (this.M()) break block11;
                    if (y.u != 22) break block12;
                }
                this.e(-1);
                aq.a(4102);
                this.a(1, 1, 0L, 0L);
                bd = 3;
                aO = -1;
                break block12;
            }
            if (I == 2 && this.g()) {
                I = aO;
                aO = -1;
                if (I == 0) {
                    aq.a(0);
                    aq.a(2, 1);
                } else {
                    aq.a(4102);
                    aq.a(2, 0);
                }
            }
        }
        if (I != 2 && !this.O()) {
            if (y.u == 21) {
                aq.a(4102);
                aq.a(4, 0);
                this.J();
                aO = I;
                I = 2;
            }
        }
    }

    public void F() {
        if (I == 1) {
            if (this.D()) {
                this.e(-1);
                I = 3;
                aq.a(6, 7);
            }
        } else if (I == 3 && this.E()) {
            I = 0;
            this.as = true;
        }
    }

    public void a(Graphics graphics, String string, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        int n11;
        int n12;
        graphics.setClip(0, 0, y.e, y.E);
        graphics.setColor(n5);
        for (n12 = -n7; n12 <= n7; ++n12) {
            for (n11 = -n8; n11 <= n8; ++n11) {
                graphics.drawString(string, n2 + n12, n3 + n11, n4);
            }
        }
        graphics.setColor(n6);
        for (n12 = -n9; n12 <= n9; ++n12) {
            for (n11 = -n10; n11 <= n10; ++n11) {
                graphics.drawString(string, n2 + n12, n3 + n11, n4);
            }
        }
    }

    public void c(Graphics graphics) {
        graphics.setColor(5128046);
        graphics.fillRect(0, 0, y.e, y.E);
        if (this.aX.k) {
            this.Q();
            this.aX.k = false;
        }
        int n2 = this.p();
        int n3 = 0 + aF.c(7) * 1;
        aq.a(graphics, q[n3], y.e >> 1, 0, 65, 1);
        if (this.ai != null) {
            if (this.F < 0) {
                this.F += 1 + Math.abs(this.F / 5);
            }
            this.F = 0;
            graphics.drawImage(this.ai, y.e >> 1, this.F, 17);
        }
        int n4 = q[5].getWidth() / 2;
        int n5 = q[5].getHeight();
        int n6 = 0;
        if (U % 16 < 8) {
            ++n6;
        }
        aq.a(graphics, q[5], n4 * n6, 0, n4, n5, y.e >> 1, i.P[3], 65, 1);
        n4 = q[4].getWidth() / 2;
        n5 = q[4].getHeight();
        boolean bl = false;
        int n7 = y.h.stringWidth(GameMain.n.h[GameMain.n.h.length - 1]);
        int n8 = (Math.max(y.h.stringWidth(GameMain.n.a[aq.k()]), y.h.stringWidth(GameMain.n.a[aq.m()])) << 1) + bc[1].getWidth() * 4;
        for (int i2 = GameMain.n.h.length - 1; i2 >= 0; --i2) {
            if (n7 >= y.e - n8) {
                this.a(graphics, GameMain.n.h[i2], y.e >> 1, y.E - 2 - (GameMain.n.h.length - 1 - i2 + 1) * (y.k + 3), 33, 0x333333, 0xFFFFFF, 1, 1, 0, 0);
                continue;
            }
            this.a(graphics, GameMain.n.h[i2], y.e >> 1, y.E - 2 - (GameMain.n.h.length - 1 - i2) * (y.k + 3), 33, 0x333333, 0xFFFFFF, 1, 1, 0, 0);
        }
        if (aF.c(2) != 0) {
            aq.a(graphics, q[4], 0, 0, n4, n5, y.n / 2, y.E - n2 - y.k / 4, 18, 1);
        }
        if (aF.c(3) != 0) {
            aq.a(graphics, q[4], n4, 0, n4, n5, y.e - y.n / 2, y.E - n2 - y.k / 4, 34, 1);
        }
        if (I == 2) {
            this.a(graphics);
        }
    }

    public void i(Graphics graphics) {
        graphics.setColor(5128046);
        graphics.fillRect(0, 0, y.e, y.E);
        if (this.aX.k) {
            this.aX.k = false;
        }
        if (I == 1) {
            this.j(graphics);
        }
        if (I == 3) {
            this.r(graphics);
        }
    }

    public int a(String[] stringArray) {
        int n2 = 0;
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            if (stringArray[i2] == null) continue;
            int n3 = y.h.stringWidth(stringArray[i2]);
            if (n2 >= n3) continue;
            n2 = n3;
        }
        return n2;
    }

    public void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (n9 == 1) {
            n2 += y.A;
            n3 += y.z;
        }
        n2 = y.a(n2, n4, n8);
        n3 = y.b(n3, n5, n8);
        graphics.fillRoundRect(n2, n3, n4, n5, n6, n7);
    }

    public void a(Graphics graphics, String string, int n2, int n3, int n4, int n5) {
        aq.a(graphics, string, n2, n3, n4, n5);
    }

    public void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl) {
        int[] nArray = new int[n4];
        if (nArray == null) {
            b.a(null);
            return;
        }
        int n9 = n3;
        int n10 = 0;
        do {
            nArray[n10] = n9 % 10;
            ++n10;
        } while ((n9 /= 10) > 0);
        int n11 = q[n2].getWidth() / 5;
        int n12 = q[n2].getHeight() / 2;
        int n13 = (n11 + n7) * n4;
        n5 = y.a(n5, n13, n8);
        n6 = y.b(n6, n12, n8);
        boolean bl2 = false;
        n10 = n4 - 1;
        do {
            if (n10 == 0 || nArray[n10] > 0 || bl) {
                bl2 = true;
            }
            if (!bl2) continue;
            aq.a(graphics, q[n2], n11 * (nArray[n10] % 5), n12 * (nArray[n10] / 5), n11, n12, n5 + (n11 + n7) * (n4 - 1 - n10), n6, 17, 1);
        } while (--n10 >= 0);
        nArray = null;
    }

    public int a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7) {
        n2 = y.a(n2, n4, n6);
        n3 = y.b(n3, n5, n6);
        aq.a(graphics, 8274);
        this.a(graphics, n2 + 0, n3 + 0, n4 - 0, n5 - 0, 4, 4, 17, n7);
        aq.a(graphics, 11591176);
        this.a(graphics, n2 + 2, n3 + 2, n4 - 4, n5 - 4, 4, 4, 17, n7);
        return n3;
    }

    public void a(Graphics graphics, String[] stringArray, int n2) {
        int n3 = stringArray.length + 2;
        int n4 = n3 * y.k + 2 * (n3 - 1);
        int n5 = this.a(stringArray) + y.n * 4;
        int n6 = y.e / 2;
        int n7 = (y.E - this.p()) / 2;
        n7 = this.a(graphics, n6, n7, n5, n4, 68, 1);
        n7 += y.k + 2 + y.k / 2;
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            int n8 = 858701;
            if (n2 < 0 || i2 == n2) {
                n8 = 15084350;
            }
            aq.a(graphics, n8);
            this.a(graphics, stringArray[i2], n6, n7, 68, 1);
            n7 += y.k + 2;
        }
    }

    public void a(Graphics graphics, String[] stringArray, String[] stringArray2, int n2) {
        int n3;
        int n4 = stringArray.length + stringArray2.length + 3;
        int n5 = n4 * y.k + 2 * (n4 - 1);
        int n6 = this.a(stringArray);
        if (n6 < this.a(stringArray2)) {
            n6 = this.a(stringArray2);
        }
        int n7 = y.e / 2;
        int n8 = (y.E - this.p()) / 2;
        n8 = this.a(graphics, n7, n8, n6 += y.n * 4, n5, 68, 1);
        n8 += y.k + 2 + y.k / 2;
        aq.a(graphics, 15084350);
        for (n3 = 0; n3 < stringArray.length; ++n3) {
            this.a(graphics, stringArray[n3], n7, n8, 68, 1);
            n8 += y.k + 2;
        }
        n8 += y.k + 2;
        for (n3 = 0; n3 < stringArray2.length; ++n3) {
            String string = stringArray2[n3];
            int n9 = 858701;
            if (n3 == n2) {
                n9 = 15084350;
                string = "[" + stringArray2[n3] + "]";
            }
            aq.a(graphics, n9);
            this.a(graphics, string, n7, n8, 68, 1);
            n8 += y.k + 2;
        }
    }

    static {
        R = 0;
        S = 0;
        d = 0;
        bi = 0;
        B = 0;
        aZ = 0;
        J = 0;
        aK = 0;
        T = 0;
        D = 24;
        ae = 26;
        i = 15;
        ax = new Hashtable();
        at = new Hashtable();
        au = 0;
        e = null;
    }
}

