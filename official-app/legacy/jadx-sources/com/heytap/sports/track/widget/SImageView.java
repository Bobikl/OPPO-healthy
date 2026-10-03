package com.heytap.sports.track.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.ui.R$drawable;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.qtf;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006*"}, d2 = {"Lcom/heytap/sports/track/widget/SImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "w", b2n.g, "oldw", "oldh", "", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDrawForeground", "", "selected", "setSelected", "", "i", UserInfo.SEX_FEMALE, "getStrokWidth", "()F", "strokWidth", "j", "getCorner", "corner", "Landroid/graphics/RectF;", MapSchema.FIELD_NAME_KEY, "Landroid/graphics/RectF;", "getRonud", "()Landroid/graphics/RectF;", "ronud", "Landroid/graphics/Paint;", LogFieldKey.LEVEL_KEY, "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class SImageView extends AppCompatImageView {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final float strokWidth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final float corner;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final RectF ronud;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Paint paint;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/sports/track/widget/SImageView$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(@Nullable View view, @Nullable Outline outline) {
            if (view == null || outline == null) {
                return;
            }
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), qtf.c(18.0f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SImageView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        float fC = qtf.c(2.0f);
        this.strokWidth = fC;
        this.corner = qtf.c(17.0f);
        float f = 2;
        this.ronud = new RectF(fC / f, fC / f, 0.0f, 0.0f);
        Paint paint = new Paint(1);
        paint.setColor(Color.parseColor("#39BF56"));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fC);
        this.paint = paint;
        setImageResource(R$drawable.fit_default_img_holder);
        setOutlineProvider(new a());
        setClipToOutline(true);
    }

    public final float getCorner() {
        return this.corner;
    }

    @NotNull
    public final Paint getPaint() {
        return this.paint;
    }

    @NotNull
    public final RectF getRonud() {
        return this.ronud;
    }

    public final float getStrokWidth() {
        return this.strokWidth;
    }

    @Override // android.view.View
    public void onDrawForeground(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDrawForeground(canvas);
        if (isSelected()) {
            RectF rectF = this.ronud;
            float f = this.corner;
            canvas.drawRoundRect(rectF, f, f, this.paint);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        RectF rectF = this.ronud;
        float f = this.strokWidth;
        float f2 = 2;
        rectF.right = w - (f / f2);
        rectF.bottom = h - (f / f2);
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        invalidate();
    }
}
