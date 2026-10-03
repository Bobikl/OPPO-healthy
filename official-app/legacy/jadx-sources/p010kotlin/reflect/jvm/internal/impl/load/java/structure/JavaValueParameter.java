package p010kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes11.dex */
public interface JavaValueParameter extends JavaAnnotationOwner {
    @Nullable
    Name getName();

    @NotNull
    JavaType getType();

    boolean isVararg();
}
