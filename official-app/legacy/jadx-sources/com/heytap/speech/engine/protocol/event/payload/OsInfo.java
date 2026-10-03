package com.heytap.speech.engine.protocol.event.payload;

import androidx.annotation.Keep;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.speech.engine.protocol.event.Payload;
import com.heytap.store.base.core.http.HttpConst;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJN\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/OsInfo;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "originalOsType", "", "originalOsVersion", "", "clientOriginalOsVersion", ConnectIdLogic.PARAM_OS_TYPE, "osVersion", "clientOsVersion", "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/Integer;)V", "getClientOriginalOsVersion", "()I", "getClientOsVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOriginalOsType", "getOriginalOsVersion", "()Ljava/lang/String;", "getOsType", "getOsVersion", HttpConst.OTA_VERSION, "getOtaVersion", "setOtaVersion", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/String;IILjava/lang/String;Ljava/lang/Integer;)Lcom/heytap/speech/engine/protocol/event/payload/OsInfo;", "equals", "", "other", "", "hashCode", "toString", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class OsInfo extends Payload {
    private final int clientOriginalOsVersion;

    @Nullable
    private final Integer clientOsVersion;
    private final int originalOsType;

    @NotNull
    private final String originalOsVersion;
    private final int osType;

    @Nullable
    private final String osVersion;

    @Nullable
    private String otaVersion;

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

    @Nullable
    public final String getOtaVersion() {
        return this.otaVersion;
    }

    public int hashCode() {
        int iHashCode = ((((((Integer.hashCode(this.originalOsType) * 31) + this.originalOsVersion.hashCode()) * 31) + Integer.hashCode(this.clientOriginalOsVersion)) * 31) + Integer.hashCode(this.osType)) * 31;
        String str = this.osVersion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.clientOsVersion;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final void setOtaVersion(@Nullable String str) {
        this.otaVersion = str;
    }

    @NotNull
    public String toString() {
        return "OsInfo(originalOsType=" + this.originalOsType + ", originalOsVersion=" + this.originalOsVersion + ", clientOriginalOsVersion=" + this.clientOriginalOsVersion + ", osType=" + this.osType + ", osVersion=" + ((Object) this.osVersion) + ", clientOsVersion=" + this.clientOsVersion + ')';
    }
}
