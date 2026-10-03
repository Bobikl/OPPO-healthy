package com.oplus.aiunit.vision;

import java.lang.annotation.Annotation;
import retrofit2.Utils;

/* JADX INFO: loaded from: classes11.dex */
public final class e8h implements d8h {
    public static final d8h a = new e8h();

    public static Annotation[] a(Annotation[] annotationArr) {
        if (Utils.l(annotationArr, d8h.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return d8h.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof d8h;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + d8h.class.getName() + "()";
    }
}
