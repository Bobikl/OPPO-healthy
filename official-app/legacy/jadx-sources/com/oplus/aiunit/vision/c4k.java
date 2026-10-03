package com.oplus.aiunit.vision;

import com.heytap.store.base.core.http.HttpUtils;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¨\u0006\u0002"}, d2 = {"", "a", "com.heytap.nearx.common"}, k = 2, mv = {1, 4, 0})
public final class c4k {
    @NotNull
    public static final String a(@NotNull String jsonReplace1) {
        String strReplace$default;
        String strReplace$default2;
        String strReplace$default3;
        Intrinsics.checkNotNullParameter(jsonReplace1, "$this$jsonReplace1");
        String strReplace$default4 = StringsKt__StringsJVMKt.replace$default(jsonReplace1, HttpUtils.EQUAL_SIGN, ":", false, 4, (Object) null);
        if (strReplace$default4 == null || (strReplace$default = StringsKt__StringsJVMKt.replace$default(strReplace$default4, ";", ",", false, 4, (Object) null)) == null || (strReplace$default2 = StringsKt__StringsJVMKt.replace$default(strReplace$default, "\"[", "[", false, 4, (Object) null)) == null || (strReplace$default3 = StringsKt__StringsJVMKt.replace$default(strReplace$default2, "]\"", "]", false, 4, (Object) null)) == null) {
            return null;
        }
        return StringsKt__StringsJVMKt.replace$default(strReplace$default3, "\\\"", "\"", false, 4, (Object) null);
    }
}
