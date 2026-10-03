package com.heytap.health.wallet.network.bus.params;

import androidx.annotation.Keep;
import com.heytap.log.config.StdDtoConst;
import com.oplus.aiunit.vision.j7l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018JJ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0006HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/heytap/health/wallet/network/bus/params/CheckStatusParam;", "", "appCode", "", j7l.KEY_CPLC, "accessType", "", "timestamp", "", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Long;)V", StdDtoConst.REGISTRATIONID_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)V", "getAccessType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAppCode", "()Ljava/lang/String;", "getCplc", "getRegistrationId", "signData", "getSignData", "setSignData", "(Ljava/lang/String;)V", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/heytap/health/wallet/network/bus/params/CheckStatusParam;", "equals", "", "other", "hashCode", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CheckStatusParam {

    @Nullable
    private final Integer accessType;

    @Nullable
    private final String appCode;

    @Nullable
    private final String cplc;

    @Nullable
    private final String registrationId;

    @Nullable
    private String signData;

    @Nullable
    private final Long timestamp;

    public CheckStatusParam(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable Long l2) {
        this.appCode = str;
        this.cplc = str2;
        this.registrationId = str3;
        this.accessType = num;
        this.timestamp = l2;
    }

    public static /* synthetic */ CheckStatusParam copy$default(CheckStatusParam checkStatusParam, String str, String str2, String str3, Integer num, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkStatusParam.appCode;
        }
        if ((i & 2) != 0) {
            str2 = checkStatusParam.cplc;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = checkStatusParam.registrationId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            num = checkStatusParam.accessType;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            l2 = checkStatusParam.timestamp;
        }
        return checkStatusParam.copy(str, str4, str5, num2, l2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegistrationId() {
        return this.registrationId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getAccessType() {
        return this.accessType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final CheckStatusParam copy(@Nullable String appCode, @Nullable String cplc, @Nullable String registrationId, @Nullable Integer accessType, @Nullable Long timestamp) {
        return new CheckStatusParam(appCode, cplc, registrationId, accessType, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckStatusParam)) {
            return false;
        }
        CheckStatusParam checkStatusParam = (CheckStatusParam) other;
        return Intrinsics.areEqual(this.appCode, checkStatusParam.appCode) && Intrinsics.areEqual(this.cplc, checkStatusParam.cplc) && Intrinsics.areEqual(this.registrationId, checkStatusParam.registrationId) && Intrinsics.areEqual(this.accessType, checkStatusParam.accessType) && Intrinsics.areEqual(this.timestamp, checkStatusParam.timestamp);
    }

    @Nullable
    public final Integer getAccessType() {
        return this.accessType;
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getCplc() {
        return this.cplc;
    }

    @Nullable
    public final String getRegistrationId() {
        return this.registrationId;
    }

    @Nullable
    public final String getSignData() {
        return this.signData;
    }

    @Nullable
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.appCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cplc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.registrationId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.accessType;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.timestamp;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final void setSignData(@Nullable String str) {
        this.signData = str;
    }

    @NotNull
    public String toString() {
        return "CheckStatusParam(appCode=" + this.appCode + ", cplc=" + this.cplc + ", registrationId=" + this.registrationId + ", accessType=" + this.accessType + ", timestamp=" + this.timestamp + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckStatusParam(@NotNull String appCode, @NotNull String cplc, int i, @Nullable Long l2) {
        this(appCode, cplc, null, Integer.valueOf(i), l2);
        Intrinsics.checkNotNullParameter(appCode, "appCode");
        Intrinsics.checkNotNullParameter(cplc, "cplc");
    }
}
