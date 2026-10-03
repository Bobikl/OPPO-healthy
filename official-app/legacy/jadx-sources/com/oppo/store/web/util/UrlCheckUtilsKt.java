package com.oppo.store.web.util;

import com.heytap.store.base.core.util.deeplink.PatternUtil;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0005"}, d2 = {"isCCPUrl", "", "url", "", "isH5DetailUrl", "webbrowser-impl_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class UrlCheckUtilsKt {
    public static final boolean isCCPUrl(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "ccp.oppo.com", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "ccp.opposhop.cn", false, 2, (Object) null) || StringsKt__StringsJVMKt.startsWith$default(str, "https://olss-online.oppo", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(str, "https://oppo.soboten.com", false, 2, null);
    }

    public static final boolean isH5DetailUrl(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return (str.length() > 0) && PatternUtil.find(str, "/product/index[\\s\\S]*");
    }
}
