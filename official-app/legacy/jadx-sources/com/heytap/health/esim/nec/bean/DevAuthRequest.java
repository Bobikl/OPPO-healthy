package com.heytap.health.esim.nec.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Lcom/heytap/health/esim/nec/bean/DevAuthRequest;", "", "ReqSN", "", "ReqName", "", "AuthType", "Identity", "DeviceID", "Lcom/heytap/health/esim/nec/bean/DeviceID;", "AuthToken", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/esim/nec/bean/DeviceID;Ljava/lang/String;)V", "getAuthToken", "()Ljava/lang/String;", "getAuthType", "getDeviceID", "()Lcom/heytap/health/esim/nec/bean/DeviceID;", "getIdentity", "getReqName", "getReqSN", "()I", "setReqSN", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DevAuthRequest {
    public static final int $stable = 8;

    @Nullable
    private final String AuthToken;

    @NotNull
    private final String AuthType;

    @Nullable
    private final DeviceID DeviceID;

    @NotNull
    private final String Identity;

    @NotNull
    private final String ReqName;
    private int ReqSN;

    public DevAuthRequest(int i, @NotNull String ReqName, @NotNull String AuthType, @NotNull String Identity, @Nullable DeviceID deviceID, @Nullable String str) {
        Intrinsics.checkNotNullParameter(ReqName, "ReqName");
        Intrinsics.checkNotNullParameter(AuthType, "AuthType");
        Intrinsics.checkNotNullParameter(Identity, "Identity");
        this.ReqSN = i;
        this.ReqName = ReqName;
        this.AuthType = AuthType;
        this.Identity = Identity;
        this.DeviceID = deviceID;
        this.AuthToken = str;
    }

    public static /* synthetic */ DevAuthRequest copy$default(DevAuthRequest devAuthRequest, int i, String str, String str2, String str3, DeviceID deviceID, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = devAuthRequest.ReqSN;
        }
        if ((i2 & 2) != 0) {
            str = devAuthRequest.ReqName;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = devAuthRequest.AuthType;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = devAuthRequest.Identity;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            deviceID = devAuthRequest.DeviceID;
        }
        DeviceID deviceID2 = deviceID;
        if ((i2 & 32) != 0) {
            str4 = devAuthRequest.AuthToken;
        }
        return devAuthRequest.copy(i, str5, str6, str7, deviceID2, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getReqSN() {
        return this.ReqSN;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReqName() {
        return this.ReqName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAuthType() {
        return this.AuthType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIdentity() {
        return this.Identity;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DeviceID getDeviceID() {
        return this.DeviceID;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAuthToken() {
        return this.AuthToken;
    }

    @NotNull
    public final DevAuthRequest copy(int ReqSN, @NotNull String ReqName, @NotNull String AuthType, @NotNull String Identity, @Nullable DeviceID DeviceID, @Nullable String AuthToken) {
        Intrinsics.checkNotNullParameter(ReqName, "ReqName");
        Intrinsics.checkNotNullParameter(AuthType, "AuthType");
        Intrinsics.checkNotNullParameter(Identity, "Identity");
        return new DevAuthRequest(ReqSN, ReqName, AuthType, Identity, DeviceID, AuthToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevAuthRequest)) {
            return false;
        }
        DevAuthRequest devAuthRequest = (DevAuthRequest) other;
        return this.ReqSN == devAuthRequest.ReqSN && Intrinsics.areEqual(this.ReqName, devAuthRequest.ReqName) && Intrinsics.areEqual(this.AuthType, devAuthRequest.AuthType) && Intrinsics.areEqual(this.Identity, devAuthRequest.Identity) && Intrinsics.areEqual(this.DeviceID, devAuthRequest.DeviceID) && Intrinsics.areEqual(this.AuthToken, devAuthRequest.AuthToken);
    }

    @Nullable
    public final String getAuthToken() {
        return this.AuthToken;
    }

    @NotNull
    public final String getAuthType() {
        return this.AuthType;
    }

    @Nullable
    public final DeviceID getDeviceID() {
        return this.DeviceID;
    }

    @NotNull
    public final String getIdentity() {
        return this.Identity;
    }

    @NotNull
    public final String getReqName() {
        return this.ReqName;
    }

    public final int getReqSN() {
        return this.ReqSN;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.ReqSN) * 31) + this.ReqName.hashCode()) * 31) + this.AuthType.hashCode()) * 31) + this.Identity.hashCode()) * 31;
        DeviceID deviceID = this.DeviceID;
        int iHashCode2 = (iHashCode + (deviceID == null ? 0 : deviceID.hashCode())) * 31;
        String str = this.AuthToken;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final void setReqSN(int i) {
        this.ReqSN = i;
    }

    @NotNull
    public String toString() {
        return "DevAuthRequest(ReqSN=" + this.ReqSN + ", ReqName=" + this.ReqName + ", AuthType=" + this.AuthType + ", Identity=" + this.Identity + ", DeviceID=" + this.DeviceID + ", AuthToken=" + this.AuthToken + ")";
    }

    public /* synthetic */ DevAuthRequest(int i, String str, String str2, String str3, DeviceID deviceID, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "DevAuth" : str, (i2 & 4) != 0 ? "GBA" : str2, str3, (i2 & 16) != 0 ? null : deviceID, (i2 & 32) != 0 ? null : str4);
    }
}
