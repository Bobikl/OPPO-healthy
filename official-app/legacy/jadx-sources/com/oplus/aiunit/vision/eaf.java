package com.oplus.aiunit.vision;

import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0002\"\u0014\u0010\b\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "len", "", "b", "widgetCode", "serviceId", "randomKey", "a", "UUID_LEN", "I", "foundation-internal_release"}, k = 2, mv = {1, 8, 0})
public final class eaf {
    public static final int UUID_LEN = 6;

    @NotNull
    public static final String a(@NotNull String widgetCode, @Nullable String str, @NotNull String randomKey) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(randomKey, "randomKey");
        return widgetCode + "_sid=" + str + "_rk=" + randomKey;
    }

    @NotNull
    public static final String b(int i) {
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null);
        if (i <= 0 || i > strReplace$default.length()) {
            return strReplace$default;
        }
        String strSubstring = strReplace$default.substring(0, i);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
