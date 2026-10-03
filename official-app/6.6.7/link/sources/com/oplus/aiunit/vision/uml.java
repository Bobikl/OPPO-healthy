package com.oplus.aiunit.vision;

import androidx.annotation.Size;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class uml {
    public static boolean a = true;
    public static String b = "WLog";
    public static a c = new hhd();

    public interface a {
        void println(int i, String str, String str2);

        void println(int i, String str, String str2, Throwable th);
    }

    public static void a(String str, String str2) {
        a aVar = c;
        if (aVar != null) {
            aVar.println(3, b, str + " " + str2);
        }
    }

    public static void b(String str, String str2) {
        a aVar = c;
        if (aVar != null) {
            aVar.println(6, b, str + " " + str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        a aVar = c;
        if (aVar != null) {
            aVar.println(6, b, str + " " + str2, th);
        }
    }

    public static void d(String str, String str2) {
        a aVar = c;
        if (aVar != null) {
            aVar.println(4, b, str + " " + str2);
        }
    }

    public static void e() {
        f("A");
    }

    public static void f(String str) {
        h(str, new hhd());
    }

    public static boolean g() {
        return a;
    }

    public static void h(String str, a aVar) {
        b = "WLog" + str;
        c = aVar;
    }

    public static void i(@Size(max = 11) String str, String str2, byte[] bArr) throws IllegalArgumentException {
        if (!a) {
            return;
        }
        String strSubstring = b + d14.POINT_REGEX + str;
        int i = 0;
        if (strSubstring.length() > 23) {
            m8b.b(b, "TAG over length " + strSubstring);
            strSubstring = strSubstring.substring(0, 23);
        }
        if (!m8b.i(strSubstring, 3)) {
            return;
        }
        if (bArr == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" null");
            return;
        }
        String strA = if8.a(bArr);
        int length = strA.length();
        while (true) {
            int iMin = Math.min(length - i, 2000) + i;
            String strSubstring2 = strA.substring(i, iMin);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(strSubstring2);
            if (iMin >= length) {
                return;
            } else {
                i = iMin;
            }
        }
    }

    public static void j(String str, String str2) {
        a aVar = c;
        if (aVar != null) {
            aVar.println(2, b, str + " " + str2);
        }
    }

    public static void k(String str, String str2) {
        a aVar = c;
        if (aVar != null) {
            aVar.println(5, b, str + " " + str2);
        }
    }

    public static void l(String str, String str2, Throwable th) {
        a aVar = c;
        if (aVar != null) {
            aVar.println(5, b, str + " " + str2, th);
        }
    }
}
