package com.oplus.mydevices.sdk.linkage;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.oplus.mydevices.sdk.device.BatteryInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010&\u001a\u00020\u000fHÆ\u0003Ji\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u000fHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016¨\u0006-"}, d2 = {"Lcom/oplus/mydevices/sdk/linkage/CapsuleInfo;", "", "deviceId", "", "mac", "iconUri", "title", Feedback.WIDGET_SUBTITLE, "capsuleType", "Lcom/oplus/mydevices/sdk/linkage/CapsuleType;", "videoUri", "batteryInfoList", "", "Lcom/oplus/mydevices/sdk/device/BatteryInfo;", "showType", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/oplus/mydevices/sdk/linkage/CapsuleType;Ljava/lang/String;Ljava/util/List;I)V", "getBatteryInfoList", "()Ljava/util/List;", "getCapsuleType", "()Lcom/oplus/mydevices/sdk/linkage/CapsuleType;", "getDeviceId", "()Ljava/lang/String;", "getIconUri", "getMac", "getShowType", "()I", "getSubTitle", "getTitle", "getVideoUri", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class CapsuleInfo {

    @NotNull
    private final List<BatteryInfo> batteryInfoList;

    @NotNull
    private final CapsuleType capsuleType;

    @NotNull
    private final String deviceId;

    @NotNull
    private final String iconUri;

    @NotNull
    private final String mac;
    private final int showType;

    @NotNull
    private final String subTitle;

    @NotNull
    private final String title;

    @NotNull
    private final String videoUri;

    public CapsuleInfo(@NotNull String deviceId, @NotNull String mac, @NotNull String iconUri, @NotNull String title, @NotNull String subTitle, @NotNull CapsuleType capsuleType, @NotNull String videoUri, @NotNull List<BatteryInfo> batteryInfoList, int i) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(iconUri, "iconUri");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(capsuleType, "capsuleType");
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        Intrinsics.checkNotNullParameter(batteryInfoList, "batteryInfoList");
        this.deviceId = deviceId;
        this.mac = mac;
        this.iconUri = iconUri;
        this.title = title;
        this.subTitle = subTitle;
        this.capsuleType = capsuleType;
        this.videoUri = videoUri;
        this.batteryInfoList = batteryInfoList;
        this.showType = i;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUri() {
        return this.iconUri;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final CapsuleType getCapsuleType() {
        return this.capsuleType;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getVideoUri() {
        return this.videoUri;
    }

    @NotNull
    public final List<BatteryInfo> component8() {
        return this.batteryInfoList;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getShowType() {
        return this.showType;
    }

    @NotNull
    public final CapsuleInfo copy(@NotNull String deviceId, @NotNull String mac, @NotNull String iconUri, @NotNull String title, @NotNull String subTitle, @NotNull CapsuleType capsuleType, @NotNull String videoUri, @NotNull List<BatteryInfo> batteryInfoList, int showType) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(iconUri, "iconUri");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(capsuleType, "capsuleType");
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        Intrinsics.checkNotNullParameter(batteryInfoList, "batteryInfoList");
        return new CapsuleInfo(deviceId, mac, iconUri, title, subTitle, capsuleType, videoUri, batteryInfoList, showType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CapsuleInfo)) {
            return false;
        }
        CapsuleInfo capsuleInfo = (CapsuleInfo) other;
        return Intrinsics.areEqual(this.deviceId, capsuleInfo.deviceId) && Intrinsics.areEqual(this.mac, capsuleInfo.mac) && Intrinsics.areEqual(this.iconUri, capsuleInfo.iconUri) && Intrinsics.areEqual(this.title, capsuleInfo.title) && Intrinsics.areEqual(this.subTitle, capsuleInfo.subTitle) && Intrinsics.areEqual(this.capsuleType, capsuleInfo.capsuleType) && Intrinsics.areEqual(this.videoUri, capsuleInfo.videoUri) && Intrinsics.areEqual(this.batteryInfoList, capsuleInfo.batteryInfoList) && this.showType == capsuleInfo.showType;
    }

    @NotNull
    public final List<BatteryInfo> getBatteryInfoList() {
        return this.batteryInfoList;
    }

    @NotNull
    public final CapsuleType getCapsuleType() {
        return this.capsuleType;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getIconUri() {
        return this.iconUri;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    public final int getShowType() {
        return this.showType;
    }

    @NotNull
    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getVideoUri() {
        return this.videoUri;
    }

    public int hashCode() {
        String str = this.deviceId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mac;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.iconUri;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.subTitle;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        CapsuleType capsuleType = this.capsuleType;
        int iHashCode6 = (iHashCode5 + (capsuleType != null ? capsuleType.hashCode() : 0)) * 31;
        String str6 = this.videoUri;
        int iHashCode7 = (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<BatteryInfo> list = this.batteryInfoList;
        return ((iHashCode7 + (list != null ? list.hashCode() : 0)) * 31) + this.showType;
    }

    @NotNull
    public String toString() {
        return "CapsuleInfo(deviceId=" + this.deviceId + ", mac=" + this.mac + ", iconUri=" + this.iconUri + ", title=" + this.title + ", subTitle=" + this.subTitle + ", capsuleType=" + this.capsuleType + ", videoUri=" + this.videoUri + ", batteryInfoList=" + this.batteryInfoList + ", showType=" + this.showType + ")";
    }
}
