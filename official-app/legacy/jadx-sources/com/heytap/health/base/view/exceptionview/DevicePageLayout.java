package com.heytap.health.base.view.exceptionview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.heytap.health.base.R$id;
import com.heytap.health.base.R$layout;
import com.heytap.health.base.R$styleable;
import com.oplus.aiunit.vision.du6;
import com.oplus.aiunit.vision.rid;

/* JADX INFO: loaded from: classes15.dex */
public class DevicePageLayout extends FrameLayout {
    public View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f3322j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f3323l;
    public TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f3324n;
    public TextView o;
    public TextView p;
    public TextView q;
    public rid r;
    public DevicePageType s;
    public du6 t;
    public long u;
    public long v;

    public DevicePageLayout(@NonNull Context context) {
        this(context, null);
    }

    private void setExceptionPage(du6 du6Var) {
        if (du6Var == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("[setExceptionPage] bean is empty, pageType is ");
            sb.append(this.s);
            return;
        }
        this.f3324n.setImageResource(du6Var.a());
        this.o.setText(du6Var.c());
        this.p.setText(du6Var.b());
        this.q.setVisibility(du6Var.d() ? 0 : 8);
        Object drawable = this.f3324n.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    private void setExceptionView(DevicePageType devicePageType) {
        du6 exceptionPageBean = DevicePageType.getExceptionPageBean(devicePageType);
        du6 du6Var = this.t;
        if (du6Var != null && devicePageType == DevicePageType.CUSTOM) {
            exceptionPageBean = du6Var;
        }
        setExceptionPage(exceptionPageBean);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        addView(view, 1);
        this.f3322j = view;
        setCurrentPageType(this.s);
        StringBuilder sb = new StringBuilder();
        sb.append("addView view ");
        sb.append(view);
    }

    public final void b() {
        LayoutInflater.from(getContext()).inflate(R$layout.lib_base_view_exception_page, (ViewGroup) this, true);
        this.k = findViewById(R$id.cl_exception);
        this.f3323l = findViewById(R$id.cl_load);
        this.f3324n = (ImageView) findViewById(R$id.iv_exception_image);
        this.o = (TextView) findViewById(R$id.tv_exception_title);
        this.p = (TextView) findViewById(R$id.tv_exception_tips);
        TextView textView = (TextView) findViewById(R$id.cb_retry);
        this.q = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.lk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.d(view);
            }
        });
        this.m = (TextView) findViewById(R$id.tv_loading_tips);
    }

    public final void c(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.lib_base_DevicePageLayout, i, 0);
        this.s = DevicePageType.forNumber(typedArrayObtainStyledAttributes.getInt(R$styleable.lib_base_DevicePageLayout_lib_base_exception_type, 1));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void d(View view) {
        if (this.v > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (Math.abs(jCurrentTimeMillis - this.u) < this.v) {
                return;
            } else {
                this.u = jCurrentTimeMillis;
            }
        }
        rid ridVar = this.r;
        if (ridVar != null) {
            h(!ridVar.X1(this));
        }
    }

    public void f(rid ridVar, long j2) {
        this.r = ridVar;
        this.v = j2;
    }

    public final void g(boolean z) {
        View view;
        if (this.i == null || (view = this.f3322j) == null) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
        this.i.setVisibility(z ? 8 : 0);
    }

    public DevicePageType getCurrentPageType() {
        return this.s;
    }

    public final void h(boolean z) {
        this.k.setVisibility(z ? 0 : 8);
        this.f3323l.setVisibility(z ? 8 : 0);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int childCount = getChildCount();
        StringBuilder sb = new StringBuilder();
        sb.append("onFinishInflate childCount ");
        sb.append(childCount);
        if (childCount > 2) {
            throw new RuntimeException("child view cannot over one item.if child view is over one item,and should put into parent view container");
        }
        this.i = getChildAt(0);
        if (childCount > 1) {
            this.f3322j = getChildAt(1);
        }
        setCurrentPageType(this.s);
    }

    public void setCurrentPageType(DevicePageType devicePageType) {
        StringBuilder sb = new StringBuilder();
        sb.append("setCurrentPageType currentPageType  = ");
        sb.append(devicePageType);
        this.s = devicePageType;
        g(devicePageType == DevicePageType.NORMAL);
        h(this.s != DevicePageType.LOADING);
        setExceptionView(devicePageType);
    }

    public void setCustomExceptionBean(du6 du6Var) {
        this.t = du6Var;
    }

    public void setExceptionImage(int i) {
        this.f3324n.setImageResource(i);
    }

    public void setExceptionTips(String str) {
        this.p.setText(str);
    }

    public void setExceptionTitle(String str) {
        this.o.setText(str);
    }

    public void setLoadingTips(String str) {
        this.m.setText(str);
    }

    public void setOnRetryListener(rid ridVar) {
        this.r = ridVar;
        this.v = 0L;
    }

    public void setRetryBtnVisibility(boolean z) {
        this.q.setVisibility(z ? 0 : 8);
    }

    public DevicePageLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DevicePageLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(context, attributeSet, i);
        b();
    }
}
