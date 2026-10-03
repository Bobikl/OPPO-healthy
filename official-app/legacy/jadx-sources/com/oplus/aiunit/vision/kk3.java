package com.oplus.aiunit.vision;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.AnnotationCollector;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
public class kk3 {
    public static final g60[] b = new g60[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Annotation[] f13316c = new Annotation[0];
    public final AnnotationIntrospector a;

    public kk3(AnnotationIntrospector annotationIntrospector) {
        this.a = annotationIntrospector;
    }

    public static g60 a() {
        return new g60();
    }

    public static g60[] b(int i) {
        if (i == 0) {
            return b;
        }
        g60[] g60VarArr = new g60[i];
        for (int i2 = 0; i2 < i; i2++) {
            g60VarArr[i2] = a();
        }
        return g60VarArr;
    }

    public static final boolean c(Annotation annotation) {
        return (annotation instanceof Target) || (annotation instanceof Retention);
    }

    public final AnnotationCollector d(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            annotationCollector = annotationCollector.a(annotation);
            if (this.a.isAnnotationBundle(annotation)) {
                annotationCollector = h(annotationCollector, annotation);
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector e(Annotation[] annotationArr) {
        AnnotationCollector annotationCollectorE = AnnotationCollector.e();
        for (Annotation annotation : annotationArr) {
            annotationCollectorE = annotationCollectorE.a(annotation);
            if (this.a.isAnnotationBundle(annotation)) {
                annotationCollectorE = h(annotationCollectorE, annotation);
            }
        }
        return annotationCollectorE;
    }

    public final AnnotationCollector f(AnnotationCollector annotationCollector, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!annotationCollector.f(annotation)) {
                annotationCollector = annotationCollector.a(annotation);
                if (this.a.isAnnotationBundle(annotation)) {
                    annotationCollector = g(annotationCollector, annotation);
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector g(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : nc3.p(annotation.annotationType())) {
            if (!c(annotation2) && !annotationCollector.f(annotation2)) {
                annotationCollector = annotationCollector.a(annotation2);
                if (this.a.isAnnotationBundle(annotation2)) {
                    annotationCollector = h(annotationCollector, annotation2);
                }
            }
        }
        return annotationCollector;
    }

    public final AnnotationCollector h(AnnotationCollector annotationCollector, Annotation annotation) {
        for (Annotation annotation2 : nc3.p(annotation.annotationType())) {
            if (!c(annotation2)) {
                if (!this.a.isAnnotationBundle(annotation2)) {
                    annotationCollector = annotationCollector.a(annotation2);
                } else if (!annotationCollector.f(annotation2)) {
                    annotationCollector = h(annotationCollector.a(annotation2), annotation2);
                }
            }
        }
        return annotationCollector;
    }
}
