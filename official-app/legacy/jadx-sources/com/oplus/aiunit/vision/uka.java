package com.oplus.aiunit.vision;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface uka {
    Class<? extends ObjectIdGenerator<?>> generator();

    String property() default "@id";

    Class<? extends com.fasterxml.jackson.annotation.a> resolver() default com.fasterxml.jackson.annotation.b.class;

    Class<?> scope() default Object.class;
}
