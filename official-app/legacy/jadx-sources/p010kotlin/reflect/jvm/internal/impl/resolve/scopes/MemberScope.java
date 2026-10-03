package p010kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import p010kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import p010kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import p010kotlin.reflect.jvm.internal.impl.name.Name;

/* JADX INFO: loaded from: classes11.dex */
public interface MemberScope extends ResolutionScope {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final Function1<Name, Boolean> ALL_NAME_FILTER = new Function1<Name, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope$Companion$ALL_NAME_FILTER$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Name it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            }
        };

        private Companion() {
        }

        @NotNull
        public final Function1<Name, Boolean> getALL_NAME_FILTER() {
            return ALL_NAME_FILTER;
        }
    }

    public static final class DefaultImpls {
        public static void recordLookup(@NotNull MemberScope memberScope, @NotNull Name name, @NotNull LookupLocation location) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(location, "location");
            ResolutionScope.DefaultImpls.recordLookup(memberScope, name, location);
        }
    }

    public static final class Empty extends MemberScopeImpl {

        @NotNull
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Set<Name> getClassifierNames() {
            return SetsKt__SetsKt.emptySet();
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Set<Name> getFunctionNames() {
            return SetsKt__SetsKt.emptySet();
        }

        @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, p010kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
        @NotNull
        public Set<Name> getVariableNames() {
            return SetsKt__SetsKt.emptySet();
        }
    }

    @Nullable
    Set<Name> getClassifierNames();

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation lookupLocation);

    @NotNull
    Collection<? extends PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation lookupLocation);

    @NotNull
    Set<Name> getFunctionNames();

    @NotNull
    Set<Name> getVariableNames();
}
