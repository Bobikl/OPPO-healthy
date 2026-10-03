package com.heytap.nearx.uikit.widget.cardlist;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.widget.preference.NearListSelectedItemLayout;
import com.heytap.nearx.uikit.widget.shape.NearShapePath;
import com.oplus.aiunit.vision.thc;

/* JADX INFO: loaded from: classes18.dex */
public class NearCardListSelectedItemLayout extends NearListSelectedItemLayout {
    private final int HEAD_OR_TAIL_PADDING;
    private boolean mBottomRounded;
    private int mInitPaddingBottom;
    private int mInitPaddingTop;
    private boolean mIsSelected;
    private int mMinimumHeight;
    private Path mPath;
    private float mRadius;
    private boolean mTopRounded;
    private int margin;

    public NearCardListSelectedItemLayout(Context context) {
        this(context, null);
    }

    private void init(Context context) {
        this.mRadius = context.getResources().getDimensionPixelOffset(R$dimen.nx_preference_card_radius);
        this.margin = context.getResources().getDimensionPixelOffset(R$dimen.nx_preference_card_margin_horizontal);
        this.mMinimumHeight = getMinimumHeight();
        this.mInitPaddingTop = getPaddingTop();
        this.mInitPaddingBottom = getPaddingBottom();
        this.mPath = new Path();
    }

    private void setCardRadiusStyle(int i) {
        if (i == 4) {
            this.mTopRounded = true;
            this.mBottomRounded = true;
        } else if (i == 1) {
            this.mTopRounded = true;
            this.mBottomRounded = false;
        } else if (i == 3) {
            this.mTopRounded = false;
            this.mBottomRounded = true;
        } else {
            this.mTopRounded = false;
            this.mBottomRounded = false;
        }
    }

    private void setPadding(int i) {
        int i2;
        int i3 = 0;
        if (i == 1) {
            i3 = this.HEAD_OR_TAIL_PADDING;
            i2 = 0;
        } else if (i == 3) {
            i2 = this.HEAD_OR_TAIL_PADDING;
        } else {
            i3 = i == 4 ? this.HEAD_OR_TAIL_PADDING : 0;
            i2 = i3;
        }
        setMinimumHeight(this.mMinimumHeight + i3 + i2);
        setPadding(getPaddingStart(), this.mInitPaddingTop + i3, getPaddingEnd(), this.mInitPaddingBottom + i2);
    }

    private void updatePath() {
        this.mPath.reset();
        RectF rectF = new RectF(this.margin, 0.0f, getWidth() - this.margin, getHeight());
        Path path = this.mPath;
        float f = this.mRadius;
        boolean z = this.mTopRounded;
        boolean z2 = this.mBottomRounded;
        this.mPath = NearShapePath.getRoundRectPath(path, rectF, f, z, z, z2, z2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.mPath);
        super.draw(canvas);
        canvas.restore();
    }

    public boolean getIsSelected() {
        return this.mIsSelected;
    }

    @Override // com.heytap.nearx.uikit.widget.preference.NearListSelectedItemLayout
    public void initAnimation(Context context) {
        int iA = thc.a(context, R$attr.nxColorCardBackground);
        int iA2 = thc.a(context, R$attr.nxColorCardPressed);
        if (this.mIsSelected) {
            setBackgroundColor(iA2);
        } else {
            setBackgroundColor(iA);
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "backgroundColor", iA, iA2);
        this.mBackgroundAppearAnimator = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(150L);
        this.mBackgroundAppearAnimator.setInterpolator(this.mAppearInterpolator);
        this.mBackgroundAppearAnimator.setEvaluator(new ArgbEvaluator());
        this.mBackgroundAppearAnimator.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.cardlist.NearCardListSelectedItemLayout.1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ((NearListSelectedItemLayout) NearCardListSelectedItemLayout.this).mState = 1;
                if (((NearListSelectedItemLayout) NearCardListSelectedItemLayout.this).mNeedAutoStartDisAppear) {
                    ((NearListSelectedItemLayout) NearCardListSelectedItemLayout.this).mNeedAutoStartDisAppear = false;
                    if (NearCardListSelectedItemLayout.this.mIsSelected) {
                        return;
                    }
                    ((NearListSelectedItemLayout) NearCardListSelectedItemLayout.this).mBackgroundDisappearAnimator.start();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(this, "backgroundColor", iA2, iA);
        this.mBackgroundDisappearAnimator = objectAnimatorOfInt2;
        objectAnimatorOfInt2.setDuration(367L);
        this.mBackgroundDisappearAnimator.setInterpolator(this.mDisappearInterpolator);
        this.mBackgroundDisappearAnimator.setEvaluator(new ArgbEvaluator());
        this.mBackgroundDisappearAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.heytap.nearx.uikit.widget.cardlist.NearCardListSelectedItemLayout.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (NearCardListSelectedItemLayout.this.mIsSelected) {
                    ((NearListSelectedItemLayout) NearCardListSelectedItemLayout.this).mBackgroundDisappearAnimator.cancel();
                }
            }
        });
        this.mBackgroundDisappearAnimator.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.cardlist.NearCardListSelectedItemLayout.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ((NearListSelectedItemLayout) NearCardListSelectedItemLayout.this).mState = 2;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        updatePath();
    }

    public void setIsSelected(boolean z) {
        if (this.mIsSelected != z) {
            this.mIsSelected = z;
            if (!z) {
                setBackgroundColor(thc.a(getContext(), R$attr.nxColorCardBackground));
                return;
            }
            ValueAnimator valueAnimator = this.mBackgroundAppearAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                setBackgroundColor(thc.a(getContext(), R$attr.nxColorCardPressed));
            }
        }
    }

    public void setPositionInGroup(int i) {
        setPadding(i);
        setCardRadiusStyle(i);
        updatePath();
    }

    @Override // com.heytap.nearx.uikit.widget.preference.NearListSelectedItemLayout
    public void startAppearAnimation() {
        if (this.mIsSelected) {
            return;
        }
        super.startAppearAnimation();
    }

    public NearCardListSelectedItemLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NearCardListSelectedItemLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NearCardListSelectedItemLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mTopRounded = true;
        this.mBottomRounded = true;
        this.HEAD_OR_TAIL_PADDING = getResources().getDimensionPixelOffset(R$dimen.nx_list_card_head_or_tail_padding);
        setForceDarkAllowed(false);
        init(getContext());
    }
}
