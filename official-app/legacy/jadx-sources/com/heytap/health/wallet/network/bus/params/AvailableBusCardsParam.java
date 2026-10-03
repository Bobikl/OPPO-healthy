package com.heytap.health.wallet.network.bus.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/wallet/network/bus/params/AvailableBusCardsParam;", "", "timestamp", "", j7l.KEY_CPLC, "", "location", "(JLjava/lang/String;Ljava/lang/String;)V", "getCplc", "()Ljava/lang/String;", "getLocation", "getTimestamp", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AvailableBusCardsParam {

    @NotNull
    private final String cplc;

    @NotNull
    private final String location;
    private final long timestamp;

    public AvailableBusCardsParam(long j2, @NotNull String cplc, @NotNull String location) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(location, "location");
        this.timestamp = j2;
        this.cplc = cplc;
        this.location = location;
    }

    public static /* synthetic */ AvailableBusCardsParam copy$default(AvailableBusCardsParam availableBusCardsParam, long j2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = availableBusCardsParam.timestamp;
        }
        if ((i & 2) != 0) {
            str = availableBusCardsParam.cplc;
        }
        if ((i & 4) != 0) {
            str2 = availableBusCardsParam.location;
        }
        return availableBusCardsParam.copy(j2, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    public final AvailableBusCardsParam copy(long timestamp, @NotNull String cplc, @NotNull String location) {
        Intrinsics.checkNotNullParameter(cplc, "cplc");
        Intrinsics.checkNotNullParameter(location, "location");
        return new AvailableBusCardsParam(timestamp, cplc, location);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableBusCardsParam)) {
            return false;
        }
        AvailableBusCardsParam availableBusCardsParam = (AvailableBusCardsParam) other;
        return this.timestamp == availableBusCardsParam.timestamp && Intrinsics.areEqual(this.cplc, availableBusCardsParam.cplc) && Intrinsics.areEqual(this.location, availableBusCardsParam.location);
    }

    @NotNull
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    public final String getLocation() {
        return this.location;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return (((Long.hashCode(this.timestamp) * 31) + this.cplc.hashCode()) * 31) + this.location.hashCode();
    }

    @NotNull
    public String toString() {
        return "AvailableBusCardsParam(timestamp=" + this.timestamp + ", cplc=" + this.cplc + ", location=" + this.location + ")";
    }
}
