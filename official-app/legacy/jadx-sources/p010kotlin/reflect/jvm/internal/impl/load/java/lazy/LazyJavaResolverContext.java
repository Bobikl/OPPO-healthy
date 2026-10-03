package p010kotlin.reflect.jvm.internal.impl.load.java.lazy;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p010kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import p010kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import p010kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes11.dex */
public final class LazyJavaResolverContext {

    @NotNull
    private final JavaResolverComponents components;

    @NotNull
    private final Lazy defaultTypeQualifiers$delegate;

    @NotNull
    private final Lazy<JavaTypeQualifiersByElementType> delegateForDefaultTypeQualifiers;

    @NotNull
    private final TypeParameterResolver typeParameterResolver;

    @NotNull
    private final JavaTypeResolver typeResolver;

    public LazyJavaResolverContext(@NotNull JavaResolverComponents components, @NotNull TypeParameterResolver typeParameterResolver, @NotNull Lazy<JavaTypeQualifiersByElementType> delegateForDefaultTypeQualifiers) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        Intrinsics.checkNotNullParameter(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.components = components;
        this.typeParameterResolver = typeParameterResolver;
        this.delegateForDefaultTypeQualifiers = delegateForDefaultTypeQualifiers;
        this.defaultTypeQualifiers$delegate = delegateForDefaultTypeQualifiers;
        this.typeResolver = new JavaTypeResolver(this, typeParameterResolver);
    }

    @NotNull
    public final JavaResolverComponents getComponents() {
        return this.components;
    }

    @Nullable
    public final JavaTypeQualifiersByElementType getDefaultTypeQualifiers() {
        return (JavaTypeQualifiersByElementType) this.defaultTypeQualifiers$delegate.getValue();
    }

    @NotNull
    public final Lazy<JavaTypeQualifiersByElementType> getDelegateForDefaultTypeQualifiers$descriptors_jvm() {
        return this.delegateForDefaultTypeQualifiers;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.components.getModule();
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.components.getStorageManager();
    }

    @NotNull
    public final TypeParameterResolver getTypeParameterResolver() {
        return this.typeParameterResolver;
    }

    @NotNull
    public final JavaTypeResolver getTypeResolver() {
        return this.typeResolver;
    }
}
