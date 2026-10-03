package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes13.dex */
public class a82 {
    public static final String SYSTEM_PROPERTY_TRACK_REUSABLE_BUFFERS = "com.fasterxml.jackson.core.util.BufferRecyclers.trackReusableBuffers";
    public static final fwj a;
    public static final ThreadLocal<SoftReference<z72>> b;

    static {
        boolean zEquals;
        try {
            zEquals = SpeechConstant.TRUE_STR.equals(System.getProperty(SYSTEM_PROPERTY_TRACK_REUSABLE_BUFFERS));
        } catch (SecurityException unused) {
            zEquals = false;
        }
        a = zEquals ? fwj.a() : null;
        b = new ThreadLocal<>();
    }

    public static z72 a() {
        ThreadLocal<SoftReference<z72>> threadLocal = b;
        SoftReference<z72> softReference = threadLocal.get();
        z72 z72Var = softReference == null ? null : softReference.get();
        if (z72Var == null) {
            z72Var = new z72();
            fwj fwjVar = a;
            threadLocal.set(fwjVar != null ? fwjVar.c(z72Var) : new SoftReference<>(z72Var));
        }
        return z72Var;
    }
}
