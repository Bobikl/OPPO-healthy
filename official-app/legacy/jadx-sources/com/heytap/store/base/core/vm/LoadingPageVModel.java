package com.heytap.store.base.core.vm;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.ObservableField;
import com.heytap.store.base.core.R;
import com.heytap.store.base.core.data.LoadingPageData;
import com.heytap.store.base.widget.state.CommonConfig;
import com.heytap.store.platform.mvvm.BaseViewModel;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/base/core/vm/LoadingPageVModel;", "Lcom/heytap/store/platform/mvvm/BaseViewModel;", "()V", "loadingText", "Landroidx/databinding/ObservableField;", "", "getLoadingText", "()Landroidx/databinding/ObservableField;", "loadingTextColor", "", "getLoadingTextColor", "showSkeleton", "", "kotlin.jvm.PlatformType", "getShowSkeleton", "skeletonDrawable", "Landroid/graphics/drawable/Drawable;", "getSkeletonDrawable", "init", "", "context", "Landroid/content/Context;", "loadingPageData", "Lcom/heytap/store/base/core/data/LoadingPageData;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LoadingPageVModel extends BaseViewModel {

    @NotNull
    private final ObservableField<String> loadingText = new ObservableField<>();

    @NotNull
    private final ObservableField<Integer> loadingTextColor = new ObservableField<>();

    @NotNull
    private final ObservableField<Boolean> showSkeleton = new ObservableField<>(Boolean.FALSE);

    @NotNull
    private final ObservableField<Drawable> skeletonDrawable = new ObservableField<>();

    @NotNull
    public final ObservableField<String> getLoadingText() {
        return this.loadingText;
    }

    @NotNull
    public final ObservableField<Integer> getLoadingTextColor() {
        return this.loadingTextColor;
    }

    @NotNull
    public final ObservableField<Boolean> getShowSkeleton() {
        return this.showSkeleton;
    }

    @NotNull
    public final ObservableField<Drawable> getSkeletonDrawable() {
        return this.skeletonDrawable;
    }

    public final void init(@NotNull Context context, @NotNull LoadingPageData loadingPageData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(loadingPageData, "loadingPageData");
        this.loadingText.set(CommonConfig.INSTANCE.getLoadingStr());
        this.loadingTextColor.set(Integer.valueOf(ResourcesCompat.getColor(context.getResources(), R.color.pf_core_loading_text_color, null)));
        if (loadingPageData.getLoadingText().length() > 0) {
            this.loadingText.set(loadingPageData.getLoadingText());
        }
        if (loadingPageData.getLoadingTextColor() > 0) {
            this.loadingTextColor.set(Integer.valueOf(loadingPageData.getLoadingTextColor()));
        }
        if (loadingPageData.getSkeletonResourceId() <= 0) {
            this.showSkeleton.set(Boolean.FALSE);
        } else {
            this.showSkeleton.set(Boolean.TRUE);
            this.skeletonDrawable.set(ResourcesCompat.getDrawable(context.getResources(), loadingPageData.getSkeletonResourceId(), null));
        }
    }
}
