package com.heytap.health.insight.net;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.y04;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/insight/net/Axis;", "", y04.TIME_STYLE_LEFT_DIR_NAME, "Lcom/heytap/health/insight/net/AxisValue;", y04.TIME_STYLE_RIGHT_DIR_NAME, "x", "(Lcom/heytap/health/insight/net/AxisValue;Lcom/heytap/health/insight/net/AxisValue;Lcom/heytap/health/insight/net/AxisValue;)V", "getLeft", "()Lcom/heytap/health/insight/net/AxisValue;", "getRight", "getX", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Axis {

    @Nullable
    private final AxisValue left;

    @Nullable
    private final AxisValue right;

    @Nullable
    private final AxisValue x;

    public Axis(@Nullable AxisValue axisValue, @Nullable AxisValue axisValue2, @Nullable AxisValue axisValue3) {
        this.left = axisValue;
        this.right = axisValue2;
        this.x = axisValue3;
    }

    public static /* synthetic */ Axis copy$default(Axis axis, AxisValue axisValue, AxisValue axisValue2, AxisValue axisValue3, int i, Object obj) {
        if ((i & 1) != 0) {
            axisValue = axis.left;
        }
        if ((i & 2) != 0) {
            axisValue2 = axis.right;
        }
        if ((i & 4) != 0) {
            axisValue3 = axis.x;
        }
        return axis.copy(axisValue, axisValue2, axisValue3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AxisValue getLeft() {
        return this.left;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AxisValue getRight() {
        return this.right;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AxisValue getX() {
        return this.x;
    }

    @NotNull
    public final Axis copy(@Nullable AxisValue left, @Nullable AxisValue right, @Nullable AxisValue x) {
        return new Axis(left, right, x);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Axis)) {
            return false;
        }
        Axis axis = (Axis) other;
        return Intrinsics.areEqual(this.left, axis.left) && Intrinsics.areEqual(this.right, axis.right) && Intrinsics.areEqual(this.x, axis.x);
    }

    @Nullable
    public final AxisValue getLeft() {
        return this.left;
    }

    @Nullable
    public final AxisValue getRight() {
        return this.right;
    }

    @Nullable
    public final AxisValue getX() {
        return this.x;
    }

    public int hashCode() {
        AxisValue axisValue = this.left;
        int iHashCode = (axisValue == null ? 0 : axisValue.hashCode()) * 31;
        AxisValue axisValue2 = this.right;
        int iHashCode2 = (iHashCode + (axisValue2 == null ? 0 : axisValue2.hashCode())) * 31;
        AxisValue axisValue3 = this.x;
        return iHashCode2 + (axisValue3 != null ? axisValue3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Axis(left=" + this.left + ", right=" + this.right + ", x=" + this.x + ")";
    }
}
