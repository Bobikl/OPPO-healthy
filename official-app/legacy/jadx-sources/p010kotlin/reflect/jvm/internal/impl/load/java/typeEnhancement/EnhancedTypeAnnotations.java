package p010kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes11.dex */
final class EnhancedTypeAnnotations implements Annotations {

    @NotNull
    private final FqName fqNameToMatch;

    public EnhancedTypeAnnotations(@NotNull FqName fqNameToMatch) {
        Intrinsics.checkNotNullParameter(fqNameToMatch, "fqNameToMatch");
        this.fqNameToMatch = fqNameToMatch;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return CollectionsKt__CollectionsKt.emptyList().iterator();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: findAnnotation */
    public EnhancedTypeAnnotationDescriptor mo6579findAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        if (Intrinsics.areEqual(fqName, this.fqNameToMatch)) {
            return EnhancedTypeAnnotationDescriptor.INSTANCE;
        }
        return null;
    }
}
