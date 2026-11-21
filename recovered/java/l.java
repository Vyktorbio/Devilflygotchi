/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.rms.RecordStore
 *  javax.microedition.rms.RecordStoreNotFoundException
 */
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreNotFoundException;

public class l {
    private b j;
    private String g;
    private int e;
    private int a;
    private int c;
    private int[] b;
    private byte[] f;
    private int d;
    private int i;
    private boolean h;

    public void a(b b2, String string, int n2) {
        this.h = false;
        this.j = b2;
        this.g = string;
        this.e = n2 + 1;
        this.a = 0;
        this.c = 0;
        this.b = new int[this.e];
        this.f = null;
        this.d = 0;
        this.i = 0;
        this.b(this.e - 1, 4);
    }

    public boolean b(int n2, int n3) {
        if (n2 >= 0 && n2 < this.e) {
            if (this.b[n2] > 0) {
                this.c -= this.b[n2];
            }
            this.b[n2] = n3;
            this.c += n3;
            this.f = new byte[this.c];
            return true;
        }
        return false;
    }

    public boolean f() {
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)this.g, (boolean)true);
            int n2 = recordStore.getNextRecordID();
            if (n2 > this.e) {
                int n3 = 0;
                for (int i2 = 0; i2 < n2 - 1; ++i2) {
                    recordStore.setRecord(i2 + 1, this.f, n3, this.b[i2]);
                    n3 += this.b[i2];
                }
            } else {
                int n4;
                int n5 = 0;
                for (n4 = 0; n4 < n2 - 1; ++n4) {
                    recordStore.setRecord(n4 + 1, this.f, n5, this.b[n4]);
                    n5 += this.b[n4];
                }
                while (n4 < this.e) {
                    recordStore.addRecord(this.f, n5, this.b[n4]);
                    n5 += this.b[n4];
                    ++n4;
                }
            }
            recordStore.closeRecordStore();
            recordStore = null;
            this.i = 0;
            return true;
        }
        catch (Exception exception) {
            b.a(null);
            this.h = true;
            return false;
        }
    }

    public boolean b() {
        if (this.i == 0) {
            return true;
        }
        try {
            int n2;
            RecordStore recordStore = RecordStore.openRecordStore((String)this.g, (boolean)true);
            int n3 = l.a(this.f, this.c - 4);
            for (n2 = 3; n2 >= 0; --n2) {
                this.f[this.c - 4 + n2] = (byte)(n3 >> n2 * 8);
            }
            this.i |= 1 << this.e - 1;
            int n4 = 0;
            for (n2 = 0; n2 < this.e; ++n2) {
                if ((this.i & 1 << n2) != 0) {
                    recordStore.setRecord(n2 + 1, this.f, n4, this.b[n2]);
                    this.i &= ~(1 << n2);
                }
                n4 += this.b[n2];
            }
            recordStore.closeRecordStore();
            recordStore = null;
            this.i = 0;
            return true;
        }
        catch (Exception exception) {
            b.a(null);
            this.h = true;
            return false;
        }
    }

    public boolean e() {
        if (this.i == 0) {
            return true;
        }
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)this.g, (boolean)false);
            int n2 = 0;
            for (int i2 = 0; i2 < this.e; ++i2) {
                int n3 = recordStore.getRecord(i2 + 1, this.f, n2);
                n2 += this.b[i2];
            }
            recordStore.closeRecordStore();
            recordStore = null;
            this.i = 0;
            return true;
        }
        catch (Exception exception) {
            b.a(null);
            this.h = true;
            return false;
        }
    }

    public boolean c() {
        boolean bl = false;
        try {
            RecordStore recordStore = RecordStore.openRecordStore((String)this.g, (boolean)false);
            if (recordStore.getNextRecordID() != this.e + 1) {
                bl = true;
            } else {
                for (int i2 = 0; i2 < this.e; ++i2) {
                    int n2 = recordStore.getRecordSize(i2 + 1);
                    if (recordStore.getRecordSize(i2 + 1) == this.b[i2]) continue;
                    bl = true;
                    break;
                }
            }
            recordStore.closeRecordStore();
            recordStore = null;
        }
        catch (RecordStoreNotFoundException recordStoreNotFoundException) {
            bl = true;
        }
        catch (Exception exception) {
            b.a(null);
            bl = true;
            this.h = true;
        }
        if (bl) {
            return false;
        }
        return this.g();
    }

    public boolean g() {
        this.i = (1 << this.e) - 1;
        if (!this.e()) {
            return false;
        }
        int n2 = l.a(this.f, this.c - 4);
        int n3 = 0;
        for (int i2 = 3; i2 >= 0; --i2) {
            n3 |= (this.f[this.c - 4 + i2] & 0xFF) << i2 * 8;
        }
        return n3 == n2;
    }

    public void a(int n2, int n3, int n4) {
        if (n2 < 0 && n2 >= this.e) {
            return;
        }
        int n5 = 0;
        int n6 = this.b[0];
        for (int i2 = 0; i2 < n2; ++i2) {
            n5 += this.b[i2];
            n6 += this.b[i2 + 1];
        }
        if (n3 == 1) {
            if (this.d + n4 < n5 && this.d + n4 >= n6) {
                return;
            }
            this.d += n4;
            this.a = n2;
        } else if (n3 == 0) {
            if (n5 + n4 < n5 && n5 + n4 >= n6) {
                return;
            }
            this.d = n5 + n4;
            this.a = n2;
        } else if (n3 == 2) {
            if (n6 + n4 < n5 && n6 + n4 >= n6) {
                return;
            }
            this.d = n6 + n4;
            this.a = n2;
        }
    }

    public int b(int n2) {
        int n3 = 0;
        int n4 = (n2 - 1) * 8;
        int n5 = 0;
        while (n5 < n2) {
            n3 |= (this.f[this.d + n5] & 0xFF) << n4;
            ++n5;
            n4 -= 8;
        }
        this.d += n2;
        return n3;
    }

    public void a(int n2, int n3) {
        int n4 = (n3 - 1) * 8;
        int n5 = 0;
        while (n5 < n3) {
            this.f[this.d + n5] = (byte)(n2 >> n4);
            ++n5;
            n4 -= 8;
        }
        this.d += n3;
        this.i |= 1 << this.a;
    }

    public int a() {
        return this.b(4);
    }

    public void b(byte[] byArray, int n2, int n3) {
        for (int i2 = 0; i2 < n3; ++i2) {
            byArray[n2 + i2] = (byte)this.b(1);
        }
    }

    public void a(int n2) {
        this.a(n2, 4);
    }

    public void a(byte[] byArray, int n2, int n3) {
        for (int i2 = 0; i2 < n3; ++i2) {
            this.a(byArray[n2 + i2], 1);
        }
    }

    public static int a(byte[] byArray, int n2) {
        int n3;
        int n4;
        int[] nArray = new int[256];
        for (n4 = 0; n4 < 256; ++n4) {
            n3 = n4;
            for (int i2 = 0; i2 < 8; ++i2) {
                if ((n3 & 1) != 0) {
                    n3 = 0xEDB88320 ^ n3 >> 1;
                    continue;
                }
                n3 >>= 1;
            }
            nArray[n4] = n3;
        }
        n4 = -1;
        for (n3 = 0; n3 < n2; ++n3) {
            n4 = nArray[(n4 ^ byArray[n3]) & 0xFF] ^ n4 >> 8;
        }
        nArray = null;
        return ~n4;
    }

    public boolean d() {
        return this.h;
    }
}

