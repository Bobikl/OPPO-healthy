package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0001\u001a\u00020\u0000*\u0004\u0018\u00010\u0000H\u0000¨\u0006\u0002"}, d2 = {"", "a", "thirdparty_impl_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "StringUtils")
public final class f1j {
    @NotNull
    public static final String a(@Nullable String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 12) {
            return str;
        }
        String strSubstring = str.substring(12);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return "xx:xx:xx:xx:" + strSubstring;
    }
}
