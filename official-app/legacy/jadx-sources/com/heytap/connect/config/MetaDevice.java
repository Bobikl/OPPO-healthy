package com.heytap.connect.config;

import androidx.annotation.Keep;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import java.util.ArrayList;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u001e\u001a\u00020\u0010\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013¢\u0006\u0004\b8\u00109J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0018\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0004J\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u0004J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0094\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u001e\u001a\u00020\u00102\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0004J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0019\u0010\u001e\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b*\u0010\u0012R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\b,\u0010\u0004R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b-\u0010\u0004R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b.\u0010\u0004R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010+\u001a\u0004\b/\u0010\u0004R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b0\u0010\u0004R!\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u00101\u001a\u0004\b2\u0010\nR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u00103\u001a\u0004\b4\u0010\u000fR'\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u00105\u001a\u0004\b6\u0010\u0015R\u0019\u0010\u001c\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b7\u0010\u0004¨\u0006:"}, d2 = {"Lcom/heytap/connect/config/MetaDevice;", "", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "Ljava/util/ArrayList;", "component5", "()Ljava/util/ArrayList;", "component6", "component7", "", "component8", "()Ljava/lang/Boolean;", "Lcom/heytap/connect/config/OsInfo;", "component9", "()Lcom/heytap/connect/config/OsInfo;", "", "component10", "()Ljava/util/Map;", "deviceId", "brand", "model", ConnectIdLogic.PARAM_TIMEZONE, "langCodes", "location", "screenResolution", "speakerState", "osInfo", "attributes", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/heytap/connect/config/OsInfo;Ljava/util/Map;)Lcom/heytap/connect/config/MetaDevice;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/heytap/connect/config/OsInfo;", "getOsInfo", "Ljava/lang/String;", "getDeviceId", "getTimeZone", "getLocation", "getBrand", "getModel", "Ljava/util/ArrayList;", "getLangCodes", "Ljava/lang/Boolean;", "getSpeakerState", "Ljava/util/Map;", "getAttributes", "getScreenResolution", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/heytap/connect/config/OsInfo;Ljava/util/Map;)V", "connect_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MetaDevice {

    @Nullable
    private final Map<String, Object> attributes;

    @Nullable
    private final String brand;

    @NotNull
    private final String deviceId;

    @Nullable
    private final ArrayList<String> langCodes;

    @Nullable
    private final String location;

    @Nullable
    private final String model;

    @NotNull
    private final OsInfo osInfo;

    @NotNull
    private final String screenResolution;

    @Nullable
    private final Boolean speakerState;

    @Nullable
    private final String timeZone;

    public MetaDevice(@NotNull String deviceId, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable ArrayList<String> arrayList, @Nullable String str4, @NotNull String screenResolution, @Nullable Boolean bool, @NotNull OsInfo osInfo, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(screenResolution, "screenResolution");
        Intrinsics.checkNotNullParameter(osInfo, "osInfo");
        this.deviceId = deviceId;
        this.brand = str;
        this.model = str2;
        this.timeZone = str3;
        this.langCodes = arrayList;
        this.location = str4;
        this.screenResolution = screenResolution;
        this.speakerState = bool;
        this.osInfo = osInfo;
        this.attributes = map;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final Map<String, Object> component10() {
        return this.attributes;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    @Nullable
    public final ArrayList<String> component5() {
        return this.langCodes;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getScreenResolution() {
        return this.screenResolution;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getSpeakerState() {
        return this.speakerState;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final OsInfo getOsInfo() {
        return this.osInfo;
    }

    @NotNull
    public final MetaDevice copy(@NotNull String deviceId, @Nullable String brand, @Nullable String model, @Nullable String timeZone, @Nullable ArrayList<String> langCodes, @Nullable String location, @NotNull String screenResolution, @Nullable Boolean speakerState, @NotNull OsInfo osInfo, @Nullable Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(screenResolution, "screenResolution");
        Intrinsics.checkNotNullParameter(osInfo, "osInfo");
        return new MetaDevice(deviceId, brand, model, timeZone, langCodes, location, screenResolution, speakerState, osInfo, attributes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetaDevice)) {
            return false;
        }
        MetaDevice metaDevice = (MetaDevice) other;
        return Intrinsics.areEqual(this.deviceId, metaDevice.deviceId) && Intrinsics.areEqual(this.brand, metaDevice.brand) && Intrinsics.areEqual(this.model, metaDevice.model) && Intrinsics.areEqual(this.timeZone, metaDevice.timeZone) && Intrinsics.areEqual(this.langCodes, metaDevice.langCodes) && Intrinsics.areEqual(this.location, metaDevice.location) && Intrinsics.areEqual(this.screenResolution, metaDevice.screenResolution) && Intrinsics.areEqual(this.speakerState, metaDevice.speakerState) && Intrinsics.areEqual(this.osInfo, metaDevice.osInfo) && Intrinsics.areEqual(this.attributes, metaDevice.attributes);
    }

    @Nullable
    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public final String getBrand() {
        return this.brand;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final ArrayList<String> getLangCodes() {
        return this.langCodes;
    }

    @Nullable
    public final String getLocation() {
        return this.location;
    }

    @Nullable
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final OsInfo getOsInfo() {
        return this.osInfo;
    }

    @NotNull
    public final String getScreenResolution() {
        return this.screenResolution;
    }

    @Nullable
    public final Boolean getSpeakerState() {
        return this.speakerState;
    }

    @Nullable
    public final String getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        int iHashCode = this.deviceId.hashCode() * 31;
        String str = this.brand;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.model;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.timeZone;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ArrayList<String> arrayList = this.langCodes;
        int iHashCode5 = (iHashCode4 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str4 = this.location;
        int iHashCode6 = (((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.screenResolution.hashCode()) * 31;
        Boolean bool = this.speakerState;
        int iHashCode7 = (((iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31) + this.osInfo.hashCode()) * 31;
        Map<String, Object> map = this.attributes;
        return iHashCode7 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MetaDevice(deviceId=" + this.deviceId + ", brand=" + ((Object) this.brand) + ", model=" + ((Object) this.model) + ", timeZone=" + ((Object) this.timeZone) + ", langCodes=" + this.langCodes + ", location=" + ((Object) this.location) + ", screenResolution=" + this.screenResolution + ", speakerState=" + this.speakerState + ", osInfo=" + this.osInfo + ", attributes=" + this.attributes + ')';
    }
}
