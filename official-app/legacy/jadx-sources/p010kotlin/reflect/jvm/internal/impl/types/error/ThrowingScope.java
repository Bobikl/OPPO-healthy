package p010kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p010kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p010kotlin.reflect.jvm.internal.impl.name.Name;
import p010kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;

/* JADX INFO: loaded from: classes11.dex */
public final class ThrowingScope extends ErrorScope {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThrowingScope(@NotNull ErrorScopeKind kind, @NotNull String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getClassifierNames() {
        throw new IllegalStateException();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p010kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo6586getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(getDebugMessage() + ", required name: " + name);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p010kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        throw new IllegalStateException(getDebugMessage());
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        throw new IllegalStateException();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        throw new IllegalStateException();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.error.ErrorScope
    @NotNull
    public String toString() {
        return "ThrowingScope{" + getDebugMessage() + '}';
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p010kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Set<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(getDebugMessage() + ", required name: " + name);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException(getDebugMessage() + ", required name: " + name);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.types.error.ErrorScope, p010kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: recordLookup, reason: merged with bridge method [inline-methods] */
    public Void mo6590recordLookup(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        throw new IllegalStateException();
    }
}
