package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.PlatformStringDelegate;
import androidx.compose.ui.text.intl.AndroidLocale;
import androidx.compose.ui.text.intl.PlatformLocale;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidStringDelegate;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "()V", "capitalize", "", TypedValues.Custom.S_STRING, CityBean.LOCALE, "Landroidx/compose/ui/text/intl/PlatformLocale;", "decapitalize", "toLowerCase", "toUpperCase", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidStringDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStringDelegate.android.kt\nandroidx/compose/ui/text/platform/AndroidStringDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
public final class AndroidStringDelegate implements PlatformStringDelegate {
    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @NotNull
    public String capitalize(@NotNull String string, @NotNull PlatformLocale locale) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (!(string.length() > 0)) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = string.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? CharsKt__CharJVMKt.titlecase(cCharAt, ((AndroidLocale) locale).getJavaLocale()) : String.valueOf(cCharAt)));
        String strSubstring = string.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring);
        return sb.toString();
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @NotNull
    public String decapitalize(@NotNull String string, @NotNull PlatformLocale locale) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (!(string.length() > 0)) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) CharsKt__CharJVMKt.lowercase(string.charAt(0), ((AndroidLocale) locale).getJavaLocale()));
        String strSubstring = string.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring);
        return sb.toString();
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @NotNull
    public String toLowerCase(@NotNull String string, @NotNull PlatformLocale locale) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String lowerCase = string.toLowerCase(((AndroidLocale) locale).getJavaLocale());
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @Override // androidx.compose.ui.text.PlatformStringDelegate
    @NotNull
    public String toUpperCase(@NotNull String string, @NotNull PlatformLocale locale) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(locale, "locale");
        String upperCase = string.toUpperCase(((AndroidLocale) locale).getJavaLocale());
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
