package com.heytap.msp.sdk.common.crash;

/* JADX INFO: loaded from: classes19.dex */
public interface MspCrashListener {
    void onMspProcessCrash(int i, int i2, String str, int i3, String str2);

    void onMspProcessRecover(String str, int i, String str2);
}
