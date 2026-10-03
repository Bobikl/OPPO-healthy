package com.oplus.aiunit.vision;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes13.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface kka {
    Class<?> as() default Void.class;

    Class<?> builder() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends ka4> contentConverter() default ka4.a.class;

    Class<? extends lka> contentUsing() default lka.a.class;

    Class<? extends ka4> converter() default ka4.a.class;

    Class<?> keyAs() default Void.class;

    Class<? extends yna> keyUsing() default yna.a.class;

    Class<? extends lka> using() default lka.a.class;
}
