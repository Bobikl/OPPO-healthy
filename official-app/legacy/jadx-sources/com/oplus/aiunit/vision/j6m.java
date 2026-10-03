package com.oplus.aiunit.vision;

import com.adobe.xmp.XMPException;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;

/* JADX INFO: loaded from: classes12.dex */
public class j6m {
    public static String a(t5m t5mVar) {
        return yw9.c(t5mVar);
    }

    public static boolean b(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty convert-string", 5);
        }
        String lowerCase = str.toLowerCase();
        try {
            return Integer.parseInt(lowerCase) != 0;
        } catch (NumberFormatException unused) {
            return SpeechConstant.TRUE_STR.equals(lowerCase) || "t".equals(lowerCase) || "on".equals(lowerCase) || "yes".equals(lowerCase);
        }
    }

    public static t5m c(String str) throws XMPException {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty convert-string", 5);
        }
        return yw9.a(str);
    }

    public static double d(String str) throws XMPException {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return Double.parseDouble(str);
                }
            } catch (NumberFormatException unused) {
                throw new XMPException("Invalid double string", 5);
            }
        }
        throw new XMPException("Empty convert-string", 5);
    }

    public static int e(String str) throws XMPException {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str);
                }
            } catch (NumberFormatException unused) {
                throw new XMPException("Invalid integer string", 5);
            }
        }
        throw new XMPException("Empty convert-string", 5);
    }

    public static long f(String str) throws XMPException {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.startsWith("0x") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
                }
            } catch (NumberFormatException unused) {
                throw new XMPException("Invalid long string", 5);
            }
        }
        throw new XMPException("Empty convert-string", 5);
    }

    public static byte[] g(String str) throws XMPException {
        try {
            return qy0.a(str.getBytes());
        } catch (Throwable th) {
            throw new XMPException("Invalid base64 string", 5, th);
        }
    }
}
