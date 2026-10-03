package com.heytap.health.insight.net;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006HÆ\u0003JU\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012¨\u0006$"}, d2 = {"Lcom/heytap/health/insight/net/AxisValue;", "", DBHealthReviewPlan.DESC, "", "descZh", "limits", "", "Lcom/heytap/health/insight/net/LimitValue;", "max", "", "min", "values", "Lcom/heytap/health/insight/net/Value;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FFLjava/util/List;)V", "getDesc", "()Ljava/lang/String;", "getDescZh", "getLimits", "()Ljava/util/List;", "getMax", "()F", "getMin", "getValues", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AxisValue {

    @NotNull
    private final String desc;

    @NotNull
    private final String descZh;

    @Nullable
    private final List<LimitValue> limits;
    private final float max;
    private final float min;

    @Nullable
    private final List<Value> values;

    public AxisValue(@NotNull String desc, @NotNull String descZh, @Nullable List<LimitValue> list, float f, float f2, @Nullable List<Value> list2) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(descZh, "descZh");
        this.desc = desc;
        this.descZh = descZh;
        this.limits = list;
        this.max = f;
        this.min = f2;
        this.values = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AxisValue copy$default(AxisValue axisValue, String str, String str2, List list, float f, float f2, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = axisValue.desc;
        }
        if ((i & 2) != 0) {
            str2 = axisValue.descZh;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            list = axisValue.limits;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            f = axisValue.max;
        }
        float f3 = f;
        if ((i & 16) != 0) {
            f2 = axisValue.min;
        }
        float f4 = f2;
        if ((i & 32) != 0) {
            list2 = axisValue.values;
        }
        return axisValue.copy(str, str3, list3, f3, f4, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescZh() {
        return this.descZh;
    }

    @Nullable
    public final List<LimitValue> component3() {
        return this.limits;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getMax() {
        return this.max;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getMin() {
        return this.min;
    }

    @Nullable
    public final List<Value> component6() {
        return this.values;
    }

    @NotNull
    public final AxisValue copy(@NotNull String desc, @NotNull String descZh, @Nullable List<LimitValue> limits, float max, float min, @Nullable List<Value> values) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(descZh, "descZh");
        return new AxisValue(desc, descZh, limits, max, min, values);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AxisValue)) {
            return false;
        }
        AxisValue axisValue = (AxisValue) other;
        return Intrinsics.areEqual(this.desc, axisValue.desc) && Intrinsics.areEqual(this.descZh, axisValue.descZh) && Intrinsics.areEqual(this.limits, axisValue.limits) && Float.compare(this.max, axisValue.max) == 0 && Float.compare(this.min, axisValue.min) == 0 && Intrinsics.areEqual(this.values, axisValue.values);
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getDescZh() {
        return this.descZh;
    }

    @Nullable
    public final List<LimitValue> getLimits() {
        return this.limits;
    }

    public final float getMax() {
        return this.max;
    }

    public final float getMin() {
        return this.min;
    }

    @Nullable
    public final List<Value> getValues() {
        return this.values;
    }

    public int hashCode() {
        int iHashCode = ((this.desc.hashCode() * 31) + this.descZh.hashCode()) * 31;
        List<LimitValue> list = this.limits;
        int iHashCode2 = (((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Float.hashCode(this.max)) * 31) + Float.hashCode(this.min)) * 31;
        List<Value> list2 = this.values;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AxisValue(desc=" + this.desc + ", descZh=" + this.descZh + ", limits=" + this.limits + ", max=" + this.max + ", min=" + this.min + ", values=" + this.values + ")";
    }
}
