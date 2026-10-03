package com.heytap.store.splash.helper;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.sdk.R;
import com.heytap.store.splash.databinding.HeytapStoreSdkActionbarBinding;
import com.heytap.store.util.ThemeUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/heytap/store/splash/helper/SearchViewHelper;", "", "context", "Landroid/content/Context;", "binding", "Lcom/heytap/store/splash/databinding/HeytapStoreSdkActionbarBinding;", "isNeedSearchView", "", "(Landroid/content/Context;Lcom/heytap/store/splash/databinding/HeytapStoreSdkActionbarBinding;Z)V", "changeSearchLayoutBack", "", "isTop", "homeCompent_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SearchViewHelper {

    @Nullable
    private final HeytapStoreSdkActionbarBinding binding;

    @NotNull
    private final Context context;
    private final boolean isNeedSearchView;

    public SearchViewHelper(@NotNull Context context, @Nullable HeytapStoreSdkActionbarBinding heytapStoreSdkActionbarBinding, boolean z) {
        TextView textView;
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.binding = heytapStoreSdkActionbarBinding;
        this.isNeedSearchView = z;
        if (heytapStoreSdkActionbarBinding != null) {
            if (!z) {
                ConstraintLayout constraintLayout = heytapStoreSdkActionbarBinding != null ? heytapStoreSdkActionbarBinding.searchViewLayout : null;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(z ? 0 : 8);
                }
                textView = heytapStoreSdkActionbarBinding != null ? heytapStoreSdkActionbarBinding.homeStoreTitle : null;
                if (textView == null) {
                    return;
                }
                textView.setVisibility(z ? 8 : 0);
                return;
            }
            ConstraintLayout constraintLayout2 = heytapStoreSdkActionbarBinding != null ? heytapStoreSdkActionbarBinding.searchViewLayout : null;
            if (constraintLayout2 != null) {
                constraintLayout2.setVisibility(z ? 0 : 8);
            }
            textView = heytapStoreSdkActionbarBinding != null ? heytapStoreSdkActionbarBinding.homeStoreTitle : null;
            if (textView != null) {
                textView.setVisibility(z ? 8 : 0);
            }
            heytapStoreSdkActionbarBinding.searchViewLayout.setBackgroundColor(context.getResources().getColor(R.color.heytap_base_search_bg_ignore_dark));
            ThemeUtil themeUtil = ThemeUtil.INSTANCE;
            ConstraintLayout constraintLayout3 = heytapStoreSdkActionbarBinding.searchViewLayout;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.searchViewLayout");
            themeUtil.setForceDarkAllowed(false, constraintLayout3);
            heytapStoreSdkActionbarBinding.searchViewLayout.setOutlineProvider(new ViewOutlineProvider() { // from class: com.heytap.store.splash.helper.SearchViewHelper$1$1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(@Nullable View view, @Nullable Outline outline) {
                    if (view == null || outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), DisplayUtil.dip2px(16.0f));
                    view.setClipToOutline(true);
                }
            });
        }
    }

    public final void changeSearchLayoutBack(boolean isTop) {
        ConstraintLayout constraintLayout;
        HeytapStoreSdkActionbarBinding heytapStoreSdkActionbarBinding = this.binding;
        if (heytapStoreSdkActionbarBinding == null || (constraintLayout = heytapStoreSdkActionbarBinding.searchViewLayout) == null) {
            return;
        }
        constraintLayout.setBackgroundColor(this.context.getResources().getColor(isTop ? R.color.heytap_base_white_ignore_dark : R.color.heytap_base_search_bg_ignore_dark));
    }
}
