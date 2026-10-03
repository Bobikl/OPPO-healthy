package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.deeplink.DeepLinkInterpreter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b3\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u00103\u001a\u00020\bHÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001aJ¨\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010:J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u0006HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0015\"\u0004\b\u0017\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001f\u0010\u001aR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b \u0010\u001aR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\"\u0010\u001aR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015R\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010(R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001d¨\u0006@"}, d2 = {"Lcom/heytap/store/business/component/entity/IntegralExpInfoEntity;", "", DeepLinkInterpreter.KEY_ACTIVITY_ID, "", DeepLinkInterpreter.KEY_ACTIVITY_NAME, "expandMultiple", "", "releaseStartTime", "", "releaseEndTime", "currentTime", "expandType", "activityStatus", "drawStatus", "drawStyle", "drawDesc", "localPassTime", "jumpLink", "getResultMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JJJLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getActivityName", "setActivityName", "(Ljava/lang/String;)V", "getActivityStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCurrentTime", "()J", "getDrawDesc", "getDrawStatus", "getDrawStyle", "getExpandMultiple", "getExpandType", "getGetResultMessage", "setGetResultMessage", "getJumpLink", "getLocalPassTime", "setLocalPassTime", "(J)V", "getReleaseEndTime", "getReleaseStartTime", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;JJJLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lcom/heytap/store/business/component/entity/IntegralExpInfoEntity;", "equals", "", "other", "hashCode", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class IntegralExpInfoEntity {

    @NotNull
    private final String activityId;

    @NotNull
    private String activityName;

    @Nullable
    private final Integer activityStatus;
    private final long currentTime;

    @Nullable
    private final String drawDesc;

    @Nullable
    private final Integer drawStatus;

    @Nullable
    private final Integer drawStyle;

    @Nullable
    private final Integer expandMultiple;

    @Nullable
    private final Integer expandType;

    @NotNull
    private String getResultMessage;

    @Nullable
    private final String jumpLink;
    private long localPassTime;
    private final long releaseEndTime;
    private final long releaseStartTime;

    public IntegralExpInfoEntity() {
        this(null, null, null, 0L, 0L, 0L, null, null, null, null, null, 0L, null, null, 16383, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityId() {
        return this.activityId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getDrawStyle() {
        return this.drawStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDrawDesc() {
        return this.drawDesc;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getLocalPassTime() {
        return this.localPassTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getJumpLink() {
        return this.jumpLink;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getGetResultMessage() {
        return this.getResultMessage;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getExpandMultiple() {
        return this.expandMultiple;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getReleaseStartTime() {
        return this.releaseStartTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getReleaseEndTime() {
        return this.releaseEndTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getCurrentTime() {
        return this.currentTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getExpandType() {
        return this.expandType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getActivityStatus() {
        return this.activityStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getDrawStatus() {
        return this.drawStatus;
    }

    @NotNull
    public final IntegralExpInfoEntity copy(@NotNull String activityId, @NotNull String activityName, @Nullable Integer expandMultiple, long releaseStartTime, long releaseEndTime, long currentTime, @Nullable Integer expandType, @Nullable Integer activityStatus, @Nullable Integer drawStatus, @Nullable Integer drawStyle, @Nullable String drawDesc, long localPassTime, @Nullable String jumpLink, @NotNull String getResultMessage) {
        Intrinsics.checkNotNullParameter(activityId, "activityId");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        Intrinsics.checkNotNullParameter(getResultMessage, "getResultMessage");
        return new IntegralExpInfoEntity(activityId, activityName, expandMultiple, releaseStartTime, releaseEndTime, currentTime, expandType, activityStatus, drawStatus, drawStyle, drawDesc, localPassTime, jumpLink, getResultMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntegralExpInfoEntity)) {
            return false;
        }
        IntegralExpInfoEntity integralExpInfoEntity = (IntegralExpInfoEntity) other;
        return Intrinsics.areEqual(this.activityId, integralExpInfoEntity.activityId) && Intrinsics.areEqual(this.activityName, integralExpInfoEntity.activityName) && Intrinsics.areEqual(this.expandMultiple, integralExpInfoEntity.expandMultiple) && this.releaseStartTime == integralExpInfoEntity.releaseStartTime && this.releaseEndTime == integralExpInfoEntity.releaseEndTime && this.currentTime == integralExpInfoEntity.currentTime && Intrinsics.areEqual(this.expandType, integralExpInfoEntity.expandType) && Intrinsics.areEqual(this.activityStatus, integralExpInfoEntity.activityStatus) && Intrinsics.areEqual(this.drawStatus, integralExpInfoEntity.drawStatus) && Intrinsics.areEqual(this.drawStyle, integralExpInfoEntity.drawStyle) && Intrinsics.areEqual(this.drawDesc, integralExpInfoEntity.drawDesc) && this.localPassTime == integralExpInfoEntity.localPassTime && Intrinsics.areEqual(this.jumpLink, integralExpInfoEntity.jumpLink) && Intrinsics.areEqual(this.getResultMessage, integralExpInfoEntity.getResultMessage);
    }

    @NotNull
    public final String getActivityId() {
        return this.activityId;
    }

    @NotNull
    public final String getActivityName() {
        return this.activityName;
    }

    @Nullable
    public final Integer getActivityStatus() {
        return this.activityStatus;
    }

    public final long getCurrentTime() {
        return this.currentTime;
    }

    @Nullable
    public final String getDrawDesc() {
        return this.drawDesc;
    }

    @Nullable
    public final Integer getDrawStatus() {
        return this.drawStatus;
    }

    @Nullable
    public final Integer getDrawStyle() {
        return this.drawStyle;
    }

    @Nullable
    public final Integer getExpandMultiple() {
        return this.expandMultiple;
    }

    @Nullable
    public final Integer getExpandType() {
        return this.expandType;
    }

    @NotNull
    public final String getGetResultMessage() {
        return this.getResultMessage;
    }

    @Nullable
    public final String getJumpLink() {
        return this.jumpLink;
    }

    public final long getLocalPassTime() {
        return this.localPassTime;
    }

    public final long getReleaseEndTime() {
        return this.releaseEndTime;
    }

    public final long getReleaseStartTime() {
        return this.releaseStartTime;
    }

    public int hashCode() {
        int iHashCode = ((this.activityId.hashCode() * 31) + this.activityName.hashCode()) * 31;
        Integer num = this.expandMultiple;
        int iHashCode2 = (((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Long.hashCode(this.releaseStartTime)) * 31) + Long.hashCode(this.releaseEndTime)) * 31) + Long.hashCode(this.currentTime)) * 31;
        Integer num2 = this.expandType;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.activityStatus;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.drawStatus;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.drawStyle;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str = this.drawDesc;
        int iHashCode7 = (((iHashCode6 + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.localPassTime)) * 31;
        String str2 = this.jumpLink;
        return ((iHashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.getResultMessage.hashCode();
    }

    public final void setActivityName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.activityName = str;
    }

    public final void setGetResultMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.getResultMessage = str;
    }

    public final void setLocalPassTime(long j2) {
        this.localPassTime = j2;
    }

    @NotNull
    public String toString() {
        return "IntegralExpInfoEntity(activityId=" + this.activityId + ", activityName=" + this.activityName + ", expandMultiple=" + this.expandMultiple + ", releaseStartTime=" + this.releaseStartTime + ", releaseEndTime=" + this.releaseEndTime + ", currentTime=" + this.currentTime + ", expandType=" + this.expandType + ", activityStatus=" + this.activityStatus + ", drawStatus=" + this.drawStatus + ", drawStyle=" + this.drawStyle + ", drawDesc=" + ((Object) this.drawDesc) + ", localPassTime=" + this.localPassTime + ", jumpLink=" + ((Object) this.jumpLink) + ", getResultMessage=" + this.getResultMessage + ')';
    }

    public IntegralExpInfoEntity(@NotNull String activityId, @NotNull String activityName, @Nullable Integer num, long j2, long j3, long j4, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str, long j5, @Nullable String str2, @NotNull String getResultMessage) {
        Intrinsics.checkNotNullParameter(activityId, "activityId");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        Intrinsics.checkNotNullParameter(getResultMessage, "getResultMessage");
        this.activityId = activityId;
        this.activityName = activityName;
        this.expandMultiple = num;
        this.releaseStartTime = j2;
        this.releaseEndTime = j3;
        this.currentTime = j4;
        this.expandType = num2;
        this.activityStatus = num3;
        this.drawStatus = num4;
        this.drawStyle = num5;
        this.drawDesc = str;
        this.localPassTime = j5;
        this.jumpLink = str2;
        this.getResultMessage = getResultMessage;
    }

    public /* synthetic */ IntegralExpInfoEntity(String str, String str2, Integer num, long j2, long j3, long j4, Integer num2, Integer num3, Integer num4, Integer num5, String str3, long j5, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? 0L : j2, (i & 16) != 0 ? 0L : j3, (i & 32) != 0 ? 0L : j4, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? null : num4, (i & 512) != 0 ? null : num5, (i & 1024) != 0 ? null : str3, (i & 2048) != 0 ? 0L : j5, (i & 4096) != 0 ? "" : str4, (i & 8192) != 0 ? "" : str5);
    }
}
