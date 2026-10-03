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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\tHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006$"}, d2 = {"Lcom/heytap/sports/partner/bean/MemberInfo;", "", "groupId", "", "memberAvatar", "", "memberSsoid", "memberName", "noticeStatus", "", "inviteTime", "groupLeader", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJI)V", "getGroupId", "()J", "getGroupLeader", "()I", "getInviteTime", "getMemberAvatar", "()Ljava/lang/String;", "getMemberName", "getMemberSsoid", "getNoticeStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "partner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MemberInfo {
    public static final int $stable = 0;
    private final long groupId;
    private final int groupLeader;
    private final long inviteTime;

    @NotNull
    private final String memberAvatar;

    @NotNull
    private final String memberName;

    @NotNull
    private final String memberSsoid;
    private final int noticeStatus;

    public MemberInfo() {
        this(0L, null, null, null, 0, 0L, 0, 127, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getGroupId() {
        return this.groupId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMemberAvatar() {
        return this.memberAvatar;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMemberSsoid() {
        return this.memberSsoid;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMemberName() {
        return this.memberName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getNoticeStatus() {
        return this.noticeStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getInviteTime() {
        return this.inviteTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getGroupLeader() {
        return this.groupLeader;
    }

    @NotNull
    public final MemberInfo copy(long groupId, @NotNull String memberAvatar, @NotNull String memberSsoid, @NotNull String memberName, int noticeStatus, long inviteTime, int groupLeader) {
        Intrinsics.checkNotNullParameter(memberAvatar, "memberAvatar");
        Intrinsics.checkNotNullParameter(memberSsoid, "memberSsoid");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        return new MemberInfo(groupId, memberAvatar, memberSsoid, memberName, noticeStatus, inviteTime, groupLeader);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberInfo)) {
            return false;
        }
        MemberInfo memberInfo = (MemberInfo) other;
        return this.groupId == memberInfo.groupId && Intrinsics.areEqual(this.memberAvatar, memberInfo.memberAvatar) && Intrinsics.areEqual(this.memberSsoid, memberInfo.memberSsoid) && Intrinsics.areEqual(this.memberName, memberInfo.memberName) && this.noticeStatus == memberInfo.noticeStatus && this.inviteTime == memberInfo.inviteTime && this.groupLeader == memberInfo.groupLeader;
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public final int getGroupLeader() {
        return this.groupLeader;
    }

    public final long getInviteTime() {
        return this.inviteTime;
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

    public final int getNoticeStatus() {
        return this.noticeStatus;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.groupId) * 31) + this.memberAvatar.hashCode()) * 31) + this.memberSsoid.hashCode()) * 31) + this.memberName.hashCode()) * 31) + Integer.hashCode(this.noticeStatus)) * 31) + Long.hashCode(this.inviteTime)) * 31) + Integer.hashCode(this.groupLeader);
    }

    @NotNull
    public String toString() {
        return "MemberInfo(groupId=" + this.groupId + ", memberAvatar=" + this.memberAvatar + ", memberSsoid=" + this.memberSsoid + ", memberName=" + this.memberName + ", noticeStatus=" + this.noticeStatus + ", inviteTime=" + this.inviteTime + ", groupLeader=" + this.groupLeader + ")";
    }

    public MemberInfo(long j2, @NotNull String memberAvatar, @NotNull String memberSsoid, @NotNull String memberName, int i, long j3, int i2) {
        Intrinsics.checkNotNullParameter(memberAvatar, "memberAvatar");
        Intrinsics.checkNotNullParameter(memberSsoid, "memberSsoid");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        this.groupId = j2;
        this.memberAvatar = memberAvatar;
        this.memberSsoid = memberSsoid;
        this.memberName = memberName;
        this.noticeStatus = i;
        this.inviteTime = j3;
        this.groupLeader = i2;
    }

    public /* synthetic */ MemberInfo(long j2, String str, String str2, String str3, int i, long j3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j2, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0L : j3, (i3 & 64) != 0 ? 0 : i2);
    }
}
