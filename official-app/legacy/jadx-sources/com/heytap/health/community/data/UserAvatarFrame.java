package com.heytap.health.community.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u001c\u001a\u00020\u0017J\t\u0010\u001d\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/community/data/UserAvatarFrame;", "", "userObtainType", "", "frameId", "", "obtainTime", "avatarFrame", "Lcom/heytap/health/community/data/AvatarFrame;", "(IJJLcom/heytap/health/community/data/AvatarFrame;)V", "getAvatarFrame", "()Lcom/heytap/health/community/data/AvatarFrame;", "getFrameId", "()J", "getObtainTime", "getUserObtainType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getAvatarLink", "", "hashCode", "isObtain", "toString", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UserAvatarFrame {

    @Nullable
    private final AvatarFrame avatarFrame;
    private final long frameId;
    private final long obtainTime;
    private final int userObtainType;

    public UserAvatarFrame(int i, long j2, long j3, @Nullable AvatarFrame avatarFrame) {
        this.userObtainType = i;
        this.frameId = j2;
        this.obtainTime = j3;
        this.avatarFrame = avatarFrame;
    }

    public static /* synthetic */ UserAvatarFrame copy$default(UserAvatarFrame userAvatarFrame, int i, long j2, long j3, AvatarFrame avatarFrame, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userAvatarFrame.userObtainType;
        }
        if ((i2 & 2) != 0) {
            j2 = userAvatarFrame.frameId;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            j3 = userAvatarFrame.obtainTime;
        }
        long j5 = j3;
        if ((i2 & 8) != 0) {
            avatarFrame = userAvatarFrame.avatarFrame;
        }
        return userAvatarFrame.copy(i, j4, j5, avatarFrame);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUserObtainType() {
        return this.userObtainType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getFrameId() {
        return this.frameId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getObtainTime() {
        return this.obtainTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AvatarFrame getAvatarFrame() {
        return this.avatarFrame;
    }

    @NotNull
    public final UserAvatarFrame copy(int userObtainType, long frameId, long obtainTime, @Nullable AvatarFrame avatarFrame) {
        return new UserAvatarFrame(userObtainType, frameId, obtainTime, avatarFrame);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAvatarFrame)) {
            return false;
        }
        UserAvatarFrame userAvatarFrame = (UserAvatarFrame) other;
        return this.userObtainType == userAvatarFrame.userObtainType && this.frameId == userAvatarFrame.frameId && this.obtainTime == userAvatarFrame.obtainTime && Intrinsics.areEqual(this.avatarFrame, userAvatarFrame.avatarFrame);
    }

    @Nullable
    public final AvatarFrame getAvatarFrame() {
        return this.avatarFrame;
    }

    @NotNull
    public final String getAvatarLink() {
        PictureData pictureData;
        String objectUrl;
        AvatarFrame avatarFrame = this.avatarFrame;
        return (avatarFrame == null || (pictureData = avatarFrame.getPictureData()) == null || (objectUrl = pictureData.getObjectUrl()) == null) ? "" : objectUrl;
    }

    public final long getFrameId() {
        return this.frameId;
    }

    public final long getObtainTime() {
        return this.obtainTime;
    }

    public final int getUserObtainType() {
        return this.userObtainType;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.userObtainType) * 31) + Long.hashCode(this.frameId)) * 31) + Long.hashCode(this.obtainTime)) * 31;
        AvatarFrame avatarFrame = this.avatarFrame;
        return iHashCode + (avatarFrame == null ? 0 : avatarFrame.hashCode());
    }

    public final boolean isObtain() {
        return this.userObtainType == 2;
    }

    @NotNull
    public String toString() {
        return "UserAvatarFrame(userObtainType=" + this.userObtainType + ", frameId=" + this.frameId + ", obtainTime=" + this.obtainTime + ", avatarFrame=" + this.avatarFrame + ")";
    }
}
