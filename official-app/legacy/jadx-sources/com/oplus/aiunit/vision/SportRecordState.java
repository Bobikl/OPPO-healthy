package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.health.familymode.request.FamilySportRecord;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.agi, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0013\u0012\b\b\u0002\u0010(\u001a\u00020\u0004\u0012\b\b\u0002\u0010+\u001a\u00020\u0004¢\u0006\u0004\b,\u0010-J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!R\u001a\u0010$\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001a\u0010(\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\f\u0010'R\u001a\u0010+\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010'¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/agi;", "Lcom/oplus/aiunit/vision/g27;", "", "toString", "", "hashCode", "", "other", "", "equals", "", "Lcom/heytap/health/health/familymode/request/FamilySportRecord;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "setSportRecordList", "(Ljava/util/List;)V", "sportRecordList", "", "b", "J", "getStartTime", "()J", "startTime", "getEndTime", "endTime", "d", "Z", "isVirtualAccount", "()Z", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/String;", "()Ljava/lang/String;", "ssoid", "f", "dataTime", b2n.f, "I", "()I", c8l.SPAN_KEY, b2n.g, "getPriority", "priority", "<init>", "(Ljava/util/List;JJZLjava/lang/String;JII)V", "family_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SportRecordState implements g27 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public List<FamilySportRecord> sportRecordList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final long startTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final long endTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean isVirtualAccount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String ssoid;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final long dataTime;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int span;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final int priority;

    public SportRecordState(@NotNull List<FamilySportRecord> sportRecordList, long j2, long j3, boolean z, @NotNull String ssoid, long j4, int i, int i2) {
        Intrinsics.checkNotNullParameter(sportRecordList, "sportRecordList");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.sportRecordList = sportRecordList;
        this.startTime = j2;
        this.endTime = j3;
        this.isVirtualAccount = z;
        this.ssoid = ssoid;
        this.dataTime = j4;
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
    public final List<FamilySportRecord> c() {
        return this.sportRecordList;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public String getSsoid() {
        return this.ssoid;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportRecordState)) {
            return false;
        }
        SportRecordState sportRecordState = (SportRecordState) other;
        return Intrinsics.areEqual(this.sportRecordList, sportRecordState.sportRecordList) && this.startTime == sportRecordState.startTime && this.endTime == sportRecordState.endTime && this.isVirtualAccount == sportRecordState.isVirtualAccount && Intrinsics.areEqual(getSsoid(), sportRecordState.getSsoid()) && getDataTime() == sportRecordState.getDataTime() && getSpan() == sportRecordState.getSpan() && getPriority() == sportRecordState.getPriority();
    }

    @Override // com.oplus.aiunit.vision.g27
    public int getPriority() {
        return this.priority;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public int hashCode() {
        int iHashCode = ((((this.sportRecordList.hashCode() * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31;
        boolean z = this.isVirtualAccount;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((iHashCode + r1) * 31) + getSsoid().hashCode()) * 31) + Long.hashCode(getDataTime())) * 31) + Integer.hashCode(getSpan())) * 31) + Integer.hashCode(getPriority());
    }

    @NotNull
    public String toString() {
        return "SportRecordState(sportRecordList=" + this.sportRecordList + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", isVirtualAccount=" + this.isVirtualAccount + ", ssoid=" + getSsoid() + ", dataTime=" + getDataTime() + ", span=" + getSpan() + ", priority=" + getPriority() + ")";
    }

    public /* synthetic */ SportRecordState(List list, long j2, long j3, boolean z, String str, long j4, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, j2, j3, z, str, j4, (i3 & 64) != 0 ? 2 : i, (i3 & 128) != 0 ? 10 : i2);
    }
}
