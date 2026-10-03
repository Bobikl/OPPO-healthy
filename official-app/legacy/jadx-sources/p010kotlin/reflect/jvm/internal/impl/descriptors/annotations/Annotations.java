package p010kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.markers.KMappedMarker;
import p010kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes11.dex */
public interface Annotations extends Iterable<AnnotationDescriptor>, KMappedMarker {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Annotations EMPTY = new Annotations() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion$EMPTY$1
            @Nullable
            public Void findAnnotation(@NotNull FqName fqName) {
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                return null;
            }

            @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            public boolean hasAnnotation(@NotNull FqName fqName) {
                return Annotations.DefaultImpls.hasAnnotation(this, fqName);
            }

            @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            @NotNull
            public Iterator<AnnotationDescriptor> iterator() {
                return CollectionsKt__CollectionsKt.emptyList().iterator();
            }

            @NotNull
            public String toString() {
                return "EMPTY";
            }

            @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
            /* JADX INFO: renamed from: findAnnotation, reason: collision with other method in class */
            public /* bridge */ /* synthetic */ AnnotationDescriptor mo6579findAnnotation(FqName fqName) {
                return (AnnotationDescriptor) findAnnotation(fqName);
            }
        };

        private Companion() {
        }

        @NotNull
        public final Annotations create(@NotNull List<? extends AnnotationDescriptor> annotations) {
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            return annotations.isEmpty() ? EMPTY : new AnnotationsImpl(annotations);
        }

        @NotNull
        public final Annotations getEMPTY() {
            return EMPTY;
        }
    }

    @SourceDebugExtension({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/Annotations$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n288#2,2:124\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/Annotations$DefaultImpls\n*L\n29#1:124,2\n*E\n"})
    public static final class DefaultImpls {
        @Nullable
        public static AnnotationDescriptor findAnnotation(@NotNull Annotations annotations, @NotNull FqName fqName) {
            AnnotationDescriptor next;
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(next.getFqName(), fqName)) {
                    return next;
                }
            }
            next = null;
            return next;
        }

        public static boolean hasAnnotation(@NotNull Annotations annotations, @NotNull FqName fqName) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            return annotations.mo6579findAnnotation(fqName) != null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: findAnnotation */
    AnnotationDescriptor mo6579findAnnotation(@NotNull FqName fqName);

    boolean hasAnnotation(@NotNull FqName fqName);

    boolean isEmpty();
}
