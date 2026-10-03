package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.daily.view.progress.DailyActivityData;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.tq4, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u000b\u0010\u001eR\u001a\u0010\"\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001e¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/tq4;", "Lcom/oplus/aiunit/vision/g27;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/heytap/health/daily/view/progress/DailyActivityData;", "a", "Lcom/heytap/health/daily/view/progress/DailyActivityData;", "b", "()Lcom/heytap/health/daily/view/progress/DailyActivityData;", "data", "Z", MapSchema.FIELD_NAME_ENTRY, "()Z", "isVirtualAccount", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "ssoid", "", "J", "()J", "dataTime", "I", "()I", c8l.SPAN_KEY, "f", "getPriority", "priority", "<init>", "(Lcom/heytap/health/daily/view/progress/DailyActivityData;ZLjava/lang/String;JII)V", "family_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DailyCardState implements g27 {
    public static final int $stable = DailyActivityData.$stable;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final DailyActivityData data;

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

    public DailyCardState(@NotNull DailyActivityData data, boolean z, @NotNull String ssoid, long j2, int i, int i2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.data = data;
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

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final DailyActivityData getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public long getDataTime() {
        return this.dataTime;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getSsoid() {
        return this.ssoid;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getIsVirtualAccount() {
        return this.isVirtualAccount;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyCardState)) {
            return false;
        }
        DailyCardState dailyCardState = (DailyCardState) other;
        return Intrinsics.areEqual(this.data, dailyCardState.data) && this.isVirtualAccount == dailyCardState.isVirtualAccount && Intrinsics.areEqual(getSsoid(), dailyCardState.getSsoid()) && getDataTime() == dailyCardState.getDataTime() && getSpan() == dailyCardState.getSpan() && getPriority() == dailyCardState.getPriority();
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
        int iHashCode = this.data.hashCode() * 31;
        boolean z = this.isVirtualAccount;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((iHashCode + r1) * 31) + getSsoid().hashCode()) * 31) + Long.hashCode(getDataTime())) * 31) + Integer.hashCode(getSpan())) * 31) + Integer.hashCode(getPriority());
    }

    @NotNull
    public String toString() {
        return "DailyCardState(data=" + this.data + ", isVirtualAccount=" + this.isVirtualAccount + ", ssoid=" + getSsoid() + ", dataTime=" + getDataTime() + ", span=" + getSpan() + ", priority=" + getPriority() + ")";
    }

    public /* synthetic */ DailyCardState(DailyActivityData dailyActivityData, boolean z, String str, long j2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(dailyActivityData, z, str, j2, (i3 & 16) != 0 ? 2 : i, (i3 & 32) != 0 ? 1 : i2);
    }
}
