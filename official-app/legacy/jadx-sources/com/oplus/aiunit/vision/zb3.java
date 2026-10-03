package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.step.R$color;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.ParserTag;
import java.time.LocalDate;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 C2\u00020\u0001:\u0001DB\u0019\u0012\u0006\u0010>\u001a\u00020=\u0012\b\b\u0002\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ \u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0016\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012J\b\u0010\u0016\u001a\u00020\u0006H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J(\u0010\u001c\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0002J0\u0010!\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0002J0\u0010\"\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0002H\u0002J \u0010%\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H\u0002R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010-R\u0014\u00105\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b4\u0010+R\"\u0010<\u001a\u0002068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006E"}, d2 = {"Lcom/oplus/aiunit/vision/zb3;", "Lcom/heytap/health/base/view/calendar/a;", "", ParserTag.TAG_PERCENT, "Ljava/time/LocalDate;", "date", "", c8l.KEY_B, "", "todayText", "D", "Landroid/graphics/Canvas;", "canvas", "Lcom/heytap/health/base/view/calendar/a$a;", "circleAttr", "Lcom/heytap/health/base/view/calendar/a$b;", "drawRect", "b", "", "color", ParserTag.TAG_TEXT_COLOR, "A", "z", "dpValue", "u", "circleX", "circleY", "radius", "v", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "x", "y", "centerX", "centerY", "w", "Landroid/graphics/Paint;", "n", "Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "o", UserInfo.SEX_FEMALE, LogFieldKey.PROCESS_NAME_KEY, "I", "bgColor", "q", "r", "Ljava/lang/String;", "s", "bottomPointColor", "t", "bottomPointRadius", "", "Z", "getShowBottomDot", "()Z", "C", "(Z)V", "showBottomDot", "Landroid/content/Context;", "context", "Landroid/graphics/RectF;", "padding", "<init>", "(Landroid/content/Context;Landroid/graphics/RectF;)V", "Companion", "a", "step_release"}, k = 1, mv = {1, 8, 0})
public final class zb3 extends com.heytap.health.base.view.calendar.a {

    @NotNull
    public static final String TAG = "CircleView";

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public float percent;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int bgColor;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int textColor;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public String todayText;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int bottomPointColor;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final float bottomPointRadius;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public boolean showBottomDot;

    public /* synthetic */ zb3(Context context, RectF rectF, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new RectF(0.0f, 0.0f, 0.0f, 0.0f) : rectF);
    }

    public final void A(int color, int textColor) {
        this.bgColor = color;
        this.textColor = textColor;
    }

    public final void B(float percent, @NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        this.percent = percent;
        r(date);
        z();
    }

    public final void C(boolean z) {
        this.showBottomDot = z;
    }

    public final void D(@NotNull String todayText) {
        Intrinsics.checkNotNullParameter(todayText, "todayText");
        this.todayText = todayText;
    }

    @Override // com.heytap.health.base.view.calendar.a
    public void b(@NotNull Canvas canvas, @NotNull com.heytap.health.base.view.calendar.a.CircleAttr circleAttr, @NotNull com.heytap.health.base.view.calendar.a.DrawRect drawRect) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(circleAttr, "circleAttr");
        Intrinsics.checkNotNullParameter(drawRect, "drawRect");
        float left = drawRect.getLeft();
        float top = drawRect.getTop();
        float right = drawRect.getRight();
        float bottom = drawRect.getBottom();
        v(canvas, circleAttr.getCenterX(), circleAttr.getCenterY(), circleAttr.getRadius());
        x(canvas, left, top, right, bottom);
        y(canvas, left, top, right, bottom);
        w(canvas, circleAttr.getCenterX(), bottom + u(4.0f) + u(this.bottomPointRadius));
    }

    public final int u(float dpValue) {
        return ejg.a(getContext(), dpValue);
    }

    public final void v(Canvas canvas, float circleX, float circleY, float radius) {
        this.paint.setColor(this.bgColor);
        this.paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(circleX, circleY, radius, this.paint);
    }

    public final void w(Canvas canvas, float centerX, float centerY) {
        if (this.showBottomDot) {
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(this.bottomPointColor);
            canvas.drawCircle(centerX, centerY, u(4.0f), this.paint);
        }
    }

    public final void x(Canvas canvas, float left, float top, float right, float bottom) {
        if (this.percent > 0.0f) {
            this.paint.setStyle(Paint.Style.STROKE);
            float fA = ejg.a(getContext(), 3.0f);
            this.paint.setStrokeWidth(fA);
            this.paint.setColor(getContext().getColor(R$color.step_FF29CD68));
            this.paint.setStrokeCap(Paint.Cap.ROUND);
            com.heytap.health.base.view.calendar.a.CircleAttr circleAttrA = a(left, top, right, bottom);
            float f = fA / 2;
            canvas.drawArc(new RectF((circleAttrA.getCenterX() - circleAttrA.getRadius()) + f, (circleAttrA.getCenterY() - circleAttrA.getRadius()) + f, (circleAttrA.getCenterX() + circleAttrA.getRadius()) - f, (circleAttrA.getCenterY() + circleAttrA.getRadius()) - f), 270.0f, this.percent * 360, false, this.paint);
        }
    }

    public final void y(Canvas canvas, float left, float top, float right, float bottom) {
        this.paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(this.textColor);
        this.paint.setStrokeWidth(2.0f);
        this.paint.setTextSize(ejg.n(getContext(), 16.0f));
        this.paint.setTextAlign(Paint.Align.CENTER);
        RectF rectF = new RectF(left, top, right, bottom);
        Paint.FontMetrics fontMetrics = this.paint.getFontMetrics();
        float f = fontMetrics.bottom;
        float fCenterY = rectF.centerY() + (((f - fontMetrics.top) / 2) - f);
        if (Intrinsics.areEqual(this.todayText, "") || !Intrinsics.areEqual(getDate(), LocalDate.now())) {
            canvas.drawText(String.valueOf(getDate().getDayOfMonth()), rectF.centerX(), fCenterY, this.paint);
        } else {
            canvas.drawText(this.todayText, rectF.centerX(), fCenterY, this.paint);
        }
    }

    public final void z() {
        float f = this.percent;
        if (f >= 1.0f) {
            this.bgColor = getContext().getColor(R$color.step_FF29CD68);
            this.textColor = getContext().getColor(com.heytap.health.health_base.R$color.health_base_white);
            return;
        }
        if (f == 0.0f) {
            this.bgColor = getContext().getColor(R$color.step_0A000000);
            this.textColor = getContext().getColor(R$color.step_color_8C000000);
        } else {
            this.bgColor = getContext().getColor(R$color.step_0A000000);
            this.textColor = getContext().getColor(com.heytap.health.base.R$color.lib_base_colorBlack);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb3(@NotNull Context context, @NotNull RectF padding) {
        super(context, padding);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(padding, "padding");
        Paint paint = new Paint();
        this.paint = paint;
        int i = R$color.step_FF29CD68;
        this.bgColor = context.getColor(i);
        this.textColor = context.getColor(R$color.step_color_8C000000);
        this.todayText = "";
        this.bottomPointColor = context.getColor(i);
        this.bottomPointRadius = 4.0f;
        paint.setAntiAlias(true);
        z();
    }
}
