package com.heytap.sporthealth.blib.weiget.cardiogram;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.exa;
import com.oplus.aiunit.vision.fxa;
import com.oplus.aiunit.vision.wo9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CardiogramView extends View implements Runnable {
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f7759j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7760l;
    public fxa m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<exa> f7761n;
    public wo9 o;

    @SuppressLint({"HandlerLeak"})
    public Handler p;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void dispatchMessage(@NonNull Message message) {
            super.dispatchMessage(message);
        }
    }

    public CardiogramView(Context context) {
        super(context);
        this.i = ejg.f(getContext());
        this.k = 31;
        this.f7760l = 0;
        this.f7761n = Collections.synchronizedList(new ArrayList());
        this.p = new a();
        c(context);
    }

    private float getCanvasTranslate() {
        float f = this.f7759j;
        return ((-f) * (this.f7760l / this.k)) + (f * (14.0f - this.f7761n.size()));
    }

    public final void a() {
        int i = this.f7760l + 1;
        this.f7760l = i;
        if (i >= this.k) {
            this.f7760l = 0;
            wo9 wo9Var = this.o;
            if (wo9Var != null) {
                this.f7761n.add(wo9Var.a());
            }
            if (this.f7761n.size() > 14.0f) {
                this.f7761n.remove(0).a();
            }
        }
    }

    public final void b(Canvas canvas) {
        for (int i = 0; i < Math.min(this.f7761n.size(), 13.0f); i++) {
            this.m.h(i, this.f7761n.get(i).a);
            if (i == this.f7761n.size() - 2) {
                this.m.p(true);
                this.m.k(1.0f);
                this.m.j(this.f7761n.get(i).b);
            } else if (i == this.f7761n.size() - 3) {
                this.m.j(this.f7761n.get(i).b);
                this.m.k(1.0f - (this.f7760l / this.k));
                this.m.p(true);
            } else {
                this.m.j(this.f7761n.get(i).b);
                this.m.p(false);
            }
            if (i == this.f7761n.size() - 1) {
                this.m.n(0.0f);
                this.m.i(false);
            } else {
                this.m.i(true);
                this.m.n(this.f7761n.get(i + 1).a);
            }
            this.m.a(canvas);
        }
    }

    public final void c(Context context) {
        fxa fxaVar = new fxa(context);
        this.m = fxaVar;
        fxaVar.l(100);
        this.m.m(0);
        this.m.o(5.0f);
    }

    public void d() {
        this.p.removeCallbacks(this);
        this.p.post(this);
    }

    public void e() {
        this.p.removeCallbacks(this);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.i = ejg.f(getContext());
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
        this.p.removeCallbacksAndMessages(null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(getCanvasTranslate(), 0.0f);
        b(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) this.i, 1073741824), i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float f = i / 12.0f;
        this.f7759j = f;
        this.m.g(f, i2);
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // java.lang.Runnable
    public void run() {
        a();
        invalidate();
        this.p.postDelayed(this, 32L);
    }

    public void setDataSource(@NonNull wo9 wo9Var) {
        this.o = wo9Var;
        this.f7761n.clear();
        this.f7761n.add(wo9Var.a());
    }

    public void setInterval(int i) {
        this.k = i / 32;
    }

    public CardiogramView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = ejg.f(getContext());
        this.k = 31;
        this.f7760l = 0;
        this.f7761n = Collections.synchronizedList(new ArrayList());
        this.p = new a();
        c(context);
    }
}
