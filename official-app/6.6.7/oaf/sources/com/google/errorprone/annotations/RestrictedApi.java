package com.google.errorprone.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface RestrictedApi {
    String allowedOnPath() default "";

    Class<? extends Annotation>[] allowlistAnnotations() default {};

    Class<? extends Annotation>[] allowlistWithWarningAnnotations() default {};

    String explanation();

    String link();
}
