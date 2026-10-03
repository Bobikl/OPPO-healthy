package p010kotlin.reflect.jvm.internal.impl.types;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public interface TypeWithEnhancement {
    @NotNull
    KotlinType getEnhancement();

    @NotNull
    UnwrappedType getOrigin();
}
