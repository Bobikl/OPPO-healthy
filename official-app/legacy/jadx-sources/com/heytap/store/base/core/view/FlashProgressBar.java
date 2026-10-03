package com.heytap.store.base.core.view;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.Display;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import com.heytap.store.base.core.R;
import com.oplus.aiunit.vision.vhc;

/* JADX INFO: loaded from: classes3.dex */
public class FlashProgressBar extends ProgressBar {
    private static final int ANIMATION_DURATION = 800;
    private static final int DURATION = 200;
    private static final int DURATION_MESSAGE = 500;
    private static final int PROGRESS_ANIM_DURATION = 1000;
    private ValueAnimator mAnimator;
    private Context mContext;
    private Display mDisplay;
    private Bitmap mFlashLineBitmap;
    private Handler mHandler;
    private boolean mHasStart;
    private boolean mIsAnimating;
    private float mLeftRegion;
    private Paint mPaint;
    private ValueAnimator mProgressAnimator;
    private int mScreenWidth;
    private int mTempProgress;

    public abstract class SimpleAnimatorListener implements Animator.AnimatorListener {
        private SimpleAnimatorListener() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public abstract void onAnimationEnd(Animator animator);

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public abstract void onAnimationStart(Animator animator);
    }

    public FlashProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getScreentWidth() {
        if (this.mScreenWidth == 0) {
            this.mScreenWidth = getContext().getResources().getDisplayMetrics().widthPixels;
        }
        return this.mScreenWidth;
    }

    private void setUpAnimator() {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.mProgressAnimator = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.store.base.core.view.FlashProgressBar.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                FlashProgressBar.super.setProgress(((Integer) valueAnimator2.getAnimatedValue()).intValue());
            }
        });
        this.mProgressAnimator.addListener(new SimpleAnimatorListener() { // from class: com.heytap.store.base.core.view.FlashProgressBar.5
            @Override // com.heytap.store.base.core.view.FlashProgressBar.SimpleAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                FlashProgressBar.this.mIsAnimating = false;
                if (FlashProgressBar.this.mTempProgress > FlashProgressBar.this.getProgress()) {
                    FlashProgressBar.this.mProgressAnimator.start();
                }
            }

            @Override // com.heytap.store.base.core.view.FlashProgressBar.SimpleAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                FlashProgressBar.this.mIsAnimating = true;
            }
        });
        this.mProgressAnimator.setEvaluator(new IntEvaluator());
        this.mProgressAnimator.setInterpolator(new LinearInterpolator());
        this.mProgressAnimator.setDuration(1000L);
    }

    public void cancelAnimation() {
        if (this.mIsAnimating) {
            ValueAnimator valueAnimator = this.mProgressAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.mIsAnimating = false;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.mProgressAnimator;
        if (valueAnimator != null) {
            valueAnimator.addListener(null);
            this.mProgressAnimator.cancel();
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getProgress() == getMax() || !this.mHasStart || this.mLeftRegion > (getProgress() * getWidth()) / getMax()) {
            return;
        }
        canvas.drawBitmap(this.mFlashLineBitmap, this.mLeftRegion, 0.0f, this.mPaint);
    }

    @Override // android.widget.ProgressBar
    public void setMax(int i) {
        if (this.mIsAnimating) {
            return;
        }
        super.setMax(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgress(int i) {
        if (this.mIsAnimating) {
            return;
        }
        super.setProgress(i);
        startAnimation();
        invalidate();
    }

    public void startAnimation() {
        if (getProgress() == getMax()) {
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.heytap.store.base.core.view.FlashProgressBar.2
                    @Override // java.lang.Runnable
                    public void run() {
                        FlashProgressBar.this.setVisibility(8);
                    }
                }, 500L);
            }
            this.mAnimator.cancel();
        }
        if (this.mAnimator == null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, getScreentWidth());
            this.mAnimator = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(800L);
            this.mAnimator.setInterpolator(new LinearInterpolator());
            this.mAnimator.setStartDelay(200L);
            this.mAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.store.base.core.view.FlashProgressBar.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    FlashProgressBar.this.mLeftRegion = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    FlashProgressBar.this.mHasStart = true;
                    FlashProgressBar.this.invalidate();
                }
            });
        }
        if (this.mLeftRegion == getScreentWidth() || (this.mLeftRegion == 0.0f && !this.mHasStart)) {
            this.mAnimator.start();
        }
    }

    public FlashProgressBar(Context context) {
        this(context, null, 0);
    }

    public FlashProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.mIsAnimating = false;
        this.mHasStart = false;
        vhc.b(this, false);
        this.mFlashLineBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.line);
        this.mPaint = new Paint();
        this.mContext = context;
        Handler handler = new Handler() { // from class: com.heytap.store.base.core.view.FlashProgressBar.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                FlashProgressBar.this.startAnimation();
                if (FlashProgressBar.this.getProgress() != FlashProgressBar.this.getMax()) {
                    FlashProgressBar.this.mHandler.sendMessageDelayed(new Message(), 500L);
                }
            }
        };
        this.mHandler = handler;
        handler.sendMessageDelayed(new Message(), 200L);
    }
}
