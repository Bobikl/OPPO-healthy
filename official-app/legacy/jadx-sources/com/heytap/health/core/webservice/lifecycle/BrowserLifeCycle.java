package com.heytap.health.core.webservice.lifecycle;

import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.oplus.aiunit.vision.a7b;

/* JADX INFO: loaded from: classes16.dex */
public final class BrowserLifeCycle implements LifecycleObserver {
    public WebView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f3745j;
    public boolean k;

    public BrowserLifeCycle(WebView webView, Handler handler, boolean z) {
        this.f3745j = handler;
        this.i = webView;
        this.k = z;
    }

    public final void a(Lifecycle.Event event) {
        WebView webView = this.i;
        if (webView != null) {
            if (event == Lifecycle.Event.ON_START) {
                webView.evaluateJavascript("javascript:if(window.App.lifeCycle){window.App.lifeCycle.onPageStart();}", null);
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                webView.evaluateJavascript("javascript:if(window.App.lifeCycle){window.App.lifeCycle.onPageStop();}", null);
            } else if (event == Lifecycle.Event.ON_RESUME) {
                webView.evaluateJavascript("javascript:if(window.App.lifeCycle){window.App.lifeCycle.onPageResume();}", null);
            } else if (event == Lifecycle.Event.ON_PAUSE) {
                webView.evaluateJavascript("javascript:if(window.App.lifeCycle){window.App.lifeCycle.onPagePause();}", null);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        a7b.f("BrowserLifeCycle", "onDestroy");
        Handler handler = this.f3745j;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f3745j = null;
        }
        WebView webView = this.i;
        if (webView != null) {
            ViewParent parent = webView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.i);
            }
            this.i.getSettings().setJavaScriptEnabled(false);
            if (!this.k) {
                this.i.clearCache(true);
            }
            this.i.clearHistory();
            this.i.removeAllViews();
            this.i.destroy();
            this.i = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (this.i != null) {
            a(Lifecycle.Event.ON_PAUSE);
            this.i.onPause();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (this.i != null) {
            a(Lifecycle.Event.ON_RESUME);
            this.i.onResume();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        a(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        a(Lifecycle.Event.ON_STOP);
    }
}
