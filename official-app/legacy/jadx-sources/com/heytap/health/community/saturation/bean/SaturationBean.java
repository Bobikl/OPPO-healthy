package com.heytap.health.community.saturation.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0012J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/community/saturation/bean/SaturationBean;", "", "startTimeStamp", "", "endTimeStamp", "warningTip", "", "(JJLjava/lang/String;)V", "getEndTimeStamp", "()J", "getStartTimeStamp", "getWarningTip", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "isEnable", "toString", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SaturationBean {
    private final long endTimeStamp;
    private final long startTimeStamp;

    @NotNull
    private final String warningTip;

    public SaturationBean(long j2, long j3, @NotNull String warningTip) {
        Intrinsics.checkNotNullParameter(warningTip, "warningTip");
        this.startTimeStamp = j2;
        this.endTimeStamp = j3;
        this.warningTip = warningTip;
    }

    public static /* synthetic */ SaturationBean copy$default(SaturationBean saturationBean, long j2, long j3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = saturationBean.startTimeStamp;
        }
        long j4 = j2;
        if ((i & 2) != 0) {
            j3 = saturationBean.endTimeStamp;
        }
        long j5 = j3;
        if ((i & 4) != 0) {
            str = saturationBean.warningTip;
        }
        return saturationBean.copy(j4, j5, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getWarningTip() {
        return this.warningTip;
    }

    @NotNull
    public final SaturationBean copy(long startTimeStamp, long endTimeStamp, @NotNull String warningTip) {
        Intrinsics.checkNotNullParameter(warningTip, "warningTip");
        return new SaturationBean(startTimeStamp, endTimeStamp, warningTip);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SaturationBean)) {
            return false;
        }
        SaturationBean saturationBean = (SaturationBean) other;
        return this.startTimeStamp == saturationBean.startTimeStamp && this.endTimeStamp == saturationBean.endTimeStamp && Intrinsics.areEqual(this.warningTip, saturationBean.warningTip);
    }

    public final long getEndTimeStamp() {
        return this.endTimeStamp;
    }

    public final long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    @NotNull
    public final String getWarningTip() {
        return this.warningTip;
    }

    public int hashCode() {
        return (((Long.hashCode(this.startTimeStamp) * 31) + Long.hashCode(this.endTimeStamp)) * 31) + this.warningTip.hashCode();
    }

    public final boolean isEnable() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return jCurrentTimeMillis < this.endTimeStamp && this.startTimeStamp <= jCurrentTimeMillis;
    }

    @NotNull
    public String toString() {
        return "SaturationBean(startTimeStamp=" + this.startTimeStamp + ", endTimeStamp=" + this.endTimeStamp + ", warningTip=" + this.warningTip + ")";
    }
}
