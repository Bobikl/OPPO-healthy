package com.heytap.connect.config;

import androidx.annotation.Keep;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJP\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0007J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0004J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u001f\u0010\u0004R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\u0007R\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b\"\u0010\u0007R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b#\u0010\u0004¨\u0006&"}, d2 = {"Lcom/heytap/connect/config/OsInfo;", "", "", "component1", "()I", "", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "originalOsType", "originalOsVersion", "clientOriginalOsVersion", ConnectIdLogic.PARAM_OS_TYPE, "osVersion", "clientOsVersion", "copy", "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/Integer;)Lcom/heytap/connect/config/OsInfo;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getClientOriginalOsVersion", "Ljava/lang/Integer;", "getClientOsVersion", "getOsType", "Ljava/lang/String;", "getOsVersion", "getOriginalOsVersion", "getOriginalOsType", "<init>", "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/Integer;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class OsInfo {
    private final int clientOriginalOsVersion;

    @Nullable
    private final Integer clientOsVersion;
    private final int originalOsType;

    @NotNull
    private final String originalOsVersion;
    private final int osType;

    @Nullable
    private final String osVersion;

    public OsInfo(int i, @NotNull String originalOsVersion, int i2, int i3, @Nullable String str, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(originalOsVersion, "originalOsVersion");
        this.originalOsType = i;
        this.originalOsVersion = originalOsVersion;
        this.clientOriginalOsVersion = i2;
        this.osType = i3;
        this.osVersion = str;
        this.clientOsVersion = num;
    }

    public static /* synthetic */ OsInfo copy$default(OsInfo osInfo, int i, String str, int i2, int i3, String str2, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = osInfo.originalOsType;
        }
        if ((i4 & 2) != 0) {
            str = osInfo.originalOsVersion;
        }
        String str3 = str;
        if ((i4 & 4) != 0) {
            i2 = osInfo.clientOriginalOsVersion;
        }
        int i5 = i2;
        if ((i4 & 8) != 0) {
            i3 = osInfo.osType;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            str2 = osInfo.osVersion;
        }
        String str4 = str2;
        if ((i4 & 32) != 0) {
            num = osInfo.clientOsVersion;
        }
        return osInfo.copy(i, str3, i5, i6, str4, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOriginalOsType() {
        return this.originalOsType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOriginalOsVersion() {
        return this.originalOsVersion;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getClientOriginalOsVersion() {
        return this.clientOriginalOsVersion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOsType() {
        return this.osType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getClientOsVersion() {
        return this.clientOsVersion;
    }

    @NotNull
    public final OsInfo copy(int originalOsType, @NotNull String originalOsVersion, int clientOriginalOsVersion, int osType, @Nullable String osVersion, @Nullable Integer clientOsVersion) {
        Intrinsics.checkNotNullParameter(originalOsVersion, "originalOsVersion");
        return new OsInfo(originalOsType, originalOsVersion, clientOriginalOsVersion, osType, osVersion, clientOsVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OsInfo)) {
            return false;
        }
        OsInfo osInfo = (OsInfo) other;
        return this.originalOsType == osInfo.originalOsType && Intrinsics.areEqual(this.originalOsVersion, osInfo.originalOsVersion) && this.clientOriginalOsVersion == osInfo.clientOriginalOsVersion && this.osType == osInfo.osType && Intrinsics.areEqual(this.osVersion, osInfo.osVersion) && Intrinsics.areEqual(this.clientOsVersion, osInfo.clientOsVersion);
    }

    public final int getClientOriginalOsVersion() {
        return this.clientOriginalOsVersion;
    }

    @Nullable
    public final Integer getClientOsVersion() {
        return this.clientOsVersion;
    }

    public final int getOriginalOsType() {
        return this.originalOsType;
    }

    @NotNull
    public final String getOriginalOsVersion() {
        return this.originalOsVersion;
    }

    public final int getOsType() {
        return this.osType;
    }

    @Nullable
    public final String getOsVersion() {
        return this.osVersion;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.originalOsType) * 31) + this.originalOsVersion.hashCode()) * 31) + Integer.hashCode(this.clientOriginalOsVersion)) * 31) + Integer.hashCode(this.osType)) * 31;
        String str = this.osVersion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.clientOsVersion;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OsInfo(originalOsType=" + this.originalOsType + ", originalOsVersion=" + this.originalOsVersion + ", clientOriginalOsVersion=" + this.clientOriginalOsVersion + ", osType=" + this.osType + ", osVersion=" + ((Object) this.osVersion) + ", clientOsVersion=" + this.clientOsVersion + ')';
    }
}
