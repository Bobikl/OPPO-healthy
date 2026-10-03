package com.heytap.health.main.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.health.impl.R$color;
import com.heytap.health.menstrual.data.MenstrualChartType;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.lo9;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bO\u0010PB\u001b\b\u0016\u0012\u0006\u0010N\u001a\u00020M\u0012\b\u0010R\u001a\u0004\u0018\u00010Q¢\u0006\u0004\bO\u0010SB#\b\u0016\u0012\u0006\u0010N\u001a\u00020M\u0012\b\u0010R\u001a\u0004\u0018\u00010Q\u0012\u0006\u0010T\u001a\u00020\u0002¢\u0006\u0004\bO\u0010UJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001c\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\f\u0010\u0016\u001a\u00020\u0015*\u00020\u0015H\u0002R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0014\u0010(\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u0016\u0010+\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010#R\u0016\u0010/\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010#R\u0014\u00101\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010#R\u0016\u00103\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010#R\u0016\u00105\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010#R\u0016\u00107\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010#R\u0016\u00109\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010#R\u0016\u0010;\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010#R\"\u0010A\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010 \u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010E\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010 \u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\"\u0010I\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010 \u001a\u0004\bG\u0010>\"\u0004\bH\u0010@R\u0018\u0010L\u001a\u00020\u0015*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006V"}, d2 = {"Lcom/heytap/health/main/view/MenstrualChart;", "Landroid/view/View;", "", "index", "", "refresh", "", "f", "", "Lcom/heytap/health/menstrual/data/MenstrualChartType;", "list", b2n.g, "Lcom/heytap/health/main/view/MenstrualIndicatorType;", "type", b2n.f, "Landroid/graphics/Canvas;", "canvas", "onDraw", "c", MapSchema.FIELD_NAME_ENTRY, "d", "", "a", "Landroid/graphics/Paint;", "i", "Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "", "j", "Ljava/util/List;", "typeList", MapSchema.FIELD_NAME_KEY, "I", "currentIndex", LogFieldKey.LEVEL_KEY, UserInfo.SEX_FEMALE, "indicatorWidth", LogFieldKey.MESSAGE_KEY, "indicatorHeight", "n", "indicatorMarginBottom", "o", "Lcom/heytap/health/main/view/MenstrualIndicatorType;", "indicatorType", LogFieldKey.PROCESS_NAME_KEY, "barHeight", "q", "barWidth", "r", "barMaxWidth", "s", "gap", "t", "contentWidth", "u", "contentHeight", "v", "contentX0", "w", "contentY0", "x", "getOvulationColor", "()I", "setOvulationColor", "(I)V", "ovulationColor", "y", "getOvulationDayColor", "setOvulationDayColor", "ovulationDayColor", "z", "getEmptyColor", "setEmptyColor", "emptyColor", "b", "(I)F", "dp", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenstrualChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenstrualChart.kt\ncom/heytap/health/main/view/MenstrualChart\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,251:1\n212#2,8:252\n*S KotlinDebug\n*F\n+ 1 MenstrualChart.kt\ncom/heytap/health/main/view/MenstrualChart\n*L\n189#1:252,8\n*E\n"})
public final class MenstrualChart extends View {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<MenstrualChartType> typeList;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int currentIndex;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final float indicatorWidth;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final float indicatorHeight;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final float indicatorMarginBottom;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public MenstrualIndicatorType indicatorType;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final float barHeight;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float barWidth;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public final float barMaxWidth;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public float gap;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public float contentWidth;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public float contentHeight;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public float contentX0;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public float contentY0;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public int ovulationColor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public int ovulationDayColor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public int emptyColor;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenstrualChartType.values().length];
            try {
                iArr[MenstrualChartType.MENSTRUATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenstrualChartType.PREDICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MenstrualChartType.OVULATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MenstrualChartType.OVULATION_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MenstrualChartType.EMPTY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenstrualChart(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint();
        this.typeList = new ArrayList();
        this.indicatorWidth = b(10);
        this.indicatorHeight = b(7);
        this.indicatorMarginBottom = b(3);
        this.indicatorType = MenstrualIndicatorType.EMPTY;
        this.barHeight = b(30);
        this.barWidth = b(10);
        this.barMaxWidth = b(10);
        this.gap = b(6);
        c();
    }

    public final float a(float f) {
        Resources resources;
        Context context = getContext();
        if (context == null) {
            resources = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(resources, "{\n            Resources.getSystem()\n        }");
        } else {
            resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "{\n            c.resources\n        }");
        }
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    public final float b(int i) {
        return a(i);
    }

    public final void c() {
        this.paint.setAntiAlias(true);
        this.paint.setPathEffect(new CornerPathEffect(b(12)));
        this.paint.setStyle(Paint.Style.FILL);
        this.ovulationColor = getContext().getColor(R$color.health_menstrual_ovulation);
        this.ovulationDayColor = getContext().getColor(R$color.health_menstrual_ovulation_day);
        this.emptyColor = getContext().getColor(R$color.health_0000001F);
    }

    public final void d(Canvas canvas) throws Throwable {
        int i;
        int i2;
        float f;
        char c2;
        int i3;
        int i4;
        int size = this.typeList.size();
        float f2 = 2;
        this.paint.setPathEffect(new CornerPathEffect(this.barWidth / f2));
        Path path = new Path();
        int i5 = 1;
        float f3 = this.contentX0 + (((this.contentWidth - (this.barWidth * size)) - (this.gap * (size - 1))) / f2);
        float f4 = this.contentY0 + this.indicatorHeight + this.indicatorMarginBottom;
        int color = getContext().getColor(R$color.health_menstrual_cycle);
        int color2 = getContext().getColor(R$color.health_menstrual_predict);
        int color3 = getContext().getColor(R$color.health_FBD5DE);
        float fB = b(1);
        float fB2 = b(6);
        int size2 = this.typeList.size();
        int i6 = 0;
        float f5 = f3;
        while (i6 < size2) {
            canvas.save();
            path.reset();
            RectF rectF = new RectF(f5, f4, this.barWidth + f5, this.barHeight + f4);
            path.addRect(rectF, Path.Direction.CW);
            int i7 = a.$EnumSwitchMapping$0[this.typeList.get(i6).ordinal()];
            if (i7 == i5) {
                i = i6;
                i2 = size2;
                f = fB;
                c2 = 2;
                this.paint.setColor(color);
                canvas.drawPath(path, this.paint);
            } else if (i7 != 2) {
                if (i7 == 3) {
                    this.paint.setColor(this.ovulationColor);
                    canvas.drawPath(path, this.paint);
                } else if (i7 == 4) {
                    this.paint.setColor(this.ovulationDayColor);
                    canvas.drawPath(path, this.paint);
                } else if (i7 == 5) {
                    this.paint.setColor(this.emptyColor);
                    canvas.drawPath(path, this.paint);
                }
                i = i6;
                i2 = size2;
                f = fB;
                c2 = 2;
            } else {
                this.paint.setColor(color2);
                canvas.drawPath(path, this.paint);
                Paint paint = new Paint();
                paint.setPathEffect(new CornerPathEffect(fB));
                paint.setColor(color3);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(b(2));
                Path path2 = new Path();
                float f6 = this.barWidth / f2;
                path2.addRoundRect(rectF, f6, f6, Path.Direction.CW);
                int iSave = canvas.save();
                canvas.clipPath(path2);
                float f7 = -360.0f;
                float f8 = 0.0f;
                while (f7 <= canvas.getHeight()) {
                    try {
                        try {
                            i4 = iSave;
                            int i8 = i6;
                            int i9 = size2;
                            float f9 = fB;
                            try {
                                canvas.drawLine(0.0f, f7, canvas.getWidth(), f8, paint);
                                f7 += fB2;
                                f8 += fB2;
                                size2 = i9;
                                iSave = i4;
                                i6 = i8;
                                fB = f9;
                            } catch (Throwable th) {
                                th = th;
                                i3 = i4;
                                canvas.restoreToCount(i3);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            i4 = iSave;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        i3 = iSave;
                    }
                }
                i = i6;
                i2 = size2;
                f = fB;
                c2 = 2;
                canvas.restoreToCount(iSave);
            }
            canvas.restore();
            f5 += this.barWidth + this.gap;
            i6 = i + 1;
            size2 = i2;
            fB = f;
            i5 = 1;
        }
    }

    public final void e(Canvas canvas) {
        Drawable drawable = AppCompatResources.getDrawable(getContext(), this.indicatorType.getResId());
        if (drawable == null) {
            return;
        }
        int size = this.typeList.size();
        float f = this.contentX0;
        float f2 = this.contentWidth;
        float f3 = this.barWidth;
        float f4 = this.gap;
        float f5 = (f2 - (size * f3)) - ((size - 1) * f4);
        float f6 = 2;
        float f7 = (((f + (f5 / f6)) + (this.currentIndex * (f4 + f3))) + (f3 / f6)) - (this.indicatorWidth / f6);
        float f8 = this.contentY0;
        drawable.setBounds(new Rect((int) f7, (int) f8, (int) (f7 + this.indicatorWidth), (int) (f8 + this.indicatorHeight)));
        drawable.draw(canvas);
    }

    public final void f(int index, boolean refresh) {
        this.currentIndex = index;
        if (refresh) {
            invalidate();
        }
    }

    public final void g(@NotNull MenstrualIndicatorType type, boolean refresh) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.indicatorType = type;
        if (refresh) {
            invalidate();
        }
    }

    public final int getEmptyColor() {
        return this.emptyColor;
    }

    public final int getOvulationColor() {
        return this.ovulationColor;
    }

    public final int getOvulationDayColor() {
        return this.ovulationDayColor;
    }

    public final void h(@NotNull List<? extends MenstrualChartType> list, boolean refresh) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.typeList.clear();
        this.typeList.addAll(list);
        if (refresh) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) throws Throwable {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.contentX0 = getPaddingStart();
        this.contentY0 = getPaddingTop();
        this.contentWidth = (getWidth() - getPaddingStart()) - getPaddingEnd();
        this.contentHeight = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float size = (this.contentWidth - (this.gap * (this.typeList.size() - 1))) / this.typeList.size();
        this.barWidth = size;
        float f = this.barMaxWidth;
        if (size > f) {
            this.barWidth = f;
        }
        e(canvas);
        d(canvas);
    }

    public final void setEmptyColor(int i) {
        this.emptyColor = i;
    }

    public final void setOvulationColor(int i) {
        this.ovulationColor = i;
    }

    public final void setOvulationDayColor(int i) {
        this.ovulationDayColor = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenstrualChart(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint();
        this.typeList = new ArrayList();
        this.indicatorWidth = b(10);
        this.indicatorHeight = b(7);
        this.indicatorMarginBottom = b(3);
        this.indicatorType = MenstrualIndicatorType.EMPTY;
        this.barHeight = b(30);
        this.barWidth = b(10);
        this.barMaxWidth = b(10);
        this.gap = b(6);
        c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenstrualChart(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.paint = new Paint();
        this.typeList = new ArrayList();
        this.indicatorWidth = b(10);
        this.indicatorHeight = b(7);
        this.indicatorMarginBottom = b(3);
        this.indicatorType = MenstrualIndicatorType.EMPTY;
        this.barHeight = b(30);
        this.barWidth = b(10);
        this.barMaxWidth = b(10);
        this.gap = b(6);
        c();
    }
}
