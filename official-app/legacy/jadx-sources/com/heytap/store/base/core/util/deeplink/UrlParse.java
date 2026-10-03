package com.heytap.store.base.core.util.deeplink;

import android.net.Uri;
import com.heytap.store.base.core.http.HttpUtils;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Regex;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¨\u0006\b"}, d2 = {"Lcom/heytap/store/base/core/util/deeplink/UrlParse;", "", "()V", "getUrlParams", "", "", "url", "getUrlParamsNoDecode", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class UrlParse {
    @NotNull
    public final Map<String, String> getUrlParams(@Nullable String url) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String query = Uri.parse(url).getQuery();
            if (query == null) {
                return linkedHashMap;
            }
            if (query.length() > 0) {
                Object[] array = new Regex("&").split(query, 0).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                String[] strArr = (String[]) array;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str = strArr[i];
                    i++;
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, HttpUtils.EQUAL_SIGN, 0, false, 6, (Object) null);
                    if (iIndexOf$default > 0 && iIndexOf$default < str.length() - 1) {
                        String strSubstring = str.substring(0, iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        String strDecode = URLDecoder.decode(strSubstring, "UTF-8");
                        Intrinsics.checkNotNullExpressionValue(strDecode, "decode(pair.substring(0, idx), \"UTF-8\")");
                        String strSubstring2 = str.substring(iIndexOf$default + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                        String strDecode2 = URLDecoder.decode(strSubstring2, "UTF-8");
                        Intrinsics.checkNotNullExpressionValue(strDecode2, "decode(pair.substring(idx + 1), \"UTF-8\")");
                        linkedHashMap.put(strDecode, strDecode2);
                    }
                }
            }
            return linkedHashMap;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @NotNull
    public final Map<String, String> getUrlParamsNoDecode(@Nullable String url) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            String query = Uri.parse(url).getQuery();
            if (query == null) {
                return linkedHashMap;
            }
            if (query.length() > 0) {
                Object[] array = new Regex("&").split(query, 0).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                String[] strArr = (String[]) array;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str = strArr[i];
                    i++;
                    int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, HttpUtils.EQUAL_SIGN, 0, false, 6, (Object) null);
                    if (iIndexOf$default > 0 && iIndexOf$default < str.length() - 1) {
                        String strSubstring = str.substring(0, iIndexOf$default);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        String string = StringsKt__StringsKt.trim((CharSequence) strSubstring).toString();
                        String strSubstring2 = str.substring(iIndexOf$default + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                        linkedHashMap.put(string, StringsKt__StringsKt.trim((CharSequence) strSubstring2).toString());
                    }
                }
            }
            return linkedHashMap;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
