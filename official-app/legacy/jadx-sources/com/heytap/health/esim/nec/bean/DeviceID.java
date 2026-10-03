package com.heytap.health.esim.nec.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.collect.auto.SystemInfoCollect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/esim/nec/bean/DeviceID;", "", SystemInfoCollect.IMEI, "", "MEID", "SN", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIMEI", "()Ljava/lang/String;", "getMEID", "getSN", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DeviceID {
    public static final int $stable = 0;

    @NotNull
    private final String IMEI;

    @Nullable
    private final String MEID;

    @Nullable
    private final String SN;

    public DeviceID(@NotNull String IMEI, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(IMEI, "IMEI");
        this.IMEI = IMEI;
        this.MEID = str;
        this.SN = str2;
    }

    public static /* synthetic */ DeviceID copy$default(DeviceID deviceID, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceID.IMEI;
        }
        if ((i & 2) != 0) {
            str2 = deviceID.MEID;
        }
        if ((i & 4) != 0) {
            str3 = deviceID.SN;
        }
        return deviceID.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIMEI() {
        return this.IMEI;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMEID() {
        return this.MEID;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSN() {
        return this.SN;
    }

    @NotNull
    public final DeviceID copy(@NotNull String IMEI, @Nullable String MEID, @Nullable String SN) {
        Intrinsics.checkNotNullParameter(IMEI, "IMEI");
        return new DeviceID(IMEI, MEID, SN);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceID)) {
            return false;
        }
        DeviceID deviceID = (DeviceID) other;
        return Intrinsics.areEqual(this.IMEI, deviceID.IMEI) && Intrinsics.areEqual(this.MEID, deviceID.MEID) && Intrinsics.areEqual(this.SN, deviceID.SN);
    }

    @NotNull
    public final String getIMEI() {
        return this.IMEI;
    }

    @Nullable
    public final String getMEID() {
        return this.MEID;
    }

    @Nullable
    public final String getSN() {
        return this.SN;
    }

    public int hashCode() {
        int iHashCode = this.IMEI.hashCode() * 31;
        String str = this.MEID;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.SN;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeviceID(IMEI=" + this.IMEI + ", MEID=" + this.MEID + ", SN=" + this.SN + ")";
    }
}
