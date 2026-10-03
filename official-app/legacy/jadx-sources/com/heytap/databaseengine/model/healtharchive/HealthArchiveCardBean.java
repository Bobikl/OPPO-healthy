package com.heytap.databaseengine.model.healtharchive;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.y15;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/heytap/databaseengine/model/healtharchive/HealthArchiveCardBean;", "", y15.PARAMS_RECORD_COUNT, "", "latestFileTime", "", "(IJ)V", "getLatestFileTime", "()J", "setLatestFileTime", "(J)V", "getRecordCount", "()I", "setRecordCount", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "databaseengine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HealthArchiveCardBean {
    private long latestFileTime;
    private int recordCount;

    public HealthArchiveCardBean() {
        this(0, 0L, 3, null);
    }

    public static /* synthetic */ HealthArchiveCardBean copy$default(HealthArchiveCardBean healthArchiveCardBean, int i, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = healthArchiveCardBean.recordCount;
        }
        if ((i2 & 2) != 0) {
            j2 = healthArchiveCardBean.latestFileTime;
        }
        return healthArchiveCardBean.copy(i, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRecordCount() {
        return this.recordCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLatestFileTime() {
        return this.latestFileTime;
    }

    @NotNull
    public final HealthArchiveCardBean copy(int recordCount, long latestFileTime) {
        return new HealthArchiveCardBean(recordCount, latestFileTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthArchiveCardBean)) {
            return false;
        }
        HealthArchiveCardBean healthArchiveCardBean = (HealthArchiveCardBean) other;
        return this.recordCount == healthArchiveCardBean.recordCount && this.latestFileTime == healthArchiveCardBean.latestFileTime;
    }

    public final long getLatestFileTime() {
        return this.latestFileTime;
    }

    public final int getRecordCount() {
        return this.recordCount;
    }

    public int hashCode() {
        return (Integer.hashCode(this.recordCount) * 31) + Long.hashCode(this.latestFileTime);
    }

    public final void setLatestFileTime(long j2) {
        this.latestFileTime = j2;
    }

    public final void setRecordCount(int i) {
        this.recordCount = i;
    }

    @NotNull
    public String toString() {
        return "HealthArchiveCardBean(recordCount=" + this.recordCount + ", latestFileTime=" + this.latestFileTime + ")";
    }

    public HealthArchiveCardBean(int i, long j2) {
        this.recordCount = i;
        this.latestFileTime = j2;
    }

    public /* synthetic */ HealthArchiveCardBean(int i, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0L : j2);
    }
}
