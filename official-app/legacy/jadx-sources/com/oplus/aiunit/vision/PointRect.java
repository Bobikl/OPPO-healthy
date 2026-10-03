package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.ane, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/ane;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "c", "()I", "x", "b", "d", "y", "w", b2n.g, "<init>", "(IIII)V", "animplayer_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class PointRect {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int x;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final int y;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final int w;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final int h;

    public PointRect(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.w = i3;
        this.h = i4;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getW() {
        return this.w;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getX() {
        return this.x;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getY() {
        return this.y;
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            if (other instanceof PointRect) {
                PointRect pointRect = (PointRect) other;
                if (this.x == pointRect.x) {
                    if (this.y == pointRect.y) {
                        if (this.w == pointRect.w) {
                            if (this.h == pointRect.h) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.x * 31) + this.y) * 31) + this.w) * 31) + this.h;
    }

    @NotNull
    public String toString() {
        return "PointRect(x=" + this.x + ", y=" + this.y + ", w=" + this.w + ", h=" + this.h + ")";
    }
}
