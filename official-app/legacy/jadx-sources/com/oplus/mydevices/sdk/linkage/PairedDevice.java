package com.oplus.mydevices.sdk.linkage;

import androidx.annotation.Keep;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0002\u0010\u0012J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u008f\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010#R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0014R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006<"}, d2 = {"Lcom/oplus/mydevices/sdk/linkage/PairedDevice;", "", "boundStatus", "", "ssoid", "", "accountKey", "deviceType", "deviceId", ServiceNodeBundleKeys.DEVICE_NAME, "mac", Fields.PRODUCT_ID, "colorId", SpeechConstant.KEY_TTS_TIMESTAMP, "", "serverDeviceId", "linkageVersion", "feature", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;II)V", "getAccountKey", "()Ljava/lang/String;", "getBoundStatus", "()I", "setBoundStatus", "(I)V", "getColorId", "getDeviceId", "getDeviceName", "getDeviceType", "getFeature", "getLinkageVersion", "getMac", "getProductId", "getServerDeviceId", "setServerDeviceId", "(Ljava/lang/String;)V", "getSsoid", "getTimeStamp", "()J", "setTimeStamp", "(J)V", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class PairedDevice {

    @Nullable
    private final String accountKey;
    private int boundStatus;

    @NotNull
    private final String colorId;

    @NotNull
    private final String deviceId;

    @NotNull
    private final String deviceName;

    @NotNull
    private final String deviceType;
    private final int feature;
    private final int linkageVersion;

    @NotNull
    private final String mac;

    @NotNull
    private final String productId;

    @NotNull
    private String serverDeviceId;

    @Nullable
    private final String ssoid;
    private long timeStamp;

    public PairedDevice(int i, @Nullable String str, @Nullable String str2, @NotNull String deviceType, @NotNull String deviceId, @NotNull String deviceName, @NotNull String mac, @NotNull String productId, @NotNull String colorId, long j2, @NotNull String serverDeviceId, int i2, int i3) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(colorId, "colorId");
        Intrinsics.checkNotNullParameter(serverDeviceId, "serverDeviceId");
        this.boundStatus = i;
        this.ssoid = str;
        this.accountKey = str2;
        this.deviceType = deviceType;
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.mac = mac;
        this.productId = productId;
        this.colorId = colorId;
        this.timeStamp = j2;
        this.serverDeviceId = serverDeviceId;
        this.linkageVersion = i2;
        this.feature = i3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBoundStatus() {
        return this.boundStatus;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getServerDeviceId() {
        return this.serverDeviceId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getLinkageVersion() {
        return this.linkageVersion;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getFeature() {
        return this.feature;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSsoid() {
        return this.ssoid;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccountKey() {
        return this.accountKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getColorId() {
        return this.colorId;
    }

    @NotNull
    public final PairedDevice copy(int boundStatus, @Nullable String ssoid, @Nullable String accountKey, @NotNull String deviceType, @NotNull String deviceId, @NotNull String deviceName, @NotNull String mac, @NotNull String productId, @NotNull String colorId, long timeStamp, @NotNull String serverDeviceId, int linkageVersion, int feature) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(deviceName, "deviceName");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(colorId, "colorId");
        Intrinsics.checkNotNullParameter(serverDeviceId, "serverDeviceId");
        return new PairedDevice(boundStatus, ssoid, accountKey, deviceType, deviceId, deviceName, mac, productId, colorId, timeStamp, serverDeviceId, linkageVersion, feature);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PairedDevice)) {
            return false;
        }
        PairedDevice pairedDevice = (PairedDevice) other;
        return this.boundStatus == pairedDevice.boundStatus && Intrinsics.areEqual(this.ssoid, pairedDevice.ssoid) && Intrinsics.areEqual(this.accountKey, pairedDevice.accountKey) && Intrinsics.areEqual(this.deviceType, pairedDevice.deviceType) && Intrinsics.areEqual(this.deviceId, pairedDevice.deviceId) && Intrinsics.areEqual(this.deviceName, pairedDevice.deviceName) && Intrinsics.areEqual(this.mac, pairedDevice.mac) && Intrinsics.areEqual(this.productId, pairedDevice.productId) && Intrinsics.areEqual(this.colorId, pairedDevice.colorId) && this.timeStamp == pairedDevice.timeStamp && Intrinsics.areEqual(this.serverDeviceId, pairedDevice.serverDeviceId) && this.linkageVersion == pairedDevice.linkageVersion && this.feature == pairedDevice.feature;
    }

    @Nullable
    public final String getAccountKey() {
        return this.accountKey;
    }

    public final int getBoundStatus() {
        return this.boundStatus;
    }

    @NotNull
    public final String getColorId() {
        return this.colorId;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    public final int getFeature() {
        return this.feature;
    }

    public final int getLinkageVersion() {
        return this.linkageVersion;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    public final String getServerDeviceId() {
        return this.serverDeviceId;
    }

    @Nullable
    public final String getSsoid() {
        return this.ssoid;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        int i = this.boundStatus * 31;
        String str = this.ssoid;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.accountKey;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.deviceType;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.deviceId;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.deviceName;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.mac;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.productId;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.colorId;
        int iHashCode8 = str8 != null ? str8.hashCode() : 0;
        long j2 = this.timeStamp;
        int i2 = (((iHashCode7 + iHashCode8) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str9 = this.serverDeviceId;
        return ((((i2 + (str9 != null ? str9.hashCode() : 0)) * 31) + this.linkageVersion) * 31) + this.feature;
    }

    public final void setBoundStatus(int i) {
        this.boundStatus = i;
    }

    public final void setServerDeviceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serverDeviceId = str;
    }

    public final void setTimeStamp(long j2) {
        this.timeStamp = j2;
    }

    @NotNull
    public String toString() {
        return "PairedDevice(boundStatus=" + this.boundStatus + ", ssoid=" + this.ssoid + ", accountKey=" + this.accountKey + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", deviceName=" + this.deviceName + ", mac=" + this.mac + ", productId=" + this.productId + ", colorId=" + this.colorId + ", timeStamp=" + this.timeStamp + ", serverDeviceId=" + this.serverDeviceId + ", linkageVersion=" + this.linkageVersion + ", feature=" + this.feature + ")";
    }

    public /* synthetic */ PairedDevice(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, str5, str6, str7, str8, j2, (i4 & 1024) != 0 ? "" : str9, i2, i3);
    }
}
