package com.heytap.health.wallet.bus.ui.activities;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.heytap.health.wallet.network.bus.rsp.TopupFee;
import com.oplus.aiunit.vision.b61;
import com.oplus.aiunit.vision.p1l;
import com.oplus.aiunit.vision.t6b;
import com.oppo.lib.common.R$color;
import com.oppo.lib.common.R$drawable;
import com.oppo.lib.common.R$id;
import com.oppo.lib.common.R$layout;
import com.oppo.lib.common.R$string;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class a extends b61<TopupFee> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f6178l;
    public boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f6179n;
    public b o;
    public boolean p;

    /* JADX INFO: renamed from: com.heytap.health.wallet.bus.ui.activities.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0671a implements View.OnClickListener {
        public final /* synthetic */ int i;

        public ViewOnClickListenerC0671a(int i) {
            this.i = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f6179n = this.i;
            a.this.o.a(a.this.e());
            a.this.notifyDataSetInvalidated();
        }
    }

    public interface b {
        void a(TopupFee topupFee);
    }

    public class c {
        public TextView a;
        public TextView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f6181c;

        public c() {
        }
    }

    public a(Activity activity, boolean z, int i, b bVar, boolean z2) {
        super(activity);
        this.f6179n = 0;
        t6b.b("RechargeAdapter", "setSelectPos, selectPos: " + i);
        this.f6178l = activity;
        this.f6179n = i;
        this.m = z;
        this.o = bVar;
        this.p = z2;
    }

    public TopupFee e() {
        if (this.f6179n < 0) {
            this.f6179n = 0;
        }
        return getItem(this.f6179n);
    }

    public int f() {
        return this.f6179n;
    }

    public final void g(c cVar, View view, int i) {
        TopupFee item = getItem(i);
        if (item != null) {
            cVar.a.setText(String.valueOf(item.getNormal() / 100));
            if (this.m) {
                String str = String.format(Locale.getDefault(), "%.2f", Float.valueOf(item.getActually().intValue() / 100.0f));
                TextView textView = cVar.b;
                textView.setText(textView.getResources().getString(R$string.topup_amount_actually, str));
                cVar.b.setVisibility(8);
            } else {
                cVar.b.setVisibility(8);
            }
        }
        if (this.p) {
            view.setClickable(false);
            view.setBackgroundResource(R$drawable.fee_bg_normal);
            TextView textView2 = cVar.f6181c;
            Context context = textView2.getContext();
            int i2 = R$color.color_FF000000;
            textView2.setTextColor(ContextCompat.getColor(context, i2));
            TextView textView3 = cVar.a;
            textView3.setTextColor(ContextCompat.getColor(textView3.getContext(), i2));
            return;
        }
        if (this.f6179n == i) {
            view.setBackgroundResource(R$drawable.fee_bg_selected);
            TextView textView4 = cVar.f6181c;
            Context context2 = textView4.getContext();
            int i3 = R$color.color_recharge_fee_text_sel;
            textView4.setTextColor(ContextCompat.getColor(context2, i3));
            TextView textView5 = cVar.a;
            textView5.setTextColor(ContextCompat.getColor(textView5.getContext(), i3));
        } else {
            view.setBackgroundResource(R$drawable.fee_bg_normal);
            TextView textView6 = cVar.f6181c;
            Context context3 = textView6.getContext();
            int i4 = R$color.color_recharge_fee_text;
            textView6.setTextColor(ContextCompat.getColor(context3, i4));
            TextView textView7 = cVar.a;
            textView7.setTextColor(ContextCompat.getColor(textView7.getContext(), i4));
        }
        view.setOnClickListener(new ViewOnClickListenerC0671a(i));
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        c cVar;
        if (view == null) {
            view = LayoutInflater.from(this.f6178l).inflate(R$layout.widget_topup_fee_item, viewGroup, false);
            cVar = new c();
            cVar.a = (TextView) p1l.b(view, R$id.topup_normal);
            cVar.b = (TextView) p1l.b(view, R$id.topup_actually);
            cVar.f6181c = (TextView) p1l.b(view, R$id.yuan);
            view.setTag(cVar);
        } else {
            cVar = (c) view.getTag();
        }
        g(cVar, view, i);
        return view;
    }

    public void h(int i) {
        t6b.b("RechargeAdapter", "setSelectPos, pos: " + i + "  count: " + getCount());
        this.f6179n = i;
        if (i < getCount()) {
            this.o.a(e());
        }
        notifyDataSetInvalidated();
    }
}
