package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/rq4;", "", "", "c", "", "a", "J", "b", "()J", "d", "(J)V", "lastDataTime", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "Ljava/util/List;", "()Ljava/util/List;", "setChartList", "(Ljava/util/List;)V", "chartList", "<init>", "()V", "daily_release"}, k = 1, mv = {1, 8, 0})
public final class rq4 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long lastDataTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public List<TimeStampedData> chartList = new ArrayList();

    @NotNull
    public final List<TimeStampedData> a() {
        return this.chartList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getLastDataTime() {
        return this.lastDataTime;
    }

    public final boolean c() {
        return this.lastDataTime > 0;
    }

    public final void d(long j2) {
        this.lastDataTime = j2;
    }
}
