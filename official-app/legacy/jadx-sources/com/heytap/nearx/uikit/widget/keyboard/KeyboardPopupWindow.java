package com.heytap.nearx.uikit.widget.keyboard;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.heytap.nearx.uikit.R$style;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.keyboard.util.NearViewCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
public class KeyboardPopupWindow extends PopupWindow {
    private static final int[] ABOVE_ANCHOR_STATE_SET = {R.attr.state_above_anchor};
    private static final int DEFAULT_ANCHORED_GRAVITY = 8388659;
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    private boolean mAboveAnchor;
    private Drawable mAboveAnchorBackgroundDrawable;
    private boolean mAllowScrollingAnchorParent;
    private WeakReference<View> mAnchor;
    private int mAnchorRelativeX;
    private int mAnchorRelativeY;
    private int mAnchorXoff;
    private int mAnchorYoff;
    private int mAnchoredGravity;
    private int mAnimationStyle;
    private boolean mAttachedInDecor;
    private boolean mAttachedInDecorSet;
    private Drawable mBackground;
    private Drawable mBelowAnchorBackgroundDrawable;
    private boolean mClipToScreen;
    private boolean mClippingEnabled;
    private View mContentView;
    private Context mContext;
    private int[] mDrawingLocation;
    private float mElevation;
    private boolean mFocusable;
    private int mHeight;
    private int mHeightMode;
    private boolean mIgnoreCheekPress;
    private int mInputMethodMode;
    private boolean mIsDropdown;
    private boolean mIsShowing;
    private int mLastHeight;
    private int mLastWidth;
    private boolean mLayoutInScreen;
    private boolean mLayoutInsetDecor;
    private boolean mNotTouchModal;
    private OnDismissListener mOnDismissListener;
    private OnPreInvokePopupListener mOnPreInvokePopupListener;
    private final ViewTreeObserver.OnScrollChangedListener mOnScrollChangedListener;
    private boolean mOutsideTouchable;
    private boolean mOverlapAnchor;
    private int mPopupHeight;
    private View mPopupView;
    private boolean mPopupViewInitialLayoutDirectionInherited;
    private int mPopupWidth;
    private int[] mScreenLocation;
    private int mSoftInputMode;
    private int mSplitTouchEnabled;
    private Rect mTempRect;
    private View.OnTouchListener mTouchInterceptor;
    private boolean mTouchable;
    private int mWidth;
    private int mWidthMode;
    private int mWindowLayoutType;
    private WindowManager mWindowManager;

    public interface OnDismissListener {
        void onDismiss();
    }

    public interface OnPreInvokePopupListener {
        void onPreInvokePopup(WindowManager.LayoutParams layoutParams);
    }

    public class PopupViewContainer extends FrameLayout {
        private static final String TAG = "PopupWindow.PopupViewContainer";

        public PopupViewContainer(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            KeyEvent.DispatcherState keyDispatcherState;
            if (keyEvent.getKeyCode() == 4 && getKeyDispatcherState() != null) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() != 1 || (keyDispatcherState = getKeyDispatcherState()) == null || !keyDispatcherState.isTracking(keyEvent) || keyEvent.isCanceled()) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                KeyboardPopupWindow.this.dismiss();
                return true;
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (KeyboardPopupWindow.this.mTouchInterceptor == null || !KeyboardPopupWindow.this.mTouchInterceptor.onTouch(this, motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return true;
        }

        @Override // android.view.ViewGroup, android.view.View
        public int[] onCreateDrawableState(int i) {
            if (!KeyboardPopupWindow.this.mAboveAnchor) {
                return super.onCreateDrawableState(i);
            }
            int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
            View.mergeDrawableStates(iArrOnCreateDrawableState, KeyboardPopupWindow.ABOVE_ANCHOR_STATE_SET);
            return iArrOnCreateDrawableState;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0 && (x < 0 || x >= getWidth() || y < 0 || y >= getHeight())) {
                KeyboardPopupWindow.this.dismiss();
                return true;
            }
            if (motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            KeyboardPopupWindow.this.dismiss();
            return true;
        }

        @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
        public void sendAccessibilityEvent(int i) {
            if (KeyboardPopupWindow.this.mContentView != null) {
                KeyboardPopupWindow.this.mContentView.sendAccessibilityEvent(i);
            } else {
                super.sendAccessibilityEvent(i);
            }
        }
    }

    public KeyboardPopupWindow(Context context) {
        this(context, (AttributeSet) null);
    }

    private int computeAnimationResource() {
        int i = this.mAnimationStyle;
        if (i != -1) {
            return i;
        }
        if (this.mIsDropdown) {
            return this.mAboveAnchor ? R$style.Animation_nx_DropDownUp : R$style.Animation_nx_DropDownDown;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f A[PHI: r4
  0x001f: PHI (r4v3 int) = (r4v2 int), (r4v21 int) binds: [B:11:0x001d, B:8:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    private int computeFlags(int i) {
        int i2 = i & (-8815129);
        if (this.mIgnoreCheekPress) {
            i2 |= 32768;
        }
        if (!this.mFocusable) {
            i2 |= 8;
            if (this.mInputMethodMode == 1) {
                i2 |= 131072;
            }
        } else if (this.mInputMethodMode == 2) {
            i2 |= 131072;
        }
        if (!this.mTouchable) {
            i2 |= 16;
        }
        if (this.mOutsideTouchable) {
            i2 |= 262144;
        }
        if (!this.mClippingEnabled) {
            i2 |= 512;
        }
        if (isSplitTouchEnabled()) {
            i2 |= 8388608;
        }
        if (this.mLayoutInScreen) {
            i2 |= 256;
        }
        if (this.mLayoutInsetDecor) {
            i2 |= 65536;
        }
        if (this.mNotTouchModal) {
            i2 |= 32;
        }
        return this.mAttachedInDecor ? i2 | 1073741824 : i2;
    }

    private WindowManager.LayoutParams createPopupLayout(IBinder iBinder) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        int i = this.mWidth;
        this.mLastWidth = i;
        layoutParams.width = i;
        int i2 = this.mHeight;
        this.mLastHeight = i2;
        layoutParams.height = i2;
        Drawable drawable = this.mBackground;
        if (drawable != null) {
            layoutParams.format = drawable.getOpacity();
        } else {
            layoutParams.format = -3;
        }
        layoutParams.flags = computeFlags(layoutParams.flags);
        layoutParams.type = this.mWindowLayoutType;
        layoutParams.token = iBinder;
        layoutParams.softInputMode = this.mSoftInputMode;
        layoutParams.setTitle("PopupWindow:" + Integer.toHexString(hashCode()));
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public boolean findDropDownPosition(View view, WindowManager.LayoutParams layoutParams, int i, int i2, int i3) {
        boolean z;
        int height = view.getHeight();
        int width = view.getWidth();
        int i4 = this.mOverlapAnchor ? i2 - height : i2;
        view.getLocationInWindow(this.mDrawingLocation);
        int[] iArr = this.mDrawingLocation;
        layoutParams.x = iArr[0] + i;
        layoutParams.y = iArr[1] + height + i4;
        int absoluteGravity = Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7;
        if (absoluteGravity == 5) {
            layoutParams.x -= this.mPopupWidth - width;
        }
        layoutParams.gravity = 51;
        view.getLocationOnScreen(this.mScreenLocation);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int i5 = this.mScreenLocation[1] + height + i4;
        View rootView = view.getRootView();
        if (i5 + this.mPopupHeight > rect.bottom || (layoutParams.x + this.mPopupWidth) - rootView.getWidth() > 0) {
            if (this.mAllowScrollingAnchorParent) {
                int scrollX = view.getScrollX();
                int scrollY = view.getScrollY();
                view.requestRectangleOnScreen(new Rect(scrollX, scrollY, this.mPopupWidth + scrollX + i, this.mPopupHeight + scrollY + height + i4), true);
            }
            view.getLocationInWindow(this.mDrawingLocation);
            int[] iArr2 = this.mDrawingLocation;
            int i6 = iArr2[0] + i;
            layoutParams.x = i6;
            layoutParams.y = iArr2[1] + height + i4;
            if (absoluteGravity == 5) {
                layoutParams.x = i6 - (this.mPopupWidth - width);
            }
            view.getLocationOnScreen(this.mScreenLocation);
            int i7 = rect.bottom;
            int i8 = this.mScreenLocation[1];
            z = ((i7 - i8) - height) - i4 < (i8 - i4) - rect.top;
            if (z) {
                layoutParams.gravity = 83;
                layoutParams.y = (rootView.getHeight() - this.mDrawingLocation[1]) + i4;
            } else {
                layoutParams.y = this.mDrawingLocation[1] + height + i4;
            }
        } else {
            z = false;
        }
        if (this.mClipToScreen) {
            int i9 = rect.right;
            int i10 = rect.left;
            int i11 = i9 - i10;
            int i12 = layoutParams.x;
            int i13 = layoutParams.width;
            int i14 = i12 + i13;
            if (i14 > i11) {
                layoutParams.x = i12 - (i14 - i11);
            }
            if (layoutParams.x < i10) {
                layoutParams.x = i10;
                layoutParams.width = Math.min(i13, i11);
            }
            if (z) {
                int i15 = (this.mScreenLocation[1] + i4) - this.mPopupHeight;
                if (i15 < 0) {
                    layoutParams.y += i15;
                }
            } else {
                layoutParams.y = Math.max(layoutParams.y, rect.top);
            }
        }
        layoutParams.gravity |= 268435456;
        int[] iArr3 = this.mDrawingLocation;
        this.mAnchorRelativeX = (iArr3[0] - layoutParams.x) + (height / 2);
        this.mAnchorRelativeY = (iArr3[1] - layoutParams.y) + (width / 2);
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001d  */
    private void preparePopup(WindowManager.LayoutParams layoutParams) {
        int i;
        View view = this.mContentView;
        if (view == null || this.mContext == null || this.mWindowManager == null) {
            throw new IllegalStateException("You must specify a valid content view by calling setContentView() before attempting to show the popup.");
        }
        if (this.mBackground != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                i = layoutParams2.height != -2 ? -1 : -2;
            }
            PopupViewContainer popupViewContainer = new PopupViewContainer(this.mContext);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, i);
            popupViewContainer.setBackgroundDrawable(this.mBackground);
            popupViewContainer.addView(this.mContentView, layoutParams3);
            this.mPopupView = popupViewContainer;
        } else {
            this.mPopupView = view;
        }
        this.mPopupView.setElevation(this.mElevation);
        this.mPopupViewInitialLayoutDirectionInherited = NearViewCompat.getRawLayoutDirection(this.mPopupView) == 2;
        this.mPopupWidth = layoutParams.width;
        this.mPopupHeight = layoutParams.height;
    }

    private void registerForScrollChanged(View view, int i, int i2, int i3) {
        unregisterForScrollChanged();
        this.mAnchor = new WeakReference<>(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnScrollChangedListener(this.mOnScrollChangedListener);
        }
        this.mAnchorXoff = i;
        this.mAnchorYoff = i2;
        this.mAnchoredGravity = i3;
    }

    @SuppressLint({"NewApi"})
    private void setLayoutDirectionFromAnchor() {
        View view;
        WeakReference<View> weakReference = this.mAnchor;
        if (weakReference == null || (view = weakReference.get()) == null || !this.mPopupViewInitialLayoutDirectionInherited) {
            return;
        }
        this.mPopupView.setLayoutDirection(view.getLayoutDirection());
    }

    private void unregisterForScrollChanged() {
        WeakReference<View> weakReference = this.mAnchor;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null) {
            view.getViewTreeObserver().removeOnScrollChangedListener(this.mOnScrollChangedListener);
        }
        this.mAnchor = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAboveAnchorOverride(boolean z) {
        if (z != this.mAboveAnchor) {
            this.mAboveAnchor = z;
            if (this.mBackground != null) {
                Drawable drawable = this.mAboveAnchorBackgroundDrawable;
                if (drawable == null) {
                    this.mPopupView.refreshDrawableState();
                } else if (z) {
                    this.mPopupView.setBackgroundDrawable(drawable);
                } else {
                    this.mPopupView.setBackgroundDrawable(this.mBelowAnchorBackgroundDrawable);
                }
            }
        }
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        if (!isShowing() || this.mPopupView == null) {
            return;
        }
        this.mIsShowing = false;
        unregisterForScrollChanged();
        try {
            this.mWindowManager.removeViewImmediate(this.mPopupView);
        } finally {
            View view = this.mPopupView;
            View view2 = this.mContentView;
            if (view != view2 && (view instanceof ViewGroup)) {
                ((ViewGroup) view).removeView(view2);
            }
            this.mPopupView = null;
            OnDismissListener onDismissListener = this.mOnDismissListener;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }
    }

    @Override // android.widget.PopupWindow
    public int getAnimationStyle() {
        return this.mAnimationStyle;
    }

    @Override // android.widget.PopupWindow
    public Drawable getBackground() {
        return this.mBackground;
    }

    @Override // android.widget.PopupWindow
    public View getContentView() {
        return this.mContentView;
    }

    @Override // android.widget.PopupWindow
    public float getElevation() {
        return this.mElevation;
    }

    @Override // android.widget.PopupWindow
    public int getHeight() {
        return this.mHeight;
    }

    @Override // android.widget.PopupWindow
    public int getInputMethodMode() {
        return this.mInputMethodMode;
    }

    @Override // android.widget.PopupWindow
    public int getMaxAvailableHeight(View view) {
        return getMaxAvailableHeight(view, 0);
    }

    @Override // android.widget.PopupWindow
    public int getSoftInputMode() {
        return this.mSoftInputMode;
    }

    @Override // android.widget.PopupWindow
    public int getWidth() {
        return this.mWidth;
    }

    @Override // android.widget.PopupWindow
    public int getWindowLayoutType() {
        return this.mWindowLayoutType;
    }

    public void invokePopup(WindowManager.LayoutParams layoutParams) {
        OnPreInvokePopupListener onPreInvokePopupListener = this.mOnPreInvokePopupListener;
        if (onPreInvokePopupListener != null) {
            onPreInvokePopupListener.onPreInvokePopup(layoutParams);
        }
        Context context = this.mContext;
        if (context != null) {
            layoutParams.packageName = context.getPackageName();
        }
        this.mPopupView.setFitsSystemWindows(this.mLayoutInsetDecor);
        setLayoutDirectionFromAnchor();
        this.mWindowManager.addView(this.mPopupView, layoutParams);
    }

    @Override // android.widget.PopupWindow
    public boolean isAboveAnchor() {
        return this.mAboveAnchor;
    }

    @Override // android.widget.PopupWindow
    public boolean isAttachedInDecor() {
        return this.mAttachedInDecor;
    }

    @Override // android.widget.PopupWindow
    public boolean isClippingEnabled() {
        return this.mClippingEnabled;
    }

    @Override // android.widget.PopupWindow
    public boolean isFocusable() {
        return this.mFocusable;
    }

    public boolean isLayoutInScreenEnabled() {
        return this.mLayoutInScreen;
    }

    @Override // android.widget.PopupWindow
    public boolean isOutsideTouchable() {
        return this.mOutsideTouchable;
    }

    @Override // android.widget.PopupWindow
    public boolean isShowing() {
        return this.mIsShowing;
    }

    @Override // android.widget.PopupWindow
    public boolean isSplitTouchEnabled() {
        Context context;
        int i = this.mSplitTouchEnabled;
        if (i >= 0 || (context = this.mContext) == null) {
            return i == 1;
        }
        return context.getApplicationInfo().targetSdkVersion >= 11;
    }

    @Override // android.widget.PopupWindow
    public boolean isTouchable() {
        return this.mTouchable;
    }

    public void setAllowScrollingAnchorParent(boolean z) {
        this.mAllowScrollingAnchorParent = z;
    }

    @Override // android.widget.PopupWindow
    public void setAnimationStyle(int i) {
        this.mAnimationStyle = i;
    }

    @Override // android.widget.PopupWindow
    public void setAttachedInDecor(boolean z) {
        this.mAttachedInDecor = z;
        this.mAttachedInDecorSet = true;
    }

    @Override // android.widget.PopupWindow
    public void setBackgroundDrawable(Drawable drawable) {
        this.mBackground = drawable;
        if (drawable instanceof StateListDrawable) {
            this.mBelowAnchorBackgroundDrawable = null;
            this.mAboveAnchorBackgroundDrawable = null;
        }
    }

    public void setClipToScreenEnabled(boolean z) {
        this.mClipToScreen = z;
        setClippingEnabled(!z);
    }

    @Override // android.widget.PopupWindow
    public void setClippingEnabled(boolean z) {
        this.mClippingEnabled = z;
    }

    @Override // android.widget.PopupWindow
    public void setContentView(View view) {
        if (isShowing()) {
            return;
        }
        this.mContentView = view;
        if (this.mContext == null && view != null) {
            this.mContext = view.getContext();
        }
        if (this.mWindowManager == null && this.mContentView != null) {
            this.mWindowManager = (WindowManager) this.mContext.getSystemService("window");
        }
        Context context = this.mContext;
        if (context == null || this.mAttachedInDecorSet) {
            return;
        }
        setAttachedInDecor(context.getApplicationInfo().targetSdkVersion >= 22);
    }

    @Override // android.widget.PopupWindow
    public void setElevation(float f) {
        this.mElevation = f;
    }

    @Override // android.widget.PopupWindow
    public void setFocusable(boolean z) {
        this.mFocusable = z;
    }

    @Override // android.widget.PopupWindow
    public void setHeight(int i) {
        this.mHeight = i;
    }

    @Override // android.widget.PopupWindow
    public void setIgnoreCheekPress() {
        this.mIgnoreCheekPress = true;
    }

    @Override // android.widget.PopupWindow
    public void setInputMethodMode(int i) {
        this.mInputMethodMode = i;
    }

    public void setLayoutInScreenEnabled(boolean z) {
        this.mLayoutInScreen = z;
    }

    public void setLayoutInsetDecor(boolean z) {
        this.mLayoutInsetDecor = z;
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setOnPreInvokePopupListener(OnPreInvokePopupListener onPreInvokePopupListener) {
        this.mOnPreInvokePopupListener = onPreInvokePopupListener;
    }

    @Override // android.widget.PopupWindow
    public void setOutsideTouchable(boolean z) {
        this.mOutsideTouchable = z;
    }

    @Override // android.widget.PopupWindow
    public void setSoftInputMode(int i) {
        this.mSoftInputMode = i;
    }

    @Override // android.widget.PopupWindow
    public void setSplitTouchEnabled(boolean z) {
        this.mSplitTouchEnabled = z ? 1 : 0;
    }

    @Override // android.widget.PopupWindow
    public void setTouchInterceptor(View.OnTouchListener onTouchListener) {
        this.mTouchInterceptor = onTouchListener;
    }

    @Override // android.widget.PopupWindow
    public void setTouchModal(boolean z) {
        this.mNotTouchModal = !z;
    }

    @Override // android.widget.PopupWindow
    public void setTouchable(boolean z) {
        this.mTouchable = z;
    }

    @Override // android.widget.PopupWindow
    public void setWidth(int i) {
        this.mWidth = i;
    }

    @Override // android.widget.PopupWindow
    public void setWindowLayoutMode(int i, int i2) {
        this.mWidthMode = i;
        this.mHeightMode = i2;
    }

    @Override // android.widget.PopupWindow
    public void setWindowLayoutType(int i) {
        this.mWindowLayoutType = i;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        showAsDropDown(view, 0, 0);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View view, int i, int i2, int i3) {
        showAtLocation(view.getWindowToken(), i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update() {
        boolean z;
        if (!isShowing() || this.mContentView == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.mPopupView.getLayoutParams();
        int iComputeAnimationResource = computeAnimationResource();
        boolean z2 = true;
        if (iComputeAnimationResource != layoutParams.windowAnimations) {
            layoutParams.windowAnimations = iComputeAnimationResource;
            z = true;
        } else {
            z = false;
        }
        int iComputeFlags = computeFlags(layoutParams.flags);
        if (iComputeFlags != layoutParams.flags) {
            layoutParams.flags = iComputeFlags;
        } else {
            z2 = z;
        }
        if (z2) {
            setLayoutDirectionFromAnchor();
            this.mWindowManager.updateViewLayout(this.mPopupView, layoutParams);
        }
    }

    public KeyboardPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.PopupWindow
    public int getMaxAvailableHeight(View view, int i) {
        return getMaxAvailableHeight(view, i, false);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        showAsDropDown(view, i, i2, 8388659);
    }

    public void showAtLocation(IBinder iBinder, int i, int i2, int i3) {
        if (isShowing() || this.mContentView == null) {
            return;
        }
        unregisterForScrollChanged();
        this.mIsShowing = true;
        this.mIsDropdown = false;
        WindowManager.LayoutParams layoutParamsCreatePopupLayout = createPopupLayout(iBinder);
        layoutParamsCreatePopupLayout.windowAnimations = computeAnimationResource();
        preparePopup(layoutParamsCreatePopupLayout);
        if (i == 0) {
            i = 8388659;
        }
        layoutParamsCreatePopupLayout.gravity = i;
        layoutParamsCreatePopupLayout.x = i2;
        layoutParamsCreatePopupLayout.y = i3;
        int i4 = this.mHeightMode;
        if (i4 < 0) {
            this.mLastHeight = i4;
            layoutParamsCreatePopupLayout.height = i4;
        }
        int i5 = this.mWidthMode;
        if (i5 < 0) {
            this.mLastWidth = i5;
            layoutParamsCreatePopupLayout.width = i5;
        }
        invokePopup(layoutParamsCreatePopupLayout);
    }

    public KeyboardPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    @Override // android.widget.PopupWindow
    public int getMaxAvailableHeight(View view, int i, boolean z) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int[] iArr = this.mDrawingLocation;
        view.getLocationOnScreen(iArr);
        int i2 = rect.bottom;
        if (z) {
            i2 = view.getContext().getResources().getDisplayMetrics().heightPixels;
        }
        int iMax = Math.max((i2 - (iArr[1] + view.getHeight())) - i, (iArr[1] - rect.top) + i);
        Drawable drawable = this.mBackground;
        if (drawable == null) {
            return iMax;
        }
        drawable.getPadding(this.mTempRect);
        Rect rect2 = this.mTempRect;
        return iMax - (rect2.top + rect2.bottom);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (isShowing() || this.mContentView == null) {
            return;
        }
        registerForScrollChanged(view, i, i2, i3);
        this.mIsShowing = true;
        this.mIsDropdown = true;
        WindowManager.LayoutParams layoutParamsCreatePopupLayout = createPopupLayout(view.getWindowToken());
        preparePopup(layoutParamsCreatePopupLayout);
        updateAboveAnchorOverride(findDropDownPosition(view, layoutParamsCreatePopupLayout, i, i2, i3));
        int i4 = this.mHeightMode;
        if (i4 < 0) {
            this.mLastHeight = i4;
            layoutParamsCreatePopupLayout.height = i4;
        }
        int i5 = this.mWidthMode;
        if (i5 < 0) {
            this.mLastWidth = i5;
            layoutParamsCreatePopupLayout.width = i5;
        }
        layoutParamsCreatePopupLayout.windowAnimations = computeAnimationResource();
        invokePopup(layoutParamsCreatePopupLayout);
    }

    public KeyboardPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mInputMethodMode = 0;
        this.mSoftInputMode = 1;
        this.mTouchable = true;
        this.mOutsideTouchable = false;
        this.mClippingEnabled = true;
        this.mSplitTouchEnabled = -1;
        this.mAllowScrollingAnchorParent = true;
        this.mLayoutInsetDecor = false;
        this.mAttachedInDecor = true;
        this.mAttachedInDecorSet = false;
        this.mDrawingLocation = new int[2];
        this.mScreenLocation = new int[2];
        this.mTempRect = new Rect();
        this.mWindowLayoutType = 1000;
        this.mIgnoreCheekPress = false;
        this.mAnimationStyle = -1;
        this.mOnScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.heytap.nearx.uikit.widget.keyboard.KeyboardPopupWindow.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                View view = KeyboardPopupWindow.this.mAnchor != null ? (View) KeyboardPopupWindow.this.mAnchor.get() : null;
                if (view == null || KeyboardPopupWindow.this.mPopupView == null) {
                    return;
                }
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) KeyboardPopupWindow.this.mPopupView.getLayoutParams();
                KeyboardPopupWindow keyboardPopupWindow = KeyboardPopupWindow.this;
                keyboardPopupWindow.updateAboveAnchorOverride(keyboardPopupWindow.findDropDownPosition(view, layoutParams, keyboardPopupWindow.mAnchorXoff, KeyboardPopupWindow.this.mAnchorYoff, KeyboardPopupWindow.this.mAnchoredGravity));
                KeyboardPopupWindow.this.update(layoutParams.x, layoutParams.y, -1, -1, true);
            }
        };
        this.mOnPreInvokePopupListener = null;
        this.mContext = context;
        this.mWindowManager = (WindowManager) context.getSystemService("window");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearPopupWindow, i, i2);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.NearPopupWindowCompat, i, i2);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearPopupWindow_android_popupBackground);
        this.mElevation = typedArrayObtainStyledAttributes2.getDimension(R$styleable.NearPopupWindowCompat_nxSupportPopupElevation, 0.0f);
        this.mOverlapAnchor = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearPopupWindow_overlapAnchor, false);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(R$styleable.NearPopupWindowCompat_android_popupAnimationStyle, -1);
        this.mAnimationStyle = resourceId != R$style.Animation_nx_PopupWindow ? resourceId : -1;
        typedArrayObtainStyledAttributes2.recycle();
        typedArrayObtainStyledAttributes.recycle();
        setBackgroundDrawable(drawable);
    }

    @Override // android.widget.PopupWindow
    public void update(int i, int i2) {
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.mPopupView.getLayoutParams();
        update(layoutParams.x, layoutParams.y, i, i2, false);
    }

    @Override // android.widget.PopupWindow
    public void update(int i, int i2, int i3, int i4) {
        update(i, i2, i3, i4, false);
    }

    @Override // android.widget.PopupWindow
    public void update(int i, int i2, int i3, int i4, boolean z) {
        if (i3 != -1) {
            this.mLastWidth = i3;
            setWidth(i3);
        }
        if (i4 != -1) {
            this.mLastHeight = i4;
            setHeight(i4);
        }
        if (!isShowing() || this.mContentView == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.mPopupView.getLayoutParams();
        int i5 = this.mWidthMode;
        if (i5 >= 0) {
            i5 = this.mLastWidth;
        }
        boolean z2 = true;
        if (i3 != -1 && layoutParams.width != i5) {
            this.mLastWidth = i5;
            layoutParams.width = i5;
            z = true;
        }
        int i6 = this.mHeightMode;
        if (i6 >= 0) {
            i6 = this.mLastHeight;
        }
        if (i4 != -1 && layoutParams.height != i6) {
            this.mLastHeight = i6;
            layoutParams.height = i6;
            z = true;
        }
        if (layoutParams.x != i) {
            layoutParams.x = i;
            z = true;
        }
        if (layoutParams.y != i2) {
            layoutParams.y = i2;
            z = true;
        }
        int iComputeAnimationResource = computeAnimationResource();
        if (iComputeAnimationResource != layoutParams.windowAnimations) {
            layoutParams.windowAnimations = iComputeAnimationResource;
            z = true;
        }
        int iComputeFlags = computeFlags(layoutParams.flags);
        if (iComputeFlags != layoutParams.flags) {
            layoutParams.flags = iComputeFlags;
        } else {
            z2 = z;
        }
        if (z2) {
            setLayoutDirectionFromAnchor();
            this.mWindowManager.updateViewLayout(this.mPopupView, layoutParams);
        }
    }

    public KeyboardPopupWindow() {
        this((View) null, 0, 0);
    }

    public KeyboardPopupWindow(View view) {
        this(view, 0, 0);
    }

    public KeyboardPopupWindow(int i, int i2) {
        this((View) null, i, i2);
    }

    public KeyboardPopupWindow(View view, int i, int i2) {
        this(view, i, i2, false);
    }

    public KeyboardPopupWindow(View view, int i, int i2, boolean z) {
        this.mInputMethodMode = 0;
        this.mSoftInputMode = 1;
        this.mTouchable = true;
        this.mOutsideTouchable = false;
        this.mClippingEnabled = true;
        this.mSplitTouchEnabled = -1;
        this.mAllowScrollingAnchorParent = true;
        this.mLayoutInsetDecor = false;
        this.mAttachedInDecor = true;
        this.mAttachedInDecorSet = false;
        this.mDrawingLocation = new int[2];
        this.mScreenLocation = new int[2];
        this.mTempRect = new Rect();
        this.mWindowLayoutType = 1000;
        this.mIgnoreCheekPress = false;
        this.mAnimationStyle = -1;
        this.mOnScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.heytap.nearx.uikit.widget.keyboard.KeyboardPopupWindow.1
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                View view2 = KeyboardPopupWindow.this.mAnchor != null ? (View) KeyboardPopupWindow.this.mAnchor.get() : null;
                if (view2 == null || KeyboardPopupWindow.this.mPopupView == null) {
                    return;
                }
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) KeyboardPopupWindow.this.mPopupView.getLayoutParams();
                KeyboardPopupWindow keyboardPopupWindow = KeyboardPopupWindow.this;
                keyboardPopupWindow.updateAboveAnchorOverride(keyboardPopupWindow.findDropDownPosition(view2, layoutParams, keyboardPopupWindow.mAnchorXoff, KeyboardPopupWindow.this.mAnchorYoff, KeyboardPopupWindow.this.mAnchoredGravity));
                KeyboardPopupWindow.this.update(layoutParams.x, layoutParams.y, -1, -1, true);
            }
        };
        this.mOnPreInvokePopupListener = null;
        if (view != null) {
            Context context = view.getContext();
            this.mContext = context;
            this.mWindowManager = (WindowManager) context.getSystemService("window");
        }
        setContentView(view);
        setWidth(i);
        setHeight(i2);
        setFocusable(z);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2) {
        update(view, false, 0, 0, true, i, i2, this.mAnchoredGravity);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        update(view, true, i, i2, true, i3, i4, this.mAnchoredGravity);
    }

    private void update(View view, boolean z, int i, int i2, boolean z2, int i3, int i4, int i5) {
        int i6 = i3;
        int i7 = i4;
        if (!isShowing() || this.mContentView == null) {
            return;
        }
        WeakReference<View> weakReference = this.mAnchor;
        boolean z3 = true;
        boolean z4 = z && !(this.mAnchorXoff == i && this.mAnchorYoff == i2);
        if (weakReference == null || weakReference.get() != view || (z4 && !this.mIsDropdown)) {
            registerForScrollChanged(view, i, i2, i5);
        } else if (z4) {
            this.mAnchorXoff = i;
            this.mAnchorYoff = i2;
            this.mAnchoredGravity = i5;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.mPopupView.getLayoutParams();
        if (z2) {
            if (i6 == -1) {
                i6 = this.mPopupWidth;
            } else {
                this.mPopupWidth = i6;
            }
            if (i7 == -1) {
                i7 = this.mPopupHeight;
            } else {
                this.mPopupHeight = i7;
            }
        }
        int i8 = i6;
        int i9 = i7;
        int i10 = layoutParams.x;
        int i11 = layoutParams.y;
        if (z) {
            updateAboveAnchorOverride(findDropDownPosition(view, layoutParams, i, i2, i5));
        } else {
            updateAboveAnchorOverride(findDropDownPosition(view, layoutParams, this.mAnchorXoff, this.mAnchorYoff, this.mAnchoredGravity));
        }
        int i12 = layoutParams.x;
        int i13 = layoutParams.y;
        if (i10 == i12 && i11 == i13) {
            z3 = false;
        }
        update(i12, i13, i8, i9, z3);
    }
}
