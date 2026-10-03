package com.heytap.nearx.uikit.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$drawable;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.internal.widget.InnerButton;
import com.oplus.aiunit.vision.i85;
import com.oplus.aiunit.vision.lkc;
import com.oplus.aiunit.vision.ngc;
import com.oplus.aiunit.vision.rkc;
import com.oplus.aiunit.vision.vhc;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.ViewEntity;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearButton;", "Lcom/heytap/nearx/uikit/internal/widget/InnerButton;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "", "drawableColor", "setButtonDrawableColor", "disableColor", "setButtonDisableColor", "", ViewEntity.ENABLED, ClickApiEntity.SET_ENABLED, "Lcom/oplus/aiunit/vision/ngc;", "kotlin.jvm.PlatformType", "proxy", "Lcom/oplus/aiunit/vision/ngc;", "maxExpandOffset", "I", "isShowOutline", "Z", "Landroid/graphics/drawable/Drawable;", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "getBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public class NearButton extends InnerButton {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @NotNull
    private final Drawable backgroundDrawable;
    private boolean isShowOutline;
    private int maxExpandOffset;
    private final ngc proxy;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearButton(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.heytap.nearx.uikit.internal.widget.InnerButton
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.heytap.nearx.uikit.internal.widget.InnerButton
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

    @NotNull
    public final Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    @Override // com.heytap.nearx.uikit.internal.widget.InnerButton, android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ngc ngcVar = this.proxy;
        Paint fillPaint = getFillPaint();
        int i = this.maxExpandOffset;
        ngcVar.b(canvas, fillPaint, 0 - i, 0 - i, getWidth() + this.maxExpandOffset, getHeight() + this.maxExpandOffset, this.isShowOutline, getRadius());
        super.onDraw(canvas);
    }

    public final void setButtonDisableColor(int disableColor) {
        ngc ngcVar = this.proxy;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        ngcVar.c(this, context, disableColor);
    }

    public final void setButtonDrawableColor(int drawableColor) {
        ngc ngcVar = this.proxy;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        ngcVar.d(this, context, drawableColor);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        ngc ngcVar = this.proxy;
        if (ngcVar == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        ngcVar.e(this, context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ngc ngcVar = (ngc) i85.b();
        this.proxy = ngcVar;
        Drawable drawable = null;
        if (getBackground() != null) {
            drawable = new lkc(ColorStateList.valueOf(getContext().getResources().getColor(R$color.nx_outline_button_background_color)), null, new ShapeDrawable(new Shape() { // from class: com.heytap.nearx.uikit.widget.NearButton$backgroundDrawable$1$mask$1
                @Override // android.graphics.drawable.shapes.Shape
                public void draw(@Nullable Canvas canvas, @Nullable Paint paint) {
                    Path pathC = rkc.a().c(new Rect(0 - this.this$0.maxExpandOffset, 0 - this.this$0.maxExpandOffset, (int) (getWidth() + this.this$0.maxExpandOffset), (int) (getHeight() + this.this$0.maxExpandOffset)), this.this$0.getRadius());
                    if (canvas == null) {
                        return;
                    }
                    if (paint == null) {
                        paint = new Paint();
                    }
                    canvas.drawPath(pathC, paint);
                }
            }));
        }
        if (drawable == null) {
            drawable = getResources().getDrawable(R$drawable.nx_bg_ripple);
            Intrinsics.checkNotNullExpressionValue(drawable, "resources.getDrawable(R.drawable.nx_bg_ripple)");
        }
        this.backgroundDrawable = drawable;
        this._$_findViewCache = new LinkedHashMap();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearButton, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…rButton, defStyleAttr, 0)");
        this.isShowOutline = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearButton_nxOutlineShow, false);
        typedArrayObtainStyledAttributes.recycle();
        vhc.b(this, false);
        ngcVar.a(this, context, getFillPaint(), this.isShowOutline);
    }

    public /* synthetic */ NearButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.buttonStyle : i);
    }
}
