package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;

/* JADX INFO: loaded from: classes12.dex */
public class k7e {
    public static void a(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty array name", 4);
        }
    }

    public static void b(Object obj) throws XMPException {
        if (obj == null) {
            throw new XMPException("Parameter must not be null", 4);
        }
        if ((obj instanceof String) && ((String) obj).length() == 0) {
            throw new XMPException("Parameter must not be null or empty", 4);
        }
    }

    public static void c(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty prefix", 4);
        }
    }

    public static void d(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty property name", 4);
        }
    }

    public static void e(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty schema namespace URI", 4);
        }
    }

    public static void f(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty specific language", 4);
        }
    }

    public static void g(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty array name", 4);
        }
    }
}
