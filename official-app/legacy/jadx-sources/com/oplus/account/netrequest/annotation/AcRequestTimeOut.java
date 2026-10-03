package com.oplus.account.netrequest.annotation;

import androidx.annotation.Keep;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.METHOD})
@Keep
@Retention(RetentionPolicy.RUNTIME)
public @interface AcRequestTimeOut {
    int connectTimeOut() default 10000;

    int readTimeOut() default 10000;

    int writeTimeOut() default 10000;
}
