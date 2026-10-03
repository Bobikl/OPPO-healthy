package com.heytap.webview.extension;

import android.net.Uri;
import com.heytap.webview.extension.config.IUrlInterceptor;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/heytap/webview/extension/UrlInterceptorGroup;", "Lcom/heytap/webview/extension/config/IUrlInterceptor;", "()V", "urlInterceptors", "", "add", "", "urlInterceptor", "intercept", "", "fragment", "Lcom/heytap/webview/extension/jsapi/IJsApiFragmentInterface;", "oldUri", "Landroid/net/Uri;", "newUri", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\ngroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 group.kt\ncom/heytap/webview/extension/UrlInterceptorGroup\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1855#2,2:85\n*S KotlinDebug\n*F\n+ 1 group.kt\ncom/heytap/webview/extension/UrlInterceptorGroup\n*L\n59#1:85,2\n*E\n"})
public final class UrlInterceptorGroup implements IUrlInterceptor {

    @NotNull
    private final List<IUrlInterceptor> urlInterceptors = new ArrayList();

    public final void add(@NotNull IUrlInterceptor urlInterceptor) {
        Intrinsics.checkNotNullParameter(urlInterceptor, "urlInterceptor");
        this.urlInterceptors.add(0, urlInterceptor);
    }

    @Override // com.heytap.webview.extension.config.IUrlInterceptor
    public boolean intercept(@NotNull IJsApiFragmentInterface fragment, @NotNull Uri oldUri, @NotNull Uri newUri) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(oldUri, "oldUri");
        Intrinsics.checkNotNullParameter(newUri, "newUri");
        List<IUrlInterceptor> list = this.urlInterceptors;
        if (list == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((IUrlInterceptor) it.next()).intercept(fragment, oldUri, newUri)) {
                return true;
            }
        }
        return false;
    }
}
