package com.heytap.health.community.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\fHÆ\u0003J]\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\nHÖ\u0001J\t\u0010(\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006)"}, d2 = {"Lcom/heytap/health/community/data/AvatarFrame;", "", "frameId", "", "name", "", "startTime", "endTime", "obtainCondition", "animationType", "", "pictureData", "Lcom/heytap/health/community/data/PictureData;", "grayPictureData", "(JLjava/lang/String;JJLjava/lang/String;ILcom/heytap/health/community/data/PictureData;Lcom/heytap/health/community/data/PictureData;)V", "getAnimationType", "()I", "getEndTime", "()J", "getFrameId", "getGrayPictureData", "()Lcom/heytap/health/community/data/PictureData;", "getName", "()Ljava/lang/String;", "getObtainCondition", "getPictureData", "getStartTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AvatarFrame {
    private final int animationType;
    private final long endTime;
    private final long frameId;

    @Nullable
    private final PictureData grayPictureData;

    @NotNull
    private final String name;

    @NotNull
    private final String obtainCondition;

    @Nullable
    private final PictureData pictureData;
    private final long startTime;

    public AvatarFrame(long j2, @NotNull String name, long j3, long j4, @NotNull String obtainCondition, int i, @Nullable PictureData pictureData, @Nullable PictureData pictureData2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(obtainCondition, "obtainCondition");
        this.frameId = j2;
        this.name = name;
        this.startTime = j3;
        this.endTime = j4;
        this.obtainCondition = obtainCondition;
        this.animationType = i;
        this.pictureData = pictureData;
        this.grayPictureData = pictureData2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getFrameId() {
        return this.frameId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getObtainCondition() {
        return this.obtainCondition;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAnimationType() {
        return this.animationType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PictureData getPictureData() {
        return this.pictureData;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PictureData getGrayPictureData() {
        return this.grayPictureData;
    }

    @NotNull
    public final AvatarFrame copy(long frameId, @NotNull String name, long startTime, long endTime, @NotNull String obtainCondition, int animationType, @Nullable PictureData pictureData, @Nullable PictureData grayPictureData) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(obtainCondition, "obtainCondition");
        return new AvatarFrame(frameId, name, startTime, endTime, obtainCondition, animationType, pictureData, grayPictureData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvatarFrame)) {
            return false;
        }
        AvatarFrame avatarFrame = (AvatarFrame) other;
        return this.frameId == avatarFrame.frameId && Intrinsics.areEqual(this.name, avatarFrame.name) && this.startTime == avatarFrame.startTime && this.endTime == avatarFrame.endTime && Intrinsics.areEqual(this.obtainCondition, avatarFrame.obtainCondition) && this.animationType == avatarFrame.animationType && Intrinsics.areEqual(this.pictureData, avatarFrame.pictureData) && Intrinsics.areEqual(this.grayPictureData, avatarFrame.grayPictureData);
    }

    public final int getAnimationType() {
        return this.animationType;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getFrameId() {
        return this.frameId;
    }

    @Nullable
    public final PictureData getGrayPictureData() {
        return this.grayPictureData;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getObtainCondition() {
        return this.obtainCondition;
    }

    @Nullable
    public final PictureData getPictureData() {
        return this.pictureData;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Long.hashCode(this.frameId) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31) + this.obtainCondition.hashCode()) * 31) + Integer.hashCode(this.animationType)) * 31;
        PictureData pictureData = this.pictureData;
        int iHashCode2 = (iHashCode + (pictureData == null ? 0 : pictureData.hashCode())) * 31;
        PictureData pictureData2 = this.grayPictureData;
        return iHashCode2 + (pictureData2 != null ? pictureData2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AvatarFrame(frameId=" + this.frameId + ", name=" + this.name + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", obtainCondition=" + this.obtainCondition + ", animationType=" + this.animationType + ", pictureData=" + this.pictureData + ", grayPictureData=" + this.grayPictureData + ")";
    }
}
