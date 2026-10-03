package com.alipay.sdk.m.x;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes12.dex */
public abstract class c extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f626c = "v1";
    public static final String d = "v2";
    public Activity i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f627j;

    public c(Activity activity, String str) {
        super(activity);
        this.i = activity;
        this.f627j = str;
    }

    public static void j(WebView webView) {
        if (webView != null) {
            try {
                webView.resumeTimers();
            } catch (Throwable unused) {
            }
        }
    }

    public void k(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        CookieSyncManager.createInstance(this.i.getApplicationContext()).sync();
        CookieManager.getInstance().setCookie(str, str2);
        CookieSyncManager.getInstance().sync();
    }

    public boolean l() {
        return "v1".equals(this.f627j);
    }

    public abstract boolean m();

    public abstract void n();
}
