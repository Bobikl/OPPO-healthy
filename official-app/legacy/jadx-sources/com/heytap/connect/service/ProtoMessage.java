package com.heytap.connect.service;

import com.heytap.connect.message.Message;
import com.heytap.connect.service.proto.UplinkData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b%\u0010&J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u0007JB\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0007J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0012\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007R\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001e\u0010\u0007R\u0019\u0010\u000f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001f\u0010\u0007R\u0019\u0010\u0010\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b \u0010\u0007R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010!\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/heytap/connect/service/ProtoMessage;", "", "Lcom/heytap/connect/message/Message;", "toMessage", "()Lcom/heytap/connect/message/Message;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "", "component4", "()Z", "component5", "serverName", "cmd", "dataPayload", "logout", "messageId", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/heytap/connect/service/ProtoMessage;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessageId", "getServerName", "getCmd", "getDataPayload", "Z", "getLogout", "setLogout", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class ProtoMessage {

    @NotNull
    private final String cmd;

    @NotNull
    private final String dataPayload;
    private boolean logout;

    @NotNull
    private final String messageId;

    @NotNull
    private final String serverName;

    public ProtoMessage(@NotNull String serverName, @NotNull String cmd, @NotNull String dataPayload, boolean z, @NotNull String messageId) {
        Intrinsics.checkNotNullParameter(serverName, "serverName");
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(dataPayload, "dataPayload");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.serverName = serverName;
        this.cmd = cmd;
        this.dataPayload = dataPayload;
        this.logout = z;
        this.messageId = messageId;
    }

    public static /* synthetic */ ProtoMessage copy$default(ProtoMessage protoMessage, String str, String str2, String str3, boolean z, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = protoMessage.serverName;
        }
        if ((i & 2) != 0) {
            str2 = protoMessage.cmd;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = protoMessage.dataPayload;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            z = protoMessage.logout;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = protoMessage.messageId;
        }
        return protoMessage.copy(str, str5, str6, z2, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServerName() {
        return this.serverName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCmd() {
        return this.cmd;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDataPayload() {
        return this.dataPayload;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getLogout() {
        return this.logout;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final ProtoMessage copy(@NotNull String serverName, @NotNull String cmd, @NotNull String dataPayload, boolean logout, @NotNull String messageId) {
        Intrinsics.checkNotNullParameter(serverName, "serverName");
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(dataPayload, "dataPayload");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new ProtoMessage(serverName, cmd, dataPayload, logout, messageId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProtoMessage)) {
            return false;
        }
        ProtoMessage protoMessage = (ProtoMessage) other;
        return Intrinsics.areEqual(this.serverName, protoMessage.serverName) && Intrinsics.areEqual(this.cmd, protoMessage.cmd) && Intrinsics.areEqual(this.dataPayload, protoMessage.dataPayload) && this.logout == protoMessage.logout && Intrinsics.areEqual(this.messageId, protoMessage.messageId);
    }

    @NotNull
    public final String getCmd() {
        return this.cmd;
    }

    @NotNull
    public final String getDataPayload() {
        return this.dataPayload;
    }

    public final boolean getLogout() {
        return this.logout;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final String getServerName() {
        return this.serverName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((this.serverName.hashCode() * 31) + this.cmd.hashCode()) * 31) + this.dataPayload.hashCode()) * 31;
        boolean z = this.logout;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.messageId.hashCode();
    }

    public final void setLogout(boolean z) {
        this.logout = z;
    }

    @NotNull
    public final Message toMessage() {
        return new Message((short) 1, new UplinkData(this.serverName, this.cmd, null, null, null, null, null, this.dataPayload, null, null, 892, null), this.messageId, (short) 0, this.logout, 8, null);
    }

    @NotNull
    public String toString() {
        return "ProtoMessage(serverName=" + this.serverName + ", cmd=" + this.cmd + ", dataPayload=" + this.dataPayload + ", logout=" + this.logout + ", messageId=" + this.messageId + ')';
    }

    public /* synthetic */ ProtoMessage(String str, String str2, String str3, boolean z, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? true : z, str4);
    }
}
