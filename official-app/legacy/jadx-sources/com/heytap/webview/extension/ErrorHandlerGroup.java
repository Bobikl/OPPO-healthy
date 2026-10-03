package com.heytap.webview.extension;

import android.net.http.SslError;
import com.heytap.webview.extension.config.IErrorHandler;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.oplus.aiunit.vision.iim;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/heytap/webview/extension/ErrorHandlerGroup;", "Lcom/heytap/webview/extension/config/IErrorHandler;", "()V", "errorHandlers", "", "add", "", "handler", "onReceivedError", "", "fragment", "Lcom/heytap/webview/extension/jsapi/IJsApiFragmentInterface;", "errorCode", "", iim.a.f, "", "onReceivedSslError", "error", "Landroid/net/http/SslError;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\ngroup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 group.kt\ncom/heytap/webview/extension/ErrorHandlerGroup\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1855#2,2:85\n1855#2,2:87\n*S KotlinDebug\n*F\n+ 1 group.kt\ncom/heytap/webview/extension/ErrorHandlerGroup\n*L\n35#1:85,2\n41#1:87,2\n*E\n"})
public final class ErrorHandlerGroup implements IErrorHandler {

    @NotNull
    private final List<IErrorHandler> errorHandlers = new ArrayList();

    public final boolean add(@NotNull IErrorHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.errorHandlers.add(handler);
    }

    @Override // com.heytap.webview.extension.config.IErrorHandler
    public void onReceivedError(@NotNull IJsApiFragmentInterface fragment, int errorCode, @NotNull String description) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(description, "description");
        List<IErrorHandler> list = this.errorHandlers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((IErrorHandler) it.next()).onReceivedError(fragment, errorCode, description);
            }
        }
    }

    @Override // com.heytap.webview.extension.config.IErrorHandler
    public void onReceivedSslError(@NotNull IJsApiFragmentInterface fragment, @NotNull SslError error) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(error, "error");
        List<IErrorHandler> list = this.errorHandlers;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((IErrorHandler) it.next()).onReceivedSslError(fragment, error);
            }
        }
    }
}
