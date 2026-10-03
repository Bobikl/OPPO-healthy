package com.heytap.store.homemodule.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.store.base.core.util.DisplayUtil;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J0\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"H\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\n¨\u0006&"}, d2 = {"Lcom/heytap/store/homemodule/view/HomeBlackCardAreaLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "desPaint", "Landroid/graphics/Paint;", "getDesPaint", "()Landroid/graphics/Paint;", "value", "", "isClip", "()Z", "setClip", "(Z)V", "mRadius", "", "getMRadius", "()F", "rounRect", "Landroid/graphics/RectF;", "getRounRect", "()Landroid/graphics/RectF;", "srcPaint", "getSrcPaint", ParserTag.TAG_DRAW, "", "canvas", "Landroid/graphics/Canvas;", "onLayout", "changed", y04.TIME_STYLE_LEFT_DIR_NAME, "", "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HomeBlackCardAreaLayout extends ConstraintLayout {

    @NotNull
    private final Paint desPaint;
    private boolean isClip;
    private final float mRadius;

    @NotNull
    private final RectF rounRect;

    @NotNull
    private final Paint srcPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public HomeBlackCardAreaLayout(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (!this.isClip) {
            super.draw(canvas);
            return;
        }
        canvas.saveLayer(this.rounRect, this.srcPaint, 31);
        RectF rectF = this.rounRect;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.bottom;
        canvas.drawRect(f, (f2 + f3) / 2, rectF.right, f3, this.srcPaint);
        RectF rectF2 = this.rounRect;
        float f4 = this.mRadius;
        canvas.drawRoundRect(rectF2, f4, f4, this.srcPaint);
        canvas.saveLayer(this.rounRect, this.desPaint, 31);
        super.draw(canvas);
        canvas.restore();
    }

    @NotNull
    public final Paint getDesPaint() {
        return this.desPaint;
    }

    public final float getMRadius() {
        return this.mRadius;
    }

    @NotNull
    public final RectF getRounRect() {
        return this.rounRect;
    }

    @NotNull
    public final Paint getSrcPaint() {
        return this.srcPaint;
    }

    /* JADX INFO: renamed from: isClip, reason: from getter */
    public final boolean getIsClip() {
        return this.isClip;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.rounRect.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    public final void setClip(boolean z) {
        this.isClip = z;
        invalidate();
    }

    public /* synthetic */ HomeBlackCardAreaLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HomeBlackCardAreaLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.rounRect = new RectF();
        Paint paint = new Paint();
        this.desPaint = paint;
        Paint paint2 = new Paint();
        this.srcPaint = paint2;
        this.mRadius = DisplayUtil.dip2px(24.0f);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setAntiAlias(true);
        paint2.setAntiAlias(true);
    }
}
