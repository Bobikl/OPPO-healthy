package com.heytap.nearx.tangramconfig.strategy;

import com.heytap.nearx.tangramconfig.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b?\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/heytap/nearx/tangramconfig/strategy/Fields;", "", "()V", "ADG_FIELD", "", "ANDROID_VERSION_FIELD", "BACKOFF_FIELD", "BUILD_NUMBER_FIELD", "CHANNEL_ID_FIELD", "COMMONCONDITIONS_FIELD", "CONFIGDATAS_FIELD", "CONFIGURL_FIELD", "CONFIG_CODE", "CONFIG_CODE_FIELD", "CONFIG_DATAS", "CONFIG_FILE_SIZE", "CONFIG_MAX_VERSION", "CONFIG_URL", "CONTENT", "CUSTOMMAP_FIELD", "DUID_FIELD", "ERROR_CACHE_CODE_KEY", "ERROR_CACHE_MESSAGE_KEY", "ERROR_CACHE_TIME_KEY", "EXTRA_PARAMS_FIELD", "FILETYPE_FEILD", "FILE_TYPE", "FORCE_KIT_IF_KIT_FIELD", "GUID_FIELD", "HEIGHT_FIELD", "HOST_APP_PKG", "HOST_URL_FIELD", "IMEI_FIELD", "MATCHCONDITIONS_FIELD", "MAX_REQ_PRODUCT_FIELD", "MIN_KIT_VERSION_FIELD", "MIN_SDK_VERSION_FIELD", "MODEL_FIELD", "OS_VERSION_FIELD", "OUID_FIELD", "PACKAGE_NAME_FIELD", "PLATFORM_ANDROID_VERSION_FIELD", "PLATFORM_BRAND_FIELD", "PLATFORM_OS_VERSION_FIELD", "PREVIEW_FIELD", "PROCESS_NAME_FIELD", "PRODUCT_ID", "PRODUCT_ID_FIELD", "PRODUCT_MAX_VERSION", "PRODUCT_MAX_VERSION_FIELD", "REGION_CODE_FIELD", "SDK_VERSION", "SDK_VERSION_CODE_FIELD", "SP_KEY", "SP_KEY_FIELD", "SP_KITCONFIG_FIELD", "SP_STRATEGY_FIELD", "STRATEGY_MODE_FIELD", "SYNC_DYNC_CONFIG_INTERVAL_FIELD", "SYNC_KIT_CFG_INTERVAL_FIELD", "SYNC_KIT_CFG_SCATTER_FIELD", "SYNC_SDK_CFG_INTERVAL_FIELD", "VALID_REQ_PERIOD_FIELD", "VERSION_CODE", "VERSION_CODE_FIELD", "VERSION_NAME_FIELD", "WIDTH_FIELD", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class Fields {

    @NotNull
    public static final String ADG_FIELD = "adg";

    @NotNull
    public static final String ANDROID_VERSION_FIELD = "android_version";

    @NotNull
    public static final String BACKOFF_FIELD = "backoff";

    @NotNull
    public static final String BUILD_NUMBER_FIELD = "build_number";

    @NotNull
    public static final String CHANNEL_ID_FIELD = "channel_id";

    @NotNull
    public static final String COMMONCONDITIONS_FIELD = "CommonSystemCondition";

    @NotNull
    public static final String CONFIGDATAS_FIELD = "ConfigDatas";

    @NotNull
    public static final String CONFIGURL_FIELD = "ConfigUrl";

    @NotNull
    public static final String CONFIG_CODE = "configCode";

    @NotNull
    public static final String CONFIG_CODE_FIELD = "ConfigCode";

    @NotNull
    public static final String CONFIG_DATAS = "configDatas";

    @NotNull
    public static final String CONFIG_FILE_SIZE = "configFileSize";

    @NotNull
    public static final String CONFIG_MAX_VERSION = "configMaxVersion";

    @NotNull
    public static final String CONFIG_URL = "configUrl";

    @NotNull
    public static final String CONTENT = "content";

    @NotNull
    public static final String CUSTOMMAP_FIELD = "CustomMap";

    @NotNull
    public static final String DUID_FIELD = "duid";

    @NotNull
    public static final String ERROR_CACHE_CODE_KEY = "error_cache_code";

    @NotNull
    public static final String ERROR_CACHE_MESSAGE_KEY = "error_cache_message";

    @NotNull
    public static final String ERROR_CACHE_TIME_KEY = "error_cache_time";

    @NotNull
    public static final String EXTRA_PARAMS_FIELD = "ExtraParams";

    @NotNull
    public static final String FILETYPE_FEILD = "FileType";

    @NotNull
    public static final String FILE_TYPE = "fileType";

    @NotNull
    public static final String FORCE_KIT_IF_KIT_FIELD = "forceKitIfKit";

    @NotNull
    public static final String GUID_FIELD = "guid";

    @NotNull
    public static final String HEIGHT_FIELD = "height";

    @NotNull
    public static final String HOST_APP_PKG = "hostAppPkg";

    @NotNull
    public static final String HOST_URL_FIELD = "hostUrl";

    @NotNull
    public static final String IMEI_FIELD = "imei";

    @NotNull
    public static final Fields INSTANCE = new Fields();

    @NotNull
    public static final String MATCHCONDITIONS_FIELD = "MatchConditions";

    @NotNull
    public static final String MAX_REQ_PRODUCT_FIELD = "maxReqProduct";

    @NotNull
    public static final String MIN_KIT_VERSION_FIELD = "minKitVersion";

    @NotNull
    public static final String MIN_SDK_VERSION_FIELD = "minSDKVersion";

    @NotNull
    public static final String MODEL_FIELD = "model";

    @NotNull
    public static final String OS_VERSION_FIELD = "os_version";

    @NotNull
    public static final String OUID_FIELD = "ouid";

    @NotNull
    public static final String PACKAGE_NAME_FIELD = "package_name";

    @NotNull
    public static final String PLATFORM_ANDROID_VERSION_FIELD = "platform_android_version";

    @NotNull
    public static final String PLATFORM_BRAND_FIELD = "platform_brand";

    @NotNull
    public static final String PLATFORM_OS_VERSION_FIELD = "platform_os_version";

    @NotNull
    public static final String PREVIEW_FIELD = "preview";

    @NotNull
    public static final String PROCESS_NAME_FIELD = "processName";

    @NotNull
    public static final String PRODUCT_ID = "productId";

    @NotNull
    public static final String PRODUCT_ID_FIELD = "ProductId";

    @NotNull
    public static final String PRODUCT_MAX_VERSION = "productMaxVersion";

    @NotNull
    public static final String PRODUCT_MAX_VERSION_FIELD = "ProductMaxVersion";

    @NotNull
    public static final String REGION_CODE_FIELD = "regionCode";

    @NotNull
    public static final String SDK_VERSION = "sdkVersion";

    @NotNull
    public static final String SDK_VERSION_CODE_FIELD = "SdkVersionCode";

    @NotNull
    public static final String SP_KEY = "spkey";

    @NotNull
    public static final String SP_KEY_FIELD = "spkey";

    @NotNull
    public static final String SP_KITCONFIG_FIELD = "kitconfig";

    @NotNull
    public static final String SP_STRATEGY_FIELD = "strategy";

    @NotNull
    public static final String STRATEGY_MODE_FIELD = "strategyMode";

    @NotNull
    public static final String SYNC_DYNC_CONFIG_INTERVAL_FIELD = "dynCfgInterval";

    @NotNull
    public static final String SYNC_KIT_CFG_INTERVAL_FIELD = "kitInterval";

    @NotNull
    public static final String SYNC_KIT_CFG_SCATTER_FIELD = "kitScatter";

    @NotNull
    public static final String SYNC_SDK_CFG_INTERVAL_FIELD = "sdkInterval";

    @NotNull
    public static final String VALID_REQ_PERIOD_FIELD = "validReqPeriod";

    @NotNull
    public static final String VERSION_CODE = "versionCode";

    @NotNull
    public static final String VERSION_CODE_FIELD = "version_code";

    @NotNull
    public static final String VERSION_NAME_FIELD = "versionName";

    @NotNull
    public static final String WIDTH_FIELD = "width";

    private Fields() {
    }
}
