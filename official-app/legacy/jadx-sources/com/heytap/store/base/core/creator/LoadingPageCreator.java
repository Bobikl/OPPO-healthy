package com.heytap.store.base.core.creator;

import android.content.Context;
import android.view.View;
import com.heytap.store.base.core.data.LoadingPageData;
import com.heytap.store.base.core.state.StateViewService;
import com.heytap.store.base.core.vm.LoadingPageVModel;
import com.heytap.store.platform.mvvm.BaseViewModel;
import com.heytap.store.platform.mvvm.ViewModelActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/heytap/store/base/core/creator/LoadingPageCreator;", "Lcom/heytap/store/base/core/state/StateViewService;", "viewModelActivity", "Lcom/heytap/store/platform/mvvm/ViewModelActivity;", "Lcom/heytap/store/platform/mvvm/BaseViewModel;", "loadingPageData", "Lcom/heytap/store/base/core/data/LoadingPageData;", "(Lcom/heytap/store/platform/mvvm/ViewModelActivity;Lcom/heytap/store/base/core/data/LoadingPageData;)V", "replaceBgColorResourceId", "", "getReplaceBgColorResourceId", "()Ljava/lang/Integer;", "setReplaceBgColorResourceId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "replaceIsBgTransparent", "", "getReplaceIsBgTransparent", "()Z", "setReplaceIsBgTransparent", "(Z)V", "createStateView", "Landroid/view/View;", "context", "Landroid/content/Context;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LoadingPageCreator implements StateViewService {

    @NotNull
    private final LoadingPageData loadingPageData;

    @Nullable
    private Integer replaceBgColorResourceId;
    private boolean replaceIsBgTransparent;

    @NotNull
    private final ViewModelActivity<BaseViewModel> viewModelActivity;

    public LoadingPageCreator(@NotNull ViewModelActivity<BaseViewModel> viewModelActivity, @NotNull LoadingPageData loadingPageData) {
        Intrinsics.checkNotNullParameter(viewModelActivity, "viewModelActivity");
        Intrinsics.checkNotNullParameter(loadingPageData, "loadingPageData");
        this.viewModelActivity = viewModelActivity;
        this.loadingPageData = loadingPageData;
    }

    @Override // com.heytap.store.base.core.state.StateViewService
    @Nullable
    public View createStateView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.viewModelActivity.isFinishing()) {
            return null;
        }
        LoadingPageVModel loadingPageVModel = (LoadingPageVModel) this.viewModelActivity.getActivityScopeViewModel(LoadingPageVModel.class);
        loadingPageVModel.init(context, this.loadingPageData);
        return LoadingPageFragmentCreator.INSTANCE.getComponentLoadingView(context, loadingPageVModel, this.loadingPageData, this.replaceIsBgTransparent, this.replaceBgColorResourceId);
    }

    @Nullable
    public final Integer getReplaceBgColorResourceId() {
        return this.replaceBgColorResourceId;
    }

    public final boolean getReplaceIsBgTransparent() {
        return this.replaceIsBgTransparent;
    }

    @Override // com.heytap.store.base.core.state.StateViewService
    public void onStateViewVisibleChanged(boolean z) {
        StateViewService.DefaultImpls.onStateViewVisibleChanged(this, z);
    }

    public final void setReplaceBgColorResourceId(@Nullable Integer num) {
        this.replaceBgColorResourceId = num;
    }

    public final void setReplaceIsBgTransparent(boolean z) {
        this.replaceIsBgTransparent = z;
    }

    public /* synthetic */ LoadingPageCreator(ViewModelActivity viewModelActivity, LoadingPageData loadingPageData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelActivity, (i & 2) != 0 ? new LoadingPageData("", -1, -1, -1, -1) : loadingPageData);
    }
}
