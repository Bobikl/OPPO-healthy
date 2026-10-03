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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/heytap/sports/partner/bean/GroupMessage;", "", "messageId", "", "messageType", "", "message", "memberAvatar", "memberSsoid", "memberName", "readStatus", "readTime", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V", "getMemberAvatar", "()Ljava/lang/String;", "getMemberName", "getMemberSsoid", "getMessage", "getMessageId", "getMessageType", "()I", "getReadStatus", "getReadTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "partner_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GroupMessage {
    public static final int $stable = 0;

    @NotNull
    private final String memberAvatar;

    @NotNull
    private final String memberName;

    @NotNull
    private final String memberSsoid;

    @NotNull
    private final String message;

    @NotNull
    private final String messageId;
    private final int messageType;
    private final int readStatus;
    private final long readTime;

    public GroupMessage() {
        this(null, 0, null, null, null, null, 0, 0L, 255, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMessageType() {
        return this.messageType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMemberAvatar() {
        return this.memberAvatar;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMemberSsoid() {
        return this.memberSsoid;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMemberName() {
        return this.memberName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getReadStatus() {
        return this.readStatus;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getReadTime() {
        return this.readTime;
    }

    @NotNull
    public final GroupMessage copy(@NotNull String messageId, int messageType, @NotNull String message, @NotNull String memberAvatar, @NotNull String memberSsoid, @NotNull String memberName, int readStatus, long readTime) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(memberAvatar, "memberAvatar");
        Intrinsics.checkNotNullParameter(memberSsoid, "memberSsoid");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        return new GroupMessage(messageId, messageType, message, memberAvatar, memberSsoid, memberName, readStatus, readTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupMessage)) {
            return false;
        }
        GroupMessage groupMessage = (GroupMessage) other;
        return Intrinsics.areEqual(this.messageId, groupMessage.messageId) && this.messageType == groupMessage.messageType && Intrinsics.areEqual(this.message, groupMessage.message) && Intrinsics.areEqual(this.memberAvatar, groupMessage.memberAvatar) && Intrinsics.areEqual(this.memberSsoid, groupMessage.memberSsoid) && Intrinsics.areEqual(this.memberName, groupMessage.memberName) && this.readStatus == groupMessage.readStatus && this.readTime == groupMessage.readTime;
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

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    public final int getMessageType() {
        return this.messageType;
    }

    public final int getReadStatus() {
        return this.readStatus;
    }

    public final long getReadTime() {
        return this.readTime;
    }

    public int hashCode() {
        return (((((((((((((this.messageId.hashCode() * 31) + Integer.hashCode(this.messageType)) * 31) + this.message.hashCode()) * 31) + this.memberAvatar.hashCode()) * 31) + this.memberSsoid.hashCode()) * 31) + this.memberName.hashCode()) * 31) + Integer.hashCode(this.readStatus)) * 31) + Long.hashCode(this.readTime);
    }

    @NotNull
    public String toString() {
        return "GroupMessage(messageId=" + this.messageId + ", messageType=" + this.messageType + ", message=" + this.message + ", memberAvatar=" + this.memberAvatar + ", memberSsoid=" + this.memberSsoid + ", memberName=" + this.memberName + ", readStatus=" + this.readStatus + ", readTime=" + this.readTime + ")";
    }

    public GroupMessage(@NotNull String messageId, int i, @NotNull String message, @NotNull String memberAvatar, @NotNull String memberSsoid, @NotNull String memberName, int i2, long j2) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(memberAvatar, "memberAvatar");
        Intrinsics.checkNotNullParameter(memberSsoid, "memberSsoid");
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        this.messageId = messageId;
        this.messageType = i;
        this.message = message;
        this.memberAvatar = memberAvatar;
        this.memberSsoid = memberSsoid;
        this.memberName = memberName;
        this.readStatus = i2;
        this.readTime = j2;
    }

    public /* synthetic */ GroupMessage(String str, int i, String str2, String str3, String str4, String str5, int i2, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? 0L : j2);
    }
}
