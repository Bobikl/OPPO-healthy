package com.heytap.webview.extension.jsapi;

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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0006J \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/heytap/webview/extension/jsapi/AnnotationExecutorFactory;", "", "hostObject", "(Ljava/lang/Object;)V", "methods", "", "", "Ljava/lang/reflect/Method;", "getMethods", "()Ljava/util/Map;", "methods$delegate", "Lkotlin/Lazy;", "createJsApiExecutor", "Lcom/heytap/webview/extension/jsapi/ExecutorInfo;", "methodName", "parseAnnotation", "clazz", "Ljava/lang/Class;", "Companion", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AnnotationExecutorFactory {

    @NotNull
    private final Object hostObject;

    /* JADX INFO: renamed from: methods$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy methods;

    @NotNull
    private static final Map<Class<?>, Map<String, Method>> ANNOTATION_CLASSES = new LinkedHashMap();

    public AnnotationExecutorFactory(@NotNull Object hostObject) {
        Intrinsics.checkNotNullParameter(hostObject, "hostObject");
        this.hostObject = hostObject;
        this.methods = LazyKt__LazyJVMKt.lazy(new Function0<Map<String, Method>>() { // from class: com.heytap.webview.extension.jsapi.AnnotationExecutorFactory$methods$2
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final Map<String, Method> invoke() {
                Map<String, Method> map = (Map) AnnotationExecutorFactory.ANNOTATION_CLASSES.get(this.this$0.hostObject.getClass());
                if (map != null) {
                    return map;
                }
                AnnotationExecutorFactory annotationExecutorFactory = this.this$0;
                return annotationExecutorFactory.parseAnnotation(annotationExecutorFactory.hostObject.getClass());
            }
        });
    }

    private final Map<String, Method> getMethods() {
        return (Map) this.methods.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Method> parseAnnotation(Class<?> clazz) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Method[] methods = clazz.getMethods();
        Intrinsics.checkNotNullExpressionValue(methods, "methods");
        for (Method method : methods) {
            JsApi jsApi = (JsApi) method.getAnnotation(JsApi.class);
            if (jsApi != null) {
                String str = jsApi.product() + '.' + jsApi.method();
                Intrinsics.checkNotNullExpressionValue(method, "method");
                linkedHashMap.put(str, method);
            }
        }
        ANNOTATION_CLASSES.put(this.hostObject.getClass(), linkedHashMap);
        return linkedHashMap;
    }

    @Nullable
    public final ExecutorInfo createJsApiExecutor(@NotNull String methodName) {
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Method method = getMethods().get(methodName);
        if (method == null) {
            return null;
        }
        AnnotationExecutor annotationExecutor = new AnnotationExecutor(this.hostObject, method);
        Annotation annotation = method.getAnnotation(JsApi.class);
        Intrinsics.checkNotNullExpressionValue(annotation, "it.getAnnotation(JsApi::class.java)");
        return new ExecutorInfo(annotationExecutor, ((JsApi) annotation).uiThread());
    }
}
