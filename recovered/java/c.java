/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.lcdui.Canvas
 *  javax.microedition.lcdui.Display
 *  javax.microedition.lcdui.Displayable
 *  javax.microedition.midlet.MIDlet
 */
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDlet;

class c {
    public static MIDlet l;
    public static int k;
    public static int g;
    public static int d;
    public static int f;
    public static int j;
    public static int i;
    public static int c;
    public static String a;
    private j[] e;
    private Thread h;
    protected static final String[] b;

    public c(MIDlet mIDlet, int n2, int n3, int n4, int n5, int n6, int n7, int n8, String string) {
        k = n2;
        g = n3;
        d = n5;
        f = n6;
        j = n7;
        i = n8;
        c = n4;
        a = string;
        l = mIDlet;
        this.e = this.a(l);
    }

    public static String a(String string, int n2) {
        int n3 = 0;
        for (int i2 = 0; i2 < b.length; i2 += 5) {
            if (!b[i2].equals(string)) continue;
            n3 = i2;
            break;
        }
        return b[n3 + n2];
    }

    public static String a(int n2) {
        return c.a(a, n2);
    }

    public static String a(MIDlet mIDlet, String string) {
        String string2 = null;
        int n2 = 0;
        for (n2 = 0; n2 < 8 && (c.a(mIDlet, "Img" + n2, string) != null || c.a(mIDlet, "Desc" + n2, string) != null); ++n2) {
        }
        if (n2 > 0) {
            string2 = c.a(string, 1);
        }
        return string2;
    }

    private static String a(MIDlet mIDlet, String string, String string2) {
        String string3;
        if (string2 == null) {
            string2 = "NULL";
        }
        if ((string3 = mIDlet.getAppProperty("NAMCO-AD-" + string2.toUpperCase() + "-" + string)) == null) {
            string3 = mIDlet.getAppProperty("NAMCO-AD-" + string);
        }
        return string3;
    }

    private String a(String string) {
        String string2 = l.getAppProperty("NAMCO-AD-" + a.toUpperCase() + "-" + string);
        if (string2 == null) {
            string2 = l.getAppProperty("NAMCO-AD-" + string);
        }
        return string2;
    }

    public void a(Canvas canvas) {
        ac ac2 = new ac(this, this.e);
        Thread thread = new Thread(ac2);
        thread.start();
        while (thread.isAlive()) {
            try {
                Thread.yield();
                Thread.sleep(500L);
            }
            catch (InterruptedException interruptedException) {}
        }
        Display display = Display.getDisplay((MIDlet)l);
        display.setCurrent((Displayable)canvas);
    }

    private j[] a(MIDlet mIDlet) {
        j[] jArray = new j[8];
        int n2 = 0;
        for (n2 = 0; n2 < jArray.length; ++n2) {
            jArray[n2] = new j(this, null);
            jArray[n2].a = this.a("Img" + n2);
            jArray[n2].d = this.a("Desc" + n2);
            jArray[n2].b = this.a("URL" + n2);
            if (jArray[n2].a == null && jArray[n2].d == null) break;
        }
        j[] jArray2 = new j[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            jArray2[i2] = new j(this, null);
            jArray2[i2].a = jArray[i2].a;
            jArray2[i2].d = jArray[i2].d;
            jArray2[i2].b = jArray[i2].b;
        }
        return jArray2;
    }

    static Thread a(c c2) {
        return c2.h;
    }

    static Thread a(c c2, Thread thread) {
        c2.h = thread;
        return c2.h;
    }

    static {
        b = new String[]{"en", "Get More Games", "Get it", "Back", "A browser will be launched and the current game will exit.__Exiting the current game may lose current game progress.", "de", "Weitere Spiele", "Hol's dir", "Zur\u00fcck", "Das aktuelle Spiel wird beendet und ein Browser wird ge\u00f6ffnet.__Durch das Beenden des aktuellen Spiels geht der aktuelle Spielstand verloren!", "fr", "Plus de jeux", "T\u00e9l\u00e9charger", "Retour", "Un navigateur sera lanc\u00e9 et la partie en cours abandonn\u00e9e.__En quittant la partie en cours, la progression sera perdue.", "it", "Altri giochi", "Scarica", "Indietro", "Sar\u00e0 lanciato un browser e dovrai lasciare la partita in corso.__Se lasci la partita in corso, perderai i progressi di gioco.", "es", "M\u00e1s juegos", "Descargar", "Volver", "Si se inicia un buscador, saldr\u00e1s de la partida actual.__Es posible que al salir de la partida actual se pierda el progreso.", "nl", "Meer games", "Pak 'm", "Terug", "Een browservenster zal worden geopend en het huidige spel zal worden be\u00ebindigd.__Hierdoor kan mogelijk de voortgang in het huidige spel worden verloren.", "cs", "Stahuj v\u00edce her", "Stahuj", "Zpet", "Prohl\u00ed\u017eec bude nacten a aktu\u00e1ln\u00ed hra bude ukoncena.__Ukoncen\u00edm soucasn\u00e9 hry mu\u017eete ztratit dosavadn\u00ed prubeh hry."};
    }
}

