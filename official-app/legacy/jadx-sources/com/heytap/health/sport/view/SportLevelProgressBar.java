package com.heytap.health.sport.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.FontRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.c8l;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010d\u001a\u00020c¢\u0006\u0004\be\u0010fB\u001b\b\u0016\u0012\u0006\u0010d\u001a\u00020c\u0012\b\u0010h\u001a\u0004\u0018\u00010g¢\u0006\u0004\be\u0010iB#\b\u0016\u0012\u0006\u0010d\u001a\u00020c\u0012\b\u0010h\u001a\u0004\u0018\u00010g\u0012\u0006\u0010j\u001a\u00020\b¢\u0006\u0004\be\u0010kJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002J\u001a\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\fH\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\fJ\u001c\u0010\u001d\u001a\u00020\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001b2\u0006\u0010\u0019\u001a\u00020\fJ\u001c\u0010\u001f\u001a\u00020\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b2\u0006\u0010\u0019\u001a\u00020\fJ\u000e\u0010 \u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fJ>\u0010'\u001a\u00020\u000226\u0010\u0013\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0!J\u0016\u0010)\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\fJ\u0016\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\fJ\u0016\u0010-\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\fJ\u0010\u0010/\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020\bJ\u000e\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020&J\u001f\u00102\u001a\u00020\u00022\u0006\u00100\u001a\u00020&2\b\u00101\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b2\u00103J\u0016\u00105\u001a\u00020\u00022\u0006\u00104\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\fJ\u0018\u00108\u001a\u00020\u00022\u0006\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\bH\u0014J\u0010\u00109\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\b0:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010;R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010;R\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020&0:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010;R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010?R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010ER\u0016\u0010G\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010?R\u0016\u0010H\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010?R\u0016\u0010I\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010?R\u0016\u0010J\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010?R\u0016\u0010K\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010?R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010?R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010O\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010?R\u0016\u0010Q\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010?R\u0016\u0010S\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010?R\u0016\u00104\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010MR*\u0010W\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020&\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Z\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\"\u0010`\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010Y\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0016\u0010b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010Y¨\u0006l"}, d2 = {"Lcom/heytap/health/sport/view/SportLevelProgressBar;", "Landroid/view/View;", "", "f", "", ParserTag.TAG_TEXT_SIZE, "d", "c", "", "i", "Landroid/graphics/Canvas;", "canvas", "", "topNeedDrawText", "j", "Landroid/graphics/RectF;", "b", "underBar", MapSchema.FIELD_NAME_KEY, LogFieldKey.LEVEL_KEY, "size", MapSchema.FIELD_NAME_ENTRY, "dp", "a", ParserTag.TAG_DRAW, "refresh", b2n.f, "", ParserTag.TAG_COLORS, "n", "levels", "r", "setNumLabelUnderBar", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "index", "value", "", "setLevelFormatListener", "data", LogFieldKey.PROCESS_NAME_KEY, ParserTag.TAG_TEXT_COLOR, "s", "padding", "t", "fontId", "setFont", "font", Const.Arguments.Open.STYLE, "q", "(Ljava/lang/String;Ljava/lang/Integer;)V", "cursorColor", "o", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "onDraw", "", "Ljava/util/List;", "colorArr", "levelArr", "levelDesArr", UserInfo.SEX_FEMALE, "Landroid/graphics/Paint;", LogFieldKey.MESSAGE_KEY, "Landroid/graphics/Paint;", "mPaint", "Landroid/text/TextPaint;", "Landroid/text/TextPaint;", "mTextPaint", "contentWith", "contentHeight", "contentX0", "contentY0", "barHeight", "u", "I", "v", "textPadding", "w", "cursorWidth", "x", "cursorHeight", "y", "z", "Lkotlin/jvm/functions/Function2;", "levelFormat", "A", "Z", "numLabelUnderBar", c8l.KEY_B, "getNeedDrawNumLabel", "()Z", "setNeedDrawNumLabel", "(Z)V", "needDrawNumLabel", "C", "isDrawCursor", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sport_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSportLevelProgressBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportLevelProgressBar.kt\ncom/heytap/health/sport/view/SportLevelProgressBar\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,377:1\n212#2,8:378\n*S KotlinDebug\n*F\n+ 1 SportLevelProgressBar.kt\ncom/heytap/health/sport/view/SportLevelProgressBar\n*L\n259#1:378,8\n*E\n"})
public final class SportLevelProgressBar extends View {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public boolean numLabelUnderBar;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public boolean needDrawNumLabel;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public boolean isDrawCursor;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public List<Integer> colorArr;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<Float> levelArr;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public List<String> levelDesArr;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public float data;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Paint mPaint;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextPaint mTextPaint;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public float contentWith;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public float contentHeight;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float contentX0;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public float contentY0;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public float barHeight;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public float textSize;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public int textColor;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public float textPadding;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public float cursorWidth;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public float cursorHeight;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public int cursorColor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    public Function2<? super Integer, ? super Float, String> levelFormat;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportLevelProgressBar(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorArr = CollectionsKt__CollectionsKt.mutableListOf(-1294786, -163034, -15602, -7940066, -14037656, -14259211);
        this.levelArr = CollectionsKt__CollectionsKt.mutableListOf(Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(2.0f), Float.valueOf(3.0f), Float.valueOf(4.0f), Float.valueOf(5.0f), Float.valueOf(6.0f));
        this.levelDesArr = new ArrayList();
        this.data = 2.8f;
        this.mPaint = new Paint();
        this.mTextPaint = new TextPaint();
        this.barHeight = a(12.0f);
        this.textSize = e(12.0f);
        this.textColor = 1291845632;
        this.textPadding = a(8.0f);
        this.cursorWidth = a(6.0f);
        this.cursorHeight = a(20.0f);
        this.cursorColor = -16777216;
        this.numLabelUnderBar = true;
        this.needDrawNumLabel = true;
        this.isDrawCursor = true;
        f();
    }

    public static /* synthetic */ void h(SportLevelProgressBar sportLevelProgressBar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z2 = false;
        }
        sportLevelProgressBar.g(z, z2);
    }

    public static final boolean m(SportLevelProgressBar sportLevelProgressBar, int i) {
        int i2;
        return sportLevelProgressBar.data >= sportLevelProgressBar.levelArr.get(i).floatValue() && (i2 = i + 1) < sportLevelProgressBar.levelArr.size() && sportLevelProgressBar.data < sportLevelProgressBar.levelArr.get(i2).floatValue();
    }

    public final float a(float dp) {
        return (dp * getContext().getResources().getDisplayMetrics().density) + 0.5f;
    }

    public final RectF b(boolean topNeedDrawText) {
        float fFloatValue;
        float size = (this.contentWith - this.cursorWidth) / (this.levelArr.size() - 1);
        float fIndexOf = this.contentX0;
        if (!this.levelArr.contains(Float.valueOf(this.data))) {
            float f = this.data;
            List<Float> list = this.levelArr;
            if (f >= list.get(list.size() - 1).floatValue()) {
                fFloatValue = (size * (this.levelArr.size() - 1)) - (this.cursorWidth / 2.0f);
            } else {
                if (this.data <= this.levelArr.get(0).floatValue()) {
                    fFloatValue = 0;
                } else {
                    int size2 = this.levelArr.size();
                    for (int i = 0; i < size2; i++) {
                        if (i != 0 && this.data < this.levelArr.get(i).floatValue()) {
                            int i2 = i - 1;
                            fFloatValue = size * (i2 + ((this.data - this.levelArr.get(i2).floatValue()) / (this.levelArr.get(i).floatValue() - this.levelArr.get(i2).floatValue())));
                        }
                    }
                }
            }
            fIndexOf += fFloatValue;
            break;
        } else {
            fIndexOf += this.levelArr.indexOf(Float.valueOf(this.data)) * size;
        }
        float fD = topNeedDrawText ? this.contentY0 + d(this.textSize) + this.textPadding : this.contentY0;
        return new RectF(fIndexOf, fD, this.cursorWidth + fIndexOf, this.cursorHeight + fD);
    }

    public final float c(float textSize) {
        Paint paint = new Paint();
        paint.setTextSize(textSize);
        return paint.getFontMetrics().leading - paint.getFontMetrics().top;
    }

    public final float d(float textSize) {
        Paint paint = new Paint();
        paint.setTextSize(textSize);
        return paint.getFontMetrics().bottom - paint.getFontMetrics().top;
    }

    public final float e(float size) {
        Resources resources;
        Context context = getContext();
        if (context == null) {
            resources = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(resources, "{\n            Resources.getSystem()\n        }");
        } else {
            resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "{\n            c.resources\n        }");
        }
        return TypedValue.applyDimension(2, size, resources.getDisplayMetrics());
    }

    public final void f() {
        this.mPaint.setAntiAlias(true);
        this.mPaint.setPathEffect(new CornerPathEffect(9.0f));
        this.mPaint.setStyle(Paint.Style.FILL);
    }

    public final void g(boolean draw, boolean refresh) {
        this.isDrawCursor = draw;
        if (refresh) {
            invalidate();
        }
    }

    public final boolean getNeedDrawNumLabel() {
        return this.needDrawNumLabel;
    }

    public final int i() {
        return (int) (getPaddingTop() + getPaddingBottom() + Math.max(this.cursorHeight, this.barHeight) + ((this.textPadding + d(this.textSize)) * (this.levelDesArr.isEmpty() ^ true ? 2 : 1)));
    }

    public final void j(Canvas canvas, boolean topNeedDrawText) throws Throwable {
        int i;
        float f = 3.0f;
        float size = ((this.contentWith - ((this.levelArr.size() - 2) * 3.0f)) - this.cursorWidth) / (this.levelArr.size() - 1);
        float f2 = this.contentX0 + (this.cursorWidth / 2.0f);
        RectF rectFB = b(topNeedDrawText);
        Path path = new Path();
        path.addRect(rectFB, Path.Direction.CW);
        float f3 = this.cursorHeight;
        float f4 = this.barHeight;
        float f5 = f3 > f4 ? (f3 - f4) / 2.0f : 0.0f;
        Path path2 = new Path();
        float fD = (!topNeedDrawText ? this.contentY0 : this.contentY0 + d(this.textSize) + this.textPadding) + f5;
        int size2 = this.levelArr.size();
        int i2 = 0;
        while (i2 < size2) {
            if (i2 != 0) {
                path2.reset();
                path2.addRect(f2, fD, f2 + size, fD + this.barHeight, Path.Direction.CW);
                if (this.isDrawCursor) {
                    path2.op(path, Path.Op.DIFFERENCE);
                }
                int iSave = canvas.save();
                canvas.clipPath(path2);
                float f6 = f2 + size + f;
                try {
                    Paint paint = this.mPaint;
                    List<Integer> list = this.colorArr;
                    paint.setColor(list.get((i2 - 1) % list.size()).intValue());
                    float f7 = this.contentX0;
                    float f8 = this.cursorWidth;
                    i = iSave;
                    try {
                        canvas.drawRect((f8 / 2.0f) + f7, fD, (f7 + this.contentWith) - (f8 / 2.0f), fD + this.barHeight, this.mPaint);
                        canvas.restoreToCount(i);
                        f2 = f6;
                    } catch (Throwable th) {
                        th = th;
                        canvas.restoreToCount(i);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    i = iSave;
                }
            }
            i2++;
            f = 3.0f;
        }
        if (this.isDrawCursor) {
            this.mPaint.setColor(this.cursorColor);
            path.reset();
            float f9 = rectFB.right;
            float f10 = rectFB.left;
            float f11 = (f9 - f10) * 0.12f;
            path.addRect(f10 + f11, rectFB.top, f9 - f11, rectFB.bottom, Path.Direction.CW);
            canvas.drawPath(path, this.mPaint);
        }
    }

    public final void k(Canvas canvas, boolean underBar, boolean topNeedDrawText) {
        float fMax;
        String strValueOf;
        if (this.needDrawNumLabel) {
            this.mTextPaint.setTextSize(this.textSize);
            this.mTextPaint.setColor(this.textColor);
            float size = (this.contentWith - this.cursorWidth) / (this.levelArr.size() - 1);
            float fC = c(this.textSize);
            if (underBar) {
                fMax = this.contentY0 + Math.max(this.cursorHeight, this.barHeight);
                fC = (fC + this.textPadding) * (topNeedDrawText ? 2.0f : 1.0f);
            } else {
                fMax = this.contentY0;
            }
            float f = fMax + fC;
            int size2 = this.levelArr.size();
            for (int i = 0; i < size2; i++) {
                if (i != 0 && i != this.levelArr.size() - 1) {
                    Function2<? super Integer, ? super Float, String> function2 = this.levelFormat;
                    if (function2 == null || (strValueOf = function2.invoke(Integer.valueOf(i), this.levelArr.get(i))) == null) {
                        strValueOf = String.valueOf(this.levelArr.get(i).floatValue());
                    }
                    canvas.drawText(strValueOf, ((this.contentX0 + (this.cursorWidth / 2.0f)) + (i * size)) - (this.mTextPaint.measureText(strValueOf) / 2.0f), f, this.mTextPaint);
                }
            }
        }
    }

    public final void l(Canvas canvas, boolean underBar) {
        float fMax;
        this.mTextPaint.setTextSize(this.textSize);
        float size = (this.contentWith - this.cursorWidth) / (this.levelArr.size() - 1);
        float fC = c(this.textSize);
        int size2 = this.levelArr.size();
        int i = 0;
        while (i < size2 && i < this.levelDesArr.size() && i < this.levelArr.size() - 1) {
            String str = this.levelDesArr.get(i);
            this.mTextPaint.setColor((!m(this, i) || i >= this.colorArr.size()) ? this.textColor : this.colorArr.get(i).intValue());
            float fMeasureText = ((this.contentX0 + (this.cursorWidth / 2.0f)) + ((i + 0.5f) * size)) - (this.mTextPaint.measureText(str) / 2.0f);
            if (underBar) {
                float f = 2;
                fMax = this.contentY0 + Math.max(this.cursorHeight, this.barHeight) + (fC * f) + (this.textPadding * f);
            } else {
                fMax = this.contentY0 + fC;
            }
            canvas.drawText(str, fMeasureText, fMax, this.mTextPaint);
            i++;
        }
    }

    public final void n(@NotNull List<Integer> colors, boolean refresh) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.colorArr.clear();
        if (colors.isEmpty()) {
            this.colorArr.add(-7940066);
        } else {
            this.colorArr.addAll(colors);
        }
        if (refresh) {
            invalidate();
        }
    }

    public final void o(int cursorColor, boolean refresh) {
        this.cursorColor = cursorColor;
        if (refresh) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) throws Throwable {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.levelArr.size() < 2) {
            return;
        }
        this.contentX0 = getPaddingStart();
        this.contentY0 = getPaddingTop();
        this.contentWith = (getWidth() - getPaddingStart()) - getPaddingEnd();
        this.contentHeight = (getHeight() - getPaddingTop()) - getPaddingBottom();
        boolean z = !this.numLabelUnderBar || (this.levelDesArr.isEmpty() ^ true);
        k(canvas, this.numLabelUnderBar, z);
        j(canvas, z);
        if (!this.levelDesArr.isEmpty()) {
            l(canvas, !this.numLabelUnderBar);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            size2 = i();
        }
        setMeasuredDimension(size, size2);
    }

    public final void p(float data, boolean refresh) {
        this.data = data;
        if (refresh) {
            invalidate();
        }
    }

    public final void q(@NotNull String font, @Nullable Integer style) {
        Intrinsics.checkNotNullParameter(font, "font");
        this.mTextPaint.setTypeface(Typeface.create(font, style != null ? style.intValue() : 0));
        invalidate();
    }

    public final void r(@NotNull List<Float> levels, boolean refresh) {
        Intrinsics.checkNotNullParameter(levels, "levels");
        this.levelArr.clear();
        if (levels.size() < 2) {
            this.levelArr.add(Float.valueOf(0.0f));
            this.levelArr.add(Float.valueOf(100.0f));
        } else {
            this.levelArr.addAll(levels);
            CollectionsKt__MutableCollectionsJVMKt.sort(this.levelArr);
        }
        if (refresh) {
            invalidate();
        }
    }

    public final void s(int textColor, boolean refresh) {
        this.textColor = textColor;
        if (refresh) {
            invalidate();
        }
    }

    public final void setFont(@FontRes int fontId) {
        this.mTextPaint.setTypeface(ResourcesCompat.getFont(getContext(), fontId));
        invalidate();
    }

    public final void setLevelFormatListener(@NotNull Function2<? super Integer, ? super Float, String> l2) {
        Intrinsics.checkNotNullParameter(l2, "l");
        this.levelFormat = l2;
    }

    public final void setNeedDrawNumLabel(boolean z) {
        this.needDrawNumLabel = z;
    }

    public final void setNumLabelUnderBar(boolean underBar) {
        this.numLabelUnderBar = underBar;
    }

    public final void t(float padding, boolean refresh) {
        this.textPadding = padding;
        if (refresh) {
            invalidate();
        }
    }

    public final void setFont(@NotNull String font) {
        Intrinsics.checkNotNullParameter(font, "font");
        q(font, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportLevelProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorArr = CollectionsKt__CollectionsKt.mutableListOf(-1294786, -163034, -15602, -7940066, -14037656, -14259211);
        this.levelArr = CollectionsKt__CollectionsKt.mutableListOf(Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(2.0f), Float.valueOf(3.0f), Float.valueOf(4.0f), Float.valueOf(5.0f), Float.valueOf(6.0f));
        this.levelDesArr = new ArrayList();
        this.data = 2.8f;
        this.mPaint = new Paint();
        this.mTextPaint = new TextPaint();
        this.barHeight = a(12.0f);
        this.textSize = e(12.0f);
        this.textColor = 1291845632;
        this.textPadding = a(8.0f);
        this.cursorWidth = a(6.0f);
        this.cursorHeight = a(20.0f);
        this.cursorColor = -16777216;
        this.numLabelUnderBar = true;
        this.needDrawNumLabel = true;
        this.isDrawCursor = true;
        f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportLevelProgressBar(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.colorArr = CollectionsKt__CollectionsKt.mutableListOf(-1294786, -163034, -15602, -7940066, -14037656, -14259211);
        this.levelArr = CollectionsKt__CollectionsKt.mutableListOf(Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(2.0f), Float.valueOf(3.0f), Float.valueOf(4.0f), Float.valueOf(5.0f), Float.valueOf(6.0f));
        this.levelDesArr = new ArrayList();
        this.data = 2.8f;
        this.mPaint = new Paint();
        this.mTextPaint = new TextPaint();
        this.barHeight = a(12.0f);
        this.textSize = e(12.0f);
        this.textColor = 1291845632;
        this.textPadding = a(8.0f);
        this.cursorWidth = a(6.0f);
        this.cursorHeight = a(20.0f);
        this.cursorColor = -16777216;
        this.numLabelUnderBar = true;
        this.needDrawNumLabel = true;
        this.isDrawCursor = true;
        f();
    }
}
