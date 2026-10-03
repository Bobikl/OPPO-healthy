package com.lifesense.android.bluetooth.core.business;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class d extends com.lifesense.android.bluetooth.core.business.log.a {
    public Context mAppContext;
    public j mWorkingStateListener;

    public void initBusinessCentre(Context context, j jVar) {
        this.mAppContext = context;
        this.mWorkingStateListener = jVar;
    }
}
