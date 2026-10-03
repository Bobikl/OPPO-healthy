package com.heytap.store.product_support.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.CharsKt__CharJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"hexToRgb", "", "hexValue", "", "product-support_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ColorUtilKt {
    @Nullable
    public static final int[] hexToRgb(@NotNull String hexValue) {
        Intrinsics.checkNotNullParameter(hexValue, "hexValue");
        if ((hexValue.length() == 0) || hexValue.length() != 7) {
            return null;
        }
        String strRemovePrefix = StringsKt__StringsKt.removePrefix(hexValue, (CharSequence) "#");
        String strSubstring = strRemovePrefix.substring(0, 2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        int i = Integer.parseInt(strSubstring, CharsKt__CharJVMKt.checkRadix(16));
        String strSubstring2 = strRemovePrefix.substring(2, 4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        int i2 = Integer.parseInt(strSubstring2, CharsKt__CharJVMKt.checkRadix(16));
        String strSubstring3 = strRemovePrefix.substring(4, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
        return new int[]{i, i2, Integer.parseInt(strSubstring3, CharsKt__CharJVMKt.checkRadix(16))};
    }
}
