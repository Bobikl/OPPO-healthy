package com.heytap.webview.extension.jsapi;

import android.content.Intent;
import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleObserver;

/* JADX INFO: loaded from: classes4.dex */
public interface IJsApiFragmentInterface {
    void addLifecycleObserver(LifecycleObserver lifecycleObserver);

    FragmentActivity getActivity();

    <T extends WebView> T getWebView(Class<T> cls);

    void removeLifecycleObserver(LifecycleObserver lifecycleObserver);

    void requestPermissions(int i, String[] strArr, IWaitForPermissionObserver iWaitForPermissionObserver);

    void startActivityForResult(Intent intent, int i, IWaitForResultObserver iWaitForResultObserver);
}
