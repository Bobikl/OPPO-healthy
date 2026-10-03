package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/x5b;", "", "", "b", "a", "language", "", "c", "<init>", "()V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
public final class x5b {

    @NotNull
    public static final x5b INSTANCE = new x5b();

    @JvmStatic
    @NotNull
    public static final String a() {
        Locale locale = Locale.getDefault();
        String languageTag = locale.toLanguageTag();
        if (!StringsKt.equals(languageTag, "zh-CN", true)) {
            Intrinsics.checkNotNullExpressionValue(languageTag, "languageTag");
            if (!StringsKt.startsWith$default(languageTag, "zh-Hans", false, 2, (Object) null) && !StringsKt.startsWith$default(languageTag, "bo", false, 2, (Object) null) && !StringsKt.startsWith$default(languageTag, "ug", false, 2, (Object) null)) {
                if (StringsKt.equals(languageTag, "zh-TW", true)) {
                    return mb4.TW_ISO;
                }
                if (!StringsKt.equals(languageTag, "zh-HK", true)) {
                    if (!StringsKt.startsWith$default(languageTag, "zh-Hant", false, 2, (Object) null)) {
                        if (StringsKt.startsWith$default(languageTag, "en", false, 2, (Object) null)) {
                            return "US";
                        }
                        String country = d97.e() ? locale.getCountry() : "";
                        Intrinsics.checkNotNullExpressionValue(country, "{\n                if (Fe…          }\n            }");
                        return country;
                    }
                    if (StringsKt.endsWith$default(languageTag, mb4.TW_ISO, false, 2, (Object) null)) {
                        return mb4.TW_ISO;
                    }
                    StringsKt.endsWith$default(languageTag, "HK", false, 2, (Object) null);
                }
                return "HK";
            }
        }
        return gqe.DEFAULT_LANGUAGE;
    }

    @JvmStatic
    @NotNull
    public static final String b() {
        String languageTag = Locale.getDefault().toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "languageTag");
        if (StringsKt.startsWith$default(languageTag, "zh-Hans", false, 2, (Object) null)) {
            return "zh_CN";
        }
        if (!StringsKt.startsWith$default(languageTag, "zh-Hant", false, 2, (Object) null)) {
            return languageTag;
        }
        if (StringsKt.endsWith$default(languageTag, mb4.TW_ISO, false, 2, (Object) null)) {
            return "zh_TW";
        }
        StringsKt.endsWith$default(languageTag, "HK", false, 2, (Object) null);
        return "zh_HK";
    }

    @JvmStatic
    public static final boolean c(@NotNull String language) {
        Intrinsics.checkNotNullParameter(language, "language");
        return TextUtils.equals(language, "US");
    }
}
