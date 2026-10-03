package com.oplus.aiunit.vision;

import com.heytap.health.base.reflect.ReflectException;

/* JADX INFO: loaded from: classes15.dex */
public interface y80 {
    public static final String pn = b78.a().getPackageName();
    public static final boolean DEBUG = ((Boolean) get("DEBUG")).booleanValue();
    public static final String BUILD_TYPE = (String) get("BUILD_TYPE");
    public static final String VERSION_NAME = (String) get("VERSION_NAME");
    public static final int VERSION_CODE = ((Integer) get("VERSION_CODE")).intValue();
    public static final String STATIC_KEY = (String) get("STATIC_KEY");
    public static final String DYNAMIC_KEY = (String) get("DYNAMIC_KEY");
    public static final String HW_KEY = (String) get("hwkey");
    public static final String GOAL_KEY = (String) get("goalkey");
    public static final String SDK_CALLER_LIST = (String) get("sdkCallerList");
    public static final String OPEN_ID_SIGN_KEY = (String) get("openIdSignKey");
    public static final String DB_KEY = (String) get("dbkey");
    public static final String APP_SIGNATURE = (String) get("appSignature");
    public static final String APP_SIGNATURE_R = (String) get("appSignatureR");
    public static final String APP_SIGNATURE_R_N = (String) get("appSignatureR_N");
    public static final String HTTP_SECRET = (String) get("httpSecret");
    public static final String EXCHANGE_KEY_RSA_PUB_KEY = (String) get("exchangeKeyRsaPubKey");
    public static final String VERSION_NAME_SHORT = (String) get("versionNameShort");
    public static final String APP_ID = (String) get("appid");
    public static final String APP_ID_FOR_FRIEND_QR = (String) get("appIdForFriendQR");
    public static final String HTTP_SECRET_FOR_FRIEND_QR = (String) get("httpSecretForFriendQR");
    public static final String PAY_APP_KEY = (String) get("payAppKey");
    public static final String MSP_APP_ID = (String) get("mspAppID");
    public static final String MSP_APP_KEY = (String) get("mspAppKey");
    public static final String MSP_APP_SECRET = (String) get("mspAppSecret");
    public static final String MSP_TEST_APP_ID = (String) get("mspTestAppID");
    public static final String MSP_TEST_APP_KEY = (String) get("mspTestAppKey");
    public static final String MSP_TEST_APP_SECRET = (String) get("mspTestAppSecret");
    public static final String SNORE_FILE_RES_PORTAL = (String) get("snoreFileResPortal");
    public static final String MSP_APP_BUSINESS_ID = (String) get("mspAppBusinessID");
    public static final String VERIFY_CLEAR_CLOUD = (String) get("verifyClearCloud");
    public static final String VERIFY_CLEAR_CLOUD_OPEN = (String) get("verifyClearCloudOpen");
    public static final String VERIFY_DELETE_HEALTH_RECORD = (String) get("verifyDeleteHealthRecord");
    public static final String VERIFY_DELETE_HEALTH_RECORD_OPEN = (String) get("verifyDeleteHealthRecordOpen");
    public static final String VERIFY_DELETE_ACCOUNT = (String) get("verifyDeleteAccount");
    public static final String VERIFY_DELETE_ACCOUNT_OPEN = (String) get("verifyDeleteAccountOpen");
    public static final String VERIFY_FIND_WATCH = (String) get("findWatch");
    public static final String VERIFY_FIND_WATCH_OPEN = (String) get("findWatchOpen");
    public static final String VERIFY_ACCOUNT_TICKET_OPPO = (String) get("accountTicketOPPO");
    public static final String VERIFY_ACCOUNT_TICKET_OPEN = (String) get("accountTicketOpen");
    public static final String MSP_APP_BUSINESS_ID_TEST = (String) get("mspAppBusinessIDTest");
    public static final String VERIFY_CLEAR_CLOUD_TEST = (String) get("verifyClearCloudTest");
    public static final String VERIFY_DELETE_HEALTH_RECORD_TEST = (String) get("verifyDeleteHealthRecordTest");
    public static final String VERIFY_DELETE_ACCOUNT_TEST = (String) get("verifyDeleteAccountTest");
    public static final String VERIFY_FIND_WATCH_TEST = (String) get("findWatchTest");
    public static final String VERIFY_FIND_WATCH_OPEN_TEST = (String) get("findWatchOpenTest");
    public static final String VERIFY_ACCOUNT_TICKET_OPPO_TEST = (String) get("accountTicketOPPOTest");
    public static final String VERIFY_ACCOUNT_TICKET_OPEN_TEST = (String) get("accountTicketOpenTest");
    public static final String TTS_ENGINE_APP_ID = (String) get("ttsEngineAppId");
    public static final String TTS_ENGINE_APP_KEY = (String) get("ttsEngineAppKey");
    public static final String TTS_ENGINE_SHA_KEY = (String) get("ttsEngineShaKey");
    public static final String TTS_ENGINE_SIGNATURE = (String) get("ttsEngineSignature");
    public static final String WF_RES_KEY_DEBUG = (String) get("wfResKeyDebug");
    public static final String WF_RES_KEY_RELEASE = (String) get("wfResKeyRelease");
    public static final String WF_REQUEST_KEY_DEBUG = (String) get("wfRequestKeyDebug");
    public static final String WF_REQUEST_KEY_RELEASE = (String) get("wfRequestKeyRelease");
    public static final String WF_PAY_KEY_DEBUG = (String) get("wfPayKeyDebug");
    public static final String WF_PAY_KEY_RELEASE = (String) get("wfPayKeyRelease");
    public static final String STORE_APP_ID = (String) get("storeAppId");
    public static final String HEALTH_WECHAT_APP_ID = (String) get("healthWechatAppId");
    public static final String HEALTH_QQ_APP_ID = (String) get("healthQQAppId");
    public static final String HEALTH_DOUYIN_CLIENT_KEY = (String) get("healthDouyinClientKey");
    public static final String HEALTH_XHS_APP_KEY = (String) get("healthXhsAppKey");
    public static final String PUSH_APP_ID_OPPO = (String) get("pushAppIdOppo");
    public static final String PUSH_APP_KEY_OPPO = (String) get("pushAppKeyOppo");
    public static final String PUSH_APP_SECRET_OPPO = (String) get("pushAppSecretOppo");
    public static final String PUSH_APP_ID_MI = (String) get("pushAppIdMi");
    public static final String PUSH_APP_KEY_MI = (String) get("pushAppKeyMi");
    public static final String PUSH_APP_SECRET_MI = (String) get("pushAppSecretMi");
    public static final String PUSH_APP_ID_VIVO = (String) get("pushAppIdVivo");
    public static final String PUSH_APP_KEY_VIVO = (String) get("pushAppKeyVivo");
    public static final String PUSH_APP_SECRET_VIVO = (String) get("pushAppSecretVivo");
    public static final String PUSH_APP_ID_HW = (String) get("pushAppIdHW");
    public static final String PUSH_APP_CLIENT_ID_HW = (String) get("pushClientIDHW");
    public static final String PUSH_APP_SECRET_HW = (String) get("pushAppSecretHW");
    public static final String OMRON_APPKEY = (String) get("omron_appKey");
    public static final String OMRON_EKIKEY = (String) get("omron_ekiKey");
    public static final String SPORT_RECORD_FILE_KEY = (String) get("sportRecordFileKey");
    public static final String BLOOD_PRESSURE_DEVICE_SN_KEY = (String) get("bloodPressureDeviceSnKey");
    public static final String DM_CHARACTERS = (String) get("dm_characters");
    public static final String OMAS_ACCESS_KEY = (String) get("omasAccessKey");
    public static final String OMAS_WB_ID = (String) get("omasWbId");
    public static final String OMAS_WB_KEY_ID = (String) get("omasWbKeyId");
    public static final String ESIM_APP_ID = (String) get("eSIMAppId");
    public static final String ESIM_APP_KEY = (String) get("eSIMAppKey");
    public static final String ESIM_TMP_CLOUD_PUBLIC_KEY = (String) get("eSimTmpCloudPublicKey");
    public static final String ESIM_TMP_CLOUD_PRIVATE_KEY = (String) get("eSimTmpCloudPrivateKey");
    public static final String LOGKIT_PUB_KEY = (String) get("logkitPubKey");
    public static final String APP_STORE_OAK = (String) get("app_store_oak");
    public static final String APP_STORE_SECRET = (String) get("app_store_secret");
    public static final String APP_STORE_KEY = (String) get("app_store_key");

    static <T> T get(String str) {
        try {
            return (T) ikf.p(pn + ".BuildConfig").g(str).j();
        } catch (ReflectException unused) {
            a7b.b("AppConfigUtils", str + " not found!!!");
            return "not_found";
        }
    }
}
