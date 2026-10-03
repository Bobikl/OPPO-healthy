package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.newsleep.BreathRateStat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BK\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0017\u0012\u0006\u0010 \u001a\u00020\u0017\u0012\u0006\u0010\"\u001a\u00020\u0017\u0012\u0006\u0010%\u001a\u00020\u0017¢\u0006\u0004\b,\u0010-B/\b\u0016\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u0017\u0012\u0006\u0010 \u001a\u00020\u0017¢\u0006\u0004\b,\u0010.R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010 \u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\f\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\"\u0010\"\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u0018\u0010\u001b\"\u0004\b!\u0010\u001dR\"\u0010%\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0019\u001a\u0004\b\u0010\u0010\u001b\"\u0004\b$\u0010\u001dR\"\u0010+\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010'\u001a\u0004\b#\u0010(\"\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/oplus/aiunit/vision/adh;", "", "", "Lcom/oplus/aiunit/vision/d3k;", "a", "Ljava/util/List;", "f", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "dataList", "Lcom/heytap/databaseengine/model/newsleep/BreathRateStat;", "b", "setBreathRateStatList", "breathRateStatList", "", "c", "Z", "h", "()Z", "setShowNullChart", "(Z)V", "isShowNullChart", "", "d", "J", "e", "()J", "setChartStartTime", "(J)V", "chartStartTime", "setChartEndTime", "chartEndTime", "setChartLowestVisibleTime", "chartLowestVisibleTime", "g", "setChartHighestVisibleTime", "chartHighestVisibleTime", "", "I", "()I", "i", "(I)V", "validLastDataIndex", "<init>", "(Ljava/util/List;Ljava/util/List;ZJJJJ)V", "(Ljava/util/List;ZJJ)V", "sleep_breath_rate_release"}, k = 1, mv = {1, 8, 0})
public final class adh {
    public static final int $stable = 8;

    @NotNull
    public List<d3k> a;

    @NotNull
    public List<BreathRateStat> b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;

    public adh(@NotNull List<d3k> list, @NotNull List<BreathRateStat> list2, boolean z, long j, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(list, "dataList");
        Intrinsics.checkNotNullParameter(list2, "breathRateStatList");
        this.a = list;
        this.b = list2;
        this.c = z;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
    }

    @NotNull
    public final List<BreathRateStat> a() {
        return this.b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getG() {
        return this.g;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getD() {
        return this.d;
    }

    @NotNull
    public final List<d3k> f() {
        return this.a;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getC() {
        return this.c;
    }

    public final void i(int i) {
        this.h = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public adh(@NotNull List<d3k> list, boolean z, long j, long j2) {
        this(list, new ArrayList(), z, j, j2, 0L, 0L);
        Intrinsics.checkNotNullParameter(list, "dataList");
    }
}
