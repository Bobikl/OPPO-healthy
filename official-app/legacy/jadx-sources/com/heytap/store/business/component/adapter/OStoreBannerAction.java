package com.heytap.store.business.component.adapter;

import android.view.View;
import com.heytap.store.base.widget.recycler.BannerLayoutManager;
import com.heytap.store.business.component.listener.IBannerAction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/heytap/store/business/component/adapter/OStoreBannerAction;", "Lcom/heytap/store/business/component/listener/IBannerAction;", "bannerLayoutManager", "Lcom/heytap/store/base/widget/recycler/BannerLayoutManager;", "(Lcom/heytap/store/base/widget/recycler/BannerLayoutManager;)V", "getBannerLayoutManager", "()Lcom/heytap/store/base/widget/recycler/BannerLayoutManager;", "findViewByPosition", "Landroid/view/View;", "position", "", "getCurrentPosition", "getFirstPosition", "getRealPosition", "pause", "", "resume", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreBannerAction implements IBannerAction {

    @NotNull
    private final BannerLayoutManager bannerLayoutManager;

    public OStoreBannerAction(@NotNull BannerLayoutManager bannerLayoutManager) {
        Intrinsics.checkNotNullParameter(bannerLayoutManager, "bannerLayoutManager");
        this.bannerLayoutManager = bannerLayoutManager;
    }

    @Override // com.heytap.store.business.component.listener.IBannerAction
    @Nullable
    public View findViewByPosition(int position) {
        return this.bannerLayoutManager.findViewByPosition(position);
    }

    @NotNull
    public final BannerLayoutManager getBannerLayoutManager() {
        return this.bannerLayoutManager;
    }

    @Override // com.heytap.store.business.component.listener.IBannerAction
    public int getCurrentPosition() {
        return this.bannerLayoutManager.getCurrentPosition();
    }

    @Override // com.heytap.store.business.component.listener.IBannerAction
    public int getFirstPosition() {
        return this.bannerLayoutManager.getFirstPosition();
    }

    @Override // com.heytap.store.business.component.listener.IBannerAction
    public int getRealPosition(int position) {
        if (this.bannerLayoutManager.getRealCount() <= 0) {
            return 0;
        }
        return position % this.bannerLayoutManager.getRealCount();
    }

    @Override // com.heytap.store.business.component.listener.IBannerAction
    public void pause() {
        this.bannerLayoutManager.pause();
    }

    @Override // com.heytap.store.business.component.listener.IBannerAction
    public void resume() {
        this.bannerLayoutManager.resume();
    }
}
