package com.heytap.sports.partner.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0007HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006'"}, d2 = {"Lcom/heytap/sports/partner/bean/Achievement;", "", "memberAvatar", "", "memberSsoid", "memberName", "date", "", "achievementId", "achievementType", "achievementContent", "createTime", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;J)V", "getAchievementContent", "()Ljava/lang/String;", "getAchievementId", "getAchievementType", "()I", "getCreateTime", "()J", "getDate", "getMemberAvatar", "getMemberName", "getMemberSsoid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "partner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Achievement {
    public static final int $stable = 0;

    @NotNull
    private final String achievementContent;

    @NotNull
    private final String achievementId;
    private final int achievementType;
    private final long createTime;
    private final int date;

    @NotNull
    private final String memberAvatar;

    @NotNull
    private final String memberName;

    @NotNull
    private final String memberSsoid;

    public Achievement() {
        this(null, null, null, 0, null, 0, null, 0L, 255, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMemberAvatar() {
        return this.memberAvatar;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMemberSsoid() {
        return this.memberSsoid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMemberName() {
        return this.memberName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDate() {
        return this.date;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAchievementId() {
        return this.achievementId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getAchievementType() {
        return this.achievementType;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAchievementContent() {
        return this.achievementContent;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    @NotNull
    public final Achievement copy(@NotNull String memberAvatar, @NotNull String memberSsoid, @NotNull String memberName, int date, @NotNull String achievementId, int achievementType, @NotNull String achievementContent, long createTime) {
        Intrinsics.checkNotNullParameter(memberAvatar, "memberAvatar");
        Intrinsics.checkNotNullParameter(memberSsoid, "memberSsoid");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        Intrinsics.checkNotNullParameter(achievementId, "achievementId");
        Intrinsics.checkNotNullParameter(achievementContent, "achievementContent");
        return new Achievement(memberAvatar, memberSsoid, memberName, date, achievementId, achievementType, achievementContent, createTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Achievement)) {
            return false;
        }
        Achievement achievement = (Achievement) other;
        return Intrinsics.areEqual(this.memberAvatar, achievement.memberAvatar) && Intrinsics.areEqual(this.memberSsoid, achievement.memberSsoid) && Intrinsics.areEqual(this.memberName, achievement.memberName) && this.date == achievement.date && Intrinsics.areEqual(this.achievementId, achievement.achievementId) && this.achievementType == achievement.achievementType && Intrinsics.areEqual(this.achievementContent, achievement.achievementContent) && this.createTime == achievement.createTime;
    }

    @NotNull
    public final String getAchievementContent() {
        return this.achievementContent;
    }

    @NotNull
    public final String getAchievementId() {
        return this.achievementId;
    }

    public final int getAchievementType() {
        return this.achievementType;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getDate() {
        return this.date;
    }

    @NotNull
    public final String getMemberAvatar() {
        return this.memberAvatar;
    }

    @NotNull
    public final String getMemberName() {
        return this.memberName;
    }

    @NotNull
    public final String getMemberSsoid() {
        return this.memberSsoid;
    }

    public int hashCode() {
        return (((((((((((((this.memberAvatar.hashCode() * 31) + this.memberSsoid.hashCode()) * 31) + this.memberName.hashCode()) * 31) + Integer.hashCode(this.date)) * 31) + this.achievementId.hashCode()) * 31) + Integer.hashCode(this.achievementType)) * 31) + this.achievementContent.hashCode()) * 31) + Long.hashCode(this.createTime);
    }

    @NotNull
    public String toString() {
        return "Achievement(memberAvatar=" + this.memberAvatar + ", memberSsoid=" + this.memberSsoid + ", memberName=" + this.memberName + ", date=" + this.date + ", achievementId=" + this.achievementId + ", achievementType=" + this.achievementType + ", achievementContent=" + this.achievementContent + ", createTime=" + this.createTime + ")";
    }

    public Achievement(@NotNull String memberAvatar, @NotNull String memberSsoid, @NotNull String memberName, int i, @NotNull String achievementId, int i2, @NotNull String achievementContent, long j2) {
        Intrinsics.checkNotNullParameter(memberAvatar, "memberAvatar");
        Intrinsics.checkNotNullParameter(memberSsoid, "memberSsoid");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        Intrinsics.checkNotNullParameter(achievementId, "achievementId");
        Intrinsics.checkNotNullParameter(achievementContent, "achievementContent");
        this.memberAvatar = memberAvatar;
        this.memberSsoid = memberSsoid;
        this.memberName = memberName;
        this.date = i;
        this.achievementId = achievementId;
        this.achievementType = i2;
        this.achievementContent = achievementContent;
        this.createTime = j2;
    }

    public /* synthetic */ Achievement(String str, String str2, String str3, int i, String str4, int i2, String str5, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? 0L : j2);
    }
}
