package com.heytap.health.hr.jni;

import com.heytap.health.hr.para.PersonalData;
import com.heytap.health.hr.para.SportRecord;

/* JADX INFO: loaded from: classes16.dex */
public class HrOnlineLearningAlgorithm {
    static {
        System.loadLibrary("hrOnlineLearning");
    }

    public static native short initLog(HrLogListener hrLogListener);

    public static native float[] processHrOnlineLearning(String str, SportRecord[] sportRecordArr, int i, PersonalData personalData);

    public static native void selectSportRecord(SportRecord[] sportRecordArr, int i, int[] iArr);
}
