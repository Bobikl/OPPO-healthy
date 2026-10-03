package com.heytap.nearx.cloudconfig.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes17.dex */
@Target({ElementType.FIELD})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\n\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/nearx/cloudconfig/anotation/FieldIndex;", "", "index", "", "()I", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
@p010kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@p010kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface FieldIndex {
    int index() default 0;
}
