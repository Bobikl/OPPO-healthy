package com.heytap.health.wallet.network.bus.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000eJD\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/wallet/network/bus/params/RechargeRecordsParam;", "", j7l.KEY_CPLC, "", "appCode", "pageNum", "", "pageSize", "containRedPoint", "", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;)V", "getAppCode", "()Ljava/lang/String;", "getContainRedPoint", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCplc", "getPageNum", "()I", "getPageSize", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/Boolean;)Lcom/heytap/health/wallet/network/bus/params/RechargeRecordsParam;", "equals", "other", "hashCode", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RechargeRecordsParam {

    @NotNull
    private final String appCode;

    @Nullable
    private final Boolean containRedPoint;

    @Nullable
    private final String cplc;
    private final int pageNum;
    private final int pageSize;

    public RechargeRecordsParam(@Nullable String str, @NotNull String appCode, int i, int i2, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        this.cplc = str;
        this.appCode = appCode;
        this.pageNum = i;
        this.pageSize = i2;
        this.containRedPoint = bool;
    }

    public static /* synthetic */ RechargeRecordsParam copy$default(RechargeRecordsParam rechargeRecordsParam, String str, String str2, int i, int i2, Boolean bool, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = rechargeRecordsParam.cplc;
        }
        if ((i3 & 2) != 0) {
            str2 = rechargeRecordsParam.appCode;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            i = rechargeRecordsParam.pageNum;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = rechargeRecordsParam.pageSize;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            bool = rechargeRecordsParam.containRedPoint;
        }
        return rechargeRecordsParam.copy(str, str3, i4, i5, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPageNum() {
        return this.pageNum;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getContainRedPoint() {
        return this.containRedPoint;
    }

    @NotNull
    public final RechargeRecordsParam copy(@Nullable String cplc, @NotNull String appCode, int pageNum, int pageSize, @Nullable Boolean containRedPoint) {
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        return new RechargeRecordsParam(cplc, appCode, pageNum, pageSize, containRedPoint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RechargeRecordsParam)) {
            return false;
        }
        RechargeRecordsParam rechargeRecordsParam = (RechargeRecordsParam) other;
        return Intrinsics.areEqual(this.cplc, rechargeRecordsParam.cplc) && Intrinsics.areEqual(this.appCode, rechargeRecordsParam.appCode) && this.pageNum == rechargeRecordsParam.pageNum && this.pageSize == rechargeRecordsParam.pageSize && Intrinsics.areEqual(this.containRedPoint, rechargeRecordsParam.containRedPoint);
    }

    @NotNull
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final Boolean getContainRedPoint() {
        return this.containRedPoint;
    }

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public int hashCode() {
        String str = this.cplc;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.appCode.hashCode()) * 31) + Integer.hashCode(this.pageNum)) * 31) + Integer.hashCode(this.pageSize)) * 31;
        Boolean bool = this.containRedPoint;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RechargeRecordsParam(cplc=" + this.cplc + ", appCode=" + this.appCode + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", containRedPoint=" + this.containRedPoint + ")";
    }
}
