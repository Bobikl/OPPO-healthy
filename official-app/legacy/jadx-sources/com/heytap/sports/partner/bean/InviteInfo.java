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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006$"}, d2 = {"Lcom/heytap/sports/partner/bean/InviteInfo;", "", "inviterPhone", "", "inviterAvatar", "inviterName", "inviteStatus", "", "readStatus", "expireTime", "", "operationTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJ)V", "getExpireTime", "()J", "getInviteStatus", "()I", "getInviterAvatar", "()Ljava/lang/String;", "getInviterName", "getInviterPhone", "getOperationTime", "getReadStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "partner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class InviteInfo {
    public static final int $stable = 0;
    private final long expireTime;
    private final int inviteStatus;

    @NotNull
    private final String inviterAvatar;

    @NotNull
    private final String inviterName;

    @NotNull
    private final String inviterPhone;
    private final long operationTime;
    private final int readStatus;

    public InviteInfo() {
        this(null, null, null, 0, 0, 0L, 0L, 127, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getInviterPhone() {
        return this.inviterPhone;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInviterAvatar() {
        return this.inviterAvatar;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInviterName() {
        return this.inviterName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getInviteStatus() {
        return this.inviteStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getReadStatus() {
        return this.readStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getExpireTime() {
        return this.expireTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getOperationTime() {
        return this.operationTime;
    }

    @NotNull
    public final InviteInfo copy(@NotNull String inviterPhone, @NotNull String inviterAvatar, @NotNull String inviterName, int inviteStatus, int readStatus, long expireTime, long operationTime) {
        Intrinsics.checkNotNullParameter(inviterPhone, "inviterPhone");
        Intrinsics.checkNotNullParameter(inviterAvatar, "inviterAvatar");
        Intrinsics.checkNotNullParameter(inviterName, "inviterName");
        return new InviteInfo(inviterPhone, inviterAvatar, inviterName, inviteStatus, readStatus, expireTime, operationTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InviteInfo)) {
            return false;
        }
        InviteInfo inviteInfo = (InviteInfo) other;
        return Intrinsics.areEqual(this.inviterPhone, inviteInfo.inviterPhone) && Intrinsics.areEqual(this.inviterAvatar, inviteInfo.inviterAvatar) && Intrinsics.areEqual(this.inviterName, inviteInfo.inviterName) && this.inviteStatus == inviteInfo.inviteStatus && this.readStatus == inviteInfo.readStatus && this.expireTime == inviteInfo.expireTime && this.operationTime == inviteInfo.operationTime;
    }

    public final long getExpireTime() {
        return this.expireTime;
    }

    public final int getInviteStatus() {
        return this.inviteStatus;
    }

    @NotNull
    public final String getInviterAvatar() {
        return this.inviterAvatar;
    }

    @NotNull
    public final String getInviterName() {
        return this.inviterName;
    }

    @NotNull
    public final String getInviterPhone() {
        return this.inviterPhone;
    }

    public final long getOperationTime() {
        return this.operationTime;
    }

    public final int getReadStatus() {
        return this.readStatus;
    }

    public int hashCode() {
        return (((((((((((this.inviterPhone.hashCode() * 31) + this.inviterAvatar.hashCode()) * 31) + this.inviterName.hashCode()) * 31) + Integer.hashCode(this.inviteStatus)) * 31) + Integer.hashCode(this.readStatus)) * 31) + Long.hashCode(this.expireTime)) * 31) + Long.hashCode(this.operationTime);
    }

    @NotNull
    public String toString() {
        return "InviteInfo(inviterPhone=" + this.inviterPhone + ", inviterAvatar=" + this.inviterAvatar + ", inviterName=" + this.inviterName + ", inviteStatus=" + this.inviteStatus + ", readStatus=" + this.readStatus + ", expireTime=" + this.expireTime + ", operationTime=" + this.operationTime + ")";
    }

    public InviteInfo(@NotNull String inviterPhone, @NotNull String inviterAvatar, @NotNull String inviterName, int i, int i2, long j2, long j3) {
        Intrinsics.checkNotNullParameter(inviterPhone, "inviterPhone");
        Intrinsics.checkNotNullParameter(inviterAvatar, "inviterAvatar");
        Intrinsics.checkNotNullParameter(inviterName, "inviterName");
        this.inviterPhone = inviterPhone;
        this.inviterAvatar = inviterAvatar;
        this.inviterName = inviterName;
        this.inviteStatus = i;
        this.readStatus = i2;
        this.expireTime = j2;
        this.operationTime = j3;
    }

    public /* synthetic */ InviteInfo(String str, String str2, String str3, int i, int i2, long j2, long j3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? 0L : j2, (i3 & 64) != 0 ? 0L : j3);
    }
}
