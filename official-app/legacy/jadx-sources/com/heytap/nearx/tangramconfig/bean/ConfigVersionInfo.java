package com.heytap.nearx.tangramconfig.bean;

import androidx.core.app.NotificationCompat;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b!\b\u0086\b\u0018\u00002\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0002\u0010\tBA\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bB\u001b\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eB\u001b\b\u0016\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011B\u001b\b\u0016\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0010HÆ\u0003Jm\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010-\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0005HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018¨\u00061"}, d2 = {"Lcom/heytap/nearx/tangramconfig/bean/ConfigVersionInfo;", "", "configId", "", "configType", "", "version", "configVersion", "productVersion", "(Ljava/lang/String;IIII)V", NotificationCompat.CATEGORY_ERROR, "(Ljava/lang/String;IIIILjava/lang/String;)V", "mode", Fields.PRODUCT_ID, "(ILjava/lang/String;)V", "need", "", "(ZLjava/lang/String;)V", "httpcode", "(Ljava/lang/String;I)V", "(Ljava/lang/String;IIIIILjava/lang/String;IZLjava/lang/String;)V", "getConfigId", "()Ljava/lang/String;", "getConfigType", "()I", "getConfigVersion", "getErr", "getHttpcode", "getMode", "getNeed", "()Z", "getProductId", "getProductVersion", "getVersion", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class ConfigVersionInfo {

    @NotNull
    private final String configId;
    private final int configType;
    private final int configVersion;

    @NotNull
    private final String err;
    private final int httpcode;
    private final int mode;
    private final boolean need;

    @NotNull
    private final String productId;
    private final int productVersion;
    private final int version;

    public ConfigVersionInfo(@NotNull String configId, int i, int i2, int i3, int i4, int i5, @NotNull String productId, int i6, boolean z, @NotNull String err) {
        Intrinsics.checkNotNullParameter(configId, "configId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(err, "err");
        this.configId = configId;
        this.configType = i;
        this.version = i2;
        this.configVersion = i3;
        this.productVersion = i4;
        this.mode = i5;
        this.productId = productId;
        this.httpcode = i6;
        this.need = z;
        this.err = err;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConfigId() {
        return this.configId;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getErr() {
        return this.err;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getConfigType() {
        return this.configType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getConfigVersion() {
        return this.configVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getProductVersion() {
        return this.productVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getHttpcode() {
        return this.httpcode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getNeed() {
        return this.need;
    }

    @NotNull
    public final ConfigVersionInfo copy(@NotNull String configId, int configType, int version, int configVersion, int productVersion, int mode, @NotNull String productId, int httpcode, boolean need, @NotNull String err) {
        Intrinsics.checkNotNullParameter(configId, "configId");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(err, "err");
        return new ConfigVersionInfo(configId, configType, version, configVersion, productVersion, mode, productId, httpcode, need, err);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigVersionInfo)) {
            return false;
        }
        ConfigVersionInfo configVersionInfo = (ConfigVersionInfo) other;
        return Intrinsics.areEqual(this.configId, configVersionInfo.configId) && this.configType == configVersionInfo.configType && this.version == configVersionInfo.version && this.configVersion == configVersionInfo.configVersion && this.productVersion == configVersionInfo.productVersion && this.mode == configVersionInfo.mode && Intrinsics.areEqual(this.productId, configVersionInfo.productId) && this.httpcode == configVersionInfo.httpcode && this.need == configVersionInfo.need && Intrinsics.areEqual(this.err, configVersionInfo.err);
    }

    @NotNull
    public final String getConfigId() {
        return this.configId;
    }

    public final int getConfigType() {
        return this.configType;
    }

    public final int getConfigVersion() {
        return this.configVersion;
    }

    @NotNull
    public final String getErr() {
        return this.err;
    }

    public final int getHttpcode() {
        return this.httpcode;
    }

    public final int getMode() {
        return this.mode;
    }

    public final boolean getNeed() {
        return this.need;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final int getProductVersion() {
        return this.productVersion;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    public int hashCode() {
        int iHashCode = ((((((((((((((this.configId.hashCode() * 31) + Integer.hashCode(this.configType)) * 31) + Integer.hashCode(this.version)) * 31) + Integer.hashCode(this.configVersion)) * 31) + Integer.hashCode(this.productVersion)) * 31) + Integer.hashCode(this.mode)) * 31) + this.productId.hashCode()) * 31) + Integer.hashCode(this.httpcode)) * 31;
        boolean z = this.need;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.err.hashCode();
    }

    @NotNull
    public String toString() {
        return "ConfigVersionInfo(configId=" + this.configId + ", configType=" + this.configType + ", version=" + this.version + ", configVersion=" + this.configVersion + ", productVersion=" + this.productVersion + ", mode=" + this.mode + ", productId=" + this.productId + ", httpcode=" + this.httpcode + ", need=" + this.need + ", err=" + this.err + ')';
    }

    public /* synthetic */ ConfigVersionInfo(String str, int i, int i2, int i3, int i4, int i5, String str2, int i6, boolean z, String str3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? 0 : i, (i7 & 4) != 0 ? 0 : i2, (i7 & 8) != 0 ? 0 : i3, (i7 & 16) != 0 ? 0 : i4, (i7 & 32) != 0 ? 0 : i5, (i7 & 64) != 0 ? "" : str2, (i7 & 128) != 0 ? 0 : i6, (i7 & 256) == 0 ? z : false, (i7 & 512) == 0 ? str3 : "");
    }

    public /* synthetic */ ConfigVersionInfo(String str, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfigVersionInfo(@NotNull String configId, int i, int i2, int i3, int i4) {
        this(configId, i, i2, i3, i4, 0, "", 0, false, "");
        Intrinsics.checkNotNullParameter(configId, "configId");
    }

    public /* synthetic */ ConfigVersionInfo(String str, int i, int i2, int i3, int i4, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) == 0 ? i4 : 0, (i5 & 32) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfigVersionInfo(@NotNull String configId, int i, int i2, int i3, int i4, @NotNull String err) {
        this(configId, i, i2, i3, i4, 0, "", 0, false, err);
        Intrinsics.checkNotNullParameter(configId, "configId");
        Intrinsics.checkNotNullParameter(err, "err");
    }

    public /* synthetic */ ConfigVersionInfo(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfigVersionInfo(int i, @NotNull String productId) {
        this("", 0, 0, 0, 0, i, productId, 0, false, "");
        Intrinsics.checkNotNullParameter(productId, "productId");
    }

    public /* synthetic */ ConfigVersionInfo(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfigVersionInfo(boolean z, @NotNull String productId) {
        this("", 0, 0, 0, 0, 0, productId, 0, z, "");
        Intrinsics.checkNotNullParameter(productId, "productId");
    }

    public /* synthetic */ ConfigVersionInfo(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfigVersionInfo(@NotNull String productId, int i) {
        this("", 0, 0, 0, 0, 0, productId, i, false, "");
        Intrinsics.checkNotNullParameter(productId, "productId");
    }
}
