package com.heytap.health.insight.net;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/insight/net/Value;", "", DBHealthReviewPlan.DESC, "", "descZh", "value", "", "(Ljava/lang/String;Ljava/lang/String;F)V", "getDesc", "()Ljava/lang/String;", "getDescZh", "getValue", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "health_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Value {

    @NotNull
    private final String desc;

    @NotNull
    private final String descZh;
    private final float value;

    public Value(@NotNull String desc, @NotNull String descZh, float f) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(descZh, "descZh");
        this.desc = desc;
        this.descZh = descZh;
        this.value = f;
    }

    public static /* synthetic */ Value copy$default(Value value, String str, String str2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = value.desc;
        }
        if ((i & 2) != 0) {
            str2 = value.descZh;
        }
        if ((i & 4) != 0) {
            f = value.value;
        }
        return value.copy(str, str2, f);
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

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @NotNull
    public final Value copy(@NotNull String desc, @NotNull String descZh, float value) {
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(descZh, "descZh");
        return new Value(desc, descZh, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Value)) {
            return false;
        }
        Value value = (Value) other;
        return Intrinsics.areEqual(this.desc, value.desc) && Intrinsics.areEqual(this.descZh, value.descZh) && Float.compare(this.value, value.value) == 0;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final String getDescZh() {
        return this.descZh;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.desc.hashCode() * 31) + this.descZh.hashCode()) * 31) + Float.hashCode(this.value);
    }

    @NotNull
    public String toString() {
        return "Value(desc=" + this.desc + ", descZh=" + this.descZh + ", value=" + this.value + ")";
    }
}
