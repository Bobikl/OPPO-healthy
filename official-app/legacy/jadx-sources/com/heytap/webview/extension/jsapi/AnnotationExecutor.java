package com.heytap.webview.extension.jsapi;

import com.heytap.webview.extension.protocol.Const;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/heytap/webview/extension/jsapi/AnnotationExecutor;", "Lcom/heytap/webview/extension/jsapi/IJsApiExecutor;", Languages.ANY, "", "method", "Ljava/lang/reflect/Method;", "(Ljava/lang/Object;Ljava/lang/reflect/Method;)V", "execute", "", "fragment", "Lcom/heytap/webview/extension/jsapi/IJsApiFragmentInterface;", "apiArguments", "Lcom/heytap/webview/extension/jsapi/JsApiObject;", "callback", "Lcom/heytap/webview/extension/jsapi/IJsApiCallback;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AnnotationExecutor implements IJsApiExecutor {

    @NotNull
    private final Object any;

    @NotNull
    private final Method method;

    public AnnotationExecutor(@NotNull Object any, @NotNull Method method) {
        Intrinsics.checkNotNullParameter(any, "any");
        Intrinsics.checkNotNullParameter(method, "method");
        this.any = any;
        this.method = method;
    }

    @Override // com.heytap.webview.extension.jsapi.IJsApiExecutor
    public void execute(@NotNull IJsApiFragmentInterface fragment, @NotNull JsApiObject apiArguments, @NotNull IJsApiCallback callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(apiArguments, "apiArguments");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            this.method.setAccessible(true);
            this.method.invoke(this.any, apiArguments, callback);
        } catch (IllegalAccessException unused) {
            callback.fail(1, Const.JsApiResponse.UnsupportedOperation.MESSAGE);
        } catch (InvocationTargetException unused2) {
            callback.fail(1, Const.JsApiResponse.UnsupportedOperation.MESSAGE);
        }
    }
}
