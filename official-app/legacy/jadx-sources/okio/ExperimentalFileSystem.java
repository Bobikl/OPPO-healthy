package okio;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p010kotlin.Deprecated;
import p010kotlin.DeprecationLevel;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.annotation.AnnotationTarget;

/* JADX INFO: loaded from: classes11.dex */
@Target({ElementType.TYPE, ElementType.METHOD})
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lokio/ExperimentalFileSystem;", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This annotation is obsolete and should be removed.")
@p010kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY})
@Retention(RetentionPolicy.SOURCE)
@p010kotlin.annotation.Retention(AnnotationRetention.SOURCE)
public @interface ExperimentalFileSystem {
}
