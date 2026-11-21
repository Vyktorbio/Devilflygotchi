/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Vector;

public class q {
    private String c;
    private int k = 0;
    private Vector j = null;
    private int a = 0;
    private int b = 0;
    boolean e = false;
    private int g = 0;
    s d;
    int f = 0;
    private boolean h = false;
    DataInputStream i;

    public void a(String string, int n2, int n3) {
        if (this.j == null) {
            this.j = new Vector(100);
            if (this.j == null) {
                this.h();
                return;
            }
        }
        this.c = string;
        this.k = n2;
        this.b = n3;
        this.a = 0;
        this.e = false;
        this.f = 0;
        if (this.b <= 0) {
            this.b = 1;
        }
    }

    public void a(t t2) {
        if (this.e) {
            return;
        }
        if (this.j == null) {
            this.h();
            return;
        }
        if (t2 == null) {
            this.h();
            return;
        }
        this.j.addElement(t2);
        this.g = this.j.size();
    }

    public boolean i() {
        if (this.e) {
            return true;
        }
        if (this.j == null) {
            return false;
        }
        if (this.a == 0) {
            this.g();
        }
        try {
            int n2 = this.j.size() / this.b;
            if (n2 < 1) {
                n2 = 1;
            }
            for (int i2 = 0; i2 < n2; ++i2) {
                t t2 = (t)this.j.elementAt(this.a);
                this.d.a(t2.f - this.f);
                for (int i3 = 0; i3 < t2.a; ++i3) {
                    aa aa2 = this.d.a();
                    if (aa2.b > 0) {
                        t2.a(aa2.a, 0, aa2.b);
                    }
                    aa2 = null;
                }
                ++this.a;
                this.f = t2.f + t2.a;
                if (this.j.size() > this.a) continue;
                this.b();
                return this.b == 1;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return false;
    }

    private void g() {
        this.a();
        try {
            this.i = this.c();
            this.d = new s(this.i);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public DataInputStream c() throws IOException {
        return new DataInputStream(this.f());
    }

    public InputStream f() throws IOException {
        InputStream inputStream = this.getClass().getResourceAsStream(this.c);
        if (inputStream == null) {
            throw new IOException();
        }
        return inputStream;
    }

    private void b() {
        try {
            this.d.b();
            this.d = null;
            this.i = null;
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.e = true;
        for (int i2 = this.j.size() - 1; i2 >= 0; --i2) {
            t t2 = (t)this.j.elementAt(i2);
            t2.a(null, 0, 0, 0);
        }
        this.j.removeAllElements();
        this.j = null;
        System.gc();
    }

    private void a() {
        for (int i2 = 0; i2 < this.j.size() - 1; ++i2) {
            for (int i3 = this.j.size() - 1; i3 > i2; --i3) {
                t t2 = (t)this.j.elementAt(i3);
                t t3 = (t)this.j.elementAt(i3 - 1);
                if (t2.f >= t3.f) continue;
                this.j.setElementAt(t3, i3);
                this.j.setElementAt(t2, i3 - 1);
            }
        }
    }

    public int e() {
        if (this.e) {
            return this.g;
        }
        if (this.j == null) {
            return 0;
        }
        return this.a;
    }

    public void h() {
        this.h = true;
    }

    public boolean d() {
        return this.h;
    }
}

