package com.heytap.health.watch.notification.impl.bean;

import androidx.annotation.Keep;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/watch/notification/impl/bean/DevicePushMessageEvent;", "", "serviceId", "", "commandId", "data", "", "(II[B)V", "getCommandId", "()I", "getData", "()[B", "getServiceId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DevicePushMessageEvent {
    private final int commandId;

    @NotNull
    private final byte[] data;
    private final int serviceId;

    public DevicePushMessageEvent(int i, int i2, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.serviceId = i;
        this.commandId = i2;
        this.data = data;
    }

    public static /* synthetic */ DevicePushMessageEvent copy$default(DevicePushMessageEvent devicePushMessageEvent, int i, int i2, byte[] bArr, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = devicePushMessageEvent.serviceId;
        }
        if ((i3 & 2) != 0) {
            i2 = devicePushMessageEvent.commandId;
        }
        if ((i3 & 4) != 0) {
            bArr = devicePushMessageEvent.data;
        }
        return devicePushMessageEvent.copy(i, i2, bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCommandId() {
        return this.commandId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    public final DevicePushMessageEvent copy(int serviceId, int commandId, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new DevicePushMessageEvent(serviceId, commandId, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(DevicePushMessageEvent.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.watch.notification.impl.bean.DevicePushMessageEvent");
        DevicePushMessageEvent devicePushMessageEvent = (DevicePushMessageEvent) other;
        return this.serviceId == devicePushMessageEvent.serviceId && this.commandId == devicePushMessageEvent.commandId && Arrays.equals(this.data, devicePushMessageEvent.data);
    }

    public final int getCommandId() {
        return this.commandId;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    public final int getServiceId() {
        return this.serviceId;
    }

    public int hashCode() {
        return (((this.serviceId * 31) + this.commandId) * 31) + Arrays.hashCode(this.data);
    }

    @NotNull
    public String toString() {
        return "DevicePushMessageEvent(serviceId=" + this.serviceId + ", commandId=" + this.commandId + ", data=" + Arrays.toString(this.data) + ")";
    }
}
