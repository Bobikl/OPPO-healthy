package com.oplus.aiunit.vision;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes16.dex */
public class cpl {
    public View a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10189c;
    public ViewGroup.LayoutParams d;

    public cpl(WebView webView, int i) {
        this.a = webView;
        this.f10189c = i;
        webView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.oplus.aiunit.vision.bpl
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.i.d();
            }
        });
        this.d = webView.getLayoutParams();
    }

    public static void b(WebView webView) {
        new cpl(webView, 0);
    }

    public static void c(WebView webView, int i) {
        new cpl(webView, i);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void d() {
        Rect rect = new Rect();
        this.a.getWindowVisibleDisplayFrame(rect);
        int top = (rect.bottom - this.a.getTop()) - this.f10189c;
        if (top != this.b) {
            this.d.height = top;
            this.a.requestLayout();
            this.b = top;
        }
    }
}
