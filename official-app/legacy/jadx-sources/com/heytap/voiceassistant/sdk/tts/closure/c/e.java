package com.heytap.voiceassistant.sdk.tts.closure.c;

import android.content.Context;
import com.heytap.voiceassistant.sdk.tts.monitor.Logger;

/* JADX INFO: loaded from: classes19.dex */
public class e {
    public static volatile int a;
    public static b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f8383c;

    public static synchronized a a(Context context) {
        if (f8383c == null) {
            f8383c = new a(context.getApplicationContext());
        }
        StringBuilder sbA = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("createSpeechStreamSynthesizer | refCnt = ");
        sbA.append(a);
        Logger.debug("SpeechFactory", sbA.toString());
        return f8383c;
    }

    public static synchronized b b(Context context) {
        if (b == null) {
            b = new b(context.getApplicationContext());
        }
        StringBuilder sbA = com.heytap.voiceassistant.sdk.tts.closure.a.a.a("createSpeechSynthesizer | refCnt = ");
        sbA.append(a);
        Logger.debug("SpeechFactory", sbA.toString());
        a++;
        return b;
    }
}
