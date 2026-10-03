package p010kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p010kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p010kotlin.reflect.jvm.internal.impl.types.Variance;
import p010kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;

/* JADX INFO: loaded from: classes11.dex */
public interface TypeParameterDescriptor extends ClassifierDescriptor, TypeParameterMarker {
    int getIndex();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    TypeParameterDescriptor getOriginal();

    @NotNull
    StorageManager getStorageManager();

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    TypeConstructor getTypeConstructor();

    @NotNull
    List<KotlinType> getUpperBounds();

    @NotNull
    Variance getVariance();

    boolean isCapturedFromOuterDeclaration();

    boolean isReified();
}
