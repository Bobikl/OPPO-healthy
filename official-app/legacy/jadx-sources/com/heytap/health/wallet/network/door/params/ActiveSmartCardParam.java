package com.heytap.health.wallet.network.door.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/wallet/network/door/params/ActiveSmartCardParam;", "", "addressInfo", "", "appCode", j7l.KEY_CPLC, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAddressInfo", "()Ljava/lang/String;", "getAppCode", "getCplc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ActiveSmartCardParam {

    @Nullable
    private final String addressInfo;

    @Nullable
    private final String appCode;

    @Nullable
    private final String cplc;

    public ActiveSmartCardParam(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.addressInfo = str;
        this.appCode = str2;
        this.cplc = str3;
    }

    public static /* synthetic */ ActiveSmartCardParam copy$default(ActiveSmartCardParam activeSmartCardParam, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activeSmartCardParam.addressInfo;
        }
        if ((i & 2) != 0) {
            str2 = activeSmartCardParam.appCode;
        }
        if ((i & 4) != 0) {
            str3 = activeSmartCardParam.cplc;
        }
        return activeSmartCardParam.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAddressInfo() {
        return this.addressInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @NotNull
    public final ActiveSmartCardParam copy(@Nullable String addressInfo, @Nullable String appCode, @Nullable String cplc) {
        return new ActiveSmartCardParam(addressInfo, appCode, cplc);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveSmartCardParam)) {
            return false;
        }
        ActiveSmartCardParam activeSmartCardParam = (ActiveSmartCardParam) other;
        return Intrinsics.areEqual(this.addressInfo, activeSmartCardParam.addressInfo) && Intrinsics.areEqual(this.appCode, activeSmartCardParam.appCode) && Intrinsics.areEqual(this.cplc, activeSmartCardParam.cplc);
    }

    @Nullable
    public final String getAddressInfo() {
        return this.addressInfo;
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    public int hashCode() {
        String str = this.addressInfo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cplc;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ActiveSmartCardParam(addressInfo=" + this.addressInfo + ", appCode=" + this.appCode + ", cplc=" + this.cplc + ")";
    }
}
