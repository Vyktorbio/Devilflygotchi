/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class y
extends p {
    static final int[] l = new int[]{1, 2, 3, 4};
    public static Font h;
    public static int n;
    public static int k;
    public static int c;
    public static int C;
    static int e;
    static int E;
    private int w;
    private int j;
    private int y;
    private boolean D;
    private f g;
    private int s;
    private int r;

    public y(int n2, int n3, int n4, int n5) {
        e = n2;
        E = n3;
        this.s = n4;
        this.r = n5;
    }

    public void h() {
        super.h();
    }

    public final void d(int n2) {
        h = y.f(n2);
        n = h.stringWidth("@");
        k = h.getHeight();
        c = h.getBaselinePosition();
        C = k - c;
    }

    public static Font f(int n2) {
        Font font;
        int n3 = l.length - 1;
        while ((font = m.c(l[n3])).getHeight() > n2 && --n3 >= 0) {
        }
        return font;
    }

    public final void a(Graphics graphics) {
        graphics.setFont(h);
    }

    public final void a(Graphics graphics, int n2) {
        graphics.setColor(m.d(n2));
    }

    public final void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n7 == 1) {
            n2 += A;
            n3 += z;
        }
        n2 = y.a(n2, n4, n6);
        n3 = y.b(n3, n5, n6);
        graphics.fillRect(n2, n3, n4, n5);
    }

    public final void b(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n7 == 1) {
            n2 += A;
            n3 += z;
        }
        n2 = y.a(n2, n4, n6);
        n3 = y.b(n3, n5, n6);
        graphics.drawRect(n2, n3, n4, n5);
    }

    public final void a(Graphics graphics, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (n9 == 1) {
            n2 += A;
            n3 += z;
        }
        n2 = y.a(n2, n4, n8);
        n3 = y.b(n3, n5, n8);
        if (n7 != 0) {
            graphics.fillArc(n2, n3, n4, n5, n6, n7);
        }
    }

    public final void a(Graphics graphics, Image image, int n2, int n3, int n4, int n5) {
        if (n5 == 1) {
            n2 += A;
            n3 += z;
        }
        n2 = y.a(n2, image.getWidth(), n4);
        n3 = y.b(n3, image.getHeight(), n4);
        graphics.drawImage(image, n2, n3, 20);
    }

    public final void a(Graphics graphics, Image image, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        if (n2 + n4 > image.getWidth()) {
            n4 = image.getWidth() - n2;
        }
        if (n3 + n5 > image.getHeight()) {
            n5 = image.getHeight() - n3;
        }
        if (n4 <= 0) {
            return;
        }
        if (n5 <= 0) {
            return;
        }
        if (n9 == 1) {
            n6 += A;
            n7 += z;
        }
        int n10 = graphics.getClipX();
        int n11 = graphics.getClipY();
        int n12 = graphics.getClipWidth();
        int n13 = graphics.getClipHeight();
        n6 = y.a(n6, n4, n8);
        n7 = y.b(n7, n5, n8);
        graphics.setClip(n6, n7, n4, n5);
        graphics.drawImage(image, n6 - n2, n7 - n3, 20);
        graphics.setClip(n10, n11, n12, n13);
    }

    public final void a(Graphics graphics, Image image, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        if (n4 < 0) {
            n4 = image.getWidth();
        }
        if (n5 < 0) {
            n5 = image.getHeight();
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        if (n2 + n4 > image.getWidth()) {
            n4 = image.getWidth() - n2;
        }
        if (n3 + n5 > image.getHeight()) {
            n5 = image.getHeight() - n3;
        }
        if (n4 <= 0) {
            return;
        }
        if (n5 <= 0) {
            return;
        }
        int n11 = n4;
        int n12 = n5;
        if (n6 == 5 || n6 == 6) {
            n11 = n5;
            n12 = n4;
        }
        if (n10 == 1) {
            n7 += A;
            n8 += z;
        }
        n7 = y.a(n7, n11, n9);
        n8 = y.b(n8, n12, n9);
        graphics.drawRegion(image, n2, n3, n4, n5, n6, n7, n8, 20);
    }

    public final void a(Graphics graphics, String string, int n2, int n3, int n4, int n5) {
        if (n5 == 1) {
            n2 += A;
            n3 += z;
        }
        n2 = y.a(n2, h.stringWidth(string), n4);
        n3 = y.b(n3, k, n4);
        graphics.drawString(string, n2, n3, 20);
    }

    public void a(Graphics graphics, Image image) {
        this.a(graphics, 0);
        this.a(graphics, 0, 0, b.q, b.c, 17, 0);
        this.a(graphics, b.b, 0, b.q, b.c, 33, 0);
        this.a(graphics, 0, 0, b.b, b.o, 17, 0);
        this.a(graphics, 0, b.c, b.b, b.o + 1, 18, 0);
        if (image != null) {
            this.a(graphics, image, b.q, b.o, 18, 0);
            this.a(graphics, image, b.q, b.c - b.o, 17, 0);
        }
    }

    public void a(String[] stringArray, int[] nArray, int[] nArray2, int[] nArray3) {
        try {
            this.g = new f();
            if (this.g == null) {
                b.a(null);
                return;
            }
            this.g.a(stringArray, nArray, nArray2, nArray3, null);
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                this.c();
            }
            this.a(false);
            this.w = -1;
            this.j = -1;
            this.y = -1;
        }
        catch (Exception exception) {
            b.a(null);
        }
    }

    public final int c() {
        int n2 = 0;
        try {
            n2 = this.g.a();
        }
        catch (Exception exception) {
            b.a(null);
        }
        return n2;
    }

    public void a(int n2) {
        if (this.w == -1) {
            this.w = n2;
        } else {
            int n3 = (n2 & 0xF00) >> 8;
            int n4 = (this.w & 0xF00) >> 8;
            if (n3 <= n4) {
                this.w = n2;
            }
        }
    }

    public void a() {
        this.w = -1;
    }

    public void f() {
        if (this.j() && this.w != -1) {
            int n2 = this.w;
            int n3 = (n2 & 0xFF) >> 0;
            int n4 = (n2 & 0x1000) >> 12;
            this.n();
            this.g.a(n3, true);
            this.j = -1;
            if (n4 == 0) {
                this.j = n2;
            }
        }
        this.w = -1;
    }

    public void n() {
        this.g.b();
        this.w = -1;
        this.j = -1;
    }

    public void p() {
        if (this.j >= 0) {
            this.y = this.j;
        }
        this.w = -1;
        this.g.b();
    }

    public void o() {
        if (this.y >= 0) {
            this.a(this.y);
            this.y = -1;
        }
    }

    public void a(boolean bl) {
        this.D = bl;
        if (!this.D) {
            this.n();
        }
        this.g.a(bl, null);
    }

    public final boolean j() {
        return this.D;
    }

    public int h(int n2) {
        return n2 * this.s / this.r;
    }
}

