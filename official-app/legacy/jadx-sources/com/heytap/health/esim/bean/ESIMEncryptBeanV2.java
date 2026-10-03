package com.heytap.health.esim.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/heytap/health/esim/bean/ESIMEncryptBeanV2;", "", "imei", "", "eid", "apiVersion", "techVersion", "sign", "credible", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getApiVersion", "()Ljava/lang/String;", "getCredible", "()Z", "getEid", "getImei", "getSign", "getTechVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ESIMEncryptBeanV2 {
    public static final int $stable = 0;

    @NotNull
    private final String apiVersion;
    private final boolean credible;

    @NotNull
    private final String eid;

    @NotNull
    private final String imei;

    @NotNull
    private final String sign;

    @NotNull
    private final String techVersion;

    public ESIMEncryptBeanV2(@NotNull String imei, @NotNull String eid, @NotNull String apiVersion, @NotNull String techVersion, @NotNull String sign, boolean z) {
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(eid, "eid");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(techVersion, "techVersion");
        Intrinsics.checkNotNullParameter(sign, "sign");
        this.imei = imei;
        this.eid = eid;
        this.apiVersion = apiVersion;
        this.techVersion = techVersion;
        this.sign = sign;
        this.credible = z;
    }

    public static /* synthetic */ ESIMEncryptBeanV2 copy$default(ESIMEncryptBeanV2 eSIMEncryptBeanV2, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eSIMEncryptBeanV2.imei;
        }
        if ((i & 2) != 0) {
            str2 = eSIMEncryptBeanV2.eid;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = eSIMEncryptBeanV2.apiVersion;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = eSIMEncryptBeanV2.techVersion;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = eSIMEncryptBeanV2.sign;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            z = eSIMEncryptBeanV2.credible;
        }
        return eSIMEncryptBeanV2.copy(str, str6, str7, str8, str9, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImei() {
        return this.imei;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEid() {
        return this.eid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getApiVersion() {
        return this.apiVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTechVersion() {
        return this.techVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSign() {
        return this.sign;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCredible() {
        return this.credible;
    }

    @NotNull
    public final ESIMEncryptBeanV2 copy(@NotNull String imei, @NotNull String eid, @NotNull String apiVersion, @NotNull String techVersion, @NotNull String sign, boolean credible) {
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(eid, "eid");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(techVersion, "techVersion");
        Intrinsics.checkNotNullParameter(sign, "sign");
        return new ESIMEncryptBeanV2(imei, eid, apiVersion, techVersion, sign, credible);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESIMEncryptBeanV2)) {
            return false;
        }
        ESIMEncryptBeanV2 eSIMEncryptBeanV2 = (ESIMEncryptBeanV2) other;
        return Intrinsics.areEqual(this.imei, eSIMEncryptBeanV2.imei) && Intrinsics.areEqual(this.eid, eSIMEncryptBeanV2.eid) && Intrinsics.areEqual(this.apiVersion, eSIMEncryptBeanV2.apiVersion) && Intrinsics.areEqual(this.techVersion, eSIMEncryptBeanV2.techVersion) && Intrinsics.areEqual(this.sign, eSIMEncryptBeanV2.sign) && this.credible == eSIMEncryptBeanV2.credible;
    }

    @NotNull
    public final String getApiVersion() {
        return this.apiVersion;
    }

    public final boolean getCredible() {
        return this.credible;
    }

    @NotNull
    public final String getEid() {
        return this.eid;
    }

    @NotNull
    public final String getImei() {
        return this.imei;
    }

    @NotNull
    public final String getSign() {
        return this.sign;
    }

    @NotNull
    public final String getTechVersion() {
        return this.techVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((((((this.imei.hashCode() * 31) + this.eid.hashCode()) * 31) + this.apiVersion.hashCode()) * 31) + this.techVersion.hashCode()) * 31) + this.sign.hashCode()) * 31;
        boolean z = this.credible;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    @NotNull
    public String toString() {
        return "ESIMEncryptBeanV2(imei=" + this.imei + ", eid=" + this.eid + ", apiVersion=" + this.apiVersion + ", techVersion=" + this.techVersion + ", sign=" + this.sign + ", credible=" + this.credible + ")";
    }
}
