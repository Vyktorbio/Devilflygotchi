/*
 * Decompiled with CFR 0.152.
 */
import java.util.Calendar;
import java.util.Date;

public class k {
    private static Calendar c;
    private static long a;
    private static long b;

    public k() {
        c = null;
        a = 0L;
        b = 0L;
    }

    public static boolean a() {
        c = Calendar.getInstance();
        if (c == null) {
            return false;
        }
        k.b();
        return true;
    }

    public static void b() {
        k.b(System.currentTimeMillis());
    }

    public static void b(long l2) {
        b = a;
        a = l2;
        Date date = new Date();
        date.setTime(a);
        c.setTime(date);
    }

    public static long a(int n2, int n3, int n4) {
        int n5 = k.c();
        int n6 = k.f();
        int n7 = k.d();
        return k.a(n5, n6, n7, n2, n3, n4);
    }

    public static long a(long l2, int n2, int n3, int n4) {
        int n5 = k.e(l2);
        int n6 = k.c(l2);
        int n7 = k.a(l2);
        return k.a(n5, n6, n7, n2, n3, n4);
    }

    public static long a(int n2, int n3, int n4, int n5, int n6, int n7) {
        long l2 = 0L;
        if (n2 < n5) {
            l2 += (long)((n5 - n2) * 60 * 60) * 1000L;
        }
        if (n2 > n5 || n2 == n5 && (n3 > n6 || n3 == n6 && n4 >= n7)) {
            l2 += (long)((24 - (n2 - n5)) * 60 * 60) * 1000L;
        }
        l2 += (long)((n6 - n3) * 60) * 1000L;
        return l2 += (long)(n7 - n4) * 1000L;
    }

    private static Calendar d(long l2) {
        Date date = new Date();
        date.setTime(l2);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static long e() {
        return a;
    }

    public static long g() {
        return b;
    }

    public static int c() {
        return c.get(11);
    }

    public static int e(long l2) {
        Calendar calendar = k.d(l2);
        int n2 = calendar.get(11);
        calendar = null;
        return n2;
    }

    public static int f() {
        return c.get(12);
    }

    public static int c(long l2) {
        Calendar calendar = k.d(l2);
        int n2 = calendar.get(12);
        calendar = null;
        return n2;
    }

    public static int d() {
        return c.get(13);
    }

    public static int a(long l2) {
        Calendar calendar = k.d(l2);
        int n2 = calendar.get(13);
        calendar = null;
        return n2;
    }
}

