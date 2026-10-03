package com.heytap.speech.engine.protocol.event.payload;

import androidx.annotation.Keep;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.speech.engine.protocol.event.Payload;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0002\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010'J\t\u0010-\u001a\u00020\u0011HÆ\u0003J\u0017\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\rHÆ\u0003J°\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\r2\b\u0010:\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\b\u0010=\u001a\u00020\u0003H\u0016R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019¨\u0006>"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/DeviceInfo;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "deviceId", "", "brand", "model", ConnectIdLogic.PARAM_TIMEZONE, "langCodes", "", "location", "screenResolution", "screenDpi", "cpuSupport64", "", "hostAbi", "speakerState", "osInfo", "Lcom/heytap/speech/engine/protocol/event/payload/OsInfo;", "attributes", "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Lcom/heytap/speech/engine/protocol/event/payload/OsInfo;Ljava/util/Map;)V", "getAttributes", "()Ljava/util/Map;", "getBrand", "()Ljava/lang/String;", "getCpuSupport64", "()Z", "getDeviceId", "getHostAbi", "getLangCodes", "()Ljava/util/List;", "getLocation", "getModel", "getOsInfo", "()Lcom/heytap/speech/engine/protocol/event/payload/OsInfo;", "getScreenDpi", "getScreenResolution", "getSpeakerState", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTimeZone", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Lcom/heytap/speech/engine/protocol/event/payload/OsInfo;Ljava/util/Map;)Lcom/heytap/speech/engine/protocol/event/payload/DeviceInfo;", "equals", "other", "hashCode", "", "toString", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class DeviceInfo extends Payload {

    @Nullable
    private final Map<String, Object> attributes;

    @Nullable
    private final String brand;
    private final boolean cpuSupport64;

    @NotNull
    private final String deviceId;

    @NotNull
    private final String hostAbi;

    @Nullable
    private final List<String> langCodes;

    @Nullable
    private final String location;

    @Nullable
    private final String model;

    @NotNull
    private final OsInfo osInfo;

    @NotNull
    private final String screenDpi;

    @NotNull
    private final String screenResolution;

    @Nullable
    private final Boolean speakerState;

    @Nullable
    private final String timeZone;

    public DeviceInfo(@NotNull String deviceId, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable List<String> list, @Nullable String str4, @NotNull String screenResolution, @NotNull String screenDpi, boolean z, @NotNull String hostAbi, @Nullable Boolean bool, @NotNull OsInfo osInfo, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(screenResolution, "screenResolution");
        Intrinsics.checkNotNullParameter(screenDpi, "screenDpi");
        Intrinsics.checkNotNullParameter(hostAbi, "hostAbi");
        Intrinsics.checkNotNullParameter(osInfo, "osInfo");
        this.deviceId = deviceId;
        this.brand = str;
        this.model = str2;
        this.timeZone = str3;
        this.langCodes = list;
        this.location = str4;
        this.screenResolution = screenResolution;
        this.screenDpi = screenDpi;
        this.cpuSupport64 = z;
        this.hostAbi = hostAbi;
        this.speakerState = bool;
        this.osInfo = osInfo;
        this.attributes = map;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getHostAbi() {
        return this.hostAbi;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getSpeakerState() {
        return this.speakerState;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final OsInfo getOsInfo() {
        return this.osInfo;
    }

    @Nullable
    public final Map<String, Object> component13() {
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
    public final List<String> component5() {
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

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getScreenDpi() {
        return this.screenDpi;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getCpuSupport64() {
        return this.cpuSupport64;
    }

    @NotNull
    public final DeviceInfo copy(@NotNull String deviceId, @Nullable String brand, @Nullable String model, @Nullable String timeZone, @Nullable List<String> langCodes, @Nullable String location, @NotNull String screenResolution, @NotNull String screenDpi, boolean cpuSupport64, @NotNull String hostAbi, @Nullable Boolean speakerState, @NotNull OsInfo osInfo, @Nullable Map<String, ? extends Object> attributes) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(screenResolution, "screenResolution");
        Intrinsics.checkNotNullParameter(screenDpi, "screenDpi");
        Intrinsics.checkNotNullParameter(hostAbi, "hostAbi");
        Intrinsics.checkNotNullParameter(osInfo, "osInfo");
        return new DeviceInfo(deviceId, brand, model, timeZone, langCodes, location, screenResolution, screenDpi, cpuSupport64, hostAbi, speakerState, osInfo, attributes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) other;
        return Intrinsics.areEqual(this.deviceId, deviceInfo.deviceId) && Intrinsics.areEqual(this.brand, deviceInfo.brand) && Intrinsics.areEqual(this.model, deviceInfo.model) && Intrinsics.areEqual(this.timeZone, deviceInfo.timeZone) && Intrinsics.areEqual(this.langCodes, deviceInfo.langCodes) && Intrinsics.areEqual(this.location, deviceInfo.location) && Intrinsics.areEqual(this.screenResolution, deviceInfo.screenResolution) && Intrinsics.areEqual(this.screenDpi, deviceInfo.screenDpi) && this.cpuSupport64 == deviceInfo.cpuSupport64 && Intrinsics.areEqual(this.hostAbi, deviceInfo.hostAbi) && Intrinsics.areEqual(this.speakerState, deviceInfo.speakerState) && Intrinsics.areEqual(this.osInfo, deviceInfo.osInfo) && Intrinsics.areEqual(this.attributes, deviceInfo.attributes);
    }

    @Nullable
    public final Map<String, Object> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public final String getBrand() {
        return this.brand;
    }

    public final boolean getCpuSupport64() {
        return this.cpuSupport64;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getHostAbi() {
        return this.hostAbi;
    }

    @Nullable
    public final List<String> getLangCodes() {
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
    public final String getScreenDpi() {
        return this.screenDpi;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v35 */
    public int hashCode() {
        int iHashCode = this.deviceId.hashCode() * 31;
        String str = this.brand;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.model;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.timeZone;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.langCodes;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.location;
        int iHashCode6 = (((((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.screenResolution.hashCode()) * 31) + this.screenDpi.hashCode()) * 31;
        boolean z = this.cpuSupport64;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode7 = (((iHashCode6 + r1) * 31) + this.hostAbi.hashCode()) * 31;
        Boolean bool = this.speakerState;
        int iHashCode8 = (((iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31) + this.osInfo.hashCode()) * 31;
        Map<String, Object> map = this.attributes;
        return iHashCode8 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeviceInfo(deviceId='" + this.deviceId + "', brand=" + ((Object) this.brand) + ", model=" + ((Object) this.model) + ", timeZone=" + ((Object) this.timeZone) + ", langCodes=" + this.langCodes + ", location=" + ((Object) this.location) + ", screenResolution='" + this.screenResolution + "', speakerState=" + this.speakerState + ", osInfo=" + this.osInfo + ", attributes=" + this.attributes + ')';
    }
}
