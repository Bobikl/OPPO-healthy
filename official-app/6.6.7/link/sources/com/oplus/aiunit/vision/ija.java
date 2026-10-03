package com.oplus.aiunit.vision;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class ija {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;

    static {
        String strB = abm.b("gxxg");
        a = strB;
        String strB2 = abm.b("zmidem");
        b = strB2;
        c = d14.POINT_REGEX + strB + "mobile.com";
        d = abm.b("&\u007fifqgd&kge");
        e = abm.b("&fmizem&kge&kf");
        f = d14.POINT_REGEX + strB2 + "mobile.com";
        g = d14.POINT_REGEX + strB + ".com";
        h = d14.POINT_REGEX + strB + ".cn";
        i = abm.b("&`mq|ixegja&kge");
        j = abm.b("&`mq|ix&kge");
        k = abm.b("&`mq|ix&kf");
        l = abm.b("&`mq|ix&kge&kf");
        m = abm.b("&nafrnaf&kge");
        n = abm.b("&cmcm&kf");
    }

    public static boolean a(String str) {
        return str.endsWith(e) || str.endsWith(c) || str.endsWith(f) || str.endsWith(d) || str.endsWith(g) || str.endsWith(h) || str.endsWith(i) || str.endsWith(j) || str.endsWith(k) || str.endsWith(l) || str.endsWith(m) || str.endsWith(n);
    }
}
