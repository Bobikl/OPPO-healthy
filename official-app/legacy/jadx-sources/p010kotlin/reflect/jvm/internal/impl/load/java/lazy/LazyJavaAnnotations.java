package p010kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import p010kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationMapper;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import p010kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import p010kotlin.sequences.Sequence;
import p010kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes11.dex */
public final class LazyJavaAnnotations implements Annotations {

    @NotNull
    private final MemoizedFunctionToNullable<JavaAnnotation, AnnotationDescriptor> annotationDescriptors;

    @NotNull
    private final JavaAnnotationOwner annotationOwner;
    private final boolean areAnnotationsFreshlySupported;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final LazyJavaResolverContext f20684c;

    public LazyJavaAnnotations(@NotNull LazyJavaResolverContext c2, @NotNull JavaAnnotationOwner annotationOwner, boolean z) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        this.f20684c = c2;
        this.annotationOwner = annotationOwner;
        this.areAnnotationsFreshlySupported = z;
        this.annotationDescriptors = c2.getComponents().getStorageManager().createMemoizedFunctionWithNullableValues(new Function1<JavaAnnotation, AnnotationDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations$annotationDescriptors$1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @Nullable
            public final AnnotationDescriptor invoke(@NotNull JavaAnnotation annotation) {
                Intrinsics.checkNotNullParameter(annotation, "annotation");
                return JavaAnnotationMapper.INSTANCE.mapOrResolveJavaAnnotation(annotation, this.this$0.f20684c, this.this$0.areAnnotationsFreshlySupported);
            }
        });
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo6579findAnnotation(@NotNull FqName fqName) {
        AnnotationDescriptor annotationDescriptorInvoke;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        JavaAnnotation javaAnnotationFindAnnotation = this.annotationOwner.findAnnotation(fqName);
        return (javaAnnotationFindAnnotation == null || (annotationDescriptorInvoke = this.annotationDescriptors.invoke(javaAnnotationFindAnnotation)) == null) ? JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(fqName, this.annotationOwner, this.f20684c) : annotationDescriptorInvoke;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return this.annotationOwner.getAnnotations().isEmpty() && !this.annotationOwner.isDeprecatedInJavaDoc();
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return SequencesKt___SequencesKt.filterNotNull(SequencesKt___SequencesKt.plus((Sequence<? extends AnnotationDescriptor>) SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(this.annotationOwner.getAnnotations()), this.annotationDescriptors), JavaAnnotationMapper.INSTANCE.findMappedJavaAnnotation(StandardNames.FqNames.deprecated, this.annotationOwner, this.f20684c))).iterator();
    }

    public /* synthetic */ LazyJavaAnnotations(LazyJavaResolverContext lazyJavaResolverContext, JavaAnnotationOwner javaAnnotationOwner, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, javaAnnotationOwner, (i & 4) != 0 ? false : z);
    }
}
