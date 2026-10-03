package com.oplus.aiunit.vision;

import com.oppo.bluetooth.btnet.bluetoothproxyserver.constants.RequestMethod;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class duf extends rpi {
    public RequestMethod d;
    public String e;

    public duf(String str) {
        if (z4j.b(str)) {
            String strTrim = str.trim();
            int iIndexOf = strTrim.indexOf(" ");
            int iLastIndexOf = strTrim.lastIndexOf(" ");
            if (iIndexOf < 0 || iLastIndexOf < 0) {
                return;
            }
            g((RequestMethod) d(RequestMethod.class, strTrim.substring(0, iIndexOf).trim().toUpperCase()));
            h(strTrim.substring(iIndexOf, iLastIndexOf).trim());
            String[] strArrSplit = strTrim.substring(iLastIndexOf).trim().split("/");
            super.c(strArrSplit[0]);
            String[] strArrSplit2 = strArrSplit[1].split("\\.");
            super.a(Integer.parseInt(strArrSplit2[0]));
            super.b(Integer.parseInt(strArrSplit2[1]));
        }
    }

    public static <E extends Enum<E>> E d(Class<E> cls, String str) {
        if (str == null) {
            return null;
        }
        try {
            return (E) Enum.valueOf(cls, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public RequestMethod e() {
        return this.d;
    }

    public String f() {
        return this.e;
    }

    public void g(RequestMethod requestMethod) {
        this.d = requestMethod;
    }

    public void h(String str) {
        this.e = str;
    }

    public String toString() {
        return String.format("%s %s %s/%s.%s", this.d, this.e, this.a, Integer.valueOf(this.b), Integer.valueOf(this.c));
    }
}
