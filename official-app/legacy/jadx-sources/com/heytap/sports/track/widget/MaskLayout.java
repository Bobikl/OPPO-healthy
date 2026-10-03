package com.heytap.sports.track.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.wrf;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010+\u001a\u00020*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b.\u0010/J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0014R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\"\u0010)\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00060"}, d2 = {"Lcom/heytap/sports/track/widget/MaskLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "w", b2n.g, "oldw", "oldh", "", "onSizeChanged", "Landroid/view/MotionEvent;", "ev", "", "dispatchTouchEvent", "event", "onTouchEvent", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "Landroid/graphics/Paint;", "i", "Landroid/graphics/Paint;", "getGradientPaint", "()Landroid/graphics/Paint;", "gradientPaint", "j", "I", "getBlack50", "()I", "black50", MapSchema.FIELD_NAME_KEY, "getBlack20", "black20", LogFieldKey.LEVEL_KEY, "getBlack00", "black00", LogFieldKey.MESSAGE_KEY, "Z", "getMask", "()Z", "setMask", "(Z)V", "mask", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class MaskLayout extends ConstraintLayout {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Paint gradientPaint;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int black50;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int black20;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int black00;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean mask;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public MaskLayout(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.mask) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.gradientPaint);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@Nullable MotionEvent ev) {
        if (getAlpha() == 1.0f) {
            return super.dispatchTouchEvent(ev);
        }
        return false;
    }

    public final int getBlack00() {
        return this.black00;
    }

    public final int getBlack20() {
        return this.black20;
    }

    public final int getBlack50() {
        return this.black50;
    }

    @NotNull
    public final Paint getGradientPaint() {
        return this.gradientPaint;
    }

    public final boolean getMask() {
        return this.mask;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        Paint paint = this.gradientPaint;
        float height = getHeight();
        int i = this.black50;
        int i2 = this.black20;
        int i3 = this.black00;
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{i, i2, i3, i3, i2, i}, new float[]{0.0f, 0.2f, 0.37f, 0.63f, 0.8f, 1.0f}, Shader.TileMode.REPEAT));
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        return true;
    }

    public final void setMask(boolean z) {
        this.mask = z;
    }

    public /* synthetic */ MaskLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MaskLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.gradientPaint = new Paint(1);
        this.black50 = Color.parseColor("#80000000");
        this.black20 = Color.parseColor("#36000000");
        this.black00 = Color.parseColor(wrf.DEFAULT_COLOR);
        this.mask = true;
    }
}
