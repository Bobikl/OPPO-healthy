package com.heytap.nearx.net.quic;

import java.net.ProtocolException;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/nearx/net/quic/QuicProtocolException;", "Ljava/net/ProtocolException;", "msg", "", "(Ljava/lang/String;)V", "quic_extension_release"}, k = 1, mv = {1, 4, 2})
public final class QuicProtocolException extends ProtocolException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuicProtocolException(@NotNull String msg) {
        super(msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
