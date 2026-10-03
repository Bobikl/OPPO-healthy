package com.coui.appcompat.progressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation;
import com.support.progressbar.R$attr;
import com.support.progressbar.R$style;
import com.support.progressbar.R$styleable;

/* JADX INFO: loaded from: classes13.dex */
public class COUILoadProgress extends AppCompatButton {
    public static final int[] A = {R$attr.coui_state_default};
    public static final int[] B = {R$attr.coui_state_wait};
    public static final int[] C = {R$attr.coui_state_fail};
    public static final int[] D = {R$attr.coui_state_ing};
    public static final int DEFAULT_UP_OR_DOWN = 0;
    public static final int INSTALL_HAVE_GIFT = 4;
    public static final int UPING_OR_DOWNING = 1;
    public static final int UP_OR_DOWN_FAIL = 3;
    public static final int UP_OR_DOWN_WAIT = 2;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f1966j;
    public final AccessibilityManager k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final FloatPropertyCompat<Float> f1967l;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1968n;
    public int o;
    public boolean p;
    public float q;
    public int r;
    public Drawable s;
    public Drawable t;
    public boolean u;
    public e v;
    public e w;
    public c x;
    public com.coui.appcompat.animation.dynamicanimation.b y;
    public d z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int mProgress;
        int mState;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        public String toString() {
            return "CompoundButton.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " mState = " + this.mState + " mProgress = " + this.mProgress + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.mState));
            parcel.writeValue(Integer.valueOf(this.mProgress));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.mState = ((Integer) parcel.readValue(null)).intValue();
            this.mProgress = ((Integer) parcel.readValue(null)).intValue();
        }
    }

    public class a extends FloatPropertyCompat<Float> {
        public a(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(Float f) {
            return 0.0f;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(Float f, float f2) {
            COUILoadProgress cOUILoadProgress = COUILoadProgress.this;
            cOUILoadProgress.q = f2;
            if (cOUILoadProgress.z != null) {
                d dVar = COUILoadProgress.this.z;
                COUILoadProgress cOUILoadProgress2 = COUILoadProgress.this;
                dVar.a(cOUILoadProgress2.q, cOUILoadProgress2.m);
            }
            COUILoadProgress.this.invalidate();
        }
    }

    public class b implements COUIDynamicAnimation.q {
        public b() {
        }

        @Override // com.coui.appcompat.animation.dynamicanimation.COUIDynamicAnimation.q
        public void onAnimationEnd(COUIDynamicAnimation cOUIDynamicAnimation, boolean z, float f, float f2) {
            COUILoadProgress.this.p = false;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            COUILoadProgress.this.sendAccessibilityEvent(4);
        }

        public /* synthetic */ c(COUILoadProgress cOUILoadProgress, a aVar) {
            this();
        }
    }

    public interface d {
        void a(float f, int i);
    }

    public interface e {
        void a(COUILoadProgress cOUILoadProgress, int i);
    }

    public COUILoadProgress(Context context) {
        this(context, null);
    }

    public final void b(int i) {
        if (this.y == null) {
            this.y = new com.coui.appcompat.animation.dynamicanimation.b(Float.valueOf(this.q), this.f1967l);
            com.coui.appcompat.animation.dynamicanimation.c cVar = new com.coui.appcompat.animation.dynamicanimation.c();
            cVar.i(0.0f);
            cVar.l(1.0f);
            this.y.E(cVar);
            this.y.a(new b());
        }
        if (this.y.i()) {
            this.p = true;
            this.y.x(this.f1968n * 1.0f);
            return;
        }
        float f = i * 1.0f;
        this.q = f;
        if (Math.abs(f - this.f1968n) <= 1.0E-7f) {
            this.p = false;
            invalidate();
            return;
        }
        this.y.r(this.q);
        this.y.x(this.f1968n * 1.0f);
        this.y.s(0.0f);
        this.y.u();
        this.p = true;
    }

    public final void c() {
        com.coui.appcompat.animation.dynamicanimation.b bVar = this.y;
        if (bVar == null || !bVar.i()) {
            return;
        }
        this.p = false;
        if (this.y.y()) {
            this.y.F();
        } else {
            this.y.c();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.s != null) {
            this.s.setState(getDrawableState());
            invalidate();
        }
    }

    public int getMax() {
        return this.o;
    }

    public int getProgress() {
        return this.f1968n;
    }

    public int getState() {
        return this.m;
    }

    public final void init() {
        this.f1968n = 0;
        this.o = 100;
    }

    @Override // android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.s;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (getState() == 0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        if (getState() == 1) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        if (getState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, B);
        }
        if (getState() == 3) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        c cVar = this.x;
        if (cVar != null) {
            removeCallbacks(cVar);
        }
        c();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void onProgressRefresh(int i) {
        AccessibilityManager accessibilityManager = this.k;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && AccessibilityManagerCompat.isTouchExplorationEnabled(this.k)) {
            scheduleAccessibilityEventSender();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setState(savedState.mState);
        setProgress(savedState.mProgress);
        requestLayout();
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        setFreezesText(true);
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mState = getState();
        savedState.mProgress = this.f1968n;
        return savedState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 8 || i == 4) {
            c();
            invalidate();
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public final void scheduleAccessibilityEventSender() {
        c cVar = this.x;
        if (cVar == null) {
            this.x = new c(this, null);
        } else {
            removeCallbacks(cVar);
        }
        postDelayed(this.x, 10L);
    }

    public void setButtonDrawable(int i) {
        if (i == 0 || i != this.r) {
            this.r = i;
            setButtonDrawable(i != 0 ? getResources().getDrawable(this.r) : null);
        }
    }

    public void setMax(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i != this.o) {
            this.o = i;
            if (this.f1968n > i) {
                this.f1968n = i;
            }
            invalidate();
        }
    }

    public void setOnStateChangeListener(e eVar) {
        this.v = eVar;
    }

    public void setOnStateChangeWidgetListener(e eVar) {
        this.w = eVar;
    }

    public void setProgress(int i) {
        setProgress(i, true);
    }

    public void setState(int i) {
        if (this.m != i) {
            this.m = i;
            refreshDrawableState();
            if (this.u) {
                return;
            }
            this.u = true;
            e eVar = this.v;
            if (eVar != null) {
                eVar.a(this, this.m);
            }
            e eVar2 = this.w;
            if (eVar2 != null) {
                eVar2.a(this, this.m);
            }
            this.u = false;
        }
    }

    public void setVisualProgressAnimationListener(d dVar) {
        this.z = dVar;
    }

    public void toggle() {
        int i = this.m;
        if (i == 0) {
            setState(1);
            return;
        }
        if (i == 1) {
            setState(2);
        } else if (i == 2) {
            setState(1);
        } else if (i == 3) {
            setState(1);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.s;
    }

    public COUILoadProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiLoadProgressStyle);
    }

    public void setProgress(int i, boolean z) {
        if (i < 0) {
            i = 0;
        }
        int i2 = this.o;
        if (i > i2) {
            i = i2;
        }
        if (z) {
            int i3 = this.f1968n;
            if (i != i3) {
                this.f1968n = i;
            }
            b(i3);
            return;
        }
        if (i != this.f1968n) {
            this.f1968n = i;
        }
        if (this.p) {
            this.p = false;
        }
        invalidate();
        onProgressRefresh(i);
    }

    public COUILoadProgress(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R$style.Widget_COUI_COUILoadProgress);
    }

    public COUILoadProgress(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.i = "COUILoadProgress";
        this.f1966j = false;
        this.f1967l = new a("VisualProgressProperty");
        this.p = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUILoadProgress, i, i2);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUILoadProgress_couiState, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUILoadProgress_couiDefaultDrawable);
        if (drawable != null) {
            setButtonDrawable(drawable);
        }
        setProgress(typedArrayObtainStyledAttributes.getInt(R$styleable.COUILoadProgress_couiProgress, this.f1968n));
        setState(integer);
        typedArrayObtainStyledAttributes.recycle();
        init();
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        this.k = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public void setButtonDrawable(Drawable drawable) {
        if (drawable != null) {
            Drawable drawable2 = this.s;
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.s);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
            this.s = drawable;
            this.t = drawable.getConstantState().newDrawable();
            this.s.setState(null);
            setMinHeight(this.s.getIntrinsicHeight());
            refreshDrawableState();
            return;
        }
        this.s = null;
        this.t = null;
        this.r = 0;
    }
}
