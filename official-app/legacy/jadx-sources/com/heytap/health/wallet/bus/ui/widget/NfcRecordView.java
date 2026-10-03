package com.heytap.health.wallet.bus.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.heytap.health.wallet.widget.NetStatusErrorView;
import com.oplus.aiunit.vision.p1l;
import com.oplus.aiunit.vision.t6b;
import com.oppo.lib.common.R$drawable;
import com.oppo.lib.common.R$id;
import com.oppo.lib.common.R$layout;

/* JADX INFO: loaded from: classes18.dex */
public abstract class NfcRecordView extends RelativeLayout {
    public ListView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NetStatusErrorView f6214j;
    public TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f6215l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6216n;
    public boolean o;
    public boolean p;

    public class a implements AbsListView.OnScrollListener {
        public a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (NfcRecordView.this.o) {
                return;
            }
            NfcRecordView.this.j(i3, i2);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (!NfcRecordView.this.o && i == 0) {
                NfcRecordView.this.d(absListView.getLastVisiblePosition());
            }
        }
    }

    public NfcRecordView(Context context) {
        super(context);
        b(context);
    }

    public final void b(Context context) {
        View.inflate(context, R$layout.widget_nfc_transation_record_view, this);
        this.i = (ListView) p1l.b(this, R$id.listview);
        this.f6214j = (NetStatusErrorView) p1l.b(this, com.heytap.health.wallet.bus.R$id.error_view);
        this.i.setOnScrollListener(new a());
        if (this.i.getFooterViewsCount() <= 0) {
            View viewInflate = LayoutInflater.from(context).inflate(R$layout.footview_more, (ViewGroup) null, false);
            viewInflate.setEnabled(false);
            this.k = (TextView) viewInflate.findViewById(R$id.foot_text);
            this.i.addFooterView(viewInflate);
        }
    }

    public void c() {
        this.i.setVisibility(8);
        this.f6214j.p();
    }

    public abstract void d(int i);

    public void e() {
        this.o = true;
    }

    public void f() {
        this.o = false;
    }

    public void g(int i, TextView textView) {
        this.f6215l = textView;
        this.m = i;
    }

    public int getActivityFooterVisiable() {
        return this.f6216n;
    }

    public boolean getVisiableItem() {
        return this.i.getCount() > (this.i.getLastVisiblePosition() - this.i.getFirstVisiblePosition()) + 1;
    }

    public void h(String str) {
        this.f6214j.k(R$drawable.icon_consume_enpty, str);
        this.i.setVisibility(8);
    }

    public void i(int i) {
        this.f6214j.g(i);
        this.i.setVisibility(8);
    }

    public void j(int i, int i2) {
        t6b.e("showFootView total:" + i + " visible=" + i2);
        TextView textView = this.k;
        if (textView != null) {
            if (this.m <= 0) {
                textView.setText("");
                return;
            }
            TextView textView2 = this.f6215l;
            if (textView2 != null) {
                this.f6216n = i > i2 ? 8 : 0;
                textView2.setVisibility(8);
                this.k.setText(this.m);
                this.k.setVisibility((i <= i2 || !this.p) ? 8 : 0);
            }
        }
    }

    public void k(boolean z) {
        this.i.setVisibility(0);
        this.f6214j.c();
    }

    public void setAdapter(BaseAdapter baseAdapter) {
        this.i.setAdapter((ListAdapter) baseAdapter);
    }

    public void setShowFooter(boolean z) {
        this.p = z;
    }

    public NfcRecordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public NfcRecordView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context);
    }
}
