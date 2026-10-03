package com.heytap.store.platform.mvvm;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.heytap.store.platform.mvvm.BaseViewModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.TypeCastException;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.PropertyReference1Impl;
import p010kotlin.jvm.internal.Reflection;
import p010kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\r\u0010\u0014\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0010J#\u0010\u0015\u001a\u0002H\u0016\"\b\b\u0001\u0010\u0016*\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019¢\u0006\u0002\u0010\u001aJ#\u0010\u001b\u001a\u0002H\u0016\"\b\b\u0001\u0010\u0016*\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0019¢\u0006\u0002\u0010\u001aJ\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR\u001c\u0010\u000e\u001a\u00028\u0000X\u0084.¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lcom/heytap/store/platform/mvvm/ViewModelActivity;", "VM", "Lcom/heytap/store/platform/mvvm/BaseViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "activityScopeViewModelProvider", "Landroidx/lifecycle/ViewModelProvider;", "getActivityScopeViewModelProvider", "()Landroidx/lifecycle/ViewModelProvider;", "activityScopeViewModelProvider$delegate", "Lkotlin/Lazy;", "applicationScopeViewModelProvider", "getApplicationScopeViewModelProvider", "applicationScopeViewModelProvider$delegate", "viewModel", "getViewModel", "()Lcom/heytap/store/platform/mvvm/BaseViewModel;", "setViewModel", "(Lcom/heytap/store/platform/mvvm/BaseViewModel;)V", "Lcom/heytap/store/platform/mvvm/BaseViewModel;", "createViewModel", "getActivityScopeViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "clazz", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "getApplicationScopeViewModel", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "MVVM_release"}, k = 1, mv = {1, 1, 15})
public abstract class ViewModelActivity<VM extends BaseViewModel> extends AppCompatActivity {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewModelActivity.class), "activityScopeViewModelProvider", "getActivityScopeViewModelProvider()Landroidx/lifecycle/ViewModelProvider;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(ViewModelActivity.class), "applicationScopeViewModelProvider", "getApplicationScopeViewModelProvider()Landroidx/lifecycle/ViewModelProvider;"))};

    /* JADX INFO: renamed from: activityScopeViewModelProvider$delegate, reason: from kotlin metadata */
    private final Lazy activityScopeViewModelProvider = LazyKt__LazyJVMKt.lazy(new Function0<ViewModelProvider>() { // from class: com.heytap.store.platform.mvvm.ViewModelActivity$activityScopeViewModelProvider$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider invoke() {
            return new ViewModelProvider(this.this$0);
        }
    });

    /* JADX INFO: renamed from: applicationScopeViewModelProvider$delegate, reason: from kotlin metadata */
    private final Lazy applicationScopeViewModelProvider = LazyKt__LazyJVMKt.lazy(new Function0<ViewModelProvider>() { // from class: com.heytap.store.platform.mvvm.ViewModelActivity$applicationScopeViewModelProvider$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final ViewModelProvider invoke() {
            Context applicationContext = this.this$0.getApplicationContext();
            if (applicationContext != null) {
                return new ViewModelProvider((ViewModelApplication) applicationContext, ViewModelProvider.AndroidViewModelFactory.getInstance(this.this$0.getApplication()));
            }
            throw new TypeCastException("null cannot be cast to non-null type com.heytap.store.platform.mvvm.ViewModelApplication");
        }
    });

    @NotNull
    protected VM viewModel;

    private final ViewModelProvider getActivityScopeViewModelProvider() {
        Lazy lazy = this.activityScopeViewModelProvider;
        KProperty kProperty = $$delegatedProperties[0];
        return (ViewModelProvider) lazy.getValue();
    }

    private final ViewModelProvider getApplicationScopeViewModelProvider() {
        Lazy lazy = this.applicationScopeViewModelProvider;
        KProperty kProperty = $$delegatedProperties[1];
        return (ViewModelProvider) lazy.getValue();
    }

    @NotNull
    public abstract VM createViewModel();

    @NotNull
    public final <T extends ViewModel> T getActivityScopeViewModel(@NotNull Class<T> clazz) {
        Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        T t = (T) getActivityScopeViewModelProvider().get(clazz);
        Intrinsics.checkExpressionValueIsNotNull(t, "activityScopeViewModelProvider[clazz]");
        return t;
    }

    @NotNull
    public final <T extends ViewModel> T getApplicationScopeViewModel(@NotNull Class<T> clazz) {
        Intrinsics.checkParameterIsNotNull(clazz, "clazz");
        T t = (T) getApplicationScopeViewModelProvider().get(clazz);
        Intrinsics.checkExpressionValueIsNotNull(t, "applicationScopeViewModelProvider[clazz]");
        return t;
    }

    @NotNull
    public final VM getViewModel() {
        VM vm = this.viewModel;
        if (vm == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        }
        return vm;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.viewModel = (VM) createViewModel();
    }

    public final void setViewModel(@NotNull VM vm) {
        Intrinsics.checkParameterIsNotNull(vm, "<set-?>");
        this.viewModel = vm;
    }
}
