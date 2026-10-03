package com.cloud.sdk.cloudstorage.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\u0006\u0010\u001d\u001a\u00020\u001aJ\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/cloud/sdk/cloudstorage/api/ServerInfo;", "", "host", "", "bucket", "appPk", "manufacturer", "", "serverVersion", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V", "getAppPk", "()Ljava/lang/String;", "getBucket", "getHost", "getManufacturer", "()I", "getServerVersion", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "isAvailable", "toString", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class ServerInfo {

    @SerializedName("appPk")
    @Expose
    @NotNull
    private final String appPk;

    @SerializedName("bucket")
    @Expose
    @NotNull
    private final String bucket;

    @SerializedName("hostName")
    @Expose
    @NotNull
    private final String host;

    @SerializedName("manufacturer")
    @Expose
    private final int manufacturer;

    @SerializedName("serverVersion")
    @Expose
    private final long serverVersion;

    public ServerInfo(@NotNull String host, @NotNull String bucket, @NotNull String appPk, int i, long j2) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(bucket, "bucket");
        Intrinsics.checkNotNullParameter(appPk, "appPk");
        this.host = host;
        this.bucket = bucket;
        this.appPk = appPk;
        this.manufacturer = i;
        this.serverVersion = j2;
    }

    public static /* synthetic */ ServerInfo copy$default(ServerInfo serverInfo, String str, String str2, String str3, int i, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = serverInfo.host;
        }
        if ((i2 & 2) != 0) {
            str2 = serverInfo.bucket;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = serverInfo.appPk;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            i = serverInfo.manufacturer;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            j2 = serverInfo.serverVersion;
        }
        return serverInfo.copy(str, str4, str5, i3, j2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBucket() {
        return this.bucket;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppPk() {
        return this.appPk;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getManufacturer() {
        return this.manufacturer;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getServerVersion() {
        return this.serverVersion;
    }

    @NotNull
    public final ServerInfo copy(@NotNull String host, @NotNull String bucket, @NotNull String appPk, int manufacturer, long serverVersion) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(bucket, "bucket");
        Intrinsics.checkNotNullParameter(appPk, "appPk");
        return new ServerInfo(host, bucket, appPk, manufacturer, serverVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServerInfo)) {
            return false;
        }
        ServerInfo serverInfo = (ServerInfo) other;
        return Intrinsics.areEqual(this.host, serverInfo.host) && Intrinsics.areEqual(this.bucket, serverInfo.bucket) && Intrinsics.areEqual(this.appPk, serverInfo.appPk) && this.manufacturer == serverInfo.manufacturer && this.serverVersion == serverInfo.serverVersion;
    }

    @NotNull
    public final String getAppPk() {
        return this.appPk;
    }

    @NotNull
    public final String getBucket() {
        return this.bucket;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    public final int getManufacturer() {
        return this.manufacturer;
    }

    public final long getServerVersion() {
        return this.serverVersion;
    }

    public int hashCode() {
        String str = this.host;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.bucket;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.appPk;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.manufacturer) * 31;
        long j2 = this.serverVersion;
        return iHashCode3 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final boolean isAvailable() {
        return (StringsKt__StringsJVMKt.isBlank(this.bucket) ^ true) && (StringsKt__StringsJVMKt.isBlank(this.appPk) ^ true);
    }

    @NotNull
    public String toString() {
        return "ServerInfo(host=" + this.host + ", bucket=" + this.bucket + ", appPk=" + this.appPk + ", manufacturer=" + this.manufacturer + ", serverVersion=" + this.serverVersion + ")";
    }

    public /* synthetic */ ServerInfo(String str, String str2, String str3, int i, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? "" : str2, str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? 0L : j2);
    }
}
