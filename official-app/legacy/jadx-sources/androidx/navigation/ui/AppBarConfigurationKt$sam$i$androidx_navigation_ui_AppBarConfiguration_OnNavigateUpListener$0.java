package androidx.navigation.ui;

import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
public final class AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 implements AppBarConfiguration.OnNavigateUpListener {
    private final /* synthetic */ Function0 function;

    public AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(Function0 function0) {
        this.function = function0;
    }

    @Override // androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener
    public final /* synthetic */ boolean onNavigateUp() {
        Object objInvoke = this.function.invoke();
        Intrinsics.checkExpressionValueIsNotNull(objInvoke, "invoke(...)");
        return ((Boolean) objInvoke).booleanValue();
    }
}
