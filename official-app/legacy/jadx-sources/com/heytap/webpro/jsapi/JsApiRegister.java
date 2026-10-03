package com.heytap.webpro.jsapi;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.nr9;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0007J!\u0010\u000b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/heytap/webpro/jsapi/JsApiRegister;", "", "", "fullMethodName", "Ljava/lang/Class;", "Lcom/oplus/aiunit/vision/nr9;", "clazz", "", "registerJsApiExecutor", "getJsApiExecutor$lib_webpro_jsbridge_release", "(Ljava/lang/String;)Ljava/lang/Class;", "getJsApiExecutor", "", "executorMap", "Ljava/util/Map;", "<init>", "()V", "lib_webpro_jsbridge_release"}, k = 1, mv = {1, 4, 0})
public final class JsApiRegister {
    public static final JsApiRegister INSTANCE = new JsApiRegister();
    private static final Map<String, Class<? extends nr9>> executorMap = new LinkedHashMap();

    private JsApiRegister() {
    }

    @Nullable
    public final Class<? extends nr9> getJsApiExecutor$lib_webpro_jsbridge_release(@NotNull String fullMethodName) {
        Intrinsics.checkNotNullParameter(fullMethodName, "fullMethodName");
        return executorMap.get(fullMethodName);
    }

    @Keep
    public final void registerJsApiExecutor(@NotNull String fullMethodName, @NotNull Class<? extends nr9> clazz) {
        Intrinsics.checkNotNullParameter(fullMethodName, "fullMethodName");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        executorMap.put(fullMethodName, clazz);
    }
}
