package com.heytap.webpro.core;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;
import com.heytap.webpro.utils.BaseLifecycleObserver;

/* JADX INFO: loaded from: classes3.dex */
public class WebProLifecycleObserver extends BaseLifecycleObserver {
    public static final String JS_FUNCTION_ON_PAUSE = "onUCPause";
    public static final String JS_FUNCTION_ON_RESUME = "onResume";
    public static final String JS_FUNCTION_ON_RESUME_V2 = "onResume2";
    public static final String JS_FUNCTION_ON_STOP = "onUCStop";
    public static final String KEY_JS_PAGE_PAUSE = "javascript:if(window.onUCPause){onUCPause()}";
    public static final String KEY_JS_PAGE_RESUME = "javascript:if(window.resume){resume()}";
    public static final String KEY_JS_PAGE_STOP = "javascript:if(window.onUCStop){onUCStop()}";
    public WebProFragment i;

    public WebProLifecycleObserver(WebProFragment webProFragment) {
        webProFragment.addLifecycleObserver(this);
        this.i = webProFragment;
    }

    @Override // com.heytap.webpro.utils.BaseLifecycleObserver, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NonNull LifecycleOwner lifecycleOwner) {
        this.i = null;
    }

    @Override // com.heytap.webpro.utils.BaseLifecycleObserver, androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(@NonNull LifecycleOwner lifecycleOwner) {
        WebProFragment webProFragment = this.i;
        if (webProFragment == null) {
            return;
        }
        webProFragment.evaluateJavascript("javascript:if(window.onUCPause){onUCPause()}", null);
        this.i.callJsFunction("onUCPause", null);
    }

    @Override // com.heytap.webpro.utils.BaseLifecycleObserver, androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(@NonNull LifecycleOwner lifecycleOwner) {
        WebProFragment webProFragment = this.i;
        if (webProFragment == null) {
            return;
        }
        if (webProFragment.isTop()) {
            this.i.evaluateJavascript("javascript:if(window.resume){resume()}", null);
            this.i.callJsFunction("onResume", null);
        }
        WebProFragment webProFragment2 = this.i;
        webProFragment2.callJsFunction("onResume2", webProFragment2.getVisibleInfo());
    }

    @Override // com.heytap.webpro.utils.BaseLifecycleObserver, androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NonNull LifecycleOwner lifecycleOwner) {
        WebProFragment webProFragment = this.i;
        if (webProFragment == null) {
            return;
        }
        webProFragment.evaluateJavascript("javascript:if(window.onUCStop){onUCStop()}", null);
        this.i.callJsFunction("onUCStop", null);
    }
}
