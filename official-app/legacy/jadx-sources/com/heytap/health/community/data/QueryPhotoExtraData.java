package com.heytap.health.community.data;

import androidx.annotation.Keep;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/community/data/QueryPhotoExtraData;", "", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "", "deviceType", "", "(ILjava/lang/String;)V", "getDeviceType", "()Ljava/lang/String;", "setDeviceType", "(Ljava/lang/String;)V", "getSportMode", "()I", "setSportMode", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "community_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class QueryPhotoExtraData {

    @NotNull
    private String deviceType;
    private int sportMode;

    public QueryPhotoExtraData(int i, @NotNull String deviceType) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        this.sportMode = i;
        this.deviceType = deviceType;
    }

    public static /* synthetic */ QueryPhotoExtraData copy$default(QueryPhotoExtraData queryPhotoExtraData, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = queryPhotoExtraData.sportMode;
        }
        if ((i2 & 2) != 0) {
            str = queryPhotoExtraData.deviceType;
        }
        return queryPhotoExtraData.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSportMode() {
        return this.sportMode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final QueryPhotoExtraData copy(int sportMode, @NotNull String deviceType) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        return new QueryPhotoExtraData(sportMode, deviceType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryPhotoExtraData)) {
            return false;
        }
        QueryPhotoExtraData queryPhotoExtraData = (QueryPhotoExtraData) other;
        return this.sportMode == queryPhotoExtraData.sportMode && Intrinsics.areEqual(this.deviceType, queryPhotoExtraData.deviceType);
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    public final int getSportMode() {
        return this.sportMode;
    }

    public int hashCode() {
        return (Integer.hashCode(this.sportMode) * 31) + this.deviceType.hashCode();
    }

    public final void setDeviceType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deviceType = str;
    }

    public final void setSportMode(int i) {
        this.sportMode = i;
    }

    @NotNull
    public String toString() {
        return "QueryPhotoExtraData(sportMode=" + this.sportMode + ", deviceType=" + this.deviceType + ")";
    }
}
