package com.heytap.health.health_archives.bean;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.y15;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J5\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/health_archives/bean/HealthArchivesMergedDataBean;", "", y15.PARAMS_RECORD_COUNT, "", "latestFileTime", "", "indicators", "", "", "(IJLjava/util/Map;)V", "getIndicators", "()Ljava/util/Map;", "setIndicators", "(Ljava/util/Map;)V", "getLatestFileTime", "()J", "setLatestFileTime", "(J)V", "getRecordCount", "()I", "setRecordCount", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "health_archives_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthArchivesMergedDataBean {

    @Nullable
    private Map<String, Integer> indicators;
    private long latestFileTime;
    private int recordCount;

    public HealthArchivesMergedDataBean() {
        this(0, 0L, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthArchivesMergedDataBean copy$default(HealthArchivesMergedDataBean healthArchivesMergedDataBean, int i, long j2, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = healthArchivesMergedDataBean.recordCount;
        }
        if ((i2 & 2) != 0) {
            j2 = healthArchivesMergedDataBean.latestFileTime;
        }
        if ((i2 & 4) != 0) {
            map = healthArchivesMergedDataBean.indicators;
        }
        return healthArchivesMergedDataBean.copy(i, j2, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRecordCount() {
        return this.recordCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLatestFileTime() {
        return this.latestFileTime;
    }

    @Nullable
    public final Map<String, Integer> component3() {
        return this.indicators;
    }

    @NotNull
    public final HealthArchivesMergedDataBean copy(int recordCount, long latestFileTime, @Nullable Map<String, Integer> indicators) {
        return new HealthArchivesMergedDataBean(recordCount, latestFileTime, indicators);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthArchivesMergedDataBean)) {
            return false;
        }
        HealthArchivesMergedDataBean healthArchivesMergedDataBean = (HealthArchivesMergedDataBean) other;
        return this.recordCount == healthArchivesMergedDataBean.recordCount && this.latestFileTime == healthArchivesMergedDataBean.latestFileTime && Intrinsics.areEqual(this.indicators, healthArchivesMergedDataBean.indicators);
    }

    @Nullable
    public final Map<String, Integer> getIndicators() {
        return this.indicators;
    }

    public final long getLatestFileTime() {
        return this.latestFileTime;
    }

    public final int getRecordCount() {
        return this.recordCount;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.recordCount) * 31) + Long.hashCode(this.latestFileTime)) * 31;
        Map<String, Integer> map = this.indicators;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final void setIndicators(@Nullable Map<String, Integer> map) {
        this.indicators = map;
    }

    public final void setLatestFileTime(long j2) {
        this.latestFileTime = j2;
    }

    public final void setRecordCount(int i) {
        this.recordCount = i;
    }

    @NotNull
    public String toString() {
        return "HealthArchivesMergedDataBean(recordCount=" + this.recordCount + ", latestFileTime=" + this.latestFileTime + ", indicators=" + this.indicators + ")";
    }

    public HealthArchivesMergedDataBean(int i, long j2, @Nullable Map<String, Integer> map) {
        this.recordCount = i;
        this.latestFileTime = j2;
        this.indicators = map;
    }

    public /* synthetic */ HealthArchivesMergedDataBean(int i, long j2, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j2, (i2 & 4) != 0 ? null : map);
    }
}
