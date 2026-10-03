package com.heytap.nearx.cloudconfig.anotation;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes17.dex */
@Target({ElementType.TYPE})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/heytap/nearx/cloudconfig/anotation/Config;", "", Fields.CONFIG_CODE, "", "type", "", "()Ljava/lang/String;", "()I", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
@p010kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FILE})
@Retention(RetentionPolicy.RUNTIME)
@p010kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface Config {
    String configCode() default "";

    int type() default 0;
}
