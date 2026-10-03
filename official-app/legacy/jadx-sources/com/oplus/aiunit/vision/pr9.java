package com.oplus.aiunit.vision;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LiveData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public interface pr9 {
    void addLifecycleObserver(LifecycleObserver lifecycleObserver);

    FragmentActivity getActivity();

    @Nullable
    String getProductId();

    <T extends WebView> T getWebView(Class<T> cls);

    LiveData<ho3<JSONObject>> requestPermission(String[] strArr);
}
