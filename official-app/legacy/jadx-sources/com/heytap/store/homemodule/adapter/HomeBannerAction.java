package com.heytap.store.homemodule.adapter;

import android.view.View;
import com.heytap.store.base.widget.recycler.BannerLayoutManager;
import com.heytap.store.homemodule.listener.IBannerAction;

/* JADX INFO: loaded from: classes5.dex */
public class HomeBannerAction implements IBannerAction {
    private BannerLayoutManager bannerLayoutManager;

    public HomeBannerAction(BannerLayoutManager bannerLayoutManager) {
        this.bannerLayoutManager = bannerLayoutManager;
    }

    @Override // com.heytap.store.homemodule.listener.IBannerAction
    public View findViewByPosition(int i) {
        return this.bannerLayoutManager.findViewByPosition(i);
    }

    @Override // com.heytap.store.homemodule.listener.IBannerAction
    public int getCurrentPosition() {
        return this.bannerLayoutManager.getCurrentPosition();
    }

    @Override // com.heytap.store.homemodule.listener.IBannerAction
    public int getFirstPosition() {
        return this.bannerLayoutManager.getFirstPosition();
    }

    @Override // com.heytap.store.homemodule.listener.IBannerAction
    public int getRealPosition(int i) {
        if (this.bannerLayoutManager.getRealCount() <= 0) {
            return 0;
        }
        return i % this.bannerLayoutManager.getRealCount();
    }

    @Override // com.heytap.store.homemodule.listener.IBannerAction
    public void pause() {
        this.bannerLayoutManager.pause();
    }

    @Override // com.heytap.store.homemodule.listener.IBannerAction
    public void resume() {
        this.bannerLayoutManager.resume();
    }
}
