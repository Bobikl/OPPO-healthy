package com.heytap.nearx.cloudconfig.device;

import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.nearx.cloudconfig.util.SystemProperty;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.wearable.support.watchface.common.utils.ResourcesUtil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010%\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\u0015\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\u0097\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0007HÖ\u0001J\u000e\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u0007J\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000308J\t\u00109\u001a\u00020\u0003HÖ\u0001J/\u0010:\u001a\u0002H;\"\u0004\b\u0000\u0010;*\u00020\u00072\u0006\u0010<\u001a\u00020\u00072\u0006\u0010=\u001a\u0002H;2\u0006\u0010>\u001a\u0002H;H\u0002¢\u0006\u0002\u0010?R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u0006@"}, d2 = {"Lcom/heytap/nearx/cloudconfig/device/MatchConditions;", "", Fields.PROCESS_NAME_FIELD, "", Fields.REGION_CODE_FIELD, "package_name", "version_code", "", Fields.BUILD_NUMBER_FIELD, Fields.CHANNEL_ID_FIELD, Fields.PLATFORM_BRAND_FIELD, Fields.PLATFORM_ANDROID_VERSION_FIELD, Fields.PLATFORM_OS_VERSION_FIELD, "model", "adg", "preview", "map", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IILjava/util/Map;)V", "getAdg", "()I", "getBuild_number", "()Ljava/lang/String;", "getChannel_id", "getMap", "()Ljava/util/Map;", "getModel", "getPackage_name", "getPlatform_android_version", "getPlatform_brand", "getPlatform_os_version", "getPreview", "getProcessName", "getRegionCode", "getVersion_code", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "requestConditions", ResourcesUtil.ResourceType.DIMEN, "toMap", "", "toString", "value", ExifInterface.GPS_DIRECTION_TRUE, "len", "curr", "default", "(IILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final /* data */ class MatchConditions {
    private final int adg;

    @NotNull
    private final String build_number;

    @NotNull
    private final String channel_id;

    @NotNull
    private final Map<String, String> map;

    @NotNull
    private final String model;

    @NotNull
    private final String package_name;
    private final int platform_android_version;

    @NotNull
    private final String platform_brand;

    @NotNull
    private final String platform_os_version;
    private final int preview;

    @NotNull
    private final String processName;

    @NotNull
    private final String regionCode;
    private final int version_code;

    public MatchConditions(@NotNull String processName, @NotNull String regionCode, @NotNull String package_name, int i, @NotNull String build_number, @NotNull String channel_id, @NotNull String platform_brand, int i2, @NotNull String platform_os_version, @NotNull String model, int i3, int i4, @NotNull Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(processName, "processName");
        Intrinsics.checkParameterIsNotNull(regionCode, "regionCode");
        Intrinsics.checkParameterIsNotNull(package_name, "package_name");
        Intrinsics.checkParameterIsNotNull(build_number, "build_number");
        Intrinsics.checkParameterIsNotNull(channel_id, "channel_id");
        Intrinsics.checkParameterIsNotNull(platform_brand, "platform_brand");
        Intrinsics.checkParameterIsNotNull(platform_os_version, "platform_os_version");
        Intrinsics.checkParameterIsNotNull(model, "model");
        Intrinsics.checkParameterIsNotNull(map, "map");
        this.processName = processName;
        this.regionCode = regionCode;
        this.package_name = package_name;
        this.version_code = i;
        this.build_number = build_number;
        this.channel_id = channel_id;
        this.platform_brand = platform_brand;
        this.platform_android_version = i2;
        this.platform_os_version = platform_os_version;
        this.model = model;
        this.adg = i3;
        this.preview = i4;
        this.map = map;
    }

    private final <T> T value(int i, int i2, T t, T t2) {
        return ((i >> i2) & 1) == 0 ? t : t2;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProcessName() {
        return this.processName;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getAdg() {
        return this.adg;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getPreview() {
        return this.preview;
    }

    @NotNull
    public final Map<String, String> component13() {
        return this.map;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRegionCode() {
        return this.regionCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPackage_name() {
        return this.package_name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getVersion_code() {
        return this.version_code;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBuild_number() {
        return this.build_number;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChannel_id() {
        return this.channel_id;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPlatform_brand() {
        return this.platform_brand;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getPlatform_android_version() {
        return this.platform_android_version;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPlatform_os_version() {
        return this.platform_os_version;
    }

    @NotNull
    public final MatchConditions copy(@NotNull String processName, @NotNull String regionCode, @NotNull String package_name, int version_code, @NotNull String build_number, @NotNull String channel_id, @NotNull String platform_brand, int platform_android_version, @NotNull String platform_os_version, @NotNull String model, int adg, int preview, @NotNull Map<String, String> map) {
        Intrinsics.checkParameterIsNotNull(processName, "processName");
        Intrinsics.checkParameterIsNotNull(regionCode, "regionCode");
        Intrinsics.checkParameterIsNotNull(package_name, "package_name");
        Intrinsics.checkParameterIsNotNull(build_number, "build_number");
        Intrinsics.checkParameterIsNotNull(channel_id, "channel_id");
        Intrinsics.checkParameterIsNotNull(platform_brand, "platform_brand");
        Intrinsics.checkParameterIsNotNull(platform_os_version, "platform_os_version");
        Intrinsics.checkParameterIsNotNull(model, "model");
        Intrinsics.checkParameterIsNotNull(map, "map");
        return new MatchConditions(processName, regionCode, package_name, version_code, build_number, channel_id, platform_brand, platform_android_version, platform_os_version, model, adg, preview, map);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchConditions)) {
            return false;
        }
        MatchConditions matchConditions = (MatchConditions) other;
        return Intrinsics.areEqual(this.processName, matchConditions.processName) && Intrinsics.areEqual(this.regionCode, matchConditions.regionCode) && Intrinsics.areEqual(this.package_name, matchConditions.package_name) && this.version_code == matchConditions.version_code && Intrinsics.areEqual(this.build_number, matchConditions.build_number) && Intrinsics.areEqual(this.channel_id, matchConditions.channel_id) && Intrinsics.areEqual(this.platform_brand, matchConditions.platform_brand) && this.platform_android_version == matchConditions.platform_android_version && Intrinsics.areEqual(this.platform_os_version, matchConditions.platform_os_version) && Intrinsics.areEqual(this.model, matchConditions.model) && this.adg == matchConditions.adg && this.preview == matchConditions.preview && Intrinsics.areEqual(this.map, matchConditions.map);
    }

    public final int getAdg() {
        return this.adg;
    }

    @NotNull
    public final String getBuild_number() {
        return this.build_number;
    }

    @NotNull
    public final String getChannel_id() {
        return this.channel_id;
    }

    @NotNull
    public final Map<String, String> getMap() {
        return this.map;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final String getPackage_name() {
        return this.package_name;
    }

    public final int getPlatform_android_version() {
        return this.platform_android_version;
    }

    @NotNull
    public final String getPlatform_brand() {
        return this.platform_brand;
    }

    @NotNull
    public final String getPlatform_os_version() {
        return this.platform_os_version;
    }

    public final int getPreview() {
        return this.preview;
    }

    @NotNull
    public final String getProcessName() {
        return this.processName;
    }

    @NotNull
    public final String getRegionCode() {
        return this.regionCode;
    }

    public final int getVersion_code() {
        return this.version_code;
    }

    public int hashCode() {
        String str = this.processName;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.regionCode;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.package_name;
        int iHashCode3 = (((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.version_code)) * 31;
        String str4 = this.build_number;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.channel_id;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.platform_brand;
        int iHashCode6 = (((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + Integer.hashCode(this.platform_android_version)) * 31;
        String str7 = this.platform_os_version;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.model;
        int iHashCode8 = (((((iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31) + Integer.hashCode(this.adg)) * 31) + Integer.hashCode(this.preview)) * 31;
        Map<String, String> map = this.map;
        return iHashCode8 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public final MatchConditions requestConditions(int dimen) {
        return dimen <= 0 ? this : new MatchConditions(this.processName, (String) value(dimen, 9, this.regionCode, ""), (String) value(dimen, 0, this.package_name, ""), ((Number) value(dimen, 1, Integer.valueOf(this.version_code), 0)).intValue(), (String) value(dimen, 2, this.build_number, ""), (String) value(dimen, 3, this.channel_id, ""), (String) value(dimen, 4, this.platform_brand, ""), ((Number) value(dimen, 6, Integer.valueOf(this.platform_android_version), 0)).intValue(), (String) value(dimen, 5, this.platform_os_version, ""), (String) value(dimen, 7, this.model, ""), ((Number) value(dimen, 10, Integer.valueOf(this.adg), 0)).intValue(), this.preview, this.map);
    }

    @NotNull
    public final Map<String, String> toMap() {
        return MapsKt__MapsKt.plus(MapsKt__MapsKt.mapOf(TuplesKt.to(Fields.PROCESS_NAME_FIELD, this.processName), TuplesKt.to(Fields.REGION_CODE_FIELD, this.regionCode), TuplesKt.to("package_name", this.package_name), TuplesKt.to("version_code", String.valueOf(this.version_code)), TuplesKt.to(Fields.BUILD_NUMBER_FIELD, this.build_number), TuplesKt.to(Fields.CHANNEL_ID_FIELD, this.channel_id), TuplesKt.to(Fields.PLATFORM_BRAND_FIELD, this.platform_brand), TuplesKt.to(Fields.PLATFORM_ANDROID_VERSION_FIELD, String.valueOf(this.platform_android_version)), TuplesKt.to(Fields.PLATFORM_OS_VERSION_FIELD, this.platform_os_version), TuplesKt.to("model", this.model), TuplesKt.to("preview", String.valueOf(this.preview)), TuplesKt.to("adg_model", String.valueOf(this.adg))), this.map);
    }

    @NotNull
    public String toString() {
        return "MatchConditions(processName=" + this.processName + ", regionCode=" + this.regionCode + ", package_name=" + this.package_name + ", version_code=" + this.version_code + ", build_number=" + this.build_number + ", channel_id=" + this.channel_id + ", platform_brand=" + this.platform_brand + ", platform_android_version=" + this.platform_android_version + ", platform_os_version=" + this.platform_os_version + ", model=" + this.model + ", adg=" + this.adg + ", preview=" + this.preview + ", map=" + this.map + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    public /* synthetic */ MatchConditions(String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, String str7, String str8, int i3, int i4, Map map, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        String str10;
        String str11 = (i5 & 2) != 0 ? "CN" : str2;
        int i6 = (i5 & 8) != 0 ? 0 : i;
        String str12 = (i5 & 16) != 0 ? "" : str4;
        String str13 = (i5 & 32) != 0 ? "" : str5;
        if ((i5 & 64) != 0) {
            String str14 = Build.BRAND;
            Intrinsics.checkExpressionValueIsNotNull(str14, "Build.BRAND");
            str9 = str14;
        } else {
            str9 = str6;
        }
        int i7 = (i5 & 128) != 0 ? Build.VERSION.SDK_INT : i2;
        if ((i5 & 512) != 0) {
            String str15 = Build.MODEL;
            Intrinsics.checkExpressionValueIsNotNull(str15, "Build.MODEL");
            str10 = str15;
        } else {
            str10 = str8;
        }
        this(str, str11, str3, i6, str12, str13, str9, i7, str7, str10, (i5 & 1024) != 0 ? 0 : i3, (i5 & 2048) != 0 ? SystemProperty.INSTANCE.getBoolean("debug.heytap.cloudconfig.preview", false) : i4, (i5 & 4096) != 0 ? new ConcurrentHashMap() : map);
    }
}
