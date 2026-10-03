package com.heytap.store.base.widget.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.heytap.store.platform.tools.SizeUtils;
import com.oplus.aiunit.vision.lo9;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.weatherservicesdk.data.Weather;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u001c\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/base/widget/view/OStoreGoodsLabelView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defaultStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dashPath", "Landroid/graphics/Path;", "dashPathEffect", "Landroid/graphics/DashPathEffect;", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Paint;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", ClickApiEntity.SET_TEXT, "text", "", "type", "Landroid/widget/TextView$BufferType;", "Widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreGoodsLabelView extends AppCompatTextView {
    private Path dashPath;
    private DashPathEffect dashPathEffect;

    @NotNull
    private final Paint paint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreGoodsLabelView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        int iMin = Math.min(getWidth(), getHeight()) / 2;
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(Color.parseColor("#80000000"));
        Path path = null;
        this.paint.setPathEffect(null);
        if (canvas != null) {
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, iMin, this.paint);
        }
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setColor(Color.parseColor("#33FFFFFF"));
        Paint paint = this.paint;
        DashPathEffect dashPathEffect = this.dashPathEffect;
        if (dashPathEffect == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dashPathEffect");
            dashPathEffect = null;
        }
        paint.setPathEffect(dashPathEffect);
        Paint paint2 = this.paint;
        SizeUtils sizeUtils = SizeUtils.INSTANCE;
        paint2.setStrokeWidth(sizeUtils.dp2px(0.4f));
        Path path2 = this.dashPath;
        if (path2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dashPath");
            path2 = null;
        }
        path2.addCircle(getWidth() / 2.0f, getHeight() / 2.0f, iMin - sizeUtils.dp2px(1.6f), Path.Direction.CW);
        if (canvas != null) {
            Path path3 = this.dashPath;
            if (path3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dashPath");
                path3 = null;
            }
            canvas.drawPath(path3, this.paint);
        }
        Path path4 = this.dashPath;
        if (path4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dashPath");
        } else {
            path = path4;
        }
        path.reset();
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView
    public void setText(@Nullable CharSequence text, @Nullable TextView.BufferType type) {
        if (text == null || text.length() == 0) {
            setVisibility(8);
            super.setText(text, type);
            return;
        }
        setVisibility(0);
        if (text.length() > 4) {
            text = text.subSequence(0, 4).toString();
        }
        if (text.length() == 4) {
            text = text.subSequence(0, 2).toString() + Weather.SEPARATOR + text.subSequence(2, text.length()).toString();
            Intrinsics.checkNotNullExpressionValue(text, "{\n                //换为两行….toString()\n            }");
        }
        super.setText(text, type);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreGoodsLabelView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OStoreGoodsLabelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OStoreGoodsLabelView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#80000000"));
        paint.setAntiAlias(true);
        this.paint = paint;
        setGravity(17);
        setTextColor(-1);
        this.dashPathEffect = new DashPathEffect(new float[]{4.0f, 3.0f}, 0.0f);
        this.dashPath = new Path();
        setForceDarkAllowed(false);
    }
}
