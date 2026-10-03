package com.heytap.device.bpg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010*\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0014J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014R\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006-"}, d2 = {"Lcom/heytap/device/bpg/StepProgressView;", "Landroid/view/View;", "", "steps", "", "setTotalSteps", "step", "setCurrentStep", "Landroid/graphics/Canvas;", "canvas", "onDraw", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/RectF;", "i", "Lkotlin/Lazy;", "getBgRect", "()Landroid/graphics/RectF;", "bgRect", "j", "getProgressRect", "progressRect", "Landroid/graphics/Paint;", MapSchema.FIELD_NAME_KEY, "Landroid/graphics/Paint;", "backgroundPaint", LogFieldKey.LEVEL_KEY, "progressPaint", "", LogFieldKey.MESSAGE_KEY, UserInfo.SEX_FEMALE, ParserTag.TAG_CORNER_RADIUS, "n", "I", "totalSteps", "o", "currentStep", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "device_third_impl_release"}, k = 1, mv = {1, 8, 0})
public final class StepProgressView extends View {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy bgRect;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy progressRect;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Paint backgroundPaint;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Paint progressPaint;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final float cornerRadius;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int totalSteps;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int currentStep;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StepProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final RectF getBgRect() {
        return (RectF) this.bgRect.getValue();
    }

    private final RectF getProgressRect() {
        return (RectF) this.progressRect.getValue();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        int i;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float fCoerceAtMost = RangesKt___RangesKt.coerceAtMost(this.cornerRadius, height / 2);
        if (this.totalSteps <= 0) {
            return;
        }
        getBgRect().set(0.0f, 0.0f, width, height);
        canvas.drawRoundRect(getBgRect(), fCoerceAtMost, fCoerceAtMost, this.backgroundPaint);
        int i2 = this.currentStep;
        if (i2 < 0 || i2 >= (i = this.totalSteps)) {
            return;
        }
        float f = width / i;
        float f2 = i2 * f;
        getProgressRect().set(f2, 0.0f, f + f2, height);
        canvas.drawRoundRect(getProgressRect(), fCoerceAtMost, fCoerceAtMost, this.progressPaint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
    }

    public final void setCurrentStep(int step) {
        this.currentStep = RangesKt___RangesKt.coerceIn(step, 0, this.totalSteps - 1);
        invalidate();
    }

    public final void setTotalSteps(int steps) {
        if (steps <= 0) {
            steps = 1;
        }
        this.totalSteps = steps;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StepProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ StepProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StepProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.bgRect = LazyKt__LazyJVMKt.lazy(new Function0<RectF>() { // from class: com.heytap.device.bpg.StepProgressView$bgRect$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final RectF invoke() {
                return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            }
        });
        this.progressRect = LazyKt__LazyJVMKt.lazy(new Function0<RectF>() { // from class: com.heytap.device.bpg.StepProgressView$progressRect$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final RectF invoke() {
                return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            }
        });
        Paint paint = new Paint(1);
        paint.setColor(335544320);
        paint.setStyle(Paint.Style.FILL);
        this.backgroundPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(-16777216);
        paint2.setStyle(Paint.Style.FILL);
        this.progressPaint = paint2;
        this.cornerRadius = 7.0f;
        this.totalSteps = 1;
    }
}
