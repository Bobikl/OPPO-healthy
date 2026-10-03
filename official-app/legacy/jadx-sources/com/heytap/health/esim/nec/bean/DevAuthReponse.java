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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0001 B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016¨\u0006!"}, d2 = {"Lcom/heytap/health/esim/nec/bean/DevAuthReponse;", "", "", "component1", "component2", "", "component3", "component4", "component5", "RespSN", "ReqName", "ResultCode", "AuthToken", "MSISDN", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getRespSN", "()Ljava/lang/String;", "getReqName", "I", "getResultCode", "()I", "getAuthToken", "getMSISDN", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "Companion", "a", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class DevAuthReponse {
    public static final int $stable = 0;
    public static final int RESULT_NONE_USER = 1001;
    public static final int RESULT_NO_PERMISSION = 1002;
    public static final int RESULT_REDIRECT = 1005;
    public static final int RESULT_SECONDARY_AUTHORIZATION = 1008;
    public static final int RESULT_SUCCESS = 1000;
    public static final int RESULT_SYSTEM_ERROR = 1003;
    public static final int RESULT_TOKEN_EXPIRE = 1004;
    public static final int RESULT_VERIFICATION_CODE_ERROR = 1006;
    public static final int RESULT_VERIFICATION_CODE_EXPIRE = 1007;

    @NotNull
    private final String AuthToken;

    @NotNull
    private final String MSISDN;

    @NotNull
    private final String ReqName;

    @NotNull
    private final String RespSN;
    private final int ResultCode;

    public DevAuthReponse(@NotNull String RespSN, @NotNull String ReqName, int i, @NotNull String AuthToken, @NotNull String MSISDN) {
        Intrinsics.checkNotNullParameter(RespSN, "RespSN");
        Intrinsics.checkNotNullParameter(ReqName, "ReqName");
        Intrinsics.checkNotNullParameter(AuthToken, "AuthToken");
        Intrinsics.checkNotNullParameter(MSISDN, "MSISDN");
        this.RespSN = RespSN;
        this.ReqName = ReqName;
        this.ResultCode = i;
        this.AuthToken = AuthToken;
        this.MSISDN = MSISDN;
    }

    public static /* synthetic */ DevAuthReponse copy$default(DevAuthReponse devAuthReponse, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = devAuthReponse.RespSN;
        }
        if ((i2 & 2) != 0) {
            str2 = devAuthReponse.ReqName;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = devAuthReponse.ResultCode;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = devAuthReponse.AuthToken;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = devAuthReponse.MSISDN;
        }
        return devAuthReponse.copy(str, str5, i3, str6, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRespSN() {
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
    public final String getAuthToken() {
        return this.AuthToken;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMSISDN() {
        return this.MSISDN;
    }

    @NotNull
    public final DevAuthReponse copy(@NotNull String RespSN, @NotNull String ReqName, int ResultCode, @NotNull String AuthToken, @NotNull String MSISDN) {
        Intrinsics.checkNotNullParameter(RespSN, "RespSN");
        Intrinsics.checkNotNullParameter(ReqName, "ReqName");
        Intrinsics.checkNotNullParameter(AuthToken, "AuthToken");
        Intrinsics.checkNotNullParameter(MSISDN, "MSISDN");
        return new DevAuthReponse(RespSN, ReqName, ResultCode, AuthToken, MSISDN);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevAuthReponse)) {
            return false;
        }
        DevAuthReponse devAuthReponse = (DevAuthReponse) other;
        return Intrinsics.areEqual(this.RespSN, devAuthReponse.RespSN) && Intrinsics.areEqual(this.ReqName, devAuthReponse.ReqName) && this.ResultCode == devAuthReponse.ResultCode && Intrinsics.areEqual(this.AuthToken, devAuthReponse.AuthToken) && Intrinsics.areEqual(this.MSISDN, devAuthReponse.MSISDN);
    }

    @NotNull
    public final String getAuthToken() {
        return this.AuthToken;
    }

    @NotNull
    public final String getMSISDN() {
        return this.MSISDN;
    }

    @NotNull
    public final String getReqName() {
        return this.ReqName;
    }

    @NotNull
    public final String getRespSN() {
        return this.RespSN;
    }

    public final int getResultCode() {
        return this.ResultCode;
    }

    public int hashCode() {
        return (((((((this.RespSN.hashCode() * 31) + this.ReqName.hashCode()) * 31) + Integer.hashCode(this.ResultCode)) * 31) + this.AuthToken.hashCode()) * 31) + this.MSISDN.hashCode();
    }

    @NotNull
    public String toString() {
        return "DevAuthReponse(RespSN=" + this.RespSN + ", ReqName=" + this.ReqName + ", ResultCode=" + this.ResultCode + ", AuthToken=" + this.AuthToken + ", MSISDN=" + this.MSISDN + ")";
    }
}
