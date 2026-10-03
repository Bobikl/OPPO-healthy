package com.oplus.aiunit.vision;

import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/tek;", "Landroid/graphics/drawable/ShapeDrawable;", "Landroid/graphics/Rect;", "bounds", "", "onBoundsChange", "<init>", "()V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class tek extends ShapeDrawable {
    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public void onBoundsChange(@NotNull Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        float fMin = Math.min(bounds.right - bounds.left, bounds.bottom - bounds.top) / 2.0f;
        setShape(new RoundRectShape(new float[]{fMin, fMin, fMin, fMin, fMin, fMin, fMin, fMin}, null, null));
    }
}
