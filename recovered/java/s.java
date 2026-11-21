/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class s {
    private DataInputStream c;
    private int b;
    private int[] d;
    private int a;

    s(InputStream inputStream) throws IOException {
        this.c = new DataInputStream(inputStream);
        this.b = this.c.readShort();
        this.d = new int[this.b + 1];
        byte[] byArray = new byte[this.b * 4];
        this.c.read(byArray, 0, this.b * 4);
        for (int i2 = 0; i2 < this.b; ++i2) {
            this.d[i2] = (byArray[i2 * 4 + 0] & 0xFF) << 24 | (byArray[i2 * 4 + 1] & 0xFF) << 16 | (byArray[i2 * 4 + 2] & 0xFF) << 8 | (byArray[i2 * 4 + 3] & 0xFF) << 0;
        }
        byArray = null;
        this.d[this.b] = this.c.readInt();
        this.a = 0;
    }

    public aa a() throws IOException {
        if (this.a >= this.b) {
            return null;
        }
        aa aa2 = new aa();
        aa2.b = this.d[this.a + 1] - this.d[this.a];
        aa2.a = new byte[aa2.b];
        int n2 = 0;
        int n3 = 0;
        while ((n2 = this.c.read(aa2.a, n3, aa2.b - n3)) != -1 && (n3 += n2) < aa2.b) {
        }
        ++this.a;
        return aa2;
    }

    public int a(int n2) throws IOException {
        int n3;
        if (this.a >= this.b) {
            return 0;
        }
        if (this.a + n2 >= this.b) {
            n2 = this.b - this.a;
        }
        if ((n3 = this.d[this.a + n2] - this.d[this.a]) < 51200) {
            byte[] byArray = new byte[n3];
            this.c.read(byArray);
            byArray = null;
        } else {
            int n4 = n3 / 51200;
            int n5 = n3 % 51200;
            byte[] byArray = new byte[51200];
            for (int i2 = 0; i2 < n4; ++i2) {
                this.c.read(byArray);
            }
            if (n5 != 0) {
                this.c.read(byArray, 0, n5);
            }
            byArray = null;
        }
        this.a += n2;
        return n3;
    }

    public void b() throws IOException {
        this.c.close();
    }
}

