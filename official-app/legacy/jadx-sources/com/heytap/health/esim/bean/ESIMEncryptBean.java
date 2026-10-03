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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/esim/bean/ESIMEncryptBean;", "", "imei", "", "eid", "apiVersion", "techVersion", "sign", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiVersion", "()Ljava/lang/String;", "getEid", "getImei", "getSign", "getTechVersion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "esim_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ESIMEncryptBean {
    public static final int $stable = 0;

    @NotNull
    private final String apiVersion;

    @NotNull
    private final String eid;

    @NotNull
    private final String imei;

    @NotNull
    private final String sign;

    @NotNull
    private final String techVersion;

    public ESIMEncryptBean(@NotNull String imei, @NotNull String eid, @NotNull String apiVersion, @NotNull String techVersion, @NotNull String sign) {
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
    }

    public static /* synthetic */ ESIMEncryptBean copy$default(ESIMEncryptBean eSIMEncryptBean, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eSIMEncryptBean.imei;
        }
        if ((i & 2) != 0) {
            str2 = eSIMEncryptBean.eid;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = eSIMEncryptBean.apiVersion;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = eSIMEncryptBean.techVersion;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = eSIMEncryptBean.sign;
        }
        return eSIMEncryptBean.copy(str, str6, str7, str8, str5);
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

    @NotNull
    public final ESIMEncryptBean copy(@NotNull String imei, @NotNull String eid, @NotNull String apiVersion, @NotNull String techVersion, @NotNull String sign) {
        Intrinsics.checkNotNullParameter(imei, "imei");
        Intrinsics.checkNotNullParameter(eid, "eid");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(techVersion, "techVersion");
        Intrinsics.checkNotNullParameter(sign, "sign");
        return new ESIMEncryptBean(imei, eid, apiVersion, techVersion, sign);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ESIMEncryptBean)) {
            return false;
        }
        ESIMEncryptBean eSIMEncryptBean = (ESIMEncryptBean) other;
        return Intrinsics.areEqual(this.imei, eSIMEncryptBean.imei) && Intrinsics.areEqual(this.eid, eSIMEncryptBean.eid) && Intrinsics.areEqual(this.apiVersion, eSIMEncryptBean.apiVersion) && Intrinsics.areEqual(this.techVersion, eSIMEncryptBean.techVersion) && Intrinsics.areEqual(this.sign, eSIMEncryptBean.sign);
    }

    @NotNull
    public final String getApiVersion() {
        return this.apiVersion;
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

    public int hashCode() {
        return (((((((this.imei.hashCode() * 31) + this.eid.hashCode()) * 31) + this.apiVersion.hashCode()) * 31) + this.techVersion.hashCode()) * 31) + this.sign.hashCode();
    }

    @NotNull
    public String toString() {
        return "ESIMEncryptBean(imei=" + this.imei + ", eid=" + this.eid + ", apiVersion=" + this.apiVersion + ", techVersion=" + this.techVersion + ", sign=" + this.sign + ")";
    }
}
