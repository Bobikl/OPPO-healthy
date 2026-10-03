package com.oplus.ocs.wearengine.capabilityclient;

import android.os.Parcel;
import android.os.Parcelable;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.e36;
import com.oplus.aiunit.vision.t04;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u0000 ?2\u00020\u0001:\u0001@B\u0083\u0001\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b<\u0010>J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\u009f\u0001\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u0004HÆ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010&\u001a\u00020\u0004HÖ\u0001J\u0013\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b1\u0010-R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010+\u001a\u0004\b2\u0010-R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b3\u0010-R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b4\u0010-R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010+\u001a\u0004\b5\u0010-R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010+\u001a\u0004\b6\u0010-R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010+\u001a\u0004\b7\u0010-R\u0019\u0010 \u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b8\u0010-R\u0019\u0010!\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b9\u0010-R\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b:\u00100R\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010.\u001a\u0004\b;\u00100¨\u0006A"}, d2 = {"Lcom/oplus/ocs/wearengine/capabilityclient/BindDeviceInfo;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", ServiceNodeBundleKeys.DEVICE_NAME, "deviceType", t04.DEVICE_UNIQUE_ID, e36.PARAM_FIRMWARE_VERSION, "hardwareVersion", HttpConst.OTA_VERSION, "manufacturer", "model", "deviceSn", "mac", "bleMac", "connectionState", "capacityPercent", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getDeviceName", "()Ljava/lang/String;", "I", "getDeviceType", "()I", "getDeviceUniqueId", "getFirmwareVersion", "getHardwareVersion", "getOtaVersion", "getManufacturer", "getModel", "getDeviceSn", "getMac", "getBleMac", "getConnectionState", "getCapacityPercent", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class BindDeviceInfo implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String bleMac;
    private final int capacityPercent;
    private final int connectionState;

    @Nullable
    private final String deviceName;

    @Nullable
    private final String deviceSn;
    private final int deviceType;

    @Nullable
    private final String deviceUniqueId;

    @Nullable
    private final String firmwareVersion;

    @Nullable
    private final String hardwareVersion;

    @Nullable
    private final String mac;

    @Nullable
    private final String manufacturer;

    @Nullable
    private final String model;

    @Nullable
    private final String otaVersion;

    /* JADX INFO: renamed from: com.oplus.ocs.wearengine.capabilityclient.BindDeviceInfo$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/oplus/ocs/wearengine/capabilityclient/BindDeviceInfo$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/ocs/wearengine/capabilityclient/BindDeviceInfo;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/ocs/wearengine/capabilityclient/BindDeviceInfo;", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<BindDeviceInfo> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BindDeviceInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BindDeviceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BindDeviceInfo[] newArray(int size) {
            return new BindDeviceInfo[size];
        }
    }

    public BindDeviceInfo(@Nullable String str, int i, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, int i2, int i3) {
        this.deviceName = str;
        this.deviceType = i;
        this.deviceUniqueId = str2;
        this.firmwareVersion = str3;
        this.hardwareVersion = str4;
        this.otaVersion = str5;
        this.manufacturer = str6;
        this.model = str7;
        this.deviceSn = str8;
        this.mac = str9;
        this.bleMac = str10;
        this.connectionState = i2;
        this.capacityPercent = i3;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBleMac() {
        return this.bleMac;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getConnectionState() {
        return this.connectionState;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getCapacityPercent() {
        return this.capacityPercent;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOtaVersion() {
        return this.otaVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    @NotNull
    public final BindDeviceInfo copy(@Nullable String deviceName, int deviceType, @Nullable String deviceUniqueId, @Nullable String firmwareVersion, @Nullable String hardwareVersion, @Nullable String otaVersion, @Nullable String manufacturer, @Nullable String model, @Nullable String deviceSn, @Nullable String mac, @Nullable String bleMac, int connectionState, int capacityPercent) {
        return new BindDeviceInfo(deviceName, deviceType, deviceUniqueId, firmwareVersion, hardwareVersion, otaVersion, manufacturer, model, deviceSn, mac, bleMac, connectionState, capacityPercent);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindDeviceInfo)) {
            return false;
        }
        BindDeviceInfo bindDeviceInfo = (BindDeviceInfo) other;
        return Intrinsics.areEqual(this.deviceName, bindDeviceInfo.deviceName) && this.deviceType == bindDeviceInfo.deviceType && Intrinsics.areEqual(this.deviceUniqueId, bindDeviceInfo.deviceUniqueId) && Intrinsics.areEqual(this.firmwareVersion, bindDeviceInfo.firmwareVersion) && Intrinsics.areEqual(this.hardwareVersion, bindDeviceInfo.hardwareVersion) && Intrinsics.areEqual(this.otaVersion, bindDeviceInfo.otaVersion) && Intrinsics.areEqual(this.manufacturer, bindDeviceInfo.manufacturer) && Intrinsics.areEqual(this.model, bindDeviceInfo.model) && Intrinsics.areEqual(this.deviceSn, bindDeviceInfo.deviceSn) && Intrinsics.areEqual(this.mac, bindDeviceInfo.mac) && Intrinsics.areEqual(this.bleMac, bindDeviceInfo.bleMac) && this.connectionState == bindDeviceInfo.connectionState && this.capacityPercent == bindDeviceInfo.capacityPercent;
    }

    @Nullable
    public final String getBleMac() {
        return this.bleMac;
    }

    public final int getCapacityPercent() {
        return this.capacityPercent;
    }

    public final int getConnectionState() {
        return this.connectionState;
    }

    @Nullable
    public final String getDeviceName() {
        return this.deviceName;
    }

    @Nullable
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final String getDeviceUniqueId() {
        return this.deviceUniqueId;
    }

    @Nullable
    public final String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    @Nullable
    public final String getHardwareVersion() {
        return this.hardwareVersion;
    }

    @Nullable
    public final String getMac() {
        return this.mac;
    }

    @Nullable
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @Nullable
    public final String getOtaVersion() {
        return this.otaVersion;
    }

    public int hashCode() {
        String str = this.deviceName;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.deviceType)) * 31;
        String str2 = this.deviceUniqueId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firmwareVersion;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hardwareVersion;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.otaVersion;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.manufacturer;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.model;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deviceSn;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.mac;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.bleMac;
        return ((((iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31) + Integer.hashCode(this.connectionState)) * 31) + Integer.hashCode(this.capacityPercent);
    }

    @NotNull
    public String toString() {
        return "BindDeviceInfo(deviceName=" + this.deviceName + ", deviceType=" + this.deviceType + ", deviceUniqueId=" + this.deviceUniqueId + ", firmwareVersion=" + this.firmwareVersion + ", hardwareVersion=" + this.hardwareVersion + ", otaVersion=" + this.otaVersion + ", manufacturer=" + this.manufacturer + ", model=" + this.model + ", deviceSn=" + this.deviceSn + ", mac=" + this.mac + ", bleMac=" + this.bleMac + ", connectionState=" + this.connectionState + ", capacityPercent=" + this.capacityPercent + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.deviceName);
        parcel.writeInt(this.deviceType);
        parcel.writeString(this.deviceUniqueId);
        parcel.writeString(this.firmwareVersion);
        parcel.writeString(this.hardwareVersion);
        parcel.writeString(this.otaVersion);
        parcel.writeString(this.manufacturer);
        parcel.writeString(this.model);
        parcel.writeString(this.deviceSn);
        parcel.writeString(this.mac);
        parcel.writeString(this.bleMac);
        parcel.writeInt(this.connectionState);
        parcel.writeInt(this.capacityPercent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BindDeviceInfo(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
