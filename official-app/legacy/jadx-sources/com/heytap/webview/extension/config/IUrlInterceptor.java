package com.heytap.webview.extension.config;

import android.net.Uri;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/heytap/webview/extension/config/IUrlInterceptor;", "", "intercept", "", "fragment", "Lcom/heytap/webview/extension/jsapi/IJsApiFragmentInterface;", "oldUri", "Landroid/net/Uri;", "newUri", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IUrlInterceptor {
    boolean intercept(@NotNull IJsApiFragmentInterface fragment, @NotNull Uri oldUri, @NotNull Uri newUri);
}
