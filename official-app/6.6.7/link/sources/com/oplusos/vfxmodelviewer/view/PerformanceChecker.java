package com.oplusos.vfxmodelviewer.view;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0019\u0010\u0011\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\nJ\b\u0010\u0016\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/PerformanceChecker;", "", "()V", "mChecked", "", "mHighModelList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "mPerformanceLevel", "Lcom/oplusos/vfxmodelviewer/view/PerformanceChecker$PerformanceLevel;", "getMPerformanceLevel", "()Lcom/oplusos/vfxmodelviewer/view/PerformanceChecker$PerformanceLevel;", "setMPerformanceLevel", "(Lcom/oplusos/vfxmodelviewer/view/PerformanceChecker$PerformanceLevel;)V", "checkPerformanceLevel", "", "extendHighModel", "modelArray", "", "([Ljava/lang/String;)V", "getPerformanceLevel", "isHighModel", "Companion", "PerformanceLevel", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PerformanceChecker {
    private boolean mChecked;
    private static int cpu_high_freq = 2800000;
    private static int cpu_high_core_count = 8;
    private static int cpu_low_freq = 2200000;
    private static int cpu_low_core_count = 7;
    private static int ram_high = 7000000;
    private static int ram_low = 5000000;

    @NotNull
    private PerformanceLevel mPerformanceLevel = PerformanceLevel.Low;

    @NotNull
    private ArrayList<String> mHighModelList = CollectionsKt.arrayListOf(new String[]{"NE2210", "PGAM10", "PGBM10"});

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/oplusos/vfxmodelviewer/view/PerformanceChecker$PerformanceLevel;", "", "(Ljava/lang/String;I)V", "Low", "Medium", "High", "com.oplusos.vfxsdk.modelviewer.1.3.6_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum PerformanceLevel {
        Low,
        Medium,
        High
    }

    private final boolean isHighModel() {
        String str = Build.MODEL;
        Iterator<String> it = this.mHighModelList.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(str, it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void checkPerformanceLevel() throws Throwable {
        PerformanceLevel performanceLevel;
        if (this.mChecked) {
            return;
        }
        this.mChecked = true;
        if (isHighModel()) {
            this.mPerformanceLevel = PerformanceLevel.High;
            return;
        }
        Hardware.Companion companion = Hardware.INSTANCE;
        int cPUNumber = companion.getCPUNumber();
        Hardware.CPU_TYPE cPUType = companion.getCPUType();
        if (cPUType == Hardware.CPU_TYPE.MTK) {
            if (6880 <= cPUNumber && cPUNumber <= 7999) {
                this.mPerformanceLevel = PerformanceLevel.High;
                return;
            }
        } else if (cPUType == Hardware.CPU_TYPE.QCOM) {
            if ((7450 <= cPUNumber && cPUNumber <= 7999) || cPUNumber >= 8250) {
                this.mPerformanceLevel = PerformanceLevel.High;
                return;
            }
        }
        int cpuCoreCount = companion.getCpuCoreCount();
        int cpuMaxFreq = companion.getCpuMaxFreq();
        int ram = companion.getRam();
        if (cpuMaxFreq < cpu_high_freq || cpuCoreCount < cpu_high_core_count || ram < ram_high) {
            performanceLevel = (cpuMaxFreq <= cpu_low_freq || cpuCoreCount <= cpu_low_core_count || ram <= ram_low) ? PerformanceLevel.Low : PerformanceLevel.Medium;
        } else {
            performanceLevel = PerformanceLevel.High;
        }
        this.mPerformanceLevel = performanceLevel;
    }

    public final void extendHighModel(@NotNull String[] modelArray) {
        Intrinsics.checkNotNullParameter(modelArray, "modelArray");
        CollectionsKt.addAll(this.mHighModelList, modelArray);
    }

    @NotNull
    public final PerformanceLevel getMPerformanceLevel() {
        return this.mPerformanceLevel;
    }

    @NotNull
    public final PerformanceLevel getPerformanceLevel() throws Throwable {
        checkPerformanceLevel();
        return this.mPerformanceLevel;
    }

    public final void setMPerformanceLevel(@NotNull PerformanceLevel performanceLevel) {
        Intrinsics.checkNotNullParameter(performanceLevel, "<set-?>");
        this.mPerformanceLevel = performanceLevel;
    }
}
