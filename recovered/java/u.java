/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class u
implements ad,
ae {
    private int l;
    private int z;
    private int y;
    private int h;
    private int k;
    private int i;
    private int d;
    private int u;
    private int q;
    private int f;
    private int c;
    private int[] x = new int[10];
    private int e = -1;
    private boolean a = false;
    private byte[] n = null;
    private y g;

    private boolean a(int n2, int n3, int n4, int n5) {
        block7: {
            block6: {
                block5: {
                    block4: {
                        n2 = y.a(n2, n4, this.c);
                        n3 = y.b(n3, n5, this.c);
                        if (n2 + n4 < 0) break block4;
                        if (n2 <= y.e) break block5;
                    }
                    return false;
                }
                if (n3 + n5 < 0) break block6;
                if (n3 <= y.E) break block7;
            }
            return false;
        }
        return true;
    }

    private void g() {
        int n2 = this.c();
        byte by = this.n[n2 + 2];
        if (by >= 0) {
            this.g.a(ad.s[by]);
        }
    }

    private int c() {
        int n2 = this.e * 2;
        int n3 = (this.n[n2 + 1] & 0xFF) << 8 | this.n[n2 + 0] & 0xFF;
        for (int i2 = 0; i2 < this.z; ++i2) {
            byte by = this.n[n3 + 1];
            n3 += by * 8 + 3;
        }
        return n3;
    }

    public void j() {
        this.e = -1;
        this.a = false;
    }

    public boolean h() {
        return this.a;
    }

    public boolean f() {
        return (this.l & 8) != 0;
    }

    public void a(y y2, byte[] byArray, int n2, int n3, int n4, int n5) {
        if (byArray != null) {
            this.g = y2;
            this.n = byArray;
            this.e = n2;
            this.z = 0;
            this.y = 0;
            this.h = this.n[this.c()];
            this.i = n3;
            this.d = n4;
            this.u = n3;
            this.q = n4;
            this.k = 0;
            this.f = 0;
            this.c = n5;
            this.l = 0;
            this.a = true;
            this.g();
        }
    }

    public void e() {
        this.i = this.u;
        this.d = this.q;
    }

    public void b(int n2, int n3) {
        this.i = n2;
        this.d = n3;
    }

    public int a() {
        return this.i;
    }

    public int d() {
        return this.d;
    }

    public void a(int n2, int n3) {
        if (n2 >= 0 && n2 <= 9) {
            this.x[n2] = n3;
        }
    }

    public void a(int n2) {
        this.z = 0;
        this.y = 0;
        this.k = 0;
        this.e = n2;
        this.h = this.n[this.c()];
        this.l = 0;
        this.g();
    }

    public int k() {
        return this.z;
    }

    public int i() {
        return this.y;
    }

    public void b() {
        if (this.h()) {
            if ((this.l & 4) != 0) {
                return;
            }
            if ((this.l & 8) != 0) {
                return;
            }
            if (this.h > 0) {
                --this.h;
            }
            if (this.h == 0) {
                ++this.z;
                ++this.y;
                int n2 = this.c();
                int n3 = this.n[n2];
                if (n3 > 0) {
                    this.h = n3;
                    this.g();
                } else if (n3 == -2) {
                    --this.z;
                    --this.y;
                    this.l |= 8;
                } else if (n3 == -3) {
                    ++this.k;
                    if (this.k == this.n[n2 + 2]) {
                        --this.z;
                        --this.y;
                        this.l |= 8;
                    } else {
                        this.z = this.n[n2 + 1];
                        this.h = this.n[this.c()];
                        this.g();
                    }
                } else {
                    this.j();
                }
            }
        }
    }

    public void a(Graphics graphics, Image[] imageArray) {
        if (this.h()) {
            if ((this.l & 2) != 0) {
                return;
            }
            if ((this.l & 0x20) != 0 && this.h % 2 != 0) {
                return;
            }
            int n2 = this.c();
            if (this.n[n2] > 0) {
                int n3 = this.n[n2 + 1];
                n2 += 3;
                for (int i2 = 0; i2 < n3; ++i2) {
                    int n4;
                    int n5;
                    int n6;
                    int n7;
                    int n8 = n2 + i2 * 8;
                    int n9 = (this.n[n8 + 0 + 1] & 0xFF) << 8 | this.n[n8 + 0 + 0] & 0xFF;
                    short s2 = (short)((this.n[n8 + 2 + 1] & 0xFF) << 8 | this.n[n8 + 2 + 0] & 0xFF);
                    short s3 = (short)((this.n[n8 + 4 + 1] & 0xFF) << 8 | this.n[n8 + 4 + 0] & 0xFF);
                    int n10 = 0;
                    if ((this.n[n8 + 6] & 2) != 0) {
                        n10 = (this.n[n8 + 6] & 1) != 0 ? 3 : 1;
                    } else if ((this.n[n8 + 6] & 1) != 0) {
                        n10 = 2;
                        if (this.n[n8] == 46) {
                            return;
                        }
                    }
                    if (this.n[n8 + 7] >= 0 && this.n[n8 + 7] <= 9) {
                        n7 = this.x[this.n[n8 + 7]];
                        if (n7 >= 78 && n7 < 378) {
                            n6 = (n7 - 78) / 25 * 43;
                            n5 = (short)(ae.w[n6 + n9] >> 0 & 0xFF);
                            n4 = (short)(ae.w[n6 + n9] >> 8 & 0xFF);
                            n9 = n5;
                            if (n4 != 0) {
                                n10 = n10 == 3 ? 1 : (n10 == 1 ? 3 : (n10 == 2 ? 0 : 2));
                            }
                        }
                        n9 = (short)(n9 + n7);
                    }
                    if (!this.a(n7 = this.g.h(s2) + this.i, n6 = this.g.h(s3) + this.d, n5 = imageArray[n9].getWidth(), n4 = imageArray[n9].getHeight()) || n9 == 10 || n9 == 11) continue;
                    this.g.a(graphics, imageArray[n9], 0, 0, n5, n4, n10, n7, n6, this.c, 1);
                }
            }
        }
    }
}

