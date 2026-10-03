package com.heytap.store.platform.jsclasslike.utils;

import android.net.Uri;
import com.oplus.aiunit.vision.kam;
import com.oplus.weatherservicesdk.data.Weather;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\r"}, d2 = {"Lcom/heytap/store/platform/jsclasslike/utils/TextUtils;", "", "()V", "formatStackTrace", "", "stackTraceElements", "", "Ljava/lang/StackTraceElement;", "([Ljava/lang/StackTraceElement;)Ljava/lang/String;", "splitQueryParameters", "", "rawUri", "Landroid/net/Uri;", "jsclasslike-api_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class TextUtils {

    @NotNull
    public static final TextUtils INSTANCE = new TextUtils();

    private TextUtils() {
    }

    @NotNull
    public final String formatStackTrace(@Nullable StackTraceElement[] stackTraceElements) {
        StringBuilder sb = new StringBuilder();
        if (stackTraceElements != null) {
            for (StackTraceElement stackTraceElement : stackTraceElements) {
                sb.append("     at ");
                sb.append(stackTraceElement.toString());
                sb.append(Weather.SEPARATOR);
            }
        }
        String string = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "stringBuilder.toString()");
        return string;
    }

    @NotNull
    public final Map<String, String> splitQueryParameters(@Nullable Uri rawUri) {
        String strSubstring;
        String encodedQuery = rawUri == null ? null : rawUri.getEncodedQuery();
        if (encodedQuery == null) {
            return MapsKt__MapsKt.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        do {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) encodedQuery, Typography.amp, i, false, 4, (Object) null);
            int length = iIndexOf$default == -1 ? encodedQuery.length() : iIndexOf$default;
            int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) encodedQuery, kam.h, i, false, 4, (Object) null);
            if (iIndexOf$default2 > length || iIndexOf$default2 == -1) {
                iIndexOf$default2 = length;
            }
            String strSubstring2 = encodedQuery.substring(i, length);
            Intrinsics.checkExpressionValueIsNotNull(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            if (strSubstring2.length() > 0) {
                if (iIndexOf$default2 == length) {
                    strSubstring = "";
                } else {
                    strSubstring = encodedQuery.substring(iIndexOf$default2 + 1, length);
                    Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                String strDecode = Uri.decode(strSubstring2);
                Intrinsics.checkExpressionValueIsNotNull(strDecode, "decode(name)");
                String strDecode2 = Uri.decode(strSubstring);
                Intrinsics.checkExpressionValueIsNotNull(strDecode2, "decode(value)");
                linkedHashMap.put(strDecode, strDecode2);
            }
            i = iIndexOf$default + 1;
        } while (i < encodedQuery.length());
        return linkedHashMap;
    }
}
