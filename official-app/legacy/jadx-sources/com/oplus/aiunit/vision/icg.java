package com.oplus.aiunit.vision;

import android.net.Uri;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;

/* JADX INFO: loaded from: classes2.dex */
public class icg {
    public static boolean a(String str) {
        try {
            return SpeechConstant.TRUE_STR.equals(Uri.parse(str).getQueryParameter("WHITE_DOMAIN"));
        } catch (Exception e2) {
            m7b.g("Failed to parse white domain parameter: " + e2.getMessage(), new Throwable[0]);
            return false;
        }
    }

    public static void b(String str) {
        pcg.a(str);
    }

    public static boolean c(String str) {
        boolean zB = pcg.b(str);
        m7b.l("SafeHelper", "verifyHitPkgBlackList:" + zB);
        return zB;
    }

    public static boolean d(String str, int i) {
        boolean zC = pcg.c(str, i);
        m7b.l("SafeHelper", "hitWhiteHostSafeLevel:" + zC);
        return zC;
    }

    public static boolean e(String str) {
        boolean z = a(str) || pcg.d(str);
        m7b.l("SafeHelper", "hitWhiteHost:" + z);
        return z;
    }
}
