/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.lcdui.Graphics
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.midlet.MIDlet;

public abstract class a
extends MIDlet {
    public static a aN = null;
    protected b aX = null;
    private boolean aa;
    private boolean aH;
    private boolean al;
    private boolean av;
    private int k;

    public static a m() {
        return aN;
    }

    public a() {
        aN = this;
        this.e(false);
        this.c(false);
        this.d(0);
        this.aX = new b(-1, -1);
        this.aX.a(this);
        this.A();
    }

    public final void c() {
        this.e(true);
        Display.getDisplay((MIDlet)this).setCurrent((Displayable)this.aX);
        Thread thread = new Thread(this.aX);
        thread.start();
    }

    public final void U() {
        this.c(true);
        this.d();
    }

    public void P() {
    }

    public void d() {
    }

    public void e(boolean bl) {
        this.aa = bl;
    }

    public void c(boolean bl) {
        this.aH = bl;
    }

    public void d(boolean bl) {
        this.al = bl;
    }

    public void b(boolean bl) {
        this.av = bl;
    }

    public void d(int n2) {
        this.k = n2;
    }

    public boolean j() {
        return this.aH;
    }

    public boolean C() {
        return this.av;
    }

    public int B() {
        return this.k;
    }

    public abstract void A();

    public abstract void G();

    public abstract void y();

    public abstract void g(Graphics var1);

    public final void destroyApp(boolean bl) {
        this.b(true);
        if (!this.al) {
            this.P();
        }
    }

    public final void pauseApp() {
        this.d(1);
    }

    public final void startApp() {
        if (!this.aa) {
            this.c();
        } else {
            this.U();
        }
    }
}

