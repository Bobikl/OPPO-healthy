package com.oppo.obus.common.report.core.entity.v32;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.protostuff.Tag;

/* JADX INFO: loaded from: classes9.dex */
public class Head {

    @SerializedName("$access")
    @JsonProperty("$access")
    @Tag(16)
    private String access;

    @SerializedName("$android_version")
    @JsonProperty("$android_version")
    @Tag(11)
    private String androidVersion;

    @SerializedName("$app_id")
    @JsonProperty("$app_id")
    @Tag(22)
    private String appId;

    @SerializedName("$app_package")
    @JsonProperty("$app_package")
    @Tag(24)
    private String appPackage;

    @SerializedName("$app_uuid")
    @JsonProperty("$app_uuid")
    @Tag(23)
    private String appUuid;

    @SerializedName("$app_version")
    @JsonProperty("$app_version")
    @Tag(25)
    private String appVersion;

    @SerializedName("$app_version_code")
    @JsonProperty("$app_version_code")
    @Tag(26)
    private Long appVersionCode;

    @SerializedName("$brand")
    @JsonProperty("$brand")
    @Tag(6)
    private String brand;

    @SerializedName("$carrier")
    @JsonProperty("$carrier")
    @Tag(15)
    private String carrier;

    @SerializedName("$channel")
    @JsonProperty("$channel")
    @Tag(14)
    private String channel;

    @SerializedName("$client_id")
    @JsonProperty("$client_id")
    @Tag(2)
    private String clientId;

    @SerializedName("$client_type")
    @JsonProperty("$client_type")
    @Tag(1)
    private String clientType;

    @SerializedName("$cloud_config_product_version")
    @JsonProperty("$cloud_config_product_version")
    @Tag(28)
    private String cloudConfigProductVersion;

    @SerializedName("$drs_pkg")
    @JsonProperty("$drs_pkg")
    @Tag(32)
    private String drsPkg;

    @SerializedName("$drs_version_code")
    @JsonProperty("$drs_version_code")
    @Tag(34)
    private String drsVersionCode;

    @SerializedName("$drs_version_name")
    @JsonProperty("$drs_version_name")
    @Tag(33)
    private String drsVersionName;

    @SerializedName("$duid")
    @JsonProperty("$duid")
    @Tag(4)
    private String duid;

    @SerializedName("$event_access")
    @JsonProperty("$event_access")
    @Tag(17)
    private String eventAccess;

    @SerializedName("$model")
    @JsonProperty("$model")
    @Tag(7)
    private String model;

    @SerializedName("$multi_user_id")
    @JsonProperty("$multi_user_id")
    @Tag(21)
    private String multiUserId;

    @SerializedName("$oneid")
    @JsonProperty("$oneid")
    @Tag(30)
    private String oneid;

    @SerializedName("$os_version")
    @JsonProperty("$os_version")
    @Tag(9)
    private String osVersion;

    @SerializedName("$osid")
    @JsonProperty("$osid")
    @Tag(31)
    private String osid;

    @SerializedName("$ouid")
    @JsonProperty("$ouid")
    @Tag(3)
    private String ouid;

    @SerializedName("$platform")
    @JsonProperty("$platform")
    @Tag(8)
    private String platform;

    @SerializedName("$post_time")
    @JsonProperty("$post_time")
    @Tag(29)
    private long postTime;

    @SerializedName("$region")
    @JsonProperty("$region")
    @Tag(18)
    private String region;

    @SerializedName("$region_code")
    @JsonProperty("$region_code")
    @Tag(19)
    private String regionCode;

    @SerializedName("$region_mark")
    @JsonProperty("$region_mark")
    @Tag(20)
    private String regionMark;

    @SerializedName("$rom_version")
    @JsonProperty("$rom_version")
    @Tag(10)
    private String romVersion;

    @SerializedName("$sdk_package_name")
    @JsonProperty("$sdk_package_name")
    @Tag(12)
    private String sdkPackageName;

    @SerializedName("$sdk_version")
    @JsonProperty("$sdk_version")
    @Tag(13)
    private String sdkVersion;

    @SerializedName("$track_type")
    @JsonProperty("$track_type")
    @Tag(27)
    private Integer trackType;

    @SerializedName("$user_id")
    @JsonProperty("$user_id")
    @Tag(5)
    private String userId;

    @SerializedName("$valid_callin_pkg")
    @JsonProperty("$valid_callin_pkg")
    @Tag(35)
    private Integer validCallinPkg;

    public Head() {
    }

    public Head(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, Long l2, Integer num, String str26, long j2, String str27, String str28, String str29, String str30, String str31, Integer num2) {
        this.clientType = str;
        this.clientId = str2;
        this.ouid = str3;
        this.duid = str4;
        this.userId = str5;
        this.brand = str6;
        this.model = str7;
        this.platform = str8;
        this.osVersion = str9;
        this.romVersion = str10;
        this.androidVersion = str11;
        this.sdkPackageName = str12;
        this.sdkVersion = str13;
        this.channel = str14;
        this.carrier = str15;
        this.access = str16;
        this.eventAccess = str17;
        this.region = str18;
        this.regionCode = str19;
        this.regionMark = str20;
        this.multiUserId = str21;
        this.appId = str22;
        this.appUuid = str23;
        this.appPackage = str24;
        this.appVersion = str25;
        this.appVersionCode = l2;
        this.trackType = num;
        this.cloudConfigProductVersion = str26;
        this.postTime = j2;
        this.oneid = str27;
        this.osid = str28;
        this.drsPkg = str29;
        this.drsVersionName = str30;
        this.drsVersionCode = str31;
        this.validCallinPkg = num2;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof Head;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Head)) {
            return false;
        }
        Head head = (Head) obj;
        if (!head.canEqual(this) || getPostTime() != head.getPostTime()) {
            return false;
        }
        Long appVersionCode = getAppVersionCode();
        Long appVersionCode2 = head.getAppVersionCode();
        if (appVersionCode != null ? !appVersionCode.equals(appVersionCode2) : appVersionCode2 != null) {
            return false;
        }
        Integer trackType = getTrackType();
        Integer trackType2 = head.getTrackType();
        if (trackType != null ? !trackType.equals(trackType2) : trackType2 != null) {
            return false;
        }
        Integer validCallinPkg = getValidCallinPkg();
        Integer validCallinPkg2 = head.getValidCallinPkg();
        if (validCallinPkg != null ? !validCallinPkg.equals(validCallinPkg2) : validCallinPkg2 != null) {
            return false;
        }
        String clientType = getClientType();
        String clientType2 = head.getClientType();
        if (clientType != null ? !clientType.equals(clientType2) : clientType2 != null) {
            return false;
        }
        String clientId = getClientId();
        String clientId2 = head.getClientId();
        if (clientId != null ? !clientId.equals(clientId2) : clientId2 != null) {
            return false;
        }
        String ouid = getOuid();
        String ouid2 = head.getOuid();
        if (ouid != null ? !ouid.equals(ouid2) : ouid2 != null) {
            return false;
        }
        String duid = getDuid();
        String duid2 = head.getDuid();
        if (duid != null ? !duid.equals(duid2) : duid2 != null) {
            return false;
        }
        String userId = getUserId();
        String userId2 = head.getUserId();
        if (userId != null ? !userId.equals(userId2) : userId2 != null) {
            return false;
        }
        String brand = getBrand();
        String brand2 = head.getBrand();
        if (brand != null ? !brand.equals(brand2) : brand2 != null) {
            return false;
        }
        String model = getModel();
        String model2 = head.getModel();
        if (model != null ? !model.equals(model2) : model2 != null) {
            return false;
        }
        String platform = getPlatform();
        String platform2 = head.getPlatform();
        if (platform != null ? !platform.equals(platform2) : platform2 != null) {
            return false;
        }
        String osVersion = getOsVersion();
        String osVersion2 = head.getOsVersion();
        if (osVersion != null ? !osVersion.equals(osVersion2) : osVersion2 != null) {
            return false;
        }
        String romVersion = getRomVersion();
        String romVersion2 = head.getRomVersion();
        if (romVersion != null ? !romVersion.equals(romVersion2) : romVersion2 != null) {
            return false;
        }
        String androidVersion = getAndroidVersion();
        String androidVersion2 = head.getAndroidVersion();
        if (androidVersion != null ? !androidVersion.equals(androidVersion2) : androidVersion2 != null) {
            return false;
        }
        String sdkPackageName = getSdkPackageName();
        String sdkPackageName2 = head.getSdkPackageName();
        if (sdkPackageName != null ? !sdkPackageName.equals(sdkPackageName2) : sdkPackageName2 != null) {
            return false;
        }
        String sdkVersion = getSdkVersion();
        String sdkVersion2 = head.getSdkVersion();
        if (sdkVersion != null ? !sdkVersion.equals(sdkVersion2) : sdkVersion2 != null) {
            return false;
        }
        String channel = getChannel();
        String channel2 = head.getChannel();
        if (channel != null ? !channel.equals(channel2) : channel2 != null) {
            return false;
        }
        String carrier = getCarrier();
        String carrier2 = head.getCarrier();
        if (carrier != null ? !carrier.equals(carrier2) : carrier2 != null) {
            return false;
        }
        String access = getAccess();
        String access2 = head.getAccess();
        if (access != null ? !access.equals(access2) : access2 != null) {
            return false;
        }
        String eventAccess = getEventAccess();
        String eventAccess2 = head.getEventAccess();
        if (eventAccess != null ? !eventAccess.equals(eventAccess2) : eventAccess2 != null) {
            return false;
        }
        String region = getRegion();
        String region2 = head.getRegion();
        if (region != null ? !region.equals(region2) : region2 != null) {
            return false;
        }
        String regionCode = getRegionCode();
        String regionCode2 = head.getRegionCode();
        if (regionCode != null ? !regionCode.equals(regionCode2) : regionCode2 != null) {
            return false;
        }
        String regionMark = getRegionMark();
        String regionMark2 = head.getRegionMark();
        if (regionMark != null ? !regionMark.equals(regionMark2) : regionMark2 != null) {
            return false;
        }
        String multiUserId = getMultiUserId();
        String multiUserId2 = head.getMultiUserId();
        if (multiUserId != null ? !multiUserId.equals(multiUserId2) : multiUserId2 != null) {
            return false;
        }
        String appId = getAppId();
        String appId2 = head.getAppId();
        if (appId != null ? !appId.equals(appId2) : appId2 != null) {
            return false;
        }
        String appUuid = getAppUuid();
        String appUuid2 = head.getAppUuid();
        if (appUuid != null ? !appUuid.equals(appUuid2) : appUuid2 != null) {
            return false;
        }
        String appPackage = getAppPackage();
        String appPackage2 = head.getAppPackage();
        if (appPackage != null ? !appPackage.equals(appPackage2) : appPackage2 != null) {
            return false;
        }
        String appVersion = getAppVersion();
        String appVersion2 = head.getAppVersion();
        if (appVersion != null ? !appVersion.equals(appVersion2) : appVersion2 != null) {
            return false;
        }
        String cloudConfigProductVersion = getCloudConfigProductVersion();
        String cloudConfigProductVersion2 = head.getCloudConfigProductVersion();
        if (cloudConfigProductVersion != null ? !cloudConfigProductVersion.equals(cloudConfigProductVersion2) : cloudConfigProductVersion2 != null) {
            return false;
        }
        String oneid = getOneid();
        String oneid2 = head.getOneid();
        if (oneid != null ? !oneid.equals(oneid2) : oneid2 != null) {
            return false;
        }
        String osid = getOsid();
        String osid2 = head.getOsid();
        if (osid != null ? !osid.equals(osid2) : osid2 != null) {
            return false;
        }
        String drsPkg = getDrsPkg();
        String drsPkg2 = head.getDrsPkg();
        if (drsPkg != null ? !drsPkg.equals(drsPkg2) : drsPkg2 != null) {
            return false;
        }
        String drsVersionName = getDrsVersionName();
        String drsVersionName2 = head.getDrsVersionName();
        if (drsVersionName != null ? !drsVersionName.equals(drsVersionName2) : drsVersionName2 != null) {
            return false;
        }
        String drsVersionCode = getDrsVersionCode();
        String drsVersionCode2 = head.getDrsVersionCode();
        return drsVersionCode != null ? drsVersionCode.equals(drsVersionCode2) : drsVersionCode2 == null;
    }

    public String getAccess() {
        return this.access;
    }

    public String getAndroidVersion() {
        return this.androidVersion;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppPackage() {
        return this.appPackage;
    }

    public String getAppUuid() {
        return this.appUuid;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public Long getAppVersionCode() {
        return this.appVersionCode;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getClientType() {
        return this.clientType;
    }

    public String getCloudConfigProductVersion() {
        return this.cloudConfigProductVersion;
    }

    public String getDrsPkg() {
        return this.drsPkg;
    }

    public String getDrsVersionCode() {
        return this.drsVersionCode;
    }

    public String getDrsVersionName() {
        return this.drsVersionName;
    }

    public String getDuid() {
        return this.duid;
    }

    public String getEventAccess() {
        return this.eventAccess;
    }

    public String getModel() {
        return this.model;
    }

    public String getMultiUserId() {
        return this.multiUserId;
    }

    public String getOneid() {
        return this.oneid;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getOsid() {
        return this.osid;
    }

    public String getOuid() {
        return this.ouid;
    }

    public String getPlatform() {
        return this.platform;
    }

    public long getPostTime() {
        return this.postTime;
    }

    public String getRegion() {
        return this.region;
    }

    public String getRegionCode() {
        return this.regionCode;
    }

    public String getRegionMark() {
        return this.regionMark;
    }

    public String getRomVersion() {
        return this.romVersion;
    }

    public String getSdkPackageName() {
        return this.sdkPackageName;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public Integer getTrackType() {
        return this.trackType;
    }

    public String getUserId() {
        return this.userId;
    }

    public Integer getValidCallinPkg() {
        return this.validCallinPkg;
    }

    public int hashCode() {
        long postTime = getPostTime();
        Long appVersionCode = getAppVersionCode();
        int iHashCode = ((((int) (postTime ^ (postTime >>> 32))) + 59) * 59) + (appVersionCode == null ? 43 : appVersionCode.hashCode());
        Integer trackType = getTrackType();
        int iHashCode2 = (iHashCode * 59) + (trackType == null ? 43 : trackType.hashCode());
        Integer validCallinPkg = getValidCallinPkg();
        int iHashCode3 = (iHashCode2 * 59) + (validCallinPkg == null ? 43 : validCallinPkg.hashCode());
        String clientType = getClientType();
        int iHashCode4 = (iHashCode3 * 59) + (clientType == null ? 43 : clientType.hashCode());
        String clientId = getClientId();
        int iHashCode5 = (iHashCode4 * 59) + (clientId == null ? 43 : clientId.hashCode());
        String ouid = getOuid();
        int iHashCode6 = (iHashCode5 * 59) + (ouid == null ? 43 : ouid.hashCode());
        String duid = getDuid();
        int iHashCode7 = (iHashCode6 * 59) + (duid == null ? 43 : duid.hashCode());
        String userId = getUserId();
        int iHashCode8 = (iHashCode7 * 59) + (userId == null ? 43 : userId.hashCode());
        String brand = getBrand();
        int iHashCode9 = (iHashCode8 * 59) + (brand == null ? 43 : brand.hashCode());
        String model = getModel();
        int iHashCode10 = (iHashCode9 * 59) + (model == null ? 43 : model.hashCode());
        String platform = getPlatform();
        int iHashCode11 = (iHashCode10 * 59) + (platform == null ? 43 : platform.hashCode());
        String osVersion = getOsVersion();
        int iHashCode12 = (iHashCode11 * 59) + (osVersion == null ? 43 : osVersion.hashCode());
        String romVersion = getRomVersion();
        int iHashCode13 = (iHashCode12 * 59) + (romVersion == null ? 43 : romVersion.hashCode());
        String androidVersion = getAndroidVersion();
        int iHashCode14 = (iHashCode13 * 59) + (androidVersion == null ? 43 : androidVersion.hashCode());
        String sdkPackageName = getSdkPackageName();
        int iHashCode15 = (iHashCode14 * 59) + (sdkPackageName == null ? 43 : sdkPackageName.hashCode());
        String sdkVersion = getSdkVersion();
        int iHashCode16 = (iHashCode15 * 59) + (sdkVersion == null ? 43 : sdkVersion.hashCode());
        String channel = getChannel();
        int iHashCode17 = (iHashCode16 * 59) + (channel == null ? 43 : channel.hashCode());
        String carrier = getCarrier();
        int iHashCode18 = (iHashCode17 * 59) + (carrier == null ? 43 : carrier.hashCode());
        String access = getAccess();
        int iHashCode19 = (iHashCode18 * 59) + (access == null ? 43 : access.hashCode());
        String eventAccess = getEventAccess();
        int iHashCode20 = (iHashCode19 * 59) + (eventAccess == null ? 43 : eventAccess.hashCode());
        String region = getRegion();
        int iHashCode21 = (iHashCode20 * 59) + (region == null ? 43 : region.hashCode());
        String regionCode = getRegionCode();
        int iHashCode22 = (iHashCode21 * 59) + (regionCode == null ? 43 : regionCode.hashCode());
        String regionMark = getRegionMark();
        int iHashCode23 = (iHashCode22 * 59) + (regionMark == null ? 43 : regionMark.hashCode());
        String multiUserId = getMultiUserId();
        int iHashCode24 = (iHashCode23 * 59) + (multiUserId == null ? 43 : multiUserId.hashCode());
        String appId = getAppId();
        int iHashCode25 = (iHashCode24 * 59) + (appId == null ? 43 : appId.hashCode());
        String appUuid = getAppUuid();
        int iHashCode26 = (iHashCode25 * 59) + (appUuid == null ? 43 : appUuid.hashCode());
        String appPackage = getAppPackage();
        int iHashCode27 = (iHashCode26 * 59) + (appPackage == null ? 43 : appPackage.hashCode());
        String appVersion = getAppVersion();
        int iHashCode28 = (iHashCode27 * 59) + (appVersion == null ? 43 : appVersion.hashCode());
        String cloudConfigProductVersion = getCloudConfigProductVersion();
        int iHashCode29 = (iHashCode28 * 59) + (cloudConfigProductVersion == null ? 43 : cloudConfigProductVersion.hashCode());
        String oneid = getOneid();
        int iHashCode30 = (iHashCode29 * 59) + (oneid == null ? 43 : oneid.hashCode());
        String osid = getOsid();
        int iHashCode31 = (iHashCode30 * 59) + (osid == null ? 43 : osid.hashCode());
        String drsPkg = getDrsPkg();
        int iHashCode32 = (iHashCode31 * 59) + (drsPkg == null ? 43 : drsPkg.hashCode());
        String drsVersionName = getDrsVersionName();
        int i = iHashCode32 * 59;
        int iHashCode33 = drsVersionName == null ? 43 : drsVersionName.hashCode();
        String drsVersionCode = getDrsVersionCode();
        return ((i + iHashCode33) * 59) + (drsVersionCode != null ? drsVersionCode.hashCode() : 43);
    }

    @JsonProperty("$access")
    public Head setAccess(String str) {
        this.access = str;
        return this;
    }

    @JsonProperty("$android_version")
    public Head setAndroidVersion(String str) {
        this.androidVersion = str;
        return this;
    }

    @JsonProperty("$app_id")
    public Head setAppId(String str) {
        this.appId = str;
        return this;
    }

    @JsonProperty("$app_package")
    public Head setAppPackage(String str) {
        this.appPackage = str;
        return this;
    }

    @JsonProperty("$app_uuid")
    public Head setAppUuid(String str) {
        this.appUuid = str;
        return this;
    }

    @JsonProperty("$app_version")
    public Head setAppVersion(String str) {
        this.appVersion = str;
        return this;
    }

    @JsonProperty("$app_version_code")
    public Head setAppVersionCode(Long l2) {
        this.appVersionCode = l2;
        return this;
    }

    @JsonProperty("$brand")
    public Head setBrand(String str) {
        this.brand = str;
        return this;
    }

    @JsonProperty("$carrier")
    public Head setCarrier(String str) {
        this.carrier = str;
        return this;
    }

    @JsonProperty("$channel")
    public Head setChannel(String str) {
        this.channel = str;
        return this;
    }

    @JsonProperty("$client_id")
    public Head setClientId(String str) {
        this.clientId = str;
        return this;
    }

    @JsonProperty("$client_type")
    public Head setClientType(String str) {
        this.clientType = str;
        return this;
    }

    @JsonProperty("$cloud_config_product_version")
    public Head setCloudConfigProductVersion(String str) {
        this.cloudConfigProductVersion = str;
        return this;
    }

    @JsonProperty("$drs_pkg")
    public Head setDrsPkg(String str) {
        this.drsPkg = str;
        return this;
    }

    @JsonProperty("$drs_version_code")
    public Head setDrsVersionCode(String str) {
        this.drsVersionCode = str;
        return this;
    }

    @JsonProperty("$drs_version_name")
    public Head setDrsVersionName(String str) {
        this.drsVersionName = str;
        return this;
    }

    @JsonProperty("$duid")
    public Head setDuid(String str) {
        this.duid = str;
        return this;
    }

    @JsonProperty("$event_access")
    public Head setEventAccess(String str) {
        this.eventAccess = str;
        return this;
    }

    @JsonProperty("$model")
    public Head setModel(String str) {
        this.model = str;
        return this;
    }

    @JsonProperty("$multi_user_id")
    public Head setMultiUserId(String str) {
        this.multiUserId = str;
        return this;
    }

    @JsonProperty("$oneid")
    public Head setOneid(String str) {
        this.oneid = str;
        return this;
    }

    @JsonProperty("$os_version")
    public Head setOsVersion(String str) {
        this.osVersion = str;
        return this;
    }

    @JsonProperty("$osid")
    public Head setOsid(String str) {
        this.osid = str;
        return this;
    }

    @JsonProperty("$ouid")
    public Head setOuid(String str) {
        this.ouid = str;
        return this;
    }

    @JsonProperty("$platform")
    public Head setPlatform(String str) {
        this.platform = str;
        return this;
    }

    @JsonProperty("$post_time")
    public Head setPostTime(long j2) {
        this.postTime = j2;
        return this;
    }

    @JsonProperty("$region")
    public Head setRegion(String str) {
        this.region = str;
        return this;
    }

    @JsonProperty("$region_code")
    public Head setRegionCode(String str) {
        this.regionCode = str;
        return this;
    }

    @JsonProperty("$region_mark")
    public Head setRegionMark(String str) {
        this.regionMark = str;
        return this;
    }

    @JsonProperty("$rom_version")
    public Head setRomVersion(String str) {
        this.romVersion = str;
        return this;
    }

    @JsonProperty("$sdk_package_name")
    public Head setSdkPackageName(String str) {
        this.sdkPackageName = str;
        return this;
    }

    @JsonProperty("$sdk_version")
    public Head setSdkVersion(String str) {
        this.sdkVersion = str;
        return this;
    }

    @JsonProperty("$track_type")
    public Head setTrackType(Integer num) {
        this.trackType = num;
        return this;
    }

    @JsonProperty("$user_id")
    public Head setUserId(String str) {
        this.userId = str;
        return this;
    }

    @JsonProperty("$valid_callin_pkg")
    public Head setValidCallinPkg(Integer num) {
        this.validCallinPkg = num;
        return this;
    }

    public String toString() {
        return "Head(clientType=" + getClientType() + ", clientId=" + getClientId() + ", ouid=" + getOuid() + ", duid=" + getDuid() + ", userId=" + getUserId() + ", brand=" + getBrand() + ", model=" + getModel() + ", platform=" + getPlatform() + ", osVersion=" + getOsVersion() + ", romVersion=" + getRomVersion() + ", androidVersion=" + getAndroidVersion() + ", sdkPackageName=" + getSdkPackageName() + ", sdkVersion=" + getSdkVersion() + ", channel=" + getChannel() + ", carrier=" + getCarrier() + ", access=" + getAccess() + ", eventAccess=" + getEventAccess() + ", region=" + getRegion() + ", regionCode=" + getRegionCode() + ", regionMark=" + getRegionMark() + ", multiUserId=" + getMultiUserId() + ", appId=" + getAppId() + ", appUuid=" + getAppUuid() + ", appPackage=" + getAppPackage() + ", appVersion=" + getAppVersion() + ", appVersionCode=" + getAppVersionCode() + ", trackType=" + getTrackType() + ", cloudConfigProductVersion=" + getCloudConfigProductVersion() + ", postTime=" + getPostTime() + ", oneid=" + getOneid() + ", osid=" + getOsid() + ", drsPkg=" + getDrsPkg() + ", drsVersionName=" + getDrsVersionName() + ", drsVersionCode=" + getDrsVersionCode() + ", validCallinPkg=" + getValidCallinPkg() + ")";
    }
}
