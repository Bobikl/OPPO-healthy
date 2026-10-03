package com.oplus.drs.track;

import com.oplus.aiunit.vision.zkf;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Regex;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/oplus/drs/track/TrackApiHelper;", "", "", "getRegion", "regionMark", "checkUserRegion", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "obus-sdk_release"}, k = 1, mv = {1, 7, 1})
public final class TrackApiHelper {

    @NotNull
    public static final TrackApiHelper INSTANCE = new TrackApiHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static String TAG = "Track.TrackApiHelper";

    @JvmStatic
    @NotNull
    public static final String getRegion() {
        zkf zkfVar = zkf.INSTANCE;
        String strB = zkfVar.b();
        if (strB.length() > 0) {
            return strB;
        }
        String strA = zkfVar.a();
        return strA.length() > 0 ? strA : "";
    }

    @NotNull
    public final String checkUserRegion(@NotNull String regionMark) {
        Intrinsics.checkNotNullParameter(regionMark, "regionMark");
        String string = StringsKt__StringsKt.trim((CharSequence) regionMark).toString();
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String upperCase = string.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (new Regex("[A-Z]{2,4}").matches(upperCase)) {
            return upperCase;
        }
        String string2 = StringsKt__StringsKt.trim((CharSequence) getRegion()).toString();
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
        String upperCase2 = string2.toUpperCase(locale2);
        Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(locale)");
        return upperCase2;
    }
}
