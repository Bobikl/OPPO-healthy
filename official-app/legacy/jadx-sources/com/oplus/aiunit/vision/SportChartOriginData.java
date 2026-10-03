package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.s9i, reason: from toString */
/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J'\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/oplus/aiunit/vision/s9i;", "", "", "timestamp", "", "data", "", "state", "a", "", "toString", "hashCode", "other", "", "equals", "J", MapSchema.FIELD_NAME_ENTRY, "()J", b2n.g, "(J)V", "b", UserInfo.SEX_FEMALE, "c", "()F", "f", "(F)V", "I", "d", "()I", b2n.f, "(I)V", "<init>", "(JFI)V", "sport_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SportChartOriginData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public float data;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int state;

    public SportChartOriginData(long j2, float f, int i) {
        this.timestamp = j2;
        this.data = f;
        this.state = i;
    }

    public static /* synthetic */ SportChartOriginData b(SportChartOriginData sportChartOriginData, long j2, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = sportChartOriginData.timestamp;
        }
        if ((i2 & 2) != 0) {
            f = sportChartOriginData.data;
        }
        if ((i2 & 4) != 0) {
            i = sportChartOriginData.state;
        }
        return sportChartOriginData.a(j2, f, i);
    }

    @NotNull
    public final SportChartOriginData a(long timestamp, float data, int state) {
        return new SportChartOriginData(timestamp, data, state);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportChartOriginData)) {
            return false;
        }
        SportChartOriginData sportChartOriginData = (SportChartOriginData) other;
        return this.timestamp == sportChartOriginData.timestamp && Float.compare(this.data, sportChartOriginData.data) == 0 && this.state == sportChartOriginData.state;
    }

    public final void f(float f) {
        this.data = f;
    }

    public final void g(int i) {
        this.state = i;
    }

    public final void h(long j2) {
        this.timestamp = j2;
    }

    public int hashCode() {
        return (((Long.hashCode(this.timestamp) * 31) + Float.hashCode(this.data)) * 31) + Integer.hashCode(this.state);
    }

    @NotNull
    public String toString() {
        return "SportChartOriginData(timestamp=" + this.timestamp + ", data=" + this.data + ", state=" + this.state + ")";
    }

    public /* synthetic */ SportChartOriginData(long j2, float f, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, f, (i2 & 4) != 0 ? 0 : i);
    }
}
