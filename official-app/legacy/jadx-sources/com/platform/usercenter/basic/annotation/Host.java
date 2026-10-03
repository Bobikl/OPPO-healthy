package com.platform.usercenter.basic.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes9.dex */
@Target({ElementType.TYPE})
@Inherited
@Keep
@Retention(RetentionPolicy.RUNTIME)
public @interface Host {
    String host_dev();

    String host_release();

    String host_test1();

    String host_test3();
}
