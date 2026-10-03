package com.heytap.store.base.core.util;

import android.graphics.drawable.GradientDrawable;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/heytap/store/base/core/util/Gradient;", "", "()V", "endColor", "", "getEndColor", "()I", "setEndColor", "(I)V", "orientation", "Landroid/graphics/drawable/GradientDrawable$Orientation;", "getOrientation", "()Landroid/graphics/drawable/GradientDrawable$Orientation;", "setOrientation", "(Landroid/graphics/drawable/GradientDrawable$Orientation;)V", "startColor", "getStartColor", "setStartColor", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Gradient {
    private int startColor = -1;
    private int endColor = -1;

    @NotNull
    private GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;

    public final int getEndColor() {
        return this.endColor;
    }

    @NotNull
    public final GradientDrawable.Orientation getOrientation() {
        return this.orientation;
    }

    public final int getStartColor() {
        return this.startColor;
    }

    public final void setEndColor(int i) {
        this.endColor = i;
    }

    public final void setOrientation(@NotNull GradientDrawable.Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "<set-?>");
        this.orientation = orientation;
    }

    public final void setStartColor(int i) {
        this.startColor = i;
    }
}
