package p010kotlin.reflect.jvm.internal.impl.load.java.structure;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public interface JavaWildcardType extends JavaType {
    @Nullable
    JavaType getBound();

    boolean isExtends();
}
