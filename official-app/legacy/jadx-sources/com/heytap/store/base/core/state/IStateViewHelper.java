package com.heytap.store.base.core.state;

import android.view.ViewGroup;
import androidx.annotation.IdRes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J]\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/heytap/store/base/core/state/IStateViewHelper;", "Lcom/heytap/store/base/core/state/IStateViewHandler;", "Lcom/heytap/store/base/core/state/IStateViewGatherCreator;", "bindStateLayout", "", "stateLayout", "Landroid/view/ViewGroup;", "scene", "", "stateBgColor", "", "stateClickAction", "Lkotlin/Function2;", "isCustomLayout", "", "isFullScreenCenter", "(Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/jvm/functions/Function2;ZZ)V", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface IStateViewHelper extends IStateViewHandler, IStateViewGatherCreator {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void bindStateLayout$default(IStateViewHelper iStateViewHelper, ViewGroup viewGroup, String str, Integer num, Function2 function2, boolean z, boolean z2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindStateLayout");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            String str2 = str;
            if ((i & 4) != 0) {
                num = -1;
            }
            Integer num2 = num;
            if ((i & 8) != 0) {
                function2 = null;
            }
            iStateViewHelper.bindStateLayout(viewGroup, str2, num2, function2, z, z2);
        }

        public static void hideLoadingView(@NotNull IStateViewHelper iStateViewHelper) {
            Intrinsics.checkNotNullParameter(iStateViewHelper, "this");
            IStateViewHandler.DefaultImpls.hideLoadingView(iStateViewHelper);
        }

        public static void showContentView(@NotNull IStateViewHelper iStateViewHelper) {
            Intrinsics.checkNotNullParameter(iStateViewHelper, "this");
            IStateViewHandler.DefaultImpls.showContentView(iStateViewHelper);
        }

        public static void showEmptyView(@NotNull IStateViewHelper iStateViewHelper) {
            Intrinsics.checkNotNullParameter(iStateViewHelper, "this");
            IStateViewHandler.DefaultImpls.showEmptyView(iStateViewHelper);
        }

        public static void showErrorView(@NotNull IStateViewHelper iStateViewHelper) {
            Intrinsics.checkNotNullParameter(iStateViewHelper, "this");
            IStateViewHandler.DefaultImpls.showErrorView(iStateViewHelper);
        }

        public static void showLoadingView(@NotNull IStateViewHelper iStateViewHelper) {
            Intrinsics.checkNotNullParameter(iStateViewHelper, "this");
            IStateViewHandler.DefaultImpls.showLoadingView(iStateViewHelper);
        }

        public static void showNetWorkErrorView(@NotNull IStateViewHelper iStateViewHelper) {
            Intrinsics.checkNotNullParameter(iStateViewHelper, "this");
            IStateViewHandler.DefaultImpls.showNetWorkErrorView(iStateViewHelper);
        }
    }

    void bindStateLayout(@Nullable ViewGroup stateLayout, @Nullable String scene, @IdRes @Nullable Integer stateBgColor, @Nullable Function2<? super String, ? super String, Unit> stateClickAction, boolean isCustomLayout, boolean isFullScreenCenter);
}
