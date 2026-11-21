/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Image
 */
import javax.microedition.lcdui.Image;

public class x
extends t {
    private int c;

    public static x a(Object[] objectArray, int n2, int n3, int n4, int n5) {
        x x2 = new x(objectArray, n2, n3, n4, n5);
        return x2;
    }

    public static x a(byte[] byArray, int n2, int n3, int n4, int n5) {
        x x2 = new x(byArray, n2, n3, n4, n5);
        return x2;
    }

    protected x(Object[] objectArray, int n2, int n3, int n4, int n5) {
        this.a(objectArray, n3, n4, n5);
        this.c = n2;
    }

    protected x(byte[] byArray, int n2, int n3, int n4, int n5) {
        this.a(byArray, n3, n4, n5);
        this.c = n2;
    }

    protected void a(Object object, int n2, byte[] byArray, int n3, int n4) {
        block11: {
            try {
                o[] oArray;
                if (this.c == 0) {
                    Image[] imageArray = (Image[])object;
                    try {
                        if (imageArray[n2] == null) {
                            imageArray[n2] = Image.createImage((byte[])byArray, (int)n3, (int)n4);
                        }
                        break block11;
                    }
                    catch (Exception exception) {}
                    break block11;
                }
                if (this.c == 1) {
                    byte[] byArray2 = (byte[])object;
                    if (byArray2 != null) {
                        for (int i2 = 0; i2 < n4; ++i2) {
                            byArray2[n2 + i2] = byArray[n3 + i2];
                        }
                    }
                } else if (this.c == 2 && (oArray = (o[])object)[n2] == null) {
                    oArray[n2] = new o();
                    oArray[n2].a(byArray);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }
}

