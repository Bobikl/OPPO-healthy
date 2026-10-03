package com.tencent.open.b;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes10.dex */
public class a extends RelativeLayout {
    public Rect i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f20308j;
    public InterfaceC1012a k;

    /* JADX INFO: renamed from: com.tencent.open.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC1012a {
        void a();

        void a(int i);
    }

    public a(Context context) {
        super(context);
        this.i = null;
        this.f20308j = false;
        this.k = null;
        this.i = new Rect();
    }

    public void a(InterfaceC1012a interfaceC1012a) {
        this.k = interfaceC1012a;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        Activity activity = (Activity) getContext();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(this.i);
        int height = (activity.getWindowManager().getDefaultDisplay().getHeight() - this.i.top) - size;
        InterfaceC1012a interfaceC1012a = this.k;
        if (interfaceC1012a != null && size != 0) {
            if (height > 100) {
                interfaceC1012a.a((Math.abs(this.i.height()) - getPaddingBottom()) - getPaddingTop());
            } else {
                interfaceC1012a.a();
            }
        }
        super.onMeasure(i, i2);
    }
}
