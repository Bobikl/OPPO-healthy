package com.heytap.store.apm;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes19.dex */
public interface IPageTrack {
    void exit();

    void start();

    void traverseViewExposure(ViewGroup viewGroup);
}
