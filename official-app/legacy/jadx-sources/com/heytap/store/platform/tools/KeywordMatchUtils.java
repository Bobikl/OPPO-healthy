package com.heytap.store.platform.tools;

import com.heytap.speech.engine.constant.EngineConstant;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/heytap/store/platform/tools/KeywordMatchUtils;", "", "()V", "isHWKeyword", "", EngineConstant.WORD, "", "utils_release"}, k = 1, mv = {1, 4, 0})
public final class KeywordMatchUtils {
    public static final KeywordMatchUtils INSTANCE = new KeywordMatchUtils();

    private KeywordMatchUtils() {
    }

    @JvmStatic
    public static final boolean isHWKeyword(@NotNull String word) {
        Intrinsics.checkNotNullParameter(word, "word");
        if (StringsKt__StringsJVMKt.isBlank(word)) {
            return false;
        }
        String lowerCase = word.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
        if (!StringsKt__StringsJVMKt.startsWith$default(lowerCase, "huawe", false, 2, null)) {
            return false;
        }
        String lowerCase2 = word.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
        return Intrinsics.areEqual(String.valueOf(StringsKt___StringsKt.lastOrNull(lowerCase2)), "i");
    }
}
