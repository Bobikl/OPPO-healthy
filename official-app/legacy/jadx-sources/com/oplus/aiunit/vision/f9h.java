package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\n\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u0003\u0010!R$\u0010)\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/oplus/aiunit/vision/f9h;", "", "", "a", "J", "getDayTime", "()J", MapSchema.FIELD_NAME_ENTRY, "(J)V", "dayTime", "b", "getChartStartTime", "d", "chartStartTime", "c", "getChartEndTime", "chartEndTime", "", "Z", "()Z", b2n.f, "(Z)V", "isNoData", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "getLastBreathRateStat", "()Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "f", "(Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;)V", "lastBreathRateStat", "", "Lcom/heytap/health/core/widget/charts/data/HealthCandleEntry;", "Ljava/util/List;", "()Ljava/util/List;", "candleEntryList", "Lcom/heytap/databaseengine/model/SleepIndex;", "Lcom/heytap/databaseengine/model/SleepIndex;", "getSleepIndex", "()Lcom/heytap/databaseengine/model/SleepIndex;", b2n.g, "(Lcom/heytap/databaseengine/model/SleepIndex;)V", "sleepIndex", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class f9h {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long dayTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long chartStartTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long chartEndTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean isNoData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public BreathRateStat lastBreathRateStat;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final List<HealthCandleEntry> candleEntryList = new ArrayList();

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public SleepIndex sleepIndex;

    @NotNull
    public final List<HealthCandleEntry> a() {
        return this.candleEntryList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsNoData() {
        return this.isNoData;
    }

    public final void c(long j2) {
        this.chartEndTime = j2;
    }

    public final void d(long j2) {
        this.chartStartTime = j2;
    }

    public final void e(long j2) {
        this.dayTime = j2;
    }

    public final void f(@Nullable BreathRateStat breathRateStat) {
        this.lastBreathRateStat = breathRateStat;
    }

    public final void g(boolean z) {
        this.isNoData = z;
    }

    public final void h(@Nullable SleepIndex sleepIndex) {
        this.sleepIndex = sleepIndex;
    }
}
