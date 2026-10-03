package p010kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p010kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import p010kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public interface CapturedTypeConstructor extends TypeConstructor, CapturedTypeConstructorMarker {
    @NotNull
    TypeProjection getProjection();
}
