package p010kotlin.reflect.jvm.internal.impl.resolve.scopes;

import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import p010kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import p010kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes11.dex */
public final class LazyScopeAdapter extends AbstractScopeAdapter {

    @NotNull
    private final NotNullLazyValue<MemberScope> lazyScope;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LazyScopeAdapter(@NotNull Function0<? extends MemberScope> getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(getScope, "getScope");
    }

    @Override // p010kotlin.reflect.jvm.internal.impl.resolve.scopes.AbstractScopeAdapter
    @NotNull
    public MemberScope getWorkerScope() {
        return this.lazyScope.invoke();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LazyScopeAdapter(StorageManager NO_LOCKS, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            NO_LOCKS = LockBasedStorageManager.NO_LOCKS;
            Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
        }
        this(NO_LOCKS, function0);
    }

    @JvmOverloads
    public LazyScopeAdapter(@NotNull StorageManager storageManager, @NotNull final Function0<? extends MemberScope> getScope) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(getScope, "getScope");
        this.lazyScope = storageManager.createLazyValue(new Function0<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter$lazyScope$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final MemberScope invoke() {
                MemberScope memberScopeInvoke = getScope.invoke();
                return memberScopeInvoke instanceof AbstractScopeAdapter ? ((AbstractScopeAdapter) memberScopeInvoke).getActualScope() : memberScopeInvoke;
            }
        });
    }
}
