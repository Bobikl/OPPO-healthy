package com.heytap.health.cervical_vertebra.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.b2n;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NB\u001b\b\u0016\u0012\u0006\u0010L\u001a\u00020K\u0012\b\u0010P\u001a\u0004\u0018\u00010O¢\u0006\u0004\bM\u0010QB#\b\u0016\u0012\u0006\u0010L\u001a\u00020K\u0012\b\u0010P\u001a\u0004\u0018\u00010O\u0012\u0006\u0010R\u001a\u00020\u0003¢\u0006\u0004\bM\u0010SJ\u001c\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u001c\u0010\n\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0014J\b\u0010\u0019\u001a\u00020\u0007H\u0002J\u0010\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\f\u0010!\u001a\u00020\u000b*\u00020\u000bH\u0002J\f\u0010\"\u001a\u00020\u000b*\u00020\u000bH\u0002R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010$R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010(R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010*R\u0016\u0010,\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010+R\u0016\u0010-\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010+R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010.R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010/R\u0016\u00101\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010+R\u0016\u00103\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010.R\u0016\u00105\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010+R\u0016\u00107\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010+R\u0016\u00109\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010+R\u0016\u0010;\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010.R\u0016\u0010=\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010+R\u0016\u0010?\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010+R\u0016\u0010A\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010+R\u0016\u0010C\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010+R\u0016\u0010E\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010+R\u0018\u0010H\u001a\u00020\u000b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0018\u0010J\u001a\u00020\u000b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010G¨\u0006T"}, d2 = {"Lcom/heytap/health/cervical_vertebra/view/CSMobilityResultProgressBar;", "Landroid/view/View;", "", "", ParserTag.TAG_COLORS, "", "refresh", "", MapSchema.FIELD_NAME_KEY, "levels", "o", "", "data", "", "dataText", LogFieldKey.MESSAGE_KEY, "color", "n", ParserTag.TAG_TEXT_COLOR, "j", "cursorColor", LogFieldKey.LEVEL_KEY, "Landroid/graphics/Canvas;", "canvas", "onDraw", "f", "_textSize", MapSchema.FIELD_NAME_ENTRY, b2n.f, b2n.g, "Landroid/graphics/RectF;", "b", "i", LogFieldKey.PROCESS_NAME_KEY, "a", "", "Ljava/util/List;", "colorArr", "levelArr", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mPaint", "Ljava/lang/Float;", UserInfo.SEX_FEMALE, "cursorWidth", "cursorHeight", "I", "Ljava/lang/String;", "q", "dataTextPadding", "r", "dataTextColor", "s", "barHeight", "t", "gap", "u", "bottomTextSize", "v", "bottomTextColor", "w", "bottomTextPadding", "x", "contentWidth", "y", "contentHeight", "z", "contentX0", "A", "contentY0", "d", "(I)F", "sp", "c", "dp", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0})
public final class CSMobilityResultProgressBar extends View {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public float contentY0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public List<Integer> colorArr;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<Integer> levelArr;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public Paint mPaint;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Float data;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public float cursorWidth;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public float cursorHeight;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public int cursorColor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public String dataText;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float dataTextPadding;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int dataTextColor;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public float barHeight;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public float gap;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public float bottomTextSize;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public int bottomTextColor;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public float bottomTextPadding;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public float contentWidth;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public float contentHeight;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public float contentX0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CSMobilityResultProgressBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorArr = CollectionsKt__CollectionsKt.mutableListOf(-15602, -14758451, -13395457);
        this.levelArr = CollectionsKt__CollectionsKt.mutableListOf(0, 60, 80, 90);
        this.mPaint = new Paint();
        this.cursorWidth = c(4);
        this.cursorHeight = c(20);
        this.cursorColor = -16777216;
        this.dataText = "";
        this.dataTextPadding = c(6);
        this.dataTextColor = -654311424;
        this.barHeight = c(12);
        this.bottomTextSize = d(12);
        this.bottomTextColor = 1291845632;
        this.bottomTextPadding = c(8);
        f();
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

    /* JADX WARN: Code duplicated, block: B:13:0x0066  */
    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    public final RectF b(float data) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = this.contentX0;
        int iIntValue = ((Number) CollectionsKt___CollectionsKt.last((List) this.levelArr)).intValue();
        int iIntValue2 = ((Number) CollectionsKt___CollectionsKt.first((List) this.levelArr)).intValue();
        float fAbs = this.contentWidth / Math.abs(iIntValue - iIntValue2);
        List<Integer> list = this.levelArr;
        if (data < list.get(list.size() - 1).intValue()) {
            if (data <= this.levelArr.get(0).intValue()) {
                f3 = 0;
            } else {
                f = (data - iIntValue2) * fAbs;
                f2 = this.cursorWidth / 2.0f;
            }
            float f8 = f7 + f3;
            f4 = this.cursorHeight;
            f5 = this.barHeight;
            if (f4 > f5) {
                f6 = (f4 - f5) / 2.0f;
            } else {
                f6 = 0.0f;
            }
            float fE = ((this.contentY0 + e(this.bottomTextSize)) + this.dataTextPadding) - f6;
            return new RectF(f8, fE, this.cursorWidth + f8, this.cursorHeight + fE);
        }
        f = this.contentWidth;
        f2 = this.cursorWidth;
        f3 = f - f2;
        float f9 = f7 + f3;
        f4 = this.cursorHeight;
        f5 = this.barHeight;
        if (f4 > f5) {
            f6 = (f4 - f5) / 2.0f;
        } else {
            f6 = 0.0f;
        }
        float fE2 = ((this.contentY0 + e(this.bottomTextSize)) + this.dataTextPadding) - f6;
        return new RectF(f9, fE2, this.cursorWidth + f9, this.cursorHeight + fE2);
    }

    public final float c(int i) {
        return a(i);
    }

    public final float d(int i) {
        return p(i);
    }

    public final float e(float _textSize) {
        Paint paint = new Paint(1);
        paint.setTextSize(_textSize);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public final void f() {
        this.mPaint.setAntiAlias(true);
        this.mPaint.setPathEffect(new CornerPathEffect(2.0f));
        this.mPaint.setStyle(Paint.Style.FILL);
    }

    public final void g(Canvas canvas) {
        float f = this.contentX0;
        Path path = new Path();
        float fE = this.contentY0 + e(this.bottomTextSize) + this.dataTextPadding;
        float fAbs = this.contentWidth / Math.abs(((Number) CollectionsKt___CollectionsKt.last((List) this.levelArr)).intValue() - ((Number) CollectionsKt___CollectionsKt.first((List) this.levelArr)).intValue());
        Path path2 = new Path();
        Float f2 = this.data;
        if (f2 != null) {
            Intrinsics.checkNotNull(f2);
            RectF rectFB = b(f2.floatValue());
            float f3 = rectFB.left;
            float f4 = this.cursorWidth;
            float f5 = 2;
            path2.addRect(f3 - (f4 / f5), rectFB.top, rectFB.right + (f4 / f5), rectFB.bottom, Path.Direction.CW);
        }
        int size = this.levelArr.size();
        int i = 0;
        while (i < size) {
            if (i != 0) {
                int i2 = i - 1;
                float fIntValue = (this.levelArr.get(i).intValue() - this.levelArr.get(i2).intValue()) * fAbs;
                canvas.save();
                path.reset();
                path.addRect(f, fE, f + fIntValue, fE + this.barHeight, Path.Direction.CW);
                path.op(path2, Path.Op.DIFFERENCE);
                canvas.clipPath(path);
                f += fIntValue + this.gap;
                Paint paint = this.mPaint;
                List<Integer> list = this.colorArr;
                paint.setColor(list.get(i2 % list.size()).intValue());
                float f6 = this.contentX0;
                canvas.drawRect(f6, fE, this.contentWidth + f6, this.barHeight + fE, this.mPaint);
                canvas.restore();
            }
            i++;
            size = size;
            path2 = path2;
        }
    }

    public final void h(Canvas canvas, float data) {
        RectF rectFB = b(data);
        Path path = new Path();
        path.addRect(rectFB, Path.Direction.CW);
        this.mPaint.setColor(this.cursorColor);
        this.mPaint.setPathEffect(new CornerPathEffect(9.0f));
        canvas.drawPath(path, this.mPaint);
        String str = this.dataText;
        float fE = e(this.bottomTextSize);
        float fMeasureText = this.mPaint.measureText(str);
        float f = rectFB.left;
        float f2 = this.cursorWidth;
        float f3 = fMeasureText / 2.0f;
        float f4 = ((f2 / 2.0f) + f) - f3;
        float f5 = f + (f2 / 2.0f) + f3;
        float f6 = this.contentX0;
        float f7 = this.contentWidth;
        if (f5 >= f6 + f7) {
            f4 = (f6 + f7) - fMeasureText;
        } else if (f4 <= f6) {
            f4 = f6;
        }
        this.mPaint.setColor(this.dataTextColor);
        canvas.drawText(str, f4, this.contentY0 + fE, this.mPaint);
    }

    public final void i(Canvas canvas) {
        this.mPaint.setTextSize(this.bottomTextSize);
        this.mPaint.setColor(this.bottomTextColor);
        int iIntValue = ((Number) CollectionsKt___CollectionsKt.last((List) this.levelArr)).intValue();
        int iIntValue2 = ((Number) CollectionsKt___CollectionsKt.first((List) this.levelArr)).intValue();
        float fAbs = this.contentWidth / Math.abs(iIntValue - iIntValue2);
        float fE = this.contentY0 + (e(this.bottomTextSize) * 2) + this.dataTextPadding + this.barHeight + this.bottomTextPadding;
        float f = this.contentX0 + this.contentWidth;
        int size = this.levelArr.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            String strValueOf = String.valueOf(this.levelArr.get(size).intValue());
            float fMeasureText = this.mPaint.measureText(strValueOf);
            if (size == 0) {
                f = this.contentX0;
            } else if (size == this.levelArr.size() - 1) {
                f = (this.contentX0 + this.contentWidth) - fMeasureText;
            } else {
                float fIntValue = this.contentX0 + ((this.levelArr.get(size).intValue() - iIntValue2) * fAbs);
                float f2 = fMeasureText / 2.0f;
                float f3 = fIntValue - f2;
                if (fMeasureText + f3 > f) {
                    f3 -= f2;
                }
                f = f3;
            }
            canvas.drawText(strValueOf, f, fE, this.mPaint);
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final void j(int textColor, boolean refresh) {
        this.bottomTextColor = textColor;
        if (refresh) {
            invalidate();
        }
    }

    public final void k(@NotNull List<Integer> colors, boolean refresh) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.colorArr.clear();
        if (colors.isEmpty()) {
            this.colorArr.add(-15602);
        } else {
            this.colorArr.addAll(colors);
        }
        if (refresh) {
            invalidate();
        }
    }

    public final void l(int cursorColor, boolean refresh) {
        this.cursorColor = cursorColor;
        if (refresh) {
            invalidate();
        }
    }

    public final void m(float data, @NotNull String dataText, boolean refresh) {
        Intrinsics.checkNotNullParameter(dataText, "dataText");
        this.data = Float.valueOf(data);
        this.dataText = dataText;
        if (refresh) {
            invalidate();
        }
    }

    public final void n(int color, boolean refresh) {
        this.dataTextColor = color;
        if (refresh) {
            invalidate();
        }
    }

    public final void o(@NotNull List<Integer> levels, boolean refresh) {
        Intrinsics.checkNotNullParameter(levels, "levels");
        this.levelArr.clear();
        if (levels.size() < 2) {
            this.levelArr.add(0);
            this.levelArr.add(100);
        } else {
            this.levelArr.addAll(levels);
            CollectionsKt__MutableCollectionsJVMKt.sort(this.levelArr);
        }
        if (refresh) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.levelArr.size() < 2) {
            return;
        }
        this.contentX0 = getPaddingStart();
        this.contentY0 = getPaddingTop();
        this.contentWidth = (canvas.getWidth() - getPaddingStart()) - getPaddingEnd();
        this.contentHeight = (canvas.getHeight() - getPaddingTop()) - getPaddingBottom();
        i(canvas);
        g(canvas);
        Float f = this.data;
        if (f != null) {
            h(canvas, f.floatValue());
        }
    }

    public final float p(float f) {
        Resources resources;
        Context context = getContext();
        if (context == null) {
            resources = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(resources, "{\n            Resources.getSystem()\n        }");
        } else {
            resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "{\n            c.resources\n        }");
        }
        return TypedValue.applyDimension(2, f, resources.getDisplayMetrics());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CSMobilityResultProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorArr = CollectionsKt__CollectionsKt.mutableListOf(-15602, -14758451, -13395457);
        this.levelArr = CollectionsKt__CollectionsKt.mutableListOf(0, 60, 80, 90);
        this.mPaint = new Paint();
        this.cursorWidth = c(4);
        this.cursorHeight = c(20);
        this.cursorColor = -16777216;
        this.dataText = "";
        this.dataTextPadding = c(6);
        this.dataTextColor = -654311424;
        this.barHeight = c(12);
        this.bottomTextSize = d(12);
        this.bottomTextColor = 1291845632;
        this.bottomTextPadding = c(8);
        f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CSMobilityResultProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorArr = CollectionsKt__CollectionsKt.mutableListOf(-15602, -14758451, -13395457);
        this.levelArr = CollectionsKt__CollectionsKt.mutableListOf(0, 60, 80, 90);
        this.mPaint = new Paint();
        this.cursorWidth = c(4);
        this.cursorHeight = c(20);
        this.cursorColor = -16777216;
        this.dataText = "";
        this.dataTextPadding = c(6);
        this.dataTextColor = -654311424;
        this.barHeight = c(12);
        this.bottomTextSize = d(12);
        this.bottomTextColor = 1291845632;
        this.bottomTextPadding = c(8);
        f();
    }
}
