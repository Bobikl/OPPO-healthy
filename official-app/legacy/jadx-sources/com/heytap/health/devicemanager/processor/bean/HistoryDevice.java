package com.heytap.health.devicemanager.processor.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/devicemanager/processor/bean/HistoryDevice;", "", "deviceUniqueIds", "", "", "(Ljava/util/List;)V", "getDeviceUniqueIds", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "device_manager_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HistoryDevice {

    @SerializedName("deviceUniqueIds")
    @NotNull
    private final List<String> deviceUniqueIds;

    public HistoryDevice(@NotNull List<String> deviceUniqueIds) {
        Intrinsics.checkNotNullParameter(deviceUniqueIds, "deviceUniqueIds");
        this.deviceUniqueIds = deviceUniqueIds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistoryDevice copy$default(HistoryDevice historyDevice, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = historyDevice.deviceUniqueIds;
        }
        return historyDevice.copy(list);
    }

    @NotNull
    public final List<String> component1() {
        return this.deviceUniqueIds;
    }

    @NotNull
    public final HistoryDevice copy(@NotNull List<String> deviceUniqueIds) {
        Intrinsics.checkNotNullParameter(deviceUniqueIds, "deviceUniqueIds");
        return new HistoryDevice(deviceUniqueIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HistoryDevice) && Intrinsics.areEqual(this.deviceUniqueIds, ((HistoryDevice) other).deviceUniqueIds);
    }

    @NotNull
    public final List<String> getDeviceUniqueIds() {
        return this.deviceUniqueIds;
    }

    public int hashCode() {
        return this.deviceUniqueIds.hashCode();
    }

    @NotNull
    public String toString() {
        return "HistoryDevice(deviceUniqueIds=" + this.deviceUniqueIds + ")";
    }
}
