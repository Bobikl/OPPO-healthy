package com.heytap.wearable.watch.emergency.safeguard;

import androidx.annotation.Keep;
import com.heytap.health.core.widget.charts.RecordCombinedLineChart;
import com.heytap.wearable.emergency.api.emergency.EmergencyTransportApis;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import xcrash.TombstoneParser;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b0\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0002\u0010\u0013J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\u009f\u0001\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0005HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006:"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/SyncTravelData;", "", EmergencyTransportApis.KEY_TRAVEL_ID, "", "timestamp", "", "posType", TombstoneParser.keySignal, "latitude", "longitude", "altitude", "speed", "accuracy", "batteryLevel", "wearStatus", RecordCombinedLineChart.KEY_HEART_RATE, "userState", "stayTime", "pushUserState", "(Ljava/lang/String;IIIIIIIIIIIIII)V", "getAccuracy", "()I", "getAltitude", "getBatteryLevel", "getHeartRate", "getLatitude", "getLongitude", "getPosType", "getPushUserState", "getSignal", "getSpeed", "getStayTime", "getTimestamp", "getTravelId", "()Ljava/lang/String;", "getUserState", "getWearStatus", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "emergency_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SyncTravelData {
    private final int accuracy;
    private final int altitude;
    private final int batteryLevel;
    private final int heartRate;
    private final int latitude;
    private final int longitude;
    private final int posType;
    private final int pushUserState;
    private final int signal;
    private final int speed;
    private final int stayTime;
    private final int timestamp;

    @NotNull
    private final String travelId;
    private final int userState;
    private final int wearStatus;

    public SyncTravelData(@NotNull String travelId, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(travelId, "travelId");
        this.travelId = travelId;
        this.timestamp = i;
        this.posType = i2;
        this.signal = i3;
        this.latitude = i4;
        this.longitude = i5;
        this.altitude = i6;
        this.speed = i7;
        this.accuracy = i8;
        this.batteryLevel = i9;
        this.wearStatus = i10;
        this.heartRate = i11;
        this.userState = i12;
        this.stayTime = i13;
        this.pushUserState = i14;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTravelId() {
        return this.travelId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getWearStatus() {
        return this.wearStatus;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getHeartRate() {
        return this.heartRate;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getUserState() {
        return this.userState;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getStayTime() {
        return this.stayTime;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getPushUserState() {
        return this.pushUserState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPosType() {
        return this.posType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSignal() {
        return this.signal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getAltitude() {
        return this.altitude;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getSpeed() {
        return this.speed;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getAccuracy() {
        return this.accuracy;
    }

    @NotNull
    public final SyncTravelData copy(@NotNull String travelId, int timestamp, int posType, int signal, int latitude, int longitude, int altitude, int speed, int accuracy, int batteryLevel, int wearStatus, int heartRate, int userState, int stayTime, int pushUserState) {
        Intrinsics.checkNotNullParameter(travelId, "travelId");
        return new SyncTravelData(travelId, timestamp, posType, signal, latitude, longitude, altitude, speed, accuracy, batteryLevel, wearStatus, heartRate, userState, stayTime, pushUserState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncTravelData)) {
            return false;
        }
        SyncTravelData syncTravelData = (SyncTravelData) other;
        return Intrinsics.areEqual(this.travelId, syncTravelData.travelId) && this.timestamp == syncTravelData.timestamp && this.posType == syncTravelData.posType && this.signal == syncTravelData.signal && this.latitude == syncTravelData.latitude && this.longitude == syncTravelData.longitude && this.altitude == syncTravelData.altitude && this.speed == syncTravelData.speed && this.accuracy == syncTravelData.accuracy && this.batteryLevel == syncTravelData.batteryLevel && this.wearStatus == syncTravelData.wearStatus && this.heartRate == syncTravelData.heartRate && this.userState == syncTravelData.userState && this.stayTime == syncTravelData.stayTime && this.pushUserState == syncTravelData.pushUserState;
    }

    public final int getAccuracy() {
        return this.accuracy;
    }

    public final int getAltitude() {
        return this.altitude;
    }

    public final int getBatteryLevel() {
        return this.batteryLevel;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final int getLatitude() {
        return this.latitude;
    }

    public final int getLongitude() {
        return this.longitude;
    }

    public final int getPosType() {
        return this.posType;
    }

    public final int getPushUserState() {
        return this.pushUserState;
    }

    public final int getSignal() {
        return this.signal;
    }

    public final int getSpeed() {
        return this.speed;
    }

    public final int getStayTime() {
        return this.stayTime;
    }

    public final int getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getTravelId() {
        return this.travelId;
    }

    public final int getUserState() {
        return this.userState;
    }

    public final int getWearStatus() {
        return this.wearStatus;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((this.travelId.hashCode() * 31) + Integer.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.posType)) * 31) + Integer.hashCode(this.signal)) * 31) + Integer.hashCode(this.latitude)) * 31) + Integer.hashCode(this.longitude)) * 31) + Integer.hashCode(this.altitude)) * 31) + Integer.hashCode(this.speed)) * 31) + Integer.hashCode(this.accuracy)) * 31) + Integer.hashCode(this.batteryLevel)) * 31) + Integer.hashCode(this.wearStatus)) * 31) + Integer.hashCode(this.heartRate)) * 31) + Integer.hashCode(this.userState)) * 31) + Integer.hashCode(this.stayTime)) * 31) + Integer.hashCode(this.pushUserState);
    }

    @NotNull
    public String toString() {
        return "SyncTravelData(travelId=" + this.travelId + ", timestamp=" + this.timestamp + ", posType=" + this.posType + ", signal=" + this.signal + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.altitude + ", speed=" + this.speed + ", accuracy=" + this.accuracy + ", batteryLevel=" + this.batteryLevel + ", wearStatus=" + this.wearStatus + ", heartRate=" + this.heartRate + ", userState=" + this.userState + ", stayTime=" + this.stayTime + ", pushUserState=" + this.pushUserState + ")";
    }
}
