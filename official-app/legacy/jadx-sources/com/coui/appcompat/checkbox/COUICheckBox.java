package com.coui.appcompat.checkbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewDebug;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.ViewUtils;
import androidx.core.content.res.ResourcesCompat;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.oplus.aiunit.vision.bj2;
import com.oplus.aiunit.vision.fj2;
import com.oplus.aiunit.vision.hm2;
import com.oplus.aiunit.vision.jn2;
import com.oplus.aiunit.vision.ph2;
import com.support.appcompat.R$attr;
import com.support.appcompat.R$dimen;
import com.support.appcompat.R$drawable;
import com.support.appcompat.R$string;
import com.support.appcompat.R$styleable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes13.dex */
public class COUICheckBox extends AppCompatButton implements Checkable {
    public static final int SELECT_ALL = 2;
    public static final int SELECT_NONE = 0;
    public static final int SELECT_PART = 1;
    public static final int SELECT_UNSPECIFIC = -1;
    public static final boolean u;
    public static final int[] v;
    public static final int[] w;
    public static final Rect x;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1653j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public hm2 f1654l;
    public fj2 m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f1655n;
    public boolean o;
    public Drawable p;
    public c q;
    public int r;
    public AccessibilityManager s;
    public int t;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int mState;

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
            return "CompoundButton.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " state=" + this.mState + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.mState));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.mState = 0;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.mState = 0;
            this.mState = ((Integer) parcel.readValue(null)).intValue();
        }
    }

    public static class b implements Runnable {
        public final WeakReference<COUICheckBox> i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AttributeSet f1656j;
        public final int k;

        public b(COUICheckBox cOUICheckBox, AttributeSet attributeSet, int i) {
            this.i = new WeakReference<>(cOUICheckBox);
            this.f1656j = attributeSet;
            this.k = i;
        }

        public final void b(final COUICheckBox cOUICheckBox, final Drawable drawable) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                cOUICheckBox.f(drawable);
            } else {
                cOUICheckBox.postOnAnimation(new Runnable() { // from class: com.oplus.aiunit.vision.ig2
                    @Override // java.lang.Runnable
                    public final void run() {
                        COUICheckBox.c(cOUICheckBox, drawable);
                    }
                });
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            COUICheckBox cOUICheckBox = this.i.get();
            if (cOUICheckBox != null && cOUICheckBox.k()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (COUICheckBox.u) {
                    Log.d("COUICheckBox", "runnable run, current thread = " + Thread.currentThread() + " start time = " + jCurrentTimeMillis);
                }
                TypedArray typedArrayObtainStyledAttributes = cOUICheckBox.getContext().obtainStyledAttributes(this.f1656j, R$styleable.COUICheckBox, this.k, 0);
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.COUICheckBox_couiButton);
                if (drawable != null) {
                    b(cOUICheckBox, drawable);
                }
                if (COUICheckBox.u) {
                    Log.d("COUICheckBox", "end time = " + (System.currentTimeMillis() - jCurrentTimeMillis));
                }
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public interface c {
        void a(COUICheckBox cOUICheckBox, int i);
    }

    static {
        u = bj2.LOG_DEBUG || bj2.e("COUICheckBox", 3);
        v = new int[]{R$attr.coui_state_allSelect};
        w = new int[]{R$attr.coui_state_partSelect};
        x = new Rect();
    }

    public COUICheckBox(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void c(COUICheckBox cOUICheckBox, Drawable drawable) {
        cOUICheckBox.f(drawable);
    }

    private CharSequence getButtonStateDescription() {
        int i = this.i;
        if (i == 2) {
            return getContext().getResources().getString(R$string.coui_accessibility_checked);
        }
        return i == 0 ? getContext().getResources().getString(R$string.coui_accessibility_unchecked) : getContext().getResources().getString(R$string.coui_accessibility_partchecked);
    }

    public final void d(Runnable runnable) {
        jn2.e().i(runnable);
        postDelayed(runnable, 100L);
        g(this.f1653j);
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (isEnabled() && motionEvent.getActionMasked() == 9) {
            setHovered(true);
        }
        if (motionEvent.getActionMasked() == 10 && isHovered()) {
            setHovered(false);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        l();
        e();
        h();
        super.draw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.p != null) {
            this.p.setState(getDrawableState());
            invalidate();
        }
    }

    public final void e() {
        if (isFocusable() || isClickable()) {
            this.m.q(true);
        } else {
            this.m.q(false);
        }
    }

    public final void f(@NonNull Drawable drawable) {
        setButtonDrawable(drawable);
        j(drawable, this.f1653j);
        int i = this.f1653j;
        this.f1653j = -1;
        setState(i);
    }

    public final void g(int i) {
        int i2;
        if (i == 0) {
            i2 = isEnabled() ? R$drawable.coui_btn_check_off_normal : R$drawable.coui_btn_check_off_disabled;
        } else if (i == 1) {
            i2 = isEnabled() ? R$drawable.coui_btn_part_check_on_normal : R$drawable.coui_btn_part_check_on_disabled;
        } else if (i != 2) {
            i2 = -1;
        } else {
            i2 = isEnabled() ? R$drawable.coui_btn_check_on_normal : R$drawable.coui_btn_check_on_disabled;
        }
        if (i2 != -1) {
            setButtonDrawable(i2);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "android.widget.CompoundButton";
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingLeft() {
        Drawable drawable;
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (ViewUtils.isLayoutRtl(this) || (drawable = this.p) == null) {
            return compoundPaddingLeft;
        }
        int intrinsicWidth = compoundPaddingLeft + drawable.getIntrinsicWidth();
        return !TextUtils.isEmpty(getText()) ? intrinsicWidth + this.t : intrinsicWidth;
    }

    @Override // android.widget.TextView
    public int getCompoundPaddingRight() {
        Drawable drawable;
        int compoundPaddingRight = super.getCompoundPaddingRight();
        if (!ViewUtils.isLayoutRtl(this) || (drawable = this.p) == null) {
            return compoundPaddingRight;
        }
        int intrinsicWidth = compoundPaddingRight + drawable.getIntrinsicWidth();
        return !TextUtils.isEmpty(getText()) ? intrinsicWidth + this.t : intrinsicWidth;
    }

    @ViewDebug.ExportedProperty
    public int getState() {
        return this.i;
    }

    public final void h() {
        this.f1654l.setBounds(x);
    }

    public final void i() {
        fj2 fj2Var = new fj2(getContext());
        this.m = fj2Var;
        fj2Var.u(fj2.t(getContext(), 1));
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = getBackground() == null ? new ColorDrawable(0) : getBackground();
        drawableArr[1] = this.m;
        hm2 hm2Var = new hm2(drawableArr);
        this.f1654l = hm2Var;
        super.setBackground(hm2Var);
        ph2.c(this, false);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return getState() == 2;
    }

    public final void j(Drawable drawable, int i) {
        if (i == 1) {
            drawable.setState(w);
        } else if (i == 2) {
            drawable.setState(v);
        }
        drawable.jumpToCurrentState();
    }

    @Override // android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final boolean k() {
        return this.f1655n.compareAndSet(false, true);
    }

    public final void l() {
        int height;
        Drawable drawable = this.p;
        if (drawable != null) {
            int gravity = getGravity() & 112;
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (gravity != 16) {
                height = gravity != 80 ? 0 : getHeight() - intrinsicHeight;
            } else {
                height = (getHeight() - intrinsicHeight) / 2;
            }
            x.set(ViewUtils.isLayoutRtl(this) ? (getWidth() - intrinsicWidth) - getPaddingRight() : getPaddingLeft(), height, ViewUtils.isLayoutRtl(this) ? getWidth() - getPaddingRight() : intrinsicWidth + getPaddingLeft(), intrinsicHeight + height);
        }
    }

    public final void m() {
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        if (this.s == null) {
            this.s = (AccessibilityManager) getContext().getSystemService("accessibility");
        }
        if (this.s.isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(2048);
            accessibilityEventObtain.setContentChangeTypes(64);
            sendAccessibilityEventUnchecked(accessibilityEventObtain);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (getState() == 1) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, w);
        }
        if (getState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, v);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable = this.p;
        if (drawable != null) {
            Rect rect = x;
            drawable.setBounds(rect);
            drawable.draw(canvas);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (this.i == 2) {
            accessibilityEvent.setChecked(true);
        } else {
            accessibilityEvent.setChecked(false);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        if (this.i == 2) {
            accessibilityNodeInfo.setChecked(true);
        } else {
            accessibilityNodeInfo.setChecked(false);
        }
        accessibilityNodeInfo.setClassName("android.widget.CompoundButton");
        if (Build.VERSION.SDK_INT >= 30) {
            accessibilityNodeInfo.setStateDescription(getButtonStateDescription());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setState(savedState.mState);
        requestLayout();
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mState = getState();
        return savedState;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        hm2 hm2Var = this.f1654l;
        if (hm2Var == null) {
            super.setBackground(drawable);
        } else if (drawable == null) {
            hm2Var.j(new ColorDrawable(0));
        } else {
            hm2Var.j(drawable);
        }
    }

    public void setButtonDrawable(int i) {
        if (i == 0 || i != this.k) {
            this.k = i;
            setButtonDrawable(i != 0 ? ResourcesCompat.getDrawable(getResources(), this.k, getContext().getTheme()) : null);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (z) {
            setState(2);
        } else {
            setState(0);
        }
    }

    public void setOnStateChangeListener(c cVar) {
        this.q = cVar;
    }

    public void setState(int i) {
        if (this.f1653j != -1) {
            this.f1653j = i;
            g(i);
            return;
        }
        if (this.i != i) {
            this.i = i;
            refreshDrawableState();
            if (this.o) {
                return;
            }
            this.o = true;
            c cVar = this.q;
            if (cVar != null) {
                cVar.a(this, this.i);
            }
            this.o = false;
            m();
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setState(this.i >= 2 ? 0 : 2);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }

    public COUICheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.couiCheckBoxStyle);
    }

    public COUICheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        this.f1655n = new AtomicBoolean(false);
        if (attributeSet != null && attributeSet.getStyleAttribute() != 0) {
            this.r = attributeSet.getStyleAttribute();
        } else {
            this.r = i;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.COUICheckBox, i, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.COUICheckBox_couiAsyncLoad, false);
        int i2 = R$styleable.COUICheckBox_couiButton;
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(i2, -1);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.COUICheckBox_couiCheckBoxState, 0);
        this.f1653j = integer;
        if (u) {
            StringBuilder sb = new StringBuilder();
            sb.append("asyncLoad = ");
            sb.append(z2);
            sb.append(" drawable check = ");
            sb.append(resourceId == R$drawable.coui_checkbox_state);
            sb.append(" thread check = ");
            sb.append(Looper.getMainLooper() == Looper.myLooper());
            Log.d("COUICheckBox", sb.toString());
        }
        if (z2 && resourceId == R$drawable.coui_checkbox_state && Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
        }
        if (!z) {
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(i2);
            if (drawable != null) {
                setButtonDrawable(drawable);
                this.f1653j = -1;
                setState(integer);
            }
        } else {
            d(new b(this, attributeSet, i));
        }
        typedArrayObtainStyledAttributes.recycle();
        if (attributeSet != null) {
            int styleAttribute = attributeSet.getStyleAttribute();
            this.r = styleAttribute;
            if (styleAttribute == 0) {
                this.r = i;
            }
        } else {
            this.r = i;
        }
        i();
        this.t = getContext().getResources().getDimensionPixelSize(R$dimen.coui_checkbox_margin_between_text_drawable);
    }

    public void setButtonDrawable(Drawable drawable) {
        if (drawable != null) {
            Drawable drawable2 = this.p;
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.p);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
            this.p = drawable;
            drawable.setState(null);
            setMinHeight(this.p.getIntrinsicHeight());
        }
        refreshDrawableState();
    }
}
