package com.heytap.nearx.cloudconfig.device;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nJ\u0015\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u0019J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u0015\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JG\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0007HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, d2 = {"Lcom/heytap/nearx/cloudconfig/device/ApkBuildInfo;", "", "channelId", "", "buildNo", "region", "adg", "", "customParams", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;)V", "getAdg", "()I", "getBuildNo", "()Ljava/lang/String;", "getChannelId", "getCustomParams", "()Ljava/util/Map;", Fields.PRODUCT_ID, "getProductId$com_heytap_nearx_cloudconfig", "setProductId$com_heytap_nearx_cloudconfig", "(Ljava/lang/String;)V", "getRegion", "buildKey", "Lcom/heytap/nearx/cloudconfig/device/BuildKey;", "buildKey$com_heytap_nearx_cloudconfig", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final /* data */ class ApkBuildInfo {
    private final int adg;

    @NotNull
    private final String buildNo;

    @NotNull
    private final String channelId;

    @NotNull
    private final Map<String, String> customParams;

    @NotNull
    private String productId;

    @NotNull
    private final String region;

    @JvmOverloads
    public ApkBuildInfo() {
        this(null, null, null, 0, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApkBuildInfo copy$default(ApkBuildInfo apkBuildInfo, String str, String str2, String str3, int i, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = apkBuildInfo.channelId;
        }
        if ((i2 & 2) != 0) {
            str2 = apkBuildInfo.buildNo;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = apkBuildInfo.region;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = apkBuildInfo.adg;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            map = apkBuildInfo.customParams;
        }
        return apkBuildInfo.copy(str, str4, str5, i3, map);
    }

    @NotNull
    public final BuildKey buildKey$com_heytap_nearx_cloudconfig(@NotNull String productId) {
        Intrinsics.checkParameterIsNotNull(productId, "productId");
        return new BuildKey(productId, this.channelId, this.buildNo, this.region, String.valueOf(this.adg), this.customParams);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBuildNo() {
        return this.buildNo;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAdg() {
        return this.adg;
    }

    @NotNull
    public final Map<String, String> component5() {
        return this.customParams;
    }

    @NotNull
    public final ApkBuildInfo copy(@NotNull String channelId, @NotNull String buildNo, @NotNull String region, int adg, @NotNull Map<String, String> customParams) {
        Intrinsics.checkParameterIsNotNull(channelId, "channelId");
        Intrinsics.checkParameterIsNotNull(buildNo, "buildNo");
        Intrinsics.checkParameterIsNotNull(region, "region");
        Intrinsics.checkParameterIsNotNull(customParams, "customParams");
        return new ApkBuildInfo(channelId, buildNo, region, adg, customParams);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApkBuildInfo)) {
            return false;
        }
        ApkBuildInfo apkBuildInfo = (ApkBuildInfo) other;
        return Intrinsics.areEqual(this.channelId, apkBuildInfo.channelId) && Intrinsics.areEqual(this.buildNo, apkBuildInfo.buildNo) && Intrinsics.areEqual(this.region, apkBuildInfo.region) && this.adg == apkBuildInfo.adg && Intrinsics.areEqual(this.customParams, apkBuildInfo.customParams);
    }

    public final int getAdg() {
        return this.adg;
    }

    @NotNull
    public final String getBuildNo() {
        return this.buildNo;
    }

    @NotNull
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    public final Map<String, String> getCustomParams() {
        return this.customParams;
    }

    @NotNull
    /* JADX INFO: renamed from: getProductId$com_heytap_nearx_cloudconfig, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        String str = this.channelId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.buildNo;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.region;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.adg)) * 31;
        Map<String, String> map = this.customParams;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final void setProductId$com_heytap_nearx_cloudconfig(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.productId = str;
    }

    @NotNull
    public String toString() {
        return "ApkBuildInfo(channelId=" + this.channelId + ", buildNo=" + this.buildNo + ", region=" + this.region + ", adg=" + this.adg + ", customParams=" + this.customParams + ")";
    }

    @JvmOverloads
    public ApkBuildInfo(@NotNull String str) {
        this(str, null, null, 0, null, 30, null);
    }

    @JvmOverloads
    public ApkBuildInfo(@NotNull String str, @NotNull String str2) {
        this(str, str2, null, 0, null, 28, null);
    }

    @JvmOverloads
    public ApkBuildInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this(str, str2, str3, 0, null, 24, null);
    }

    @JvmOverloads
    public ApkBuildInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        this(str, str2, str3, i, null, 16, null);
    }

    @JvmOverloads
    public ApkBuildInfo(@NotNull String channelId, @NotNull String buildNo, @NotNull String region, int i, @NotNull Map<String, String> customParams) {
        Intrinsics.checkParameterIsNotNull(channelId, "channelId");
        Intrinsics.checkParameterIsNotNull(buildNo, "buildNo");
        Intrinsics.checkParameterIsNotNull(region, "region");
        Intrinsics.checkParameterIsNotNull(customParams, "customParams");
        this.channelId = channelId;
        this.buildNo = buildNo;
        this.region = region;
        this.adg = i;
        this.customParams = customParams;
        this.productId = "";
    }

    public /* synthetic */ ApkBuildInfo(String str, String str2, String str3, int i, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "0" : str, (i2 & 2) != 0 ? "0" : str2, (i2 & 4) != 0 ? "CN" : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? new ConcurrentHashMap() : map);
    }
}
