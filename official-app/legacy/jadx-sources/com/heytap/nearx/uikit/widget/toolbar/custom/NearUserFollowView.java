package com.heytap.nearx.uikit.widget.toolbar.custom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.motion.widget.TransitionBuilder;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.widget.NearButton;
import com.heytap.nearx.uikit.widget.NearRoundImageView;
import com.oplus.aiunit.vision.thc;
import com.oplus.aiunit.vision.whc;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;

/* JADX INFO: loaded from: classes18.dex */
public class NearUserFollowView extends MotionLayout implements IUserFollowView, MotionLayout.TransitionListener {
    public static final String DEF_FOLLOWED_TEXT = "已关注";
    public static final String DEF_FOLLOW_TEXT = "关注";
    private NearButton button;
    private int curState;
    private int duration;
    private final ConstraintSet end;
    private int endID;
    private NearRoundImageView imageView;
    private boolean isAutoAnimationEnable;
    private boolean isFill;
    private boolean isFollowing;
    private boolean isSubTextEnable;
    private MotionScene mScene;
    private MotionLayout.TransitionListener mTransitionListener;
    private IUserFollowView.OnStateChangeListener onStateChangeListener;
    private final ConstraintSet start;
    private int startID;
    private TextView subTitle;
    private int targetState;
    private TextView title;
    public static final int IMAGE_VIEW_ID = View.generateViewId();
    public static final int TEXT_VIEW_ID = View.generateViewId();
    public static final int SUB_TEXT_VIEW_ID = View.generateViewId();
    public static final int BTN_VIEW_ID = View.generateViewId();
    public static final int BARRIER_VIEW_ID = View.generateViewId();
    public static int STATE_MUSK = 7;
    public static int BTN_FOLLOWED = 1;
    public static int SUB_TEXT_SHOW = 2;
    public static int TEXT_FILL = 4;

    public NearUserFollowView(@NonNull Context context) {
        this(context, null);
    }

    private void generateBarrier() {
        Barrier barrier = new Barrier(getContext());
        barrier.setId(BARRIER_VIEW_ID);
        barrier.setType(1);
        barrier.setReferencedIds(new int[]{TEXT_VIEW_ID, SUB_TEXT_VIEW_ID});
        addView(barrier);
    }

    private void generateBtn() {
        NearButton nearButton = new NearButton(getContext(), null, R$attr.NXcolorSmallButtonColorStyle);
        this.button = nearButton;
        nearButton.setId(BTN_VIEW_ID);
        this.button.setMaxLines(1);
        this.button.setGravity(17);
        this.button.setRadius(whc.b(getContext(), 28) >> 1);
        this.button.setPadding(0, 0, 0, 0);
        this.button.setText("关注");
        this.button.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.vlc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.i.lambda$generateBtn$1(view);
            }
        });
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(whc.b(getContext(), 52), whc.b(getContext(), 28));
        layoutParams.startToEnd = BARRIER_VIEW_ID;
        layoutParams.endToEnd = 0;
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        layoutParams.horizontalBias = 0.0f;
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = whc.b(getContext(), 8);
        addView(this.button, layoutParams);
    }

    private void generateImage() {
        NearRoundImageView nearRoundImageView = new NearRoundImageView(getContext());
        this.imageView = nearRoundImageView;
        nearRoundImageView.setId(IMAGE_VIEW_ID);
        this.imageView.setHasBorder(true);
        this.imageView.setOutCircleColor(getContext().getColor(R$color.nx_default_image_stroke_bg));
        this.imageView.setImageDrawable(new ColorDrawable(getContext().getColor(R$color.nx_default_image_bg)));
        int iB = whc.b(getContext(), 24);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(iB, iB);
        layoutParams.leftToLeft = 0;
        layoutParams.topToTop = 0;
        layoutParams.bottomToBottom = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = whc.b(getContext(), 8);
        layoutParams.horizontalBias = 0.0f;
        layoutParams.horizontalChainStyle = 2;
        addView(this.imageView, layoutParams);
    }

    private void generateSubText() {
        TextView textView = new TextView(getContext(), null, R$attr.nxSupportSubtitleTextAppearance);
        this.subTitle = textView;
        textView.setId(SUB_TEXT_VIEW_ID);
        this.subTitle.setEllipsize(TextUtils.TruncateAt.END);
        this.subTitle.setMaxLines(1);
        this.subTitle.setText("");
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.startToStart = TEXT_VIEW_ID;
        layoutParams.endToStart = BTN_VIEW_ID;
        layoutParams.topToBottom = 0;
        layoutParams.constrainedWidth = true;
        layoutParams.horizontalBias = 0.0f;
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = whc.b(getContext(), 8);
        addView(this.subTitle, layoutParams);
    }

    private void generateText() {
        TextView textView = new TextView(getContext(), null, R$attr.nxSupportTitleTextAppearance);
        this.title = textView;
        textView.setId(TEXT_VIEW_ID);
        this.title.setEllipsize(TextUtils.TruncateAt.END);
        this.title.setMaxLines(1);
        this.title.setText("用户名");
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(-2, -2);
        layoutParams.topToTop = 0;
        layoutParams.bottomToTop = SUB_TEXT_VIEW_ID;
        layoutParams.endToStart = BTN_VIEW_ID;
        layoutParams.startToEnd = IMAGE_VIEW_ID;
        layoutParams.constrainedWidth = true;
        layoutParams.horizontalBias = 0.0f;
        layoutParams.horizontalChainStyle = 2;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = whc.b(getContext(), 8);
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = whc.b(getContext(), 8);
        addView(this.title, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SensorsDataInstrumented
    public /* synthetic */ void lambda$generateBtn$1(View view) {
        setFollowing(!isFollowing());
        SensorsDataAutoTrackHelper.trackViewOnClick(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.start.clone(this);
        this.end.clone(this);
        MotionScene.Transition transitionBuildTransition = TransitionBuilder.buildTransition(generateScene(), View.generateViewId(), this.startID, this.start, this.endID, this.end);
        transitionBuildTransition.setDuration(this.duration);
        generateScene().addTransition(transitionBuildTransition);
        generateScene().setTransition(transitionBuildTransition);
        setScene(generateScene());
        setTransition(this.startID, this.endID);
    }

    private void setConstraintState(int i, int i2) {
        ConstraintSet constraintSet = getConstraintSet(this.endID);
        int i3 = SUB_TEXT_SHOW;
        setupSubText(constraintSet, (i2 & i3) == i3);
        int i4 = TEXT_FILL;
        setupText(constraintSet, (i2 & i4) == i4);
        int i5 = BTN_FOLLOWED;
        setupBtn(constraintSet, (i2 & i5) == i5);
        setTransition(this.startID, this.endID);
    }

    public MotionScene generateScene() {
        if (this.mScene == null) {
            this.mScene = new MotionScene(this);
        }
        return this.mScene;
    }

    public NearButton getButton() {
        return this.button;
    }

    public int getCurState() {
        return this.curState;
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public NearRoundImageView getImage() {
        return this.imageView;
    }

    public NearRoundImageView getImageView() {
        return this.imageView;
    }

    public TextView getSubTitle() {
        return this.subTitle;
    }

    public int getTargetState() {
        return this.targetState;
    }

    public TextView getTitle() {
        return this.title;
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public boolean isAutoAnimate() {
        return this.isAutoAnimationEnable;
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public boolean isFill() {
        return this.isFill;
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public boolean isFollowing() {
        return this.isFollowing;
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public boolean isSubFollowTitleEnable() {
        return this.isSubTextEnable;
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
        setCurState(this.targetState & STATE_MUSK);
        int i2 = this.endID;
        this.endID = this.startID;
        this.startID = i2;
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

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void release() {
        NearRoundImageView nearRoundImageView = this.imageView;
        if (nearRoundImageView == null || !(nearRoundImageView.getDrawable() instanceof BitmapDrawable)) {
            return;
        }
        ((BitmapDrawable) this.imageView.getDrawable()).getBitmap().recycle();
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setAnimate(boolean z) {
        this.isAutoAnimationEnable = z;
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setBtnBg(Drawable drawable) {
        this.button.setBackground(drawable);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setBtnText(CharSequence charSequence) {
        this.button.setText(charSequence);
    }

    public void setCurState(int i) {
        this.curState = i;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setFill(boolean z) {
        if (this.isFill == z) {
            return;
        }
        this.isFill = z;
        if (z) {
            setTargetState(getTargetState() | TEXT_FILL);
        } else {
            setTargetState(getTargetState() & (~TEXT_FILL));
        }
        if (isAutoAnimate() && isAttachedToWindow()) {
            startAnimation();
        } else {
            if (isAttachedToWindow()) {
                return;
            }
            setCurState(getTargetState() & STATE_MUSK);
            this.end.clone(this);
            setupText(this.end, this.isFill);
            this.end.applyTo(this);
        }
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setFollowTitle(CharSequence charSequence) {
        this.title.setText(charSequence);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setFollowTitleColor(int i) {
        this.title.setTextColor(i);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setFollowTitleTextSize(float f, int i) {
        this.title.setTextSize(i, f);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setFollowing(boolean z) {
        if (this.isFollowing == z) {
            return;
        }
        this.isFollowing = z;
        if (z) {
            setTargetState(getTargetState() | BTN_FOLLOWED);
        } else {
            setTargetState(getTargetState() & (~BTN_FOLLOWED));
        }
        IUserFollowView.OnStateChangeListener onStateChangeListener = this.onStateChangeListener;
        if (onStateChangeListener != null) {
            onStateChangeListener.onStateChanged(this, isFollowing());
        }
        if (isAutoAnimate() && isAttachedToWindow()) {
            startAnimation();
        } else {
            if (isAttachedToWindow()) {
                return;
            }
            setCurState(getTargetState() & STATE_MUSK);
            this.end.clone(this);
            setupBtn(this.end, this.isFollowing);
            this.end.applyTo(this);
        }
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setImage(Drawable drawable) {
        this.imageView.setImageDrawable(drawable);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setOnStateChangeListener(IUserFollowView.OnStateChangeListener onStateChangeListener) {
        this.onStateChangeListener = onStateChangeListener;
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setSubFollowTitle(CharSequence charSequence) {
        this.subTitle.setText(charSequence);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setSubFollowTitleColor(int i) {
        this.subTitle.setTextColor(i);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setSubFollowTitleEnable(boolean z) {
        this.isSubTextEnable = z;
        if (z) {
            setTargetState(getTargetState() | SUB_TEXT_SHOW);
        } else {
            setTargetState(getTargetState() & (~SUB_TEXT_SHOW));
        }
        if (isAutoAnimate() && isAttachedToWindow()) {
            startAnimation();
        } else {
            if (isAttachedToWindow()) {
                return;
            }
            setCurState(getTargetState() & STATE_MUSK);
            this.end.clone(this);
            setupSubText(this.end, this.isSubTextEnable);
            this.end.applyTo(this);
        }
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setSubFollowTitleTextSize(float f, int i) {
        this.subTitle.setTextSize(i, f);
    }

    public void setTargetState(int i) {
        this.targetState = i;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout
    public void setTransitionListener(MotionLayout.TransitionListener transitionListener) {
        this.mTransitionListener = transitionListener;
    }

    public void setupBtn(ConstraintSet constraintSet, boolean z) {
        if (this.button == null) {
            return;
        }
        if (z) {
            int i = BTN_VIEW_ID;
            constraintSet.setFloatValue(i, "TextSize", 12.0f);
            constraintSet.setStringValue(i, "Text", "已关注");
            constraintSet.setColorValue(i, "TextColor", thc.a(getContext(), R$attr.nxColorPrimary));
            constraintSet.setColorValue(i, "ButtonDrawableColor", thc.a(getContext(), R$attr.nxColorSecondary));
            return;
        }
        int i2 = BTN_VIEW_ID;
        constraintSet.setFloatValue(i2, "TextSize", 14.0f);
        constraintSet.setStringValue(i2, "Text", "关注");
        constraintSet.setColorValue(i2, "TextColor", -1);
        constraintSet.setColorValue(i2, "ButtonDrawableColor", thc.a(getContext(), R$attr.nxColorPrimary));
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

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public synchronized void startAnimation() {
        setConstraintState(getCurState(), getTargetState());
        transitionToEnd();
    }

    public NearUserFollowView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setImage(Bitmap bitmap) {
        this.imageView.setImageBitmap(bitmap);
    }

    public NearUserFollowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isFollowing = false;
        this.isFill = false;
        this.isAutoAnimationEnable = true;
        this.isSubTextEnable = false;
        this.curState = 0;
        this.targetState = 0;
        this.duration = 300;
        this.start = new ConstraintSet();
        this.startID = View.generateViewId();
        this.end = new ConstraintSet();
        this.endID = View.generateViewId();
        generateImage();
        generateText();
        generateSubText();
        generateBarrier();
        generateBtn();
        super.setTransitionListener(this);
        post(new Runnable() { // from class: com.oplus.aiunit.vision.ulc
            @Override // java.lang.Runnable
            public final void run() {
                this.i.lambda$new$0();
            }
        });
    }

    @Override // com.heytap.nearx.uikit.widget.toolbar.custom.IUserFollowView
    public void setImage(int i) {
        this.imageView.setImageResource(i);
    }
}
