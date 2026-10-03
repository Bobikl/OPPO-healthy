package p010kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p010kotlin.reflect.jvm.internal.impl.name.ClassId;
import p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p010kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner;
import p010kotlin.reflect.jvm.internal.impl.types.KotlinType;
import p010kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import p010kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes11.dex */
public abstract class KotlinTypeRefiner extends AbstractTypeRefiner {

    public static final class Default extends KotlinTypeRefiner {

        @NotNull
        public static final Default INSTANCE = new Default();

        private Default() {
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @Nullable
        public ClassDescriptor findClassAcrossModuleDependencies(@NotNull ClassId classId) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            return null;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @NotNull
        public <S extends MemberScope> S getOrPutScopeForClass(@NotNull ClassDescriptor classDescriptor, @NotNull Function0<? extends S> compute) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(compute, "compute");
            return compute.invoke();
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public boolean isRefinementNeededForModule(@NotNull ModuleDescriptor moduleDescriptor) {
            Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public boolean isRefinementNeededForTypeConstructor(@NotNull TypeConstructor typeConstructor) {
            Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @Nullable
        public ClassDescriptor refineDescriptor(@NotNull DeclarationDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return null;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        @NotNull
        public Collection<KotlinType> refineSupertypes(@NotNull ClassDescriptor classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Collection<KotlinType> collectionMo6585getSupertypes = classDescriptor.getTypeConstructor().mo6585getSupertypes();
            Intrinsics.checkNotNullExpressionValue(collectionMo6585getSupertypes, "classDescriptor.typeConstructor.supertypes");
            return collectionMo6585getSupertypes;
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
        @NotNull
        public KotlinType refineType(@NotNull KotlinTypeMarker type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return (KotlinType) type;
        }
    }

    @Nullable
    public abstract ClassDescriptor findClassAcrossModuleDependencies(@NotNull ClassId classId);

    @NotNull
    public abstract <S extends MemberScope> S getOrPutScopeForClass(@NotNull ClassDescriptor classDescriptor, @NotNull Function0<? extends S> function0);

    public abstract boolean isRefinementNeededForModule(@NotNull ModuleDescriptor moduleDescriptor);

    public abstract boolean isRefinementNeededForTypeConstructor(@NotNull TypeConstructor typeConstructor);

    @Nullable
    public abstract ClassifierDescriptor refineDescriptor(@NotNull DeclarationDescriptor declarationDescriptor);

    @NotNull
    public abstract Collection<KotlinType> refineSupertypes(@NotNull ClassDescriptor classDescriptor);

    @Override // p010kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
    @NotNull
    public abstract KotlinType refineType(@NotNull KotlinTypeMarker kotlinTypeMarker);
}
