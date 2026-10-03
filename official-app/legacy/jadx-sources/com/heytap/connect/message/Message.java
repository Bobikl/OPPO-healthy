package com.heytap.connect.message;

import com.heytap.connect.api.message.MessageSerializer;
import com.oplus.aiunit.vision.v5c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\u0006\u0010\u0016\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b0\u00101J!\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010\u000eR\"\u0010\u0017\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010'\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010*R\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b+\u0010\fR\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010,\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/heytap/connect/message/Message;", "", "Lcom/heytap/connect/api/message/MessageSerializer;", "serializer", "", "isResend", "Lcom/oplus/aiunit/vision/v5c;", "toMqttMessage$connect_release", "(Lcom/heytap/connect/api/message/MessageSerializer;Z)Lcom/oplus/aiunit/vision/v5c;", "toMqttMessage", "", "component1", "()S", "component2", "()Ljava/lang/Object;", "", "component3", "()Ljava/lang/String;", "component4", "component5", "()Z", "messageType", "body", "messageId", "channel", "logout", "copy", "(SLjava/lang/Object;Ljava/lang/String;SZ)Lcom/heytap/connect/message/Message;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "S", "getMessageType", "Ljava/lang/Object;", "getBody", "Ljava/lang/String;", "getMessageId", "setMessageId", "(Ljava/lang/String;)V", "getChannel", "Z", "getLogout", "setLogout", "(Z)V", "<init>", "(SLjava/lang/Object;Ljava/lang/String;SZ)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Message {

    @NotNull
    private final Object body;
    private final short channel;
    private boolean logout;

    @NotNull
    private String messageId;
    private final short messageType;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(short s, @NotNull Object body) {
        this(s, body, null, (short) 0, false, 28, null);
        Intrinsics.checkNotNullParameter(body, "body");
    }

    public static /* synthetic */ Message copy$default(Message message, short s, Object obj, String str, short s2, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            s = message.messageType;
        }
        if ((i & 2) != 0) {
            obj = message.body;
        }
        Object obj3 = obj;
        if ((i & 4) != 0) {
            str = message.messageId;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            s2 = message.channel;
        }
        short s3 = s2;
        if ((i & 16) != 0) {
            z = message.logout;
        }
        return message.copy(s, obj3, str2, s3, z);
    }

    public static /* synthetic */ v5c toMqttMessage$connect_release$default(Message message, MessageSerializer messageSerializer, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return message.toMqttMessage$connect_release(messageSerializer, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final short getMessageType() {
        return this.messageType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getBody() {
        return this.body;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final short getChannel() {
        return this.channel;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getLogout() {
        return this.logout;
    }

    @NotNull
    public final Message copy(short messageType, @NotNull Object body, @NotNull String messageId, short channel, boolean logout) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new Message(messageType, body, messageId, channel, logout);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        return this.messageType == message.messageType && Intrinsics.areEqual(this.body, message.body) && Intrinsics.areEqual(this.messageId, message.messageId) && this.channel == message.channel && this.logout == message.logout;
    }

    @NotNull
    public final Object getBody() {
        return this.body;
    }

    public final short getChannel() {
        return this.channel;
    }

    public final boolean getLogout() {
        return this.logout;
    }

    @NotNull
    public final String getMessageId() {
        return this.messageId;
    }

    public final short getMessageType() {
        return this.messageType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((((Short.hashCode(this.messageType) * 31) + this.body.hashCode()) * 31) + this.messageId.hashCode()) * 31) + Short.hashCode(this.channel)) * 31;
        boolean z = this.logout;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    public final void setLogout(boolean z) {
        this.logout = z;
    }

    public final void setMessageId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.messageId = str;
    }

    @NotNull
    public final v5c toMqttMessage$connect_release(@NotNull MessageSerializer serializer, boolean isResend) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return MessageCreator.INSTANCE.createPublishMessage(this.channel, this.messageType, this.messageId, serializer.encode(this.body), isResend);
    }

    @NotNull
    public String toString() {
        return "Message(messageType=" + ((int) this.messageType) + ", body=" + this.body + ", messageId=" + this.messageId + ", channel=" + ((int) this.channel) + ", logout=" + this.logout + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(short s, @NotNull Object body, @NotNull String messageId) {
        this(s, body, messageId, (short) 0, false, 24, null);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Message(short s, @NotNull Object body, @NotNull String messageId, short s2) {
        this(s, body, messageId, s2, false, 16, null);
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
    }

    @JvmOverloads
    public Message(short s, @NotNull Object body, @NotNull String messageId, short s2, boolean z) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.messageType = s;
        this.body = body;
        this.messageId = messageId;
        this.channel = s2;
        this.logout = z;
    }

    public /* synthetic */ Message(short s, Object obj, String str, short s2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(s, obj, (i & 4) != 0 ? MessageID.INSTANCE.newMessageId$connect_release() : str, (i & 8) != 0 ? (short) 3 : s2, (i & 16) != 0 ? true : z);
    }
}
