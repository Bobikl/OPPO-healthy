package com.heytap.nearx.tangramconfig.device;

import android.os.Build;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006B%\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bB/\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bBE\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\u0010\u000eBM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\u0015\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u0003H\u0000¢\u0006\u0002\b\u001fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JQ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\nHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014¨\u0006,"}, d2 = {"Lcom/heytap/nearx/tangramconfig/device/ApkBuildInfo;", "", "channelId", "", "(Ljava/lang/String;)V", "buildNo", "(Ljava/lang/String;Ljava/lang/String;)V", "region", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "adg", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "customParams", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;)V", "brand", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V", "getAdg", "()I", "getBrand", "()Ljava/lang/String;", "getBuildNo", "getChannelId", "getCustomParams", "()Ljava/util/Map;", Fields.PRODUCT_ID, "getProductId$com_heytap_nearx_tangramconfig", "setProductId$com_heytap_nearx_tangramconfig", "getRegion", "buildKey", "Lcom/heytap/nearx/tangramconfig/device/BuildKey;", "buildKey$com_heytap_nearx_tangramconfig", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ApkBuildInfo {
    private final int adg;

    @NotNull
    private final String brand;

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

    public ApkBuildInfo() {
        this(null, null, null, 0, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApkBuildInfo copy$default(ApkBuildInfo apkBuildInfo, String str, String str2, String str3, int i, Map map, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = apkBuildInfo.channelId;
        }
        if ((i2 & 2) != 0) {
            str2 = apkBuildInfo.buildNo;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = apkBuildInfo.region;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = apkBuildInfo.adg;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            map = apkBuildInfo.customParams;
        }
        Map map2 = map;
        if ((i2 & 32) != 0) {
            str4 = apkBuildInfo.brand;
        }
        return apkBuildInfo.copy(str, str5, str6, i3, map2, str4);
    }

    @NotNull
    public final BuildKey buildKey$com_heytap_nearx_tangramconfig(@NotNull String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
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
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    public final ApkBuildInfo copy(@NotNull String channelId, @NotNull String buildNo, @NotNull String region, int adg, @NotNull Map<String, String> customParams, @NotNull String brand) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(buildNo, "buildNo");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        Intrinsics.checkNotNullParameter(brand, "brand");
        return new ApkBuildInfo(channelId, buildNo, region, adg, customParams, brand);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApkBuildInfo)) {
            return false;
        }
        ApkBuildInfo apkBuildInfo = (ApkBuildInfo) other;
        return Intrinsics.areEqual(this.channelId, apkBuildInfo.channelId) && Intrinsics.areEqual(this.buildNo, apkBuildInfo.buildNo) && Intrinsics.areEqual(this.region, apkBuildInfo.region) && this.adg == apkBuildInfo.adg && Intrinsics.areEqual(this.customParams, apkBuildInfo.customParams) && Intrinsics.areEqual(this.brand, apkBuildInfo.brand);
    }

    public final int getAdg() {
        return this.adg;
    }

    @NotNull
    public final String getBrand() {
        return this.brand;
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
    /* JADX INFO: renamed from: getProductId$com_heytap_nearx_tangramconfig, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return (((((((((this.channelId.hashCode() * 31) + this.buildNo.hashCode()) * 31) + this.region.hashCode()) * 31) + Integer.hashCode(this.adg)) * 31) + this.customParams.hashCode()) * 31) + this.brand.hashCode();
    }

    public final void setProductId$com_heytap_nearx_tangramconfig(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.productId = str;
    }

    @NotNull
    public String toString() {
        return "ApkBuildInfo(channelId=" + this.channelId + ", buildNo=" + this.buildNo + ", region=" + this.region + ", adg=" + this.adg + ", customParams=" + this.customParams + ", brand=" + this.brand + ')';
    }

    public ApkBuildInfo(@NotNull String channelId, @NotNull String buildNo, @NotNull String region, int i, @NotNull Map<String, String> customParams, @NotNull String brand) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(buildNo, "buildNo");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        Intrinsics.checkNotNullParameter(brand, "brand");
        this.channelId = channelId;
        this.buildNo = buildNo;
        this.region = region;
        this.adg = i;
        this.customParams = customParams;
        this.brand = brand;
        this.productId = "";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ApkBuildInfo(String str, String str2, String str3, int i, Map map, String BRAND, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i2 & 1) != 0 ? "0" : str;
        str2 = (i2 & 2) != 0 ? "0" : str2;
        str3 = (i2 & 4) != 0 ? "CN" : str3;
        i = (i2 & 8) != 0 ? 0 : i;
        map = (i2 & 16) != 0 ? new ConcurrentHashMap() : map;
        if ((i2 & 32) != 0) {
            BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        }
        this(str, str2, str3, i, (Map<String, String>) map, BRAND);
    }

    public /* synthetic */ ApkBuildInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str);
    }

    public ApkBuildInfo(@NotNull String channelId) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        this(channelId, "0", "CN", 0, concurrentHashMap, BRAND);
    }

    public /* synthetic */ ApkBuildInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "0" : str2);
    }

    public ApkBuildInfo(@NotNull String channelId, @NotNull String buildNo) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(buildNo, "buildNo");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        this(channelId, buildNo, "CN", 0, concurrentHashMap, BRAND);
    }

    public /* synthetic */ ApkBuildInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "CN" : str3);
    }

    public ApkBuildInfo(@NotNull String channelId, @NotNull String buildNo, @NotNull String region) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(buildNo, "buildNo");
        Intrinsics.checkNotNullParameter(region, "region");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        this(channelId, buildNo, region, 0, concurrentHashMap, BRAND);
    }

    public /* synthetic */ ApkBuildInfo(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "0" : str, (i2 & 2) != 0 ? "0" : str2, (i2 & 4) != 0 ? "CN" : str3, (i2 & 8) != 0 ? 0 : i);
    }

    public ApkBuildInfo(@NotNull String channelId, @NotNull String buildNo, @NotNull String region, int i) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(buildNo, "buildNo");
        Intrinsics.checkNotNullParameter(region, "region");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        this(channelId, buildNo, region, i, concurrentHashMap, BRAND);
    }

    public /* synthetic */ ApkBuildInfo(String str, String str2, String str3, int i, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "0" : str, (i2 & 2) != 0 ? "0" : str2, (i2 & 4) != 0 ? "CN" : str3, (i2 & 8) != 0 ? 0 : i, (Map<String, String>) ((i2 & 16) != 0 ? new ConcurrentHashMap() : map));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ApkBuildInfo(@NotNull String channelId, @NotNull String buildNo, @NotNull String region, int i, @NotNull Map<String, String> customParams) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(buildNo, "buildNo");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        this(channelId, buildNo, region, i, customParams, BRAND);
    }
}
