/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Command
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Font
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.lcdui.Image
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

public class b
extends Canvas
implements Runnable {
    private static a p;
    static int b;
    static int c;
    static int q;
    static int o;
    private volatile int h;
    private volatile int l;
    private volatile int i;
    public static boolean g;
    String[] s = new String[]{"", ""};
    Command[] t = new Command[]{null, null};
    public static boolean f;
    private static long j;
    private static long d;
    public static String a;
    public static long r;
    public static Exception e;
    boolean k = false;
    private boolean m = false;
    private Image n;

    protected void hideNotify() {
        p.d(1);
        p.y();
    }

    protected void showNotify() {
        p.U();
    }

    public b(int n2, int n3) {
        int n4 = this.getHeight();
        this.setFullScreenMode(true);
        long l2 = System.currentTimeMillis();
        while (n4 == this.getHeight() && System.currentTimeMillis() - l2 <= 5000L) {
        }
        b = this.getWidth();
        c = this.getHeight();
        if (n2 < 0) {
            n2 = b;
        }
        if (n3 < 0) {
            n3 = c;
        }
        q = 0;
        o = 0;
        if (b - n2 > 0) {
            q = (b - n2) / 2;
        }
        if (c - n3 > 0) {
            o = (c - n3) / 2;
        }
        this.a();
    }

    public void run() {
        long l2 = 0L;
        long l3 = System.currentTimeMillis();
        try {
            while (true) {
                if (!p.C()) {
                    p.G();
                }
                if (j <= l2) {
                    j = l2 + 1500L;
                    System.gc();
                }
                if (d <= l2) {
                    d += 250L;
                    g = true;
                }
                if (f) {
                    f = false;
                    c c2 = new c(GameMain.m(), -6, -7, 8, 1, 10, 1, 10, GameMain.n.a());
                    c2.a(this);
                }
                do {
                    Thread.yield();
                } while ((l2 = System.currentTimeMillis()) >= l3 && l2 <= l3 + 100L);
                l3 = l2;
            }
        }
        catch (Exception exception) {
            b.a(exception);
            while (r != -1L) {
                if (r > System.currentTimeMillis()) {
                    b.d();
                    continue;
                }
                this.repaint();
            }
            return;
        }
    }

    public void paint(Graphics graphics) {
        if (!g) {
            return;
        }
        g = false;
        if (!p.C()) {
            try {
                p.g(graphics);
            }
            catch (Exception exception) {
                b.a(exception);
            }
        }
        if (this.m) {
            graphics.setColor(0, 0, 0);
            graphics.setClip(0, 0, this.getWidth(), this.getHeight());
            graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
            if (this.n == null) {
                try {
                    this.n = Image.createImage((String)"/rotate_screen.png");
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            graphics.drawImage(this.n, this.getWidth() >> 1, this.getHeight() >> 1, 3);
        }
    }

    public void c() {
        this.repaint();
        this.serviceRepaints();
    }

    public static final void a(Exception exception) {
        p.d(true);
        e = exception;
        r = System.currentTimeMillis() + 10000L;
    }

    public static final void d() {
        p.destroyApp(false);
        p.notifyDestroyed();
    }

    public static void a(int n2) {
        Display.getDisplay((MIDlet)p).vibrate(n2 * 100);
    }

    public final int d(int n2) {
        return n2;
    }

    public void a() {
        this.l = -1;
        this.i = -1;
        this.h = 0;
    }

    public final int b() {
        return this.h;
    }

    public final int e() {
        int n2 = -1;
        if (this.i != -1) {
            n2 = this.i;
            this.i = -1;
        } else if (this.l != -1) {
            n2 = this.l;
            this.l = -1;
        }
        return n2;
    }

    public final Font c(int n2) {
        if (n2 == 0) {
            return Font.getDefaultFont();
        }
        if (n2 == 1) {
            return Font.getFont((int)0, (int)0, (int)8);
        }
        if (n2 == 2) {
            return Font.getFont((int)0, (int)0, (int)8);
        }
        if (n2 == 3) {
            return Font.getFont((int)0, (int)0, (int)0);
        }
        if (n2 == 4) {
            return Font.getFont((int)0, (int)0, (int)16);
        }
        return null;
    }

    public void a(a a2) {
        p = a2;
    }

    private int b(int n2) {
        int n3 = -1;
        int n4 = 0;
        switch (n2) {
            case -6: {
                return 21;
            }
            case -7: {
                return 22;
            }
            case 48: {
                return 0;
            }
            case 49: {
                return 1;
            }
            case 50: {
                return 2;
            }
            case 51: {
                return 3;
            }
            case 52: {
                return 4;
            }
            case 53: {
                return 5;
            }
            case 54: {
                return 6;
            }
            case 55: {
                return 7;
            }
            case 56: {
                return 8;
            }
            case 57: {
                return 9;
            }
            case 35: {
                return 11;
            }
            case 42: {
                return 10;
            }
        }
        try {
            n4 = super.getGameAction(n2);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (n4 != 0) {
            switch (n4) {
                case 8: {
                    return 20;
                }
                case 1: {
                    return 17;
                }
                case 6: {
                    return 19;
                }
                case 5: {
                    return 18;
                }
                case 2: {
                    return 16;
                }
            }
            return -1;
        }
        return -1;
    }

    public final synchronized void keyPressed(int n2) {
        g = true;
        if (this.m) {
            return;
        }
        int n3 = this.b(n2);
        this.h |= 1 << n3;
        this.l = n3;
    }

    public final synchronized void keyReleased(int n2) {
        if (this.m) {
            return;
        }
        int n3 = this.b(n2);
        this.h &= ~(1 << n3);
    }

    protected void sizeChanged(int n2, int n3) {
        b = n2;
        y.e = n2;
        c = n3;
        y.E = n3;
        if (n2 > n3) {
            this.m = true;
            this.hideNotify();
        } else {
            this.m = false;
            this.showNotify();
        }
        this.k = true;
    }

    static {
        g = true;
        j = 0L;
        d = 0L;
        a = "-1";
        r = -1L;
        e = null;
    }
}

