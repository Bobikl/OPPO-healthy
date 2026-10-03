package com.heytap.store.platform.htrouter.facade.annotations;

import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.FIELD})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001e\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003R\u000f\u0010\u0006\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0007R\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/store/platform/htrouter/facade/annotations/AutoWired;", "", "name", "", "required", "", DBHealthReviewPlan.DESC, "()Ljava/lang/String;", "()Z", "htrouter-annotation"}, k = 1, mv = {1, 1, 15})
@p010kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD})
@Retention(RetentionPolicy.CLASS)
@p010kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface AutoWired {
    String desc() default "";

    String name() default "";

    boolean required() default false;
}
