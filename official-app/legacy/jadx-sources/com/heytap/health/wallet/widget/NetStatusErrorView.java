package com.heytap.health.wallet.widget;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.heytap.health.wallet.event.NetStateChangeEvent;
import com.oplus.aiunit.vision.btc;
import com.oplus.aiunit.vision.k7l;
import com.oplus.aiunit.vision.qz0;
import com.oplus.aiunit.vision.sr6;
import com.oplus.aiunit.vision.u2j;
import com.oppo.lib.common.R$drawable;
import com.oppo.lib.common.R$id;
import com.oppo.lib.common.R$string;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes18.dex */
public class NetStatusErrorView extends RelativeLayout {
    public TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Button f6418j;
    public Context k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout f6419l;
    public LinearLayout m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f6420n;
    public TextView o;
    public View.OnClickListener p;
    public View.OnClickListener q;
    public final Runnable r;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            btc.c(NetStatusErrorView.this.k);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NetStatusErrorView.this.p != null && NetStatusErrorView.this.isClickable() && NetStatusErrorView.this.getVisibility() == 0) {
                NetStatusErrorView.this.p.onClick(NetStatusErrorView.this);
            }
        }
    }

    public class d implements View.OnClickListener {
        public final /* synthetic */ View.OnClickListener i;

        public d(View.OnClickListener onClickListener) {
            this.i = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.i == null || NetStatusErrorView.this.i()) {
                return;
            }
            NetStatusErrorView.this.p();
            this.i.onClick(view);
        }
    }

    public NetStatusErrorView(Context context) {
        super(context);
        this.q = new b();
        this.r = new c();
        this.k = context;
        super.setOnClickListener(this.q);
    }

    public void c() {
        e(true, -1);
    }

    public void d(String str) {
        f(false, -1, str);
    }

    public void e(boolean z, int i) {
        f(z, i, "");
    }

    public void f(boolean z, int i, String str) {
        if (z) {
            setClickable(false);
            setVisibility(8);
        } else {
            setBackgroundResource(R$drawable.activity_bg);
            if (i == 3) {
                i = btc.b(this.k).booleanValue() ? 0 : 3;
            }
            if (i != 2) {
                this.f6418j.setVisibility(8);
            }
            if (TextUtils.isEmpty(str)) {
                str = btc.a(qz0.mContext, i);
            }
            if (TextUtils.isEmpty(str)) {
                this.i.setText(R$string.network_status_tips_no_connect);
            } else {
                this.i.setText(str);
            }
            setVisibility(0);
            this.f6419l.setVisibility(0);
            this.m.setVisibility(8);
            Drawable drawable = this.f6420n.getDrawable();
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
        setFinishTag(Boolean.TRUE);
    }

    public void g(int i) {
        e(true, -1);
        if (i > 0) {
            l(this.k.getString(i));
        }
    }

    public Boolean getFinishTag() {
        return (Boolean) getTag();
    }

    public void h(int i, String str) {
        f(false, i, str);
        o(i);
    }

    public boolean i() {
        return !getFinishTag().booleanValue();
    }

    public void j() {
        if (sr6.c().j(this)) {
            sr6.c().r(this);
        }
        this.p = null;
    }

    public void k(int i, String str) {
        this.m.setVisibility(8);
        this.f6419l.setVisibility(0);
        this.f6418j.setVisibility(8);
        this.f6420n.setImageResource(i);
        this.f6420n.setVisibility(0);
        this.i.setText(str);
        this.f6419l.setClickable(true);
        Object drawable = this.f6420n.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public final void l(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.i.setText(str);
        setVisibility(0);
        this.f6418j.setVisibility(8);
        this.m.setVisibility(8);
        this.f6419l.setVisibility(0);
    }

    public void m(String str, String str2) {
        this.m.setVisibility(8);
        this.f6419l.setVisibility(0);
        this.f6418j.setVisibility(8);
        this.f6420n.setVisibility(0);
        Drawable drawable = this.f6420n.getDrawable();
        if (drawable instanceof AnimatedVectorDrawable) {
            ((AnimatedVectorDrawable) drawable).start();
        }
        this.i.setText(str);
        this.o.setText(str2);
        this.f6419l.setClickable(true);
        setClickable(false);
    }

    public void n() {
        this.i.setText("");
        setVisibility(0);
        this.f6419l.setVisibility(0);
        this.m.setVisibility(8);
    }

    public void o(int i) {
        if (i == 3) {
            btc.b(this.k).booleanValue();
        } else if (i != 2) {
            this.f6418j.setVisibility(8);
        }
        this.f6419l.setClickable(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (sr6.c().j(this)) {
            return;
        }
        sr6.c().p(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.i = (TextView) findViewById(R$id.error_operate);
        this.o = (TextView) findViewById(R$id.error_operate_tip);
        this.f6420n = (ImageView) findViewById(R$id.error_image);
        if (k7l.f()) {
            this.f6420n.setAlpha(0.4f);
        }
        this.f6419l = (LinearLayout) findViewById(R$id.empty_layout);
        this.m = (LinearLayout) findViewById(R$id.error_loading_view);
        Button button = (Button) findViewById(R$id.empty_setting_btn);
        this.f6418j = button;
        button.setOnClickListener(new a());
        setFinishTag(Boolean.TRUE);
    }

    @u2j(threadMode = ThreadMode.MAIN)
    public void onNetworkChanged(NetStateChangeEvent netStateChangeEvent) {
        if (netStateChangeEvent == null || netStateChangeEvent.isNoneNet() || this.p == null || !isClickable() || getVisibility() != 0) {
            return;
        }
        removeCallbacks(this.r);
        postDelayed(this.r, 100L);
    }

    public void p() {
        if (i()) {
            return;
        }
        setVisibility(0);
        setFinishTag(Boolean.FALSE);
        setClickable(false);
        this.f6419l.setVisibility(8);
        this.m.setVisibility(0);
    }

    public void setBg(int i) {
    }

    public void setErrorContent(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.i.setText(str);
    }

    public void setFinishTag(Boolean bool) {
        setTag(bool);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.p = null;
        d dVar = new d(onClickListener);
        this.p = dVar;
        super.setOnClickListener(dVar);
    }

    public void setPaddingTop(int i) {
        this.f6419l.setPadding(getPaddingLeft(), i, getPaddingRight(), getPaddingBottom());
        this.m.setPadding(getPaddingLeft(), i, getPaddingRight(), getPaddingBottom());
    }

    public NetStatusErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = new b();
        this.r = new c();
        this.k = context;
        super.setOnClickListener(this.q);
    }
}
