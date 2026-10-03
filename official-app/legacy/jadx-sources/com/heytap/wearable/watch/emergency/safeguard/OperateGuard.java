package com.heytap.wearable.watch.emergency.safeguard;

import androidx.annotation.Keep;
import com.heytap.wearable.emergency.api.emergency.EmergencyTransportApis;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/OperateGuard;", "", EmergencyTransportApis.KEY_TRAVEL_ID, "", "dataClient", "travelStatus", "", "(Ljava/lang/String;Ljava/lang/String;I)V", "getDataClient", "()Ljava/lang/String;", "getTravelId", "getTravelStatus", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "emergency_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OperateGuard {

    @NotNull
    private final String dataClient;

    @NotNull
    private final String travelId;
    private final int travelStatus;

    public OperateGuard(@NotNull String travelId, @NotNull String dataClient, int i) {
        Intrinsics.checkNotNullParameter(travelId, "travelId");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        this.travelId = travelId;
        this.dataClient = dataClient;
        this.travelStatus = i;
    }

    public static /* synthetic */ OperateGuard copy$default(OperateGuard operateGuard, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = operateGuard.travelId;
        }
        if ((i2 & 2) != 0) {
            str2 = operateGuard.dataClient;
        }
        if ((i2 & 4) != 0) {
            i = operateGuard.travelStatus;
        }
        return operateGuard.copy(str, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTravelId() {
        return this.travelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDataClient() {
        return this.dataClient;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTravelStatus() {
        return this.travelStatus;
    }

    @NotNull
    public final OperateGuard copy(@NotNull String travelId, @NotNull String dataClient, int travelStatus) {
        Intrinsics.checkNotNullParameter(travelId, "travelId");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        return new OperateGuard(travelId, dataClient, travelStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OperateGuard)) {
            return false;
        }
        OperateGuard operateGuard = (OperateGuard) other;
        return Intrinsics.areEqual(this.travelId, operateGuard.travelId) && Intrinsics.areEqual(this.dataClient, operateGuard.dataClient) && this.travelStatus == operateGuard.travelStatus;
    }

    @NotNull
    public final String getDataClient() {
        return this.dataClient;
    }

    @NotNull
    public final String getTravelId() {
        return this.travelId;
    }

    public final int getTravelStatus() {
        return this.travelStatus;
    }

    public int hashCode() {
        return (((this.travelId.hashCode() * 31) + this.dataClient.hashCode()) * 31) + Integer.hashCode(this.travelStatus);
    }

    @NotNull
    public String toString() {
        return "OperateGuard(travelId=" + this.travelId + ", dataClient=" + this.dataClient + ", travelStatus=" + this.travelStatus + ")";
    }
}
