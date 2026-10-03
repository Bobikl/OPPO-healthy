package com.heytap.nearx.tangramconfig.util;

import com.heytap.nearx.tangramconfig.BuildConfig;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.MatchResult;
import p010kotlin.text.Regex;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\u0005\u001a'\u0010\u0006\u001a\u00020\u0001*\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\b\u001a'\u0010\t\u001a\u00020\u0001*\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\b\u001a'\u0010\n\u001a\u00020\u0001*\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0002\u0010\b¨\u0006\u000b"}, d2 = {"desensitize", "", "patterns", "", "Lkotlin/text/Regex;", "(Ljava/lang/String;[Lkotlin/text/Regex;)Ljava/lang/String;", "printDesensitize", "", "(Ljava/lang/Object;[Lkotlin/text/Regex;)Ljava/lang/String;", "printHostDesensitize", "printUrlDesensitize", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PrintUtilsKt {
    @NotNull
    public static final String desensitize(@Nullable String str, @NotNull Regex... patterns) {
        Intrinsics.checkNotNullParameter(patterns, "patterns");
        if (str == null || StringsKt__StringsJVMKt.isBlank(str)) {
            return "";
        }
        for (Regex regex : patterns) {
            str = regex.replace(str, new Function1<MatchResult, CharSequence>() { // from class: com.heytap.nearx.tangramconfig.util.PrintUtilsKt$desensitize$1$1
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final CharSequence invoke(@NotNull MatchResult it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return StringsKt__StringsJVMKt.repeat("*", it.getValue().length());
                }
            });
        }
        return str;
    }

    @NotNull
    public static final String printDesensitize(@Nullable Object obj, @NotNull Regex... patterns) {
        Intrinsics.checkNotNullParameter(patterns, "patterns");
        return obj == null ? "" : desensitize(obj.toString(), (Regex[]) Arrays.copyOf(patterns, patterns.length));
    }

    public static /* synthetic */ String printDesensitize$default(Object obj, Regex[] regexArr, int i, Object obj2) {
        if ((i & 1) != 0) {
            PrintUtils.Companion companion = PrintUtils.INSTANCE;
            regexArr = new Regex[]{companion.getOS_VERSION(), companion.getOS_VERSION_JSON(), companion.getOTA_VERSION(), companion.getOTA_VERSION_JSON(), companion.getURL_DOMAIN()};
        }
        return printDesensitize(obj, regexArr);
    }

    @NotNull
    public static final String printHostDesensitize(@Nullable Object obj, @NotNull Regex... patterns) {
        Intrinsics.checkNotNullParameter(patterns, "patterns");
        return printDesensitize(obj, (Regex[]) Arrays.copyOf(patterns, patterns.length));
    }

    public static /* synthetic */ String printHostDesensitize$default(Object obj, Regex[] regexArr, int i, Object obj2) {
        if ((i & 1) != 0) {
            regexArr = new Regex[]{PrintUtils.INSTANCE.getHOST_HTTP()};
        }
        return printHostDesensitize(obj, regexArr);
    }

    @NotNull
    public static final String printUrlDesensitize(@Nullable Object obj, @NotNull Regex... patterns) {
        Intrinsics.checkNotNullParameter(patterns, "patterns");
        return printDesensitize(obj, (Regex[]) Arrays.copyOf(patterns, patterns.length));
    }

    public static /* synthetic */ String printUrlDesensitize$default(Object obj, Regex[] regexArr, int i, Object obj2) {
        if ((i & 1) != 0) {
            regexArr = new Regex[]{PrintUtils.INSTANCE.getURL_DOMAIN()};
        }
        return printUrlDesensitize(obj, regexArr);
    }
}
