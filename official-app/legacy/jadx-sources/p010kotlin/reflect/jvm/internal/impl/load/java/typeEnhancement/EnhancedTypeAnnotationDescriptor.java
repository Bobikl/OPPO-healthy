package p010kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.reflect.jvm.internal.impl.name.Name;
import p010kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes11.dex */
final class EnhancedTypeAnnotationDescriptor implements AnnotationDescriptor {

    @NotNull
    public static final EnhancedTypeAnnotationDescriptor INSTANCE = new EnhancedTypeAnnotationDescriptor();

    private EnhancedTypeAnnotationDescriptor() {
    }

    private final Void throwError() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters".toString());
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        throwError();
        throw null;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @Nullable
    public FqName getFqName() {
        return AnnotationDescriptor.DefaultImpls.getFqName(this);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public SourceElement getSource() {
        throwError();
        throw null;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    @NotNull
    public KotlinType getType() {
        throwError();
        throw null;
    }

    @NotNull
    public String toString() {
        return "[EnhancedType]";
    }
}
