package com.oplus.aiunit.vision;

import java.util.UUID;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class wjk {
    public static final int DEFAULT_SIZE = 20;
    public static final UUID UUID_CHARACTERISTIC_READ;
    public static final UUID UUID_CHARACTERISTIC_WRITE;
    public static final UUID UUID_FILE_CHARACTERISTIC_READ;
    public static final UUID UUID_FILE_CHARACTERISTIC_WRITE;
    public static final UUID UUID_FILE_SERVICE;
    public static final UUID UUID_SERVICE;
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static int i;
    public static int j;
    public static UUID k;
    public static UUID l;
    public static UUID m;
    public static UUID n;
    public static UUID o;
    public static UUID p;
    public static UUID q;
    public static UUID r;
    public static UUID[] s;
    public static UUID[] t;
    public static UUID[] u;
    public static UUID[] v;

    static {
        UUID uuidFromString = UUID.fromString("00002760-08C2-11E1-9073-0E8AC72E1011");
        UUID_SERVICE = uuidFromString;
        UUID uuidFromString2 = UUID.fromString("00002760-08C2-11E1-9073-0E8AC72E0011");
        UUID_CHARACTERISTIC_READ = uuidFromString2;
        UUID uuidFromString3 = UUID.fromString("00002760-08C2-11E1-9073-0E8AC72E0012");
        UUID_CHARACTERISTIC_WRITE = uuidFromString3;
        UUID uuidFromString4 = UUID.fromString("00002760-08C2-11E1-9073-0E8AC72E1012");
        UUID_FILE_SERVICE = uuidFromString4;
        UUID uuidFromString5 = UUID.fromString("00002760-08C2-11E1-9073-0E8AC72E0014");
        UUID_FILE_CHARACTERISTIC_READ = uuidFromString5;
        UUID uuidFromString6 = UUID.fromString("00002760-08C2-11E1-9073-0E8AC72E0015");
        UUID_FILE_CHARACTERISTIC_WRITE = uuidFromString6;
        String string = uuidFromString.toString();
        a = string;
        String string2 = uuidFromString2.toString();
        b = string2;
        String string3 = uuidFromString3.toString();
        c = string3;
        String string4 = uuidFromString3.toString();
        d = string4;
        String string5 = uuidFromString4.toString();
        e = string5;
        String string6 = uuidFromString5.toString();
        f = string6;
        String string7 = uuidFromString6.toString();
        g = string7;
        String string8 = uuidFromString6.toString();
        h = string8;
        i = -1;
        j = 20;
        k = UUID.fromString(string);
        l = UUID.fromString(string5);
        m = UUID.fromString(string2);
        n = UUID.fromString(string3);
        o = UUID.fromString(string4);
        p = UUID.fromString(string6);
        q = UUID.fromString(string7);
        r = UUID.fromString(string8);
        s = new UUID[]{UUID.fromString(string)};
        t = new UUID[]{UUID.fromString(string2)};
        u = new UUID[]{UUID.fromString(string3)};
        v = new UUID[]{UUID.fromString(string4)};
    }

    public static void a(s48 s48Var) {
        j = 20;
        k = s[0];
        m = t[0];
        n = u[0];
        o = v[0];
    }

    public static UUID b() {
        return r;
    }

    public static UUID c() {
        return l;
    }

    public static UUID d() {
        return p;
    }

    public static UUID e() {
        return o;
    }

    public static UUID f() {
        return k;
    }

    public static UUID g() {
        return m;
    }
}
