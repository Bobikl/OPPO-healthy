package com.heytap.databaseengineservice.sync.responsebean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\rH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/heytap/databaseengineservice/sync/responsebean/DeviceStepsPOJO;", "", "()V", "date", "", "getDate", "()I", "setDate", "(I)V", "deviceType", "getDeviceType", "setDeviceType", "displayName", "", "getDisplayName", "()Ljava/lang/String;", "setDisplayName", "(Ljava/lang/String;)V", "manufacturer", "getManufacturer", "setManufacturer", "mobileUniqueId", "getMobileUniqueId", "setMobileUniqueId", "step", "getStep", "setStep", "toString", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeviceStepsPOJO {
    private int date = 20240201;
    private int deviceType;

    @Nullable
    private String displayName;

    @Nullable
    private String manufacturer;

    @Nullable
    private String mobileUniqueId;
    private int step;

    public final int getDate() {
        return this.date;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @Nullable
    public final String getMobileUniqueId() {
        return this.mobileUniqueId;
    }

    public final int getStep() {
        return this.step;
    }

    public final void setDate(int i) {
        this.date = i;
    }

    public final void setDeviceType(int i) {
        this.deviceType = i;
    }

    public final void setDisplayName(@Nullable String str) {
        this.displayName = str;
    }

    public final void setManufacturer(@Nullable String str) {
        this.manufacturer = str;
    }

    public final void setMobileUniqueId(@Nullable String str) {
        this.mobileUniqueId = str;
    }

    public final void setStep(int i) {
        this.step = i;
    }

    @NotNull
    public String toString() {
        return "DeviceStepsPOJO(date=" + this.date + ", manufacturer=" + this.manufacturer + ", mobileUniqueId=" + this.mobileUniqueId + ", deviceType=" + this.deviceType + ", displayName=" + this.displayName + ", step=" + this.step + ")";
    }
}
