package com.oplus.deepthinker.sdk.app.userprofile.labels;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/userprofile/labels/LocationClusterInfo;", "", "longitude", "", "latitude", "chaos", "appearNum", "", "mainWifi", "", "(DDDILjava/lang/String;)V", "getAppearNum", "()I", "setAppearNum", "(I)V", "getChaos", "()D", "setChaos", "(D)V", "getLatitude", "setLatitude", "getLongitude", "setLongitude", "getMainWifi", "()Ljava/lang/String;", "setMainWifi", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class LocationClusterInfo {
    private int appearNum;
    private double chaos;
    private double latitude;
    private double longitude;

    @Nullable
    private String mainWifi;

    public LocationClusterInfo(double d, double d2, double d3, int i, @Nullable String str) {
        this.longitude = d;
        this.latitude = d2;
        this.chaos = d3;
        this.appearNum = i;
        this.mainWifi = str;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getChaos() {
        return this.chaos;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAppearNum() {
        return this.appearNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMainWifi() {
        return this.mainWifi;
    }

    @NotNull
    public final LocationClusterInfo copy(double longitude, double latitude, double chaos, int appearNum, @Nullable String mainWifi) {
        return new LocationClusterInfo(longitude, latitude, chaos, appearNum, mainWifi);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationClusterInfo)) {
            return false;
        }
        LocationClusterInfo locationClusterInfo = (LocationClusterInfo) other;
        return Intrinsics.areEqual((Object) Double.valueOf(this.longitude), (Object) Double.valueOf(locationClusterInfo.longitude)) && Intrinsics.areEqual((Object) Double.valueOf(this.latitude), (Object) Double.valueOf(locationClusterInfo.latitude)) && Intrinsics.areEqual((Object) Double.valueOf(this.chaos), (Object) Double.valueOf(locationClusterInfo.chaos)) && this.appearNum == locationClusterInfo.appearNum && Intrinsics.areEqual(this.mainWifi, locationClusterInfo.mainWifi);
    }

    public final int getAppearNum() {
        return this.appearNum;
    }

    public final double getChaos() {
        return this.chaos;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getMainWifi() {
        return this.mainWifi;
    }

    public int hashCode() {
        int iHashCode = ((((((Double.hashCode(this.longitude) * 31) + Double.hashCode(this.latitude)) * 31) + Double.hashCode(this.chaos)) * 31) + Integer.hashCode(this.appearNum)) * 31;
        String str = this.mainWifi;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setAppearNum(int i) {
        this.appearNum = i;
    }

    public final void setChaos(double d) {
        this.chaos = d;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public final void setMainWifi(@Nullable String str) {
        this.mainWifi = str;
    }

    @NotNull
    public String toString() {
        return "LocationClusterInfo(longitude=" + this.longitude + ", latitude=" + this.latitude + ", chaos=" + this.chaos + ", appearNum=" + this.appearNum + ", mainWifi=" + ((Object) this.mainWifi) + ')';
    }

    public /* synthetic */ LocationClusterInfo(double d, double d2, double d3, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(d, d2, d3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str);
    }
}
