package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.health.familymode.request.WristTemperatureObject;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.w2m, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u0010\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u000b\u0010\u001eR\u001a\u0010\"\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001e¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/w2m;", "Lcom/oplus/aiunit/vision/g27;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/heytap/health/health/familymode/request/WristTemperatureObject;", "a", "Lcom/heytap/health/health/familymode/request/WristTemperatureObject;", "d", "()Lcom/heytap/health/health/familymode/request/WristTemperatureObject;", "wristTemperatureObject", "b", "Z", MapSchema.FIELD_NAME_ENTRY, "()Z", "isVirtualAccount", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "ssoid", "", "J", "()J", "dataTime", "I", "()I", c8l.SPAN_KEY, "f", "getPriority", "priority", "<init>", "(Lcom/heytap/health/health/familymode/request/WristTemperatureObject;ZLjava/lang/String;JII)V", "family_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class WristTemperatureCardState implements g27 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final WristTemperatureObject wristTemperatureObject;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean isVirtualAccount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String ssoid;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final long dataTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final int span;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int priority;

    public WristTemperatureCardState(@NotNull WristTemperatureObject wristTemperatureObject, boolean z, @NotNull String ssoid, long j2, int i, int i2) {
        Intrinsics.checkNotNullParameter(wristTemperatureObject, "wristTemperatureObject");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.wristTemperatureObject = wristTemperatureObject;
        this.isVirtualAccount = z;
        this.ssoid = ssoid;
        this.dataTime = j2;
        this.span = i;
        this.priority = i2;
    }

    @Override // com.oplus.aiunit.vision.g27
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getSpan() {
        return this.span;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public long getDataTime() {
        return this.dataTime;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public String getSsoid() {
        return this.ssoid;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final WristTemperatureObject getWristTemperatureObject() {
        return this.wristTemperatureObject;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsVirtualAccount() {
        return this.isVirtualAccount;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WristTemperatureCardState)) {
            return false;
        }
        WristTemperatureCardState wristTemperatureCardState = (WristTemperatureCardState) other;
        return Intrinsics.areEqual(this.wristTemperatureObject, wristTemperatureCardState.wristTemperatureObject) && this.isVirtualAccount == wristTemperatureCardState.isVirtualAccount && Intrinsics.areEqual(getSsoid(), wristTemperatureCardState.getSsoid()) && getDataTime() == wristTemperatureCardState.getDataTime() && getSpan() == wristTemperatureCardState.getSpan() && getPriority() == wristTemperatureCardState.getPriority();
    }

    @Override // com.oplus.aiunit.vision.g27
    public int getPriority() {
        return this.priority;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = this.wristTemperatureObject.hashCode() * 31;
        boolean z = this.isVirtualAccount;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((iHashCode + r1) * 31) + getSsoid().hashCode()) * 31) + Long.hashCode(getDataTime())) * 31) + Integer.hashCode(getSpan())) * 31) + Integer.hashCode(getPriority());
    }

    @NotNull
    public String toString() {
        return "WristTemperatureCardState(wristTemperatureObject=" + this.wristTemperatureObject + ", isVirtualAccount=" + this.isVirtualAccount + ", ssoid=" + getSsoid() + ", dataTime=" + getDataTime() + ", span=" + getSpan() + ", priority=" + getPriority() + ")";
    }

    public /* synthetic */ WristTemperatureCardState(WristTemperatureObject wristTemperatureObject, boolean z, String str, long j2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(wristTemperatureObject, z, str, j2, (i3 & 16) != 0 ? 1 : i, (i3 & 32) != 0 ? 7 : i2);
    }
}
