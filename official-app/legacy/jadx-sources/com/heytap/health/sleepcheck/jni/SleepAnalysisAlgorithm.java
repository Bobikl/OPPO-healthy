package com.heytap.health.sleepcheck.jni;

import com.heytap.health.sleepcheck.para.OsaResult;
import com.heytap.health.sleepcheck.para.SnoreUserBean;
import com.heytap.health.sleepcheck.result.SleepCheckAndSleepScoreResult;

/* JADX INFO: loaded from: classes18.dex */
public class SleepAnalysisAlgorithm {
    static {
        System.loadLibrary("sleepAnalysis");
    }

    public static native short initLog(SleepLogListener sleepLogListener);

    public static native SleepCheckAndSleepScoreResult sleepCheckAndSleepScore(int i, long j2, long j3, short[] sArr, byte[] bArr, int i2, SnoreUserBean snoreUserBean, OsaResult osaResult);
}
