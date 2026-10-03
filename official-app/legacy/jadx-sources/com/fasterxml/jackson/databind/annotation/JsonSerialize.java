package com.fasterxml.jackson.databind.annotation;

import com.oplus.aiunit.vision.ka4;
import com.oplus.aiunit.vision.yla;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonSerialize {

    @Deprecated
    public enum Inclusion {
        ALWAYS,
        NON_NULL,
        NON_DEFAULT,
        NON_EMPTY,
        DEFAULT_INCLUSION
    }

    public enum Typing {
        DYNAMIC,
        STATIC,
        DEFAULT_TYPING
    }

    Class<?> as() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends ka4> contentConverter() default ka4.a.class;

    Class<? extends yla> contentUsing() default yla.a.class;

    Class<? extends ka4> converter() default ka4.a.class;

    @Deprecated
    Inclusion include() default Inclusion.DEFAULT_INCLUSION;

    Class<?> keyAs() default Void.class;

    Class<? extends yla> keyUsing() default yla.a.class;

    Class<? extends yla> nullsUsing() default yla.a.class;

    Typing typing() default Typing.DEFAULT_TYPING;

    Class<? extends yla> using() default yla.a.class;
}
