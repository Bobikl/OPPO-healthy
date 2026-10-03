package com.heytap.wearable.health.gpshandler;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\bR\u001a\u0010\u001a\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0006\"\u0004\b\u001c\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/heytap/wearable/health/gpshandler/GpsAlgInputParams;", "", "()V", "filterFlag", "", "getFilterFlag", "()I", "setFilterFlag", "(I)V", "hfGpsFileList", "", "", "getHfGpsFileList", "()[Ljava/lang/String;", "setHfGpsFileList", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "pgRunwayId", "getPgRunwayId", "setPgRunwayId", "platformType", "getPlatformType", "setPlatformType", "sportType", "getSportType", "setSportType", "versionInfo", "getVersionInfo", "setVersionInfo", "lib_gpshandler_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class GpsAlgInputParams {
    private int filterFlag;
    private int pgRunwayId;
    private int sportType;
    private int versionInfo;
    private int platformType = 1;

    @NotNull
    private String[] hfGpsFileList = new String[0];

    public final int getFilterFlag() {
        return this.filterFlag;
    }

    @NotNull
    public final String[] getHfGpsFileList() {
        return this.hfGpsFileList;
    }

    public final int getPgRunwayId() {
        return this.pgRunwayId;
    }

    public final int getPlatformType() {
        return this.platformType;
    }

    public final int getSportType() {
        return this.sportType;
    }

    public final int getVersionInfo() {
        return this.versionInfo;
    }

    public final void setFilterFlag(int i) {
        this.filterFlag = i;
    }

    public final void setHfGpsFileList(@NotNull String[] strArr) {
        Intrinsics.checkNotNullParameter(strArr, "<set-?>");
        this.hfGpsFileList = strArr;
    }

    public final void setPgRunwayId(int i) {
        this.pgRunwayId = i;
    }

    public final void setPlatformType(int i) {
        this.platformType = i;
    }

    public final void setSportType(int i) {
        this.sportType = i;
    }

    public final void setVersionInfo(int i) {
        this.versionInfo = i;
    }
}
