package com.heytap.store.base.core.util.deeplink;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, d2 = {"addSchemeForUrl", "", "url", "compatDPUrl", "transformHost", "Core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DeepLinekUtilKt {
    @Nullable
    public static final String addSchemeForUrl(@Nullable String str) {
        if (str == null) {
            return null;
        }
        if (StringsKt__StringsJVMKt.startsWith$default(str, DeepLinkUrlPath.SPECIAL_WEB_URL_1, false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(str, DeepLinkUrlPath.SPECIAL_WEB_URL_2, false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(str, DeepLinkUrlPath.SPECIAL_WEB_URL_3, false, 2, null)) {
            return compatDPUrl(str);
        }
        return (StringsKt__StringsJVMKt.startsWith$default(str, "www.opposhop.cn/app/store/", false, 2, null) || StringsKt__StringsJVMKt.startsWith$default(str, DeepLinkUrlPath.DEEP_LINK_HOST_HEY_TAP, false, 2, null)) ? Intrinsics.stringPlus("oppostore://", str) : str;
    }

    @Nullable
    public static final String compatDPUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (StringsKt__StringsJVMKt.startsWith$default(url, DeepLinkUrlPath.SPECIAL_WEB_URL_1, false, 2, null)) {
            return StringsKt__StringsJVMKt.replace$default(url, DeepLinkUrlPath.SPECIAL_WEB_URL_1, "", false, 4, (Object) null);
        }
        if (StringsKt__StringsJVMKt.startsWith$default(url, DeepLinkUrlPath.SPECIAL_WEB_URL_2, false, 2, null)) {
            return StringsKt__StringsJVMKt.replace$default(url, DeepLinkUrlPath.SPECIAL_WEB_URL_2, "", false, 4, (Object) null);
        }
        return StringsKt__StringsJVMKt.startsWith$default(url, DeepLinkUrlPath.SPECIAL_WEB_URL_3, false, 2, null) ? StringsKt__StringsJVMKt.replace$default(url, DeepLinkUrlPath.SPECIAL_WEB_URL_3, "", false, 4, (Object) null) : url;
    }

    @NotNull
    public static final String transformHost(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (StringsKt__StringsJVMKt.startsWith$default(url, DeepLinkUrlPath.DEEP_LINK_HOST_HEY_TAP, false, 2, null)) {
            return StringsKt__StringsJVMKt.replaceFirst$default(url, DeepLinkUrlPath.DEEP_LINK_HOST_HEY_TAP, "www.opposhop.cn/app/store/", false, 4, (Object) null);
        }
        return StringsKt__StringsJVMKt.startsWith$default(url, DeepLinkUrlPath.DEEP_LINK_FOR_HEY_TAP, false, 2, null) ? StringsKt__StringsJVMKt.replaceFirst$default(url, DeepLinkUrlPath.DEEP_LINK_FOR_HEY_TAP, "oppostore://www.opposhop.cn/app/store/", false, 4, (Object) null) : url;
    }
}
