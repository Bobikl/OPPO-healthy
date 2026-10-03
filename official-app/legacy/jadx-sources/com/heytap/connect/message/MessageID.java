package com.heytap.connect.message;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/heytap/connect/message/MessageID;", "", "", "newMessageId$connect_release", "()Ljava/lang/String;", "newMessageId", "getRandomId", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final class MessageID {

    @NotNull
    public static final MessageID INSTANCE = new MessageID();

    private MessageID() {
    }

    @NotNull
    public final String getRandomId() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        return StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null);
    }

    @NotNull
    public final String newMessageId$connect_release() {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        return string;
    }
}
