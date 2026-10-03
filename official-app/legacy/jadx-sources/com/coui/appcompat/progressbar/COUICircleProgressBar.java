package com.coui.appcompat.progressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Nullable;
import com.oplus.aiunit.vision.ph2;
import com.support.progressbar.R$attr;
import com.support.progressbar.R$dimen;
import com.support.progressbar.R$style;
import com.support.progressbar.R$styleable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class COUICircleProgressBar extends View {
    public static final int ACCURACY = 2;
    public static final int DEFAULT_TYPE = 0;
    public static final int LARGE_TYPE = 2;
    public static final int MEDIUM_TYPE = 1;
    public static final int ORIGINAL_ANGLE = -90;
    public b A;
    public AccessibilityManager B;
    public Paint C;
    public ArrayList<c> D;
    public Paint E;
    public int F;
    public int G;
    public RectF H;
    public float I;
    public int J;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1953j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1954l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1955n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public float y;
    public Context z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int mProgress;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public String toString() {
            return "COUICircleProgressBar.SavedState { " + Integer.toHexString(System.identityHashCode(this)) + " mProgress = " + this.mProgress + " }";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.mProgress));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.mProgress = ((Integer) parcel.readValue(null)).intValue();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUICircleProgressBar.this.sendAccessibilityEvent(4);
        }
    }

    public class c {
        public c() {
        }
    }

    public COUICircleProgressBar(Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas) {
        this.E.setStrokeWidth(this.f1955n);
        int i = this.G;
        canvas.drawCircle(i, i, this.I, this.E);
    }

    public final void b() {
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        for (int i = 0; i < 360; i++) {
            this.D.add(new c());
        }
        c();
        d();
        setProgress(this.q);
        setMax(this.p);
        this.B = (AccessibilityManager) this.z.getSystemService("accessibility");
    }

    public final void c() {
        Paint paint = new Paint(1);
        this.E = paint;
        paint.setColor(this.f1953j);
        this.E.setStyle(Paint.Style.STROKE);
    }

    public final void d() {
        Paint paint = new Paint(1);
        this.C = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.C.setColor(this.i);
        this.C.setStyle(Paint.Style.STROKE);
        this.C.setStrokeWidth(this.f1955n);
        this.C.setStrokeCap(Paint.Cap.ROUND);
    }

    public void e() {
        AccessibilityManager accessibilityManager = this.B;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && this.B.isTouchExplorationEnabled()) {
            f();
        }
    }

    public final void f() {
        b bVar = this.A;
        if (bVar == null) {
            this.A = new b();
        } else {
            removeCallbacks(bVar);
        }
        postDelayed(this.A, 10L);
    }

    public final void g() {
        int i = this.p;
        if (i > 0) {
            int i2 = (int) (this.q / (i / 360.0f));
            this.r = i2;
            if (360 - i2 < 2) {
                this.r = 360;
            }
            this.s = this.r;
        } else {
            this.s = 0;
            this.r = 0;
        }
        invalidate();
    }

    public int getMax() {
        return this.p;
    }

    public int getProgress() {
        return this.q;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        b bVar = this.A;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        a(canvas);
        canvas.save();
        int i = this.G;
        canvas.rotate(-90.0f, i, i);
        canvas.drawArc(this.H, 0.0f, this.r, false, this.C);
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.k, this.f1954l);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setProgress(savedState.mProgress);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mProgress = this.q;
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.F = this.f1955n / 2;
        int width = getWidth() / 2;
        this.G = width;
        this.I = width - this.F;
        int i5 = this.G;
        float f = this.I;
        this.H = new RectF(i5 - f, i5 - f, i5 + f, i5 + f);
    }

    public void setHeight(int i) {
        this.f1954l = i;
    }

    public void setMax(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i != this.p) {
            this.p = i;
            if (this.q > i) {
                this.q = i;
            }
        }
        g();
    }

    public void setProgress(int i) {
        Log.i("COUICircleProgressBar", "setProgress: " + i);
        if (i < 0) {
            i = 0;
        }
        int i2 = this.p;
        if (i > i2) {
            i = i2;
        }
        if (i != this.q) {
            this.q = i;
        }
        g();
        e();
    }

    public void setProgressBarBgCircleColor(int i) {
        this.f1953j = i;
        c();
    }

    public void setProgressBarColor(int i) {
        this.i = i;
        d();
    }

    public void setProgressBarType(int i) {
        this.m = i;
    }

    public void setWidth(int i) {
        this.k = i;
    }

    public COUICircleProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiCircleProgressBarStyle);
    }

    public COUICircleProgressBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Widget_COUI_COUICircleProgressBar);
    }

    public COUICircleProgressBar(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k = 0;
        this.f1954l = 0;
        this.m = 0;
        this.f1955n = 0;
        this.o = 0;
        this.p = 100;
        this.q = 0;
        this.r = 0;
        this.s = -1;
        this.w = 1.0f;
        this.D = new ArrayList<>();
        ph2.c(this, false);
        this.z = context;
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.J = attributeSet.getStyleAttribute();
        } else {
            this.J = i;
        }
        this.z = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUICircleProgressBar, i, i2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.coui_loading_view_default_length);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUICircleProgressBar_couiCircleProgressBarWidth, dimensionPixelSize);
        this.f1954l = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUICircleProgressBar_couiCircleProgressBarHeight, dimensionPixelSize);
        this.m = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUICircleProgressBar_couiCircleProgressBarType, 0);
        this.i = typedArrayObtainStyledAttributes.getColor(R$styleable.COUICircleProgressBar_couiCircleProgressBarColor, 0);
        this.f1953j = typedArrayObtainStyledAttributes.getColor(R$styleable.COUICircleProgressBar_couiCircleProgressBarBgCircleColor, 0);
        this.q = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUICircleProgressBar_couiCircleProgress, this.q);
        this.p = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUICircleProgressBar_couiCircleMax, this.p);
        typedArrayObtainStyledAttributes.recycle();
        this.t = context.getResources().getDimensionPixelSize(R$dimen.coui_circle_loading_strokewidth);
        this.u = context.getResources().getDimensionPixelSize(R$dimen.coui_circle_loading_medium_strokewidth);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R$dimen.coui_circle_loading_large_strokewidth);
        this.v = dimensionPixelSize2;
        this.f1955n = this.t;
        int i3 = this.m;
        if (1 == i3) {
            this.f1955n = this.u;
        } else if (2 == i3) {
            this.f1955n = dimensionPixelSize2;
        }
        this.o = this.f1955n >> 1;
        this.x = this.k >> 1;
        this.y = this.f1954l >> 1;
        b();
    }
}
