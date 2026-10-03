package com.heytap.health.base.view.calendar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.at5;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.y04;
import io.protostuff.MapSchema;
import java.time.LocalDate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\b&\u0018\u00002\u00020\u0001:\u0003\u0017\u0012\rB\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010#\u001a\u00020\u001d¢\u0006\u0004\bV\u0010WJ8\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\b\u0010\r\u001a\u00020\u000bH\u0016J \u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0016\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006J&\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010*\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010*\u001a\u0004\b)\u0010,\"\u0004\b4\u0010.R\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b3\u0010?\"\u0004\b@\u0010AR$\u0010H\u001a\u0004\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010D\u001a\u0004\b=\u0010E\"\u0004\bF\u0010GR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bI\u0010K\"\u0004\bL\u0010MR\u0017\u0010O\u001a\u0002058\u0006¢\u0006\f\n\u0004\b1\u00106\u001a\u0004\bN\u00108R\"\u0010U\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bP\u0010R\"\u0004\bS\u0010T¨\u0006X"}, d2 = {"Lcom/heytap/health/base/view/calendar/a;", "", "Landroid/graphics/Canvas;", "canvas", "Landroid/view/View;", "parentView", "", y04.TIME_STYLE_LEFT_DIR_NAME, "top", y04.TIME_STYLE_RIGHT_DIR_NAME, "bottom", "", LogFieldKey.PROCESS_NAME_KEY, "c", "Lcom/heytap/health/base/view/calendar/a$a;", "circleAttr", "Lcom/heytap/health/base/view/calendar/a$b;", "drawRect", "b", "x", "y", "", "q", "a", "Landroid/content/Context;", "Landroid/content/Context;", "f", "()Landroid/content/Context;", "context", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "j", "()Landroid/graphics/RectF;", "setPadding", "(Landroid/graphics/RectF;)V", "padding", "Landroid/graphics/Canvas;", MapSchema.FIELD_NAME_ENTRY, "()Landroid/graphics/Canvas;", "setCanvas", "(Landroid/graphics/Canvas;)V", "d", UserInfo.SEX_FEMALE, b2n.g, "()F", "setLeft", "(F)V", "n", "setTop", LogFieldKey.LEVEL_KEY, "setRight", b2n.f, "setBottom", "", "I", "o", "()I", "t", "(I)V", "visibility", "Ljava/time/LocalDate;", "i", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "r", "(Ljava/time/LocalDate;)V", "date", "Lcom/heytap/health/base/view/calendar/a$c;", "Lcom/heytap/health/base/view/calendar/a$c;", "()Lcom/heytap/health/base/view/calendar/a$c;", "setOnClickDayListener", "(Lcom/heytap/health/base/view/calendar/a$c;)V", "onClickDayListener", MapSchema.FIELD_NAME_KEY, "Landroid/view/View;", "()Landroid/view/View;", "setParentView", "(Landroid/view/View;)V", "getSuggestedRadius", "suggestedRadius", LogFieldKey.MESSAGE_KEY, "Z", "()Z", "s", "(Z)V", "selected", "<init>", "(Landroid/content/Context;Landroid/graphics/RectF;)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public abstract class a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public RectF padding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Canvas canvas;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public float left;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public float top;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public float right;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public float bottom;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int visibility;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public LocalDate date;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public c onClickDayListener;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public View parentView;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int suggestedRadius;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean selected;

    /* JADX INFO: renamed from: com.heytap.health.base.view.calendar.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0010\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/base/view/calendar/a$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", UserInfo.SEX_FEMALE, "()F", "centerX", "b", "centerY", "c", "radius", "<init>", "(FFF)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class CircleAttr {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final float centerX;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final float centerY;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final float radius;

        public CircleAttr(float f, float f2, float f3) {
            this.centerX = f;
            this.centerY = f2;
            this.radius = f3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getCenterX() {
            return this.centerX;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getCenterY() {
            return this.centerY;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getRadius() {
            return this.radius;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CircleAttr)) {
                return false;
            }
            CircleAttr circleAttr = (CircleAttr) other;
            return Float.compare(this.centerX, circleAttr.centerX) == 0 && Float.compare(this.centerY, circleAttr.centerY) == 0 && Float.compare(this.radius, circleAttr.radius) == 0;
        }

        public int hashCode() {
            return (((Float.hashCode(this.centerX) * 31) + Float.hashCode(this.centerY)) * 31) + Float.hashCode(this.radius);
        }

        @NotNull
        public String toString() {
            return "CircleAttr(centerX=" + this.centerX + ", centerY=" + this.centerY + ", radius=" + this.radius + ")";
        }
    }

    /* JADX INFO: renamed from: com.heytap.health.base.view.calendar.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/base/view/calendar/a$b;", "", "", "a", "b", "c", "d", "", "toString", "", "hashCode", "other", "", "equals", UserInfo.SEX_FEMALE, "getLeft", "()F", y04.TIME_STYLE_LEFT_DIR_NAME, "getTop", "top", "getRight", y04.TIME_STYLE_RIGHT_DIR_NAME, "getBottom", "bottom", "<init>", "(FFFF)V", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class DrawRect {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        public final float left;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final float top;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        public final float right;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        public final float bottom;

        public DrawRect(float f, float f2, float f3, float f4) {
            this.left = f;
            this.top = f2;
            this.right = f3;
            this.bottom = f4;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getLeft() {
            return this.left;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final float getTop() {
            return this.top;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getRight() {
            return this.right;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getBottom() {
            return this.bottom;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrawRect)) {
                return false;
            }
            DrawRect drawRect = (DrawRect) other;
            return Float.compare(this.left, drawRect.left) == 0 && Float.compare(this.top, drawRect.top) == 0 && Float.compare(this.right, drawRect.right) == 0 && Float.compare(this.bottom, drawRect.bottom) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.left) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom);
        }

        @NotNull
        public String toString() {
            return "DrawRect(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/base/view/calendar/a$c;", "", "Ljava/time/LocalDate;", "date", "", "a", "lib_base_release"}, k = 1, mv = {1, 8, 0})
    public interface c {
        void a(@NotNull LocalDate date);
    }

    public a(@NotNull Context context, @NotNull RectF padding) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(padding, "padding");
        this.context = context;
        this.padding = padding;
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now()");
        this.date = localDateNow;
        this.suggestedRadius = at5.a(36.0f);
    }

    @NotNull
    public final CircleAttr a(float left, float top, float right, float bottom) {
        float f = 2;
        return new CircleAttr((right + left) / f, (top + bottom) / f, RangesKt___RangesKt.coerceAtMost(Math.abs(right - left), Math.abs(bottom - top)) / f);
    }

    public void b(@NotNull Canvas canvas, @NotNull CircleAttr circleAttr, @NotNull DrawRect drawRect) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(circleAttr, "circleAttr");
        Intrinsics.checkNotNullParameter(drawRect, "drawRect");
    }

    public void c() {
        Canvas canvas;
        if (this.visibility == 4 || (canvas = this.canvas) == null) {
            return;
        }
        float f = this.left;
        RectF rectF = this.padding;
        float f2 = f + rectF.left;
        float f3 = this.right - rectF.right;
        float f4 = this.top + rectF.top;
        float f5 = this.bottom - rectF.bottom;
        b(canvas, a(f2, f4, f3, f5), new DrawRect(f2, f4, f3, f5));
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Canvas getCanvas() {
        return this.canvas;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final c getOnClickDayListener() {
        return this.onClickDayListener;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final RectF getPadding() {
        return this.padding;
    }

    @Nullable
    /* JADX INFO: renamed from: k, reason: from getter */
    public final View getParentView() {
        return this.parentView;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getVisibility() {
        return this.visibility;
    }

    public final void p(@Nullable Canvas canvas, @NotNull View parentView, float left, float top, float right, float bottom) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        this.canvas = canvas;
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
        this.parentView = parentView;
        float f = ((right - left) - this.suggestedRadius) / 2;
        this.padding = new RectF(f, 0.0f, f, 0.0f);
    }

    public final boolean q(float x, float y) {
        if (x <= this.right && this.left <= x) {
            if (y <= this.bottom && this.top <= y) {
                return true;
            }
        }
        return false;
    }

    public final void r(@NotNull LocalDate localDate) {
        Intrinsics.checkNotNullParameter(localDate, "<set-?>");
        this.date = localDate;
    }

    public final void s(boolean z) {
        this.selected = z;
    }

    public final void setOnClickDayListener(@Nullable c cVar) {
        this.onClickDayListener = cVar;
    }

    public final void t(int i) {
        this.visibility = i;
    }
}
