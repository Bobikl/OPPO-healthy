package androidx.navigation;

import androidx.lifecycle.ViewModelStore;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;
import p010kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 1, 16})
public final class NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1 extends Lambda implements Function0<ViewModelStore> {
    final /* synthetic */ Lazy $backStackEntry;
    final /* synthetic */ KProperty $backStackEntry$metadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(Lazy lazy, KProperty kProperty) {
        super(0);
        this.$backStackEntry = lazy;
        this.$backStackEntry$metadata = kProperty;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p010kotlin.jvm.functions.Function0
    @NotNull
    public final ViewModelStore invoke() {
        NavBackStackEntry backStackEntry = (NavBackStackEntry) this.$backStackEntry.getValue();
        Intrinsics.checkExpressionValueIsNotNull(backStackEntry, "backStackEntry");
        ViewModelStore viewModelStore = backStackEntry.getViewModelStore();
        Intrinsics.checkExpressionValueIsNotNull(viewModelStore, "backStackEntry.viewModelStore");
        return viewModelStore;
    }
}
