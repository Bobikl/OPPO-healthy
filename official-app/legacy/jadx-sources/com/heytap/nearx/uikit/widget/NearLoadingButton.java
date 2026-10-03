package com.heytap.nearx.uikit.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$string;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.NearLoadingButton;
import com.oplus.smartenginehelper.ParserTag;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000 D2\u00020\u0001:\u0002DEB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ@\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0007H\u0002J\u0018\u0010)\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010&\u001a\u00020'H\u0002J0\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u000202H\u0002J\n\u00103\u001a\u0004\u0018\u00010\fH\u0016J\u0014\u00104\u001a\u0004\u0018\u00010\u00182\b\u00105\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u00106\u001a\u00020\u001cH\u0016J\b\u00107\u001a\u00020\u001fH\u0002J\b\u00108\u001a\u00020\u001fH\u0002J\u0006\u00109\u001a\u00020\u001cJ\b\u0010:\u001a\u00020\u001fH\u0014J\b\u0010;\u001a\u00020\u001fH\u0014J\u0010\u0010<\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0014J\u0010\u0010=\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\fH\u0016J\u0010\u0010?\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u0018H\u0016J\u0010\u0010@\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020\u001cH\u0016J\u0006\u0010B\u001a\u00020\u001fJ\u0006\u0010C\u001a\u00020\u001fR\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearLoadingButton;", "Lcom/heytap/nearx/uikit/widget/NearButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "loadingDrawableMargin", "mButtonState", "mDots", "", "mFirstLoadingDotAlpha", "mLoadingAnim", "Landroid/animation/AnimatorSet;", "mLoadingCircleRadius", "", "mLoadingCircleSpacing", "mLoadingCircleTotalWidth", "mLoadingText", "mLoadingTextBounds", "Landroid/graphics/Rect;", "mOnLoadingStateChangeListener", "Lcom/heytap/nearx/uikit/widget/NearLoadingButton$OnLoadingStateChangeListener;", "mOriginalText", "mSecondLoadingDotAlpha", "mShowLoadingText", "", "mThirdLoadingDotAlpha", "drawClipDot", "", "canvas", "Landroid/graphics/Canvas;", "clipLeft", "clipRight", "textX", "textY", "textPaint", "Landroid/text/TextPaint;", "paintAlpha", "drawLoadingCircles", "getAlphaAnimator", "Landroid/animation/ValueAnimator;", "startAlpha", "endAlpha", "duration", "", ParserTag.TAG_START_DELAY, "updateListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "getLoadingText", "getOnLoadingStateChangeListener", "listener", "getShowLoadingText", "initAnim", "initTextChangeListener", "isLoading", "onAttachedToWindow", "onDetachedFromWindow", "onDraw", "setLoadingText", "loadingText", "setOnLoadingStateChangeListener", "setShowLoadingText", "isShowLoadingText", "startAnim", "stopAnim", "Companion", "OnLoadingStateChangeListener", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearLoadingButton extends NearButton {
    public static final int DEFAULT_STATE = 0;
    private static final float DOT_END_ALPHA = 255.0f;
    private static final float DOT_MID_ALPHA = 127.5f;
    private static final float DOT_START_ALPHA = 51.0f;
    private static final int LOADING_DOT_TYPE = 1;
    public static final int LOADING_STATE = 1;
    private static final int LOADING_TEXT_TYPE = 0;

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private int loadingDrawableMargin;
    private int mButtonState;

    @NotNull
    private final String mDots;
    private int mFirstLoadingDotAlpha;

    @Nullable
    private AnimatorSet mLoadingAnim;
    private final float mLoadingCircleRadius;
    private final float mLoadingCircleSpacing;
    private final float mLoadingCircleTotalWidth;

    @NotNull
    private String mLoadingText;

    @NotNull
    private final Rect mLoadingTextBounds;

    @Nullable
    private OnLoadingStateChangeListener mOnLoadingStateChangeListener;

    @NotNull
    private String mOriginalText;
    private int mSecondLoadingDotAlpha;
    private boolean mShowLoadingText;
    private int mThirdLoadingDotAlpha;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearLoadingButton$OnLoadingStateChangeListener;", "", "OnLoadingStateChanged", "", "loadingButtonState", "", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public interface OnLoadingStateChangeListener {
        void OnLoadingStateChanged(int loadingButtonState);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearLoadingButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawClipDot(Canvas canvas, float clipLeft, float clipRight, float textX, float textY, TextPaint textPaint, int paintAlpha) {
        textPaint.setAlpha(paintAlpha);
        int iSave = canvas.save();
        canvas.clipRect(clipLeft, 0.0f, clipRight, getHeight());
        canvas.drawText(this.mDots, textX, textY, textPaint);
        canvas.restoreToCount(iSave);
    }

    private final void drawLoadingCircles(Canvas canvas, TextPaint textPaint) {
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f = 2;
        float measuredWidth = ((getMeasuredWidth() - this.mLoadingCircleTotalWidth) / f) + this.mLoadingCircleRadius;
        textPaint.setAlpha(this.mFirstLoadingDotAlpha);
        canvas.drawCircle(measuredWidth, measuredHeight, this.mLoadingCircleRadius, textPaint);
        float f2 = measuredWidth + (this.mLoadingCircleRadius * f) + this.mLoadingCircleSpacing;
        textPaint.setAlpha(this.mSecondLoadingDotAlpha);
        canvas.drawCircle(f2, measuredHeight, this.mLoadingCircleRadius, textPaint);
        float f3 = f2 + (this.mLoadingCircleRadius * f) + this.mLoadingCircleSpacing;
        textPaint.setAlpha(this.mThirdLoadingDotAlpha);
        canvas.drawCircle(f3, measuredHeight, this.mLoadingCircleRadius, textPaint);
    }

    private final ValueAnimator getAlphaAnimator(float startAlpha, float endAlpha, long duration, long startDelay, ValueAnimator.AnimatorUpdateListener updateListener) {
        ValueAnimator alphaAnimator = ValueAnimator.ofFloat(startAlpha, endAlpha);
        alphaAnimator.setDuration(duration);
        alphaAnimator.setStartDelay(startDelay);
        alphaAnimator.addUpdateListener(updateListener);
        Intrinsics.checkNotNullExpressionValue(alphaAnimator, "alphaAnimator");
        return alphaAnimator;
    }

    private final void initAnim() {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.bjc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearLoadingButton.m4677initAnim$lambda0(this.i, valueAnimator);
            }
        };
        ValueAnimator alphaAnimator = getAlphaAnimator(DOT_START_ALPHA, DOT_MID_ALPHA, 133L, 0L, animatorUpdateListener);
        ValueAnimator alphaAnimator2 = getAlphaAnimator(DOT_MID_ALPHA, 255.0f, 67L, 133L, animatorUpdateListener);
        ValueAnimator alphaAnimator3 = getAlphaAnimator(255.0f, DOT_MID_ALPHA, 67L, 467L, animatorUpdateListener);
        ValueAnimator alphaAnimator4 = getAlphaAnimator(DOT_MID_ALPHA, DOT_START_ALPHA, 133L, 533L, animatorUpdateListener);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.cjc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearLoadingButton.m4678initAnim$lambda1(this.i, valueAnimator);
            }
        };
        ValueAnimator alphaAnimator5 = getAlphaAnimator(DOT_START_ALPHA, DOT_MID_ALPHA, 133L, 333L, animatorUpdateListener2);
        ValueAnimator alphaAnimator6 = getAlphaAnimator(DOT_MID_ALPHA, 255.0f, 67L, 466L, animatorUpdateListener2);
        ValueAnimator alphaAnimator7 = getAlphaAnimator(255.0f, DOT_MID_ALPHA, 67L, 800L, animatorUpdateListener2);
        ValueAnimator alphaAnimator8 = getAlphaAnimator(DOT_MID_ALPHA, DOT_START_ALPHA, 133L, 866L, animatorUpdateListener2);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener3 = new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.djc
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                NearLoadingButton.m4679initAnim$lambda2(this.i, valueAnimator);
            }
        };
        ValueAnimator alphaAnimator9 = getAlphaAnimator(DOT_START_ALPHA, DOT_MID_ALPHA, 133L, 666L, animatorUpdateListener3);
        ValueAnimator alphaAnimator10 = getAlphaAnimator(DOT_MID_ALPHA, 255.0f, 67L, 799L, animatorUpdateListener3);
        ValueAnimator alphaAnimator11 = getAlphaAnimator(255.0f, DOT_MID_ALPHA, 67L, 1133L, animatorUpdateListener3);
        ValueAnimator alphaAnimator12 = getAlphaAnimator(DOT_MID_ALPHA, DOT_START_ALPHA, 133L, 1199L, animatorUpdateListener3);
        AnimatorSet animatorSet = new AnimatorSet();
        this.mLoadingAnim = animatorSet;
        animatorSet.playTogether(alphaAnimator, alphaAnimator2, alphaAnimator3, alphaAnimator4, alphaAnimator5, alphaAnimator6, alphaAnimator7, alphaAnimator8, alphaAnimator9, alphaAnimator10, alphaAnimator11, alphaAnimator12);
        AnimatorSet animatorSet2 = this.mLoadingAnim;
        if (animatorSet2 != null) {
            animatorSet2.setInterpolator(new LinearInterpolator());
        }
        AnimatorSet animatorSet3 = this.mLoadingAnim;
        if (animatorSet3 == null) {
            return;
        }
        animatorSet3.addListener(new AnimatorListenerAdapter() { // from class: com.heytap.nearx.uikit.widget.NearLoadingButton.initAnim.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                AnimatorSet animatorSet4;
                Intrinsics.checkNotNullParameter(animation, "animation");
                if (NearLoadingButton.this.mLoadingAnim == null || NearLoadingButton.this.mButtonState != 1 || (animatorSet4 = NearLoadingButton.this.mLoadingAnim) == null) {
                    return;
                }
                animatorSet4.start();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initAnim$lambda-0, reason: not valid java name */
    public static final void m4677initAnim$lambda0(NearLoadingButton this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        this$0.mFirstLoadingDotAlpha = (int) ((Float) animatedValue).floatValue();
        this$0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initAnim$lambda-1, reason: not valid java name */
    public static final void m4678initAnim$lambda1(NearLoadingButton this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        this$0.mSecondLoadingDotAlpha = (int) ((Float) animatedValue).floatValue();
        this$0.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initAnim$lambda-2, reason: not valid java name */
    public static final void m4679initAnim$lambda2(NearLoadingButton this$0, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        this$0.mThirdLoadingDotAlpha = (int) ((Float) animatedValue).floatValue();
        this$0.invalidate();
    }

    private final void initTextChangeListener() {
        addTextChangedListener(new TextWatcher() { // from class: com.heytap.nearx.uikit.widget.NearLoadingButton.initTextChangeListener.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@NotNull Editable s) {
                Intrinsics.checkNotNullParameter(s, "s");
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@NotNull CharSequence s, int start, int count, int after) {
                Intrinsics.checkNotNullParameter(s, "s");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence s, int start, int before, int count) {
                Intrinsics.checkNotNullParameter(s, "s");
                if (NearLoadingButton.this.mButtonState != 1 || Intrinsics.areEqual(s.toString(), "")) {
                    return;
                }
                NearLoadingButton.this.mOriginalText = s.toString();
                NearLoadingButton.this.setText("");
            }
        });
    }

    @Override // com.heytap.nearx.uikit.widget.NearButton, com.heytap.nearx.uikit.internal.widget.InnerButton
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.heytap.nearx.uikit.widget.NearButton, com.heytap.nearx.uikit.internal.widget.InnerButton
    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Nullable
    /* JADX INFO: renamed from: getLoadingText, reason: from getter */
    public String getMLoadingText() {
        return this.mLoadingText;
    }

    @Nullable
    public OnLoadingStateChangeListener getOnLoadingStateChangeListener(@Nullable OnLoadingStateChangeListener listener) {
        return this.mOnLoadingStateChangeListener;
    }

    /* JADX INFO: renamed from: getShowLoadingText, reason: from getter */
    public boolean getMShowLoadingText() {
        return this.mShowLoadingText;
    }

    public final boolean isLoading() {
        AnimatorSet animatorSet = this.mLoadingAnim;
        return animatorSet != null && animatorSet.isRunning();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        AnimatorSet animatorSet;
        super.onAttachedToWindow();
        if (this.mButtonState != 1 || (animatorSet = this.mLoadingAnim) == null) {
            return;
        }
        Intrinsics.checkNotNull(animatorSet);
        if (animatorSet.isRunning()) {
            return;
        }
        AnimatorSet animatorSet2 = this.mLoadingAnim;
        Intrinsics.checkNotNull(animatorSet2);
        animatorSet2.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mButtonState == 1) {
            AnimatorSet animatorSet = this.mLoadingAnim;
            Intrinsics.checkNotNull(animatorSet);
            animatorSet.cancel();
        }
    }

    @Override // com.heytap.nearx.uikit.widget.NearButton, com.heytap.nearx.uikit.internal.widget.InnerButton, android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.mButtonState != 1 || getPaint() == null) {
            return;
        }
        TextPaint textPaint = getPaint();
        int alpha = textPaint.getAlpha();
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.mShowLoadingText) {
            float fMeasureText = textPaint.measureText(this.mLoadingText);
            float fMeasureText2 = textPaint.measureText(this.mDots);
            if (fMeasureText + fMeasureText2 > (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()) {
                Intrinsics.checkNotNullExpressionValue(textPaint, "textPaint");
                drawLoadingCircles(canvas, textPaint);
            } else {
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                float f = fontMetrics.bottom - fontMetrics.top;
                float f2 = 2;
                float measuredWidth = ((getMeasuredWidth() - fMeasureText) - fMeasureText2) / f2;
                float measuredHeight = ((getMeasuredHeight() + f) / f2) - fontMetrics.bottom;
                float f3 = measuredWidth + fMeasureText;
                canvas.drawText(this.mLoadingText, measuredWidth, measuredHeight, textPaint);
                textPaint.getTextBounds(this.mDots, 0, 1, this.mLoadingTextBounds);
                float f4 = this.mLoadingTextBounds.right + f3;
                Intrinsics.checkNotNullExpressionValue(textPaint, "textPaint");
                drawClipDot(canvas, f3, f4, f3, measuredHeight, textPaint, this.mFirstLoadingDotAlpha);
                Rect rect = this.mLoadingTextBounds;
                float f5 = rect.right + f3;
                textPaint.getTextBounds(this.mDots, 0, 2, rect);
                drawClipDot(canvas, f5, this.mLoadingTextBounds.right + f3, f3, measuredHeight, textPaint, this.mSecondLoadingDotAlpha);
                drawClipDot(canvas, this.mLoadingTextBounds.right + f3, f3 + fMeasureText2, f3, measuredHeight, textPaint, this.mThirdLoadingDotAlpha);
            }
        } else {
            Intrinsics.checkNotNullExpressionValue(textPaint, "textPaint");
            drawLoadingCircles(canvas, textPaint);
        }
        textPaint.setAlpha(alpha);
        canvas.restoreToCount(iSave);
    }

    public void setLoadingText(@NotNull String loadingText) {
        Intrinsics.checkNotNullParameter(loadingText, "loadingText");
        if (this.mShowLoadingText) {
            this.mLoadingText = loadingText;
        }
    }

    public void setOnLoadingStateChangeListener(@NotNull OnLoadingStateChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mOnLoadingStateChangeListener = listener;
    }

    public void setShowLoadingText(boolean isShowLoadingText) {
        this.mShowLoadingText = isShowLoadingText;
    }

    public final void startAnim() {
        if (this.mButtonState == 0) {
            this.mButtonState = 1;
            setText("");
            AnimatorSet animatorSet = this.mLoadingAnim;
            Intrinsics.checkNotNull(animatorSet);
            animatorSet.start();
            OnLoadingStateChangeListener onLoadingStateChangeListener = this.mOnLoadingStateChangeListener;
            if (onLoadingStateChangeListener == null) {
                return;
            }
            onLoadingStateChangeListener.OnLoadingStateChanged(this.mButtonState);
        }
    }

    public final void stopAnim() {
        if (this.mButtonState == 1) {
            this.mButtonState = 0;
            setText(this.mOriginalText);
            AnimatorSet animatorSet = this.mLoadingAnim;
            Intrinsics.checkNotNull(animatorSet);
            animatorSet.cancel();
            OnLoadingStateChangeListener onLoadingStateChangeListener = this.mOnLoadingStateChangeListener;
            if (onLoadingStateChangeListener == null) {
                return;
            }
            onLoadingStateChangeListener.OnLoadingStateChanged(this.mButtonState);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearLoadingButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NearLoadingButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.buttonStyle : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearLoadingButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mLoadingTextBounds = new Rect();
        this.mFirstLoadingDotAlpha = 51;
        this.mSecondLoadingDotAlpha = 51;
        this.mThirdLoadingDotAlpha = 51;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearLoadingButton, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…gButton, defStyleAttr, 0)");
        this.mShowLoadingText = typedArrayObtainStyledAttributes.getInt(R$styleable.NearLoadingButton_nxLoadingType, 0) == 0;
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.NearLoadingButton_nxLoadingText);
        this.mLoadingText = string == null ? "" : string;
        typedArrayObtainStyledAttributes.recycle();
        this.mOriginalText = getText().toString();
        String string2 = context.getString(R$string.nx_loading_button_dots);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.string.nx_loading_button_dots)");
        this.mDots = string2;
        float dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.NXcolor_loading_btn_circle_radius);
        this.mLoadingCircleRadius = dimensionPixelOffset;
        float dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R$dimen.NXcolor_loading_btn_circle_spacing);
        this.mLoadingCircleSpacing = dimensionPixelOffset2;
        this.mLoadingCircleTotalWidth = (dimensionPixelOffset * 6) + (dimensionPixelOffset2 * 2);
        initTextChangeListener();
        initAnim();
        this._$_findViewCache = new LinkedHashMap();
    }
}
