package com.oplus.aiunit.vision;

import com.heytap.webpro.jsapi.JsApiResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.commons.codec.language.bm.Languages;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/e60;", "Lcom/oplus/aiunit/vision/nr9;", "Lcom/oplus/aiunit/vision/pr9;", "fragment", "Lcom/oplus/aiunit/vision/jja;", "apiArguments", "Lcom/oplus/aiunit/vision/kr9;", "callback", "", "execute", "", "a", "Ljava/lang/Object;", Languages.ANY, "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/Object;Ljava/lang/reflect/Method;)V", "lib_webpro_jsbridge_release"}, k = 1, mv = {1, 4, 0})
public final class e60 implements nr9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Object any;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Method method;

    public e60(@NotNull Object any, @NotNull Method method) {
        Intrinsics.checkNotNullParameter(any, "any");
        Intrinsics.checkNotNullParameter(method, "method");
        this.any = any;
        this.method = method;
    }

    @Override // com.oplus.aiunit.vision.nr9
    public void execute(@NotNull pr9 fragment, @NotNull jja apiArguments, @NotNull kr9 callback) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(apiArguments, "apiArguments");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            this.method.setAccessible(true);
            this.method.invoke(this.any, apiArguments, callback);
        } catch (IllegalAccessException unused) {
            JsApiResponse.invokeIllegal(callback);
        } catch (InvocationTargetException unused2) {
            JsApiResponse.invokeIllegal(callback);
        }
    }
}
