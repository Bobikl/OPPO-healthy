package com.heytap.nearx.uikit.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.heytap.nearx.uikit.R$color;
import com.heytap.nearx.uikit.R$styleable;
import com.heytap.nearx.uikit.internal.widget.InnerButton;
import com.oplus.aiunit.vision.rkc;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.DeprecationLevel;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Deprecated(level = DeprecationLevel.WARNING, message = "不再维护，请使用NearButton", replaceWith = @ReplaceWith(expression = "NearButton", imports = {}))
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/heytap/nearx/uikit/widget/NearOutlineButton;", "Lcom/heytap/nearx/uikit/internal/widget/InnerButton;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "isShowOutline", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class NearOutlineButton extends InnerButton {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private boolean isShowOutline;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearOutlineButton(@NotNull Context context) {
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

    @Override // com.heytap.nearx.uikit.internal.widget.InnerButton, android.widget.TextView, android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.isShowOutline) {
            float f = 2;
            canvas.drawPath(rkc.a().c(new Rect((int) (getFillPaint().getStrokeWidth() / f), (int) (getFillPaint().getStrokeWidth() / f), (int) (getWidth() - (getFillPaint().getStrokeWidth() / f)), (int) (getHeight() - (getFillPaint().getStrokeWidth() / f))), getRadius()), getFillPaint());
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearOutlineButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearOutlineButton(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isShowOutline = true;
        this._$_findViewCache = new LinkedHashMap();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NearButton, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…rButton, defStyleAttr, 0)");
        this.isShowOutline = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NearButton_nxOutlineShow, true);
        typedArrayObtainStyledAttributes.recycle();
        getFillPaint().setStyle(Paint.Style.STROKE);
        getFillPaint().setColor(context.getResources().getColor(R$color.NXcolor_borderless_button_solid_color_normal));
        getFillPaint().setStrokeWidth(TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics()));
        setAnimType(0);
        setBackgroundColor(0);
    }

    public /* synthetic */ NearOutlineButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.buttonStyle : i);
    }
}
