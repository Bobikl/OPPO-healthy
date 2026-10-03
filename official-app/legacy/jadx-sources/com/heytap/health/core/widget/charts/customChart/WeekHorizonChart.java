package com.heytap.health.core.widget.charts.customChart;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.core.widget.charts.utils.AnimatorUtil;
import com.heytap.health.lib_chart.R$color;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.lo9;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0002@AB\u001b\u0012\u0006\u0010<\u001a\u00020;\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b=\u0010>J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002J\u001e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0014J\u000e\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\fJ\u000e\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0002J\u0006\u0010\u001c\u001a\u00020\u0002R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010#R\u001c\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010#\u001a\u0004\b1\u0010&\"\u0004\b2\u0010(R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b8\u0010#R\u0014\u00109\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b9\u0010#R\u0014\u0010:\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b:\u0010#R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010#¨\u0006B"}, d2 = {"Lcom/heytap/health/core/widget/charts/customChart/WeekHorizonChart;", "Landroid/view/View;", "", "countTextMaxWidth", "calMaxTextWidth", "maxBarWidth", "", "getBarWidthList", ParserTag.TAG_TEXT_SIZE, "countTextHeight", "Landroid/graphics/Canvas;", "canvas", "", "drawTopText", "drawBarText", "barWidth", "drawBar", "drawRightText", "dpValue", "", "dp", "onDraw", "Lcom/heytap/health/core/widget/charts/customChart/WeekHorizonChart$b;", "horizonData", "refreshData", "animateX", "phaseX", "setPhaseX", "getPhaseX", "Lcom/heytap/health/core/widget/charts/customChart/WeekHorizonChart$b;", "getHorizonData", "()Lcom/heytap/health/core/widget/charts/customChart/WeekHorizonChart$b;", "setHorizonData", "(Lcom/heytap/health/core/widget/charts/customChart/WeekHorizonChart$b;)V", "barSpacePercent", UserInfo.SEX_FEMALE, "rightTextMaxWidth", "getRightTextMaxWidth", "()F", "setRightTextMaxWidth", "(F)V", "spaceByRightText", "I", "spaceByStartText", "spaceByTopText", "barMaxWidth", "barWidthList", "Ljava/util/List;", "barHeight", "getBarHeight", "setBarHeight", "Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "topTextSize", "rightTextSize", "barMinWidth", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/heytap/health/core/widget/charts/customChart/WeekHorizonChart$b;)V", "Companion", "a", "b", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension({"SMAP\nWeekHorizonChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeekHorizonChart.kt\ncom/heytap/health/core/widget/charts/customChart/WeekHorizonChart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,227:1\n1549#2:228\n1620#2,2:229\n1622#2:232\n1549#2:233\n1620#2,3:234\n1864#2,3:237\n1864#2,3:240\n1864#2,3:243\n1864#2,3:246\n1#3:231\n*S KotlinDebug\n*F\n+ 1 WeekHorizonChart.kt\ncom/heytap/health/core/widget/charts/customChart/WeekHorizonChart\n*L\n87#1:228\n87#1:229,2\n87#1:232\n104#1:233\n104#1:234,3\n117#1:237,3\n133#1:240,3\n146#1:243,3\n168#1:246,3\n*E\n"})
public final class WeekHorizonChart extends View {

    @NotNull
    public static final String TAG = "StepDetailHorizonChart";
    private float barHeight;
    private float barMaxWidth;
    private final float barMinWidth;
    private final float barSpacePercent;

    @NotNull
    private List<Float> barWidthList;

    @Nullable
    private b horizonData;

    @NotNull
    private final Paint paint;
    private float phaseX;
    private float rightTextMaxWidth;
    private final float rightTextSize;
    private final int spaceByRightText;
    private final int spaceByStartText;
    private final int spaceByTopText;
    private final float topTextSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeekHorizonChart(@NotNull Context context, @Nullable b bVar) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.horizonData = bVar;
        this.barSpacePercent = 0.625f;
        this.spaceByRightText = dp(6.0f);
        this.spaceByStartText = dp(0.0f);
        this.spaceByTopText = dp(4.0f);
        this.barWidthList = CollectionsKt__CollectionsKt.emptyList();
        Paint paint = new Paint();
        this.paint = paint;
        this.topTextSize = 12.0f;
        this.rightTextSize = 14.0f;
        this.barMinWidth = 12.0f;
        paint.setAntiAlias(true);
        this.phaseX = 1.0f;
    }

    private final float calMaxTextWidth() {
        List<Float> listD;
        String strValueOf;
        b bVar = this.horizonData;
        if (bVar != null && (listD = bVar.d()) != null) {
            List<Float> list = listD;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                float fFloatValue = ((Number) it.next()).floatValue();
                b bVar2 = this.horizonData;
                Intrinsics.checkNotNull(bVar2);
                if (bVar2.e() != null) {
                    strValueOf = bVar2.e().invoke(Float.valueOf(fFloatValue));
                } else {
                    b bVar3 = this.horizonData;
                    Intrinsics.checkNotNull(bVar3);
                    if (bVar3.getBarValueInteger()) {
                        strValueOf = String.valueOf((int) fFloatValue);
                    } else {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        strValueOf = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, 1));
                        Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                    }
                }
                arrayList.add(Float.valueOf(this.paint.measureText(strValueOf)));
            }
            Float fM5728maxOrNull = CollectionsKt___CollectionsKt.m5728maxOrNull((Iterable<Float>) arrayList);
            if (fM5728maxOrNull != null) {
                return fM5728maxOrNull.floatValue();
            }
        }
        return 0.0f;
    }

    private final float countTextHeight(float textSize) {
        this.paint.setTextSize(dp(textSize));
        return this.paint.getFontMetrics().bottom - this.paint.getFontMetrics().top;
    }

    private final float countTextMaxWidth() {
        this.paint.setTextSize(dp(this.rightTextSize));
        this.paint.setStyle(Paint.Style.FILL);
        return calMaxTextWidth() + this.spaceByRightText;
    }

    private final int dp(float dpValue) {
        return ejg.a(getContext(), dpValue);
    }

    private final void drawBar(Canvas canvas, List<Float> barWidth) {
        this.paint.setStyle(Paint.Style.FILL);
        float fCountTextHeight = countTextHeight(this.topTextSize);
        int i = 0;
        for (Object obj : barWidth) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((Number) obj).floatValue();
            Paint paint = this.paint;
            b bVar = this.horizonData;
            Intrinsics.checkNotNull(bVar);
            paint.setColor(bVar.a().get(i).intValue());
            float f = this.barHeight;
            float f2 = f + (this.barSpacePercent * f) + fCountTextHeight;
            int i3 = this.spaceByTopText;
            float f3 = (i * (f2 + i3)) + fCountTextHeight + i3;
            canvas.drawRoundRect(AnimatorUtil.INSTANCE.f(this.phaseX, getPaddingLeft(), f3, getPaddingLeft() + fFloatValue, f3 + this.barHeight), dp(2.0f), dp(2.0f), this.paint);
            i = i2;
        }
    }

    private final void drawBarText(Canvas canvas) {
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setTextAlign(Paint.Align.LEFT);
        this.paint.setTextSize(dp(10.0f));
        b bVar = this.horizonData;
        Intrinsics.checkNotNull(bVar);
        int i = 0;
        for (Object obj : bVar.b()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Paint paint = this.paint;
            b bVar2 = this.horizonData;
            Intrinsics.checkNotNull(bVar2);
            paint.setColor(bVar2.c().get(i).intValue());
            float f = this.barHeight;
            float f2 = i * (f + (this.barSpacePercent * f));
            float f3 = this.paint.getFontMetrics().bottom - this.paint.getFontMetrics().top;
            canvas.drawText((String) obj, getPaddingLeft() + this.spaceByStartText, ((f2 + ((this.barHeight - f3) / 2)) + f3) - this.paint.getFontMetrics().descent, this.paint);
            i = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00e4  */
    private final void drawRightText(Canvas canvas, List<Float> barWidth) {
        String strValueOf;
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setTextAlign(Paint.Align.LEFT);
        this.paint.setTextSize(dp(this.rightTextSize));
        float fCountTextHeight = countTextHeight(this.topTextSize);
        b bVar = this.horizonData;
        Intrinsics.checkNotNull(bVar);
        int i = 0;
        for (Object obj : bVar.d()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            float fFloatValue = ((Number) obj).floatValue();
            float f = this.barHeight;
            float f2 = f + (this.barSpacePercent * f) + fCountTextHeight;
            int i3 = this.spaceByTopText;
            float f3 = (i * (f2 + i3)) + fCountTextHeight + i3;
            float f4 = this.paint.getFontMetrics().bottom - this.paint.getFontMetrics().top;
            float f5 = ((f3 + ((this.barHeight - f4) / 2)) + f4) - this.paint.getFontMetrics().descent;
            Paint paint = this.paint;
            b bVar2 = this.horizonData;
            Intrinsics.checkNotNull(bVar2);
            Integer num = (Integer) CollectionsKt___CollectionsKt.getOrNull(bVar2.g(), i);
            paint.setColor(num != null ? num.intValue() : getContext().getColor(R$color.lib_chart_000000));
            b bVar3 = this.horizonData;
            if (bVar3 == null) {
                strValueOf = "";
            } else {
                if (bVar3.e() != null) {
                    strValueOf = bVar3.e().invoke(Float.valueOf(fFloatValue));
                } else {
                    b bVar4 = this.horizonData;
                    Intrinsics.checkNotNull(bVar4);
                    if (bVar4.getBarValueInteger()) {
                        strValueOf = String.valueOf((int) fFloatValue);
                    } else {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        strValueOf = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(fFloatValue)}, 1));
                        Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
                    }
                }
                if (strValueOf == null) {
                    strValueOf = "";
                }
            }
            canvas.drawText(strValueOf, (barWidth.get(i).floatValue() * this.phaseX) + this.spaceByRightText + getPaddingLeft(), f5, this.paint);
            i = i2;
        }
    }

    private final void drawTopText(Canvas canvas) {
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setTextAlign(Paint.Align.LEFT);
        this.paint.setTextSize(dp(this.topTextSize));
        float fCountTextHeight = countTextHeight(this.topTextSize);
        b bVar = this.horizonData;
        Intrinsics.checkNotNull(bVar);
        int i = 0;
        for (Object obj : bVar.b()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            this.paint.setColor(getContext().getColor(R$color.lib_chart_core_color_8C000000));
            float f = this.barHeight;
            float f2 = i * (f + (this.barSpacePercent * f) + fCountTextHeight + this.spaceByTopText);
            float f3 = this.paint.getFontMetrics().bottom - this.paint.getFontMetrics().top;
            canvas.drawText((String) obj, getPaddingLeft() + this.spaceByStartText, ((f2 + ((this.barHeight - f3) / 2)) + f3) - this.paint.getFontMetrics().descent, this.paint);
            i = i2;
        }
    }

    private final List<Float> getBarWidthList(float maxBarWidth) {
        b bVar = this.horizonData;
        Intrinsics.checkNotNull(bVar);
        Float fM5728maxOrNull = CollectionsKt___CollectionsKt.m5728maxOrNull((Iterable<Float>) bVar.d());
        float fFloatValue = fM5728maxOrNull != null ? fM5728maxOrNull.floatValue() : 1.0f;
        b bVar2 = this.horizonData;
        Intrinsics.checkNotNull(bVar2);
        List<Float> listD = bVar2.d();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(RangesKt___RangesKt.coerceAtLeast((((Number) it.next()).floatValue() / fFloatValue) * maxBarWidth, dp(this.barMinWidth))));
        }
        return arrayList;
    }

    public final void animateX() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "phaseX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(466L);
        objectAnimatorOfFloat.start();
    }

    public final float getBarHeight() {
        return this.barHeight;
    }

    @Nullable
    public final b getHorizonData() {
        return this.horizonData;
    }

    @NotNull
    public final Paint getPaint() {
        return this.paint;
    }

    public final float getPhaseX() {
        return this.phaseX;
    }

    public final float getRightTextMaxWidth() {
        return this.rightTextMaxWidth;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.horizonData == null) {
            return;
        }
        float f = 2;
        this.barHeight = ((canvas.getHeight() - (countTextHeight(this.topTextSize) * f)) - (this.spaceByTopText * 2)) / (f + this.barSpacePercent);
        this.rightTextMaxWidth = countTextMaxWidth();
        float width = ((canvas.getWidth() - this.rightTextMaxWidth) - getPaddingLeft()) - getPaddingRight();
        this.barMaxWidth = width;
        this.barWidthList = getBarWidthList(width);
        drawTopText(canvas);
        drawBar(canvas, this.barWidthList);
        drawRightText(canvas, this.barWidthList);
    }

    public final void refreshData(@NotNull b horizonData) {
        Intrinsics.checkNotNullParameter(horizonData, "horizonData");
        a7b.f(TAG, "refreshData:" + horizonData);
        this.horizonData = horizonData;
        invalidate();
    }

    public final void setBarHeight(float f) {
        this.barHeight = f;
    }

    public final void setHorizonData(@Nullable b bVar) {
        this.horizonData = bVar;
    }

    public final void setPhaseX(float phaseX) {
        this.phaseX = phaseX;
        invalidate();
    }

    public final void setRightTextMaxWidth(float f) {
        this.rightTextMaxWidth = f;
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u000b\u0010\u000eR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u001b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR%\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\""}, d2 = {"Lcom/heytap/health/core/widget/charts/customChart/WeekHorizonChart$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "barValue", "b", "barColor", "c", "barText", "barTextColor", MapSchema.FIELD_NAME_ENTRY, b2n.f, "rightTextColor", "f", "Z", "()Z", "barValueInteger", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "barValueFormat", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLkotlin/jvm/functions/Function1;)V", "lib_chart_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final List<Float> barValue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final List<Integer> barColor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<String> barText;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final List<Integer> barTextColor;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Integer> rightTextColor;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public final boolean barValueInteger;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public final Function1<Float, String> barValueFormat;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull List<Float> barValue, @NotNull List<Integer> barColor, @NotNull List<String> barText, @NotNull List<Integer> barTextColor, @NotNull List<Integer> rightTextColor, boolean z, @Nullable Function1<? super Float, String> function1) {
            Intrinsics.checkNotNullParameter(barValue, "barValue");
            Intrinsics.checkNotNullParameter(barColor, "barColor");
            Intrinsics.checkNotNullParameter(barText, "barText");
            Intrinsics.checkNotNullParameter(barTextColor, "barTextColor");
            Intrinsics.checkNotNullParameter(rightTextColor, "rightTextColor");
            this.barValue = barValue;
            this.barColor = barColor;
            this.barText = barText;
            this.barTextColor = barTextColor;
            this.rightTextColor = rightTextColor;
            this.barValueInteger = z;
            this.barValueFormat = function1;
        }

        @NotNull
        public final List<Integer> a() {
            return this.barColor;
        }

        @NotNull
        public final List<String> b() {
            return this.barText;
        }

        @NotNull
        public final List<Integer> c() {
            return this.barTextColor;
        }

        @NotNull
        public final List<Float> d() {
            return this.barValue;
        }

        @Nullable
        public final Function1<Float, String> e() {
            return this.barValueFormat;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.areEqual(this.barValue, bVar.barValue) && Intrinsics.areEqual(this.barColor, bVar.barColor) && Intrinsics.areEqual(this.barText, bVar.barText) && Intrinsics.areEqual(this.barTextColor, bVar.barTextColor) && Intrinsics.areEqual(this.rightTextColor, bVar.rightTextColor) && this.barValueInteger == bVar.barValueInteger && Intrinsics.areEqual(this.barValueFormat, bVar.barValueFormat);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getBarValueInteger() {
            return this.barValueInteger;
        }

        @NotNull
        public final List<Integer> g() {
            return this.rightTextColor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v9, types: [int] */
        public int hashCode() {
            int iHashCode = ((((((((this.barValue.hashCode() * 31) + this.barColor.hashCode()) * 31) + this.barText.hashCode()) * 31) + this.barTextColor.hashCode()) * 31) + this.rightTextColor.hashCode()) * 31;
            boolean z = this.barValueInteger;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int i = (iHashCode + r1) * 31;
            Function1<Float, String> function1 = this.barValueFormat;
            return i + (function1 == null ? 0 : function1.hashCode());
        }

        @NotNull
        public String toString() {
            return "HorizonData:" + this.barValue + ", " + this.barText;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ b(List list, List list2, List list3, List list4, List list5, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            List listListOf;
            if ((i & 16) != 0) {
                Context contextA = b78.a();
                int i2 = R$color.lib_chart_000000;
                listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(contextA.getColor(i2)), Integer.valueOf(b78.a().getColor(i2))});
            } else {
                listListOf = list5;
            }
            this(list, list2, list3, list4, listListOf, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : function1);
        }
    }

    public /* synthetic */ WeekHorizonChart(Context context, b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : bVar);
    }
}
