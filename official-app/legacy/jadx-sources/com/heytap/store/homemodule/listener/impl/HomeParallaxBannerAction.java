package com.heytap.store.homemodule.listener.impl;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.heytap.store.base.widget.banner.Banner;
import com.heytap.store.homemodule.listener.IBannerAction;

/* JADX INFO: loaded from: classes5.dex */
public class HomeParallaxBannerAction implements IBannerAction {
    private Banner banner;

    public HomeParallaxBannerAction(Banner banner) {
        this.banner = banner;
    }

    @Override // com.heytap.store.homemodule.listener.IBannerAction
    public boolean available(int i) {
        return (this.banner.isInfiniteLoop() && (i == 0 || i + 1 == this.banner.getItemCount())) ? false : true;
    }

    @Override // com.heytap.store.homemodule.listener.IBannerAction
    public View findViewByPosition(int i) {
        return ((LinearLayoutManager) this.banner.getRecyclerView().getLayoutManager()).findViewByPosition(i);
    }

    @Override // com.heytap.store.homemodule.listener.IBannerAction
    public int getCurrentPosition() {
        return this.banner.getCurrentItem();
    }

    @Override // com.heytap.store.homemodule.listener.IBannerAction
    public int getFirstPosition() {
        return 0;
    }

    @Override // com.heytap.store.homemodule.listener.IBannerAction
    public int getRealPosition(int i) {
        return this.banner.getAdapter().getRealPosition(i);
    }

    @Override // com.heytap.store.homemodule.listener.IBannerAction
    public void pause() {
        this.banner.stop();
    }

    @Override // com.heytap.store.homemodule.listener.IBannerAction
    public void resume() {
        this.banner.start();
    }
}
