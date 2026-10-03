package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b`\u0018\u00002\u00020\u0001J2\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH&J(\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H&J(\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0011H&J8\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH&J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH&J\u0018\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH&J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0014H&J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0014H&J:\u0010\"\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/eic;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "set", "", "attrs", "", "defStyleAttr", "defStyleRes", "", "b", "Landroid/graphics/Canvas;", "canvas", "pointMode", "pointNumber", "Landroid/graphics/RectF;", "rectF", "a", "", "pointText", MapSchema.FIELD_NAME_ENTRY, ParserTag.TAG_TEXT_SIZE, "radius", "c", "f", "i", "d", b2n.f, "fadeOutNum", "fadeOutAlpha", "fadeInNum", "fadeInAlpha", b2n.g, "nearx_release"}, k = 1, mv = {1, 6, 0})
public interface eic {
    void a(@NotNull Canvas canvas, int pointMode, int pointNumber, @NotNull RectF rectF);

    void b(@NotNull Context context, @Nullable AttributeSet set, @NotNull int[] attrs, int defStyleAttr, int defStyleRes);

    void c(@NotNull Canvas canvas, int pointMode, @NotNull String pointText, @NotNull RectF rectF, int textSize, int radius);

    int d(int pointMode, @NotNull String pointNumber);

    void e(@NotNull Canvas canvas, int pointMode, @NotNull String pointText, @NotNull RectF rectF);

    int f(int pointMode, int pointNumber);

    int g(int pointMode, @NotNull String pointNumber);

    void h(@NotNull Canvas canvas, int fadeOutNum, int fadeOutAlpha, int fadeInNum, int fadeInAlpha, @Nullable RectF rectF);

    int i(int pointMode, int pointNumber);
}
