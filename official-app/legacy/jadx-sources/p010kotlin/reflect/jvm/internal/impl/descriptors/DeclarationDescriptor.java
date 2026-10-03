package p010kotlin.reflect.jvm.internal.impl.descriptors;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;

/* JADX INFO: loaded from: classes11.dex */
public interface DeclarationDescriptor extends Named, Annotated {
    <R, D> R accept(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d);

    @Nullable
    DeclarationDescriptor getContainingDeclaration();

    @NotNull
    DeclarationDescriptor getOriginal();
}
