package com.heytap.health.watchface.business.creation.category.video.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JE\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\f\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006$"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/video/bean/CutData;", "", "videoType", "", "startTime", "", "endTime", "currPlayTime", "cutCosTime", "errorMsg", "(Ljava/lang/String;JJJJLjava/lang/String;)V", "getCurrPlayTime", "()J", "getCutCosTime", "setCutCosTime", "(J)V", "getEndTime", "getErrorMsg", "()Ljava/lang/String;", "setErrorMsg", "(Ljava/lang/String;)V", "getStartTime", "getVideoType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CutData {
    private final long currPlayTime;
    private long cutCosTime;
    private final long endTime;

    @NotNull
    private String errorMsg;
    private final long startTime;

    @NotNull
    private final String videoType;

    public CutData(@NotNull String videoType, long j2, long j3, long j4, long j5, @NotNull String errorMsg) {
        Intrinsics.checkNotNullParameter(videoType, "videoType");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        this.videoType = videoType;
        this.startTime = j2;
        this.endTime = j3;
        this.currPlayTime = j4;
        this.cutCosTime = j5;
        this.errorMsg = errorMsg;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getVideoType() {
        return this.videoType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCurrPlayTime() {
        return this.currPlayTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCutCosTime() {
        return this.cutCosTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @NotNull
    public final CutData copy(@NotNull String videoType, long startTime, long endTime, long currPlayTime, long cutCosTime, @NotNull String errorMsg) {
        Intrinsics.checkNotNullParameter(videoType, "videoType");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        return new CutData(videoType, startTime, endTime, currPlayTime, cutCosTime, errorMsg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CutData)) {
            return false;
        }
        CutData cutData = (CutData) other;
        return Intrinsics.areEqual(this.videoType, cutData.videoType) && this.startTime == cutData.startTime && this.endTime == cutData.endTime && this.currPlayTime == cutData.currPlayTime && this.cutCosTime == cutData.cutCosTime && Intrinsics.areEqual(this.errorMsg, cutData.errorMsg);
    }

    public final long getCurrPlayTime() {
        return this.currPlayTime;
    }

    public final long getCutCosTime() {
        return this.cutCosTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final String getVideoType() {
        return this.videoType;
    }

    public int hashCode() {
        return (((((((((this.videoType.hashCode() * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31) + Long.hashCode(this.currPlayTime)) * 31) + Long.hashCode(this.cutCosTime)) * 31) + this.errorMsg.hashCode();
    }

    public final void setCutCosTime(long j2) {
        this.cutCosTime = j2;
    }

    public final void setErrorMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.errorMsg = str;
    }

    @NotNull
    public String toString() {
        return "CutData(videoType=" + this.videoType + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", currPlayTime=" + this.currPlayTime + ", cutCosTime=" + this.cutCosTime + ", errorMsg=" + this.errorMsg + ")";
    }

    public /* synthetic */ CutData(String str, long j2, long j3, long j4, long j5, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j2, j3, j4, (i & 16) != 0 ? 0L : j5, (i & 32) != 0 ? "" : str2);
    }
}
