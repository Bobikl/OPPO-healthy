package p010kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;
import p010kotlin.sequences.Sequence;
import p010kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,123:1\n1726#2,3:124\n1360#2:129\n1446#2,5:130\n1229#3,2:127\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n*L\n105#1:124,3\n112#1:129\n112#1:130,5\n107#1:127,2\n*E\n"})
public final class CompositeAnnotations implements Annotations {

    @NotNull
    private final List<Annotations> delegates;

    /* JADX WARN: Multi-variable type inference failed */
    public CompositeAnnotations(@NotNull List<? extends Annotations> delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.delegates = delegates;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    @Nullable
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo6579findAnnotation(@NotNull final FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (AnnotationDescriptor) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(CollectionsKt___CollectionsKt.asSequence(this.delegates), new Function1<Annotations, AnnotationDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations.findAnnotation.1
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @Nullable
            public final AnnotationDescriptor invoke(@NotNull Annotations it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.mo6579findAnnotation(fqName);
            }
        }));
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator it = CollectionsKt___CollectionsKt.asSequence(this.delegates).iterator();
        while (it.hasNext()) {
            if (((Annotations) it.next()).hasAnnotation(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        List<Annotations> list = this.delegates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((Annotations) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<AnnotationDescriptor> iterator() {
        return SequencesKt___SequencesKt.flatMap(CollectionsKt___CollectionsKt.asSequence(this.delegates), new Function1<Annotations, Sequence<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations.iterator.1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Sequence<AnnotationDescriptor> invoke(@NotNull Annotations it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CollectionsKt___CollectionsKt.asSequence(it);
            }
        }).iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompositeAnnotations(@NotNull Annotations... delegates) {
        this((List<? extends Annotations>) ArraysKt___ArraysKt.toList(delegates));
        Intrinsics.checkNotNullParameter(delegates, "delegates");
    }
}
