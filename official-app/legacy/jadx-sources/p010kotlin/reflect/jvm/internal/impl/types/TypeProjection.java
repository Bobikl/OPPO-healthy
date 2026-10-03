package p010kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p010kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;

/* JADX INFO: loaded from: classes11.dex */
public interface TypeProjection extends TypeArgumentMarker {
    @NotNull
    Variance getProjectionKind();

    @NotNull
    KotlinType getType();

    boolean isStarProjection();

    @NotNull
    TypeProjection refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner);
}
