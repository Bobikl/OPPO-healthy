package com.heytap.voiceassistant.sdk.tts.closure.f;

import com.client.platform.opensdk.pay.download.resource.LanUtils;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d {
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
            return LanUtils.US.PAUSE;
        }
        if (i == 6) {
            return "INPUT_FINISHED";
        }
        if (i == 7) {
            return "WAIT_RESULT";
        }
        if (i == 8) {
            return "EXITING";
        }
        return i == 9 ? "EXITED" : "null";
    }
}
