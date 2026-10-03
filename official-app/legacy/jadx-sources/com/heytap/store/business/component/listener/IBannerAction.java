package com.heytap.store.business.component.listener;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public interface IBannerAction {
    default boolean available(int i) {
        return true;
    }

    View findViewByPosition(int i);

    int getCurrentPosition();

    int getFirstPosition();

    int getRealPosition(int i);

    void pause();

    void resume();
}
