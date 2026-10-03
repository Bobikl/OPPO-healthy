package com.heytap.nearx.uikit.internal.widget.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$dimen;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.widget.shape.NearShapePath;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c8l;
import com.oplus.aiunit.vision.rkc;
import com.oplus.aiunit.vision.xhc;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ^2\u00020\u0001:\u0002\u001f B'\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010Y\u0012\b\b\u0002\u0010[\u001a\u00020\u0002¢\u0006\u0004\b\\\u0010]J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002J(\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0014J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0014J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0002J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\b\u0010 \u001a\u00020\u0004H\u0002R\u0016\u0010#\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010*R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010*R\u0016\u00103\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010*R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u0010;\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010*R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010*R\u0016\u0010?\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010*R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010F\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010*R\u0018\u0010X\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006_"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/dialog/ColorGradientLinearLayout;", "Landroid/widget/LinearLayout;", "", "color", "", "setCustomBackgroundColor", "value", "setBackgroundRadius", "setThemeColor", "", "hasGradient", "setHasGradient", "hasShadow", "setHasShadow", "Lcom/heytap/nearx/uikit/internal/widget/dialog/ColorGradientLinearLayout$b;", "cornerStyle", "setCornerStyle", "type", "setType", "w", b2n.g, "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "topOffset", "setTopOffset", "Landroid/content/Context;", "context", "a", "b", "i", "Lcom/heytap/nearx/uikit/internal/widget/dialog/ColorGradientLinearLayout$b;", "mCornerStyle", "j", "Z", "mHasGradient", MapSchema.FIELD_NAME_KEY, "mHasShadow", LogFieldKey.LEVEL_KEY, "I", "mShadowLeft", LogFieldKey.MESSAGE_KEY, "mShadowTop", "n", "mShadowRight", "o", "mShadowBottom", LogFieldKey.PROCESS_NAME_KEY, "mTopOffset", "Landroid/graphics/Paint;", "q", "Landroid/graphics/Paint;", "mGradientPaint", "r", "mPrimaryPaint", "s", "mBackgroundRadius", "t", "mBackgroundTopRadius", "u", "mBackgroundBottomRadius", "Landroid/graphics/RectF;", "v", "Landroid/graphics/RectF;", "mRectF", "Landroid/graphics/LinearGradient;", "Landroid/graphics/LinearGradient;", "mColorShader", "", "x", "[I", "mGradientColorArray", "", "y", "[F", "mPosition", "Landroid/graphics/drawable/Drawable;", "z", "Landroid/graphics/drawable/Drawable;", "mShadowDrawable", "A", "mThemeColor", "Landroid/graphics/Path;", c8l.KEY_B, "Landroid/graphics/Path;", "mPath", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class ColorGradientLinearLayout extends LinearLayout {
    public static final int D = 0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public int mThemeColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public Path mPath;

    @NotNull
    public Map<Integer, View> C;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public b mCornerStyle;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean mHasGradient;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public boolean mHasShadow;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int mShadowLeft;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int mShadowTop;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int mShadowRight;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int mShadowBottom;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int mTopOffset;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public Paint mGradientPaint;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public Paint mPrimaryPaint;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int mBackgroundRadius;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int mBackgroundTopRadius;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public int mBackgroundBottomRadius;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public RectF mRectF;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public LinearGradient mColorShader;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public int[] mGradientColorArray;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public float[] mPosition;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public Drawable mShadowDrawable;

    @JvmField
    @NotNull
    public static final b ALL_CORNER = new b(true, true, true, true);

    @JvmField
    @NotNull
    public static final b TOP_CORNER = new b(true, true, false, false);
    public static final int E = -1;
    public static final int F = 1;
    public static final String G = ColorGradientLinearLayout.class.getSimpleName();
    public static final float H = 40.0f;
    public static final float I = 20.0f;
    public static final float J = 1.0f;
    public static final float K = 0.04f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u0010\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/heytap/nearx/uikit/internal/widget/dialog/ColorGradientLinearLayout$b;", "", "", "a", "Z", "c", "()Z", "setMTopLeft", "(Z)V", "mTopLeft", "b", "d", "setMTopRight", "mTopRight", "setMBottomLeft", "mBottomLeft", "setMBottomRight", "mBottomRight", "<init>", "(ZZZZ)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean mTopLeft;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean mTopRight;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public boolean mBottomLeft;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public boolean mBottomRight;

        public b(boolean z, boolean z2, boolean z3, boolean z4) {
            this.mTopLeft = z;
            this.mTopRight = z2;
            this.mBottomLeft = z3;
            this.mBottomRight = z4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getMBottomLeft() {
            return this.mBottomLeft;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getMBottomRight() {
            return this.mBottomRight;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getMTopLeft() {
            return this.mTopLeft;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getMTopRight() {
            return this.mTopRight;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ColorGradientLinearLayout(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(Context context) {
        int[] iArr = this.mGradientColorArray;
        iArr[0] = this.mThemeColor;
        Resources resources = getContext().getResources();
        int i = R$color.nx_color_transparent;
        iArr[1] = resources.getColor(i);
        this.mGradientColorArray[2] = getContext().getResources().getColor(i);
        Paint paint = new Paint(1);
        this.mGradientPaint = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint2 = this.mGradientPaint;
        Paint paint3 = null;
        if (paint2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGradientPaint");
            paint2 = null;
        }
        float f = 255;
        paint2.setAlpha((int) (K * f));
        Paint paint4 = new Paint(1);
        this.mPrimaryPaint = paint4;
        paint4.setColor(-1);
        Paint paint5 = this.mPrimaryPaint;
        if (paint5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrimaryPaint");
            paint5 = null;
        }
        paint5.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint6 = this.mPrimaryPaint;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrimaryPaint");
        } else {
            paint3 = paint6;
        }
        paint3.setAlpha((int) (f * J));
    }

    public final void b() {
        RectF rectF = this.mRectF;
        if (rectF == null) {
            return;
        }
        rectF.top = this.mShadowTop;
        float f = rectF.left;
        this.mColorShader = new LinearGradient(f, rectF.top, f, rectF.bottom, this.mGradientColorArray, this.mPosition, Shader.TileMode.MIRROR);
        Paint paint = this.mGradientPaint;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGradientPaint");
            paint = null;
        }
        paint.setShader(this.mColorShader);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        Path path = this.mPath;
        if (path != null) {
            Paint paint = this.mPrimaryPaint;
            Paint paint2 = null;
            if (paint == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPrimaryPaint");
                paint = null;
            }
            canvas.drawPath(path, paint);
            if (this.mHasGradient) {
                Paint paint3 = this.mGradientPaint;
                if (paint3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mGradientPaint");
                } else {
                    paint2 = paint3;
                }
                canvas.drawPath(path, paint2);
            }
        }
        canvas.restore();
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float f = this.mShadowLeft;
        float f2 = this.mShadowTop;
        float f3 = w - this.mShadowRight;
        float f4 = h - this.mShadowBottom;
        this.mRectF = new RectF(f, f2, f3, f4);
        this.mColorShader = new LinearGradient(f, f2, f, f4, this.mGradientColorArray, this.mPosition, Shader.TileMode.MIRROR);
        Paint paint = this.mGradientPaint;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGradientPaint");
            paint = null;
        }
        paint.setShader(this.mColorShader);
        this.mPath = (this.mBackgroundBottomRadius == 0 && this.mBackgroundTopRadius == 0) ? rkc.a().b(f, f2, f3, f4, this.mBackgroundRadius, this.mCornerStyle.getMTopLeft(), this.mCornerStyle.getMTopRight(), this.mCornerStyle.getMBottomLeft(), this.mCornerStyle.getMBottomRight()) : NearShapePath.getRoundRectPath(new Path(), new RectF(f, f2, f3, f4), this.mBackgroundTopRadius, this.mBackgroundBottomRadius);
    }

    public final void setBackgroundRadius(int value) {
        this.mBackgroundRadius = value;
    }

    public final void setCornerStyle(@NotNull b cornerStyle) {
        Intrinsics.checkNotNullParameter(cornerStyle, "cornerStyle");
        this.mCornerStyle = cornerStyle;
        requestLayout();
    }

    public final void setCustomBackgroundColor(int color) {
        Paint paint = this.mPrimaryPaint;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPrimaryPaint");
            paint = null;
        }
        paint.setColor(color);
    }

    public final void setHasGradient(boolean hasGradient) {
        this.mHasGradient = hasGradient;
    }

    public final void setHasShadow(boolean hasShadow) {
        this.mHasShadow = hasShadow;
        if (hasShadow) {
            this.mShadowLeft = getPaddingLeft();
            this.mShadowRight = getPaddingRight();
            this.mShadowTop = getPaddingTop();
            this.mShadowBottom = getPaddingBottom();
        } else {
            setPadding(0, 0, 0, 0);
            this.mShadowLeft = 0;
            this.mShadowTop = 0;
            this.mShadowRight = 0;
            this.mShadowBottom = 0;
        }
        setBackground(null);
        setPadding(this.mShadowLeft, this.mShadowTop, this.mShadowRight, this.mShadowBottom);
        requestLayout();
    }

    public final void setThemeColor(int color) {
        this.mThemeColor = color;
        this.mGradientColorArray[0] = color;
        invalidate();
    }

    public final void setTopOffset(int topOffset) {
        this.mTopOffset = topOffset;
        b();
        invalidate();
    }

    public final void setType(int type) {
        int i = D;
        boolean z = true;
        boolean z2 = type == i;
        if (type != i && type != E) {
            z = false;
        }
        setHasShadow(z2);
        setHasGradient(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ColorGradientLinearLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ColorGradientLinearLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mCornerStyle = ALL_CORNER;
        this.mGradientColorArray = new int[3];
        this.mPosition = new float[]{0.0f, 0.8f, 1.0f};
        this.mThemeColor = getContext().getResources().getColor(R$color.nx_color_transparent);
        a(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.nx_dialog_bg_radius);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NXColorGradientLinearLayout, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…rLayout, defStyleAttr, 0)");
        this.mBackgroundRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NXColorGradientLinearLayout_NXcolorCornerRadius, dimensionPixelSize);
        this.mBackgroundTopRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NXColorGradientLinearLayout_NXTopCornerRadius, 0);
        this.mBackgroundBottomRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NXColorGradientLinearLayout_NXBottomCornerRadius, 0);
        this.mShadowDrawable = context.getResources().getDrawable(R$drawable.nx_color_alert_dialog_bg_with_shadow_66);
        int i2 = R$styleable.NXColorGradientLinearLayout_NXcolorShadowDrawable;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            this.mShadowDrawable = xhc.b(context, typedArrayObtainStyledAttributes, i2);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.C = new LinkedHashMap();
    }

    public /* synthetic */ ColorGradientLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
