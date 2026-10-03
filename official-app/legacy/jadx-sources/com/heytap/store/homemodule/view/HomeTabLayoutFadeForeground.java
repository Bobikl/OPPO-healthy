package com.heytap.store.homemodule.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.heytap.store.platform.tools.SizeUtils;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.lo9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u000eH\u0002J(\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\tH\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/heytap/store/homemodule/view/HomeTabLayoutFadeForeground;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Paint;", "drawChild", "", "canvas", "Landroid/graphics/Canvas;", "child", "Landroid/view/View;", "drawingTime", "", "drawFade", "", "isLeft", "onSizeChanged", "w", b2n.g, "oldw", "oldh", "Companion", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HomeTabLayoutFadeForeground extends FrameLayout {

    @NotNull
    private Paint paint;
    private static final float FADE_THICKNESS_PX = SizeUtils.INSTANCE.dp2px(16.0f);

    @NotNull
    private static final int[] FADE_COLORS = {-1, 0};

    @NotNull
    private static final float[] FADE_POSITION = {0.0f, 1.0f};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeTabLayoutFadeForeground(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    private final void drawFade(Canvas canvas, boolean isLeft) {
        int iSave = canvas.save();
        float height = (getHeight() - getWidth()) / 2.0f;
        canvas.rotate(isLeft ? 270.0f : 90.0f, getWidth() / 2.0f, getHeight() / 2.0f);
        canvas.translate(0.0f, height);
        canvas.drawRect(-height, 0.0f, getWidth() + height, FADE_THICKNESS_PX, this.paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(@NotNull Canvas canvas, @NotNull View child, long drawingTime) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(child, "child");
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean zDrawChild = super.drawChild(canvas, child, drawingTime);
        drawFade(canvas, true);
        drawFade(canvas, false);
        canvas.restoreToCount(iSaveLayer);
        return zDrawChild;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, FADE_THICKNESS_PX, FADE_COLORS, FADE_POSITION, Shader.TileMode.CLAMP));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeTabLayoutFadeForeground(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeTabLayoutFadeForeground(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.paint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }
}
