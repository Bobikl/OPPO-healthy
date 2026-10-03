package com.heytap.store.base.core.state;

import com.heytap.store.base.widget.state.data.StateEmptyBean;
import com.heytap.store.base.widget.state.data.StateErrorBean;
import com.heytap.store.base.widget.state.data.StateLoadBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH&J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\u0014\u0010\f\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\bH\u0016J\u0014\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\u0014\u0010\u0015\u001a\u00020\b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016J\u0014\u0010\u0019\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\b\u0010\u001a\u001a\u00020\bH&J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H&¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/base/core/state/IStateViewHandler;", "", "containsNoneStateView", "", "containsStateView", "stateViewKey", "", "hideLoadingView", "", "hideStateLayout", "hideStateView", "showContentView", "showEmptyView", "emptyBean", "Lcom/heytap/store/base/widget/state/data/StateEmptyBean;", "showErrorStateView", "exception", "Ljava/lang/Exception;", "showErrorView", "errorBean", "Lcom/heytap/store/base/widget/state/data/StateErrorBean;", "showLoadView", "loadBean", "Lcom/heytap/store/base/widget/state/data/StateLoadBean;", "showLoadingView", "showNetWorkErrorView", "showStateLayout", "showStateView", "updateEmptyRes", "updateLoadRes", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IStateViewHandler {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void hideLoadingView(@NotNull IStateViewHandler iStateViewHandler) {
            Intrinsics.checkNotNullParameter(iStateViewHandler, "this");
            iStateViewHandler.hideStateLayout();
        }

        public static void showContentView(@NotNull IStateViewHandler iStateViewHandler) {
            Intrinsics.checkNotNullParameter(iStateViewHandler, "this");
            iStateViewHandler.hideStateLayout();
        }

        public static void showEmptyView(@NotNull IStateViewHandler iStateViewHandler) {
            Intrinsics.checkNotNullParameter(iStateViewHandler, "this");
            iStateViewHandler.showStateView("empty");
        }

        public static /* synthetic */ void showEmptyView$default(IStateViewHandler iStateViewHandler, StateEmptyBean stateEmptyBean, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showEmptyView");
            }
            if ((i & 1) != 0) {
                stateEmptyBean = null;
            }
            iStateViewHandler.showEmptyView(stateEmptyBean);
        }

        public static void showErrorView(@NotNull IStateViewHandler iStateViewHandler) {
            Intrinsics.checkNotNullParameter(iStateViewHandler, "this");
            iStateViewHandler.showStateView("error");
        }

        public static /* synthetic */ void showErrorView$default(IStateViewHandler iStateViewHandler, StateErrorBean stateErrorBean, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showErrorView");
            }
            if ((i & 1) != 0) {
                stateErrorBean = null;
            }
            iStateViewHandler.showErrorView(stateErrorBean);
        }

        public static /* synthetic */ void showLoadView$default(IStateViewHandler iStateViewHandler, StateLoadBean stateLoadBean, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLoadView");
            }
            if ((i & 1) != 0) {
                stateLoadBean = null;
            }
            iStateViewHandler.showLoadView(stateLoadBean);
        }

        public static void showLoadingView(@NotNull IStateViewHandler iStateViewHandler) {
            Intrinsics.checkNotNullParameter(iStateViewHandler, "this");
            iStateViewHandler.showStateView(Constants.LOADING);
        }

        public static void showNetWorkErrorView(@NotNull IStateViewHandler iStateViewHandler) {
            Intrinsics.checkNotNullParameter(iStateViewHandler, "this");
            iStateViewHandler.showStateView(Constants.NETWORK_ERROR);
        }

        public static /* synthetic */ void showNetWorkErrorView$default(IStateViewHandler iStateViewHandler, StateErrorBean stateErrorBean, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showNetWorkErrorView");
            }
            if ((i & 1) != 0) {
                stateErrorBean = null;
            }
            iStateViewHandler.showNetWorkErrorView(stateErrorBean);
        }
    }

    boolean containsNoneStateView();

    boolean containsStateView(@NotNull String stateViewKey);

    void hideLoadingView();

    void hideStateLayout();

    void hideStateView(@NotNull String stateViewKey);

    void showContentView();

    void showEmptyView();

    void showEmptyView(@Nullable StateEmptyBean emptyBean);

    void showErrorStateView(@NotNull Exception exception);

    void showErrorView();

    void showErrorView(@Nullable StateErrorBean errorBean);

    void showLoadView(@Nullable StateLoadBean loadBean);

    void showLoadingView();

    void showNetWorkErrorView();

    void showNetWorkErrorView(@Nullable StateErrorBean errorBean);

    void showStateLayout();

    void showStateView(@NotNull String stateViewKey);

    void updateEmptyRes(@NotNull StateEmptyBean emptyBean);

    void updateLoadRes(@NotNull StateLoadBean loadBean);
}
