package com.heytap.msp.sdk.base.interfaces;

import android.app.Activity;
import android.content.Context;
import com.heytap.msp.bean.Request;

/* JADX INFO: loaded from: classes19.dex */
public interface IBizAgent extends IExecute<Request> {
    void destroy();

    String getMspVersionInfo();

    Activity getTopActivity();

    boolean hasBinder();

    void initOnSubThread();

    boolean isInstallAppCustom(Context context);

    void onKeyPath(int i, Request request, Object... objArr);

    void syncMspVersionInfo();
}
