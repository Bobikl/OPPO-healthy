package com.coui.appcompat.progressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.Nullable;
import androidx.core.graphics.ColorUtils;
import com.oplus.aiunit.vision.ph2;
import com.support.progressbar.R$attr;
import com.support.progressbar.R$dimen;
import com.support.progressbar.R$style;
import com.support.progressbar.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUICircularProgressBar extends View {
    public static final int LARGE_SIZE = 1;
    public static final int MEDIUM_SIZE = 0;
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_FOLLOW_THEME = 2;
    public static final int TYPE_ON_IMAGE = 1;
    public int A;
    public boolean B;
    public boolean C;
    public b D;
    public AccessibilityManager E;
    public final com.coui.appcompat.progressbar.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1956j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f1957l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1958n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public Context z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int mMax;
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
            return "COUICircularProgressBar.SavedState { " + Integer.toHexString(System.identityHashCode(this)) + " mProgress = " + this.mProgress + " mMax = " + this.mMax + " }";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.mProgress));
            parcel.writeValue(Integer.valueOf(this.mMax));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.mProgress = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
            this.mMax = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUICircularProgressBar.this.sendAccessibilityEvent(4);
        }
    }

    public COUICircularProgressBar(Context context) {
        this(context, null);
    }

    public final void a() {
        if (2 == this.k) {
            this.i.V(ColorUtils.setAlphaComponent(this.m, 89));
        } else {
            this.i.V(this.m);
        }
        this.i.O(1 == this.k);
        this.i.T(this.f1957l);
        this.i.Q(this.f1958n);
        this.i.M(this.o);
        com.coui.appcompat.progressbar.a aVar = this.i;
        float f = this.x;
        int i = this.r;
        aVar.U(f + i, this.y + i, this.p - (i * 2), this.s);
        this.i.S(this.z.getResources().getDimensionPixelSize(R$dimen.coui_circular_progress_error_diameter), this.z.getResources().getDimensionPixelSize(R$dimen.coui_circular_progress_error_stroke_width));
        this.i.invalidateSelf();
        invalidate();
    }

    public final void b() {
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.E = (AccessibilityManager) this.z.getSystemService("accessibility");
        setProgress(this.u);
        setMax(this.t);
        a();
    }

    public void c() {
        AccessibilityManager accessibilityManager = this.E;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && this.E.isTouchExplorationEnabled()) {
            d();
        }
    }

    public final void d() {
        b bVar = this.D;
        if (bVar == null) {
            this.D = new b();
        } else {
            removeCallbacks(bVar);
        }
        postDelayed(this.D, 10L);
    }

    public void e(int i, boolean z) {
        if (i < 0) {
            i = 0;
        }
        int i2 = this.t;
        if (i > i2) {
            i = i2;
        }
        if (i != this.u) {
            this.u = i;
            this.i.R(i, z);
        }
        c();
    }

    public int getMax() {
        return this.t;
    }

    public int getProgress() {
        return this.u;
    }

    public float getVisualProgress() {
        return this.i.r();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        this.i.N(this);
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        com.coui.appcompat.progressbar.a aVar = this.i;
        if (aVar != null) {
            aVar.L();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.i.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.p;
        int i4 = this.r;
        setMeasuredDimension(i3 + (i4 * 2), this.q + (i4 * 2));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        e(savedState.mProgress, false);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mProgress = this.u;
        return savedState;
    }

    public void setMax(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i != this.t) {
            this.t = i;
            this.i.P(i);
            int i2 = this.u;
            int i3 = this.t;
            if (i2 > i3) {
                this.u = i3;
            }
        }
    }

    public void setOnProgressChangedListener(com.coui.appcompat.progressbar.a.f fVar) {
        com.coui.appcompat.progressbar.a aVar = this.i;
        if (aVar != null) {
            aVar.setOnProgressChangedListener(fVar);
        }
    }

    public void setOnProgressStateAnimationListener(com.coui.appcompat.progressbar.a.g gVar) {
        com.coui.appcompat.progressbar.a aVar = this.i;
        if (aVar != null) {
            aVar.setOnProgressStateAnimatorListener(gVar);
        }
    }

    public void setProgress(int i) {
        e(i, true);
    }

    public void setProgressBarType(int i) {
        this.k = i;
        a();
    }

    public void setProgressSize(int i) {
        this.f1956j = i;
        if (i == 0) {
            int dimensionPixelOffset = this.z.getResources().getDimensionPixelOffset(R$dimen.coui_circular_progress_medium_length);
            this.p = dimensionPixelOffset;
            this.q = dimensionPixelOffset;
            this.s = this.v;
        } else if (1 == i) {
            int dimensionPixelOffset2 = this.z.getResources().getDimensionPixelOffset(R$dimen.coui_circular_progress_large_length);
            this.p = dimensionPixelOffset2;
            this.q = dimensionPixelOffset2;
            this.s = this.w;
        }
        this.x = this.p >> 1;
        this.y = this.q >> 1;
        a();
        requestLayout();
    }

    public COUICircularProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiCircularProgressBarStyle);
    }

    public COUICircularProgressBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Widget_COUI_COUICircularProgressBar);
    }

    public COUICircularProgressBar(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1956j = 0;
        this.k = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 100;
        this.u = 0;
        this.B = false;
        this.C = false;
        ph2.c(this, false);
        this.z = context;
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.A = attributeSet.getStyleAttribute();
        } else {
            this.A = i;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R$dimen.coui_circular_progress_large_length);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUICircularProgressBar, i, i2);
        this.p = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUICircularProgressBar_couiCircularProgressBarWidth, dimensionPixelSize);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.COUICircularProgressBar_couiCircularProgressBarHeight, dimensionPixelSize);
        this.k = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUICircularProgressBar_couiCircularProgressBarType, 0);
        this.f1956j = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUICircularProgressBar_couiCircularProgressBarSize, 1);
        this.f1957l = typedArrayObtainStyledAttributes.getColor(R$styleable.COUICircularProgressBar_couiCircularProgressBarColor, 0);
        this.m = typedArrayObtainStyledAttributes.getColor(R$styleable.COUICircularProgressBar_couiCircularProgressBarTrackColor, 0);
        this.f1958n = typedArrayObtainStyledAttributes.getColor(R$styleable.COUICircularProgressBar_couiCircularPauseDrawableTint, 0);
        this.o = typedArrayObtainStyledAttributes.getColor(R$styleable.COUICircularProgressBar_couiCircularErrorDrawableTint, 0);
        this.u = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUICircularProgressBar_couiCircularProgress, this.u);
        this.t = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUICircularProgressBar_couiCircularMax, this.t);
        typedArrayObtainStyledAttributes.recycle();
        this.r = context.getResources().getDimensionPixelSize(R$dimen.coui_circular_progress_default_padding);
        this.v = context.getResources().getDimensionPixelSize(R$dimen.coui_circular_progress_medium_stroke_width);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R$dimen.coui_circular_progress_large_stroke_width);
        this.w = dimensionPixelSize2;
        int i3 = this.f1956j;
        if (i3 == 0) {
            this.s = this.v;
        } else if (1 == i3) {
            this.s = dimensionPixelSize2;
        }
        this.x = this.p >> 1;
        this.y = this.q >> 1;
        this.i = new com.coui.appcompat.progressbar.a(context);
        b();
    }
}
