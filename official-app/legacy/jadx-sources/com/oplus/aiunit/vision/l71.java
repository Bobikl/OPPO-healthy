package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.listener.PieRadarChartTouchListener;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class l71 extends PieRadarChartTouchListener {
    public MPPointF i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f13551j;
    public ArrayList<a> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f13552l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public yp8 f13553n;

    public class a {
        public long a;
        public float b;

        public a(long j2, float f) {
            this.a = j2;
            this.b = f;
        }
    }

    public l71(PieRadarChartBase<?> pieRadarChartBase) {
        this(pieRadarChartBase, null);
    }

    public final void a() {
    }

    public final float calculateVelocity() {
        if (this.k.isEmpty()) {
            return 0.0f;
        }
        a aVar = this.k.get(0);
        ArrayList<a> arrayList = this.k;
        a aVar2 = arrayList.get(arrayList.size() - 1);
        a aVar3 = aVar;
        for (int size = this.k.size() - 1; size >= 0; size--) {
            aVar3 = this.k.get(size);
            if (aVar3.b != aVar2.b) {
                break;
            }
        }
        float f = (aVar2.a - aVar.a) / 1000.0f;
        if (f == 0.0f) {
            f = 0.1f;
        }
        float f2 = aVar2.b;
        float f3 = aVar3.b;
        boolean z = f2 >= f3;
        if (Math.abs(f2 - f3) > 270.0d) {
            z = !z;
        }
        float f4 = aVar2.b;
        float f5 = aVar.b;
        if (f4 - f5 > 180.0d) {
            aVar.b = (float) (((double) f5) + 360.0d);
        } else if (f5 - f4 > 180.0d) {
            aVar2.b = (float) (((double) f4) + 360.0d);
        }
        float fAbs = Math.abs((aVar2.b - aVar.b) / f);
        return !z ? -fAbs : fAbs;
    }

    @Override // com.github.mikephil.charting.listener.PieRadarChartTouchListener
    public void computeScroll() {
        if (this.m == 0.0f) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.m *= ((PieRadarChartBase) this.mChart).getDragDecelerationFrictionCoef();
        float f = (jCurrentAnimationTimeMillis - this.f13552l) / 1000.0f;
        T t = this.mChart;
        ((PieRadarChartBase) t).setRotationAngle(((PieRadarChartBase) t).getRotationAngle() + (this.m * f));
        this.f13552l = jCurrentAnimationTimeMillis;
        if (Math.abs(this.m) >= 0.001d) {
            Utils.postInvalidateOnAnimation(this.mChart);
        } else {
            stopDeceleration();
        }
    }

    @Override // com.github.mikephil.charting.listener.PieRadarChartTouchListener, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.LONG_PRESS;
        OnChartGestureListener onChartGestureListener = ((PieRadarChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartLongPressed(motionEvent);
        }
    }

    @Override // com.github.mikephil.charting.listener.PieRadarChartTouchListener, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // com.github.mikephil.charting.listener.PieRadarChartTouchListener, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        this.mLastGesture = ChartTouchListener.ChartGesture.SINGLE_TAP;
        OnChartGestureListener onChartGestureListener = ((PieRadarChartBase) this.mChart).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.onChartSingleTapped(motionEvent);
        }
        if (!((PieRadarChartBase) this.mChart).isHighlightPerTapEnabled()) {
            return false;
        }
        performHighlight(((PieRadarChartBase) this.mChart).getHighlightByTouchPoint(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    @Override // com.github.mikephil.charting.listener.PieRadarChartTouchListener, android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.mGestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        if (!((PieRadarChartBase) this.mChart).isRotationEnabled()) {
            a();
            yp8 yp8Var = this.f13553n;
            if (yp8Var != null) {
                yp8Var.b();
            }
            return true;
        }
        if (((PieRadarChartBase) this.mChart).isRotationEnabled()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                startAction(motionEvent);
                stopDeceleration();
                resetVelocity();
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    sampleVelocity(x, y);
                }
                setGestureStartAngle(x, y);
                MPPointF mPPointF = this.i;
                mPPointF.x = x;
                mPPointF.y = y;
            } else if (action == 1) {
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    stopDeceleration();
                    sampleVelocity(x, y);
                    float fCalculateVelocity = calculateVelocity();
                    this.m = fCalculateVelocity;
                    if (fCalculateVelocity != 0.0f) {
                        this.f13552l = AnimationUtils.currentAnimationTimeMillis();
                        Utils.postInvalidateOnAnimation(this.mChart);
                    }
                }
                ((PieRadarChartBase) this.mChart).enableScroll();
                this.mTouchMode = 0;
                endAction(motionEvent);
            } else if (action == 2) {
                if (((PieRadarChartBase) this.mChart).isDragDecelerationEnabled()) {
                    sampleVelocity(x, y);
                }
                if (this.mTouchMode == 0) {
                    MPPointF mPPointF2 = this.i;
                    if (ChartTouchListener.distance(x, mPPointF2.x, y, mPPointF2.y) > Utils.convertDpToPixel(8.0f)) {
                        this.mLastGesture = ChartTouchListener.ChartGesture.ROTATE;
                        this.mTouchMode = 6;
                        ((PieRadarChartBase) this.mChart).disableScroll();
                    } else if (this.mTouchMode == 6) {
                        updateGestureRotation(x, y);
                        ((PieRadarChartBase) this.mChart).invalidate();
                    }
                } else if (this.mTouchMode == 6) {
                    updateGestureRotation(x, y);
                    ((PieRadarChartBase) this.mChart).invalidate();
                }
                endAction(motionEvent);
            }
        }
        return true;
    }

    public final void resetVelocity() {
        this.k.clear();
    }

    public final void sampleVelocity(float f, float f2) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.k.add(new a(jCurrentAnimationTimeMillis, ((PieRadarChartBase) this.mChart).getAngleForPoint(f, f2)));
        for (int size = this.k.size(); size - 2 > 0 && jCurrentAnimationTimeMillis - this.k.get(0).a > 1000; size--) {
            this.k.remove(0);
        }
    }

    @Override // com.github.mikephil.charting.listener.PieRadarChartTouchListener
    public void setGestureStartAngle(float f, float f2) {
        this.f13551j = ((PieRadarChartBase) this.mChart).getAngleForPoint(f, f2) - ((PieRadarChartBase) this.mChart).getRawRotationAngle();
    }

    @Override // com.github.mikephil.charting.listener.PieRadarChartTouchListener
    public void stopDeceleration() {
        this.m = 0.0f;
    }

    @Override // com.github.mikephil.charting.listener.PieRadarChartTouchListener
    public void updateGestureRotation(float f, float f2) {
        T t = this.mChart;
        ((PieRadarChartBase) t).setRotationAngle(((PieRadarChartBase) t).getAngleForPoint(f, f2) - this.f13551j);
    }

    public l71(PieRadarChartBase<?> pieRadarChartBase, yp8 yp8Var) {
        super(pieRadarChartBase);
        this.i = MPPointF.getInstance(0.0f, 0.0f);
        this.f13551j = 0.0f;
        this.k = new ArrayList<>();
        this.f13552l = 0L;
        this.m = 0.0f;
        this.f13553n = yp8Var;
    }
}
