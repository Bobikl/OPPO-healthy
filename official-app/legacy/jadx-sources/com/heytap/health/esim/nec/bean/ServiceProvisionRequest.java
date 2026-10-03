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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006!"}, d2 = {"Lcom/heytap/health/esim/nec/bean/ServiceProvisionRequest;", "", "ReqSN", "", "ReqName", "", "PrimaryIDType", "PrimaryID", "Services", "MultiSIMServiceRequest", "Lcom/heytap/health/esim/nec/bean/MultiSIMServiceRequest;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/health/esim/nec/bean/MultiSIMServiceRequest;)V", "getMultiSIMServiceRequest", "()Lcom/heytap/health/esim/nec/bean/MultiSIMServiceRequest;", "getPrimaryID", "()Ljava/lang/String;", "getPrimaryIDType", "getReqName", "getReqSN", "()I", "getServices", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ServiceProvisionRequest {
    public static final int $stable = 8;

    @NotNull
    private final MultiSIMServiceRequest MultiSIMServiceRequest;

    @NotNull
    private final String PrimaryID;

    @NotNull
    private final String PrimaryIDType;

    @NotNull
    private final String ReqName;
    private final int ReqSN;

    @NotNull
    private final String Services;

    public ServiceProvisionRequest(int i, @NotNull String ReqName, @NotNull String PrimaryIDType, @NotNull String PrimaryID, @NotNull String Services, @NotNull MultiSIMServiceRequest MultiSIMServiceRequest) {
        Intrinsics.checkNotNullParameter(ReqName, "ReqName");
        Intrinsics.checkNotNullParameter(PrimaryIDType, "PrimaryIDType");
        Intrinsics.checkNotNullParameter(PrimaryID, "PrimaryID");
        Intrinsics.checkNotNullParameter(Services, "Services");
        Intrinsics.checkNotNullParameter(MultiSIMServiceRequest, "MultiSIMServiceRequest");
        this.ReqSN = i;
        this.ReqName = ReqName;
        this.PrimaryIDType = PrimaryIDType;
        this.PrimaryID = PrimaryID;
        this.Services = Services;
        this.MultiSIMServiceRequest = MultiSIMServiceRequest;
    }

    public static /* synthetic */ ServiceProvisionRequest copy$default(ServiceProvisionRequest serviceProvisionRequest, int i, String str, String str2, String str3, String str4, MultiSIMServiceRequest multiSIMServiceRequest, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = serviceProvisionRequest.ReqSN;
        }
        if ((i2 & 2) != 0) {
            str = serviceProvisionRequest.ReqName;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = serviceProvisionRequest.PrimaryIDType;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = serviceProvisionRequest.PrimaryID;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = serviceProvisionRequest.Services;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            multiSIMServiceRequest = serviceProvisionRequest.MultiSIMServiceRequest;
        }
        return serviceProvisionRequest.copy(i, str5, str6, str7, str8, multiSIMServiceRequest);
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
    public final String getPrimaryIDType() {
        return this.PrimaryIDType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrimaryID() {
        return this.PrimaryID;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getServices() {
        return this.Services;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MultiSIMServiceRequest getMultiSIMServiceRequest() {
        return this.MultiSIMServiceRequest;
    }

    @NotNull
    public final ServiceProvisionRequest copy(int ReqSN, @NotNull String ReqName, @NotNull String PrimaryIDType, @NotNull String PrimaryID, @NotNull String Services, @NotNull MultiSIMServiceRequest MultiSIMServiceRequest) {
        Intrinsics.checkNotNullParameter(ReqName, "ReqName");
        Intrinsics.checkNotNullParameter(PrimaryIDType, "PrimaryIDType");
        Intrinsics.checkNotNullParameter(PrimaryID, "PrimaryID");
        Intrinsics.checkNotNullParameter(Services, "Services");
        Intrinsics.checkNotNullParameter(MultiSIMServiceRequest, "MultiSIMServiceRequest");
        return new ServiceProvisionRequest(ReqSN, ReqName, PrimaryIDType, PrimaryID, Services, MultiSIMServiceRequest);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceProvisionRequest)) {
            return false;
        }
        ServiceProvisionRequest serviceProvisionRequest = (ServiceProvisionRequest) other;
        return this.ReqSN == serviceProvisionRequest.ReqSN && Intrinsics.areEqual(this.ReqName, serviceProvisionRequest.ReqName) && Intrinsics.areEqual(this.PrimaryIDType, serviceProvisionRequest.PrimaryIDType) && Intrinsics.areEqual(this.PrimaryID, serviceProvisionRequest.PrimaryID) && Intrinsics.areEqual(this.Services, serviceProvisionRequest.Services) && Intrinsics.areEqual(this.MultiSIMServiceRequest, serviceProvisionRequest.MultiSIMServiceRequest);
    }

    @NotNull
    public final MultiSIMServiceRequest getMultiSIMServiceRequest() {
        return this.MultiSIMServiceRequest;
    }

    @NotNull
    public final String getPrimaryID() {
        return this.PrimaryID;
    }

    @NotNull
    public final String getPrimaryIDType() {
        return this.PrimaryIDType;
    }

    @NotNull
    public final String getReqName() {
        return this.ReqName;
    }

    public final int getReqSN() {
        return this.ReqSN;
    }

    @NotNull
    public final String getServices() {
        return this.Services;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.ReqSN) * 31) + this.ReqName.hashCode()) * 31) + this.PrimaryIDType.hashCode()) * 31) + this.PrimaryID.hashCode()) * 31) + this.Services.hashCode()) * 31) + this.MultiSIMServiceRequest.hashCode();
    }

    @NotNull
    public String toString() {
        return "ServiceProvisionRequest(ReqSN=" + this.ReqSN + ", ReqName=" + this.ReqName + ", PrimaryIDType=" + this.PrimaryIDType + ", PrimaryID=" + this.PrimaryID + ", Services=" + this.Services + ", MultiSIMServiceRequest=" + this.MultiSIMServiceRequest + ")";
    }
}
