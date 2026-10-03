package com.heytap.health.base.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.qe0;

/* JADX INFO: loaded from: classes15.dex */
public class RecyclerTopLineView extends View {
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3293j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f3294l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ViewGroup.LayoutParams f3295n;
    public int o;
    public int p;

    public class a extends RecyclerView.OnScrollListener {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            RecyclerTopLineView.this.d(i2);
        }
    }

    public RecyclerTopLineView(Context context) {
        this(context, null);
    }

    private void setScrollListener(RecyclerView recyclerView) {
        recyclerView.addOnScrollListener(new a());
    }

    public void b(Context context, RecyclerView recyclerView) {
        this.f3295n = getLayoutParams();
        this.o = ejg.f(context);
        setScrollListener(recyclerView);
    }

    public void c(Context context, RecyclerView recyclerView) {
        this.f3295n = getLayoutParams();
        this.o = ejg.f(context);
        setScrollListener(recyclerView);
    }

    public final void d(int i) {
        int i2 = this.p + i;
        this.p = i2;
        int i3 = this.f3293j;
        if (i2 > i3) {
            this.i = i3 / 2;
        } else if (i2 < i3 / 2) {
            this.i = 0;
        } else {
            this.i = i2 - (i3 / 2);
        }
        int i4 = this.i;
        this.m = i4;
        setAlpha(Math.abs(i4) / (this.f3293j / 2));
        int i5 = this.p;
        int i6 = this.f3293j;
        if (i5 < i6) {
            this.i = 0;
        } else if (i5 > this.f3294l) {
            this.i = i6 / 2;
        } else {
            this.i = i5 - i6;
        }
        int i7 = this.i;
        this.m = i7;
        float fAbs = Math.abs(i7) / (this.f3293j / 2);
        ViewGroup.LayoutParams layoutParams = this.f3295n;
        layoutParams.width = (int) (this.o - ((this.k * 2) * (1.0f - fAbs)));
        setLayoutParams(layoutParams);
    }

    public void e() {
        this.p = 0;
    }

    public void setChangeY(int i) {
        d(i);
    }

    public RecyclerTopLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public RecyclerTopLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = 0;
        this.f3293j = ejg.a(b78.a(), 100.0f);
        this.k = ejg.a(b78.a(), 24.0f);
        this.f3294l = ejg.a(b78.a(), 150.0f);
        setForceDarkAllowed(false);
        if (qe0.y(context)) {
            setBackgroundColor(Color.parseColor("#33ffffff"));
        }
    }
}
