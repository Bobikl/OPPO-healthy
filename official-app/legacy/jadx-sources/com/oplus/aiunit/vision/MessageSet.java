package com.oplus.aiunit.vision;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.dzb, reason: from toString */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\t\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R.\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/dzb;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "setMessageSend", "(Ljava/util/Map;)V", "messageSend", "setMessageReply", "messageReply", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "card-instant_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class MessageSet {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public Map<Integer, String> messageSend;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public Map<Integer, String> messageReply;

    public MessageSet(@NotNull Map<Integer, String> messageSend, @NotNull Map<Integer, String> messageReply) {
        Intrinsics.checkNotNullParameter(messageSend, "messageSend");
        Intrinsics.checkNotNullParameter(messageReply, "messageReply");
        this.messageSend = messageSend;
        this.messageReply = messageReply;
    }

    @NotNull
    public final Map<Integer, String> a() {
        return this.messageReply;
    }

    @NotNull
    public final Map<Integer, String> b() {
        return this.messageSend;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageSet)) {
            return false;
        }
        MessageSet messageSet = (MessageSet) other;
        return Intrinsics.areEqual(this.messageSend, messageSet.messageSend) && Intrinsics.areEqual(this.messageReply, messageSet.messageReply);
    }

    public int hashCode() {
        return (this.messageSend.hashCode() * 31) + this.messageReply.hashCode();
    }

    @NotNull
    public String toString() {
        return "MessageSet(messageSend=" + this.messageSend + ", messageReply=" + this.messageReply + ")";
    }
}
