package com.heytap.nearx.uikit.widget.progress;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$styleable;

/* JADX INFO: loaded from: classes18.dex */
public class NearLoadProgress extends AppCompatButton {
    public static final int DEFAULT_UP_OR_DOWN = 0;
    public static final int INSTALL_HAVE_GIFT = 4;
    private static final float ONE = 1.0f;
    private static final float ONE_MILLION = 1.0E-7f;
    private static final int PROGRESS_ANIM_DURATION = 80;
    private static final int TIMEOUT_SEND_ACCESSIBILITY_EVENT = 10;
    public static final int UPING_OR_DOWNING = 1;
    public static final int UP_OR_DOWN_FAIL = 3;
    public static final int UP_OR_DOWN_WAIT = 2;
    private final boolean DEBUG;
    private final String TAG;
    private AccessibilityEventSender mAccessibilityEventSender;
    private boolean mBroadcasting;
    private Drawable mButtonDrawable;
    private int mButtonResource;
    private Context mContext;
    protected boolean mIsUpdateWithAnimation;
    private final AccessibilityManager mManager;
    public int mMax;
    private OnStateChangeListener mOnStateChangeListener;
    private OnStateChangeListener mOnStateChangeWidgetListener;
    public int mProgress;
    public int mState;
    protected float mVisualProgress;
    private ValueAnimator mVisualProgressAnimator;
    private static final DecelerateInterpolator PROGRESS_ANIM_INTERPOLATOR = new DecelerateInterpolator();
    private static final int[] DEFAULT_SET = {R$attr.nxStateDefault};
    private static final int[] WAIT_SET = {R$attr.nxStateWait};
    private static final int[] FAIL_SET = {R$attr.nxStateFail};
    private static final int[] ING_SET = {R$attr.nxStateIng};

    public class AccessibilityEventSender implements Runnable {
        private AccessibilityEventSender() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NearLoadProgress.this.sendAccessibilityEvent(4);
        }
    }

    public interface OnStateChangeListener {
        void onStateChanged(NearLoadProgress nearLoadProgress, int i);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.heytap.nearx.uikit.widget.progress.NearLoadProgress.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        int mProgress;
        int mState;

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

    public NearLoadProgress(Context context) {
        this(context, null);
    }

    private void init() {
        this.mProgress = 0;
        this.mMax = 100;
    }

    private void refreshProgressWithAnim() {
        ValueAnimator valueAnimator = this.mVisualProgressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.mVisualProgressAnimator = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mVisualProgress, this.mProgress * 1.0f);
        this.mVisualProgressAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(80L);
        this.mVisualProgressAnimator.setInterpolator(PROGRESS_ANIM_INTERPOLATOR);
        this.mVisualProgressAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.progress.NearLoadProgress.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                NearLoadProgress.this.mVisualProgress = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                NearLoadProgress.this.invalidate();
            }
        });
        this.mVisualProgressAnimator.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.progress.NearLoadProgress.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                NearLoadProgress.this.mIsUpdateWithAnimation = false;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                NearLoadProgress nearLoadProgress = NearLoadProgress.this;
                nearLoadProgress.mIsUpdateWithAnimation = false;
                nearLoadProgress.onProgressRefresh(nearLoadProgress.mProgress);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                NearLoadProgress.this.mIsUpdateWithAnimation = true;
            }
        });
        this.mVisualProgressAnimator.start();
    }

    private void scheduleAccessibilityEventSender() {
        AccessibilityEventSender accessibilityEventSender = this.mAccessibilityEventSender;
        if (accessibilityEventSender == null) {
            this.mAccessibilityEventSender = new AccessibilityEventSender();
        } else {
            removeCallbacks(accessibilityEventSender);
        }
        postDelayed(this.mAccessibilityEventSender, 10L);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mButtonDrawable != null) {
            this.mButtonDrawable.setState(getDrawableState());
            invalidate();
        }
    }

    public int getMax(int i) {
        return this.mMax;
    }

    public int getProgress() {
        return this.mProgress;
    }

    public int getState() {
        return this.mState;
    }

    @Override // android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.mButtonDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (getState() == 0) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, DEFAULT_SET);
        }
        if (getState() == 1) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, ING_SET);
        }
        if (getState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, WAIT_SET);
        }
        if (getState() == 3) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, FAIL_SET);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        AccessibilityEventSender accessibilityEventSender = this.mAccessibilityEventSender;
        if (accessibilityEventSender != null) {
            removeCallbacks(accessibilityEventSender);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void onProgressRefresh(int i) {
        AccessibilityManager accessibilityManager = this.mManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled() && AccessibilityManagerCompat.isTouchExplorationEnabled(this.mManager)) {
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
        savedState.mProgress = this.mProgress;
        return savedState;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void setButtonDrawable(int i) {
        if (i == 0 || i != this.mButtonResource) {
            this.mButtonResource = i;
            setButtonDrawable(i != 0 ? getResources().getDrawable(this.mButtonResource) : null);
        }
    }

    public void setMax(int i) {
        if (i < 0) {
            i = 0;
        }
        if (i != this.mMax) {
            this.mMax = i;
            if (this.mProgress > i) {
                this.mProgress = i;
            }
            invalidate();
        }
    }

    public void setOnStateChangeListener(OnStateChangeListener onStateChangeListener) {
        this.mOnStateChangeListener = onStateChangeListener;
    }

    public void setOnStateChangeWidgetListener(OnStateChangeListener onStateChangeListener) {
        this.mOnStateChangeWidgetListener = onStateChangeListener;
    }

    public void setProgress(int i) {
        if (i < 0) {
            i = 0;
        }
        int i2 = this.mMax;
        if (i > i2) {
            i = i2;
        }
        if (i != this.mProgress) {
            this.mProgress = i;
        }
        if (this.mIsUpdateWithAnimation) {
            this.mIsUpdateWithAnimation = false;
        }
        invalidate();
        onProgressRefresh(i);
    }

    public void setState(int i) {
        if (this.mState != i) {
            this.mState = i;
            refreshDrawableState();
            if (this.mBroadcasting) {
                return;
            }
            this.mBroadcasting = true;
            OnStateChangeListener onStateChangeListener = this.mOnStateChangeListener;
            if (onStateChangeListener != null) {
                onStateChangeListener.onStateChanged(this, this.mState);
            }
            OnStateChangeListener onStateChangeListener2 = this.mOnStateChangeWidgetListener;
            if (onStateChangeListener2 != null) {
                onStateChangeListener2.onStateChanged(this, this.mState);
            }
            this.mBroadcasting = false;
        }
    }

    public void toggle() {
        int i = this.mState;
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
        return super.verifyDrawable(drawable) || drawable == this.mButtonDrawable;
    }

    public NearLoadProgress(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.NearLoadProgressStyle);
    }

    public int getMax() {
        return this.mMax;
    }

    public NearLoadProgress(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "NearLoadProgress";
        this.DEBUG = false;
        this.mIsUpdateWithAnimation = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearLoadProgress, i, 0);
        int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearLoadProgress_nxState, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearLoadProgress_nxDefaultDrawable);
        if (drawable != null) {
            setButtonDrawable(drawable);
        }
        setProgress(typedArrayObtainStyledAttributes.getInt(R$styleable.NearLoadProgress_nxProgress, this.mProgress));
        setState(integer);
        typedArrayObtainStyledAttributes.recycle();
        init();
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        this.mManager = (AccessibilityManager) context.getSystemService("accessibility");
    }

    public void setButtonDrawable(Drawable drawable) {
        if (drawable != null) {
            Drawable drawable2 = this.mButtonDrawable;
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.mButtonDrawable);
            }
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            drawable.setVisible(getVisibility() == 0, false);
            this.mButtonDrawable = drawable;
            drawable.setState(null);
            setMinHeight(this.mButtonDrawable.getIntrinsicHeight());
        }
        refreshDrawableState();
    }

    public void setProgress(int i, boolean z) {
        if (i < 0) {
            i = 0;
        }
        int i2 = this.mMax;
        if (i > i2) {
            i = i2;
        }
        int i3 = this.mProgress;
        if (i != i3) {
            this.mVisualProgress = i3 * 1.0f;
            this.mProgress = i;
        }
        if (Math.abs(this.mVisualProgress - this.mProgress) > ONE_MILLION) {
            refreshProgressWithAnim();
        }
    }
}
