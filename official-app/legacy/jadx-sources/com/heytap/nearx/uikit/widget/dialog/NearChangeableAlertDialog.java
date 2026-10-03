package com.heytap.nearx.uikit.widget.dialog;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$id;
import com.heytap.nearx.uikit.R$layout;
import com.heytap.nearx.uikit.widget.NearButtonBarLayout;
import com.heytap.nearx.uikit.widget.NearChangeableHeightView;
import com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated
public class NearChangeableAlertDialog {
    private AlertDialog mAlertDialog;
    private NearAlertDialog.Builder mBuilder;
    private NearButtonBarLayout mButtonPanel;
    private boolean mCancelable;
    private FrameLayout mCustomContainer;
    private View mLayout;
    private TextView mMeasureMessageView;
    private Button mMeasureNegButton;
    private Button mMeasureNeuButton;
    private Button mMeasurePosButton;
    private TextView mMeasureTitleView;
    private ScrollView mMessageContainer;
    private TextView mMessageView;
    private View.OnClickListener mNegButListener;
    private Button mNegButton;
    private View.OnClickListener mNeuButListener;
    private Button mNeuButton;
    private NearChangeableHeightView mParentHeightView;
    private View mParentPanel;
    private View.OnClickListener mPosButListener;
    private Button mPosButton;
    private View mTitleTemplate;
    private TextView mTitleView;
    private View mTopPanel;

    public static class Builder {
        private static final long ALPHA_IN_DELAY = 150;
        private static final long ALPHA_IN_DURATION = 250;
        private static final long ALPHA_OUT_DURATION = 150;
        private static final long HEIGHT_DELAY = 150;
        private static final long HEIGHT_DURATION = 250;
        private Interpolator mAlphaInterpolator;
        private List<Animator> mAnimList;
        private AnimatorSet mAnimSet;
        private Animator.AnimatorListener mAnimatorListener;
        private int mButDividerSize;
        private int mButtonPanelEndHeight;
        private boolean mCancelable = true;
        private NearChangeableAlertDialog mChangeableDialog;
        private int mContentEndHeight;
        private ObjectAnimator mContentInAlphaAnim;
        private ObjectAnimator mContentOutAlphaAnim;
        private int mContentStartHeight;
        private Context mContext;
        private Animator.AnimatorListener mCurAnimatorListener;
        private View mCurCustomView;
        private CharSequence mCurMessage;
        private View.OnClickListener mCurNegButListener;
        private CharSequence mCurNegButtonStr;
        private View.OnClickListener mCurNeuButListener;
        private CharSequence mCurNeuButtonStr;
        private View.OnClickListener mCurPosButListener;
        private CharSequence mCurPosButtonStr;
        private CharSequence mCurTitle;
        private View mCustomView;
        private Interpolator mHeightInterpolator;
        private int mHorButHorPadding;
        private int mHorButPanelMinHeight;
        private CharSequence mMessage;
        private int mMessageContainerPaddingBottom;
        private int mMessageContainerPaddingTop;
        private Drawable mNegButBg;
        private ObjectAnimator mNegButInAlphaAnim;
        private View.OnClickListener mNegButListener;
        private ObjectAnimator mNegButOutAlphaAnim;
        private CharSequence mNegButtonStr;
        private Drawable mNeuButBg;
        private ObjectAnimator mNeuButInAlphaAnim;
        private View.OnClickListener mNeuButListener;
        private ObjectAnimator mNeuButOutAlphaAnim;
        private CharSequence mNeuButtonStr;
        private OnDismissListener mOnDismissListener;
        private TextPaint mPaint;
        private int mParentChildLandMaxHeight;
        private int mParentChildPortMaxHeight;
        private int mParentEndHeight;
        private ObjectAnimator mParentHeightAnim;
        private int mParentPaddingBottom;
        private int mParentPaddingLeft;
        private int mParentPaddingRight;
        private int mParentPaddingTop;
        private int mParentStartHeight;
        private int mParentWidth;
        private Drawable mPosButBg;
        private ObjectAnimator mPosButInAlphaAnim;
        private View.OnClickListener mPosButListener;
        private ObjectAnimator mPosButOutAlphaAnim;
        private CharSequence mPosButtonStr;
        private int mTheme;
        private CharSequence mTitle;
        private int mTitleTemplateBottomMargin;
        private int mTitleTemplateLeftMargin;
        private int mTitleTemplateRightMargin;
        private int mTitleTemplateTopMargin;
        private ObjectAnimator mTopInAlphaAnim;
        private ObjectAnimator mTopOutAlphaAnim;
        private int mTopPanelEndHeight;
        private int mTopPanelStartHeight;
        private int mVerButDividerVerMargin;
        private int mVerButHorPadding;
        private int mVerButMinHeight;
        private int mVerButPaddingOffset;
        private int mVerButVerPadding;
        private int mWindowLandHeight;

        public Builder(Context context) {
            init(context);
        }

        private boolean butHasContent(CharSequence charSequence) {
            return !TextUtils.isEmpty(charSequence);
        }

        private void calculateButPanelEndHeight() {
            if (getButCount() == 0) {
                this.mButtonPanelEndHeight = 0;
            } else if (needSetButVertical((this.mParentWidth - this.mParentPaddingLeft) - this.mParentPaddingRight)) {
                calculateVerButPanelEndHeight();
            } else {
                this.mButtonPanelEndHeight = this.mHorButPanelMinHeight;
            }
        }

        private void calculateCustomEndHeight() {
            this.mCustomView.measure(View.MeasureSpec.makeMeasureSpec((this.mParentWidth - this.mParentPaddingLeft) - this.mParentPaddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.mContentEndHeight = this.mCustomView.getMeasuredHeight();
        }

        private void calculateMessageContainerEndHeight() {
            createMeasureMessageView();
            this.mChangeableDialog.mMeasureMessageView.setText(this.mMessage);
            this.mChangeableDialog.mMeasureMessageView.measure(View.MeasureSpec.makeMeasureSpec((this.mParentWidth - this.mParentPaddingLeft) - this.mParentPaddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.mContentEndHeight = this.mChangeableDialog.mMeasureMessageView.getMeasuredHeight() + this.mMessageContainerPaddingTop + this.mMessageContainerPaddingBottom;
        }

        private void calculateTopPanelEndHeight() {
            createMeasureTitleView();
            this.mChangeableDialog.mMeasureTitleView.setText(this.mTitle);
            this.mChangeableDialog.mMeasureTitleView.measure(View.MeasureSpec.makeMeasureSpec((((this.mParentWidth - this.mParentPaddingLeft) - this.mParentPaddingRight) - this.mTitleTemplateLeftMargin) - this.mTitleTemplateRightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.mTopPanelEndHeight = this.mChangeableDialog.mMeasureTitleView.getMeasuredHeight() + this.mTitleTemplateTopMargin + this.mTitleTemplateBottomMargin;
        }

        private void calculateVerButPanelEndHeight() {
            this.mButtonPanelEndHeight = 0;
            if (butHasContent(this.mPosButtonStr)) {
                createMeasurePosButton();
                setVerPosButPadding();
                calculateVerPosButEndHeight();
            }
            if (butHasContent(this.mNeuButtonStr)) {
                createMeasureNeuButton();
                setVerNeuButPadding();
                calculateVerNeuButEndHeight();
            }
            if (butHasContent(this.mNegButtonStr)) {
                createMeasureNegButton();
                setVerNegButPadding();
                calculateVerNegButEndHeight();
            }
            if (getButCount() != 0) {
                this.mButtonPanelEndHeight += this.mVerButDividerVerMargin + this.mButDividerSize;
            }
        }

        private void calculateVerNegButEndHeight() {
            this.mChangeableDialog.mMeasureNegButton.setText(this.mNegButtonStr);
            this.mChangeableDialog.mMeasureNegButton.measure(View.MeasureSpec.makeMeasureSpec((this.mParentWidth - this.mParentPaddingLeft) - this.mParentPaddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.mButtonPanelEndHeight += this.mChangeableDialog.mMeasureNegButton.getMeasuredHeight();
        }

        private void calculateVerNeuButEndHeight() {
            this.mChangeableDialog.mMeasureNeuButton.setText(this.mNeuButtonStr);
            this.mChangeableDialog.mMeasureNeuButton.measure(View.MeasureSpec.makeMeasureSpec((this.mParentWidth - this.mParentPaddingLeft) - this.mParentPaddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.mButtonPanelEndHeight += this.mChangeableDialog.mMeasureNeuButton.getMeasuredHeight();
        }

        private void calculateVerPosButEndHeight() {
            this.mChangeableDialog.mMeasurePosButton.setText(this.mPosButtonStr);
            this.mChangeableDialog.mMeasurePosButton.measure(View.MeasureSpec.makeMeasureSpec((this.mParentWidth - this.mParentPaddingLeft) - this.mParentPaddingRight, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            this.mButtonPanelEndHeight += this.mChangeableDialog.mMeasurePosButton.getMeasuredHeight();
        }

        private void createMeasureMessageView() {
            this.mChangeableDialog.mMeasureMessageView = new TextView(this.mContext);
            this.mChangeableDialog.mMeasureMessageView.setTextSize(0, this.mChangeableDialog.mMessageView.getTextSize());
            this.mChangeableDialog.mMeasureMessageView.setPadding(this.mChangeableDialog.mMessageView.getPaddingLeft(), this.mChangeableDialog.mMessageView.getPaddingTop(), this.mChangeableDialog.mMessageView.getPaddingRight(), this.mChangeableDialog.mMessageView.getPaddingBottom());
            this.mChangeableDialog.mMeasureMessageView.setGravity(this.mChangeableDialog.mMessageView.getGravity());
            this.mChangeableDialog.mMeasureMessageView.setLineSpacing(this.mChangeableDialog.mMessageView.getLineSpacingExtra(), this.mChangeableDialog.mMessageView.getLineSpacingMultiplier());
        }

        private void createMeasureNegButton() {
            this.mChangeableDialog.mMeasureNegButton = new Button(this.mContext);
            this.mChangeableDialog.mMeasureNegButton.setTextSize(0, this.mChangeableDialog.mNegButton.getTextSize());
            this.mChangeableDialog.mMeasureNegButton.setGravity(this.mChangeableDialog.mNegButton.getGravity());
            this.mChangeableDialog.mMeasureNegButton.setLineSpacing(this.mChangeableDialog.mNegButton.getLineSpacingExtra(), this.mChangeableDialog.mNegButton.getLineSpacingMultiplier());
        }

        private void createMeasureNeuButton() {
            this.mChangeableDialog.mMeasureNeuButton = new Button(this.mContext);
            this.mChangeableDialog.mMeasureNeuButton.setTextSize(0, this.mChangeableDialog.mNeuButton.getTextSize());
            this.mChangeableDialog.mMeasureNeuButton.setGravity(this.mChangeableDialog.mNeuButton.getGravity());
            this.mChangeableDialog.mMeasureNeuButton.setLineSpacing(this.mChangeableDialog.mNeuButton.getLineSpacingExtra(), this.mChangeableDialog.mNeuButton.getLineSpacingMultiplier());
        }

        private void createMeasurePosButton() {
            this.mChangeableDialog.mMeasurePosButton = new Button(this.mContext);
            this.mChangeableDialog.mMeasurePosButton.setTextSize(0, this.mChangeableDialog.mPosButton.getTextSize());
            this.mChangeableDialog.mMeasurePosButton.setGravity(this.mChangeableDialog.mPosButton.getGravity());
            this.mChangeableDialog.mMeasurePosButton.setLineSpacing(this.mChangeableDialog.mPosButton.getLineSpacingExtra(), this.mChangeableDialog.mPosButton.getLineSpacingMultiplier());
        }

        private void createMeasureTitleView() {
            this.mChangeableDialog.mMeasureTitleView = new TextView(this.mContext);
            this.mChangeableDialog.mMeasureTitleView.setTextSize(0, this.mChangeableDialog.mTitleView.getTextSize());
            this.mChangeableDialog.mMeasureTitleView.setMaxLines(this.mChangeableDialog.mTitleView.getMaxLines());
            this.mChangeableDialog.mMeasureTitleView.setMinHeight(this.mChangeableDialog.mTitleView.getMinHeight());
            this.mChangeableDialog.mMeasureTitleView.setGravity(this.mChangeableDialog.mTitleView.getGravity());
            this.mChangeableDialog.mMeasureTitleView.setLineSpacing(this.mChangeableDialog.mTitleView.getLineSpacingExtra(), this.mChangeableDialog.mTitleView.getLineSpacingMultiplier());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getButCount() {
            int i = TextUtils.isEmpty(this.mPosButtonStr) ? 2 : 3;
            if (TextUtils.isEmpty(this.mNegButtonStr)) {
                i--;
            }
            return TextUtils.isEmpty(this.mNeuButtonStr) ? i - 1 : i;
        }

        private void init(Context context) {
            this.mContext = context;
            this.mAnimList = new ArrayList();
            this.mHeightInterpolator = PathInterpolatorCompat.create(0.3f, 0.0f, 0.1f, 1.0f);
            this.mAlphaInterpolator = PathInterpolatorCompat.create(0.33f, 0.0f, 0.67f, 1.0f);
            this.mPaint = new TextPaint();
            NearChangeableAlertDialog nearChangeableAlertDialog = new NearChangeableAlertDialog();
            this.mChangeableDialog = nearChangeableAlertDialog;
            nearChangeableAlertDialog.mLayout = LayoutInflater.from(context).inflate(R$layout.nx_changeable_alert_dialog, (ViewGroup) null);
            NearChangeableAlertDialog nearChangeableAlertDialog2 = this.mChangeableDialog;
            nearChangeableAlertDialog2.mMessageContainer = (ScrollView) nearChangeableAlertDialog2.mLayout.findViewById(R$id.changeable_dialog_message_container);
            NearChangeableAlertDialog nearChangeableAlertDialog3 = this.mChangeableDialog;
            nearChangeableAlertDialog3.mCustomContainer = (FrameLayout) nearChangeableAlertDialog3.mLayout.findViewById(R$id.changeable_dialog_custom_container);
            NearChangeableAlertDialog nearChangeableAlertDialog4 = this.mChangeableDialog;
            nearChangeableAlertDialog4.mMessageView = (TextView) nearChangeableAlertDialog4.mLayout.findViewById(R$id.changeable_dialog_message_view);
        }

        private void initAnimatorListener() {
            Animator.AnimatorListener animatorListener = this.mCurAnimatorListener;
            Animator.AnimatorListener animatorListener2 = this.mAnimatorListener;
            if (animatorListener != animatorListener2) {
                this.mAnimSet.addListener(animatorListener2);
                this.mCurAnimatorListener = this.mAnimatorListener;
            }
        }

        private void initButtonAnim() {
            initPosButAnim();
            initNegButAnim();
            initNeuButAnim();
            calculateButPanelEndHeight();
        }

        private void initMessageAndCustomAnim() {
            resetAlpha();
            if (TextUtils.isEmpty(this.mMessage) || this.mMessage.equals(this.mCurMessage)) {
                View view = this.mCustomView;
                if (view != null && view != this.mCurCustomView) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mChangeableDialog.mLayout, "alpha", 1.0f, 0.0f);
                    this.mContentOutAlphaAnim = objectAnimatorOfFloat;
                    objectAnimatorOfFloat.setDuration(150L);
                    this.mContentOutAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mChangeableDialog.mLayout, "alpha", 0.0f, 1.0f);
                    this.mContentInAlphaAnim = objectAnimatorOfFloat2;
                    objectAnimatorOfFloat2.setDuration(250L);
                    this.mContentInAlphaAnim.setStartDelay(150L);
                    this.mContentInAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                    this.mContentInAlphaAnim.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearChangeableAlertDialog.Builder.5
                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            Builder.this.mChangeableDialog.mMessageContainer.setVisibility(8);
                            if (Builder.this.mChangeableDialog.mCustomContainer.getChildCount() > 1) {
                                Builder.this.mChangeableDialog.mCustomContainer.removeViewAt(0);
                            }
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                            Builder.this.mChangeableDialog.mCustomContainer.setVisibility(0);
                            Builder.this.mChangeableDialog.mMessageContainer.setAlpha(0.0f);
                            Builder.this.mChangeableDialog.mLayout.setVisibility(0);
                            if (Builder.this.mChangeableDialog.mCustomContainer.getChildCount() > 0) {
                                Builder.this.mChangeableDialog.mCustomContainer.getChildAt(0).setAlpha(0.0f);
                            }
                            Builder.this.mChangeableDialog.mCustomContainer.addView(Builder.this.mCustomView, new ViewGroup.LayoutParams(-1, -1));
                        }
                    });
                    calculateCustomEndHeight();
                    this.mAnimList.add(this.mContentOutAlphaAnim);
                    this.mAnimList.add(this.mContentInAlphaAnim);
                    this.mCurCustomView = this.mCustomView;
                    this.mCurMessage = this.mMessage;
                } else if ((TextUtils.isEmpty(this.mMessage) || this.mChangeableDialog.mMessageContainer.getVisibility() == 8) && (this.mCustomView == null || this.mChangeableDialog.mCustomContainer.getVisibility() == 8)) {
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.mChangeableDialog.mLayout, "alpha", 1.0f, 0.0f);
                    this.mContentOutAlphaAnim = objectAnimatorOfFloat3;
                    objectAnimatorOfFloat3.setDuration(150L);
                    this.mContentOutAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.mChangeableDialog.mLayout, "alpha", 0.0f, 0.0f);
                    this.mContentInAlphaAnim = objectAnimatorOfFloat4;
                    objectAnimatorOfFloat4.setDuration(250L);
                    this.mContentInAlphaAnim.setStartDelay(150L);
                    this.mContentInAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                    this.mContentInAlphaAnim.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearChangeableAlertDialog.Builder.6
                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            Builder.this.mChangeableDialog.mLayout.setVisibility(8);
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                        }
                    });
                    this.mContentEndHeight = 0;
                    this.mAnimList.add(this.mContentOutAlphaAnim);
                    this.mAnimList.add(this.mContentInAlphaAnim);
                    this.mCurMessage = this.mMessage;
                    this.mCurCustomView = this.mCustomView;
                } else {
                    this.mContentEndHeight = this.mContentStartHeight;
                }
            } else {
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(this.mChangeableDialog.mLayout, "alpha", 1.0f, 0.0f);
                this.mContentOutAlphaAnim = objectAnimatorOfFloat5;
                objectAnimatorOfFloat5.setDuration(150L);
                this.mContentOutAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(this.mChangeableDialog.mLayout, "alpha", 0.0f, 1.0f);
                this.mContentInAlphaAnim = objectAnimatorOfFloat6;
                objectAnimatorOfFloat6.setDuration(250L);
                this.mContentInAlphaAnim.setStartDelay(150L);
                this.mContentInAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                this.mContentInAlphaAnim.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearChangeableAlertDialog.Builder.4
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        Builder.this.mChangeableDialog.mMessageView.setVisibility(0);
                        Builder.this.mChangeableDialog.mMessageContainer.setVisibility(0);
                        Builder.this.mChangeableDialog.mCustomContainer.setVisibility(8);
                        Builder.this.mChangeableDialog.mLayout.setVisibility(0);
                        Builder.this.mChangeableDialog.mMessageView.setText(Builder.this.mMessage);
                    }
                });
                calculateMessageContainerEndHeight();
                this.mAnimList.add(this.mContentOutAlphaAnim);
                this.mAnimList.add(this.mContentInAlphaAnim);
                this.mCurMessage = this.mMessage;
                this.mCurCustomView = this.mCustomView;
            }
            reCalculateContentEndHeight();
        }

        private void initNegButAnim() {
            if (TextUtils.isEmpty(this.mNegButtonStr)) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mChangeableDialog.mNegButton, "alpha", 1.0f, 0.0f);
                this.mNegButOutAlphaAnim = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(150L);
                this.mNegButOutAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mChangeableDialog.mNegButton, "alpha", 0.0f, 1.0f);
                this.mNegButInAlphaAnim = objectAnimatorOfFloat2;
                objectAnimatorOfFloat2.setDuration(250L);
                this.mNegButInAlphaAnim.setStartDelay(150L);
                this.mNegButInAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                this.mNegButInAlphaAnim.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearChangeableAlertDialog.Builder.9
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        Builder.this.mChangeableDialog.mNegButton.setText(Builder.this.mNegButtonStr);
                        Builder.this.mChangeableDialog.mNegButton.setVisibility(8);
                        if (Builder.this.getButCount() == 0) {
                            Builder.this.mChangeableDialog.mButtonPanel.setVisibility(8);
                        }
                    }
                });
                this.mAnimList.add(this.mNegButOutAlphaAnim);
                this.mAnimList.add(this.mNegButInAlphaAnim);
                this.mCurNegButtonStr = this.mNegButtonStr;
            } else if (!this.mNegButtonStr.equals(this.mCurNegButtonStr)) {
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.mChangeableDialog.mNegButton, "alpha", 1.0f, 0.0f);
                this.mNegButOutAlphaAnim = objectAnimatorOfFloat3;
                objectAnimatorOfFloat3.setDuration(150L);
                this.mNegButOutAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.mChangeableDialog.mNegButton, "alpha", 0.0f, 1.0f);
                this.mNegButInAlphaAnim = objectAnimatorOfFloat4;
                objectAnimatorOfFloat4.setDuration(250L);
                this.mNegButInAlphaAnim.setStartDelay(150L);
                this.mNegButInAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                this.mNegButInAlphaAnim.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearChangeableAlertDialog.Builder.10
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        Builder.this.mChangeableDialog.mNegButton.setBackground(Builder.this.mNegButBg);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        Builder builder = Builder.this;
                        builder.mNegButBg = builder.mChangeableDialog.mNegButton.getBackground();
                        Builder.this.mChangeableDialog.mNegButton.setBackground(null);
                        Builder.this.mChangeableDialog.mNegButton.setText(Builder.this.mNegButtonStr);
                        Builder.this.mChangeableDialog.mNegButton.setVisibility(0);
                        Builder.this.mChangeableDialog.mButtonPanel.setVisibility(0);
                        Builder.this.mChangeableDialog.mButtonPanel.requestLayout();
                    }
                });
                this.mAnimList.add(this.mNegButOutAlphaAnim);
                this.mAnimList.add(this.mNegButInAlphaAnim);
                this.mCurNegButtonStr = this.mNegButtonStr;
            }
            if (this.mCurNegButListener != this.mNegButListener) {
                this.mChangeableDialog.mNegButton.setOnClickListener(this.mNegButListener);
                this.mCurNegButListener = this.mNegButListener;
            }
        }

        private void initNeuButAnim() {
            if (TextUtils.isEmpty(this.mNeuButtonStr)) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mChangeableDialog.mNeuButton, "alpha", 1.0f, 0.0f);
                this.mNeuButOutAlphaAnim = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(150L);
                this.mNeuButOutAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mChangeableDialog.mNeuButton, "alpha", 0.0f, 1.0f);
                this.mNeuButInAlphaAnim = objectAnimatorOfFloat2;
                objectAnimatorOfFloat2.setDuration(250L);
                this.mNeuButInAlphaAnim.setStartDelay(150L);
                this.mNeuButInAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                this.mNeuButInAlphaAnim.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearChangeableAlertDialog.Builder.11
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        Builder.this.mChangeableDialog.mNeuButton.setText(Builder.this.mNeuButtonStr);
                        Builder.this.mChangeableDialog.mNeuButton.setVisibility(8);
                        if (Builder.this.getButCount() == 0) {
                            Builder.this.mChangeableDialog.mButtonPanel.setVisibility(8);
                        }
                    }
                });
                this.mAnimList.add(this.mNeuButOutAlphaAnim);
                this.mAnimList.add(this.mNeuButInAlphaAnim);
                this.mCurNeuButtonStr = this.mNeuButtonStr;
            } else if (!this.mNeuButtonStr.equals(this.mCurNeuButtonStr)) {
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.mChangeableDialog.mNeuButton, "alpha", 1.0f, 0.0f);
                this.mNeuButOutAlphaAnim = objectAnimatorOfFloat3;
                objectAnimatorOfFloat3.setDuration(150L);
                this.mNeuButOutAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.mChangeableDialog.mNeuButton, "alpha", 0.0f, 1.0f);
                this.mNeuButInAlphaAnim = objectAnimatorOfFloat4;
                objectAnimatorOfFloat4.setDuration(250L);
                this.mNeuButInAlphaAnim.setStartDelay(150L);
                this.mNeuButInAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                this.mNeuButInAlphaAnim.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearChangeableAlertDialog.Builder.12
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        Builder.this.mChangeableDialog.mNeuButton.setBackground(Builder.this.mNeuButBg);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        Builder builder = Builder.this;
                        builder.mNeuButBg = builder.mChangeableDialog.mNeuButton.getBackground();
                        Builder.this.mChangeableDialog.mNeuButton.setBackground(null);
                        Builder.this.mChangeableDialog.mNeuButton.setText(Builder.this.mNeuButtonStr);
                        Builder.this.mChangeableDialog.mNeuButton.setVisibility(0);
                        Builder.this.mChangeableDialog.mButtonPanel.setVisibility(0);
                        Builder.this.mChangeableDialog.mButtonPanel.requestLayout();
                    }
                });
                this.mAnimList.add(this.mNeuButOutAlphaAnim);
                this.mAnimList.add(this.mNeuButInAlphaAnim);
                this.mCurNeuButtonStr = this.mNeuButtonStr;
            }
            if (this.mCurNeuButListener != this.mNeuButListener) {
                this.mChangeableDialog.mNeuButton.setOnClickListener(this.mNeuButListener);
                this.mCurNeuButListener = this.mNeuButListener;
            }
        }

        private void initParams() {
            this.mParentStartHeight = this.mChangeableDialog.mParentPanel.getHeight();
            this.mParentWidth = this.mChangeableDialog.mParentPanel.getWidth();
            this.mParentPaddingTop = this.mChangeableDialog.mParentPanel.getPaddingTop();
            this.mParentPaddingBottom = this.mChangeableDialog.mParentPanel.getPaddingBottom();
            this.mParentPaddingLeft = this.mChangeableDialog.mParentPanel.getPaddingLeft();
            this.mParentPaddingRight = this.mChangeableDialog.mParentPanel.getPaddingRight();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mChangeableDialog.mTitleTemplate.getLayoutParams();
            this.mTitleTemplateTopMargin = layoutParams.topMargin;
            this.mTitleTemplateBottomMargin = layoutParams.bottomMargin;
            this.mTitleTemplateLeftMargin = layoutParams.leftMargin;
            this.mTitleTemplateRightMargin = layoutParams.rightMargin;
            this.mTopPanelStartHeight = this.mChangeableDialog.mTopPanel.getHeight();
            this.mContentStartHeight = this.mChangeableDialog.mLayout.getHeight();
            this.mMessageContainerPaddingTop = this.mChangeableDialog.mMessageContainer.getPaddingTop();
            this.mMessageContainerPaddingBottom = this.mChangeableDialog.mMessageContainer.getPaddingBottom();
            this.mPaint.setTextSize(this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_dialog_button_text_size));
            this.mButDividerSize = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_delete_alert_dialog_divider_height);
            this.mHorButHorPadding = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_button_horizontal_padding);
            this.mHorButPanelMinHeight = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_button_height);
            this.mVerButHorPadding = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_button_vertical_padding);
            this.mVerButVerPadding = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_list_item_padding_top);
            this.mVerButMinHeight = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_delete_alert_dialog_button_height);
            this.mVerButPaddingOffset = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_item_padding_offset);
            this.mVerButDividerVerMargin = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_vertical_button_divider_vertical_margin);
            this.mParentChildPortMaxHeight = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_dialog_max_height);
            this.mParentChildLandMaxHeight = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_dialog_max_height_landscape);
            this.mWindowLandHeight = this.mContext.getResources().getDimensionPixelSize(R$dimen.nx_alert_dialog_central_max_height);
        }

        private void initParentHeightAnim() {
            int i = this.mTopPanelEndHeight + this.mContentEndHeight + this.mButtonPanelEndHeight + this.mParentPaddingTop + this.mParentPaddingBottom;
            this.mParentEndHeight = i;
            if (this.mParentStartHeight != i) {
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.mChangeableDialog.mParentHeightView, Fields.HEIGHT_FIELD, this.mParentStartHeight, this.mParentEndHeight);
                this.mParentHeightAnim = objectAnimatorOfInt;
                objectAnimatorOfInt.setDuration(250L);
                this.mParentHeightAnim.setStartDelay(150L);
                this.mParentHeightAnim.setInterpolator(this.mHeightInterpolator);
                this.mAnimList.add(this.mParentHeightAnim);
            }
        }

        private void initPosButAnim() {
            if (TextUtils.isEmpty(this.mPosButtonStr)) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mChangeableDialog.mPosButton, "alpha", 1.0f, 0.0f);
                this.mPosButOutAlphaAnim = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(150L);
                this.mPosButOutAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mChangeableDialog.mPosButton, "alpha", 0.0f, 1.0f);
                this.mPosButInAlphaAnim = objectAnimatorOfFloat2;
                objectAnimatorOfFloat2.setDuration(250L);
                this.mPosButInAlphaAnim.setStartDelay(150L);
                this.mPosButInAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                this.mPosButInAlphaAnim.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearChangeableAlertDialog.Builder.7
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        Builder.this.mChangeableDialog.mPosButton.setText(Builder.this.mPosButtonStr);
                        Builder.this.mChangeableDialog.mPosButton.setVisibility(8);
                        if (Builder.this.getButCount() == 0) {
                            Builder.this.mChangeableDialog.mButtonPanel.setVisibility(8);
                        }
                    }
                });
                this.mAnimList.add(this.mPosButOutAlphaAnim);
                this.mAnimList.add(this.mPosButInAlphaAnim);
                this.mCurPosButtonStr = this.mPosButtonStr;
            } else if (!this.mPosButtonStr.equals(this.mCurPosButtonStr)) {
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.mChangeableDialog.mPosButton, "alpha", 1.0f, 0.0f);
                this.mPosButOutAlphaAnim = objectAnimatorOfFloat3;
                objectAnimatorOfFloat3.setDuration(150L);
                this.mPosButOutAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.mChangeableDialog.mPosButton, "alpha", 0.0f, 1.0f);
                this.mPosButInAlphaAnim = objectAnimatorOfFloat4;
                objectAnimatorOfFloat4.setDuration(250L);
                this.mPosButInAlphaAnim.setStartDelay(150L);
                this.mPosButInAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                this.mPosButInAlphaAnim.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearChangeableAlertDialog.Builder.8
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        Builder.this.mChangeableDialog.mPosButton.setBackground(Builder.this.mPosButBg);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        Builder builder = Builder.this;
                        builder.mPosButBg = builder.mChangeableDialog.mPosButton.getBackground();
                        Builder.this.mChangeableDialog.mPosButton.setBackground(null);
                        Builder.this.mChangeableDialog.mPosButton.setText(Builder.this.mPosButtonStr);
                        Builder.this.mChangeableDialog.mPosButton.setVisibility(0);
                        Builder.this.mChangeableDialog.mButtonPanel.setVisibility(0);
                        Builder.this.mChangeableDialog.mButtonPanel.requestLayout();
                    }
                });
                this.mAnimList.add(this.mPosButOutAlphaAnim);
                this.mAnimList.add(this.mPosButInAlphaAnim);
                this.mCurPosButtonStr = this.mPosButtonStr;
            }
            if (this.mCurPosButListener != this.mPosButListener) {
                this.mChangeableDialog.mPosButton.setOnClickListener(this.mPosButListener);
                this.mCurPosButListener = this.mPosButListener;
            }
        }

        private void initTopAnim() {
            if (!TextUtils.isEmpty(this.mTitle) && !this.mTitle.equals(this.mCurTitle)) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mChangeableDialog.mTopPanel, "alpha", 1.0f, 0.0f);
                this.mTopOutAlphaAnim = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(150L);
                this.mTopOutAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mChangeableDialog.mTopPanel, "alpha", 0.0f, 1.0f);
                this.mTopInAlphaAnim = objectAnimatorOfFloat2;
                objectAnimatorOfFloat2.setDuration(250L);
                this.mTopInAlphaAnim.setStartDelay(150L);
                this.mTopInAlphaAnim.setInterpolator(this.mAlphaInterpolator);
                this.mTopInAlphaAnim.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearChangeableAlertDialog.Builder.2
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                        Builder.this.mChangeableDialog.mTitleView.setVisibility(0);
                        Builder.this.mChangeableDialog.mTitleTemplate.setVisibility(0);
                        Builder.this.mChangeableDialog.mTopPanel.setVisibility(0);
                        Builder.this.mChangeableDialog.mTitleView.setText(Builder.this.mTitle);
                    }
                });
                calculateTopPanelEndHeight();
                this.mAnimList.add(this.mTopOutAlphaAnim);
                this.mAnimList.add(this.mTopInAlphaAnim);
                this.mCurTitle = this.mTitle;
                return;
            }
            if (!TextUtils.isEmpty(this.mTitle)) {
                this.mTopPanelEndHeight = this.mTopPanelStartHeight;
                return;
            }
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.mChangeableDialog.mTopPanel, "alpha", 1.0f, 0.0f);
            this.mTopOutAlphaAnim = objectAnimatorOfFloat3;
            objectAnimatorOfFloat3.setDuration(150L);
            this.mTopOutAlphaAnim.setInterpolator(this.mAlphaInterpolator);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(this.mChangeableDialog.mTopPanel, "alpha", 0.0f, 1.0f);
            this.mTopInAlphaAnim = objectAnimatorOfFloat4;
            objectAnimatorOfFloat4.setDuration(250L);
            this.mTopInAlphaAnim.setStartDelay(150L);
            this.mTopInAlphaAnim.setInterpolator(this.mAlphaInterpolator);
            this.mTopInAlphaAnim.addListener(new Animator.AnimatorListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearChangeableAlertDialog.Builder.3
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    Builder.this.mChangeableDialog.mTopPanel.setVisibility(8);
                    Builder.this.mChangeableDialog.mTitleView.setText(Builder.this.mTitle);
                }
            });
            this.mTopPanelEndHeight = 0;
            this.mAnimList.add(this.mTopOutAlphaAnim);
            this.mAnimList.add(this.mTopInAlphaAnim);
            this.mCurTitle = this.mTitle;
        }

        private boolean isPort() {
            Point point = new Point();
            ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay().getRealSize(point);
            return point.x < point.y;
        }

        private boolean needSetButVertical(int i) {
            int butCount = getButCount();
            if (butCount == 0) {
                return false;
            }
            int i2 = ((i - ((butCount - 1) * this.mButDividerSize)) / butCount) - (this.mHorButHorPadding * 2);
            return (butHasContent(this.mPosButtonStr) ? (int) this.mPaint.measureText(this.mPosButtonStr.toString()) : 0) > i2 || (butHasContent(this.mNegButtonStr) ? (int) this.mPaint.measureText(this.mNegButtonStr.toString()) : 0) > i2 || (butHasContent(this.mNeuButtonStr) ? (int) this.mPaint.measureText(this.mNeuButtonStr.toString()) : 0) > i2;
        }

        private void reCalculateContentEndHeight() {
            int iMin;
            DisplayMetrics displayMetrics = this.mContext.getResources().getDisplayMetrics();
            int i = this.mContentEndHeight;
            if (isPort()) {
                int i2 = displayMetrics.heightPixels;
                iMin = Math.min(i2, displayMetrics.widthPixels < i2 ? this.mParentChildPortMaxHeight : this.mParentChildLandMaxHeight);
            } else {
                iMin = (this.mWindowLandHeight - this.mParentPaddingTop) - this.mParentPaddingBottom;
            }
            this.mContentEndHeight = Math.min(i, (iMin - this.mTopPanelEndHeight) - this.mButtonPanelEndHeight);
        }

        private void resetAlpha() {
            this.mChangeableDialog.mMessageContainer.setAlpha(1.0f);
            this.mChangeableDialog.mLayout.setAlpha(1.0f);
        }

        private void resetAnim() {
            this.mAnimSet = new AnimatorSet();
            this.mAnimList.clear();
        }

        private void setVerNegButPadding() {
            Button button = this.mChangeableDialog.mMeasureNegButton;
            int i = this.mVerButHorPadding;
            int i2 = this.mVerButVerPadding;
            button.setPaddingRelative(i, i2, i, this.mVerButPaddingOffset + i2);
            this.mChangeableDialog.mMeasureNegButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
        }

        private void setVerNeuButPadding() {
            if (butHasContent(this.mPosButtonStr)) {
                if (butHasContent(this.mNegButtonStr)) {
                    Button button = this.mChangeableDialog.mMeasureNeuButton;
                    int i = this.mVerButHorPadding;
                    int i2 = this.mVerButVerPadding;
                    button.setPaddingRelative(i, i2, i, i2);
                    this.mChangeableDialog.mMeasureNeuButton.setMinHeight(this.mVerButMinHeight);
                    return;
                }
                Button button2 = this.mChangeableDialog.mMeasureNeuButton;
                int i3 = this.mVerButHorPadding;
                int i4 = this.mVerButVerPadding;
                button2.setPaddingRelative(i3, i4, i3, this.mVerButPaddingOffset + i4);
                this.mChangeableDialog.mMeasureNeuButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
                return;
            }
            if (butHasContent(this.mNegButtonStr)) {
                Button button3 = this.mChangeableDialog.mMeasureNeuButton;
                int i5 = this.mVerButHorPadding;
                int i6 = this.mVerButVerPadding;
                button3.setPaddingRelative(i5, i6, i5, i6);
                this.mChangeableDialog.mMeasureNeuButton.setMinHeight(this.mVerButMinHeight);
                return;
            }
            Button button4 = this.mChangeableDialog.mMeasureNeuButton;
            int i7 = this.mVerButHorPadding;
            int i8 = this.mVerButVerPadding;
            button4.setPaddingRelative(i7, i8, i7, this.mVerButPaddingOffset + i8);
            this.mChangeableDialog.mMeasureNeuButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
        }

        private void setVerPosButPadding() {
            if (butHasContent(this.mNeuButtonStr) || butHasContent(this.mNegButtonStr)) {
                Button button = this.mChangeableDialog.mMeasurePosButton;
                int i = this.mVerButHorPadding;
                int i2 = this.mVerButVerPadding;
                button.setPaddingRelative(i, i2, i, i2);
                this.mChangeableDialog.mMeasurePosButton.setMinHeight(this.mVerButMinHeight);
                return;
            }
            Button button2 = this.mChangeableDialog.mMeasurePosButton;
            int i3 = this.mVerButHorPadding;
            int i4 = this.mVerButVerPadding;
            button2.setPaddingRelative(i3, i4, i3, this.mVerButPaddingOffset + i4);
            this.mChangeableDialog.mMeasurePosButton.setMinHeight(this.mVerButMinHeight + this.mVerButPaddingOffset);
        }

        private void startAnim() {
            this.mAnimSet.playTogether(this.mAnimList);
            this.mAnimSet.start();
        }

        public NearChangeableAlertDialog create() {
            this.mCurTitle = this.mTitle;
            this.mCurMessage = this.mMessage;
            this.mCurCustomView = this.mCustomView;
            this.mCurPosButtonStr = this.mPosButtonStr;
            this.mCurNegButtonStr = this.mNegButtonStr;
            this.mCurNeuButtonStr = this.mNeuButtonStr;
            this.mCurPosButListener = this.mPosButListener;
            this.mCurNegButListener = this.mNegButListener;
            this.mCurNeuButListener = this.mNeuButListener;
            this.mCurAnimatorListener = this.mAnimatorListener;
            NearChangeableAlertDialog nearChangeableAlertDialog = this.mChangeableDialog;
            int i = this.mTheme;
            nearChangeableAlertDialog.mBuilder = i == 0 ? new NearAlertDialog.Builder(this.mContext) : new NearAlertDialog.Builder(this.mContext, i);
            this.mChangeableDialog.mBuilder.setTitle(this.mTitle).setChangeable(true).setCancelable(this.mCancelable).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearChangeableAlertDialog.Builder.1
                @Override // android.content.DialogInterface.OnDismissListener
                public void onDismiss(DialogInterface dialogInterface) {
                    if (Builder.this.mAnimSet != null && Builder.this.mAnimSet.isRunning()) {
                        Builder.this.mAnimSet.cancel();
                    }
                    Builder.this.mOnDismissListener.onDismiss(dialogInterface);
                }
            }).setPositiveButton(this.mPosButtonStr, (DialogInterface.OnClickListener) null).setNegativeButton(this.mNegButtonStr, (DialogInterface.OnClickListener) null).setNeutralButton(this.mNeuButtonStr, (DialogInterface.OnClickListener) null);
            this.mChangeableDialog.mCancelable = this.mCancelable;
            this.mChangeableDialog.mPosButListener = this.mPosButListener;
            this.mChangeableDialog.mNegButListener = this.mNegButListener;
            this.mChangeableDialog.mNeuButListener = this.mNeuButListener;
            if (!TextUtils.isEmpty(this.mMessage)) {
                this.mChangeableDialog.mCustomContainer.setVisibility(8);
                this.mChangeableDialog.mMessageView.setText(this.mMessage);
            } else if (this.mCustomView != null) {
                this.mChangeableDialog.mMessageContainer.setVisibility(8);
                this.mChangeableDialog.mCustomContainer.addView(this.mCustomView, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.mChangeableDialog.mLayout.setVisibility(8);
            }
            this.mChangeableDialog.mBuilder.setView(this.mChangeableDialog.mLayout);
            NearChangeableAlertDialog nearChangeableAlertDialog2 = this.mChangeableDialog;
            nearChangeableAlertDialog2.mAlertDialog = nearChangeableAlertDialog2.mBuilder.create();
            return this.mChangeableDialog;
        }

        public void reshow() {
            initParams();
            resetAnim();
            initTopAnim();
            initButtonAnim();
            initMessageAndCustomAnim();
            initParentHeightAnim();
            initAnimatorListener();
            startAnim();
        }

        public Builder setAnimatorListener(Animator.AnimatorListener animatorListener) {
            this.mAnimatorListener = animatorListener;
            return this;
        }

        public Builder setCancelable(boolean z) {
            this.mCancelable = z;
            return this;
        }

        public Builder setMessage(CharSequence charSequence) {
            this.mMessage = charSequence;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, View.OnClickListener onClickListener) {
            this.mNegButtonStr = charSequence;
            this.mNegButListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, View.OnClickListener onClickListener) {
            this.mNeuButtonStr = charSequence;
            this.mNeuButListener = onClickListener;
            return this;
        }

        public Builder setOnDismissListener(OnDismissListener onDismissListener) {
            this.mOnDismissListener = onDismissListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, View.OnClickListener onClickListener) {
            this.mPosButtonStr = charSequence;
            this.mPosButListener = onClickListener;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.mTitle = charSequence;
            return this;
        }

        public Builder setView(View view) {
            this.mCustomView = view;
            return this;
        }

        public Builder setMessage(int i) {
            this.mMessage = this.mContext.getText(i);
            return this;
        }

        public Builder setTitle(int i) {
            this.mTitle = this.mContext.getText(i);
            return this;
        }

        public Builder setView(int i) {
            this.mCustomView = LayoutInflater.from(this.mContext).inflate(i, (ViewGroup) null);
            return this;
        }

        public Builder setNegativeButton(int i, View.OnClickListener onClickListener) {
            this.mNegButtonStr = this.mContext.getText(i);
            this.mNegButListener = onClickListener;
            return this;
        }

        public Builder setNeutralButton(int i, View.OnClickListener onClickListener) {
            this.mNeuButtonStr = this.mContext.getText(i);
            this.mNeuButListener = onClickListener;
            return this;
        }

        public Builder setPositiveButton(int i, View.OnClickListener onClickListener) {
            this.mPosButtonStr = this.mContext.getText(i);
            this.mPosButListener = onClickListener;
            return this;
        }

        public Builder(Context context, int i) {
            init(new ContextThemeWrapper(context, i));
            this.mTheme = i;
        }
    }

    public interface OnDismissListener {
        void onDismiss(DialogInterface dialogInterface);
    }

    private void initCancelable() {
        View view = this.mParentPanel;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearChangeableAlertDialog.1
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view2) {
                    SensorsDataAutoTrackHelper.trackViewOnClick(view2);
                }
            });
            FrameLayout frameLayout = (FrameLayout) this.mParentPanel.getParent();
            if (frameLayout != null) {
                frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearChangeableAlertDialog.2
                    @Override // android.view.View.OnClickListener
                    @SensorsDataInstrumented
                    public void onClick(View view2) {
                        if (NearChangeableAlertDialog.this.mCancelable && NearChangeableAlertDialog.this.isShowing()) {
                            NearChangeableAlertDialog.this.dismiss();
                        }
                        SensorsDataAutoTrackHelper.trackViewOnClick(view2);
                    }
                });
            }
        }
        TextView textView = this.mTitleView;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.heytap.nearx.uikit.widget.dialog.NearChangeableAlertDialog.3
                @Override // android.view.View.OnClickListener
                @SensorsDataInstrumented
                public void onClick(View view2) {
                    SensorsDataAutoTrackHelper.trackViewOnClick(view2);
                }
            });
        }
    }

    private void initContentViews() {
        View viewFindViewById = this.mAlertDialog.findViewById(R$id.parentPanel);
        this.mParentPanel = viewFindViewById;
        this.mParentHeightView = new NearChangeableHeightView(viewFindViewById);
        this.mTopPanel = this.mAlertDialog.findViewById(R$id.topPanel);
        this.mTitleTemplate = this.mAlertDialog.findViewById(R$id.title_template);
        this.mTitleView = (TextView) this.mAlertDialog.findViewById(R$id.alertTitle);
        this.mButtonPanel = (NearButtonBarLayout) this.mAlertDialog.findViewById(R$id.buttonPanel);
        this.mPosButton = this.mAlertDialog.getButton(-1);
        this.mNegButton = this.mAlertDialog.getButton(-2);
        this.mNeuButton = this.mAlertDialog.getButton(-3);
    }

    private void setButClickListener() {
        Button button = this.mPosButton;
        if (button != null) {
            button.setOnClickListener(this.mPosButListener);
        }
        Button button2 = this.mNegButton;
        if (button2 != null) {
            button2.setOnClickListener(this.mNegButListener);
        }
        Button button3 = this.mNeuButton;
        if (button3 != null) {
            button3.setOnClickListener(this.mNeuButListener);
        }
    }

    public void dismiss() {
        AlertDialog alertDialog = this.mAlertDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public AlertDialog getAlertDialog() {
        return this.mAlertDialog;
    }

    public boolean isShowing() {
        AlertDialog alertDialog = this.mAlertDialog;
        if (alertDialog != null) {
            return alertDialog.isShowing();
        }
        return false;
    }

    public void show() {
        AlertDialog alertDialog = this.mAlertDialog;
        if (alertDialog != null) {
            alertDialog.show();
            initContentViews();
            setButClickListener();
            initCancelable();
        }
    }

    private NearChangeableAlertDialog() {
    }
}
