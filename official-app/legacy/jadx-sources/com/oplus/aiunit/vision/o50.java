package com.oplus.aiunit.vision;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.animation.PathInterpolator;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.utils.ObjectPool;

/* JADX INFO: loaded from: classes16.dex */
public class o50 extends vvk implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static ObjectPool<o50> f14784n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ValueAnimator f14785l;
    public float m;

    static {
        ObjectPool<o50> objectPoolCreate = ObjectPool.create(4, new o50(null, 0.0f, 0.0f, null, 0L));
        f14784n = objectPoolCreate;
        objectPoolCreate.setReplenishPercentage(0.5f);
    }

    public o50(Chart chart, float f, float f2, float[] fArr, long j2) {
        super(chart, fArr);
        this.m = f2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.f14785l = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new PathInterpolator(0.2f, 0.0f, 0.2f, 1.0f));
        this.f14785l.setDuration(j2);
        this.f14785l.addUpdateListener(this);
        this.f14785l.addListener(this);
    }

    public static void a(o50 o50Var) {
        o50Var.f18013j = null;
        f14784n.recycle(o50Var);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    public ObjectPool.Poolable instantiate() {
        return new o50(null, 0.0f, 0.0f, null, 0L);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        try {
            recycleSelf();
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        Chart chart = this.f18013j;
        if (chart instanceof BarLineChartBase) {
            BarLineChartBase barLineChartBase = (BarLineChartBase) chart;
            if (barLineChartBase.getAxisRight().getAxisMaximum() < this.m) {
                barLineChartBase.getAxisRight().setAxisMinimum(0.0f);
                barLineChartBase.getAxisRight().setAxisMaximum(this.m);
                barLineChartBase.notifyDataSetChanged();
                barLineChartBase.invalidate();
            }
        }
        try {
            recycleSelf();
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = this.k;
        if (fArr == null || fArr.length <= 1) {
            return;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        Chart chart = this.f18013j;
        if (chart instanceof BarLineChartBase) {
            BarLineChartBase barLineChartBase = (BarLineChartBase) chart;
            barLineChartBase.getAxisRight().setAxisMinimum(0.0f);
            barLineChartBase.getAxisRight().setAxisMaximum(fFloatValue);
            barLineChartBase.notifyDataSetChanged();
            barLineChartBase.invalidate();
        }
    }

    public void recycleSelf() {
        a(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f14785l.start();
    }
}
