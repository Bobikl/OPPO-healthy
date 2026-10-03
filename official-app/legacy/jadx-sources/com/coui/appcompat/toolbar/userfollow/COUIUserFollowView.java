package com.coui.appcompat.toolbar.userfollow;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.motion.widget.TransitionBuilder;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import com.coui.appcompat.button.COUIButton;
import com.coui.appcompat.imageview.COUIRoundImageView;
import com.oplus.aiunit.vision.lh2;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import com.support.appcompat.R$attr;
import com.support.nearx.R$color;

/* JADX INFO: loaded from: classes13.dex */
public class COUIUserFollowView extends MotionLayout implements IUserFollowView, MotionLayout.TransitionListener {
    public static final int BTN_FOLLOWED = 1;
    public static final String DEF_FOLLOWED_TEXT = "已关注";
    public static final String DEF_FOLLOW_TEXT = "关注";
    public static final int STATE_MUSK = 7;
    public static final int SUB_TEXT_SHOW = 2;
    private static final String TAG = "COUIUserFollowView";
    public static final int TEXT_FILL = 4;
    private COUIButton mButton;
    private int mCurState;
    private int mDuration;
    private final ConstraintSet mEnd;
    private int mEndID;
    private COUIRoundImageView mImageView;
    private final Runnable mInitSceneRunnable;
    private boolean mIsAutoAnimationEnable;
    private boolean mIsFill;
    private boolean mIsFollowing;
    private boolean mIsSubTextEnable;
    private IUserFollowView.OnStateChangeListener mOnStateChangeListener;
    private MotionScene mScene;
    private final ConstraintSet mStart;
    private int mStartID;
    private TextView mSubTitle;
    private int mTargetState;
    private TextView mTitle;
    private MotionLayout.TransitionListener mTransitionListener;
    public static final int IMAGE_VIEW_ID = View.generateViewId();
    public static final int TEXT_VIEW_ID = View.generateViewId();
    public static final int SUB_TEXT_VIEW_ID = View.generateViewId();
    public static final int BTN_VIEW_ID = View.generateViewId();
    public static final int BARRIER_VIEW_ID = View.generateViewId();

    public COUIUserFollowView(@NonNull Context context) {
        this(context, null);
    }

    private static int dp2px(Context context, float f) {
        return Math.round(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    private void generateBarrier() {
        Barrier barrier = new Barrier(getContext());
        barrier.setId(BARRIER_VIEW_ID);
        barrier.setType(6);
        barrier.setReferencedIds(new int[]{TEXT_VIEW_ID, SUB_TEXT_VIEW_ID});
        addView(barrier);
    }

    private void generateBtn() {
        COUIButton cOUIButton = new COUIButton(getContext(), null, R$attr.couiSmallButtonColorStyle);
        this.mButton = cOUIButton;
        cOUIButton.setId(BTN_VIEW_ID);
        this.mButton.setMaxLines(1);
        this.mButton.setGravity(17);
        this.mButton.setPadding(0, 0, 0, 0);
        this.mButton.setText("关注");
        this.mButton.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.ym2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$generateBtn$0(view);
            }
        });
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(dp2px(getContext(), 52.0f), dp2px(getContext(), 28.0f));
        layoutParams.startToEnd = BARRIER_VIEW_ID;
        layoutParams.endToEnd = 0;
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.horizontalBias = 0.0f;
        layoutParams.setMarginEnd(dp2px(getContext(), 8.0f));
        addView(this.mButton, layoutParams);
    }

    private void generateImage() {
        COUIRoundImageView cOUIRoundImageView = new COUIRoundImageView(getContext());
        this.mImageView = cOUIRoundImageView;
        cOUIRoundImageView.setId(IMAGE_VIEW_ID);
        this.mImageView.setHasBorder(true);
        this.mImageView.setOutCircleColor(ContextCompat.getColor(getContext(), R$color.coui_userfollow_default_image_stroke_bg));
        this.mImageView.setImageDrawable(new ColorDrawable(getContext().getColor(R$color.coui_userfollow_default_image_bg)));
        int iDp2px = dp2px(getContext(), 24.0f);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iDp2px, iDp2px);
        layoutParams.startToStart = 0;
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.setMarginStart(dp2px(getContext(), 8.0f));
        layoutParams.horizontalBias = 0.0f;
        layoutParams.horizontalChainStyle = 2;
        addView(this.mImageView, layoutParams);
    }

    private void generateSubText() {
        TextView textView = new TextView(getContext(), null, com.support.toolbar.R$attr.supportSubtitleTextAppearance);
        this.mSubTitle = textView;
        textView.setId(SUB_TEXT_VIEW_ID);
        this.mSubTitle.setEllipsize(TextUtils.TruncateAt.END);
        this.mSubTitle.setMaxLines(1);
        this.mSubTitle.setText("");
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.startToStart = TEXT_VIEW_ID;
        layoutParams.endToStart = BTN_VIEW_ID;
        layoutParams.topToBottom = 0;
        layoutParams.constrainedWidth = true;
        layoutParams.horizontalBias = 0.0f;
        layoutParams.setMarginEnd(dp2px(getContext(), 8.0f));
        addView(this.mSubTitle, layoutParams);
    }

    private void generateText() {
        TextView textView = new TextView(getContext(), null, com.support.toolbar.R$attr.supportTitleTextAppearance);
        this.mTitle = textView;
        textView.setId(TEXT_VIEW_ID);
        this.mTitle.setEllipsize(TextUtils.TruncateAt.END);
        this.mTitle.setMaxLines(1);
        this.mTitle.setText("用户名");
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.topToTop = 0;
        layoutParams.bottomToTop = SUB_TEXT_VIEW_ID;
        layoutParams.endToStart = BTN_VIEW_ID;
        layoutParams.startToEnd = IMAGE_VIEW_ID;
        layoutParams.constrainedWidth = true;
        layoutParams.horizontalBias = 0.0f;
        layoutParams.horizontalChainStyle = 2;
        layoutParams.setMarginStart(dp2px(getContext(), 8.0f));
        layoutParams.setMarginEnd(dp2px(getContext(), 8.0f));
        addView(this.mTitle, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$generateBtn$0(View view) {
        setFollowing(!isFollowing());
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    private void setConstraintState(int i, int i2) {
        ConstraintSet constraintSet = getConstraintSet(this.mEndID);
        if (constraintSet == null) {
            Log.w(TAG, "setConstraintState: end is null!");
            return;
        }
        setupSubText(constraintSet, (i2 & 2) == 2);
        setupText(constraintSet, (i2 & 4) == 4);
        setupBtn(constraintSet, (i2 & 1) == 1);
        setTransition(this.mStartID, this.mEndID);
    }

    public MotionScene generateScene() {
        if (this.mScene == null) {
            this.mScene = new MotionScene(this);
        }
        return this.mScene;
    }

    public COUIButton getButton() {
        return this.mButton;
    }

    public int getCurState() {
        return this.mCurState;
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public COUIRoundImageView getImage() {
        return this.mImageView;
    }

    public COUIRoundImageView getImageView() {
        return this.mImageView;
    }

    public TextView getSubTitle() {
        return this.mSubTitle;
    }

    public int getTargetState() {
        return this.mTargetState;
    }

    public TextView getTitle() {
        return this.mTitle;
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public boolean isAutoAnimate() {
        return this.mIsAutoAnimationEnable;
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public boolean isFill() {
        return this.mIsFill;
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public boolean isFollowing() {
        return this.mIsFollowing;
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public boolean isSubFollowTitleEnable() {
        return this.mIsSubTextEnable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mInitSceneRunnable);
        super.onDetachedFromWindow();
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f) {
        MotionLayout.TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionChange(motionLayout, i, i2, f);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionCompleted(MotionLayout motionLayout, int i) {
        setCurState(this.mTargetState & 7);
        int i2 = this.mEndID;
        this.mEndID = this.mStartID;
        this.mStartID = i2;
        MotionLayout.TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionCompleted(motionLayout, i);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionStarted(MotionLayout motionLayout, int i, int i2) {
        MotionLayout.TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionStarted(motionLayout, i, i2);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
    public void onTransitionTrigger(MotionLayout motionLayout, int i, boolean z, float f) {
        MotionLayout.TransitionListener transitionListener = this.mTransitionListener;
        if (transitionListener != null) {
            transitionListener.onTransitionTrigger(motionLayout, i, z, f);
        }
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void release() {
        COUIRoundImageView cOUIRoundImageView = this.mImageView;
        if (cOUIRoundImageView == null || !(cOUIRoundImageView.getDrawable() instanceof BitmapDrawable)) {
            return;
        }
        ((BitmapDrawable) this.mImageView.getDrawable()).getBitmap().recycle();
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setAnimate(boolean z) {
        this.mIsAutoAnimationEnable = z;
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setBtnBg(Drawable drawable) {
        this.mButton.setBackground(drawable);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setBtnText(CharSequence charSequence) {
        this.mButton.setText(charSequence);
    }

    public void setCurState(int i) {
        this.mCurState = i;
    }

    public void setDuration(int i) {
        this.mDuration = i;
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setFill(boolean z) {
        if (this.mIsFill == z) {
            return;
        }
        this.mIsFill = z;
        if (z) {
            setTargetState(getTargetState() | 4);
        } else {
            setTargetState(getTargetState() & (-5));
        }
        if (isAutoAnimate() && isAttachedToWindow()) {
            startAnimation();
        } else {
            if (isAttachedToWindow()) {
                return;
            }
            setCurState(getTargetState() & 7);
            this.mEnd.clone(this);
            setupText(this.mEnd, this.mIsFill);
            this.mEnd.applyTo(this);
        }
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setFollowTitle(CharSequence charSequence) {
        this.mTitle.setText(charSequence);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setFollowTitleColor(int i) {
        this.mTitle.setTextColor(i);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setFollowTitleTextSize(float f, int i) {
        this.mTitle.setTextSize(i, f);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setFollowing(boolean z) {
        if (this.mIsFollowing == z) {
            return;
        }
        this.mIsFollowing = z;
        if (z) {
            setTargetState(getTargetState() | 1);
        } else {
            setTargetState(getTargetState() & (-2));
        }
        IUserFollowView.OnStateChangeListener onStateChangeListener = this.mOnStateChangeListener;
        if (onStateChangeListener != null) {
            onStateChangeListener.onStateChanged(this, isFollowing());
        }
        if (isAutoAnimate() && isAttachedToWindow()) {
            startAnimation();
        } else {
            if (isAttachedToWindow()) {
                return;
            }
            setCurState(getTargetState() & 7);
            this.mEnd.clone(this);
            setupBtn(this.mEnd, this.mIsFollowing);
            this.mEnd.applyTo(this);
        }
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setImage(Drawable drawable) {
        this.mImageView.setImageDrawable(drawable);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setOnStateChangeListener(IUserFollowView.OnStateChangeListener onStateChangeListener) {
        this.mOnStateChangeListener = onStateChangeListener;
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setSubFollowTitle(CharSequence charSequence) {
        this.mSubTitle.setText(charSequence);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setSubFollowTitleColor(int i) {
        this.mSubTitle.setTextColor(i);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setSubFollowTitleEnable(boolean z) {
        this.mIsSubTextEnable = z;
        if (z) {
            setTargetState(getTargetState() | 2);
        } else {
            setTargetState(getTargetState() & (-3));
        }
        if (isAutoAnimate() && isAttachedToWindow()) {
            startAnimation();
        } else {
            if (isAttachedToWindow()) {
                return;
            }
            setCurState(getTargetState() & 7);
            this.mEnd.clone(this);
            setupSubText(this.mEnd, this.mIsSubTextEnable);
            this.mEnd.applyTo(this);
        }
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setSubFollowTitleTextSize(float f, int i) {
        this.mSubTitle.setTextSize(i, f);
    }

    public void setTargetState(int i) {
        this.mTargetState = i;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout
    public void setTransitionListener(MotionLayout.TransitionListener transitionListener) {
        this.mTransitionListener = transitionListener;
    }

    public void setupBtn(ConstraintSet constraintSet, boolean z) {
        if (this.mButton == null) {
            return;
        }
        if (z) {
            int i = BTN_VIEW_ID;
            constraintSet.setFloatValue(i, "TextSize", 12.0f);
            constraintSet.setStringValue(i, "Text", "已关注");
            constraintSet.setColorValue(i, "TextColor", lh2.a(getContext(), R$attr.couiColorOnSecondary));
            constraintSet.setColorValue(i, "DrawableColor", lh2.a(getContext(), R$attr.couiColorSecondary));
            return;
        }
        int i2 = BTN_VIEW_ID;
        constraintSet.setFloatValue(i2, "TextSize", 14.0f);
        constraintSet.setStringValue(i2, "Text", "关注");
        constraintSet.setColorValue(i2, "TextColor", -1);
        constraintSet.setColorValue(i2, "DrawableColor", lh2.a(getContext(), R$attr.couiColorPrimary));
    }

    public void setupSubText(ConstraintSet constraintSet, boolean z) {
        if (z) {
            int i = SUB_TEXT_VIEW_ID;
            constraintSet.connect(i, 3, TEXT_VIEW_ID, 4);
            constraintSet.connect(i, 4, 0, 4);
            constraintSet.connect(i, 7, BTN_VIEW_ID, 6);
            return;
        }
        int i2 = SUB_TEXT_VIEW_ID;
        constraintSet.connect(i2, 3, 0, 4);
        constraintSet.connect(i2, 4, -1, 4);
        constraintSet.connect(i2, 7, TEXT_VIEW_ID, 7);
    }

    public void setupText(ConstraintSet constraintSet, boolean z) {
        if (z) {
            constraintSet.setHorizontalBias(BTN_VIEW_ID, 1.0f);
        } else {
            constraintSet.setHorizontalBias(BTN_VIEW_ID, 0.0f);
        }
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public synchronized void startAnimation() {
        setConstraintState(getCurState(), getTargetState());
        transitionToEnd();
    }

    public COUIUserFollowView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setImage(Bitmap bitmap) {
        this.mImageView.setImageBitmap(bitmap);
    }

    public COUIUserFollowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mEnd = new ConstraintSet();
        this.mStart = new ConstraintSet();
        Runnable runnable = new Runnable() { // from class: com.coui.appcompat.toolbar.userfollow.COUIUserFollowView.1
            @Override // java.lang.Runnable
            public void run() {
                COUIUserFollowView.this.mStart.clone(COUIUserFollowView.this);
                COUIUserFollowView.this.mEnd.clone(COUIUserFollowView.this);
                MotionScene.Transition transitionBuildTransition = TransitionBuilder.buildTransition(COUIUserFollowView.this.generateScene(), View.generateViewId(), COUIUserFollowView.this.mStartID, COUIUserFollowView.this.mStart, COUIUserFollowView.this.mEndID, COUIUserFollowView.this.mEnd);
                transitionBuildTransition.setDuration(COUIUserFollowView.this.mDuration);
                COUIUserFollowView.this.generateScene().addTransition(transitionBuildTransition);
                COUIUserFollowView.this.generateScene().setTransition(transitionBuildTransition);
                COUIUserFollowView cOUIUserFollowView = COUIUserFollowView.this;
                cOUIUserFollowView.setScene(cOUIUserFollowView.generateScene());
                COUIUserFollowView cOUIUserFollowView2 = COUIUserFollowView.this;
                cOUIUserFollowView2.setTransition(cOUIUserFollowView2.mStartID, COUIUserFollowView.this.mEndID);
            }
        };
        this.mInitSceneRunnable = runnable;
        this.mCurState = 0;
        this.mTargetState = 0;
        this.mDuration = 300;
        this.mStartID = View.generateViewId();
        this.mEndID = View.generateViewId();
        this.mIsFollowing = false;
        this.mIsFill = false;
        this.mIsAutoAnimationEnable = true;
        this.mIsSubTextEnable = false;
        generateImage();
        generateText();
        generateSubText();
        generateBarrier();
        generateBtn();
        super.setTransitionListener(this);
        post(runnable);
    }

    @Override // com.coui.appcompat.toolbar.userfollow.IUserFollowView
    public void setImage(int i) {
        this.mImageView.setImageResource(i);
    }
}
