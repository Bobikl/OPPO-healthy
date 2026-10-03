package com.heytap.connect.api.message;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/heytap/connect/api/message/IMessageSerializer;", "In", "Out", "", "body", "", "encode", "(Ljava/lang/Object;)[B", "decode", "([B)Ljava/lang/Object;", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IMessageSerializer<In, Out> {
    Out decode(@NotNull byte[] body);

    @NotNull
    byte[] encode(In body);
}
