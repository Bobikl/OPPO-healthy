package com.heytap.wearable.watch.emergency.safeguard;

import androidx.annotation.Keep;
import com.heytap.wearable.emergency.api.emergency.EmergencyTransportApis;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/PushResult;", "", "messageType", "", EmergencyTransportApis.KEY_TRAVEL_ID, "", "timestamp", "", "(ILjava/lang/String;Ljava/lang/Long;)V", "getMessageType", "()I", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTravelId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Long;)Lcom/heytap/wearable/watch/emergency/safeguard/PushResult;", "equals", "", "other", "hashCode", "toString", "emergency_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PushResult {
    private final int messageType;

    @Nullable
    private final Long timestamp;

    @NotNull
    private final String travelId;

    public PushResult(int i, @NotNull String travelId, @Nullable Long l2) {
        Intrinsics.checkNotNullParameter(travelId, "travelId");
        this.messageType = i;
        this.travelId = travelId;
        this.timestamp = l2;
    }

    public static /* synthetic */ PushResult copy$default(PushResult pushResult, int i, String str, Long l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pushResult.messageType;
        }
        if ((i2 & 2) != 0) {
            str = pushResult.travelId;
        }
        if ((i2 & 4) != 0) {
            l2 = pushResult.timestamp;
        }
        return pushResult.copy(i, str, l2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMessageType() {
        return this.messageType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTravelId() {
        return this.travelId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final PushResult copy(int messageType, @NotNull String travelId, @Nullable Long timestamp) {
        Intrinsics.checkNotNullParameter(travelId, "travelId");
        return new PushResult(messageType, travelId, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PushResult)) {
            return false;
        }
        PushResult pushResult = (PushResult) other;
        return this.messageType == pushResult.messageType && Intrinsics.areEqual(this.travelId, pushResult.travelId) && Intrinsics.areEqual(this.timestamp, pushResult.timestamp);
    }

    public final int getMessageType() {
        return this.messageType;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getTravelId() {
        return this.travelId;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.messageType) * 31) + this.travelId.hashCode()) * 31;
        Long l2 = this.timestamp;
        return iHashCode + (l2 == null ? 0 : l2.hashCode());
    }

    @NotNull
    public String toString() {
        return "PushResult(messageType=" + this.messageType + ", travelId=" + this.travelId + ", timestamp=" + this.timestamp + ")";
    }
}
