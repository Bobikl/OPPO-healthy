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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B7\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003JE\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/heytap/health/esim/nec/bean/ServiceProvisionResponse;", "", "", "component1", "", "component2", "component3", "component4", "component5", "Lcom/heytap/health/esim/nec/bean/MultiSIMServiceRequestResponse;", "component6", "RespSN", "ReqName", "ResultCode", "WSAddress", "WSUrlDataPart", "MultiSIMServiceRequestResponse", "copy", "toString", "hashCode", "other", "", "equals", "I", "getRespSN", "()I", "Ljava/lang/String;", "getReqName", "()Ljava/lang/String;", "getResultCode", "getWSAddress", "getWSUrlDataPart", "Lcom/heytap/health/esim/nec/bean/MultiSIMServiceRequestResponse;", "getMultiSIMServiceRequestResponse", "()Lcom/heytap/health/esim/nec/bean/MultiSIMServiceRequestResponse;", "<init>", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/heytap/health/esim/nec/bean/MultiSIMServiceRequestResponse;)V", "Companion", "a", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ServiceProvisionResponse {
    public static final int $stable = 0;
    public static final int RESULT_DEALING = 2000;
    public static final int RESULT_EXCEED_MAXIMUM_USERS = 20004;
    public static final int RESULT_INFO_INSUFICATION = 2005;
    public static final int RESULT_INFO_NOT_MATCH = 2006;
    public static final int RESULT_NO_PERMISSION = 2002;
    public static final int RESULT_REPEAT_ACTIVATION = 2008;
    public static final int RESULT_SERVICE_NOT_PROVIDED = 2007;
    public static final int RESULT_SYSTEM_ERROR = 2003;
    public static final int RESULT_USER_NO_EXIST = 2001;

    @NotNull
    private final MultiSIMServiceRequestResponse MultiSIMServiceRequestResponse;

    @NotNull
    private final String ReqName;
    private final int RespSN;
    private final int ResultCode;

    @NotNull
    private final String WSAddress;

    @NotNull
    private final String WSUrlDataPart;

    public ServiceProvisionResponse(int i, @NotNull String ReqName, int i2, @NotNull String WSAddress, @NotNull String WSUrlDataPart, @NotNull MultiSIMServiceRequestResponse MultiSIMServiceRequestResponse) {
        Intrinsics.checkNotNullParameter(ReqName, "ReqName");
        Intrinsics.checkNotNullParameter(WSAddress, "WSAddress");
        Intrinsics.checkNotNullParameter(WSUrlDataPart, "WSUrlDataPart");
        Intrinsics.checkNotNullParameter(MultiSIMServiceRequestResponse, "MultiSIMServiceRequestResponse");
        this.RespSN = i;
        this.ReqName = ReqName;
        this.ResultCode = i2;
        this.WSAddress = WSAddress;
        this.WSUrlDataPart = WSUrlDataPart;
        this.MultiSIMServiceRequestResponse = MultiSIMServiceRequestResponse;
    }

    public static /* synthetic */ ServiceProvisionResponse copy$default(ServiceProvisionResponse serviceProvisionResponse, int i, String str, int i2, String str2, String str3, MultiSIMServiceRequestResponse multiSIMServiceRequestResponse, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = serviceProvisionResponse.RespSN;
        }
        if ((i3 & 2) != 0) {
            str = serviceProvisionResponse.ReqName;
        }
        String str4 = str;
        if ((i3 & 4) != 0) {
            i2 = serviceProvisionResponse.ResultCode;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            str2 = serviceProvisionResponse.WSAddress;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = serviceProvisionResponse.WSUrlDataPart;
        }
        String str6 = str3;
        if ((i3 & 32) != 0) {
            multiSIMServiceRequestResponse = serviceProvisionResponse.MultiSIMServiceRequestResponse;
        }
        return serviceProvisionResponse.copy(i, str4, i4, str5, str6, multiSIMServiceRequestResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRespSN() {
        return this.RespSN;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReqName() {
        return this.ReqName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getResultCode() {
        return this.ResultCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWSAddress() {
        return this.WSAddress;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWSUrlDataPart() {
        return this.WSUrlDataPart;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MultiSIMServiceRequestResponse getMultiSIMServiceRequestResponse() {
        return this.MultiSIMServiceRequestResponse;
    }

    @NotNull
    public final ServiceProvisionResponse copy(int RespSN, @NotNull String ReqName, int ResultCode, @NotNull String WSAddress, @NotNull String WSUrlDataPart, @NotNull MultiSIMServiceRequestResponse MultiSIMServiceRequestResponse) {
        Intrinsics.checkNotNullParameter(ReqName, "ReqName");
        Intrinsics.checkNotNullParameter(WSAddress, "WSAddress");
        Intrinsics.checkNotNullParameter(WSUrlDataPart, "WSUrlDataPart");
        Intrinsics.checkNotNullParameter(MultiSIMServiceRequestResponse, "MultiSIMServiceRequestResponse");
        return new ServiceProvisionResponse(RespSN, ReqName, ResultCode, WSAddress, WSUrlDataPart, MultiSIMServiceRequestResponse);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceProvisionResponse)) {
            return false;
        }
        ServiceProvisionResponse serviceProvisionResponse = (ServiceProvisionResponse) other;
        return this.RespSN == serviceProvisionResponse.RespSN && Intrinsics.areEqual(this.ReqName, serviceProvisionResponse.ReqName) && this.ResultCode == serviceProvisionResponse.ResultCode && Intrinsics.areEqual(this.WSAddress, serviceProvisionResponse.WSAddress) && Intrinsics.areEqual(this.WSUrlDataPart, serviceProvisionResponse.WSUrlDataPart) && Intrinsics.areEqual(this.MultiSIMServiceRequestResponse, serviceProvisionResponse.MultiSIMServiceRequestResponse);
    }

    @NotNull
    public final MultiSIMServiceRequestResponse getMultiSIMServiceRequestResponse() {
        return this.MultiSIMServiceRequestResponse;
    }

    @NotNull
    public final String getReqName() {
        return this.ReqName;
    }

    public final int getRespSN() {
        return this.RespSN;
    }

    public final int getResultCode() {
        return this.ResultCode;
    }

    @NotNull
    public final String getWSAddress() {
        return this.WSAddress;
    }

    @NotNull
    public final String getWSUrlDataPart() {
        return this.WSUrlDataPart;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.RespSN) * 31) + this.ReqName.hashCode()) * 31) + Integer.hashCode(this.ResultCode)) * 31) + this.WSAddress.hashCode()) * 31) + this.WSUrlDataPart.hashCode()) * 31) + this.MultiSIMServiceRequestResponse.hashCode();
    }

    @NotNull
    public String toString() {
        return "ServiceProvisionResponse(RespSN=" + this.RespSN + ", ReqName=" + this.ReqName + ", ResultCode=" + this.ResultCode + ", WSAddress=" + this.WSAddress + ", WSUrlDataPart=" + this.WSUrlDataPart + ", MultiSIMServiceRequestResponse=" + this.MultiSIMServiceRequestResponse + ")";
    }
}
