package com.heytap.store.base.core.creator;

import android.content.Context;
import android.view.View;
import com.heytap.store.base.core.data.LoadingPageData;
import com.heytap.store.base.core.state.StateViewService;
import com.heytap.store.base.core.view.OStoreLoadingView;
import com.heytap.store.base.core.vm.LoadingPageVModel;
import com.heytap.store.platform.mvvm.BaseViewModel;
import com.heytap.store.platform.mvvm.ViewModelFragment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/heytap/store/base/core/creator/LoadingPageFragmentCreator;", "Lcom/heytap/store/base/core/state/StateViewService;", "viewModelFragment", "Lcom/heytap/store/platform/mvvm/ViewModelFragment;", "Lcom/heytap/store/platform/mvvm/BaseViewModel;", "loadingPageData", "Lcom/heytap/store/base/core/data/LoadingPageData;", "(Lcom/heytap/store/platform/mvvm/ViewModelFragment;Lcom/heytap/store/base/core/data/LoadingPageData;)V", "replaceBgColorResourceId", "", "getReplaceBgColorResourceId", "()Ljava/lang/Integer;", "setReplaceBgColorResourceId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "replaceIsBgTransparent", "", "getReplaceIsBgTransparent", "()Z", "setReplaceIsBgTransparent", "(Z)V", "createStateView", "Landroid/view/View;", "context", "Landroid/content/Context;", "Companion", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LoadingPageFragmentCreator implements StateViewService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final LoadingPageData loadingPageData;

    @Nullable
    private Integer replaceBgColorResourceId;
    private boolean replaceIsBgTransparent;

    @NotNull
    private final ViewModelFragment<BaseViewModel> viewModelFragment;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ;\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/store/base/core/creator/LoadingPageFragmentCreator$Companion;", "", "()V", "getComponentLoadingView", "Landroid/view/View;", "context", "Landroid/content/Context;", "loadingPageVModel", "Lcom/heytap/store/platform/mvvm/BaseViewModel;", "loadingPageData", "Lcom/heytap/store/base/core/data/LoadingPageData;", "replaceIsBgTransparent", "", "replaceBgColorResourceId", "", "(Landroid/content/Context;Lcom/heytap/store/platform/mvvm/BaseViewModel;Lcom/heytap/store/base/core/data/LoadingPageData;ZLjava/lang/Integer;)Landroid/view/View;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ View getComponentLoadingView$default(Companion companion, Context context, BaseViewModel baseViewModel, LoadingPageData loadingPageData, boolean z, Integer num, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 16) != 0) {
                num = null;
            }
            return companion.getComponentLoadingView(context, baseViewModel, loadingPageData, z2, num);
        }

        @Nullable
        public final View getComponentLoadingView(@NotNull Context context, @NotNull BaseViewModel loadingPageVModel, @NotNull LoadingPageData loadingPageData) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(loadingPageVModel, "loadingPageVModel");
            Intrinsics.checkNotNullParameter(loadingPageData, "loadingPageData");
            return getComponentLoadingView(context, loadingPageVModel, loadingPageData, false, null);
        }

        @Nullable
        public final View getComponentLoadingView(@NotNull Context context, @NotNull BaseViewModel loadingPageVModel, @NotNull LoadingPageData loadingPageData, boolean replaceIsBgTransparent, @Nullable Integer replaceBgColorResourceId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(loadingPageVModel, "loadingPageVModel");
            Intrinsics.checkNotNullParameter(loadingPageData, "loadingPageData");
            OStoreLoadingView oStoreLoadingView = new OStoreLoadingView(context, null, 0, loadingPageVModel, 6, null);
            oStoreLoadingView.setReplaceIsBgTransparent(replaceIsBgTransparent);
            oStoreLoadingView.setReplaceBgColorResourceId(replaceBgColorResourceId);
            return oStoreLoadingView;
        }
    }

    public LoadingPageFragmentCreator(@NotNull ViewModelFragment<BaseViewModel> viewModelFragment, @NotNull LoadingPageData loadingPageData) {
        Intrinsics.checkNotNullParameter(viewModelFragment, "viewModelFragment");
        Intrinsics.checkNotNullParameter(loadingPageData, "loadingPageData");
        this.viewModelFragment = viewModelFragment;
        this.loadingPageData = loadingPageData;
    }

    @Override // com.heytap.store.base.core.state.StateViewService
    @Nullable
    public View createStateView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.viewModelFragment.isDetached() || this.viewModelFragment.getContext() == null) {
            return null;
        }
        LoadingPageVModel loadingPageVModel = (LoadingPageVModel) this.viewModelFragment.getFragmentScopeViewModel(LoadingPageVModel.class);
        loadingPageVModel.init(context, this.loadingPageData);
        return INSTANCE.getComponentLoadingView(context, loadingPageVModel, this.loadingPageData, this.replaceIsBgTransparent, this.replaceBgColorResourceId);
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

    public /* synthetic */ LoadingPageFragmentCreator(ViewModelFragment viewModelFragment, LoadingPageData loadingPageData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelFragment, (i & 2) != 0 ? new LoadingPageData("", -1, -1, -1, -1) : loadingPageData);
    }
}
