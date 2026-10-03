package com.heytap.store.platform.htrouter.facade.annotations;

import com.opos.process.bridge.base.BridgeConstant;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes6.dex */
@Target({ElementType.TYPE})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007R\u000f\u0010\u0006\u001a\u00020\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\tR\u000f\u0010\u0004\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0004\u0010\nR\u000f\u0010\u0005\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0005\u0010\nR\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\nR\u000f\u0010\b\u001a\u00020\u0007¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/platform/htrouter/facade/annotations/Route;", "", "path", "", "group", "name", BridgeConstant.KEY_EXTRAS, "", "priority", "()I", "()Ljava/lang/String;", "htrouter-annotation"}, k = 1, mv = {1, 1, 15})
@p010kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.CLASS)
@p010kotlin.annotation.Retention(AnnotationRetention.BINARY)
public @interface Route {
    int extras() default Integer.MIN_VALUE;

    String group() default "";

    String name() default "";

    String path();

    int priority() default -1;
}
