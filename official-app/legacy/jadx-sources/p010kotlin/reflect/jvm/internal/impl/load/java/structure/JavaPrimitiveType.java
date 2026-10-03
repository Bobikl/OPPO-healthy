package p010kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* JADX INFO: loaded from: classes11.dex */
public interface JavaPrimitiveType extends JavaType {
    @Nullable
    PrimitiveType getType();
}
