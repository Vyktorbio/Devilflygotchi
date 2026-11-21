/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;

public class z {
    private e[] a = null;
    private byte[] b = null;
    private int c = 0;

    public void a(int n2, long l2, int n3) {
        this.a[n2].a(l2, n3);
    }

    public void a(int n2, long l2, long l3) {
        this.a[n2].a(l2, l3);
    }

    public void a(int n2) {
        this.a[n2].f();
    }

    public void d(int n2, long l2) {
        this.a[n2].d(l2);
    }

    public void c(int n2, long l2) {
        this.a[n2].c(l2);
    }

    public void a(int n2, long l2) {
        this.a[n2].a(l2);
    }

    public void b(int n2, long l2) {
        this.a[n2].b(l2);
    }

    public long e(int n2) {
        return this.a[n2].g();
    }

    public boolean e(int n2, long l2) {
        return this.a[n2].e(l2);
    }

    public boolean b(int n2) {
        return this.a[n2].b();
    }

    public boolean d(int n2) {
        return this.a[n2].d();
    }

    public boolean c(int n2) {
        this.c = n2;
        this.a = this.b();
        if (this.a == null) {
            return false;
        }
        this.d();
        return true;
    }

    private e[] b() {
        e[] eArray = new e[this.c];
        if (eArray == null) {
            return null;
        }
        for (int i2 = 0; i2 < this.c; ++i2) {
            eArray[i2] = new e();
            if (eArray[i2] != null) continue;
            return null;
        }
        return eArray;
    }

    public void d() {
        this.b = null;
        this.b = this.a();
    }

    public void c() {
        this.a(this.b);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(byte[] byArray) {
        ByteArrayInputStream byteArrayInputStream = null;
        FilterInputStream filterInputStream = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(byArray);
            filterInputStream = new DataInputStream(byteArrayInputStream);
            for (int i2 = 0; i2 < this.c; ++i2) {
                long l2 = ((DataInputStream)filterInputStream).readLong();
                long l3 = ((DataInputStream)filterInputStream).readLong();
                long l4 = ((DataInputStream)filterInputStream).readLong();
                this.a[i2].f();
                if (l2 <= 0L) continue;
                this.a[i2].a(l2, l3);
                if (l4 <= 0L) continue;
                this.a[i2].d(l4);
            }
        }
        catch (Exception exception) {
        }
        finally {
            if (filterInputStream == null) {
                try {
                    filterInputStream.close();
                    filterInputStream = null;
                }
                catch (Exception exception) {}
            }
            if (byteArrayInputStream == null) {
                try {
                    byteArrayInputStream.close();
                    byteArrayInputStream = null;
                }
                catch (Exception exception) {}
            }
            System.gc();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream = null;
        FilterOutputStream filterOutputStream = null;
        byte[] byArray = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            filterOutputStream = new DataOutputStream(byteArrayOutputStream);
            for (int i2 = 0; i2 < this.c; ++i2) {
                ((DataOutputStream)filterOutputStream).writeLong(this.a[i2].c());
                ((DataOutputStream)filterOutputStream).writeLong(this.a[i2].e());
                ((DataOutputStream)filterOutputStream).writeLong(this.a[i2].a());
            }
            ((DataOutputStream)filterOutputStream).flush();
            byArray = byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            byArray = null;
        }
        finally {
            if (filterOutputStream == null) {
                try {
                    filterOutputStream.close();
                    filterOutputStream = null;
                }
                catch (Exception exception) {}
            }
            if (byteArrayOutputStream == null) {
                try {
                    byteArrayOutputStream.close();
                    byteArrayOutputStream = null;
                }
                catch (Exception exception) {}
            }
            System.gc();
        }
        return byArray;
    }
}

