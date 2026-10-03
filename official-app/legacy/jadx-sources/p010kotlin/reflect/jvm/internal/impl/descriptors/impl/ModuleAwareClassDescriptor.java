package p010kotlin.reflect.jvm.internal.impl.descriptors.impl;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p010kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import p010kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ModuleAwareClassDescriptor implements ClassDescriptor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MemberScope getRefinedMemberScopeIfPossible$descriptors(@NotNull ClassDescriptor classDescriptor, @NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            MemberScope memberScope;
            Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
            Intrinsics.checkNotNullParameter(typeSubstitution, "typeSubstitution");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            ModuleAwareClassDescriptor moduleAwareClassDescriptor = classDescriptor instanceof ModuleAwareClassDescriptor ? (ModuleAwareClassDescriptor) classDescriptor : null;
            if (moduleAwareClassDescriptor != null && (memberScope = moduleAwareClassDescriptor.getMemberScope(typeSubstitution, kotlinTypeRefiner)) != null) {
                return memberScope;
            }
            MemberScope memberScope2 = classDescriptor.getMemberScope(typeSubstitution);
            Intrinsics.checkNotNullExpressionValue(memberScope2, "this.getMemberScope(\n   …ubstitution\n            )");
            return memberScope2;
        }

        @NotNull
        public final MemberScope getRefinedUnsubstitutedMemberScopeIfPossible$descriptors(@NotNull ClassDescriptor classDescriptor, @NotNull KotlinTypeRefiner kotlinTypeRefiner) {
            MemberScope unsubstitutedMemberScope;
            Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
            Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
            ModuleAwareClassDescriptor moduleAwareClassDescriptor = classDescriptor instanceof ModuleAwareClassDescriptor ? (ModuleAwareClassDescriptor) classDescriptor : null;
            if (moduleAwareClassDescriptor != null && (unsubstitutedMemberScope = moduleAwareClassDescriptor.getUnsubstitutedMemberScope(kotlinTypeRefiner)) != null) {
                return unsubstitutedMemberScope;
            }
            MemberScope unsubstitutedMemberScope2 = classDescriptor.getUnsubstitutedMemberScope();
            Intrinsics.checkNotNullExpressionValue(unsubstitutedMemberScope2, "this.unsubstitutedMemberScope");
            return unsubstitutedMemberScope2;
        }
    }

    @NotNull
    public abstract MemberScope getMemberScope(@NotNull TypeSubstitution typeSubstitution, @NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public /* bridge */ /* synthetic */ ClassifierDescriptor getOriginal() {
        return getOriginal();
    }

    @NotNull
    public abstract MemberScope getUnsubstitutedMemberScope(@NotNull KotlinTypeRefiner kotlinTypeRefiner);

    @Override // p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    public /* bridge */ /* synthetic */ DeclarationDescriptor getOriginal() {
        return getOriginal();
    }
}
