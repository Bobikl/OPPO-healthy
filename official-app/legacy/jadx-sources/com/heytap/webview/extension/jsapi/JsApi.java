package com.heytap.webview.extension.jsapi;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes4.dex */
@Target({ElementType.TYPE, ElementType.METHOD})
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface JsApi {
    String method();

    String product() default "common";

    boolean uiThread() default true;
}
