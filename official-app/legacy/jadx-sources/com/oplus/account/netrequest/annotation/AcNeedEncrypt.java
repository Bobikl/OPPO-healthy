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
public @interface AcNeedEncrypt {
    String version() default "V1";
}
