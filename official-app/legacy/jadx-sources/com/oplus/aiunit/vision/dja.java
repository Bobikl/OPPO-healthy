package com.oplus.aiunit.vision;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes3.dex */
@Target({ElementType.TYPE, ElementType.METHOD})
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface dja {
    String method();

    String product() default "common";

    boolean uiThread() default true;
}
