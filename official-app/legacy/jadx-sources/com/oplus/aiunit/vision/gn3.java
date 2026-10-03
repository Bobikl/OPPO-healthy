package com.oplus.aiunit.vision;

import com.health.heartrate.nativelibrary.paras.AlgoInputData;
import com.health.heartrate.nativelibrary.paras.AlgoOutputData;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0005"}, d2 = {"Lcom/health/heartrate/nativelibrary/paras/AlgoInputData;", "", "a", "Lcom/health/heartrate/nativelibrary/paras/AlgoOutputData;", "b", "heartrate_release"}, k = 2, mv = {1, 8, 0})
public final class gn3 {
    @NotNull
    public static final String a(@NotNull AlgoInputData algoInputData) {
        Intrinsics.checkNotNullParameter(algoInputData, "<this>");
        return "xGyro is " + algoInputData.getXGyro() + ", yGyro is " + algoInputData.getYGyro() + ", zGyro is " + algoInputData.getZGyro() + ", gyroTimeStampMs is " + algoInputData.getGyroTimeStampMs() + ", xAcc is " + algoInputData.getXAcc() + ", yAcc is " + algoInputData.getYAcc() + ", zAcc is " + algoInputData.getZAcc() + ", accTimeStampMs is " + algoInputData.getAccTimeStampMs();
    }

    @NotNull
    public static final String b(@NotNull AlgoOutputData algoOutputData) {
        Intrinsics.checkNotNullParameter(algoOutputData, "<this>");
        return "heart rate is " + algoOutputData.getHeartRate() + ", hrConfidence is " + algoOutputData.getHrConfidence() + ", warnStatus is " + algoOutputData.getWarnStatus() + ", motionStatus is " + algoOutputData.getMotionStatus();
    }
}
