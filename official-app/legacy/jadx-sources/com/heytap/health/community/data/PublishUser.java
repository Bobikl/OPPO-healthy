package com.heytap.health.community.data;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.h27;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006!"}, d2 = {"Lcom/heytap/health/community/data/PublishUser;", "", "encryptSsoid", "", "nickname", h27.FAMILY_KEY_PUSH_FRIEND_AVATAR, "userType", "", "userStatus", "userAvatarFrame", "Lcom/heytap/health/community/data/UserAvatarFrame;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/heytap/health/community/data/UserAvatarFrame;)V", "getAvatar", "()Ljava/lang/String;", "getEncryptSsoid", "getNickname", "getUserAvatarFrame", "()Lcom/heytap/health/community/data/UserAvatarFrame;", "getUserStatus", "()I", "getUserType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PublishUser {

    @Nullable
    private final String avatar;

    @Nullable
    private final String encryptSsoid;

    @Nullable
    private final String nickname;

    @Nullable
    private final UserAvatarFrame userAvatarFrame;
    private final int userStatus;
    private final int userType;

    public PublishUser(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, @Nullable UserAvatarFrame userAvatarFrame) {
        this.encryptSsoid = str;
        this.nickname = str2;
        this.avatar = str3;
        this.userType = i;
        this.userStatus = i2;
        this.userAvatarFrame = userAvatarFrame;
    }

    public static /* synthetic */ PublishUser copy$default(PublishUser publishUser, String str, String str2, String str3, int i, int i2, UserAvatarFrame userAvatarFrame, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = publishUser.encryptSsoid;
        }
        if ((i3 & 2) != 0) {
            str2 = publishUser.nickname;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            str3 = publishUser.avatar;
        }
        String str5 = str3;
        if ((i3 & 8) != 0) {
            i = publishUser.userType;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = publishUser.userStatus;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            userAvatarFrame = publishUser.userAvatarFrame;
        }
        return publishUser.copy(str, str4, str5, i4, i5, userAvatarFrame);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEncryptSsoid() {
        return this.encryptSsoid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getUserType() {
        return this.userType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getUserStatus() {
        return this.userStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final UserAvatarFrame getUserAvatarFrame() {
        return this.userAvatarFrame;
    }

    @NotNull
    public final PublishUser copy(@Nullable String encryptSsoid, @Nullable String nickname, @Nullable String avatar, int userType, int userStatus, @Nullable UserAvatarFrame userAvatarFrame) {
        return new PublishUser(encryptSsoid, nickname, avatar, userType, userStatus, userAvatarFrame);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublishUser)) {
            return false;
        }
        PublishUser publishUser = (PublishUser) other;
        return Intrinsics.areEqual(this.encryptSsoid, publishUser.encryptSsoid) && Intrinsics.areEqual(this.nickname, publishUser.nickname) && Intrinsics.areEqual(this.avatar, publishUser.avatar) && this.userType == publishUser.userType && this.userStatus == publishUser.userStatus && Intrinsics.areEqual(this.userAvatarFrame, publishUser.userAvatarFrame);
    }

    @Nullable
    public final String getAvatar() {
        return this.avatar;
    }

    @Nullable
    public final String getEncryptSsoid() {
        return this.encryptSsoid;
    }

    @Nullable
    public final String getNickname() {
        return this.nickname;
    }

    @Nullable
    public final UserAvatarFrame getUserAvatarFrame() {
        return this.userAvatarFrame;
    }

    public final int getUserStatus() {
        return this.userStatus;
    }

    public final int getUserType() {
        return this.userType;
    }

    public int hashCode() {
        String str = this.encryptSsoid;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nickname;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.avatar;
        int iHashCode3 = (((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.userType)) * 31) + Integer.hashCode(this.userStatus)) * 31;
        UserAvatarFrame userAvatarFrame = this.userAvatarFrame;
        return iHashCode3 + (userAvatarFrame != null ? userAvatarFrame.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PublishUser(encryptSsoid=" + this.encryptSsoid + ", nickname=" + this.nickname + ", avatar=" + this.avatar + ", userType=" + this.userType + ", userStatus=" + this.userStatus + ", userAvatarFrame=" + this.userAvatarFrame + ")";
    }
}
