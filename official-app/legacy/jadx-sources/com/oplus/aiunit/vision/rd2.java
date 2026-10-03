package com.oplus.aiunit.vision;

import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"", "src", "", "b", "by", "a", "com.heytap.nearx.common"}, k = 2, mv = {1, 4, 0})
public final class rd2 {
    @NotNull
    public static final String a(@NotNull byte[] by) {
        Intrinsics.checkNotNullParameter(by, "by");
        Charset charsetForName = Charset.forName("utf-8");
        Intrinsics.checkNotNullExpressionValue(charsetForName, "Charset.forName(\"utf-8\")");
        return new String(by, charsetForName);
    }

    @Nullable
    public static final byte[] b(@NotNull String src) {
        Intrinsics.checkNotNullParameter(src, "src");
        if (src.length() < 1) {
            return null;
        }
        byte[] bArr = new byte[src.length() / 2];
        int length = src.length() / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            String strSubstring = src.substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            int i4 = Integer.parseInt(strSubstring, 16);
            String strSubstring2 = src.substring(i3, i2 + 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            bArr[i] = (byte) ((i4 * 16) + Integer.parseInt(strSubstring2, 16));
        }
        return bArr;
    }
}
