package com.heytap.sporthealth.fit.weiget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.graphics.drawable.DrawableKt;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.fit.R$drawable;
import com.heytap.sporthealth.fit.weiget.FatBurningEfficiencyView;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.lo9;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010:\u001a\u000209\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010=\u001a\u00020\u0002¢\u0006\u0004\b>\u0010?J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0014J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0002R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR&\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010*\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0013R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00108\u001a\u00020\u0018*\u0002058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006@"}, d2 = {"Lcom/heytap/sporthealth/fit/weiget/FatBurningEfficiencyView;", "Landroid/view/View;", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "w", b2n.g, "oldw", "oldh", "onSizeChanged", "Landroid/graphics/Canvas;", "canvas", "onDraw", "target", "c", "Landroid/graphics/Paint;", "i", "Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "j", "I", "lineNum", "", MapSchema.FIELD_NAME_KEY, UserInfo.SEX_FEMALE, "lineWidth", LogFieldKey.LEVEL_KEY, "lineOffset", LogFieldKey.MESSAGE_KEY, "lineHeight", "", "Lkotlin/Pair;", "n", "[Lkotlin/Pair;", ParserTag.TAG_COLORS, "o", "getProgress", "()I", ClickApiEntity.SET_PROGRESS, "(I)V", "progress", LogFieldKey.PROCESS_NAME_KEY, "trianglePaint", "Landroid/graphics/Bitmap;", "q", "Landroid/graphics/Bitmap;", "triangleBitmap", "Landroid/animation/ValueAnimator;", "r", "Landroid/animation/ValueAnimator;", "progressAnimator", "", "b", "(Ljava/lang/Number;)F", "dpf", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "fitness_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFatBurningEfficiencyView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FatBurningEfficiencyView.kt\ncom/heytap/sporthealth/fit/weiget/FatBurningEfficiencyView\n+ 2 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,93:1\n470#2:94\n470#2:95\n470#2:96\n470#2:97\n*S KotlinDebug\n*F\n+ 1 FatBurningEfficiencyView.kt\ncom/heytap/sporthealth/fit/weiget/FatBurningEfficiencyView\n*L\n27#1:94\n28#1:95\n29#1:96\n50#1:97\n*E\n"})
public final class FatBurningEfficiencyView extends View {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int lineNum;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final float lineWidth;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final float lineOffset;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final float lineHeight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Pair<Integer, Integer>[] colors;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int progress;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final Paint trianglePaint;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final Bitmap triangleBitmap;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public ValueAnimator progressAnimator;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FatBurningEfficiencyView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void d(FatBurningEfficiencyView this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this$0.progress = ((Integer) animatedValue).intValue();
        this$0.invalidate();
    }

    public final float b(Number number) {
        return ejg.l(getContext(), number.intValue());
    }

    public final void c(int target) {
        if (target > this.lineNum) {
            return;
        }
        ValueAnimator valueAnimator = this.progressAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.progress, target);
        this.progressAnimator = valueAnimatorOfInt;
        Intrinsics.checkNotNull(valueAnimatorOfInt);
        valueAnimatorOfInt.setDuration(300L);
        ValueAnimator valueAnimator2 = this.progressAnimator;
        Intrinsics.checkNotNull(valueAnimator2);
        valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.oplus.aiunit.vision.r77
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                FatBurningEfficiencyView.d(this.i, valueAnimator3);
            }
        });
        ValueAnimator valueAnimator3 = this.progressAnimator;
        Intrinsics.checkNotNull(valueAnimator3);
        valueAnimator3.start();
    }

    public final int getProgress() {
        return this.progress;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float f = this.lineWidth;
        float f2 = f / 2;
        float f3 = f + this.lineOffset;
        int i = this.lineNum;
        for (int i2 = 0; i2 < i; i2++) {
            float f4 = (i2 * f3) + f2;
            int i3 = i2 / 10;
            if (i2 < this.progress) {
                this.paint.setColor(this.colors[i3].getFirst().intValue());
            } else {
                this.paint.setColor(this.colors[i3].getSecond().intValue());
            }
            canvas.drawLine(f4, this.triangleBitmap.getHeight() / 2.0f, f4, getHeight(), this.paint);
            if (i2 == this.progress - 1) {
                Bitmap bitmap = this.triangleBitmap;
                canvas.drawBitmap(bitmap, (f4 - (bitmap.getWidth() / 2.0f)) + 0.4f, 0.0f, this.trianglePaint);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float f = this.lineWidth;
        int i = this.lineNum;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((f * i) + (this.lineOffset * (i - 1))), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (this.lineHeight + (this.triangleBitmap.getHeight() / 2)), 1073741824));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.paint.setStrokeWidth(this.lineWidth);
        this.paint.setColor(Color.parseColor("#1F8AFD"));
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FatBurningEfficiencyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FatBurningEfficiencyView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FatBurningEfficiencyView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint(1);
        this.lineNum = 30;
        this.lineWidth = b(Float.valueOf(1.6f));
        this.lineOffset = b(Float.valueOf(1.04f));
        this.lineHeight = b(Float.valueOf(6.4f));
        this.colors = new Pair[]{TuplesKt.to(Integer.valueOf(Color.parseColor("#1F8AFD")), Integer.valueOf(Color.parseColor("#401F8AFD"))), TuplesKt.to(Integer.valueOf(Color.parseColor("#27E568")), Integer.valueOf(Color.parseColor("#4027E568"))), TuplesKt.to(Integer.valueOf(Color.parseColor("#FAC637")), Integer.valueOf(Color.parseColor("#40FAC637")))};
        this.progress = 1;
        this.trianglePaint = new Paint(1);
        Drawable drawable = getResources().getDrawable(R$drawable.fit_video_triangle, null);
        Intrinsics.checkNotNullExpressionValue(drawable, "resources.getDrawable(R.…fit_video_triangle, null)");
        this.triangleBitmap = DrawableKt.toBitmap$default(drawable, (int) b(Float.valueOf(11.2f)), (int) b(Float.valueOf(5.6f)), null, 4, null);
    }
}
