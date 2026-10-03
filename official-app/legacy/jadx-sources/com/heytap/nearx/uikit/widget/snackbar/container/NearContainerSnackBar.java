package com.heytap.nearx.uikit.widget.snackbar.container;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.heytap.nearx.uikit.widget.pressfeedback.NearPressFeedbackHelper;

/* JADX INFO: loaded from: classes18.dex */
public class NearContainerSnackBar extends FrameLayout implements NearSnackBarInterface {
    private static final String TAG = "COUIContainerSnackBar";
    private long autoDismissTime;
    private View customView;
    private AnimatorSet dismissAnimSet;
    private final Runnable dismissRunnable;
    private int height;
    private final NearPressFeedbackHelper helper;
    private boolean isAutoDismiss;
    private boolean isCloseAfterSlide;
    private boolean isDismissWithAnim;
    private boolean isPressFeedBack;
    private boolean isShowWithAnim;
    private boolean isTouchSlidable;
    private ViewGroup mCOUISnackBarParent;
    private NearSnackBarInterface.OnDismissAnimListener mOnDismissAnimListener;
    private NearSnackBarInterface.OnDismissListener mOnDismissListener;
    private NearSnackBarInterface.OnShowAnimListener mOnShowAnimListener;
    private NearSnackBarInterface.OnShowListener mOnShowListener;
    private View mRootView;
    private float mTouchStartY;
    private int originBottom;
    private int originTop;
    private AnimatorSet showAnimSet;
    private int width;

    public NearContainerSnackBar(Context context) {
        super(context);
        this.isDismissWithAnim = true;
        this.isShowWithAnim = true;
        this.isAutoDismiss = false;
        this.autoDismissTime = 2000L;
        this.isPressFeedBack = true;
        this.isTouchSlidable = false;
        this.mTouchStartY = 0.0f;
        this.isCloseAfterSlide = false;
        this.helper = new NearPressFeedbackHelper(this, 0);
        this.dismissRunnable = new Runnable() { // from class: com.oplus.aiunit.vision.lhc
            @Override // java.lang.Runnable
            public final void run() {
                this.i.dismiss();
            }
        };
        setForceDarkAllowed(false);
    }

    private void animationAlphaIn() {
        setVisibility(0);
        if (this.showAnimSet == null) {
            this.showAnimSet = NearContainerSnackAnimUtil.createDefNormalShowAnim(this);
        }
        this.showAnimSet.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.snackbar.container.NearContainerSnackBar.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (NearContainerSnackBar.this.mOnShowAnimListener != null) {
                    NearContainerSnackBar.this.mOnShowAnimListener.onAnimEnd(NearContainerSnackBar.this, animator);
                }
                NearContainerSnackBar.this.startCount();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (NearContainerSnackBar.this.mOnShowAnimListener != null) {
                    NearContainerSnackBar.this.mOnShowAnimListener.onAnimStart(NearContainerSnackBar.this, animator);
                }
            }
        });
        this.showAnimSet.start();
    }

    private void animationAlphaOut() {
        if (this.dismissAnimSet == null) {
            this.dismissAnimSet = NearContainerSnackAnimUtil.createDefNormalDismissAnim(this);
        }
        this.dismissAnimSet.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.snackbar.container.NearContainerSnackBar.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (NearContainerSnackBar.this.mOnDismissAnimListener != null) {
                    NearContainerSnackBar.this.mOnDismissAnimListener.onAnimEnd(NearContainerSnackBar.this, animator);
                }
                NearContainerSnackBar.this.setVisibility(8);
                if (NearContainerSnackBar.this.mCOUISnackBarParent != null) {
                    NearContainerSnackBar.this.mCOUISnackBarParent.removeView(NearContainerSnackBar.this);
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                if (NearContainerSnackBar.this.mOnDismissAnimListener != null) {
                    NearContainerSnackBar.this.mOnDismissAnimListener.onAnimStart(NearContainerSnackBar.this, animator);
                }
            }
        });
        this.dismissAnimSet.start();
    }

    @Override // com.heytap.nearx.uikit.widget.snackbar.container.NearSnackBarInterface
    public void dismiss() {
        if (this.isDismissWithAnim) {
            animationAlphaOut();
        } else {
            this.mRootView.setVisibility(8);
            ViewGroup viewGroup = this.mCOUISnackBarParent;
            if (viewGroup != null) {
                viewGroup.removeView(this);
            }
        }
        NearSnackBarInterface.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        startCount();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.originTop = getTop();
            this.originBottom = getBottom();
            this.mTouchStartY = motionEvent.getY();
            if (isPressFeedBack()) {
                this.helper.executeFeedbackAnimator(true);
            }
        } else if (action == 1) {
            if (isPressFeedBack()) {
                this.helper.executeFeedbackAnimator(false);
            }
            if (this.isCloseAfterSlide) {
                dismiss();
            }
        } else if (action != 2) {
            if (action == 3) {
                if (isPressFeedBack()) {
                    this.helper.executeFeedbackAnimator(false);
                }
                if (this.isCloseAfterSlide) {
                    dismiss();
                }
            }
        } else if (this.isTouchSlidable) {
            float y = motionEvent.getY() - this.mTouchStartY;
            int top = (int) (getTop() + y);
            int bottom = (int) (getBottom() + y);
            if (top < this.originTop || bottom < this.originBottom) {
                layout(getLeft(), this.originTop, getRight(), this.originBottom);
                this.isCloseAfterSlide = false;
            } else {
                layout(getLeft(), top, getRight(), bottom);
                this.isCloseAfterSlide = true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public long getAutoDismissTime() {
        return this.autoDismissTime;
    }

    @Override // com.heytap.nearx.uikit.widget.snackbar.container.NearSnackBarInterface
    public View getCustomView() {
        return this.mRootView;
    }

    public AnimatorSet getDismissAnimSet() {
        return this.dismissAnimSet;
    }

    public AnimatorSet getShowAnimSet() {
        return this.showAnimSet;
    }

    public void initView() {
        View view = this.customView;
        if (view != null) {
            this.mRootView = view;
        } else {
            this.mRootView = new View(getContext());
        }
        if (this.mRootView.getLayoutParams() != null) {
            addView(this.mRootView);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.width, this.height);
        layoutParams.gravity = 17;
        addView(this.mRootView, layoutParams);
    }

    public boolean isAutoDismiss() {
        return this.isAutoDismiss;
    }

    public boolean isDismissWithAnim() {
        return this.isDismissWithAnim;
    }

    public boolean isPressFeedBack() {
        return this.isPressFeedBack;
    }

    public boolean isShowWithAnim() {
        return this.isShowWithAnim;
    }

    public boolean isTouchSlidable() {
        return this.isTouchSlidable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mCOUISnackBarParent = null;
        removeCallbacks(this.dismissRunnable);
    }

    public void setAutoDismiss(boolean z) {
        this.isAutoDismiss = z;
    }

    public void setAutoDismissTime(long j2) {
        this.autoDismissTime = j2;
    }

    public void setDismissAnimSet(AnimatorSet animatorSet) {
        this.dismissAnimSet = animatorSet;
    }

    public void setDismissWithAnim(boolean z) {
        this.isDismissWithAnim = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setOnDismissAnimListener(NearSnackBarInterface.OnDismissAnimListener onDismissAnimListener) {
        this.mOnDismissAnimListener = onDismissAnimListener;
    }

    public void setOnDismissListener(NearSnackBarInterface.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setOnShowAnimListener(NearSnackBarInterface.OnShowAnimListener onShowAnimListener) {
        this.mOnShowAnimListener = onShowAnimListener;
    }

    public void setOnShowListener(NearSnackBarInterface.OnShowListener onShowListener) {
        this.mOnShowListener = onShowListener;
    }

    public void setParent(ViewGroup viewGroup) {
        this.mCOUISnackBarParent = viewGroup;
    }

    public void setPressFeedBack(boolean z) {
        this.isPressFeedBack = z;
    }

    public void setShowAnimSet(AnimatorSet animatorSet) {
        this.showAnimSet = animatorSet;
    }

    public void setShowWithAnim(boolean z) {
        this.isShowWithAnim = z;
    }

    public void setTouchSlidable(boolean z) {
        this.isTouchSlidable = z;
    }

    public void setView(View view) {
        this.customView = view;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    @Override // com.heytap.nearx.uikit.widget.snackbar.container.NearSnackBarInterface
    public void show() {
        if (this.isShowWithAnim) {
            animationAlphaIn();
        } else {
            setVisibility(0);
            startCount();
        }
        NearSnackBarInterface.OnShowListener onShowListener = this.mOnShowListener;
        if (onShowListener != null) {
            onShowListener.onShow(this);
        }
    }

    public void startCount() {
        removeCallbacks(this.dismissRunnable);
        if (isAutoDismiss()) {
            postDelayed(this.dismissRunnable, getAutoDismissTime());
        }
    }
}
