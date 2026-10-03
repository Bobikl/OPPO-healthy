package p010kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractTypeRefiner {
    @NotNull
    public abstract KotlinTypeMarker refineType(@NotNull KotlinTypeMarker kotlinTypeMarker);
}
