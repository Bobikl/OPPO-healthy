package com.oplus.omes.srp.sysintegrity;

import android.content.Context;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class Probe {
    static {
        System.loadLibrary("omes_srp_si");
    }

    public static String gather(Context context) {
        return getProbeRespStr(context);
    }

    public static native String getProbeRespStr(Object obj);

    public static native boolean getProbeState();

    public static boolean getState() {
        return getProbeState();
    }
}
