package com.heytap.health.watchface.business.creation.category.flexible.bean;

import androidx.annotation.Keep;
import com.oplus.drs.core.config.entity.DebugModeEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/bean/Constraint;", "", "vertical", "", "horizontal", DebugModeEntity.KEY_AREA, "(DDD)V", "getArea", "()D", "getHorizontal", "getVertical", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "watchface_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Constraint {
    private final double area;
    private final double horizontal;
    private final double vertical;

    public Constraint(double d, double d2, double d3) {
        this.vertical = d;
        this.horizontal = d2;
        this.area = d3;
    }

    public static /* synthetic */ Constraint copy$default(Constraint constraint, double d, double d2, double d3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = constraint.vertical;
        }
        double d4 = d;
        if ((i & 2) != 0) {
            d2 = constraint.horizontal;
        }
        double d5 = d2;
        if ((i & 4) != 0) {
            d3 = constraint.area;
        }
        return constraint.copy(d4, d5, d3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getVertical() {
        return this.vertical;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getHorizontal() {
        return this.horizontal;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getArea() {
        return this.area;
    }

    @NotNull
    public final Constraint copy(double vertical, double horizontal, double area) {
        return new Constraint(vertical, horizontal, area);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Constraint)) {
            return false;
        }
        Constraint constraint = (Constraint) other;
        return Double.compare(this.vertical, constraint.vertical) == 0 && Double.compare(this.horizontal, constraint.horizontal) == 0 && Double.compare(this.area, constraint.area) == 0;
    }

    public final double getArea() {
        return this.area;
    }

    public final double getHorizontal() {
        return this.horizontal;
    }

    public final double getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        return (((Double.hashCode(this.vertical) * 31) + Double.hashCode(this.horizontal)) * 31) + Double.hashCode(this.area);
    }

    @NotNull
    public String toString() {
        return "Constraint(vertical=" + this.vertical + ", horizontal=" + this.horizontal + ", area=" + this.area + ")";
    }
}
