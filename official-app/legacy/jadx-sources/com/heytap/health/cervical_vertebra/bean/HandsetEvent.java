package com.heytap.health.cervical_vertebra.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/cervical_vertebra/bean/HandsetEvent;", "", "wearStatus", "", "connectStatus", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getConnectStatus", "()Ljava/lang/Integer;", "setConnectStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getWearStatus", "()Ljava/lang/String;", "setWearStatus", "(Ljava/lang/String;)V", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/heytap/health/cervical_vertebra/bean/HandsetEvent;", "equals", "", "other", "hashCode", "toString", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HandsetEvent {

    @Nullable
    private Integer connectStatus;

    @Nullable
    private String wearStatus;

    public HandsetEvent(@Nullable String str, @Nullable Integer num) {
        this.wearStatus = str;
        this.connectStatus = num;
    }

    public static /* synthetic */ HandsetEvent copy$default(HandsetEvent handsetEvent, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = handsetEvent.wearStatus;
        }
        if ((i & 2) != 0) {
            num = handsetEvent.connectStatus;
        }
        return handsetEvent.copy(str, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWearStatus() {
        return this.wearStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getConnectStatus() {
        return this.connectStatus;
    }

    @NotNull
    public final HandsetEvent copy(@Nullable String wearStatus, @Nullable Integer connectStatus) {
        return new HandsetEvent(wearStatus, connectStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HandsetEvent)) {
            return false;
        }
        HandsetEvent handsetEvent = (HandsetEvent) other;
        return Intrinsics.areEqual(this.wearStatus, handsetEvent.wearStatus) && Intrinsics.areEqual(this.connectStatus, handsetEvent.connectStatus);
    }

    @Nullable
    public final Integer getConnectStatus() {
        return this.connectStatus;
    }

    @Nullable
    public final String getWearStatus() {
        return this.wearStatus;
    }

    public int hashCode() {
        String str = this.wearStatus;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.connectStatus;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final void setConnectStatus(@Nullable Integer num) {
        this.connectStatus = num;
    }

    public final void setWearStatus(@Nullable String str) {
        this.wearStatus = str;
    }

    @NotNull
    public String toString() {
        return "HandsetEvent(wearStatus=" + this.wearStatus + ", connectStatus=" + this.connectStatus + ")";
    }
}
