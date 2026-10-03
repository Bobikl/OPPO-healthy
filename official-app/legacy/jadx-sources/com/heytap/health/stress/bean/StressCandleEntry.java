package com.heytap.health.stress.bean;

import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/stress/bean/StressCandleEntry;", "Lcom/heytap/health/core/widget/charts/data/HealthCandleEntry;", "avgStress", "", "x", "", "low", "high", "data", "", "(IFFFLjava/lang/Object;)V", "getAvgStress", "()I", "setAvgStress", "(I)V", "stress_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StressCandleEntry extends HealthCandleEntry {
    private int avgStress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StressCandleEntry(int i, float f, float f2, float f3, @NotNull Object data) {
        super(f, f2, f3, data);
        Intrinsics.checkNotNullParameter(data, "data");
        this.avgStress = i;
    }

    public final int getAvgStress() {
        return this.avgStress;
    }

    public final void setAvgStress(int i) {
        this.avgStress = i;
    }
}
