package com.heytap.webpro.jsapi;

import com.oplus.aiunit.vision.ExecutorInfo;
import com.oplus.aiunit.vision.dja;
import com.oplus.aiunit.vision.e60;
import io.protostuff.MapSchema;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002R'\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/heytap/webpro/jsapi/AnnotationExecutorFactory;", "", "", "methodName", "Lcom/oplus/aiunit/vision/av6;", "d", "Ljava/lang/Class;", "clazz", "", "Ljava/lang/reflect/Method;", "f", "a", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Ljava/util/Map;", "methods", "b", "Ljava/lang/Object;", "hostObject", "<init>", "(Ljava/lang/Object;)V", "Companion", "lib_webpro_jsbridge_release"}, k = 1, mv = {1, 4, 0})
public final class AnnotationExecutorFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<Class<?>, Map<String, Method>> f8552c = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Lazy methods;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Object hostObject;

    public AnnotationExecutorFactory(@NotNull Object hostObject) {
        Intrinsics.checkNotNullParameter(hostObject, "hostObject");
        this.hostObject = hostObject;
        this.methods = LazyKt__LazyJVMKt.lazy(new Function0<Map<String, Method>>() { // from class: com.heytap.webpro.jsapi.AnnotationExecutorFactory$methods$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Map<String, Method> invoke() {
                Map<String, Method> map = (Map) AnnotationExecutorFactory.f8552c.get(this.this$0.hostObject.getClass());
                if (map != null) {
                    return map;
                }
                AnnotationExecutorFactory annotationExecutorFactory = this.this$0;
                return annotationExecutorFactory.f(annotationExecutorFactory.hostObject.getClass());
            }
        });
    }

    @Nullable
    public final ExecutorInfo d(@NotNull String methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Method method = e().get(methodName);
        if (method == null) {
            return null;
        }
        e60 e60Var = new e60(this.hostObject, method);
        Annotation annotation = method.getAnnotation(dja.class);
        Intrinsics.checkNotNullExpressionValue(annotation, "it.getAnnotation(\n      …       JsApi::class.java)");
        return new ExecutorInfo(e60Var, ((dja) annotation).uiThread());
    }

    public final Map<String, Method> e() {
        return (Map) this.methods.getValue();
    }

    public final Map<String, Method> f(Class<?> clazz) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Method method : clazz.getMethods()) {
            dja djaVar = (dja) method.getAnnotation(dja.class);
            if (djaVar != null) {
                String str = djaVar.product() + '.' + djaVar.method();
                Intrinsics.checkNotNullExpressionValue(method, "method");
                linkedHashMap.put(str, method);
            }
        }
        f8552c.put(this.hostObject.getClass(), linkedHashMap);
        return linkedHashMap;
    }
}
