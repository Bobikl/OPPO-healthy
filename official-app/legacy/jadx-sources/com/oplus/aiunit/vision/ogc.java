package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.heytap.nearx.uikit.widget.NearButton;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016JH\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/ogc;", "Lcom/oplus/aiunit/vision/ngc;", "Lcom/heytap/nearx/uikit/widget/NearButton;", ParserTag.TYPE_BUTTON, "Landroid/content/Context;", "context", "", "f", "Landroid/graphics/Paint;", "fillPaint", "", "isShowOutline", "a", "", "drawableColor", "d", "disabledColor", "c", MapSchema.FIELD_NAME_ENTRY, "Landroid/graphics/Canvas;", "canvas", lo9.TAG_DEFAULT_CREATION_PAINT, "rectLeft", "rectTop", "rectRight", "rectBottom", "", "radius", "b", "<init>", "()V", "nearx_release"}, k = 1, mv = {1, 6, 0})
public final class ogc extends ngc {
    @Override // com.oplus.aiunit.vision.ngc
    public void a(@NotNull NearButton button, @NotNull Context context, @NotNull Paint fillPaint, boolean isShowOutline) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fillPaint, "fillPaint");
        f(button, context);
    }

    @Override // com.oplus.aiunit.vision.ngc
    public void b(@NotNull Canvas canvas, @NotNull Paint paint, int rectLeft, int rectTop, int rectRight, int rectBottom, boolean isShowOutline, float radius) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }

    @Override // com.oplus.aiunit.vision.ngc
    public void c(@NotNull NearButton button, @NotNull Context context, int disabledColor) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(context, "context");
        button.setDisableColorStateList(ColorStateList.valueOf(disabledColor));
        button.setDisabledColor(disabledColor);
        button.invalidate();
    }

    @Override // com.oplus.aiunit.vision.ngc
    public void d(@NotNull NearButton button, @NotNull Context context, int drawableColor) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(context, "context");
        button.setDrawableColorStateList(ColorStateList.valueOf(drawableColor));
        button.setDrawableColor(drawableColor);
        button.invalidate();
    }

    @Override // com.oplus.aiunit.vision.ngc
    public void e(@NotNull NearButton button, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void f(@NotNull NearButton button, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(context, "context");
        button.startAnimColorMode(true);
    }
}
