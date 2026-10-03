package com.heytap.health.blood.glucose.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.hfk;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\rB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b#\u0010$B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b#\u0010'B#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b#\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0003J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006+"}, d2 = {"Lcom/heytap/health/blood/glucose/view/GluStandardView;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "onDraw", "", "Lcom/heytap/health/blood/glucose/view/GluStandardView$a;", "list", "setData", "Landroid/content/Context;", "context", "b", "a", "i", "Ljava/util/List;", "dataList", "", "j", UserInfo.SEX_FEMALE, "intervalPx", MapSchema.FIELD_NAME_KEY, "radius", "Landroid/graphics/Paint;", LogFieldKey.LEVEL_KEY, "Landroid/graphics/Paint;", "progressPaint", "Landroid/graphics/RectF;", LogFieldKey.MESSAGE_KEY, "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/Path;", "n", "Landroid/graphics/Path;", "path", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
public final class GluStandardView extends View {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final List<a> dataList;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public float intervalPx;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public float radius;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Paint progressPaint;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public RectF rectF;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Path path;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/blood/glucose/view/GluStandardView$a;", "", "", "a", UserInfo.SEX_FEMALE, "c", "()F", "f", "(F)V", "startValue", "b", MapSchema.FIELD_NAME_ENTRY, "endValue", "", "I", "()I", "d", "(I)V", "color", "<init>", "()V", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public float startValue;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public float endValue;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public int color;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getColor() {
            return this.color;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getEndValue() {
            return this.endValue;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getStartValue() {
            return this.startValue;
        }

        public final void d(int i) {
            this.color = i;
        }

        public final void e(float f) {
            this.endValue = f;
        }

        public final void f(float f) {
            this.startValue = f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GluStandardView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dataList = new ArrayList();
        this.intervalPx = 1.0f;
        this.radius = 6.0f;
        this.rectF = new RectF();
        this.path = new Path();
        b(context);
    }

    public final void a(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        boolean z;
        boolean z2;
        if (this.dataList.isEmpty()) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        boolean z3 = false;
        float startValue = this.dataList.get(0).getStartValue();
        List<a> list = this.dataList;
        boolean z4 = true;
        float endValue = list.get(list.size() - 1).getEndValue();
        float fAbs = measuredWidth / Math.abs(endValue - startValue);
        int size = this.dataList.size();
        float f6 = 0.0f;
        int i = 0;
        float startValue2 = 0.0f;
        while (i < size) {
            a aVar = this.dataList.get(i);
            if (aVar.getStartValue() == aVar.getEndValue() ? z4 : z3) {
                z = z3;
                z2 = z4;
            } else {
                if (startValue2 <= f6) {
                    startValue2 = (aVar.getStartValue() - startValue) * fAbs;
                }
                float endValue2 = (aVar.getEndValue() - startValue) * fAbs;
                if (aVar.getStartValue() == startValue ? z4 : z3) {
                    f = this.radius;
                    f2 = startValue2;
                    f3 = f;
                } else {
                    f2 = startValue2 + (this.intervalPx / 2);
                    f = 0.0f;
                    f3 = 0.0f;
                }
                if (aVar.getEndValue() == endValue ? z4 : z3) {
                    f4 = this.radius;
                    f5 = f4;
                } else {
                    endValue2 -= this.intervalPx / 2;
                    f4 = 0.0f;
                    f5 = 0.0f;
                }
                z = false;
                z2 = true;
                float[] fArr = {f, f, f4, f4, f5, f5, f3, f3};
                Paint paint = this.progressPaint;
                if (paint != null) {
                    paint.reset();
                    paint.setColor(aVar.getColor());
                    RectF rectF = this.rectF;
                    rectF.left = f2;
                    f6 = 0.0f;
                    rectF.top = 0.0f;
                    rectF.right = endValue2;
                    rectF.bottom = measuredHeight;
                    this.path.reset();
                    this.path.addRoundRect(this.rectF, fArr, Path.Direction.CCW);
                    if (canvas != null) {
                        canvas.drawPath(this.path, paint);
                    }
                } else {
                    f6 = 0.0f;
                }
                startValue2 = endValue2;
            }
            i++;
            z4 = z2;
            z3 = z;
        }
    }

    @SuppressLint({"CustomViewStyleable"})
    public final void b(Context context) {
        this.intervalPx = hfk.a(context, 1.0f);
        this.radius = hfk.a(context, 6.0f);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(0.0f);
        this.progressPaint = paint;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        a(canvas);
    }

    public final void setData(@NotNull List<a> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.dataList.clear();
        this.dataList.addAll(list);
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GluStandardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dataList = new ArrayList();
        this.intervalPx = 1.0f;
        this.radius = 6.0f;
        this.rectF = new RectF();
        this.path = new Path();
        b(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GluStandardView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dataList = new ArrayList();
        this.intervalPx = 1.0f;
        this.radius = 6.0f;
        this.rectF = new RectF();
        this.path = new Path();
        b(context);
    }
}
