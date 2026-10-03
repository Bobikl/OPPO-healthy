package com.heytap.health.main.card.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import com.heytap.health.health.impl.R$color;
import com.heytap.health.health.impl.R$id;
import com.heytap.health.health.impl.R$layout;
import com.heytap.health.homecard.HomeCardEditActivity;
import com.heytap.health.homecard.constant.HomeCardDataEnum$CardUiMode;
import com.heytap.health.homecard.constant.HomeCardDataEnum$DataType;
import com.heytap.health.homecard.recycle.recommend.NewCardController;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.e7c;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.g3k;
import com.oplus.aiunit.vision.mq8;
import com.oplus.aiunit.vision.vik;

/* JADX INFO: loaded from: classes16.dex */
public abstract class HealthBaseCard extends e7c {
    public static long y;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f4943j;
    public FragmentActivity k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView.Adapter f4944l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4945n;
    public HomeCardDataEnum$CardUiMode p;
    public HomeCardDataEnum$DataType q;
    public long r;
    public View s;
    public HealthCommonCardView t;
    public String i = "HealthHomeBaseCard";
    public CardMode o = CardMode.COMMON;
    public boolean u = true;
    public long v = 0;
    public NewCardController w = new NewCardController();
    public int x = ejg.a(b78.a(), 5.0f);

    public enum CardMode {
        DRAG,
        COMMON,
        DEVICE_BIND_RECOMMEND
    }

    public interface a {
    }

    public HealthBaseCard(@NonNull FragmentActivity fragmentActivity, RecyclerView.Adapter adapter) {
        this.k = fragmentActivity;
        this.f4943j = fragmentActivity;
        this.f4944l = adapter;
        Z(y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A(Context context, int i, View view) {
        K(context);
        if (this.w.f(t())) {
            this.w.g(t());
            this.f4944l.notifyItemChanged(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean B(View view) {
        if (z()) {
            return true;
        }
        this.k.startActivityForResult(new Intent(this.k, (Class<?>) HomeCardEditActivity.class), 1000);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean C(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            return Q();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(Context context, View view) {
        X(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean E(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            return Q();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(Context context, View view) {
        X(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(COUICheckBox cOUICheckBox, View view) {
        if (cOUICheckBox.isChecked()) {
            cOUICheckBox.setChecked(false);
        } else {
            cOUICheckBox.setChecked(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H() {
        this.f4944l.notifyItemChanged(this.m);
        this.r = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I() {
        FragmentActivity fragmentActivity;
        if (this.f4944l == null || (fragmentActivity = this.k) == null || fragmentActivity.isFinishing() || this.k.isDestroyed()) {
            return;
        }
        V();
    }

    public boolean J() {
        return mq8.INSTANCE.m(this.r, System.currentTimeMillis()) > 0;
    }

    public final void K(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - y) < 500) {
            a7b.f(this.i, "onClickRootView() global click frequent, return");
            return;
        }
        if (Math.abs(jCurrentTimeMillis - this.v) < 700) {
            a7b.f(this.i, "onClickRootView() click frequent, return");
            return;
        }
        y = jCurrentTimeMillis;
        this.v = jCurrentTimeMillis;
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, Integer.valueOf(this.m + 1)).a(vik.TAG_POSTION2, this.t.getTitle()).a("element", this.t.getTitle()).b();
        if (g3k.f()) {
            X(context);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void L(RecyclerView.ViewHolder viewHolder, final int i, final Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append("onCommonBindViewHolder() position = ");
        sb.append(i);
        sb.append("; class = ");
        sb.append(getClass().getSimpleName());
        sb.append("; holder = ");
        sb.append(viewHolder);
        this.s = viewHolder.itemView.findViewById(R$id.rootView);
        HealthCommonCardView healthCommonCardView = (HealthCommonCardView) viewHolder.itemView.findViewById(R$id.health_common_card_view);
        this.t = healthCommonCardView;
        healthCommonCardView.d();
        this.t.i(this.w.f(t()));
        this.t.setForeground(null);
        this.t.setCustomBackgroundDrawable(null);
        this.s.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ro8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.A(context, i, view);
            }
        });
        this.s.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.oplus.aiunit.vision.so8
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.i.B(view);
            }
        });
        FrameLayout frameLayout = this.t.getFrameLayout();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        int i2 = marginLayoutParams.bottomMargin;
        int i3 = this.x;
        if (i2 != i3) {
            marginLayoutParams.bottomMargin = i3;
            frameLayout.setLayoutParams(marginLayoutParams);
        }
        this.t.f4947l.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.to8
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.i.C(view, motionEvent);
            }
        });
        this.t.f4947l.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.uo8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.D(context, view);
            }
        });
        this.t.v.setOnTouchListener(new View.OnTouchListener() { // from class: com.oplus.aiunit.vision.vo8
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.i.E(view, motionEvent);
            }
        });
        this.t.v.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.wo8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.F(context, view);
            }
        });
    }

    public void M(boolean z) {
    }

    public void N(RecyclerView.ViewHolder viewHolder, int i, Context context) {
        View view = viewHolder.itemView;
        this.s = view;
        TextView textView = (TextView) view.findViewById(R$id.home_card_title);
        final COUICheckBox cOUICheckBox = (COUICheckBox) viewHolder.itemView.findViewById(R$id.home_card_check_box);
        d(textView, context.getString(this.q.titleStrId));
        cOUICheckBox.setChecked(true);
        textView.setTextColor(context.getColor(R$color.health_home_card_text_clickable_color));
        this.s.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.yo8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.i.G(cOUICheckBox, view2);
            }
        });
    }

    public void O(RecyclerView.ViewHolder viewHolder, int i, Context context) {
        ((TextView) viewHolder.itemView.findViewById(R$id.card_content)).setText(context.getString(this.q.titleStrId));
    }

    public void P(boolean z) {
    }

    public boolean Q() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(jCurrentTimeMillis - y) < 500) {
            a7b.f(this.i, "onInterceptTvTip2Click() global click frequent, intercept");
            return true;
        }
        if (Math.abs(jCurrentTimeMillis - this.v) < 700) {
            a7b.f(this.i, "onInterceptTvTip2Click() click frequent, intercept");
            return true;
        }
        y = jCurrentTimeMillis;
        this.v = jCurrentTimeMillis;
        com.heytap.health.base.track.a.k().a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, Integer.valueOf(this.m + 1)).a(vik.TAG_POSTION2, this.t.getTitle()).a("element", this.t.getTitle()).b();
        return !g3k.f();
    }

    public abstract void R();

    public void S() {
        if (this.f4944l != null) {
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.xo8
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.H();
                }
            });
        }
    }

    public void T() {
    }

    public long U() {
        return p() ? 0L : 500L;
    }

    public void V() {
        StringBuilder sb = new StringBuilder();
        sb.append("requestDataFirstTime class = ");
        sb.append(getClass().getSimpleName());
    }

    public void W() {
        this.u = true;
    }

    public abstract void X(Context context);

    public HealthBaseCard Y(CardMode cardMode) {
        this.o = cardMode;
        return this;
    }

    public void Z(HomeCardDataEnum$CardUiMode homeCardDataEnum$CardUiMode) {
        this.p = homeCardDataEnum$CardUiMode;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public int a() {
        CardMode cardMode = this.o;
        if (cardMode == CardMode.DRAG) {
            return v();
        }
        if (cardMode == CardMode.COMMON) {
            return s();
        }
        if (cardMode == CardMode.DEVICE_BIND_RECOMMEND) {
            return u();
        }
        return 0;
    }

    public void a0(HomeCardDataEnum$DataType homeCardDataEnum$DataType) {
        this.q = homeCardDataEnum$DataType;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public void b(RecyclerView.ViewHolder viewHolder, int i, Context context) {
        this.m = i;
        CardMode cardMode = this.o;
        if (cardMode == CardMode.DRAG) {
            O(viewHolder, i, context);
        } else if (cardMode == CardMode.COMMON) {
            L(viewHolder, i, context);
        } else if (cardMode == CardMode.DEVICE_BIND_RECOMMEND) {
            N(viewHolder, i, context);
        }
    }

    public void b0(int i) {
        this.f4945n = i;
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.zo8
            @Override // java.lang.Runnable
            public final void run() {
                this.i.I();
            }
        }, U());
    }

    @Override // com.oplus.aiunit.vision.e7c
    public void c() {
        super.c();
        if (this.t == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("onCompletelyVisible() track mIndex = ");
        sb.append(this.f4945n);
        sb.append(" position = ");
        sb.append(this.m);
        sb.append("; element = ");
        sb.append(this.t.getTitle());
        if (this.o != CardMode.COMMON || z()) {
            return;
        }
        com.heytap.health.base.track.a.x().a("pageid", "home.HomeFragment").a(vik.TAG_MODULE_ID, 3).a(vik.TAG_POSTION1, Integer.valueOf(this.f4945n + 1)).a(vik.TAG_POSTION2, this.t.getTitle()).a("element", this.t.getTitle()).b();
    }

    public void n(@NonNull View view) {
    }

    public boolean o() {
        if (!this.u) {
            return false;
        }
        this.u = false;
        return true;
    }

    public boolean p() {
        return this.f4945n < 7;
    }

    public HomeCardDataEnum$CardUiMode q() {
        return this.p;
    }

    public int r() {
        return AnimatorUtil.e();
    }

    public int s() {
        return R$layout.health_common_card;
    }

    public void setOnCardClickedListener(a aVar) {
    }

    public abstract HomeCardDataEnum$DataType t();

    public int u() {
        return R$layout.health_home_card_device_bind_recommend_layout;
    }

    public int v() {
        return R$layout.health_viewholder_data_card_two_span;
    }

    @Nullable
    public final View w(int i) {
        HealthCommonCardView healthCommonCardView = this.t;
        if (healthCommonCardView != null && healthCommonCardView.getFrameLayout().getChildCount() > 0 && this.t.getFrameLayout().getChildAt(0) != null) {
            View childAt = this.t.getFrameLayout().getChildAt(0);
            StringBuilder sb = new StringBuilder();
            sb.append("getHealthCommonView() childId = ");
            sb.append(childAt.getId());
            sb.append("; key = ");
            sb.append(i);
            sb.append("; view = ");
            sb.append(childAt);
            if (getClass().getName().equals(childAt.getTag(i))) {
                a7b.f(this.i, "getHealthCommonView() find commonView");
                return childAt;
            }
        }
        a7b.f(this.i, "getHealthCommonView() no find commonView");
        return null;
    }

    public View x(@LayoutRes int i) {
        View viewW = w(i);
        if (viewW != null) {
            return viewW;
        }
        HealthCommonCardView healthCommonCardView = this.t;
        if (healthCommonCardView != null && healthCommonCardView.getFrameLayout() != null) {
            this.t.getFrameLayout().removeAllViews();
        }
        View viewInflate = LayoutInflater.from(this.f4943j).inflate(i, (ViewGroup) this.t.getFrameLayout(), false);
        StringBuilder sb = new StringBuilder();
        sb.append("addHealthCommonView() view = ");
        sb.append(viewInflate);
        sb.append("; key = ");
        sb.append(i);
        sb.append("; class = ");
        sb.append(getClass().getName());
        viewInflate.setTag(i, getClass().getName());
        this.t.addView(viewInflate);
        return viewInflate;
    }

    public abstract HomeCardDataEnum$CardUiMode y();

    public boolean z() {
        return false;
    }
}
