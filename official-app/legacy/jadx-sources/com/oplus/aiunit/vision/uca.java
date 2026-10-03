package com.oplus.aiunit.vision;

import android.content.Intent;
import com.color.inner.content.IntentWrapper;

/* JADX INFO: loaded from: classes4.dex */
public class uca {
    public static Object a() {
        return "android.intent.action.CALL_PRIVILEGED";
    }

    public static Object b() {
        return 1024;
    }

    public static Object c() {
        return 512;
    }

    public static void d(Intent intent, int i) {
        IntentWrapper.setOppoFlags(intent, i);
    }
}
