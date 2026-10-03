package com.heytap.webview.extension.jsapi;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\nJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00052\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H\u0007R\"\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/heytap/webview/extension/jsapi/JsApiRegister;", "", "()V", "executorMap", "", "", "Ljava/lang/Class;", "Lcom/heytap/webview/extension/jsapi/IJsApiExecutor;", "getJsApiExecutor", "fullMethodName", "getJsApiExecutor$lib_webext_release", "registerJsApiExecutor", "", "clazz", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class JsApiRegister {

    @NotNull
    public static final JsApiRegister INSTANCE = new JsApiRegister();

    @NotNull
    private static final Map<String, Class<? extends IJsApiExecutor>> executorMap = new LinkedHashMap();

    private JsApiRegister() {
    }

    @Nullable
    public final Class<? extends IJsApiExecutor> getJsApiExecutor$lib_webext_release(@NotNull String fullMethodName) {
        Intrinsics.checkNotNullParameter(fullMethodName, "fullMethodName");
        return executorMap.get(fullMethodName);
    }

    @Keep
    public final void registerJsApiExecutor(@NotNull String fullMethodName, @NotNull Class<? extends IJsApiExecutor> clazz) {
        Intrinsics.checkNotNullParameter(fullMethodName, "fullMethodName");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        executorMap.put(fullMethodName, clazz);
    }
}
