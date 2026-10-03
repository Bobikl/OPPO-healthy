package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.heytap.nearx.uikit.widget.NearButton;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH&J \u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\fH&J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&JH\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H&¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/ngc;", "", "Lcom/heytap/nearx/uikit/widget/NearButton;", ParserTag.TYPE_BUTTON, "Landroid/content/Context;", "context", "Landroid/graphics/Paint;", "fillPaint", "", "isShowOutline", "", "a", "", "drawableColor", "d", "disabledColor", "c", MapSchema.FIELD_NAME_ENTRY, "Landroid/graphics/Canvas;", "canvas", lo9.TAG_DEFAULT_CREATION_PAINT, "rectLeft", "rectTop", "rectRight", "rectBottom", "", "radius", "b", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public abstract class ngc {
    public abstract void a(@NotNull NearButton button, @NotNull Context context, @NotNull Paint fillPaint, boolean isShowOutline);

    public abstract void b(@NotNull Canvas canvas, @NotNull Paint paint, int rectLeft, int rectTop, int rectRight, int rectBottom, boolean isShowOutline, float radius);

    public abstract void c(@NotNull NearButton button, @NotNull Context context, int disabledColor);

    public abstract void d(@NotNull NearButton button, @NotNull Context context, int drawableColor);

    public abstract void e(@NotNull NearButton button, @NotNull Context context);
}
