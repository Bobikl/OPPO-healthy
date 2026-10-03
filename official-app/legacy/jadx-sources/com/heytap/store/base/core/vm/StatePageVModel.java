package com.heytap.store.base.core.vm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.ObservableField;
import com.heytap.store.base.core.activity.StoreBaseActivity;
import com.heytap.store.base.core.data.StatePageData;
import com.heytap.store.base.core.fragment.StoreBaseFragment;
import com.heytap.store.base.core.vm.StatePageVModel;
import com.heytap.store.platform.mvvm.BaseViewModel;
import com.heytap.store.platform.mvvm.ViewModelFragment;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\"\u001a\u00020#J(\u0010$\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d2\b\u0010%\u001a\u0004\u0018\u00010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\rR\"\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/heytap/store/base/core/vm/StatePageVModel;", "Lcom/heytap/store/platform/mvvm/BaseViewModel;", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", ResourcesUtil.ResourceType.DRAWABLE, "Landroidx/databinding/ObservableField;", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroidx/databinding/ObservableField;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "subText", "", "getSubText", "subTextVisible", "", "getSubTextVisible", "text", "getText", "viewModelFragment", "Lcom/heytap/store/platform/mvvm/ViewModelFragment;", "getViewModelFragment", "()Lcom/heytap/store/platform/mvvm/ViewModelFragment;", "setViewModelFragment", "(Lcom/heytap/store/platform/mvvm/ViewModelFragment;)V", "actionClick", "", "init", "statePageData", "Lcom/heytap/store/base/core/data/StatePageData;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class StatePageVModel extends BaseViewModel {

    @Nullable
    private Context context;

    @Nullable
    private ViewModelFragment<BaseViewModel> viewModelFragment;

    @NotNull
    private final ObservableField<String> text = new ObservableField<>();

    @NotNull
    private final ObservableField<String> subText = new ObservableField<>();

    @NotNull
    private final ObservableField<Integer> subTextVisible = new ObservableField<>();

    @NotNull
    private final ObservableField<Drawable> drawable = new ObservableField<>();

    /* JADX INFO: renamed from: handler$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy handler = LazyKt__LazyJVMKt.lazy(new Function0<Handler>() { // from class: com.heytap.store.base.core.vm.StatePageVModel$handler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: actionClick$lambda-1, reason: not valid java name */
    public static final void m4813actionClick$lambda1(StatePageVModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            ViewModelFragment<BaseViewModel> viewModelFragment = this$0.viewModelFragment;
            StoreBaseFragment storeBaseFragment = viewModelFragment instanceof StoreBaseFragment ? (StoreBaseFragment) viewModelFragment : null;
            if (storeBaseFragment != null) {
                storeBaseFragment.reload();
            }
            Context context = this$0.context;
            StoreBaseActivity storeBaseActivity = context instanceof StoreBaseActivity ? (StoreBaseActivity) context : null;
            if (storeBaseActivity == null) {
                return;
            }
            storeBaseActivity.reload();
        } catch (Exception unused) {
        }
    }

    private final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    public final void actionClick() {
        ViewModelFragment<BaseViewModel> viewModelFragment = this.viewModelFragment;
        StoreBaseFragment storeBaseFragment = viewModelFragment instanceof StoreBaseFragment ? (StoreBaseFragment) viewModelFragment : null;
        if (storeBaseFragment != null) {
            storeBaseFragment.showLoadingView();
        }
        getHandler().postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.smi
            @Override // java.lang.Runnable
            public final void run() {
                StatePageVModel.m4813actionClick$lambda1(this.i);
            }
        }, 500L);
    }

    @Nullable
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final ObservableField<Drawable> getDrawable() {
        return this.drawable;
    }

    @NotNull
    public final ObservableField<String> getSubText() {
        return this.subText;
    }

    @NotNull
    public final ObservableField<Integer> getSubTextVisible() {
        return this.subTextVisible;
    }

    @NotNull
    public final ObservableField<String> getText() {
        return this.text;
    }

    @Nullable
    public final ViewModelFragment<BaseViewModel> getViewModelFragment() {
        return this.viewModelFragment;
    }

    public final void init(@NotNull Context context, @Nullable ViewModelFragment<BaseViewModel> viewModelFragment, @Nullable StatePageData statePageData) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.viewModelFragment = viewModelFragment;
        if (statePageData == null) {
            return;
        }
        getText().set(statePageData.getTextStr());
        if (statePageData.getSubTextResourceId() != 0) {
            getSubText().set(context.getResources().getString(statePageData.getSubTextResourceId()));
            getSubTextVisible().set(0);
        } else {
            getSubText().set("");
            getSubTextVisible().set(8);
        }
        getDrawable().set(ResourcesCompat.getDrawable(context.getResources(), statePageData.getDrawableResourceId(), null));
    }

    public final void setContext(@Nullable Context context) {
        this.context = context;
    }

    public final void setViewModelFragment(@Nullable ViewModelFragment<BaseViewModel> viewModelFragment) {
        this.viewModelFragment = viewModelFragment;
    }
}
