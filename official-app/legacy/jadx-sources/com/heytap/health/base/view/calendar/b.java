package com.heytap.health.base.view.calendar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.core.graphics.ColorUtils;
import com.heytap.accessory.utils.XmlReader;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.base.R$color;
import com.heytap.health.base.R$string;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ejg;
import com.oplus.aiunit.vision.kta;
import com.oplus.aiunit.vision.lo9;
import com.oplus.aiunit.vision.y04;
import com.oplus.smartenginehelper.ParserTag;
import java.time.LocalDate;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 32\u00020\u0001:\u00014B!\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\b\b\u0002\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002J(\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002J\b\u0010\r\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0002J(\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J0\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J0\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J0\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010*\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001eR\u0016\u0010,\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001e¨\u00065"}, d2 = {"Lcom/heytap/health/base/view/calendar/b;", "Lcom/heytap/health/base/view/calendar/a;", "", XmlReader.VALUE_DISABLE, "", ParserTag.TAG_PERCENT, "Ljava/time/LocalDate;", "date", "showDot", "", "z", "haveData", "A", "c", "y", "Landroid/graphics/Canvas;", "canvas", "circleX", "circleY", "radius", "u", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "w", "x", "v", "", "n", "I", "baseColor", "Landroid/graphics/Paint;", "o", "Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, LogFieldKey.PROCESS_NAME_KEY, "Z", "q", UserInfo.SEX_FEMALE, "r", "s", "bgColor", "t", ParserTag.TAG_TEXT_COLOR, "Landroid/content/Context;", "context", "Landroid/graphics/RectF;", "padding", "<init>", "(Landroid/content/Context;ILandroid/graphics/RectF;)V", "Companion", "a", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class b extends a {

    @NotNull
    public static final String TAG = "CalendarDayCircleView";

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final int baseColor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean disable;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public float percent;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public boolean showDot;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int bgColor;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int textColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull Context context, int i, @NotNull RectF padding) {
        super(context, padding);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.baseColor = i;
        Paint paint = new Paint();
        this.paint = paint;
        this.bgColor = i;
        this.textColor = context.getColor(R$color.lib_base_black_55alpha);
        paint.setAntiAlias(true);
        y();
    }

    public final void A(boolean disable, boolean haveData, @NotNull LocalDate date, boolean showDot) {
        Intrinsics.checkNotNullParameter(date, "date");
        z(disable, haveData ? 1.0f : 0.0f, date, showDot);
    }

    @Override // com.heytap.health.base.view.calendar.a
    public void c() {
        if (getVisibility() == 4) {
            a7b.f(TAG, "draw unvisible,date:" + getDate());
            return;
        }
        Canvas canvas = getCanvas();
        if (canvas != null) {
            float right = getRight() - getLeft();
            float f = 2;
            u(canvas, getLeft() + (right / f), getTop() + ((getBottom() - getTop()) / f), ((right - getPadding().left) - getPadding().right) / f);
            if (!this.disable) {
                float f2 = this.percent;
                if (f2 > 0.0f && f2 < 1.0f) {
                    w(canvas, getLeft() + getPadding().left, getTop() + getPadding().top, getRight() - getPadding().right, getBottom() - getPadding().bottom);
                }
            }
            x(canvas, getLeft() + getPadding().left, getTop() + getPadding().top, getRight() - getPadding().right, getBottom() - getPadding().bottom);
            v(canvas, getLeft(), getBottom() - getPadding().bottom, getRight(), (getBottom() - getPadding().bottom) + ejg.n(getContext(), 22.0f));
        }
    }

    public final void u(Canvas canvas, float circleX, float circleY, float radius) {
        this.paint.setColor(this.bgColor);
        this.paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(circleX, circleY, radius, this.paint);
    }

    public final void v(Canvas canvas, float left, float top, float right, float bottom) {
        if (this.showDot) {
            this.paint.setStyle(Paint.Style.FILL);
            float fA = ejg.a(getContext(), 8.0f);
            this.paint.setColor(this.baseColor);
            float f = left + right;
            float f2 = 2;
            canvas.drawCircle(f / f2, (top + bottom) / f2, fA / f2, this.paint);
        }
    }

    public final void w(Canvas canvas, float left, float top, float right, float bottom) {
        this.paint.setStyle(Paint.Style.STROKE);
        float fA = ejg.a(getContext(), 3.0f);
        this.paint.setStrokeWidth(fA);
        this.paint.setColor(this.baseColor);
        this.paint.setStrokeCap(Paint.Cap.ROUND);
        a.CircleAttr circleAttrA = a(left, top, right, bottom);
        float f = fA / 2;
        canvas.drawArc(new RectF((circleAttrA.getCenterX() - circleAttrA.getRadius()) + f, (circleAttrA.getCenterY() - circleAttrA.getRadius()) + f, (circleAttrA.getCenterX() + circleAttrA.getRadius()) - f, (circleAttrA.getCenterY() + circleAttrA.getRadius()) - f), 270.0f, this.percent * 360.0f, false, this.paint);
    }

    public final void x(Canvas canvas, float left, float top, float right, float bottom) {
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(this.textColor);
        this.paint.setStrokeWidth(2.0f);
        this.paint.setTextSize(ejg.n(getContext(), 16.0f));
        this.paint.setTextAlign(Paint.Align.CENTER);
        RectF rectF = new RectF(left, top, right, bottom);
        Paint.FontMetrics fontMetrics = this.paint.getFontMetrics();
        float f = fontMetrics.bottom;
        float fCenterY = rectF.centerY() + (((f - fontMetrics.top) / 2) - f);
        boolean zAreEqual = Intrinsics.areEqual(Locale.CHINA.getLanguage(), kta.c());
        if (Intrinsics.areEqual(getDate(), LocalDate.now()) && zAreEqual) {
            canvas.drawText(getContext().getString(R$string.lib_base_today_short_text), rectF.centerX(), fCenterY, this.paint);
        } else {
            canvas.drawText(String.valueOf(getDate().getDayOfMonth()), rectF.centerX(), fCenterY, this.paint);
        }
    }

    public final void y() {
        Context context = getContext();
        int i = R$color.lib_base_colorBlack;
        int color = context.getColor(i);
        if (this.disable) {
            this.bgColor = ColorUtils.setAlphaComponent(color, 10);
            this.textColor = ColorUtils.setAlphaComponent(color, 38);
            return;
        }
        float f = this.percent;
        if (f >= 1.0f) {
            this.bgColor = this.baseColor;
            this.textColor = getContext().getColor(R$color.lib_base_colorWhite);
        } else if (f > 0.0f) {
            this.bgColor = ColorUtils.setAlphaComponent(color, 10);
            this.textColor = getContext().getColor(i);
        } else {
            this.bgColor = ColorUtils.setAlphaComponent(color, 10);
            this.textColor = ColorUtils.setAlphaComponent(color, 140);
        }
    }

    public final void z(boolean disable, float percent, @NotNull LocalDate date, boolean showDot) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.disable = disable;
        this.percent = percent;
        r(date);
        this.showDot = showDot;
        y();
    }
}
