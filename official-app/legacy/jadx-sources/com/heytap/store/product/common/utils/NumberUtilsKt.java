package com.heytap.store.product.common.utils;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"isDouble", "", "value", "", "isInteger", "isNumber", "Widget_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class NumberUtilsKt {
    public static final boolean isDouble(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            Double.parseDouble(value);
            return StringsKt__StringsKt.contains$default((CharSequence) value, (CharSequence) ".", false, 2, (Object) null);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static final boolean isInteger(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static final boolean isNumber(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return isInteger(value) || isDouble(value);
    }
}
