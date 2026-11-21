/*
 * Decompiled with CFR 0.152.
 */
import java.util.Vector;

public class w {
    static String r;
    static int z;
    static int s;
    protected String u;
    protected String y;
    public String[] q;
    public String[] C;
    public String[] a;
    public String[] n;
    public String[] v;
    public String[] A;
    public String[] l;
    public String[] B;
    public String[] w;
    public String[] m;
    public String[] b;
    public String[] k;
    public String[] o;
    public String[] t;
    public String[] d;
    public String[] i;
    public String[] c;
    public String[] j;
    public String[] e;
    public String[] x;
    public String[] f;
    public String[] h;
    public String[] p;
    public static final String[] g;

    public String a() {
        return this.u;
    }

    public int c(String string) {
        z = 0;
        String string2 = "";
        for (int i2 = 0; i2 < g.length; ++i2) {
            int n2 = g[i2].indexOf(45);
            if (n2 == -1) {
                n2 = g[i2].length();
            }
            string2 = g[i2].substring(0, n2).toLowerCase();
            if (string.toLowerCase().indexOf(string2) == -1) continue;
            ++z;
        }
        return z;
    }

    public boolean a(String string) {
        return this.u.equals(string.toLowerCase());
    }

    static String[] b(String string) {
        if (string == null) {
            return null;
        }
        int n2 = -1;
        int n3 = 1;
        while (true) {
            ++n2;
            if ((n2 = string.indexOf(64, n2)) == -1) break;
            ++n3;
        }
        String[] stringArray = new String[n3];
        n2 = 0;
        for (int i2 = 0; i2 < n3 - 1; ++i2) {
            int n4 = n2;
            n2 = string.indexOf(64, n2);
            stringArray[i2] = string.substring(n4, n2);
            ++n2;
        }
        stringArray[n3 - 1] = string.substring(n2);
        return stringArray;
    }

    public static String[] a(String[] stringArray, int n2, y y2) {
        int n3;
        Vector<String> vector = new Vector<String>(0, 1);
        for (n3 = 0; n3 < stringArray.length; ++n3) {
            boolean bl = false;
            String string = stringArray[n3].indexOf("%C%") != 0 ? stringArray[n3] : stringArray[n3].substring("%C%".length());
            string = string.trim();
            String string2 = "";
            while (string.indexOf("%I%") == 0) {
                string = string.substring("%I%".length());
                string2 = string2 + " ";
            }
            string = string2 + string;
            while (!bl) {
                boolean bl2;
                int n4;
                block18: {
                    int n5;
                    int n6;
                    block17: {
                        n4 = -1;
                        bl2 = false;
                        if (s == 0) {
                            n6 = string.indexOf(" ", string2.length());
                            if (n6 == -1) {
                                n6 = string.length();
                            }
                            if (y.h.stringWidth(string.substring(0, n6)) > n2) {
                                bl2 = true;
                            }
                        }
                        if (s != 0 || bl2) break block17;
                        if (y.h.stringWidth(string) <= n2 || string.indexOf(" ", 0) == -1) break block18;
                        n6 = 0;
                        n5 = 0;
                        while (n6 == 0) {
                            block20: {
                                int n7;
                                block19: {
                                    n7 = n5 - 1;
                                    if ((n5 = string.indexOf(" ", n5)) == -1) break block19;
                                    if (y.h.stringWidth(string.substring(0, n5)) <= n2) break block20;
                                }
                                n6 = 1;
                                n4 = n7 != -1 ? n7 : n5;
                                continue;
                            }
                            ++n5;
                        }
                        break block18;
                    }
                    if (y.h.stringWidth(string) > n2) {
                        n6 = 0;
                        n5 = 0;
                        while (n6 == 0) {
                            if (++n5 <= string.length()) {
                                if (y.h.stringWidth(string.substring(0, n5)) <= n2) continue;
                            }
                            n6 = 1;
                            n4 = n5 > string.length() ? -1 : n5 - 1;
                        }
                    }
                }
                if (n4 == -1) {
                    bl = true;
                    vector.addElement((stringArray[n3].indexOf("%C%") != 0 ? "" : "%C%") + string);
                    continue;
                }
                vector.addElement((stringArray[n3].indexOf("%C%") != 0 ? "" : "%C%") + string.substring(0, n4));
                if (s == 0 && !bl2) {
                    string = string2 + string.substring(n4 + 1);
                    continue;
                }
                string = string2 + string.substring(n4);
            }
        }
        stringArray = new String[vector.size()];
        for (n3 = 0; n3 < vector.size(); ++n3) {
            stringArray[n3] = (String)vector.elementAt(n3);
        }
        vector = null;
        System.gc();
        return stringArray;
    }

    public w(String string) {
        if (string != null) {
            int n2 = string.indexOf(45);
            if (n2 != -1) {
                this.u = string.substring(0, n2).toLowerCase();
                this.y = (n2 = (string = string.substring(n2 + 1)).indexOf(45)) == -1 ? string : string.substring(n2 + 1);
            } else {
                this.u = string;
            }
        }
        n n3 = new n(this);
        n3.a();
        this.q = w.b(n3.a("Lang"));
        this.C = w.b(n3.a("Load"));
        this.h = w.b(n3.a("MCopyright"));
        this.a = new String[8];
        this.a[0] = n3.a("SSpace");
        this.a[1] = n3.a("SPlay");
        this.a[2] = n3.a("SQuit");
        this.a[3] = n3.a("SMenu");
        this.a[4] = n3.a("SBack");
        this.a[5] = n3.a("SOk");
        this.a[6] = n3.a("On");
        this.a[7] = n3.a("Off");
        this.n = new String[7];
        this.n[0] = n3.a("GMeter");
        this.n[1] = n3.a("GEat");
        this.n[2] = n3.a("GGame");
        this.n[3] = n3.a("GToilet");
        this.n[4] = n3.a("GGod");
        this.n[5] = n3.a("GHand");
        this.n[6] = n3.a("GLight");
        this.v = new String[1];
        this.v[0] = n3.a("MMenu");
        if (c.a(GameMain.m(), this.a()) == null) {
            this.A = new String[5];
        } else {
            this.A = new String[6];
            this.A[5] = c.a(GameMain.m(), this.a()).toUpperCase();
            if (this.A[5] == null) {
                this.A[5] = " ";
            }
        }
        this.A[0] = n3.a("MSet");
        this.A[1] = n3.a("MHelp");
        this.A[2] = n3.a("MAbout");
        this.A[3] = n3.a("MReset");
        this.A[4] = n3.a("MQuit");
        this.l = new String[1];
        this.l[0] = n3.a("MSet");
        this.B = new String[6];
        this.B[0] = n3.a("MSnd");
        this.B[1] = n3.a("MVib");
        this.B[2] = n3.a("MGuide");
        this.B[3] = n3.a("MColor");
        this.B[4] = n3.a("MLang");
        this.B[5] = n3.a("MBack");
        this.w = new String[2];
        this.w[0] = n3.a("Off");
        this.w[1] = n3.a("On");
        String string2 = n3.a("About");
        String string3 = "Tamagotchi Monster";
        String string4 = "1.0.0";
        try {
            string3 = GameMain.m().getAppProperty("MIDlet-Name");
            string4 = GameMain.m().getAppProperty("MIDlet-Version");
        }
        catch (Exception exception) {
            // empty catch block
        }
        String string5 = string3.substring("Tamagotchi".length()).trim();
        int n4 = -1;
        while (string2.indexOf("${MIDLET_NAME}") != -1) {
            n4 = string2.indexOf("${MIDLET_NAME}");
            string2 = string2.substring(0, n4) + string3 + string2.substring(n4 + "${MIDLET_NAME}".length());
        }
        n4 = -1;
        while (string2.indexOf("${MIDLET_VERSION}") != -1) {
            n4 = string2.indexOf("${MIDLET_VERSION}");
            string2 = string2.substring(0, n4) + string4 + string2.substring(n4 + "${MIDLET_VERSION}".length());
        }
        this.m = w.b(string2);
        this.b = w.b(n3.a("Wait"));
        this.k = new String[2];
        this.k[0] = n3.a("Yes");
        this.k[1] = n3.a("No");
        this.o = new String[1];
        this.o[0] = n3.a("Done");
        this.t = new String[1];
        this.t[0] = n3.a("Ok");
        this.d = new String[1];
        this.d[0] = n3.a("Pause");
        this.i = w.b(n3.a("Resume"));
        this.c = w.b(n3.a("Restart"));
        this.j = w.b(n3.a("Quit"));
        String string6 = n3.a("HOperate");
        String string7 = n3.a("SoundText");
        n4 = -1;
        while (string6.indexOf("${SOUND_TEXT}") != -1) {
            n4 = string6.indexOf("${SOUND_TEXT}");
            string6 = string6.substring(0, n4) + string7 + string6.substring(n4 + "${SOUND_TEXT}".length());
        }
        String string8 = n3.a("VibrateText");
        n4 = -1;
        while (string6.indexOf("${VIBRATION_TEXT}") != -1) {
            n4 = string6.indexOf("${VIBRATION_TEXT}");
            string6 = string6.substring(0, n4) + string8 + string6.substring(n4 + "${VIBRATION_TEXT}".length());
        }
        n4 = -1;
        while (string6.indexOf("${MIDLET_NAME}") != -1) {
            n4 = string6.indexOf("${MIDLET_NAME}");
            string6 = string6.substring(0, n4) + string3 + string6.substring(n4 + "${MIDLET_NAME}".length());
        }
        n4 = -1;
        while (string6.indexOf("${MONSTER_TEXT}") != -1) {
            n4 = string6.indexOf("${MONSTER_TEXT}");
            string6 = string6.substring(0, n4) + string5 + string6.substring(n4 + "${MONSTER_TEXT}".length());
        }
        this.e = w.b(string6);
        String string9 = n3.a("HPlay");
        n4 = -1;
        while (string9.indexOf("${MIDLET_NAME}") != -1) {
            n4 = string9.indexOf("${MIDLET_NAME}");
            string9 = string9.substring(0, n4) + string3 + string9.substring(n4 + "${MIDLET_NAME}".length());
        }
        n4 = -1;
        while (string9.indexOf("${MONSTER_TEXT}") != -1) {
            n4 = string9.indexOf("${MONSTER_TEXT}");
            string9 = string9.substring(0, n4) + string5 + string9.substring(n4 + "${MONSTER_TEXT}".length());
        }
        this.x = w.b(string9);
        String string10 = n3.a("HCare");
        n4 = -1;
        while (string10.indexOf("${MIDLET_NAME}") != -1) {
            n4 = string10.indexOf("${MIDLET_NAME}");
            string10 = string10.substring(0, n4) + string3 + string10.substring(n4 + "${MIDLET_NAME}".length());
        }
        n4 = -1;
        while (string10.indexOf("${MONSTER_TEXT}") != -1) {
            n4 = string10.indexOf("${MONSTER_TEXT}");
            string10 = string10.substring(0, n4) + string5 + string10.substring(n4 + "${MONSTER_TEXT}".length());
        }
        this.f = w.b(string10);
        this.p = new String[1];
        this.p[0] = this.B[0].replace(':', ' ').trim();
        n3 = null;
    }

    static {
        z = 0;
        g = new String[]{"en-en", "es-es", "fr-fr", "de-de", "it-it"};
    }
}

