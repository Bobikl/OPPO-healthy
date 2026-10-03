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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\""}, d2 = {"Lcom/heytap/health/esim/nec/bean/GetDevServInfo;", "", "ReqSN", "", "ReqName", "", "PrimaryIDType", "PrimaryID", "Services", "SecondaryIDType", "SecondaryID", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrimaryID", "()Ljava/lang/String;", "getPrimaryIDType", "getReqName", "getReqSN", "()I", "getSecondaryID", "getSecondaryIDType", "getServices", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class GetDevServInfo {
    public static final int $stable = 0;

    @NotNull
    private final String PrimaryID;

    @NotNull
    private final String PrimaryIDType;

    @NotNull
    private final String ReqName;
    private final int ReqSN;

    @Nullable
    private final String SecondaryID;

    @Nullable
    private final String SecondaryIDType;

    @NotNull
    private final String Services;

    public GetDevServInfo(int i, @NotNull String ReqName, @NotNull String PrimaryIDType, @NotNull String PrimaryID, @NotNull String Services, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(ReqName, "ReqName");
        Intrinsics.checkNotNullParameter(PrimaryIDType, "PrimaryIDType");
        Intrinsics.checkNotNullParameter(PrimaryID, "PrimaryID");
        Intrinsics.checkNotNullParameter(Services, "Services");
        this.ReqSN = i;
        this.ReqName = ReqName;
        this.PrimaryIDType = PrimaryIDType;
        this.PrimaryID = PrimaryID;
        this.Services = Services;
        this.SecondaryIDType = str;
        this.SecondaryID = str2;
    }

    public static /* synthetic */ GetDevServInfo copy$default(GetDevServInfo getDevServInfo, int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = getDevServInfo.ReqSN;
        }
        if ((i2 & 2) != 0) {
            str = getDevServInfo.ReqName;
        }
        String str7 = str;
        if ((i2 & 4) != 0) {
            str2 = getDevServInfo.PrimaryIDType;
        }
        String str8 = str2;
        if ((i2 & 8) != 0) {
            str3 = getDevServInfo.PrimaryID;
        }
        String str9 = str3;
        if ((i2 & 16) != 0) {
            str4 = getDevServInfo.Services;
        }
        String str10 = str4;
        if ((i2 & 32) != 0) {
            str5 = getDevServInfo.SecondaryIDType;
        }
        String str11 = str5;
        if ((i2 & 64) != 0) {
            str6 = getDevServInfo.SecondaryID;
        }
        return getDevServInfo.copy(i, str7, str8, str9, str10, str11, str6);
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

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSecondaryIDType() {
        return this.SecondaryIDType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSecondaryID() {
        return this.SecondaryID;
    }

    @NotNull
    public final GetDevServInfo copy(int ReqSN, @NotNull String ReqName, @NotNull String PrimaryIDType, @NotNull String PrimaryID, @NotNull String Services, @Nullable String SecondaryIDType, @Nullable String SecondaryID) {
        Intrinsics.checkNotNullParameter(ReqName, "ReqName");
        Intrinsics.checkNotNullParameter(PrimaryIDType, "PrimaryIDType");
        Intrinsics.checkNotNullParameter(PrimaryID, "PrimaryID");
        Intrinsics.checkNotNullParameter(Services, "Services");
        return new GetDevServInfo(ReqSN, ReqName, PrimaryIDType, PrimaryID, Services, SecondaryIDType, SecondaryID);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetDevServInfo)) {
            return false;
        }
        GetDevServInfo getDevServInfo = (GetDevServInfo) other;
        return this.ReqSN == getDevServInfo.ReqSN && Intrinsics.areEqual(this.ReqName, getDevServInfo.ReqName) && Intrinsics.areEqual(this.PrimaryIDType, getDevServInfo.PrimaryIDType) && Intrinsics.areEqual(this.PrimaryID, getDevServInfo.PrimaryID) && Intrinsics.areEqual(this.Services, getDevServInfo.Services) && Intrinsics.areEqual(this.SecondaryIDType, getDevServInfo.SecondaryIDType) && Intrinsics.areEqual(this.SecondaryID, getDevServInfo.SecondaryID);
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

    @Nullable
    public final String getSecondaryID() {
        return this.SecondaryID;
    }

    @Nullable
    public final String getSecondaryIDType() {
        return this.SecondaryIDType;
    }

    @NotNull
    public final String getServices() {
        return this.Services;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.ReqSN) * 31) + this.ReqName.hashCode()) * 31) + this.PrimaryIDType.hashCode()) * 31) + this.PrimaryID.hashCode()) * 31) + this.Services.hashCode()) * 31;
        String str = this.SecondaryIDType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.SecondaryID;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetDevServInfo(ReqSN=" + this.ReqSN + ", ReqName=" + this.ReqName + ", PrimaryIDType=" + this.PrimaryIDType + ", PrimaryID=" + this.PrimaryID + ", Services=" + this.Services + ", SecondaryIDType=" + this.SecondaryIDType + ", SecondaryID=" + this.SecondaryID + ")";
    }

    public /* synthetic */ GetDevServInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "GetDevServInfo" : str, (i2 & 4) != 0 ? "IMSI" : str2, str3, str4, str5, str6);
    }
}
