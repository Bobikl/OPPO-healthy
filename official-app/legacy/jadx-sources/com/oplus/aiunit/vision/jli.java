package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0010B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\b\u0010\u000e\u001a\u00020\u0006H\u0016R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/jli;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Canvas;", "canvas", "", ParserTag.TAG_DRAW, "", "alpha", ClickApiEntity.SET_ALPHA, "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getOpacity", "getIntrinsicWidth", "getIntrinsicHeight", "", "a", "Ljava/util/List;", ParserTag.TAG_COLORS, "Landroid/graphics/Paint;", "b", "Landroid/graphics/Paint;", lo9.TAG_DEFAULT_CREATION_PAINT, "<init>", "(Ljava/util/List;)V", "Companion", "health_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStackedBarDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StackedBarDrawable.kt\ncom/heytap/health/insight/ui/view/chart/drawable/StackedBarDrawable\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1864#2,3:64\n*S KotlinDebug\n*F\n+ 1 StackedBarDrawable.kt\ncom/heytap/health/insight/ui/view/chart/drawable/StackedBarDrawable\n*L\n34#1:64,3\n*E\n"})
public final class jli extends Drawable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<Integer> colors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;
    public static final int $stable = 8;

    public jli(@NotNull List<Integer> colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.colors = colors;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.paint = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float intrinsicHeight = getIntrinsicHeight();
        float f = getBounds().left;
        float f2 = getBounds().top;
        int i = 0;
        for (Object obj : this.colors) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            this.paint.setColor(((Number) obj).intValue());
            float fA = at5.a(i * 8.0f) + f;
            canvas.drawRect(new RectF(fA, f2, at5.a(8.0f) + fA, f2 + intrinsicHeight), this.paint);
            i = i2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return at5.a(8.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return at5.a(this.colors.size() * 8.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.paint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
