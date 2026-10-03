package com.heytap.nearx.tangramconfig.device;

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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JQ\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, d2 = {"Lcom/heytap/nearx/tangramconfig/device/BuildKey;", "", Fields.PRODUCT_ID, "", "channelId", "buildNo", "region", "adg", "customParams", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getAdg", "()Ljava/lang/String;", "getBuildNo", "getChannelId", "getCustomParams", "()Ljava/util/Map;", "getProductId", "getRegion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class BuildKey {

    @NotNull
    private final String adg;

    @NotNull
    private final String buildNo;

    @NotNull
    private final String channelId;

    @NotNull
    private final Map<String, String> customParams;

    @NotNull
    private final String productId;

    @NotNull
    private final String region;

    public BuildKey(@NotNull String productId, @NotNull String channelId, @NotNull String buildNo, @NotNull String region, @NotNull String adg, @NotNull Map<String, String> customParams) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(buildNo, "buildNo");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(adg, "adg");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        this.productId = productId;
        this.channelId = channelId;
        this.buildNo = buildNo;
        this.region = region;
        this.adg = adg;
        this.customParams = customParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BuildKey copy$default(BuildKey buildKey, String str, String str2, String str3, String str4, String str5, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buildKey.productId;
        }
        if ((i & 2) != 0) {
            str2 = buildKey.channelId;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = buildKey.buildNo;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = buildKey.region;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = buildKey.adg;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            map = buildKey.customParams;
        }
        return buildKey.copy(str, str6, str7, str8, str9, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBuildNo() {
        return this.buildNo;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAdg() {
        return this.adg;
    }

    @NotNull
    public final Map<String, String> component6() {
        return this.customParams;
    }

    @NotNull
    public final BuildKey copy(@NotNull String productId, @NotNull String channelId, @NotNull String buildNo, @NotNull String region, @NotNull String adg, @NotNull Map<String, String> customParams) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(buildNo, "buildNo");
        Intrinsics.checkNotNullParameter(region, "region");
        Intrinsics.checkNotNullParameter(adg, "adg");
        Intrinsics.checkNotNullParameter(customParams, "customParams");
        return new BuildKey(productId, channelId, buildNo, region, adg, customParams);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BuildKey)) {
            return false;
        }
        BuildKey buildKey = (BuildKey) other;
        return Intrinsics.areEqual(this.productId, buildKey.productId) && Intrinsics.areEqual(this.channelId, buildKey.channelId) && Intrinsics.areEqual(this.buildNo, buildKey.buildNo) && Intrinsics.areEqual(this.region, buildKey.region) && Intrinsics.areEqual(this.adg, buildKey.adg) && Intrinsics.areEqual(this.customParams, buildKey.customParams);
    }

    @NotNull
    public final String getAdg() {
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
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final String getRegion() {
        return this.region;
    }

    public int hashCode() {
        return (((((((((this.productId.hashCode() * 31) + this.channelId.hashCode()) * 31) + this.buildNo.hashCode()) * 31) + this.region.hashCode()) * 31) + this.adg.hashCode()) * 31) + this.customParams.hashCode();
    }

    @NotNull
    public String toString() {
        return "BuildKey(productId=" + this.productId + ", channelId=" + this.channelId + ", buildNo=" + this.buildNo + ", region=" + this.region + ", adg=" + this.adg + ", customParams=" + this.customParams + ')';
    }

    public /* synthetic */ BuildKey(String str, String str2, String str3, String str4, String str5, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "0" : str2, (i & 4) != 0 ? "0" : str3, (i & 8) != 0 ? "CN" : str4, (i & 16) == 0 ? str5 : "0", (i & 32) != 0 ? new ConcurrentHashMap() : map);
    }
}
