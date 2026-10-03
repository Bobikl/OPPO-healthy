package com.heytap.health.core.webservice;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.core.webservice.ExtWebView;
import com.oplus.aiunit.vision.qe0;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class ExtWebView extends WebView {
    public ExtWebView(Context context) {
        super(context);
        n(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(Object obj, String str) {
        super.addJavascriptInterface(obj, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        super.goBack();
    }

    public static /* synthetic */ boolean s(View view) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(String str, String str2, String str3) {
        super.loadData(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(String str, String str2, String str3, String str4, String str5) {
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(String str) {
        super.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(String str, Map map) {
        super.loadUrl(str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        super.reload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(String str) {
        super.removeJavascriptInterface(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        super.stopLoading();
    }

    public final void A(Runnable runnable) {
        if (o()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    @Override // android.webkit.WebView
    @SuppressLint({"JavascriptInterface"})
    public void addJavascriptInterface(final Object obj, final String str) {
        A(new Runnable() { // from class: com.oplus.aiunit.vision.ty6
            @Override // java.lang.Runnable
            public final void run() {
                this.i.p(obj, str);
            }
        });
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(final String str, @Nullable final ValueCallback<String> valueCallback) {
        A(new Runnable() { // from class: com.oplus.aiunit.vision.vy6
            @Override // java.lang.Runnable
            public final void run() {
                this.i.q(str, valueCallback);
            }
        });
    }

    @Override // android.webkit.WebView
    public void goBack() {
        A(new Runnable() { // from class: com.oplus.aiunit.vision.xy6
            @Override // java.lang.Runnable
            public final void run() {
                this.i.r();
            }
        });
    }

    public final void l() {
        if (qe0.y(getContext())) {
            if (isForceDarkAllowed()) {
                setBackgroundColor(0);
            } else {
                setBackgroundColor(-16777216);
                setAlpha(0.0f);
            }
        }
    }

    @Override // android.webkit.WebView
    public void loadData(final String str, @Nullable final String str2, @Nullable final String str3) {
        A(new Runnable() { // from class: com.oplus.aiunit.vision.sy6
            @Override // java.lang.Runnable
            public final void run() {
                this.i.t(str, str2, str3);
            }
        });
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(@Nullable final String str, final String str2, @Nullable final String str3, @Nullable final String str4, @Nullable final String str5) {
        A(new Runnable() { // from class: com.oplus.aiunit.vision.py6
            @Override // java.lang.Runnable
            public final void run() {
                this.i.u(str, str2, str3, str4, str5);
            }
        });
    }

    @Override // android.webkit.WebView
    public void loadUrl(final String str) {
        A(new Runnable() { // from class: com.oplus.aiunit.vision.oy6
            @Override // java.lang.Runnable
            public final void run() {
                this.i.v(str);
            }
        });
    }

    public final void m() {
        setOverScrollMode(2);
        setHorizontalFadingEdgeEnabled(false);
        setVerticalFadingEdgeEnabled(false);
    }

    public final void n(Context context) {
        m();
        setBackgroundColor(0);
        l();
        setLongClickable(false);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.oplus.aiunit.vision.uy6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ExtWebView.s(view);
            }
        });
    }

    public final boolean o() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    @Override // android.webkit.WebView
    public void reload() {
        A(new Runnable() { // from class: com.oplus.aiunit.vision.wy6
            @Override // java.lang.Runnable
            public final void run() {
                this.i.x();
            }
        });
    }

    @Override // android.webkit.WebView
    @SuppressLint({"JavascriptInterface"})
    public void removeJavascriptInterface(final String str) {
        A(new Runnable() { // from class: com.oplus.aiunit.vision.ry6
            @Override // java.lang.Runnable
            public final void run() {
                this.i.y(str);
            }
        });
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        A(new Runnable() { // from class: com.oplus.aiunit.vision.ny6
            @Override // java.lang.Runnable
            public final void run() {
                this.i.z();
            }
        });
    }

    @Override // android.webkit.WebView
    public void loadUrl(@NonNull final String str, @NonNull final Map<String, String> map) {
        A(new Runnable() { // from class: com.oplus.aiunit.vision.qy6
            @Override // java.lang.Runnable
            public final void run() {
                this.i.w(str, map);
            }
        });
    }

    public ExtWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n(context);
    }

    public ExtWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        n(context);
    }
}
