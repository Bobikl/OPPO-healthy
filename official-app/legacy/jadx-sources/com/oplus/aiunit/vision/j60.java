package com.oplus.aiunit.vision;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes13.dex */
public interface j60 {
    <A extends Annotation> A get(Class<A> cls);

    boolean has(Class<?> cls);

    boolean hasOneOf(Class<? extends Annotation>[] clsArr);

    int size();
}
