package p010kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p010kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractScopeAdapter implements MemberScope {
    @NotNull
    public final MemberScope getActualScope() {
        if (!(getWorkerScope() instanceof AbstractScopeAdapter)) {
            return getWorkerScope();
        }
        MemberScope workerScope = getWorkerScope();
        Intrinsics.checkNotNull(workerScope, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((AbstractScopeAdapter) workerScope).getActualScope();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @Nullable
    public Set<Name> getClassifierNames() {
        return getWorkerScope().getClassifierNames();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @Nullable
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo6586getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return getWorkerScope().mo6586getContributedClassifier(name, location);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return getWorkerScope().getContributedDescriptors(kindFilter, nameFilter);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p010kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return getWorkerScope().getContributedFunctions(name, location);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return getWorkerScope().getContributedVariables(name, location);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        return getWorkerScope().getFunctionNames();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        return getWorkerScope().getVariableNames();
    }

    @NotNull
    public abstract MemberScope getWorkerScope();

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo6590recordLookup(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        getWorkerScope().mo6590recordLookup(name, location);
    }
}
