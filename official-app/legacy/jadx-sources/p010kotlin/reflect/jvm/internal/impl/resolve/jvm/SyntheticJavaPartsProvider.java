package p010kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p010kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes11.dex */
public interface SyntheticJavaPartsProvider {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final CompositeSyntheticJavaPartsProvider EMPTY = new CompositeSyntheticJavaPartsProvider(CollectionsKt__CollectionsKt.emptyList());

        private Companion() {
        }

        @NotNull
        public final CompositeSyntheticJavaPartsProvider getEMPTY() {
            return EMPTY;
        }
    }

    void generateConstructors(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull List<ClassConstructorDescriptor> list);

    void generateMethods(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection);

    void generateNestedClass(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull List<ClassDescriptor> list);

    void generateStaticFunctions(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor, @NotNull Name name, @NotNull Collection<SimpleFunctionDescriptor> collection);

    @NotNull
    List<Name> getMethodNames(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor);

    @NotNull
    List<Name> getNestedClassNames(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor);

    @NotNull
    List<Name> getStaticFunctionNames(@NotNull LazyJavaResolverContext lazyJavaResolverContext, @NotNull ClassDescriptor classDescriptor);
}
