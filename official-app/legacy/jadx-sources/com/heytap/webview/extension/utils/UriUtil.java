package com.heytap.webview.extension.utils;

import android.net.Uri;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/webview/extension/utils/UriUtil;", "", "()V", "isNetworkUri", "", ParserTag.TAG_URI, "Landroid/net/Uri;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UriUtil {

    @NotNull
    public static final UriUtil INSTANCE = new UriUtil();

    private UriUtil() {
    }

    public final boolean isNetworkUri(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String scheme = uri.getScheme();
        return StringsKt__StringsJVMKt.equals("http", scheme, true) || StringsKt__StringsJVMKt.equals(Const.Scheme.SCHEME_HTTPS, scheme, true) || StringsKt__StringsJVMKt.equals(Const.Scheme.SCHEME_FILE, scheme, true);
    }
}
