package com.oplus.aiunit.vision;

import com.heytap.health.menstrual.data.PeriodCloseStatus;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.fee, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J=\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\"\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0019\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/oplus/aiunit/vision/fee;", "", "", "toString", "other", "", "equals", "", f04.JSON_KEY_DIGITAL_KEY_START_TIME, "endDate", "modifiedTime", "Lcom/heytap/health/menstrual/data/PeriodCloseStatus;", "periodCloseStatus", "dataClient", "a", "", "hashCode", "J", b2n.f, "()J", LogFieldKey.LEVEL_KEY, "(J)V", "b", "d", "i", "c", MapSchema.FIELD_NAME_ENTRY, "j", "Lcom/heytap/health/menstrual/data/PeriodCloseStatus;", "f", "()Lcom/heytap/health/menstrual/data/PeriodCloseStatus;", MapSchema.FIELD_NAME_KEY, "(Lcom/heytap/health/menstrual/data/PeriodCloseStatus;)V", "Ljava/lang/String;", "()Ljava/lang/String;", b2n.g, "(Ljava/lang/String;)V", "<init>", "(JJJLcom/heytap/health/menstrual/data/PeriodCloseStatus;Ljava/lang/String;)V", "menstrual_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Period {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public long startDate;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public long endDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public long modifiedTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public PeriodCloseStatus closeStatus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public String dataClient;

    public Period(long j2, long j3, long j4, @Nullable PeriodCloseStatus periodCloseStatus, @NotNull String dataClient) {
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.startDate = j2;
        this.endDate = j3;
        this.modifiedTime = j4;
        this.closeStatus = periodCloseStatus;
        this.dataClient = dataClient;
    }

    @NotNull
    public final Period a(long startDate, long endDate, long modifiedTime, @Nullable PeriodCloseStatus periodCloseStatus, @NotNull String dataClient) {
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        return new Period(startDate, endDate, modifiedTime, periodCloseStatus, dataClient);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDataClient() {
        return this.dataClient;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getModifiedTime() {
        return this.modifiedTime;
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof Period)) {
            return false;
        }
        Period period = (Period) other;
        return Intrinsics.areEqual(o05.D(period.startDate), o05.D(this.startDate)) && Intrinsics.areEqual(o05.D(period.endDate), o05.D(this.endDate));
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final PeriodCloseStatus getCloseStatus() {
        return this.closeStatus;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    public final void h(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataClient = str;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.startDate) * 31) + Long.hashCode(this.endDate)) * 31) + Long.hashCode(this.modifiedTime)) * 31;
        PeriodCloseStatus periodCloseStatus = this.closeStatus;
        return ((iHashCode + (periodCloseStatus == null ? 0 : periodCloseStatus.hashCode())) * 31) + this.dataClient.hashCode();
    }

    public final void i(long j2) {
        this.endDate = j2;
    }

    public final void j(long j2) {
        this.modifiedTime = j2;
    }

    public final void k(@Nullable PeriodCloseStatus periodCloseStatus) {
        this.closeStatus = periodCloseStatus;
    }

    public final void l(long j2) {
        this.startDate = j2;
    }

    @NotNull
    public String toString() {
        String str = "Period(startDate=" + o05.E(this.startDate) + ",endDate=" + o05.E(this.endDate) + ",modifiedTime=" + o05.E(this.modifiedTime) + ",closeStatus=" + this.closeStatus + ",dataClient=" + this.dataClient + ")\n";
        Intrinsics.checkNotNullExpressionValue(str, "builder.toString()");
        return str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Period(long j2, long j3, long j4, PeriodCloseStatus periodCloseStatus, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str2;
        PeriodCloseStatus periodCloseStatus2 = (i & 8) != 0 ? null : periodCloseStatus;
        if ((i & 16) != 0) {
            String strG = ilj.g();
            Intrinsics.checkNotNullExpressionValue(strG, "getDataClient()");
            str2 = strG;
        } else {
            str2 = str;
        }
        this(j2, j3, j4, periodCloseStatus2, str2);
    }
}
