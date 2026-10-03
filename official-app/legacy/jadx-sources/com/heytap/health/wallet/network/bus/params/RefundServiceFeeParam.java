package com.heytap.health.wallet.network.bus.params;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/wallet/network/bus/params/RefundServiceFeeParam;", "", "cardNo", "", j7l.KEY_CPLC, "appCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppCode", "()Ljava/lang/String;", "getCardNo", "getCplc", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RefundServiceFeeParam {

    @Nullable
    private final String appCode;

    @Nullable
    private final String cardNo;

    @Nullable
    private final String cplc;

    public RefundServiceFeeParam(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.cardNo = str;
        this.cplc = str2;
        this.appCode = str3;
    }

    public static /* synthetic */ RefundServiceFeeParam copy$default(RefundServiceFeeParam refundServiceFeeParam, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = refundServiceFeeParam.cardNo;
        }
        if ((i & 2) != 0) {
            str2 = refundServiceFeeParam.cplc;
        }
        if ((i & 4) != 0) {
            str3 = refundServiceFeeParam.appCode;
        }
        return refundServiceFeeParam.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @NotNull
    public final RefundServiceFeeParam copy(@Nullable String cardNo, @Nullable String cplc, @Nullable String appCode) {
        return new RefundServiceFeeParam(cardNo, cplc, appCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefundServiceFeeParam)) {
            return false;
        }
        RefundServiceFeeParam refundServiceFeeParam = (RefundServiceFeeParam) other;
        return Intrinsics.areEqual(this.cardNo, refundServiceFeeParam.cardNo) && Intrinsics.areEqual(this.cplc, refundServiceFeeParam.cplc) && Intrinsics.areEqual(this.appCode, refundServiceFeeParam.appCode);
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getCardNo() {
        return this.cardNo;
    }

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    public int hashCode() {
        String str = this.cardNo;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cplc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appCode;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RefundServiceFeeParam(cardNo=" + this.cardNo + ", cplc=" + this.cplc + ", appCode=" + this.appCode + ")";
    }
}
