package com.heytap.device.data.api;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/device/data/api/HolidayRequest;", "", "switchType", "", "(I)V", "getSwitchType", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class HolidayRequest {
    private final int switchType;

    public HolidayRequest() {
        this(0, 1, null);
    }

    public static /* synthetic */ HolidayRequest copy$default(HolidayRequest holidayRequest, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = holidayRequest.switchType;
        }
        return holidayRequest.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSwitchType() {
        return this.switchType;
    }

    @NotNull
    public final HolidayRequest copy(int switchType) {
        return new HolidayRequest(switchType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HolidayRequest) && this.switchType == ((HolidayRequest) other).switchType;
    }

    public final int getSwitchType() {
        return this.switchType;
    }

    public int hashCode() {
        return Integer.hashCode(this.switchType);
    }

    @NotNull
    public String toString() {
        return "HolidayRequest(switchType=" + this.switchType + ")";
    }

    public HolidayRequest(int i) {
        this.switchType = i;
    }

    public /* synthetic */ HolidayRequest(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 92 : i);
    }
}
