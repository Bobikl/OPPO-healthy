package com.sensorsdata.analytics.android.sdk.visual.bridge;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public interface WebViewJavascriptBridge {
    void sendToWeb(View view, String str, Object obj);

    void sendToWeb(View view, String str, Object obj, OnBridgeCallback onBridgeCallback);
}
