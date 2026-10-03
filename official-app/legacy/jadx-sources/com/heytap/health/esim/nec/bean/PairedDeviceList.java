package com.heytap.health.esim.nec.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0010HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0081\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0010HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013¨\u00063"}, d2 = {"Lcom/heytap/health/esim/nec/bean/PairedDeviceList;", "", "DevType", "", "ICCID", "MSISDN", "IMSI", "EID", "DeviceID", "Lcom/heytap/health/esim/nec/bean/DeviceID;", "RSPServerAddress", "Status", "DeviceName", "ActivationCode", "ConfirmationCode", "MAXRetryTimes", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/esim/nec/bean/DeviceID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getActivationCode", "()Ljava/lang/String;", "getConfirmationCode", "getDevType", "getDeviceID", "()Lcom/heytap/health/esim/nec/bean/DeviceID;", "getDeviceName", "getEID", "getICCID", "getIMSI", "getMAXRetryTimes", "()I", "getMSISDN", "getRSPServerAddress", "getStatus", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PairedDeviceList {
    public static final int $stable = 0;

    @NotNull
    private final String ActivationCode;

    @NotNull
    private final String ConfirmationCode;

    @NotNull
    private final String DevType;

    @NotNull
    private final DeviceID DeviceID;

    @NotNull
    private final String DeviceName;

    @NotNull
    private final String EID;

    @NotNull
    private final String ICCID;

    @NotNull
    private final String IMSI;
    private final int MAXRetryTimes;

    @NotNull
    private final String MSISDN;

    @NotNull
    private final String RSPServerAddress;

    @NotNull
    private final String Status;

    public PairedDeviceList(@NotNull String DevType, @NotNull String ICCID, @NotNull String MSISDN, @NotNull String IMSI, @NotNull String EID, @NotNull DeviceID DeviceID, @NotNull String RSPServerAddress, @NotNull String Status, @NotNull String DeviceName, @NotNull String ActivationCode, @NotNull String ConfirmationCode, int i) {
        Intrinsics.checkNotNullParameter(DevType, "DevType");
        Intrinsics.checkNotNullParameter(ICCID, "ICCID");
        Intrinsics.checkNotNullParameter(MSISDN, "MSISDN");
        Intrinsics.checkNotNullParameter(IMSI, "IMSI");
        Intrinsics.checkNotNullParameter(EID, "EID");
        Intrinsics.checkNotNullParameter(DeviceID, "DeviceID");
        Intrinsics.checkNotNullParameter(RSPServerAddress, "RSPServerAddress");
        Intrinsics.checkNotNullParameter(Status, "Status");
        Intrinsics.checkNotNullParameter(DeviceName, "DeviceName");
        Intrinsics.checkNotNullParameter(ActivationCode, "ActivationCode");
        Intrinsics.checkNotNullParameter(ConfirmationCode, "ConfirmationCode");
        this.DevType = DevType;
        this.ICCID = ICCID;
        this.MSISDN = MSISDN;
        this.IMSI = IMSI;
        this.EID = EID;
        this.DeviceID = DeviceID;
        this.RSPServerAddress = RSPServerAddress;
        this.Status = Status;
        this.DeviceName = DeviceName;
        this.ActivationCode = ActivationCode;
        this.ConfirmationCode = ConfirmationCode;
        this.MAXRetryTimes = i;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDevType() {
        return this.DevType;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getActivationCode() {
        return this.ActivationCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getConfirmationCode() {
        return this.ConfirmationCode;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getMAXRetryTimes() {
        return this.MAXRetryTimes;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getICCID() {
        return this.ICCID;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMSISDN() {
        return this.MSISDN;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIMSI() {
        return this.IMSI;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEID() {
        return this.EID;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DeviceID getDeviceID() {
        return this.DeviceID;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRSPServerAddress() {
        return this.RSPServerAddress;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStatus() {
        return this.Status;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeviceName() {
        return this.DeviceName;
    }

    @NotNull
    public final PairedDeviceList copy(@NotNull String DevType, @NotNull String ICCID, @NotNull String MSISDN, @NotNull String IMSI, @NotNull String EID, @NotNull DeviceID DeviceID, @NotNull String RSPServerAddress, @NotNull String Status, @NotNull String DeviceName, @NotNull String ActivationCode, @NotNull String ConfirmationCode, int MAXRetryTimes) {
        Intrinsics.checkNotNullParameter(DevType, "DevType");
        Intrinsics.checkNotNullParameter(ICCID, "ICCID");
        Intrinsics.checkNotNullParameter(MSISDN, "MSISDN");
        Intrinsics.checkNotNullParameter(IMSI, "IMSI");
        Intrinsics.checkNotNullParameter(EID, "EID");
        Intrinsics.checkNotNullParameter(DeviceID, "DeviceID");
        Intrinsics.checkNotNullParameter(RSPServerAddress, "RSPServerAddress");
        Intrinsics.checkNotNullParameter(Status, "Status");
        Intrinsics.checkNotNullParameter(DeviceName, "DeviceName");
        Intrinsics.checkNotNullParameter(ActivationCode, "ActivationCode");
        Intrinsics.checkNotNullParameter(ConfirmationCode, "ConfirmationCode");
        return new PairedDeviceList(DevType, ICCID, MSISDN, IMSI, EID, DeviceID, RSPServerAddress, Status, DeviceName, ActivationCode, ConfirmationCode, MAXRetryTimes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PairedDeviceList)) {
            return false;
        }
        PairedDeviceList pairedDeviceList = (PairedDeviceList) other;
        return Intrinsics.areEqual(this.DevType, pairedDeviceList.DevType) && Intrinsics.areEqual(this.ICCID, pairedDeviceList.ICCID) && Intrinsics.areEqual(this.MSISDN, pairedDeviceList.MSISDN) && Intrinsics.areEqual(this.IMSI, pairedDeviceList.IMSI) && Intrinsics.areEqual(this.EID, pairedDeviceList.EID) && Intrinsics.areEqual(this.DeviceID, pairedDeviceList.DeviceID) && Intrinsics.areEqual(this.RSPServerAddress, pairedDeviceList.RSPServerAddress) && Intrinsics.areEqual(this.Status, pairedDeviceList.Status) && Intrinsics.areEqual(this.DeviceName, pairedDeviceList.DeviceName) && Intrinsics.areEqual(this.ActivationCode, pairedDeviceList.ActivationCode) && Intrinsics.areEqual(this.ConfirmationCode, pairedDeviceList.ConfirmationCode) && this.MAXRetryTimes == pairedDeviceList.MAXRetryTimes;
    }

    @NotNull
    public final String getActivationCode() {
        return this.ActivationCode;
    }

    @NotNull
    public final String getConfirmationCode() {
        return this.ConfirmationCode;
    }

    @NotNull
    public final String getDevType() {
        return this.DevType;
    }

    @NotNull
    public final DeviceID getDeviceID() {
        return this.DeviceID;
    }

    @NotNull
    public final String getDeviceName() {
        return this.DeviceName;
    }

    @NotNull
    public final String getEID() {
        return this.EID;
    }

    @NotNull
    public final String getICCID() {
        return this.ICCID;
    }

    @NotNull
    public final String getIMSI() {
        return this.IMSI;
    }

    public final int getMAXRetryTimes() {
        return this.MAXRetryTimes;
    }

    @NotNull
    public final String getMSISDN() {
        return this.MSISDN;
    }

    @NotNull
    public final String getRSPServerAddress() {
        return this.RSPServerAddress;
    }

    @NotNull
    public final String getStatus() {
        return this.Status;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.DevType.hashCode() * 31) + this.ICCID.hashCode()) * 31) + this.MSISDN.hashCode()) * 31) + this.IMSI.hashCode()) * 31) + this.EID.hashCode()) * 31) + this.DeviceID.hashCode()) * 31) + this.RSPServerAddress.hashCode()) * 31) + this.Status.hashCode()) * 31) + this.DeviceName.hashCode()) * 31) + this.ActivationCode.hashCode()) * 31) + this.ConfirmationCode.hashCode()) * 31) + Integer.hashCode(this.MAXRetryTimes);
    }

    @NotNull
    public String toString() {
        return "PairedDeviceList(DevType=" + this.DevType + ", ICCID=" + this.ICCID + ", MSISDN=" + this.MSISDN + ", IMSI=" + this.IMSI + ", EID=" + this.EID + ", DeviceID=" + this.DeviceID + ", RSPServerAddress=" + this.RSPServerAddress + ", Status=" + this.Status + ", DeviceName=" + this.DeviceName + ", ActivationCode=" + this.ActivationCode + ", ConfirmationCode=" + this.ConfirmationCode + ", MAXRetryTimes=" + this.MAXRetryTimes + ")";
    }
}
