package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.SportDataStat;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0003\u0010\u000eR$\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\f\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/mr4;", "", "", "a", "J", "c", "()J", MapSchema.FIELD_NAME_ENTRY, "(J)V", "timestamp", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "b", "Ljava/util/List;", "()Ljava/util/List;", "chartDataList", "Lcom/heytap/databaseengine/model/SportDataStat;", "Lcom/heytap/databaseengine/model/SportDataStat;", "()Lcom/heytap/databaseengine/model/SportDataStat;", "d", "(Lcom/heytap/databaseengine/model/SportDataStat;)V", "sportDataStat", "<init>", "()V", "daily_release"}, k = 1, mv = {1, 8, 0})
public final class mr4 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<TimeStampedData> chartDataList = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SportDataStat sportDataStat;

    @NotNull
    public final List<TimeStampedData> a() {
        return this.chartDataList;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final SportDataStat getSportDataStat() {
        return this.sportDataStat;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void d(@Nullable SportDataStat sportDataStat) {
        this.sportDataStat = sportDataStat;
    }

    public final void e(long j2) {
        this.timestamp = j2;
    }
}
