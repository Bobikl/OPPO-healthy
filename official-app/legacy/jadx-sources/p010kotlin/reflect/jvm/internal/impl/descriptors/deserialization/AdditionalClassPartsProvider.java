package p010kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p010kotlin.reflect.jvm.internal.impl.name.Name;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes11.dex */
public interface AdditionalClassPartsProvider {

    public static final class None implements AdditionalClassPartsProvider {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        public Collection<ClassConstructorDescriptor> getConstructors(@NotNull ClassDescriptor classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        public Collection<SimpleFunctionDescriptor> getFunctions(@NotNull Name name, @NotNull ClassDescriptor classDescriptor) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        public Collection<Name> getFunctionsNames(@NotNull ClassDescriptor classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt__CollectionsKt.emptyList();
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
        @NotNull
        public Collection<KotlinType> getSupertypes(@NotNull ClassDescriptor classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    Collection<ClassConstructorDescriptor> getConstructors(@NotNull ClassDescriptor classDescriptor);

    @NotNull
    Collection<SimpleFunctionDescriptor> getFunctions(@NotNull Name name, @NotNull ClassDescriptor classDescriptor);

    @NotNull
    Collection<Name> getFunctionsNames(@NotNull ClassDescriptor classDescriptor);

    @NotNull
    Collection<KotlinType> getSupertypes(@NotNull ClassDescriptor classDescriptor);
}
