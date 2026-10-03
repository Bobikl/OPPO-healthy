package com.heytap.store.base.core.util;

import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0015\u001a\u00020\u0004*\u00020\u0004H\u0000¢\u0006\u0002\b\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/heytap/store/base/core/util/Corners;", "", "()V", "bottomLeft", "", "getBottomLeft", "()F", "setBottomLeft", "(F)V", "bottomRight", "getBottomRight", "setBottomRight", "radius", "getRadius", "setRadius", "topLeft", "getTopLeft", "setTopLeft", "topRight", "getTopRight", "setTopRight", "orRadius", "orRadius$Core_release", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class Corners {
    private float radius;
    private float topLeft = Float.NaN;
    private float topRight = Float.NaN;
    private float bottomLeft = Float.NaN;
    private float bottomRight = Float.NaN;

    public final float getBottomLeft() {
        return this.bottomLeft;
    }

    public final float getBottomRight() {
        return this.bottomRight;
    }

    public final float getRadius() {
        return this.radius;
    }

    public final float getTopLeft() {
        return this.topLeft;
    }

    public final float getTopRight() {
        return this.topRight;
    }

    public final float orRadius$Core_release(float f) {
        Float fValueOf = Float.valueOf(f);
        if (!(fValueOf.floatValue() >= 0.0f)) {
            fValueOf = null;
        }
        return fValueOf == null ? this.radius : fValueOf.floatValue();
    }

    public final void setBottomLeft(float f) {
        this.bottomLeft = f;
    }

    public final void setBottomRight(float f) {
        this.bottomRight = f;
    }

    public final void setRadius(float f) {
        this.radius = f;
    }

    public final void setTopLeft(float f) {
        this.topLeft = f;
    }

    public final void setTopRight(float f) {
        this.topRight = f;
    }
}
