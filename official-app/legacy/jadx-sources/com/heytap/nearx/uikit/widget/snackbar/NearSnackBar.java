package com.heytap.nearx.uikit.widget.snackbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.R$styleable;
import com.oplus.aiunit.vision.fjc;
import com.oplus.aiunit.vision.nlc;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes18.dex */
public class NearSnackBar extends RelativeLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    private static final int ALPHA_ANIMATION_IN_DURATION = 250;
    private static final int ALPHA_ANIMATION_OUT_DURATION = 180;
    private static final String ALPHA_ANIMATION_TYPE = "alpha";
    private static final int CONTENT_ACTION_SAME_LINE_MARGIN_NUMBER = 3;
    private static final int DEFAULT_ANIMATION_IN_DURATION = 220;
    private static final int DEFAULT_ANIMATION_OUT_DURATION = 120;
    private static final String DEFAULT_ANIMATION_TYPE = "translationY";
    private static final int DEFAULT_TRANSLATION_END = 0;
    private static final String SCALE_X_ANIMATION_TYPE = "scaleX";
    private static final String SCALE_Y_ANIMATION_TYPE = "scaleY";
    private static final int SINGLE_LINE_NUMBER = 1;
    private static final String TAG = "NearSnackBar";
    private static int mNearSnackBarBottomMargin;
    private final int DEFAULT_ACTION_MARGIN_TOP_HORIZONTAL;
    private final int DEFAULT_ACTION_MARGIN_VERTICAL;
    private final int DEFAULT_ACTION_TEXT_MAX_WIDTH;
    private final int DEFAULT_CONTENT_MARGIN_HORIZONTAL;
    private final int DEFAULT_CONTENT_MARGIN_VERTICAL;
    private final int DEFAULT_CONTEXT_MARGIN_START_WITH_ICON;
    private final int DEFAULT_NEAR_SNACK_BAR_WIDTH;
    private final int DEFAULT_OFF_SCREEN_WIDTH_OFFSET;
    private TextView mActionView;
    private long mAnimationInDuration;
    private long mAnimationOutDuration;
    private Runnable mAutoDismissRunnable;
    private String mContentText;
    private int mContentTextMaxWidth;
    private int mContentTextWidth;
    private TextView mContentView;
    private int mDuration;
    private ImageView mIconDrawableView;
    private ViewGroup mNearSnackBarParent;
    private OnStatusChangeListener mOnStatusChangeListener;
    private View mRootView;
    private ViewGroup mSnackBarLayout;
    private static final Interpolator mDefaultAnimationOutInterpolator = PathInterpolatorCompat.create(0.3f, 0.0f, 1.0f, 1.0f);
    private static final Interpolator mDefaultAnimationInInterpolator = PathInterpolatorCompat.create(0.0f, 0.0f, 0.15f, 1.0f);
    private static final Interpolator mAlphaAnimationOutInterpolator = PathInterpolatorCompat.create(0.1f, 0.0f, 0.1f, 1.0f);
    private static final Interpolator mAlphaAnimationInInterpolator = PathInterpolatorCompat.create(0.1f, 0.0f, 0.1f, 1.0f);

    public class AutoDismissRunnable implements Runnable {
        private AutoDismissRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NearSnackBar.this.dismiss();
        }
    }

    public interface OnStatusChangeListener {
        void onDismissed(NearSnackBar nearSnackBar);

        void onShown(NearSnackBar nearSnackBar);
    }

    public NearSnackBar(Context context) {
        super(context);
        this.DEFAULT_NEAR_SNACK_BAR_WIDTH = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_width);
        this.DEFAULT_ACTION_TEXT_MAX_WIDTH = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_action_max_width);
        this.DEFAULT_CONTENT_MARGIN_VERTICAL = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_child_margin_vertical);
        this.DEFAULT_CONTENT_MARGIN_HORIZONTAL = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_child_margin_horizontal);
        this.DEFAULT_ACTION_MARGIN_VERTICAL = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_action_margin_vertical);
        this.DEFAULT_CONTEXT_MARGIN_START_WITH_ICON = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_context_margin_start_with_icon);
        this.DEFAULT_ACTION_MARGIN_TOP_HORIZONTAL = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_action_margin_top_horizontal);
        this.DEFAULT_OFF_SCREEN_WIDTH_OFFSET = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_off_screen_width_offset);
        this.mAnimationOutDuration = 180L;
        this.mAnimationInDuration = 250L;
        initNearSnackBar(context, null);
    }

    private void alignCenter(View view, int i) {
        if (view == null || getViewTotalHeight(view) == i) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        int measuredHeight = (i - view.getMeasuredHeight()) / 2;
        view.offsetTopAndBottom(measuredHeight - layoutParams.topMargin);
        layoutParams.topMargin = measuredHeight;
        layoutParams.bottomMargin = measuredHeight;
    }

    private void animationAlphaIn() {
        setVisibility(0);
        setTranslationY(0.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mRootView, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mRootView, "scaleX", 0.8f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.mRootView, "scaleY", 0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
        animatorSet.setDuration(this.mAnimationInDuration);
        animatorSet.setInterpolator(mAlphaAnimationInInterpolator);
        animatorSet.start();
        OnStatusChangeListener onStatusChangeListener = this.mOnStatusChangeListener;
        if (onStatusChangeListener != null) {
            onStatusChangeListener.onShown(this);
        }
    }

    private void animationAlphaOut() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mRootView, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.setInterpolator(mAlphaAnimationOutInterpolator);
        objectAnimatorOfFloat.setDuration(this.mAnimationOutDuration);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.snackbar.NearSnackBar.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                NearSnackBar.this.mRootView.setVisibility(8);
                if (NearSnackBar.this.mNearSnackBarParent != null) {
                    NearSnackBar.this.mNearSnackBarParent.removeView(NearSnackBar.this.mRootView);
                }
                if (NearSnackBar.this.mOnStatusChangeListener != null) {
                    NearSnackBar.this.mOnStatusChangeListener.onDismissed(NearSnackBar.this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        objectAnimatorOfFloat.start();
    }

    private void animationTranslationIn() {
        setVisibility(0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mRootView, "translationY", 0.0f);
        objectAnimatorOfFloat.setDuration(220L);
        objectAnimatorOfFloat.setInterpolator(mDefaultAnimationInInterpolator);
        objectAnimatorOfFloat.start();
        OnStatusChangeListener onStatusChangeListener = this.mOnStatusChangeListener;
        if (onStatusChangeListener != null) {
            onStatusChangeListener.onShown(this);
        }
    }

    private void animationTranslationOut() {
        View view = this.mRootView;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", view.getHeight() + mNearSnackBarBottomMargin);
        objectAnimatorOfFloat.setInterpolator(mDefaultAnimationOutInterpolator);
        objectAnimatorOfFloat.setDuration(120L);
        objectAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.snackbar.NearSnackBar.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                NearSnackBar.this.mRootView.setVisibility(8);
                if (NearSnackBar.this.mNearSnackBarParent != null) {
                    NearSnackBar.this.mNearSnackBarParent.removeView(NearSnackBar.this.mRootView);
                }
                if (NearSnackBar.this.mOnStatusChangeListener != null) {
                    NearSnackBar.this.mOnStatusChangeListener.onDismissed(NearSnackBar.this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        objectAnimatorOfFloat.start();
    }

    @Nullable
    private static ViewGroup findSuitableParent(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    private int getMaxWidth() {
        int measuredWidth;
        ViewGroup viewGroup = this.mNearSnackBarParent;
        if (viewGroup == null || (measuredWidth = viewGroup.getMeasuredWidth()) == 0) {
            return 0;
        }
        return measuredWidth + (this.DEFAULT_OFF_SCREEN_WIDTH_OFFSET * 2);
    }

    private int getViewTotalHeight(View view) {
        if (view == null) {
            return 0;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private void initNearSnackBar(Context context, AttributeSet attributeSet) {
        View viewInflate = View.inflate(context, R$layout.nx_snack_bar_item, this);
        this.mRootView = viewInflate;
        this.mSnackBarLayout = (ViewGroup) viewInflate.findViewById(R$id.snack_bar);
        this.mContentView = (TextView) this.mRootView.findViewById(R$id.tv_snack_bar_content);
        this.mActionView = (TextView) this.mRootView.findViewById(R$id.tv_snack_bar_action);
        this.mIconDrawableView = (ImageView) this.mRootView.findViewById(R$id.iv_snack_bar_icon);
        mNearSnackBarBottomMargin = new ViewGroup.MarginLayoutParams(context, attributeSet).bottomMargin;
        setVisibility(8);
        this.mAutoDismissRunnable = new AutoDismissRunnable();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearSnackBar, 0, 0);
        try {
            try {
                int i = R$styleable.NearSnackBar_nxDefaultSnackBarContentText;
                if (typedArrayObtainStyledAttributes.getString(i) != null) {
                    setContentText(typedArrayObtainStyledAttributes.getString(i));
                    setDuration(typedArrayObtainStyledAttributes.getInt(R$styleable.NearSnackBar_nxSnackBarDisappearTime, 0));
                }
                setIconDrawable(typedArrayObtainStyledAttributes.getDrawable(R$styleable.NearSnackBar_nxSnackBarIcon));
            } catch (Exception e2) {
                fjc.b(TAG, "Failure setting NearSnackBar " + e2.getMessage());
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private boolean isNearSnackBarHasIcon() {
        return this.mIconDrawableView.getDrawable() != null;
    }

    private boolean isVerticalDisplay() {
        if ((this.mContentTextWidth + this.mActionView.getMeasuredWidth()) + (isNearSnackBarHasIcon() ? (this.mIconDrawableView.getMeasuredWidth() + this.DEFAULT_CONTENT_MARGIN_HORIZONTAL) + (this.DEFAULT_CONTEXT_MARGIN_START_WITH_ICON * 2) : this.DEFAULT_CONTENT_MARGIN_HORIZONTAL * 3) > this.mSnackBarLayout.getMeasuredWidth() - (this.mSnackBarLayout.getPaddingLeft() + this.mSnackBarLayout.getPaddingRight())) {
            return true;
        }
        if (this.mContentView.getLineCount() > 1) {
            return true;
        }
        if (this.mContentTextWidth > this.mContentTextMaxWidth) {
            return true;
        }
        return this.mActionView.getMeasuredWidth() >= this.DEFAULT_ACTION_TEXT_MAX_WIDTH;
    }

    private void layoutHorizontally() {
        int viewTotalHeight = getViewTotalHeight(this.mContentView);
        int viewTotalHeight2 = getViewTotalHeight(this.mActionView);
        int iMax = Math.max(viewTotalHeight, viewTotalHeight2);
        if (!isNearSnackBarHasIcon()) {
            if (viewTotalHeight > viewTotalHeight2) {
                alignCenter(this.mActionView, viewTotalHeight);
                return;
            } else {
                alignCenter(this.mContentView, viewTotalHeight2);
                return;
            }
        }
        int viewTotalHeight3 = getViewTotalHeight(this.mIconDrawableView);
        int iMax2 = Math.max(viewTotalHeight3, iMax);
        if (iMax2 == viewTotalHeight3) {
            alignCenter(this.mContentView, viewTotalHeight3);
            alignCenter(this.mActionView, viewTotalHeight3);
        } else if (iMax2 == viewTotalHeight) {
            alignCenter(this.mIconDrawableView, viewTotalHeight);
            alignCenter(this.mActionView, viewTotalHeight);
        } else {
            alignCenter(this.mIconDrawableView, viewTotalHeight2);
            alignCenter(this.mActionView, viewTotalHeight2);
        }
    }

    private void layoutVertically() {
        if (isNearSnackBarHasIcon()) {
            ((RelativeLayout.LayoutParams) this.mIconDrawableView.getLayoutParams()).topMargin = ((this.mContentView.getMeasuredHeight() - this.mIconDrawableView.getMeasuredHeight()) / 2) + this.DEFAULT_CONTENT_MARGIN_VERTICAL;
        }
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mActionView.getLayoutParams();
        layoutParams.topMargin = this.DEFAULT_CONTENT_MARGIN_VERTICAL + this.mContentView.getMeasuredHeight() + this.DEFAULT_ACTION_MARGIN_TOP_HORIZONTAL;
        layoutParams.bottomMargin = this.DEFAULT_ACTION_MARGIN_VERTICAL;
        this.mActionView.setLayoutParams(layoutParams);
    }

    @NonNull
    public static NearSnackBar make(@NonNull View view, @NonNull String str, int i) {
        ViewGroup viewGroupFindSuitableParent = findSuitableParent(view);
        if (viewGroupFindSuitableParent != null) {
            return make(view, str, i, viewGroupFindSuitableParent.getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_margin_bottom));
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    private void setActionText(String str) {
        this.mActionView.setText(str);
    }

    private void setParent(ViewGroup viewGroup) {
        this.mNearSnackBarParent = viewGroup;
    }

    public void adjustLayout() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mContentView.getLayoutParams();
        layoutParams.setMarginStart(isNearSnackBarHasIcon() ? this.DEFAULT_CONTEXT_MARGIN_START_WITH_ICON : this.DEFAULT_CONTENT_MARGIN_HORIZONTAL);
        this.mContentView.setLayoutParams(layoutParams);
        if (isVerticalDisplay()) {
            layoutVertically();
        } else {
            layoutHorizontally();
        }
    }

    public void dismiss() {
        Runnable runnable = this.mAutoDismissRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        animationAlphaOut();
    }

    public String getActionText() {
        return String.valueOf(this.mActionView.getText());
    }

    public TextView getActionView() {
        return this.mActionView;
    }

    public String getContentText() {
        return String.valueOf(this.mContentView.getText());
    }

    public TextView getContentView() {
        return this.mContentView;
    }

    public int getDuration() {
        return this.mDuration;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mAutoDismissRunnable);
        this.mNearSnackBarParent = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        adjustLayout();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int maxWidth = getMaxWidth();
        if (maxWidth > 0 && mode != 0) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(maxWidth, size), mode);
        }
        super.onMeasure(i, i2);
        this.mContentTextWidth = (int) this.mContentView.getPaint().measureText(this.mContentText);
        this.mContentTextMaxWidth = (this.DEFAULT_NEAR_SNACK_BAR_WIDTH - (this.DEFAULT_CONTENT_MARGIN_HORIZONTAL * 3)) - this.mActionView.getMeasuredWidth();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010  */
    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        int action = motionEvent.getAction();
        if (action == 0) {
            runnable = this.mAutoDismissRunnable;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
        } else if (action == 1) {
            if (this.mAutoDismissRunnable != null && getDuration() != 0) {
                removeCallbacks(this.mAutoDismissRunnable);
                postDelayed(this.mAutoDismissRunnable, getDuration());
            }
        } else if (action == 2) {
            runnable = this.mAutoDismissRunnable;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
        } else if (action == 3) {
            if (this.mAutoDismissRunnable != null) {
                removeCallbacks(this.mAutoDismissRunnable);
                postDelayed(this.mAutoDismissRunnable, getDuration());
            }
        }
        return true;
    }

    public void setAnimationInDuration(long j2) {
        this.mAnimationInDuration = j2;
    }

    public void setAnimationOutDuration(long j2) {
        this.mAnimationOutDuration = j2;
    }

    public void setContentText(@StringRes int i) {
        setContentText(getResources().getString(i));
    }

    public void setDuration(@Nullable int i) {
        this.mDuration = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        Runnable runnable;
        super.setEnabled(z);
        this.mActionView.setEnabled(z);
        this.mContentView.setEnabled(z);
        this.mIconDrawableView.setEnabled(z);
        if (getDuration() == 0 || (runnable = this.mAutoDismissRunnable) == null) {
            return;
        }
        removeCallbacks(runnable);
        postDelayed(this.mAutoDismissRunnable, getDuration());
    }

    public void setIconDrawable(@DrawableRes int i) {
        setIconDrawable(AppCompatResources.getDrawable(getContext(), i));
    }

    public void setLines(int i) {
        TextView textView;
        if (i <= 0 || (textView = this.mContentView) == null) {
            return;
        }
        textView.setLines(1);
        this.mContentView.setEllipsize(TextUtils.TruncateAt.END);
    }

    public void setOnAction(@StringRes int i, @Nullable View.OnClickListener onClickListener) {
        setOnAction(getResources().getString(i), onClickListener);
    }

    public void setOnStatusChangeListener(OnStatusChangeListener onStatusChangeListener) {
        this.mOnStatusChangeListener = onStatusChangeListener;
    }

    public void show() {
        Runnable runnable;
        if (getDuration() != 0 && (runnable = this.mAutoDismissRunnable) != null) {
            removeCallbacks(runnable);
            postDelayed(this.mAutoDismissRunnable, getDuration());
        }
        animationAlphaIn();
    }

    public void setContentText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mContentView.setText(str);
            this.mContentText = str;
            return;
        }
        this.mContentView.setVisibility(8);
        Runnable runnable = this.mAutoDismissRunnable;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void setIconDrawable(Drawable drawable) {
        if (drawable == null) {
            this.mIconDrawableView.setVisibility(8);
        } else {
            this.mIconDrawableView.setVisibility(0);
            this.mIconDrawableView.setImageDrawable(drawable);
        }
    }

    public void setOnAction(String str, @Nullable final View.OnClickListener onClickListener) {
        if (TextUtils.isEmpty(str)) {
            this.mActionView.setVisibility(8);
            this.mActionView.setOnClickListener(null);
            Runnable runnable = this.mAutoDismissRunnable;
            if (runnable != null) {
                removeCallbacks(runnable);
                return;
            }
            return;
        }
        this.mActionView.setVisibility(0);
        setActionText(str);
        if (onClickListener != null) {
            nlc.a(this.mActionView);
            this.mActionView.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.snackbar.NearSnackBar.1
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view) {
                    onClickListener.onClick(view);
                    NearSnackBar nearSnackBar = NearSnackBar.this;
                    nearSnackBar.removeCallbacks(nearSnackBar.mAutoDismissRunnable);
                    NearSnackBar.this.dismiss();
                    SensorsDataAutoTrackHelper.trackViewOnClick(view);
                }
            });
        }
    }

    @NonNull
    public static NearSnackBar make(@NonNull View view, @NonNull String str, int i, int i2) {
        ViewGroup viewGroupFindSuitableParent = findSuitableParent(view);
        if (viewGroupFindSuitableParent != null) {
            NearSnackBar nearSnackBar = (NearSnackBar) LayoutInflater.from(viewGroupFindSuitableParent.getContext()).inflate(R$layout.nx_snack_bar_show_layout, viewGroupFindSuitableParent, false);
            nearSnackBar.setContentText(str);
            nearSnackBar.setDuration(i);
            nearSnackBar.setParent(viewGroupFindSuitableParent);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nearSnackBar.getLayoutParams();
            marginLayoutParams.bottomMargin = i2;
            mNearSnackBarBottomMargin = i2;
            nearSnackBar.setTranslationY(nearSnackBar.getHeight() + i2);
            boolean z = false;
            for (int i3 = 0; i3 < viewGroupFindSuitableParent.getChildCount(); i3++) {
                if (viewGroupFindSuitableParent.getChildAt(i3) instanceof NearSnackBar) {
                    z = viewGroupFindSuitableParent.getChildAt(i3).getVisibility() != 8;
                }
            }
            if (!z) {
                viewGroupFindSuitableParent.addView(nearSnackBar, marginLayoutParams);
            }
            return nearSnackBar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public NearSnackBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.DEFAULT_NEAR_SNACK_BAR_WIDTH = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_width);
        this.DEFAULT_ACTION_TEXT_MAX_WIDTH = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_action_max_width);
        this.DEFAULT_CONTENT_MARGIN_VERTICAL = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_child_margin_vertical);
        this.DEFAULT_CONTENT_MARGIN_HORIZONTAL = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_child_margin_horizontal);
        this.DEFAULT_ACTION_MARGIN_VERTICAL = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_action_margin_vertical);
        this.DEFAULT_CONTEXT_MARGIN_START_WITH_ICON = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_context_margin_start_with_icon);
        this.DEFAULT_ACTION_MARGIN_TOP_HORIZONTAL = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_action_margin_top_horizontal);
        this.DEFAULT_OFF_SCREEN_WIDTH_OFFSET = getResources().getDimensionPixelSize(R$dimen.nx_snack_bar_off_screen_width_offset);
        this.mAnimationOutDuration = 180L;
        this.mAnimationInDuration = 250L;
        initNearSnackBar(context, attributeSet);
    }
}
