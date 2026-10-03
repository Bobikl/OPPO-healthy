package com.heytap.voiceassistant.sdk.tts.closure.f;

import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b {
    public static /* synthetic */ String a(int i) {
        if (i == 1) {
            return "UN_INIT";
        }
        if (i == 2) {
            return "INIT";
        }
        if (i == 3) {
            return "START";
        }
        if (i == 4) {
            return DebugCoroutineInfoImplKt.RUNNING;
        }
        if (i == 5) {
            return "WAIT_RESULT";
        }
        if (i == 6) {
            return "EXITING";
        }
        return i == 7 ? "EXITED" : "null";
    }
}
