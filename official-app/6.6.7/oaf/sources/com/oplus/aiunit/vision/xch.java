package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import com.heytap.health.core.widget.charts.data.HealthCandleEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0012\u001a\u0004\b\n\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001d\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b\u0003\u0010!R$\u0010)\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/oplus/aiunit/vision/xch;", "", "", "a", "J", "getDayTime", "()J", "e", "(J)V", "dayTime", "b", "getChartStartTime", "d", "chartStartTime", "c", "getChartEndTime", "chartEndTime", "", "Z", "()Z", "g", "(Z)V", "isNoData", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "getLastBreathRateStat", "()Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "f", "(Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;)V", "lastBreathRateStat", "", "Lcom/heytap/health/core/widget/charts/data/HealthCandleEntry;", "Ljava/util/List;", "()Ljava/util/List;", "candleEntryList", "Lcom/heytap/databaseengine/model/SleepIndex;", "Lcom/heytap/databaseengine/model/SleepIndex;", "getSleepIndex", "()Lcom/heytap/databaseengine/model/SleepIndex;", "h", "(Lcom/heytap/databaseengine/model/SleepIndex;)V", "sleepIndex", "<init>", "()V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class xch {
    public static final int $stable = 8;
    public long a;
    public long b;
    public long c;
    public boolean d;

    @Nullable
    public BreathRateStat e;

    @NotNull
    public final List<HealthCandleEntry> f = new ArrayList();

    @Nullable
    public SleepIndex g;

    @NotNull
    public final List<HealthCandleEntry> a() {
        return this.f;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    public final void c(long j) {
        this.c = j;
    }

    public final void d(long j) {
        this.b = j;
    }

    public final void e(long j) {
        this.a = j;
    }

    public final void f(@Nullable BreathRateStat breathRateStat) {
        this.e = breathRateStat;
    }

    public final void g(boolean z) {
        this.d = z;
    }

    public final void h(@Nullable SleepIndex sleepIndex) {
        this.g = sleepIndex;
    }
}
