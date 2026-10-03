package com.heytap.health.watch.notification.impl.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/watch/notification/impl/bean/DeviceStatusReq;", "", "businessType", "", "guid", "", "(ILjava/lang/String;)V", "getBusinessType", "()I", "getGuid", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DeviceStatusReq {
    private final int businessType;

    @NotNull
    private final String guid;

    public DeviceStatusReq(int i, @NotNull String guid) {
        Intrinsics.checkNotNullParameter(guid, "guid");
        this.businessType = i;
        this.guid = guid;
    }

    public static /* synthetic */ DeviceStatusReq copy$default(DeviceStatusReq deviceStatusReq, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = deviceStatusReq.businessType;
        }
        if ((i2 & 2) != 0) {
            str = deviceStatusReq.guid;
        }
        return deviceStatusReq.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBusinessType() {
        return this.businessType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGuid() {
        return this.guid;
    }

    @NotNull
    public final DeviceStatusReq copy(int businessType, @NotNull String guid) {
        Intrinsics.checkNotNullParameter(guid, "guid");
        return new DeviceStatusReq(businessType, guid);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceStatusReq)) {
            return false;
        }
        DeviceStatusReq deviceStatusReq = (DeviceStatusReq) other;
        return this.businessType == deviceStatusReq.businessType && Intrinsics.areEqual(this.guid, deviceStatusReq.guid);
    }

    public final int getBusinessType() {
        return this.businessType;
    }

    @NotNull
    public final String getGuid() {
        return this.guid;
    }

    public int hashCode() {
        return (Integer.hashCode(this.businessType) * 31) + this.guid.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceStatusReq(businessType=" + this.businessType + ", guid=" + this.guid + ")";
    }

    public /* synthetic */ DeviceStatusReq(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, str);
    }
}
