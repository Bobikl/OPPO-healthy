package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes10.dex */
public final class efg {
    public static final boolean PURGE_ENABLED = b(true, "rx3.purge-enabled", true, true, new a());

    public static final class a implements d08<String, String> {
        @Override // com.oplus.aiunit.vision.d08
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(String str) {
            return System.getProperty(str);
        }
    }

    public static ScheduledExecutorService a(ThreadFactory threadFactory) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(PURGE_ENABLED);
        return scheduledThreadPoolExecutor;
    }

    public static boolean b(boolean z, String str, boolean z2, boolean z3, d08<String, String> d08Var) {
        if (!z) {
            return z3;
        }
        try {
            String strApply = d08Var.apply(str);
            return strApply == null ? z2 : SpeechConstant.TRUE_STR.equals(strApply);
        } catch (Throwable th) {
            hu6.b(th);
            return z2;
        }
    }
}
