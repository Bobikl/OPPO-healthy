package com.oplus.carlink.controlsdk;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public final class Constant {
    public static final String COMPANY_ID_BYD = "200053";
    public static final String COMPANY_ID_CHANGAN = "200038";
    public static final String COMPANY_ID_CHANGANOUSHANG = "200002";
    public static final String COMPANY_ID_JIKE = "210030";
    public static final String COMPANY_ID_JIUHAO = "20029";
    public static final String COMPANY_ID_LINGPAO = "200030";
    public static final String COMPANY_ID_LIXIANG = "200009";
    public static final String COMPANY_ID_QICHEN = "200040";
    public static final String COMPANY_ID_SMART = "200036";
    public static final String COMPANY_ID_TESLA = "200034";
    public static final String COMPANY_ID_XIAONIU = "200015";
    public static final String COMPANY_ID_XIAOPENG = "200019";
    public static final String CONTROL_ACTION_CLOSE = "CLOSE";
    public static final String CONTROL_ACTION_OPEN = "OPEN";
    public static final String CONTROL_SKILL_AC_TEMP = "AC-TEMP";
    public static final String CONTROL_SKILL_ALARM_MUTE = "ALARM-MUTE";
    public static final String CONTROL_SKILL_ALL_WINDOW = "ALL-WINDOW";
    public static final String CONTROL_SKILL_BOX_COVER = "BOX-COVER";
    public static final String CONTROL_SKILL_CAR_BOOT = "CAR-BOOT";
    public static final String CONTROL_SKILL_CAR_CALL = "CAR-CALL";
    public static final String CONTROL_SKILL_CAR_ENGINE = "CAR-ENGINE";
    public static final String CONTROL_SKILL_CAR_HORN = "CAR-HORN";
    public static final String CONTROL_SKILL_CHARGING_PORT = "CHARGING-PORT";
    public static final String CONTROL_SKILL_DOUBLE_FLASH = "DOUBLE-FLASH";
    public static final String CONTROL_SKILL_FIND_CAR = "CAR-HORN&&DOUBLE-FLASH";
    public static final String CONTROL_SKILL_FRONT_TRUNK = "FRONT-TRUNK";
    public static final String CONTROL_SKILL_FUEL_TANK_CAP = "FUEL-TANK-CAP";
    public static final String CONTROL_SKILL_REMOTE_DRIVING = "REMOTE-DRIVING";
    public static final String CONTROL_SKILL_REMOTE_PARKING = "REMOTE-PARKING";
    public static final String CONTROL_SKILL_REMOTE_START = "REMOTE-START";
    public static final String CONTROL_SKILL_SEAT_HEAT = "SEAT-HEAT";
    public static final String CONTROL_SKILL_SEAT_VENTILATION = "SEAT-VENTILATION";
    public static final String CONTROL_SKILL_STEERING_WHEEL_HEAT = "STEERING-WHEEL-HEAT";
    public static final String CONTROL_SKILL_SUNROOF = "SUNROOF";
    public static final String CONTROL_SKILL_UNLOCK_CAR = "CAR-DOOR";
    public static final int ERROR_CODE_APP_ACCOUNT_EXPIRED = 20007;
    public static final int ERROR_CODE_APP_NOT_INSTALLED = 20005;
    public static final int ERROR_CODE_BUSY = 10003;
    public static final int ERROR_CODE_CARLINK_CTA_NOT_AGREED = 20001;
    public static final int ERROR_CODE_CARLINK_NOT_SUPPORT = 10001;
    public static final int ERROR_CODE_CAR_CONTROL_FAILED = 20006;
    public static final int ERROR_CODE_INVALID_ARGUMENT = 10005;
    public static final int ERROR_CODE_INVALID_CAR_ID = 20003;
    public static final int ERROR_CODE_INVALID_COMPANY_ID = 20002;
    public static final int ERROR_CODE_INVALID_CONTROL_SKILL = 20004;
    public static final int ERROR_CODE_NOT_SUPPORT_API = 10006;
    public static final int ERROR_CODE_PERMISSION_DENY = 10002;
    public static final int ERROR_CODE_PHONE_ACCOUNT_NOT_LOGIN = 20000;
    public static final int ERROR_CODE_SUCCESS = 0;
    public static final int ERROR_CODE_SYSTEM_NOT_SUPPORT = 10000;
    public static final int ERROR_CODE_TIMEOUT = 10004;
    public static final int ERROR_CODE_UNKNOWN_ERROR = -1;
    private static final String ERROR_MESSAGE_APP_ACCOUNT_EXPIRED = "车企app账号失效";
    private static final String ERROR_MESSAGE_APP_NOT_INSTALLED = "车企app未安装";
    private static final String ERROR_MESSAGE_BUSY = "正在执行中，请勿重复操作";
    private static final String ERROR_MESSAGE_CARLINK_CTA_NOT_AGREED = "CarLink未同意用户须知";
    private static final String ERROR_MESSAGE_CARLINK_NOT_SUPPORT = "CarLink版本低";
    private static final String ERROR_MESSAGE_CAR_CONTROL_FAILED = "操作执行失败";
    private static final String ERROR_MESSAGE_INVALID_ARGUMENT = "请求参数有误";
    private static final String ERROR_MESSAGE_INVALID_CAR_ID = "无效的carId";
    private static final String ERROR_MESSAGE_INVALID_COMPANY_ID = "无效的companyId";
    private static final String ERROR_MESSAGE_INVALID_CONTROL_SKILL = "无效的车控技能";
    private static final String ERROR_MESSAGE_NOT_SUPPORT_API = "不支持的接口调用";
    private static final String ERROR_MESSAGE_PERMISSION_DENY = "调用方无权限访问该接口";
    private static final String ERROR_MESSAGE_PHONE_ACCOUNT_NOT_LOGIN = "手机账号未登录";
    private static final String ERROR_MESSAGE_SUCCESS = "成功";
    private static final String ERROR_MESSAGE_SYSTEM_NOT_SUPPORT = "系统不支持";
    private static final String ERROR_MESSAGE_TIMEOUT = "执行超时";
    private static final String ERROR_MESSAGE_UNKNOWN_ERROR = "未知错误";
    public static final String KEY_ADDITIONAL_INFO = "additionalInfo";
    public static final String KEY_CODE = "code";
    public static final String KEY_DATA = "data";
    public static final String KEY_ERROR_MESSAGE = "error_message";

    public static String getErrorMessageByCode(int i) {
        if (i == 0) {
            return ERROR_MESSAGE_SUCCESS;
        }
        switch (i) {
            case 10000:
                return ERROR_MESSAGE_SYSTEM_NOT_SUPPORT;
            case 10001:
                return ERROR_MESSAGE_CARLINK_NOT_SUPPORT;
            case 10002:
                return ERROR_MESSAGE_PERMISSION_DENY;
            case 10003:
                return ERROR_MESSAGE_BUSY;
            case 10004:
                return ERROR_MESSAGE_TIMEOUT;
            case 10005:
                return ERROR_MESSAGE_INVALID_ARGUMENT;
            case 10006:
                return ERROR_MESSAGE_NOT_SUPPORT_API;
            default:
                switch (i) {
                    case 20000:
                        return ERROR_MESSAGE_PHONE_ACCOUNT_NOT_LOGIN;
                    case 20001:
                        return ERROR_MESSAGE_CARLINK_CTA_NOT_AGREED;
                    case 20002:
                        return ERROR_MESSAGE_INVALID_COMPANY_ID;
                    case 20003:
                        return ERROR_MESSAGE_INVALID_CAR_ID;
                    case 20004:
                        return ERROR_MESSAGE_INVALID_CONTROL_SKILL;
                    case 20005:
                        return ERROR_MESSAGE_APP_NOT_INSTALLED;
                    case 20006:
                        return ERROR_MESSAGE_CAR_CONTROL_FAILED;
                    case 20007:
                        return ERROR_MESSAGE_APP_ACCOUNT_EXPIRED;
                    default:
                        return "未知错误";
                }
        }
    }
}
