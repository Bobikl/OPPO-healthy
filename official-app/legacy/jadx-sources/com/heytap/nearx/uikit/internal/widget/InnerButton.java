package com.heytap.nearx.uikit.internal.widget;

import android.R;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.ColorUtils;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.nearx.uikit.R$attr;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.pressfeedback.NearPressFeedbackHelper;
import com.oplus.aiunit.vision.plc;
import com.oplus.aiunit.vision.rkc;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.entity.ViewEntity;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u0080\u00012\u00020\u0001:\u0002\u0081\u0001B'\b\u0017\u0012\u0006\u0010z\u001a\u00020y\u0012\n\b\u0002\u0010|\u001a\u0004\u0018\u00010{\u0012\b\b\u0002\u0010}\u001a\u00020\u0002¢\u0006\u0004\b~\u0010\u007fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\fJ0\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0014J\b\u0010\u0017\u001a\u00020\bH\u0014J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\fJ\b\u0010\u001f\u001a\u00020\u0002H\u0016R\u0016\u0010 \u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010.\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010#\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\"\u00101\u001a\u00020\u00068F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u00107\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R\"\u0010:\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010#\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-R$\u0010>\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010D\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010?\u001a\u0004\bE\u0010A\"\u0004\bF\u0010CR$\u0010G\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010?\u001a\u0004\bH\u0010A\"\u0004\bI\u0010CR\u0016\u0010J\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u00102R\u0016\u0010K\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u00102R\u0016\u0010L\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010#R\u0016\u0010M\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00102R\u0016\u0010N\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010#R\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR\u0014\u0010S\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010QR\u0016\u0010T\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010#R\u0016\u0010U\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010#R\u0016\u0010V\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u00102R$\u0010X\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R$\u0010^\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010[\"\u0004\b`\u0010]R$\u0010a\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010Y\u001a\u0004\bb\u0010[\"\u0004\bc\u0010]R$\u0010d\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010Y\u001a\u0004\be\u0010[\"\u0004\bf\u0010]R$\u0010g\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010Y\u001a\u0004\bh\u0010[\"\u0004\bi\u0010]R$\u0010j\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010Y\u001a\u0004\bk\u0010[\"\u0004\bl\u0010]R$\u0010m\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010Y\u001a\u0004\bn\u0010[\"\u0004\bo\u0010]R\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u001b\u0010x\u001a\u00020s8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w¨\u0006\u0082\u0001"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/InnerButton;", "Landroidx/appcompat/widget/AppCompatButton;", "", "srcColor", "getAnimatorColor", "getStrokeButtonAnimatorColor", "", "value", "", "setDrawableRadius", "setBrightness", "setExpandOffset", "", "setAnimationEnable", "setAnimType", ViewEntity.ENABLED, "startAnimColorMode", "changed", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "onLayout", "drawableStateChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "setAnimColorEnable", "getSolidColor", "mAnimEnable", "Z", "mAnimType", "I", "Landroid/graphics/Paint;", "fillPaint", "Landroid/graphics/Paint;", "getFillPaint", "()Landroid/graphics/Paint;", "drawableColor", "getDrawableColor", "()I", "setDrawableColor", "(I)V", "disabledColor", "getDisabledColor", "setDisabledColor", "radius", UserInfo.SEX_FEMALE, "getRadius", "()F", "setRadius", "(F)V", "strokeWidth", "getStrokeWidth", "setStrokeWidth", "strokeColor", "getStrokeColor", "setStrokeColor", "Landroid/content/res/ColorStateList;", "drawableColorStateList", "Landroid/content/res/ColorStateList;", "getDrawableColorStateList", "()Landroid/content/res/ColorStateList;", "setDrawableColorStateList", "(Landroid/content/res/ColorStateList;)V", "disableColorStateList", "getDisableColorStateList", "setDisableColorStateList", "strokeColorStateList", "getStrokeColorStateList", "setStrokeColorStateList", "mCurrentBrightness", "mMaxBrightness", "mMaxExpandOffset", "mCurrentScale", "mOffset", "Landroid/graphics/Rect;", "mRect", "Landroid/graphics/Rect;", "mTmpRect", "mStrokeRect", "mExpandOffsetY", "mExpandOffsetX", "mNarrowOffsetFont", "Landroid/animation/PropertyValuesHolder;", "narrowHolder", "Landroid/animation/PropertyValuesHolder;", "getNarrowHolder", "()Landroid/animation/PropertyValuesHolder;", "setNarrowHolder", "(Landroid/animation/PropertyValuesHolder;)V", "narrowHolder_X", "getNarrowHolder_X", "setNarrowHolder_X", "narrowHolderFont", "getNarrowHolderFont", "setNarrowHolderFont", "brightnessHolder", "getBrightnessHolder", "setBrightnessHolder", "expandHolder", "getExpandHolder", "setExpandHolder", "expandHolderX", "getExpandHolderX", "setExpandHolderX", "expandHolderFont", "getExpandHolderFont", "setExpandHolderFont", "", "mColorHsl", "[F", "Lcom/heytap/nearx/uikit/widget/pressfeedback/NearPressFeedbackHelper;", "feedbackUtils$delegate", "Lkotlin/Lazy;", "getFeedbackUtils", "()Lcom/heytap/nearx/uikit/widget/pressfeedback/NearPressFeedbackHelper;", "feedbackUtils", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "nearx_release"}, k = 1, mv = {1, 6, 0})
public class InnerButton extends AppCompatButton {
    private static final int ANIM_ENABLE = 1;
    private static final int BORDER_AND_FILL = 2;
    private static final float DEFAULT_BRIGHTNESS_MAX_VALUE = 0.8f;
    private static final float DEFAULT_RADIUS = -1.0f;
    private static final int MAX_COLOR_VALUE = 255;
    private static final int ONLY_SCALE_ANIM = 0;

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private PropertyValuesHolder brightnessHolder;

    @Nullable
    private ColorStateList disableColorStateList;
    private int disabledColor;
    private int drawableColor;

    @Nullable
    private ColorStateList drawableColorStateList;

    @Nullable
    private PropertyValuesHolder expandHolder;

    @Nullable
    private PropertyValuesHolder expandHolderFont;

    @Nullable
    private PropertyValuesHolder expandHolderX;

    /* JADX INFO: renamed from: feedbackUtils$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy feedbackUtils;

    @NotNull
    private final Paint fillPaint;
    private boolean mAnimEnable;
    private int mAnimType;

    @NotNull
    private final float[] mColorHsl;
    private float mCurrentBrightness;
    private float mCurrentScale;
    private int mExpandOffsetX;
    private int mExpandOffsetY;
    private float mMaxBrightness;
    private int mMaxExpandOffset;
    private float mNarrowOffsetFont;
    private int mOffset;

    @NotNull
    private final Rect mRect;

    @NotNull
    private final Rect mStrokeRect;

    @NotNull
    private final Rect mTmpRect;

    @Nullable
    private PropertyValuesHolder narrowHolder;

    @Nullable
    private PropertyValuesHolder narrowHolderFont;

    @Nullable
    private PropertyValuesHolder narrowHolder_X;
    private float radius;
    private int strokeColor;

    @Nullable
    private ColorStateList strokeColorStateList;
    private float strokeWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getAnimatorColor(int srcColor) {
        return !isEnabled() ? this.disabledColor : ColorUtils.compositeColors(Color.argb(getFeedbackUtils().getBlackAlphaValue(), 0.0f, 0.0f, 0.0f), srcColor);
    }

    private final int getStrokeButtonAnimatorColor(int srcColor) {
        if (!isEnabled()) {
            return srcColor;
        }
        return Color.argb((int) (getFeedbackUtils().getAlphaValue() * 255), Math.min(255, Color.red(srcColor)), Math.min(255, Color.green(srcColor)), Math.min(255, Color.blue(srcColor)));
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

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

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        ColorStateList colorStateList = this.drawableColorStateList;
        if (colorStateList != null) {
            setDrawableColor(colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor()));
        }
        ColorStateList colorStateList2 = this.disableColorStateList;
        if (colorStateList2 != null) {
            setDisabledColor(colorStateList2.getColorForState(getDrawableState(), colorStateList2.getDefaultColor()));
        }
        ColorStateList colorStateList3 = this.strokeColorStateList;
        if (colorStateList3 != null) {
            setStrokeColor(colorStateList3.getColorForState(getDrawableState(), colorStateList3.getDefaultColor()));
        }
        super.drawableStateChanged();
    }

    @Nullable
    public final PropertyValuesHolder getBrightnessHolder() {
        return this.brightnessHolder;
    }

    @Nullable
    public final ColorStateList getDisableColorStateList() {
        return this.disableColorStateList;
    }

    public final int getDisabledColor() {
        return this.disabledColor;
    }

    public final int getDrawableColor() {
        return this.drawableColor;
    }

    @Nullable
    public final ColorStateList getDrawableColorStateList() {
        return this.drawableColorStateList;
    }

    @Nullable
    public final PropertyValuesHolder getExpandHolder() {
        return this.expandHolder;
    }

    @Nullable
    public final PropertyValuesHolder getExpandHolderFont() {
        return this.expandHolderFont;
    }

    @Nullable
    public final PropertyValuesHolder getExpandHolderX() {
        return this.expandHolderX;
    }

    @NotNull
    public final NearPressFeedbackHelper getFeedbackUtils() {
        return (NearPressFeedbackHelper) this.feedbackUtils.getValue();
    }

    @NotNull
    public final Paint getFillPaint() {
        return this.fillPaint;
    }

    @Nullable
    public final PropertyValuesHolder getNarrowHolder() {
        return this.narrowHolder;
    }

    @Nullable
    public final PropertyValuesHolder getNarrowHolderFont() {
        return this.narrowHolderFont;
    }

    @Nullable
    public final PropertyValuesHolder getNarrowHolder_X() {
        return this.narrowHolder_X;
    }

    public final float getRadius() {
        float f = this.radius;
        if (f >= 0.0f) {
            return f;
        }
        Rect rect = this.mTmpRect;
        return ((rect.bottom - rect.top) / 2.0f) - 0.5f;
    }

    @Override // android.view.View
    public int getSolidColor() {
        return (this.mAnimEnable && this.mAnimType == 1) ? getAnimatorColor(this.drawableColor) : super.getSolidColor();
    }

    public final int getStrokeColor() {
        return this.strokeColor;
    }

    @Nullable
    public final ColorStateList getStrokeColorStateList() {
        return this.strokeColorStateList;
    }

    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.mAnimEnable) {
            int iSave = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            this.fillPaint.setStyle(Paint.Style.FILL);
            int i = this.mAnimType;
            if (i == 0) {
                this.fillPaint.setColor(getStrokeButtonAnimatorColor(this.drawableColor));
            } else if (i == 1 || i == 2) {
                this.fillPaint.setColor(getAnimatorColor(this.drawableColor));
            }
            Path pathC = rkc.a().c(this.mTmpRect, getRadius());
            Intrinsics.checkNotNullExpressionValue(pathC, "getInstance().getPath(mTmpRect, radius)");
            canvas.drawPath(pathC, this.fillPaint);
            int i2 = this.mAnimType;
            if (i2 == 0 || i2 == 2) {
                this.fillPaint.setColor(this.strokeColor);
                this.fillPaint.setStrokeWidth(this.strokeWidth);
                this.fillPaint.setStyle(Paint.Style.STROKE);
                canvas.drawPath(rkc.a().c(this.mStrokeRect, getRadius() - this.strokeWidth), this.fillPaint);
            }
            canvas.restoreToCount(iSave);
        }
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.mTmpRect.right = getWidth();
        this.mTmpRect.bottom = getHeight();
        Rect rect = this.mStrokeRect;
        Rect rect2 = this.mTmpRect;
        float f = rect2.top;
        float f2 = this.strokeWidth;
        float f3 = 2;
        rect.top = (int) (f + (f2 / f3));
        rect.left = (int) (rect2.left + (f2 / f3));
        rect.right = (int) (rect2.right - (f2 / f3));
        rect.bottom = (int) (rect2.bottom - (f2 / f3));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isEnabled() && this.mAnimEnable) {
            int action = event.getAction();
            if (action == 0) {
                getFeedbackUtils().executeFeedbackAnimator(true);
            } else if (action == 1 || action == 3) {
                getFeedbackUtils().executeFeedbackAnimator(false);
            }
        }
        return super.onTouchEvent(event);
    }

    public final void setAnimColorEnable(boolean value) {
        setAnimationEnable(value);
    }

    public final void setAnimType(int value) {
        this.mAnimType = value;
    }

    public final void setAnimationEnable(boolean value) {
        this.mAnimEnable = value;
    }

    public final void setBrightness(float value) {
        this.mMaxBrightness = value;
    }

    public final void setBrightnessHolder(@Nullable PropertyValuesHolder propertyValuesHolder) {
        this.brightnessHolder = propertyValuesHolder;
    }

    public final void setDisableColorStateList(@Nullable ColorStateList colorStateList) {
        this.disableColorStateList = colorStateList;
    }

    public final void setDisabledColor(int i) {
        this.disabledColor = i;
    }

    public final void setDrawableColor(int i) {
        this.drawableColor = i;
    }

    public final void setDrawableColorStateList(@Nullable ColorStateList colorStateList) {
        this.drawableColorStateList = colorStateList;
    }

    public final void setDrawableRadius(float value) {
        setRadius(value);
    }

    public final void setExpandHolder(@Nullable PropertyValuesHolder propertyValuesHolder) {
        this.expandHolder = propertyValuesHolder;
    }

    public final void setExpandHolderFont(@Nullable PropertyValuesHolder propertyValuesHolder) {
        this.expandHolderFont = propertyValuesHolder;
    }

    public final void setExpandHolderX(@Nullable PropertyValuesHolder propertyValuesHolder) {
        this.expandHolderX = propertyValuesHolder;
    }

    public final void setExpandOffset(float value) {
    }

    public final void setNarrowHolder(@Nullable PropertyValuesHolder propertyValuesHolder) {
        this.narrowHolder = propertyValuesHolder;
    }

    public final void setNarrowHolderFont(@Nullable PropertyValuesHolder propertyValuesHolder) {
        this.narrowHolderFont = propertyValuesHolder;
    }

    public final void setNarrowHolder_X(@Nullable PropertyValuesHolder propertyValuesHolder) {
        this.narrowHolder_X = propertyValuesHolder;
    }

    public final void setRadius(float f) {
        this.radius = f;
    }

    public final void setStrokeColor(int i) {
        this.strokeColor = i;
    }

    public final void setStrokeColorStateList(@Nullable ColorStateList colorStateList) {
        this.strokeColorStateList = colorStateList;
    }

    public final void setStrokeWidth(float f) {
        this.strokeWidth = f;
    }

    public final void startAnimColorMode(boolean enabled) {
        setAnimationEnable(enabled);
        int i = this.mAnimType;
        if (i == 1 || i == 2) {
            setBackground(null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mAnimType = 1;
        this.fillPaint = new Paint(1);
        this.radius = -1.0f;
        this.mCurrentBrightness = 1.0f;
        this.mCurrentScale = 1.0f;
        this.mRect = new Rect();
        this.mTmpRect = new Rect();
        this.mStrokeRect = new Rect();
        this.mNarrowOffsetFont = 1.0f;
        this.mColorHsl = new float[3];
        this.feedbackUtils = LazyKt__LazyJVMKt.lazy(new Function0<NearPressFeedbackHelper>() { // from class: com.heytap.nearx.uikit.internal.widget.InnerButton$feedbackUtils$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final NearPressFeedbackHelper invoke() {
                return (this.this$0.mAnimType == 1 || this.this$0.mAnimType == 2) ? new NearPressFeedbackHelper(this.this$0, 2) : new NearPressFeedbackHelper(this.this$0, 1);
            }
        });
        this._$_findViewCache = new LinkedHashMap();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearButton, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…Attr\n                , 0)");
        this.mAnimEnable = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearButton_nxAnimationEnable, false);
        this.mAnimType = typedArrayObtainStyledAttributes.getInteger(R$styleable.NearButton_nxAnimationType, 1);
        if (this.mAnimEnable) {
            this.mMaxBrightness = typedArrayObtainStyledAttributes.getFloat(R$styleable.NearButton_nxBrightness, 0.8f);
            this.radius = typedArrayObtainStyledAttributes.getDimension(R$styleable.NearButton_nxDrawableRadius, -1.0f);
            int color = context.getResources().getColor(R$color.NXcolor_btn_drawable_color_disabled);
            int iB = plc.b(context, R$attr.nxColorPrimary, 0);
            this.drawableColorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.NearButton_nxDrawableDefaultColor);
            this.disableColorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.NearButton_nxDrawableDisableColor);
            this.strokeColorStateList = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.NearButton_nxStrokeColor);
            ColorStateList colorStateList = this.drawableColorStateList;
            this.drawableColor = colorStateList != null ? colorStateList.getDefaultColor() : iB;
            ColorStateList colorStateList2 = this.disableColorStateList;
            this.disabledColor = colorStateList2 != null ? colorStateList2.getDefaultColor() : color;
            ColorStateList colorStateList3 = this.strokeColorStateList;
            this.strokeColor = colorStateList3 != null ? colorStateList3.getDefaultColor() : 0;
        }
        this.strokeWidth = typedArrayObtainStyledAttributes.getDimension(R$styleable.NearButton_nxStrokeWidth, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ InnerButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.buttonStyle : i);
    }
}
