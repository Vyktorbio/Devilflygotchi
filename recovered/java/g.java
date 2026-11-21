/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;

public class g {
    private ab[] b = null;
    private byte[] a = null;
    private int c = 0;

    public void a(int n2, int n3, int n4, int n5) {
        this.b[n2].a(n3, n4, n5);
    }

    public void a(int n2) {
        this.b[n2].b();
    }

    public int b(int n2, int n3) {
        return this.b[n2].b(n3);
    }

    public int c(int n2) {
        return this.b[n2].c();
    }

    public int a(int n2, int n3) {
        return this.b[n2].a(n3);
    }

    public boolean b(int n2) {
        this.c = n2;
        this.b = this.b();
        if (this.b == null) {
            return false;
        }
        this.d();
        return true;
    }

    private ab[] b() {
        ab[] abArray = new ab[this.c];
        if (abArray == null) {
            return null;
        }
        for (int i2 = 0; i2 < this.c; ++i2) {
            abArray[i2] = new ab();
            if (abArray[i2] != null) continue;
            return null;
        }
        return abArray;
    }

    public void d() {
        this.a = null;
        this.a = this.a();
    }

    public void c() {
        this.a(this.a);
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
                this.b[i2].b(((DataInputStream)filterInputStream).readInt());
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
                ((DataOutputStream)filterOutputStream).writeInt(this.b[i2].c());
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

