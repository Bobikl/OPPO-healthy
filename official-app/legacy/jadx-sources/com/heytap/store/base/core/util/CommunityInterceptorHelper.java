package com.heytap.store.base.core.util;

import android.net.Uri;
import com.heytap.store.base.core.http.HttpUtils;
import com.heytap.store.base.core.state.Constants;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/heytap/store/base/core/util/CommunityInterceptorHelper;", "", "()V", "routerMap", "", "", "checkCommunityUrl", "url", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class CommunityInterceptorHelper {

    @NotNull
    public static final CommunityInterceptorHelper INSTANCE = new CommunityInterceptorHelper();

    @NotNull
    private static Map<String, String> routerMap;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        routerMap = linkedHashMap;
        linkedHashMap.put("/shop/thread-", "oppostore://www.opposhop.cn/app/community/article/detail?article_id=");
        routerMap.put("/shop/video-", "oppostore://www.opposhop.cn/app/community/article/video?video_tid=");
        routerMap.put("/shop/topic-", "oppostore://www.opposhop.cn/app/community/topic/detail?topic_id=");
    }

    private CommunityInterceptorHelper() {
    }

    @NotNull
    public final String checkCommunityUrl(@Nullable String url) {
        String value;
        String key;
        boolean z = true;
        if (url == null || url.length() == 0) {
            return "";
        }
        try {
            Uri uri = Uri.parse(url);
            String path = uri.getPath();
            if (path == null || path.length() == 0) {
                return "";
            }
            Iterator<Map.Entry<String, String>> it = routerMap.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    value = "";
                    key = value;
                    break;
                }
                Map.Entry<String, String> next = it.next();
                key = next.getKey();
                value = next.getValue();
            } while (!StringsKt__StringsJVMKt.startsWith$default(path, key, false, 2, null));
            if (key.length() > 0) {
                if (value.length() <= 0) {
                    z = false;
                }
                if (z && StringsKt__StringsJVMKt.endsWith$default(path, "-1", false, 2, null)) {
                    String queryParameter = uri.getQueryParameter(Constants.IS_NATIVE);
                    if (queryParameter != null && Intrinsics.areEqual(queryParameter, "0")) {
                        return "";
                    }
                    String strSubstring = path.substring(key.length(), path.length() - 2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    String strStringPlus = Intrinsics.stringPlus(value, strSubstring);
                    StringBuilder sb = new StringBuilder();
                    sb.append(strStringPlus);
                    for (String str : uri.getQueryParameterNames()) {
                        sb.append("&");
                        String queryParameter2 = uri.getQueryParameter(str);
                        sb.append(String.valueOf(str));
                        sb.append(HttpUtils.EQUAL_SIGN);
                        sb.append(String.valueOf(queryParameter2));
                    }
                    String string = sb.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
                    return string;
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }
}
