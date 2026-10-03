package com.oplus.aiunit.vision;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.CharsKt__CharJVMKt;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0006"}, d2 = {"", "", "radix", "length", "", "a", "entrance_release"}, k = 2, mv = {1, 8, 0})
public final class vz5 {
    @NotNull
    public static final String a(long j2, int i, int i2) {
        String string = Long.toString(j2, CharsKt__CharJVMKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (string == null || string.length() == 0) {
            return "";
        }
        if (string.length() > i2) {
            t6b.h("convert: over the length");
        }
        int length = i2 - string.length();
        if (length > 0) {
            String upperCase = (StringsKt__StringsJVMKt.repeat("0", length) + string).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return upperCase;
        }
        if (string.length() % 2 != 1) {
            String upperCase2 = string.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            return upperCase2;
        }
        String upperCase3 = ("0" + string).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
        return upperCase3;
    }
}
