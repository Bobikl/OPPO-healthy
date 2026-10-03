package com.oplus.aiunit.vision;

import com.amap.api.services.core.AMapException;

/* JADX INFO: loaded from: classes11.dex */
public interface f04 {
    public static final String ACTION_ICCOA_SERVICE = "org.iccoa.android.digitalkey.action.BIND_ICCOA_SERVICE";
    public static final String ACTION_USER_STATEMENT = "oplus.intent.action.CarDigitalKey.USER_STATEMENT";
    public static final int ERROR_CODE_ACCOUNT_NOT_LOGIN = 30004;
    public static final int ERROR_CODE_APPLET_BUSY = 30003;
    public static final int ERROR_CODE_BLUETOOTH_CONNECTION_FAILED = 30001;
    public static final int ERROR_CODE_BLUETOOTH_CONNECTION_IS_DISCONNECTED = 30002;
    public static final int ERROR_CODE_BLUETOOTH_INTERACTIVE_MESSAGE_RETURNS_ERROR_CODE = 20014;
    public static final int ERROR_CODE_BLUETOOTH_UNAVAILABLE = 20013;
    public static final int ERROR_CODE_DEVICE_UNSUPPORTED = 20010;
    public static final int ERROR_CODE_FRIEND_KEY_HAS_EXPIRED = 20104;
    public static final int ERROR_CODE_ILLEGAL_ARGUMENT = 20000;
    public static final int ERROR_CODE_IN_PROGRESS = 20001;
    public static final int ERROR_CODE_KEY_FUNCTION_ACTIVATED = 20103;
    public static final int ERROR_CODE_KEY_FUNCTION_IS_NOT_ENABLED = 20102;
    public static final int ERROR_CODE_KEY_NOT_EXIST = 20100;
    public static final int ERROR_CODE_KEY_UNAVAILABLE = 20101;
    public static final int ERROR_CODE_MODEL_NOT_SUPPORT = 20103;
    public static final int ERROR_CODE_NETWORK_UNAVAILABLE = 20012;
    public static final int ERROR_CODE_NOT_AGREEING_USER_AGREEMENT = 20022;
    public static final int ERROR_CODE_NOT_AUTHED = 20020;
    public static final int ERROR_CODE_PERMISSION_DENY = 20021;
    public static final int ERROR_CODE_SUCCESS = 0;
    public static final int ERROR_CODE_TIMEOUT = 20002;
    public static final int ERROR_CODE_UNKNOWN_ERROR = -1;
    public static final int ERROR_CODE_VERSION_UNSUPPORTED = 20011;
    public static final int ERROR_REMOTE_SERVICE_DISCONNECTED = 20105;
    public static final String EXTRA_DIGITAL_KEY_DATA = "EXTRA_DIGITAL_KEY_DATA";
    public static final String EXTRA_DIGITAL_KEY_ERROR_CODE = "EXTRA_DIGITAL_KEY_ERROR_CODE";
    public static final String EXTRA_DIGITAL_KEY_ERROR_MESSAGE = "EXTRA_DIGITAL_KEY_ERROR_MESSAGE";
    public static final String JSON_KEY_APP_NAME = "appName";
    public static final String JSON_KEY_APP_PACKAGE_NAME = "appPackageName";
    public static final String JSON_KEY_APP_SECRET = "appSecret";
    public static final String JSON_KEY_DIGITAL_KEY_END_TIME = "endDate";
    public static final String JSON_KEY_DIGITAL_KEY_ID = "keyID";
    public static final String JSON_KEY_DIGITAL_KEY_PRIVILEGE = "keyPrivilege";
    public static final String JSON_KEY_DIGITAL_KEY_START_TIME = "startDate";
    public static final String JSON_KEY_DIGITAL_KEY_STATUS = "status";
    public static final String JSON_KEY_DIGITAL_KEY_TYPE = "keyType";
    public static final String JSON_KEY_PAIR_CODE = "pairingCode";
    public static final String JSON_KEY_RESULT_CODE = "resultCode";
    public static final String JSON_KEY_RESULT_DATA = "data";
    public static final String JSON_KEY_RESULT_MSG = "resultMsg";
    public static final String JSON_KEY_RKE_ACTION_TYPE = "actionType";
    public static final String JSON_KEY_RKE_CONTROL_DATA = "controlData";
    public static final String JSON_KEY_RKE_IS_ENCRYPT = "encrypt";
    public static final String JSON_KEY_SHARING_URL = "sharingUrl";
    public static final String JSON_KEY_SP_ID = "spId";
    public static final String JSON_KEY_VEHICLE_CONNECTION_STATUS = "status";
    public static final String JSON_KEY_VEHICLE_ID = "vehicleID";
    public static final String KEY_ACTION = "action";
    public static final String KEY_ACTION_ID = "actionId";
    public static final String KEY_ADDITIONAL_INFO = "additionalInfo";
    public static final String KEY_AUTH_MODEL = "authedModel";
    public static final String KEY_BRAND_ID = "brandId";
    public static final String KEY_CODE = "code";
    public static final String KEY_DATA = "data";
    public static final String KEY_END_DATE = "endDate";
    public static final String KEY_ENTITY_IDS = "entityIds";
    public static final String KEY_ERROR_MESSAGE = "error_message";
    public static final String KEY_FRIENDLY_NAME = "friendlyName";
    public static final String KEY_FRIEND_SESSION_ID = "friendSessionId";
    public static final String KEY_FUNCTION_ID = "functionId";
    public static final String KEY_IS_REGISTER = "isRegister";
    public static final String KEY_KEY_ID = "keyId";
    public static final String KEY_KEY_PRIVILEGE = "keyPrivilege";
    public static final String KEY_KEY_STATUS = "keyStatus";
    public static final String KEY_LISTENER = "listener";
    public static final String KEY_OWNER_SESSION_ID = "ownerSessionId";
    public static final String KEY_PACKAGE_NAME = "packageName";
    public static final String KEY_PARAMS_BUNDLE_VALUE = "paramsBundle";
    public static final String KEY_PASSIVE_ENTRY_STATUS = "passiveEntryStatus";
    public static final String KEY_REQUEST_ALL = "requestAll";
    public static final String KEY_REQUEST_FROM = "requestFrom";
    public static final String KEY_SESSION_ID = "sessionId";
    public static final String KEY_SHAREABLE_KEYS = "shareableKeys";
    public static final String KEY_SHARED_ID = "shareId";
    public static final String KEY_SHARED_KEYS = "sharedKeys";
    public static final String KEY_STATUS = "status";
    public static final String KEY_STATUS_CHANGE_LISTENER = "keyStatusChangeListener";
    public static final String KEY_THIRD_PARTY_PACKAGE_NAME = "thirdPartyPackageName";
    public static final String KEY_VEHICLE_ID = "vehicleId";
    public static final String KEY_VEHICLE_OEM_ID = "vehicleOemId";
    public static final String KEY_VEHICLE_PROFILE = "vehicleProfile";
    public static final String KEY_VEHICLE_PROPRIETARY_DATA = "vehicleProprietaryData";
    public static final String KEY_VEHICLE_STATUS_LISTENER = "vehicleStatusListener";
    public static final String KEY_WIRELESS_CAPABILITIES = "wirelessCapabilities";
    public static final String METHOD_CHECK_PERMISSION = "DigitalKeyFramework.checkPermission";
    public static final String METHOD_CONFIRM_DIGITAL_KEY_SHARING = "DigitalKeyFramework.confirmDigitalKeySharing";
    public static final String METHOD_CONSECUTIVE_RKE_ACTION = "DigitalKeyFramework.consecutiveRkeAction";
    public static final String METHOD_CREATE_DIGITAL_KEY = "DigitalKeyFramework.createDigitalKey";
    public static final String METHOD_GET_DIGITAL_KEY_INFO = "DigitalKeyFramework.getDigitalKeyInfo";
    public static final String METHOD_GET_KEY_BLE_AUTH_STATUS = "DigitalKeyFramework.getKeyBleAuthStatus";
    public static final String METHOD_GET_KEY_BLE_DISABLED = "DigitalKeyFramework.getKeyBleDisabled";
    public static final String METHOD_GET_KEY_PASSIVE_ENTRY_STATUS = "DigitalKeyFramework.getKeyPassiveEntryStatus";
    public static final String METHOD_GET_SERVICE_STATUS = "DigitalKeyFramework.getServiceStatus";
    public static final String METHOD_GRANT_PERMISSION = "DigitalKeyFramework.grantPermission";
    public static final String METHOD_MANAGE_KEY = "DigitalKeyFramework.manageKey";
    public static final String METHOD_NEED_BLUETOOTH_PAIR = "DigitalKeyFramework.needBluetoothPair";
    public static final String METHOD_QUERY_VEHICLE_CONNECTION_STATUS = "DigitalKeyFramework.queryVehicleConnectionStatus";
    public static final String METHOD_REGISTER_KEY_CHANGE_EVENT_LISTENER = "DigitalKeyFramework.registerKeyChangeEventListener";
    public static final String METHOD_REGISTER_VEHICLE_STATUS = "DigitalKeyFramework.registerVehicleStatus";
    public static final String METHOD_REGISTER_VEHICLE_STATUS_LISTENER = "DigitalKeyFramework.registerVehicleStatusListener";
    public static final String METHOD_REQUEST_RKE_ACTION = "DigitalKeyFramework.requestRkeAction";
    public static final String METHOD_REQUEST_SIGNATURE = "DigitalKeyFramework.requestSignature";
    public static final String METHOD_REQUEST_VEHICLE_PROPRIETARY_DATA = "DigitalKeyFramework.requestVehicleProprietaryData";
    public static final String METHOD_REQUEST_VEHICLE_STATUS = "DigitalKeyFramework.requestVehicleStatus";
    public static final String METHOD_SET_KEY_BLE_DISABLED = "DigitalKeyFramework.setKeyBleDisabled";
    public static final String METHOD_SET_KEY_PASSIVE_ENTRY_STATUS = "DigitalKeyFramework.setKeyPassiveEntryStatus";
    public static final String METHOD_SHARE_DIGITAL_KEY = "DigitalKeyFramework.shareDigitalKey";
    public static final String METHOD_START_BLUETOOTH_PAIR = "DigitalKeyFramework.startBluetoothPair";
    public static final String METHOD_SYNC_KEY_INFO = "DigitalKeyFramework.syncKeyInfo";
    public static final String METHOD_UNREGISTER_KEY_CHANGE_EVENT_LISTENER = "DigitalKeyFramework.unregisterKeyChangeEventListener";
    public static final String METHOD_UNREGISTER_VEHICLE_STATUS_LISTENER = "DigitalKeyFramework.unregisterVehicleStatusListener";
    public static final String PACKAGE_IOT_HEALTH_NAME = "com.heytap.health";
    public static final String PACKAGE_NAME = "com.oplus.cardigitalkey";
    public static final String REQUEST_FROM_DEVICE_LOCAL = "DEVICE_LOCAL";
    public static final String REQUEST_FROM_DEVICE_REMOTE = "DEVICE_REMOTE";
    public static final String SERVICE_NAME = "com.oplus.cardigitalkey.IccoaDigitalKeyService";
    public static final int VEHICLE_CONNECTION_STATUS_CONNECTED = 1;
    public static final int VEHICLE_CONNECTION_STATUS_CONNECTING = 2;
    public static final int VEHICLE_CONNECTION_STATUS_NO_CONNECTION = 0;
    public static final String WALLET_ACTION_CREATE = "com.finshell.wallet.action.ICCOA_CREATE";
    public static final String WALLET_ACTION_SHARED = "com.finshell.wallet.action.ICCOA_SHARED";
    public static final String WALLET_PACKAGE_NAME = "com.finshell.wallet";

    static String a(int i) {
        if (i == 0) {
            return "成功";
        }
        if (i == 20103) {
            return "该车型暂不支持";
        }
        if (i == 20105) {
            return "添加失败，请返回后重新添加";
        }
        if (i == 20020) {
            return "调用方未被授权";
        }
        if (i == 20021) {
            return "无此接口访问权限";
        }
        if (i == 20100) {
            return "本地无相关钥匙信息";
        }
        if (i == 20101) {
            return "钥匙不可用";
        }
        switch (i) {
            case 20000:
                return "请求参数输入有误";
            case 20001:
                return "正在执行中，勿频繁调用";
            case 20002:
                return "执行超时";
            default:
                switch (i) {
                    case 20010:
                        return "设备暂不支持此功能";
                    case 20011:
                        return "系统版本过低，不支持此功能";
                    case 20012:
                        return "网络不可用";
                    case 20013:
                        return "蓝牙开关未开启";
                    default:
                        return AMapException.AMAP_CLIENT_UNKNOWN_ERROR;
                }
        }
    }
}
