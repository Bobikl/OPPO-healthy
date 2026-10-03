package com.heytap.store.platform.mvvm;

import android.app.Application;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.PropertyReference1Impl;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0005H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/platform/mvvm/ViewModelApplication;", "Landroid/app/Application;", "Landroidx/lifecycle/ViewModelStoreOwner;", "()V", "applicationScopeModelStore", "Landroidx/lifecycle/ViewModelStore;", "getApplicationScopeModelStore", "()Landroidx/lifecycle/ViewModelStore;", "applicationScopeModelStore$delegate", "Lkotlin/Lazy;", "getViewModelStore", "MVVM_release"}, k = 1, mv = {1, 1, 15})
public abstract class ViewModelApplication extends Application implements ViewModelStoreOwner {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewModelApplication.class), "applicationScopeModelStore", "getApplicationScopeModelStore()Landroidx/lifecycle/ViewModelStore;"))};

    /* JADX INFO: renamed from: applicationScopeModelStore$delegate, reason: from kotlin metadata */
    private final Lazy applicationScopeModelStore = LazyKt__LazyJVMKt.lazy(new Function0<ViewModelStore>() { // from class: com.heytap.store.platform.mvvm.ViewModelApplication$applicationScopeModelStore$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelStore invoke() {
            return new ViewModelStore();
        }
    });

    private final ViewModelStore getApplicationScopeModelStore() {
        Lazy lazy = this.applicationScopeModelStore;
        KProperty kProperty = $$delegatedProperties[0];
        return (ViewModelStore) lazy.getValue();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NotNull
    public ViewModelStore getViewModelStore() {
        return getApplicationScopeModelStore();
    }
}
