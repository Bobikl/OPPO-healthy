package com.squareup.wire;

import androidx.compose.material.TextFieldImplKt;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p010kotlin.Metadata;
import p010kotlin.annotation.AnnotationRetention;
import p010kotlin.annotation.AnnotationTarget;
import p010kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes10.dex */
@Target({ElementType.FIELD})
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB.\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\nR\u000f\u0010\u0006\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000bR\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u000bR\u000f\u0010\u0007\u001a\u00020\b¢\u0006\u0006\u001a\u0004\b\u0007\u0010\fR\u000f\u0010\t\u001a\u00020\n¢\u0006\u0006\u001a\u0004\b\t\u0010\rR\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/squareup/wire/WireField;", "", "tag", "", "keyAdapter", "", "adapter", Feedback.WIDGET_LABEL, "Lcom/squareup/wire/WireField$Label;", "redacted", "", "()Ljava/lang/String;", "()Lcom/squareup/wire/WireField$Label;", "()Z", "()I", TextFieldImplKt.LabelId, "wire-runtime"}, k = 1, mv = {1, 1, 15})
@p010kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@p010kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
public @interface WireField {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/squareup/wire/WireField$Label;", "", "(Ljava/lang/String;I)V", "isOneOf", "", "()Z", "isPacked", "isRepeated", "REQUIRED", "OPTIONAL", "REPEATED", "ONE_OF", "PACKED", "wire-runtime"}, k = 1, mv = {1, 1, 15})
    public enum Label {
        REQUIRED,
        OPTIONAL,
        REPEATED,
        ONE_OF,
        PACKED;

        @JvmName(name = "isOneOf")
        public final boolean isOneOf() {
            return this == ONE_OF;
        }

        @JvmName(name = "isPacked")
        public final boolean isPacked() {
            return this == PACKED;
        }

        @JvmName(name = "isRepeated")
        public final boolean isRepeated() {
            return this == REPEATED || this == PACKED;
        }
    }

    String adapter();

    String keyAdapter() default "";

    Label label() default Label.OPTIONAL;

    boolean redacted() default false;

    int tag();
}
