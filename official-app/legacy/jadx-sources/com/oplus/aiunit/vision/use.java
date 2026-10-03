package com.oplus.aiunit.vision;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.LayoutRes;

/* JADX INFO: loaded from: classes16.dex */
public abstract class use implements hid {
    public View a;
    public Activity b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17588c;
    public String d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f17589e = false;
    public boolean f = false;

    public use(Activity activity, @LayoutRes int i, String str) {
        woe.b(Integer.valueOf(i));
        woe.b(activity);
        this.b = activity;
        this.a = View.inflate(activity, i, null);
        this.f17588c = !TextUtils.isEmpty(str);
    }

    @Override // com.oplus.aiunit.vision.hid
    public void a(z62 z62Var, int i) {
    }

    @Override // com.oplus.aiunit.vision.hid
    public void b(z62 z62Var, String str) {
    }

    @Override // com.oplus.aiunit.vision.hid
    public void c(z62 z62Var, String str, int i, String str2) {
        this.d = str;
    }

    @Override // com.oplus.aiunit.vision.hid
    public void d(z62 z62Var) {
    }

    @Override // com.oplus.aiunit.vision.hid
    public void e(z62 z62Var, String str) {
        this.d = "";
    }

    @Override // com.oplus.aiunit.vision.hid
    public void f(z62 z62Var, String str, Bitmap bitmap) {
        StringBuilder sb = new StringBuilder();
        sb.append("onPageStart: receivedErrorUrl = ");
        sb.append(this.d);
        sb.append(", startUrl = ");
        sb.append(str);
        if (TextUtils.isEmpty(this.d) || !this.d.equals(str)) {
            return;
        }
        a7b.f("Presentation", "needShowErrorView = true");
        this.f17589e = true;
        this.d = "";
    }

    public boolean g(String str) {
        return this.f17588c || URLUtil.isNetworkUrl(str) || (!TextUtils.isEmpty(str) && (str.contains(".") || str.contains("/")));
    }

    public View h(int i) {
        return this.a.findViewById(i);
    }

    public Context i() {
        return this.b;
    }

    public boolean j() {
        return this.f;
    }

    public View k() {
        return this.a;
    }

    public abstract WebView l();

    public boolean m() {
        return this.f17589e;
    }

    public void n() {
    }

    public void o(View view, WebChromeClient.CustomViewCallback customViewCallback) {
    }

    public void p(boolean z) {
        this.f = z;
    }

    public abstract void q(String str);
}
