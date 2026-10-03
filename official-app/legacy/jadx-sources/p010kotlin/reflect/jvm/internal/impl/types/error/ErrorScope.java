package p010kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.SetsKt__SetsJVMKt;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p010kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p010kotlin.reflect.jvm.internal.impl.name.Name;
import p010kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: loaded from: classes11.dex */
public class ErrorScope implements MemberScope {

    @NotNull
    private final String debugMessage;

    @NotNull
    private final ErrorScopeKind kind;

    public ErrorScope(@NotNull ErrorScopeKind kind, @NotNull String... formatParams) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(formatParams, "formatParams");
        this.kind = kind;
        String debugMessage = kind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        this.debugMessage = str;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getClassifierNames() {
        return SetsKt__SetsKt.emptySet();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo6586getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        String str = String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{name}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
        Name nameSpecial = Name.special(str);
        Intrinsics.checkNotNullExpressionValue(nameSpecial, "special(ErrorEntity.ERRO…S.debugText.format(name))");
        return new ErrorClassDescriptor(nameSpecial);
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public final String getDebugMessage() {
        return this.debugMessage;
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        return SetsKt__SetsKt.emptySet();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        return SetsKt__SetsKt.emptySet();
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo6590recordLookup(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
    }

    @NotNull
    public String toString() {
        return "ErrorScope{" + this.debugMessage + '}';
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, p010kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Set<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return SetsKt__SetsJVMKt.setOf(new ErrorFunctionDescriptor(ErrorUtils.INSTANCE.getErrorClass()));
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return ErrorUtils.INSTANCE.getErrorPropertyGroup();
    }
}
