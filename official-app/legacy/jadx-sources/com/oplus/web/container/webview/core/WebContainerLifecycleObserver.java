package com.oplus.web.container.webview.core;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes2.dex */
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(@NonNull LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        this.i = null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NonNull LifecycleOwner lifecycleOwner) {
        WebContainerFragment webContainerFragment = this.i;
        if (webContainerFragment == null) {
            return;
        }
        webContainerFragment.evaluateJavascript("javascript:if(window.onUCPause){onUCPause()}", null);
        this.i.callJsFunction("onUCPause", null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NonNull LifecycleOwner lifecycleOwner) {
        WebContainerFragment webContainerFragment = this.i;
        if (webContainerFragment == null) {
            return;
        }
        if (webContainerFragment.isTop()) {
            this.i.evaluateJavascript("javascript:if(window.resume){resume()}", null);
            this.i.callJsFunction("onResume", null);
        }
        WebContainerFragment webContainerFragment2 = this.i;
        webContainerFragment2.callJsFunction("onResume2", webContainerFragment2.getVisibleInfo());
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NonNull LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        WebContainerFragment webContainerFragment = this.i;
        if (webContainerFragment == null) {
            return;
        }
        webContainerFragment.evaluateJavascript("javascript:if(window.onUCStop){onUCStop()}", null);
        this.i.callJsFunction("onUCStop", null);
    }
}
