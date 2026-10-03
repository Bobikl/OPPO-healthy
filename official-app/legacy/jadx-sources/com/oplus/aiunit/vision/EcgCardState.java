package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.ECGRecord;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.lc6, reason: from toString */
/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\b\b\u0002\u0010#\u001a\u00020\u0004\u0012\b\b\u0002\u0010&\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010 \u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R\u001a\u0010#\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u000b\u0010\"R\u001a\u0010&\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010\"¨\u0006)"}, d2 = {"Lcom/oplus/aiunit/vision/lc6;", "Lcom/oplus/aiunit/vision/g27;", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/heytap/databaseengine/model/ECGRecord;", "a", "Lcom/heytap/databaseengine/model/ECGRecord;", "c", "()Lcom/heytap/databaseengine/model/ECGRecord;", "ecgRecord", "", "b", "J", "f", "()J", "startTime", "d", "endTime", "Z", b2n.f, "()Z", "isVirtualAccount", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/String;", "()Ljava/lang/String;", "ssoid", "dataTime", "I", "()I", c8l.SPAN_KEY, b2n.g, "getPriority", "priority", "<init>", "(Lcom/heytap/databaseengine/model/ECGRecord;JJZLjava/lang/String;JII)V", "family_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class EcgCardState implements g27 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final ECGRecord ecgRecord;

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

    public EcgCardState(@NotNull ECGRecord ecgRecord, long j2, long j3, boolean z, @NotNull String ssoid, long j4, int i, int i2) {
        Intrinsics.checkNotNullParameter(ecgRecord, "ecgRecord");
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.ecgRecord = ecgRecord;
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
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ECGRecord getEcgRecord() {
        return this.ecgRecord;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public String getSsoid() {
        return this.ssoid;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgCardState)) {
            return false;
        }
        EcgCardState ecgCardState = (EcgCardState) other;
        return Intrinsics.areEqual(this.ecgRecord, ecgCardState.ecgRecord) && this.startTime == ecgCardState.startTime && this.endTime == ecgCardState.endTime && this.isVirtualAccount == ecgCardState.isVirtualAccount && Intrinsics.areEqual(getSsoid(), ecgCardState.getSsoid()) && getDataTime() == ecgCardState.getDataTime() && getSpan() == ecgCardState.getSpan() && getPriority() == ecgCardState.getPriority();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsVirtualAccount() {
        return this.isVirtualAccount;
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
        int iHashCode = ((((this.ecgRecord.hashCode() * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31;
        boolean z = this.isVirtualAccount;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((((((((iHashCode + r1) * 31) + getSsoid().hashCode()) * 31) + Long.hashCode(getDataTime())) * 31) + Integer.hashCode(getSpan())) * 31) + Integer.hashCode(getPriority());
    }

    @NotNull
    public String toString() {
        return "EcgCardState(ecgRecord=" + this.ecgRecord + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", isVirtualAccount=" + this.isVirtualAccount + ", ssoid=" + getSsoid() + ", dataTime=" + getDataTime() + ", span=" + getSpan() + ", priority=" + getPriority() + ")";
    }

    public /* synthetic */ EcgCardState(ECGRecord eCGRecord, long j2, long j3, boolean z, String str, long j4, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(eCGRecord, j2, j3, z, str, j4, (i3 & 64) != 0 ? 1 : i, (i3 & 128) != 0 ? 8 : i2);
    }
}
