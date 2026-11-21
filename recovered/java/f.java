/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.media.Manager
 */
import java.io.InputStream;
import javax.microedition.media.Manager;

public class f {
    protected int e = 2;
    protected int[] h;
    protected int[] k;
    protected int[] j;
    private boolean[] i;
    private String[] d;
    protected boolean[] b;
    protected boolean a = false;
    protected d g;
    protected d f;
    boolean c = false;

    public void a(Object object, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4) throws IllegalArgumentException {
        int n2;
        if (!(object instanceof String[])) {
            throw new IllegalArgumentException("soundSource is not String array");
        }
        this.d = (String[])object;
        this.j = nArray;
        this.h = nArray2;
        if (nArray != null && this.d.length != nArray.length || nArray2 != null && this.d.length != nArray2.length || nArray3 != null && this.d.length != nArray3.length) {
            throw new IllegalArgumentException("loadSoundsByName: lengths of arrays do not match");
        }
        if (nArray2 == null) {
            this.h = new int[this.d.length];
        }
        if (nArray == null) {
            this.j = new int[this.d.length];
            for (n2 = this.j.length - 1; n2 >= 0; --n2) {
                this.j[n2] = -1;
            }
        }
        this.k = nArray3;
        if (nArray3 == null) {
            this.k = new int[this.d.length];
            for (n2 = this.k.length - 1; n2 >= 0; --n2) {
                this.k[n2] = 1;
            }
        }
        this.b = new boolean[this.d.length];
        this.g = new d(this);
        this.f = new d(this);
        m m2 = null;
        for (n2 = 2; n2 >= 0; --n2) {
            m2 = new m(this);
            this.f.a(m2);
        }
        this.i = new boolean[this.d.length];
    }

    public int a() {
        if (!this.c) {
            this.c = true;
            return this.d.length;
        }
        return 0;
    }

    protected boolean a(int n2, m m2) {
        String string;
        String string2 = this.d[n2];
        String string3 = string2.substring(string2.lastIndexOf(46)).toLowerCase();
        if (string3.equals(".mid")) {
            string = "audio/midi";
        } else if (string3.equals(".mp3")) {
            string = "audio/mpeg";
        } else if (string3.equals(".amr")) {
            string = "audio/amr";
        } else if (string3.equals(".wav")) {
            string = "audio/wav";
        } else {
            throw new IllegalArgumentException("Unsupported sound type: " + string3);
        }
        try {
            m2.e = Manager.createPlayer((InputStream)this.getClass().getResourceAsStream(string2), (String)string);
            m2.b = n2;
            if (this.k[n2] != 0) {
                m2.e.setLoopCount(this.k[n2]);
            } else {
                m2.e.setLoopCount(-1);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.d[n2] = null;
        }
        catch (Exception exception) {
            // empty catch block
        }
        return m2.e != null;
    }

    public void a(int n2, boolean bl) {
        if (this.j[n2] == -2 || this.d[n2] == null) {
            return;
        }
        m m2 = null;
        m m3 = null;
        int n3 = this.j[n2] == -1 ? this.e : 1;
        m m4 = this.g.a();
        while (m4 != null) {
            if (this.j[m4.b] == this.j[n2] && m4.e.getState() == 400) {
                --n3;
                if (this.h[m4.b] <= this.h[n2]) {
                    m2 = m4;
                }
                if (m2 == null && n3 <= 0) {
                    return;
                }
            }
            if (m4.b == n2) {
                m3 = m4;
            }
            if (m2 != null && m3 != null) break;
            m4 = m4.d;
        }
        if (m3 != null) {
            this.g.c(m3);
        }
        if (m3 == null) {
            m3 = this.f.c();
            if (m3 == null) {
                m4 = this.g.b();
                while (m4 != null) {
                    if (m4.e.getState() != 400) {
                        m3 = this.g.c(m4);
                        break;
                    }
                    m4 = m4.a;
                }
                if (m3 == null) {
                    m3 = this.g.c(m2);
                    m2 = null;
                }
                m3.e.close();
                m3.e = null;
            }
            if (!this.a(n2, m3)) {
                this.f.a(m3);
                return;
            }
        }
        if (m2 != null && (m2 != m3 || bl)) {
            try {
                m2.e.stop();
                m2.e.setMediaTime(0L);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (m3.e.getState() == 400) {
            this.g.b(m3);
            return;
        }
        m3.c = false;
        if (this.b[n2]) {
            try {
                m3.e.start();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        this.g.b(m3);
    }

    public void a(boolean bl, int[] nArray) {
        if (nArray == null) {
            for (int i2 = this.b.length - 1; i2 >= 0; --i2) {
                this.b[i2] = bl;
            }
        } else {
            for (int i3 = nArray.length - 1; i3 >= 0; --i3) {
                if (nArray[i3] < 0 || nArray[i3] >= this.d.length || this.d[nArray[i3]] == null) continue;
                this.b[nArray[i3]] = bl;
            }
        }
    }

    public void b() {
        m m2 = this.g.a();
        while (m2 != null) {
            try {
                m2.e.stop();
                m2.e.setMediaTime(0L);
                m2.c = false;
            }
            catch (Exception exception) {
                // empty catch block
            }
            m2 = m2.d;
        }
    }
}

