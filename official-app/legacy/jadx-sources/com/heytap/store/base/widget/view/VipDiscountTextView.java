package com.heytap.store.base.widget.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.store.base.widget.R;
import com.heytap.store.platform.tools.SizeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ4\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u0010*\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\b\b\u0002\u00103\u001a\u00020\nH\u0002J\"\u00104\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u0010*\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J*\u00105\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\u0006\u0010*\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00102\u001a\u00020\nH\u0002J\u0010\u00106\u001a\u00020/2\u0006\u00107\u001a\u00020\u0015H\u0002J\u0012\u00108\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u0018\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020\u0007H\u0014J\u000e\u0010<\u001a\u00020/2\u0006\u0010=\u001a\u00020>J\u0018\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u0007H\u0002J\u0018\u0010B\u001a\u00020\u00072\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u0007H\u0002J\u000e\u0010C\u001a\u00020/2\u0006\u0010D\u001a\u00020>J\u0018\u0010E\u001a\u00020/2\u0006\u0010F\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u0007H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010!\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000fR\u000e\u0010-\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/heytap/store/base/widget/view/VipDiscountTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "backgroundRadius", "", "baseY", "getBaseY", "()F", "setBaseY", "(F)V", "changeText", "", "commonEnd", "commonStart", "discountElement", "Lcom/heytap/store/base/widget/view/Element;", "value", "isVertical", "()Z", "setVertical", "(Z)V", "logoBitmap", "Landroid/graphics/Bitmap;", "getLogoBitmap", "()Landroid/graphics/Bitmap;", "logoBitmap$delegate", "Lkotlin/Lazy;", "logoLeftColor", "logoLeftPath", "Landroid/graphics/Path;", "logoPadding", "logoPaint", "Landroid/graphics/Paint;", "logoRightColor", "logoRightPath", "logoWidth", TypedValues.CycleType.S_WAVE_OFFSET, "getOffset", "setOffset", "vipElement", "drawDiscountBackground", "", "canvas", "Landroid/graphics/Canvas;", "backgroundWidth", "startY", "drawLogo", "drawVipBackground", "measureElement", "child", "onDraw", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setDiscountTip", "discountTip", "", "setHorizontalMeasure", "parentWidth", "parentHeight", "setVerticalMeasure", "setVipTip", "vipTip", "specialMaxWidth", "element", "defaultWidth", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class VipDiscountTextView extends AppCompatTextView {
    private final float backgroundRadius;
    private float baseY;
    private boolean changeText;
    private final float commonEnd;
    private final float commonStart;

    @NotNull
    private final Element discountElement;
    private boolean isVertical;

    /* JADX INFO: renamed from: logoBitmap$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy logoBitmap;
    private final int logoLeftColor;

    @NotNull
    private final Path logoLeftPath;
    private final float logoPadding;

    @NotNull
    private final Paint logoPaint;
    private final int logoRightColor;

    @NotNull
    private final Path logoRightPath;
    private final float logoWidth;
    private float offset;

    @NotNull
    private final Element vipElement;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VipDiscountTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawDiscountBackground(Canvas canvas, float offset, float baseY, float backgroundWidth, float startY) {
        if (canvas != null) {
            canvas.translate(offset, startY);
        }
        float f = baseY - startY;
        RectF rectF = this.isVertical ? new RectF(0.0f, f - (this.backgroundRadius * 2), backgroundWidth, f) : new RectF(backgroundWidth - (this.backgroundRadius * 2), 0.0f, backgroundWidth, f);
        Paint paint = this.discountElement.getPaint();
        paint.setColor(this.discountElement.getBackgroundColor());
        paint.setStyle(this.discountElement.getBackgroundStyle());
        if (canvas != null) {
            float f2 = this.backgroundRadius;
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
        Paint strokePaint = this.discountElement.getStrokePaint();
        strokePaint.setStrokeWidth(1.0f);
        if (canvas != null) {
            float f3 = this.backgroundRadius;
            canvas.drawRoundRect(rectF, f3, f3, strokePaint);
        }
        paint.setColor(this.discountElement.getBackgroundColor());
        paint.setStyle(this.discountElement.getBackgroundStyle());
        strokePaint.setStrokeWidth(2.0f);
        if (this.isVertical) {
            float f4 = f - this.backgroundRadius;
            if (canvas != null) {
                canvas.drawRect(0.0f, 0.0f, backgroundWidth, f4, paint);
            }
            if (canvas != null) {
                canvas.drawLine(0.0f, 0.0f, 0.0f, f4, strokePaint);
            }
            if (canvas != null) {
                canvas.drawLine(backgroundWidth, 0.0f, backgroundWidth, f4, strokePaint);
            }
            strokePaint.setStrokeWidth(1.0f);
            if (canvas != null) {
                canvas.drawLine(0.0f, 0.0f, backgroundWidth, 0.0f, strokePaint);
            }
        } else {
            float f5 = backgroundWidth - this.backgroundRadius;
            if (canvas != null) {
                canvas.drawRect(0.0f, 0.0f, f5, f, paint);
            }
            if (canvas != null) {
                canvas.drawLine(0.0f, 0.0f, f5, 0.0f, strokePaint);
            }
            if (canvas != null) {
                canvas.drawLine(0.0f, f, f5, f, strokePaint);
            }
            strokePaint.setStrokeWidth(1.0f);
            if (canvas != null) {
                canvas.drawLine(0.0f, 0.0f, 0.0f, f, strokePaint);
            }
        }
        if (canvas == null) {
            return;
        }
        canvas.translate(-offset, -startY);
    }

    public static /* synthetic */ void drawDiscountBackground$default(VipDiscountTextView vipDiscountTextView, Canvas canvas, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 16) != 0) {
            f4 = 0.0f;
        }
        vipDiscountTextView.drawDiscountBackground(canvas, f, f2, f3, f4);
    }

    private final void drawLogo(Canvas canvas, float offset, float baseY) {
        float f = (baseY - this.logoWidth) / 2;
        if (canvas != null) {
            canvas.translate(offset, f);
        }
        Matrix matrix = new Matrix();
        float fDp2px = SizeUtils.INSTANCE.dp2px(12.0f) / getLogoBitmap().getWidth();
        matrix.setScale(fDp2px, fDp2px);
        if (canvas != null) {
            canvas.drawBitmap(getLogoBitmap(), matrix, this.logoPaint);
        }
        if (canvas == null) {
            return;
        }
        canvas.translate(-offset, -f);
    }

    private final void drawVipBackground(Canvas canvas, float offset, float baseY, float backgroundWidth) {
        if (canvas != null) {
            canvas.translate(offset, 0.0f);
        }
        RectF rectF = this.isVertical ? new RectF(0.0f, 0.0f, backgroundWidth, this.backgroundRadius * 2) : new RectF(0.0f, 0.0f, this.backgroundRadius * 2, baseY);
        Paint paint = this.vipElement.getPaint();
        paint.setColor(this.vipElement.getBackgroundColor());
        paint.setStyle(this.vipElement.getBackgroundStyle());
        if (canvas != null) {
            float f = this.backgroundRadius;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
        if (this.isVertical) {
            if (canvas != null) {
                canvas.drawRect(0.0f, this.backgroundRadius, backgroundWidth, baseY, paint);
            }
        } else if (canvas != null) {
            canvas.drawRect(this.backgroundRadius, 0.0f, backgroundWidth, baseY, paint);
        }
        if (canvas == null) {
            return;
        }
        canvas.translate(-offset, 0.0f);
    }

    private final Bitmap getLogoBitmap() {
        Object value = this.logoBitmap.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-logoBitmap>(...)");
        return (Bitmap) value;
    }

    private final void measureElement(Element child) {
        Paint paint = child.getPaint();
        child.setMeasureTextWidth(paint.measureText(child.getText()));
        child.setMeasuredContentWidth(child.getMeasureTextWidth() + child.getMeasuredExtractWidth());
        child.setBackgroundWidth(child.getMeasuredContentWidth() + child.getPaddingStart() + child.getPaddingEnd());
        child.setMeasuredTextSize(paint.getFontMetrics().bottom - paint.getFontMetrics().top);
        child.setBottom((int) paint.getFontMetrics().bottom);
    }

    private final int setHorizontalMeasure(int parentWidth, int parentHeight) {
        int backgroundWidth = (int) (this.vipElement.getBackgroundWidth() + this.discountElement.getBackgroundWidth() + getPaddingStart() + getPaddingEnd());
        this.discountElement.setMeasuredHeight(parentHeight);
        this.vipElement.setMeasuredHeight(this.discountElement.getMeasuredHeight());
        if (backgroundWidth <= parentWidth) {
            return backgroundWidth;
        }
        this.vipElement.setBackgroundWidth(0.0f);
        this.discountElement.setBackgroundWidth(0.0f);
        return 0;
    }

    private final int setVerticalMeasure(int parentWidth, int parentHeight) {
        float fMax = Math.max(this.vipElement.getBackgroundWidth(), this.discountElement.getBackgroundWidth());
        this.discountElement.setMeasuredHeight(parentHeight / 2);
        this.vipElement.setMeasuredHeight(this.discountElement.getMeasuredHeight());
        if (fMax > parentWidth) {
            this.vipElement.setBackgroundWidth(0.0f);
            this.discountElement.setBackgroundWidth(0.0f);
            return 0;
        }
        specialMaxWidth(this.vipElement, parentWidth);
        specialMaxWidth(this.discountElement, parentWidth);
        return parentWidth;
    }

    private final void specialMaxWidth(Element element, int defaultWidth) {
        float f = defaultWidth;
        element.setPaddingStart((f - element.getMeasuredContentWidth()) / 2);
        element.setPaddingEnd(element.getPaddingStart());
        element.setBackgroundWidth(f);
    }

    public final float getBaseY() {
        return this.baseY;
    }

    public final float getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: isVertical, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x007e  */
    @Override // android.widget.TextView, android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        float backgroundWidth;
        int width;
        float f = 0.0f;
        this.offset = 0.0f;
        this.baseY = 0.0f;
        if (!this.changeText) {
            if (this.isVertical) {
                width = getWidth();
            } else {
                backgroundWidth = this.vipElement.getBackgroundWidth() + this.discountElement.getBackgroundWidth();
            }
            if (!(backgroundWidth == 0.0f) || getHeight() == 0) {
            }
            this.offset = getPaddingStart();
            this.baseY = this.isVertical ? getHeight() / 2 : getHeight();
            drawVipBackground(canvas, this.offset, this.baseY, this.isVertical ? getWidth() : this.vipElement.getBackgroundWidth());
            float paddingStart = this.offset + this.vipElement.getPaddingStart();
            this.offset = paddingStart;
            drawLogo(canvas, paddingStart, this.baseY);
            float f2 = this.offset + this.logoWidth + this.logoPadding;
            this.offset = f2;
            Element.drawText$default(this.vipElement, canvas, f2, 0.0f, 4, null);
            if (this.isVertical) {
                f = this.baseY;
                this.baseY = getHeight();
                this.offset = getPaddingStart();
            } else {
                this.offset = getPaddingStart() + this.vipElement.getBackgroundWidth();
            }
            drawDiscountBackground(canvas, this.offset, this.baseY, this.discountElement.getBackgroundWidth(), f);
            float paddingStart2 = this.offset + this.discountElement.getPaddingStart();
            this.offset = paddingStart2;
            this.discountElement.drawText(canvas, paddingStart2, f);
            return;
        }
        this.vipElement.setPaddingStart(this.commonStart);
        this.discountElement.setPaddingStart(this.commonStart);
        this.vipElement.setPaddingEnd(this.commonEnd);
        this.discountElement.setPaddingEnd(this.commonEnd);
        this.vipElement.setMeasuredExtractWidth(this.logoWidth);
        Element element = this.vipElement;
        element.setMeasuredExtractWidth(element.getMeasuredExtractWidth() + this.logoPadding);
        measureElement(this.vipElement);
        measureElement(this.discountElement);
        this.changeText = false;
        width = this.isVertical ? setVerticalMeasure(getWidth(), getHeight()) : setHorizontalMeasure(getWidth(), getHeight());
        backgroundWidth = width;
        if (backgroundWidth == 0.0f) {
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (!(this.vipElement.getText().length() == 0)) {
            if (!(this.discountElement.getText().length() == 0)) {
                this.vipElement.setMeasuredExtractWidth(this.logoWidth);
                Element element = this.vipElement;
                element.setMeasuredExtractWidth(element.getMeasuredExtractWidth() + this.logoPadding);
                measureElement(this.vipElement);
                measureElement(this.discountElement);
                int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
                int defaultSize2 = View.getDefaultSize(getSuggestedMinimumHeight(), heightMeasureSpec);
                if (Integer.MIN_VALUE == View.MeasureSpec.getMode(widthMeasureSpec) && getMaxWidth() < defaultSize) {
                    defaultSize = getMaxWidth();
                }
                if (this.isVertical) {
                    setVerticalMeasure(defaultSize, defaultSize2);
                } else {
                    setHorizontalMeasure(defaultSize, defaultSize2);
                }
                this.changeText = false;
                setMeasuredDimension(defaultSize, defaultSize2);
                return;
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setBaseY(float f) {
        this.baseY = f;
    }

    public final void setDiscountTip(@NotNull String discountTip) {
        Intrinsics.checkNotNullParameter(discountTip, "discountTip");
        this.discountElement.setText(discountTip);
        this.changeText = true;
    }

    public final void setOffset(float f) {
        this.offset = f;
    }

    public final void setVertical(boolean z) {
        this.isVertical = z;
    }

    public final void setVipTip(@NotNull String vipTip) {
        Intrinsics.checkNotNullParameter(vipTip, "vipTip");
        this.vipElement.setText(vipTip);
        this.changeText = true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VipDiscountTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ VipDiscountTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VipDiscountTextView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = getResources();
        int i2 = R.dimen.dp_10;
        Element element = new Element(null, 0, resources.getDimension(i2), 0, null, 27, null);
        this.vipElement = element;
        Element element2 = new Element(null, 0, getResources().getDimension(i2), 0, null, 27, null);
        this.discountElement = element2;
        this.logoPadding = getResources().getDimension(R.dimen.widget_vip_discount_logo_padding);
        float dimension = getResources().getDimension(R.dimen.widget_vip_discount_start_padding);
        this.commonStart = dimension;
        float dimension2 = getResources().getDimension(R.dimen.widget_vip_discount_common_padding);
        this.commonEnd = dimension2;
        element.setPaddingStart(dimension);
        element.setPaddingEnd(dimension2);
        element.setTextColor(context.getResources().getColor(R.color.widget_vip_discount_vip_text_color));
        element.setBackgroundColor(context.getResources().getColor(R.color.widget_vip_discount_vip_bg_color));
        element2.setPaddingStart(dimension);
        element2.setPaddingEnd(dimension);
        element2.setTextColor(context.getResources().getColor(R.color.widget_vip_discount_value_text_color));
        element2.setBackgroundColor(context.getResources().getColor(R.color.widget_vip_discount_value_bg_color));
        this.backgroundRadius = getResources().getDimension(R.dimen.dp_4);
        float dimension3 = getResources().getDimension(R.dimen.dp_12);
        this.logoWidth = dimension3;
        this.logoLeftColor = context.getResources().getColor(R.color.widget_vip_logo_bg1_color);
        this.logoRightColor = context.getResources().getColor(R.color.widget_vip_logo_bg2_color);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.logoPaint = paint;
        Path path = new Path();
        float f = 3;
        path.moveTo(dimension3 / f, dimension3);
        float f2 = 2;
        path.lineTo((dimension3 / f) * f2, dimension3);
        path.lineTo(dimension3, 0.0f);
        path.lineTo((dimension3 / f) * f2, 0.0f);
        path.close();
        this.logoRightPath = path;
        Path path2 = new Path();
        path2.moveTo(0.0f, 0.0f);
        path2.lineTo(dimension3 / f, 0.0f);
        path2.lineTo((dimension3 / f) * f2, dimension3);
        path2.lineTo(dimension3 / f, dimension3);
        path2.close();
        this.logoLeftPath = path2;
        this.logoBitmap = LazyKt__LazyJVMKt.lazy(new Function0<Bitmap>() { // from class: com.heytap.store.base.widget.view.VipDiscountTextView$logoBitmap$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            public final Bitmap invoke() {
                return BitmapFactory.decodeResource(context.getResources(), R.drawable.widget_vip_icon);
            }
        });
    }
}
