package com.heytap.health.operation.ecg.weiget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Group;
import com.heytap.health.operation.R$id;
import com.oplus.aiunit.vision.xs3;
import io.reactivex.rxjava3.disposables.a;

/* JADX INFO: loaded from: classes17.dex */
abstract class BasicStateLayout extends LinearLayout {
    public Group i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f5179j;
    public TextView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f5180l;
    public TextView m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f5181n;
    public boolean o;
    public xs3 p;

    public BasicStateLayout(Context context) {
        super(context);
        this.o = true;
        this.p = new xs3();
    }

    public static float c(float f) {
        return TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics());
    }

    public void a(a aVar) {
        this.p.a(aVar);
    }

    public void b() {
        this.i.setVisibility(8);
        this.f5180l.setVisibility(8);
        this.o = false;
    }

    public void d() {
        this.i.setVisibility(0);
        this.f5180l.setVisibility(8);
        this.o = true;
    }

    public void e() {
        this.i = (Group) findViewById(R$id.group_state);
        this.f5179j = (TextView) findViewById(R$id.bt_ecg_add);
        this.k = (TextView) findViewById(R$id.fit_tv_title);
        this.f5180l = (TextView) findViewById(R$id.fit_tv_edit);
        this.m = (TextView) findViewById(R$id.fit_tv_desc);
        this.f5181n = (ImageView) findViewById(R$id.iv_ecg_pmsg_icon);
    }

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p.f();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View.inflate(getContext(), i(), this);
        e();
        this.m.setText(g());
        this.k.setText(j());
        this.f5179j.setText(f());
        this.f5181n.setImageResource(h());
    }

    public BasicStateLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = true;
        this.p = new xs3();
    }

    public BasicStateLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = true;
        this.p = new xs3();
    }
}
