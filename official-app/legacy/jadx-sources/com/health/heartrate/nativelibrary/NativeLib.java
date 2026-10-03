package com.health.heartrate.nativelibrary;

import com.health.heartrate.nativelibrary.paras.AlgoInputData;
import com.health.heartrate.nativelibrary.paras.AlgoOutputData;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086 J\t\u0010\t\u001a\u00020\u0004H\u0086 ¨\u0006\u000b"}, d2 = {"Lcom/health/heartrate/nativelibrary/NativeLib;", "", "()V", "heartRateCalculate", "", "algoInputData", "Lcom/health/heartrate/nativelibrary/paras/AlgoInputData;", "algoOutputData", "Lcom/health/heartrate/nativelibrary/paras/AlgoOutputData;", "heartRateReset", "Companion", "MeasureLibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NativeLib {
    static {
        System.loadLibrary("measure");
    }

    public final native int heartRateCalculate(@NotNull AlgoInputData algoInputData, @NotNull AlgoOutputData algoOutputData);

    public final native int heartRateReset();
}
