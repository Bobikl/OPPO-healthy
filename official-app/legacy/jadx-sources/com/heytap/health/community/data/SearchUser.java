package com.heytap.health.community.data;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.h27;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u0011HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\u0083\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0007HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%¨\u00069"}, d2 = {"Lcom/heytap/health/community/data/SearchUser;", "", "encryptSsoid", "", "nickname", h27.FAMILY_KEY_PUSH_FRIEND_AVATAR, "userType", "", "userStatus", "bio", "bgImageUrl", "banFrom", "", "banTo", "statistic", "Lcom/heytap/health/community/data/UserStatistic;", "mutual", "Lcom/heytap/health/community/data/UserMutual;", "userAvatarFrame", "Lcom/heytap/health/community/data/UserAvatarFrame;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;JJLcom/heytap/health/community/data/UserStatistic;Lcom/heytap/health/community/data/UserMutual;Lcom/heytap/health/community/data/UserAvatarFrame;)V", "getAvatar", "()Ljava/lang/String;", "getBanFrom", "()J", "getBanTo", "getBgImageUrl", "getBio", "getEncryptSsoid", "getMutual", "()Lcom/heytap/health/community/data/UserMutual;", "getNickname", "getStatistic", "()Lcom/heytap/health/community/data/UserStatistic;", "getUserAvatarFrame", "()Lcom/heytap/health/community/data/UserAvatarFrame;", "getUserStatus", "()I", "getUserType", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "community_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SearchUser {

    @NotNull
    private final String avatar;
    private final long banFrom;
    private final long banTo;

    @NotNull
    private final String bgImageUrl;

    @NotNull
    private final String bio;

    @NotNull
    private final String encryptSsoid;

    @NotNull
    private final UserMutual mutual;

    @NotNull
    private final String nickname;

    @NotNull
    private final UserStatistic statistic;

    @Nullable
    private final UserAvatarFrame userAvatarFrame;
    private final int userStatus;
    private final int userType;

    public SearchUser(@NotNull String encryptSsoid, @NotNull String nickname, @NotNull String avatar, int i, int i2, @NotNull String bio, @NotNull String bgImageUrl, long j2, long j3, @NotNull UserStatistic statistic, @NotNull UserMutual mutual, @Nullable UserAvatarFrame userAvatarFrame) {
        Intrinsics.checkNotNullParameter(encryptSsoid, "encryptSsoid");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(bio, "bio");
        Intrinsics.checkNotNullParameter(bgImageUrl, "bgImageUrl");
        Intrinsics.checkNotNullParameter(statistic, "statistic");
        Intrinsics.checkNotNullParameter(mutual, "mutual");
        this.encryptSsoid = encryptSsoid;
        this.nickname = nickname;
        this.avatar = avatar;
        this.userType = i;
        this.userStatus = i2;
        this.bio = bio;
        this.bgImageUrl = bgImageUrl;
        this.banFrom = j2;
        this.banTo = j3;
        this.statistic = statistic;
        this.mutual = mutual;
        this.userAvatarFrame = userAvatarFrame;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEncryptSsoid() {
        return this.encryptSsoid;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final UserStatistic getStatistic() {
        return this.statistic;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final UserMutual getMutual() {
        return this.mutual;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final UserAvatarFrame getUserAvatarFrame() {
        return this.userAvatarFrame;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    @NotNull
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

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBio() {
        return this.bio;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBgImageUrl() {
        return this.bgImageUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getBanFrom() {
        return this.banFrom;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getBanTo() {
        return this.banTo;
    }

    @NotNull
    public final SearchUser copy(@NotNull String encryptSsoid, @NotNull String nickname, @NotNull String avatar, int userType, int userStatus, @NotNull String bio, @NotNull String bgImageUrl, long banFrom, long banTo, @NotNull UserStatistic statistic, @NotNull UserMutual mutual, @Nullable UserAvatarFrame userAvatarFrame) {
        Intrinsics.checkNotNullParameter(encryptSsoid, "encryptSsoid");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(bio, "bio");
        Intrinsics.checkNotNullParameter(bgImageUrl, "bgImageUrl");
        Intrinsics.checkNotNullParameter(statistic, "statistic");
        Intrinsics.checkNotNullParameter(mutual, "mutual");
        return new SearchUser(encryptSsoid, nickname, avatar, userType, userStatus, bio, bgImageUrl, banFrom, banTo, statistic, mutual, userAvatarFrame);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchUser)) {
            return false;
        }
        SearchUser searchUser = (SearchUser) other;
        return Intrinsics.areEqual(this.encryptSsoid, searchUser.encryptSsoid) && Intrinsics.areEqual(this.nickname, searchUser.nickname) && Intrinsics.areEqual(this.avatar, searchUser.avatar) && this.userType == searchUser.userType && this.userStatus == searchUser.userStatus && Intrinsics.areEqual(this.bio, searchUser.bio) && Intrinsics.areEqual(this.bgImageUrl, searchUser.bgImageUrl) && this.banFrom == searchUser.banFrom && this.banTo == searchUser.banTo && Intrinsics.areEqual(this.statistic, searchUser.statistic) && Intrinsics.areEqual(this.mutual, searchUser.mutual) && Intrinsics.areEqual(this.userAvatarFrame, searchUser.userAvatarFrame);
    }

    @NotNull
    public final String getAvatar() {
        return this.avatar;
    }

    public final long getBanFrom() {
        return this.banFrom;
    }

    public final long getBanTo() {
        return this.banTo;
    }

    @NotNull
    public final String getBgImageUrl() {
        return this.bgImageUrl;
    }

    @NotNull
    public final String getBio() {
        return this.bio;
    }

    @NotNull
    public final String getEncryptSsoid() {
        return this.encryptSsoid;
    }

    @NotNull
    public final UserMutual getMutual() {
        return this.mutual;
    }

    @NotNull
    public final String getNickname() {
        return this.nickname;
    }

    @NotNull
    public final UserStatistic getStatistic() {
        return this.statistic;
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
        int iHashCode = ((((((((((((((((((((this.encryptSsoid.hashCode() * 31) + this.nickname.hashCode()) * 31) + this.avatar.hashCode()) * 31) + Integer.hashCode(this.userType)) * 31) + Integer.hashCode(this.userStatus)) * 31) + this.bio.hashCode()) * 31) + this.bgImageUrl.hashCode()) * 31) + Long.hashCode(this.banFrom)) * 31) + Long.hashCode(this.banTo)) * 31) + this.statistic.hashCode()) * 31) + this.mutual.hashCode()) * 31;
        UserAvatarFrame userAvatarFrame = this.userAvatarFrame;
        return iHashCode + (userAvatarFrame == null ? 0 : userAvatarFrame.hashCode());
    }

    @NotNull
    public String toString() {
        return "SearchUser(encryptSsoid=" + this.encryptSsoid + ", nickname=" + this.nickname + ", avatar=" + this.avatar + ", userType=" + this.userType + ", userStatus=" + this.userStatus + ", bio=" + this.bio + ", bgImageUrl=" + this.bgImageUrl + ", banFrom=" + this.banFrom + ", banTo=" + this.banTo + ", statistic=" + this.statistic + ", mutual=" + this.mutual + ", userAvatarFrame=" + this.userAvatarFrame + ")";
    }
}
