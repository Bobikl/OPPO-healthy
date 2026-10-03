package com.oplus.web.container.webview.core;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class WebContainerLifecycleObserver implements DefaultLifecycleObserver {
    public static final String JS_FUNCTION_ON_PAUSE = "onUCPause";
    public static final String JS_FUNCTION_ON_RESUME = "onResume";
    public static final String JS_FUNCTION_ON_RESUME_V2 = "onResume2";
    public static final String JS_FUNCTION_ON_STOP = "onUCStop";
    public static final String KEY_JS_PAGE_PAUSE = "javascript:if(window.onUCPause){onUCPause()}";
    public static final String KEY_JS_PAGE_RESUME = "javascript:if(window.resume){resume()}";
    public static final String KEY_JS_PAGE_STOP = "javascript:if(window.onUCStop){onUCStop()}";
    public WebContainerFragment i;

    public WebContainerLifecycleObserver(WebContainerFragment webContainerFragment) {
        this.i = webContainerFragment;
    }

    public void onCreate(@NonNull LifecycleOwner lifecycleOwner) {
    }

    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        this.i = null;
    }

    public void onPause(@NonNull LifecycleOwner lifecycleOwner) {
        WebContainerFragment webContainerFragment = this.i;
        if (webContainerFragment == null) {
            return;
        }
        webContainerFragment.evaluateJavascript(KEY_JS_PAGE_PAUSE, null);
        this.i.callJsFunction(JS_FUNCTION_ON_PAUSE, null);
    }

    public void onResume(@NonNull LifecycleOwner lifecycleOwner) {
        WebContainerFragment webContainerFragment = this.i;
        if (webContainerFragment == null) {
            return;
        }
        if (webContainerFragment.isTop()) {
            this.i.evaluateJavascript(KEY_JS_PAGE_RESUME, null);
            this.i.callJsFunction(JS_FUNCTION_ON_RESUME, null);
        }
        WebContainerFragment webContainerFragment2 = this.i;
        webContainerFragment2.callJsFunction(JS_FUNCTION_ON_RESUME_V2, webContainerFragment2.getVisibleInfo());
    }

    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
    }

    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        WebContainerFragment webContainerFragment = this.i;
        if (webContainerFragment == null) {
            return;
        }
        webContainerFragment.evaluateJavascript(KEY_JS_PAGE_STOP, null);
        this.i.callJsFunction(JS_FUNCTION_ON_STOP, null);
    }
}
