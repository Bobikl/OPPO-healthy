package com.heytap.store.business.component.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.store.base.core.util.DisplayUtil;
import com.heytap.store.business.component.R;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.vhc;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0002J\b\u0010 \u001a\u00020\u0007H\u0002J\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0007H\u0014J\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/heytap/store/business/component/widget/OStoreScrollIndicatorView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bgColor", "bgStartX", "", "bgWidth", "indicatorColor", "indicatorSize", "indicatorStartX", "indicatorWidth", "maxScrollWidth", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Paint;", "value", "progress", "getProgress", "()F", ClickApiEntity.SET_PROGRESS, "(F)V", "startPadding", ParserTag.TAG_DRAW, "", "canvas", "Landroid/graphics/Canvas;", "getDefaultBgColor", "getDefaultIndicatorColor", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setIndicatorColor", "color", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreScrollIndicatorView extends View {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private int bgColor;
    private float bgStartX;
    private float bgWidth;
    private int indicatorColor;
    private float indicatorSize;
    private float indicatorStartX;
    private float indicatorWidth;
    private float maxScrollWidth;

    @NotNull
    private Paint paint;
    private float progress;
    private float startPadding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreScrollIndicatorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getDefaultBgColor() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        return vhc.a(context) ? Color.parseColor("#4DFFFFFF") : Color.parseColor("#1f000000");
    }

    private final int getDefaultIndicatorColor() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        return vhc.a(context) ? Color.parseColor("#8CFFFFFF") : Color.parseColor("#4D000000");
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

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.draw(canvas);
        this.paint.setColor(this.bgColor);
        float f = this.bgStartX;
        float f2 = this.startPadding;
        float f3 = 0;
        canvas.drawLine(f + f2, f3 + f2, (f + this.bgWidth) - f2, f3 + f2, this.paint);
        this.paint.setColor(this.indicatorColor);
        float f4 = this.bgStartX;
        float f5 = this.indicatorStartX;
        float f6 = this.startPadding;
        canvas.drawLine(f4 + f5 + f6, f3 + f6, (((f4 + f5) + f6) + this.indicatorWidth) - f6, f3 + f6, this.paint);
    }

    public final float getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (getMeasuredWidth() < this.bgWidth) {
            this.bgWidth = getMeasuredWidth();
        }
        float measuredWidth = getMeasuredWidth();
        float f = this.bgWidth;
        float f2 = 2;
        this.bgStartX = (measuredWidth - f) / f2;
        if (this.indicatorWidth > f) {
            this.indicatorWidth = f;
        }
        this.maxScrollWidth = (f - this.indicatorWidth) - (this.startPadding * f2);
    }

    public final void setIndicatorColor(int color) {
        this.indicatorColor = color;
        invalidate();
    }

    public final void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        float f2 = this.maxScrollWidth;
        float f3 = f * f2;
        if (f3 < f2) {
            f2 = f3;
        }
        this.indicatorStartX = f2;
        if (!(f2 == 0.0f)) {
            this.indicatorStartX = f2 + DisplayUtil.dip2px(1.0f);
        }
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreScrollIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OStoreScrollIndicatorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreScrollIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgColor = Color.parseColor("#1f000000");
        this.indicatorColor = Color.parseColor("#4D000000");
        Paint paint = new Paint();
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        this.paint = paint;
        this.bgWidth = DisplayUtil.dip2px(44.0f);
        this.bgColor = getDefaultBgColor();
        this.indicatorColor = getDefaultIndicatorColor();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.OStoreScrollIndicatorView);
        if (typedArrayObtainStyledAttributes != null) {
            this.indicatorSize = typedArrayObtainStyledAttributes.getDimension(R.styleable.OStoreScrollIndicatorView_indicator_size, context.getResources().getDimension(R.dimen.pf_heytap_business_widget_product_grid_card_spacing));
            this.bgColor = typedArrayObtainStyledAttributes.getColor(R.styleable.OStoreScrollIndicatorView_bg_color, getDefaultBgColor());
            this.indicatorColor = typedArrayObtainStyledAttributes.getColor(R.styleable.OStoreScrollIndicatorView_indicator_color, getDefaultIndicatorColor());
            this.indicatorWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.OStoreScrollIndicatorView_indicator_width, DisplayUtil.dip2px(22.0f));
            this.bgWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.OStoreScrollIndicatorView_bg_width, DisplayUtil.dip2px(44.0f));
        }
        this.paint.setStrokeWidth(this.indicatorSize);
        this.startPadding = this.paint.getStrokeWidth() / 2;
        this._$_findViewCache = new LinkedHashMap();
    }
}
