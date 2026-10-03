package com.oplus.deepthinker.sdk.app.userprofile.labels;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/userprofile/labels/ResidenceInfo;", "", "generateTime", "", "locationClusterInfo", "", "Lcom/oplus/deepthinker/sdk/app/userprofile/labels/LocationClusterInfo;", "(JLjava/util/List;)V", "getGenerateTime", "()J", "setGenerateTime", "(J)V", "getLocationClusterInfo", "()Ljava/util/List;", "setLocationClusterInfo", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class ResidenceInfo {
    private long generateTime;

    @NotNull
    private List<LocationClusterInfo> locationClusterInfo;

    public ResidenceInfo() {
        this(0L, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ResidenceInfo copy$default(ResidenceInfo residenceInfo, long j2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j2 = residenceInfo.generateTime;
        }
        if ((i & 2) != 0) {
            list = residenceInfo.locationClusterInfo;
        }
        return residenceInfo.copy(j2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getGenerateTime() {
        return this.generateTime;
    }

    @NotNull
    public final List<LocationClusterInfo> component2() {
        return this.locationClusterInfo;
    }

    @NotNull
    public final ResidenceInfo copy(long generateTime, @NotNull List<LocationClusterInfo> locationClusterInfo) {
        Intrinsics.checkNotNullParameter(locationClusterInfo, "locationClusterInfo");
        return new ResidenceInfo(generateTime, locationClusterInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResidenceInfo)) {
            return false;
        }
        ResidenceInfo residenceInfo = (ResidenceInfo) other;
        return this.generateTime == residenceInfo.generateTime && Intrinsics.areEqual(this.locationClusterInfo, residenceInfo.locationClusterInfo);
    }

    public final long getGenerateTime() {
        return this.generateTime;
    }

    @NotNull
    public final List<LocationClusterInfo> getLocationClusterInfo() {
        return this.locationClusterInfo;
    }

    public int hashCode() {
        return (Long.hashCode(this.generateTime) * 31) + this.locationClusterInfo.hashCode();
    }

    public final void setGenerateTime(long j2) {
        this.generateTime = j2;
    }

    public final void setLocationClusterInfo(@NotNull List<LocationClusterInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.locationClusterInfo = list;
    }

    @NotNull
    public String toString() {
        return "ResidenceInfo(generateTime=" + this.generateTime + ", locationClusterInfo=" + this.locationClusterInfo + ')';
    }

    public ResidenceInfo(long j2, @NotNull List<LocationClusterInfo> locationClusterInfo) {
        Intrinsics.checkNotNullParameter(locationClusterInfo, "locationClusterInfo");
        this.generateTime = j2;
        this.locationClusterInfo = locationClusterInfo;
    }

    public /* synthetic */ ResidenceInfo(long j2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j2, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
