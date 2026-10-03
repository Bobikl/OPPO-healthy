package com.oplus.pantaconnect.sdk.ext;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, d2 = {"sensitive", "", "toInt32", "", "", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ByteArrayExtKt {
    @NotNull
    public static final String sensitive(@NotNull String str) {
        StringBuilder sb = new StringBuilder("**");
        String strSubstring = str.substring(str.length() >> 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    public static final int toInt32(@NotNull byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        return byteBufferWrap.getInt();
    }
}
