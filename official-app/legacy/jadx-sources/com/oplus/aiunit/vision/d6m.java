package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;

/* JADX INFO: loaded from: classes12.dex */
public final class d6m {
    public static void a(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty field namespace URI", 101);
        }
    }

    public static void b(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty f name", 102);
        }
    }

    public static String c(String str, String str2) throws XMPException {
        a(str);
        b(str2);
        c6m c6mVarA = e6m.a(str, str2);
        if (c6mVarA.c() != 2) {
            throw new XMPException("The field name must be simple", 102);
        }
        return mla.SEPARATOR + c6mVarA.b(1).c();
    }
}
