package com.heytap.health.zxing.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.heytap.health.zxing.R$styleable;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.cx9;
import com.oplus.aiunit.vision.rh2;
import com.oppo.store.web.jsbridge.jscalljava.JsCallJavaMessageHandler;

/* JADX INFO: loaded from: classes19.dex */
public class ScanBoxView extends FrameLayout implements cx9 {
    public static final String TAG = "ScanBoxView";
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f7233j;
    public View k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ValueAnimator f7234l;
    public int m;

    public ScanBoxView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(float f, float f2, float f3, float f4, float f5, ValueAnimator valueAnimator) {
        float f6;
        float fAbs;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (f <= fFloatValue) {
            if (f4 < fFloatValue) {
                fAbs = Math.abs(f5 - fFloatValue);
            } else {
                f6 = 1.0f;
            }
            this.k.setAlpha(f6);
            this.k.setTranslationY(fFloatValue);
        }
        fAbs = Math.abs(f2 - fFloatValue);
        f6 = fAbs / f3;
        this.k.setAlpha(f6);
        this.k.setTranslationY(fFloatValue);
    }

    @Override // com.oplus.aiunit.vision.cx9
    public void a() {
        g();
    }

    @Override // com.oplus.aiunit.vision.cx9
    public View b() {
        return this;
    }

    @Override // com.oplus.aiunit.vision.cx9
    public void c() {
        f();
    }

    public final void f() {
        ValueAnimator valueAnimator = this.f7234l;
        if ((valueAnimator == null || !valueAnimator.isRunning()) && getMeasuredHeight() != 0) {
            if (this.f7234l == null) {
                final float measuredHeight = getMeasuredHeight() - this.f7233j;
                final float f = (measuredHeight - 0.0f) / 3.0f;
                final float f2 = f + 0.0f;
                final float f3 = measuredHeight - f;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, measuredHeight).setDuration(this.m);
                this.f7234l = duration;
                final float f4 = 0.0f;
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.ieg
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        this.i.e(f2, f4, f, f3, measuredHeight, valueAnimator2);
                    }
                });
                this.f7234l.setRepeatCount(JsCallJavaMessageHandler.MSG_TOP_RIGHT_CONTROL);
                this.f7234l.setInterpolator(new LinearInterpolator());
                this.f7234l.setRepeatMode(1);
            }
            this.f7234l.start();
        }
    }

    public final void g() {
        ValueAnimator valueAnimator = this.f7234l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f7234l;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.i = getMeasuredWidth();
    }

    public ScanBoxView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    public ScanBoxView(Context context, @Nullable AttributeSet attributeSet, int i) {
        int resourceId;
        super(context, attributeSet, i);
        this.f7233j = rh2.a(86);
        this.m = 2500;
        setBackgroundColor(0);
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ScanBoxView);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.ScanBoxView_camera_scanloading_res, -1);
                try {
                    this.f7233j = typedArrayObtainStyledAttributes.getDimension(R$styleable.ScanBoxView_camera_scanloading_height, this.f7233j);
                } catch (Exception e2) {
                    e = e2;
                    a7b.b(TAG, e.toString());
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (resourceId != -1) {
                        ImageView imageView = new ImageView(context);
                        this.k = imageView;
                        imageView.setBackgroundResource(resourceId);
                        this.k.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) this.f7233j));
                        addView(this.k);
                    }
                }
            } catch (Throwable th) {
                if (typedArrayObtainStyledAttributes != null) {
                    typedArrayObtainStyledAttributes.recycle();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            resourceId = -1;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId != -1) {
            ImageView imageView2 = new ImageView(context);
            this.k = imageView2;
            imageView2.setBackgroundResource(resourceId);
            this.k.setLayoutParams(new FrameLayout.LayoutParams(-1, (int) this.f7233j));
            addView(this.k);
        }
    }
}
