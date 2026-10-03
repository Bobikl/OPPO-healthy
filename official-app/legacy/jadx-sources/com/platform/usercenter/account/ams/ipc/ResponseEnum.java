package com.platform.usercenter.account.ams.ipc;

import com.cloud.sdk.cloudstorage.common.ErrorInfo;
import com.cloud.sdk.cloudstorage.http.ResponseInfo;
import com.heytap.log.core.ConstantCode;
import com.heytap.nearx.tangramconfig.stat.Const;
import com.heytap.speech.engine.constant.ErrorCode;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechErrorCode;
import com.oplus.aiunit.vision.cxe;

/* JADX INFO: loaded from: classes9.dex */
public enum ResponseEnum {
    NET_ENVIRONMENT_UNSAFE(4610501, "Environment is unsafe"),
    NET_AUTH_EXPIRED(SpeechErrorCode.ERROR_TOKEN_4042_INVALID, "Auth token is expired. Please auth again"),
    NET_ACCOUNT_EXPIRED(4043, "Account id is expired. Please auth again"),
    CODE_ID_TOKEN_ILLEGAL(4044, "ID TOKEN ILLEGAL"),
    CODE_ID_TOKEN_EXPIRED(4045, "ID TOKEN EXPIRED"),
    CODE_ACCESS_TOKEN_EXPIRED(SpeechErrorCode.ERROR_TOKEN_4041_INVALID, "ACCESS TOKEN EXPIRED"),
    SUCCESS(Const.ERROR_CODE_NON_EXIST, cxe.MSG_SUC),
    NETWORK_DATA_NULL(ErrorInfo.UPLOAD_ERROR_UPDATE_SERVER_CONFIG, "Network response data is null"),
    ERROR_NOT_AUTH(ErrorInfo.UPLOAD_ERROR_UPDATE_TOKEN, "Account not login, should login first"),
    ERROR_REQUEST_TIMEOUT(ErrorInfo.UPLOAD_ERROR_ENCRYPT_BODY, "Request timeout. Please try again later."),
    NETWORK_UNKNOWN_ERROR(ErrorInfo.UPLOAD_ERROR_DELETE_OLD_FILE, "Unknown network error occurs"),
    ERROR_JUMP_CONTEXT_ERROR(-205, "Jump page by a illegal context"),
    ERROR_JUMP_INTENT_NULL(-206, "Get jump intent error"),
    ERROR_JUMP_IN_BACKGROUND(-207, "Can't jump page in background"),
    CANCEL(-208, "canceled"),
    ERROR_REMOTE_SERVICE_NOT_EXIST(-209, "Remote service is not exist"),
    ERROR_JUMP_UNKNOWN(-210, "Unknown error occurs when jumping intent"),
    ERROR_GUEST_MODE(ErrorInfo.UPLOAD_ERROR_ILLEGAL_HTTP_REQUEST, "Now in guest mode!"),
    ERROR_GET_OP_AGENT_ERROR(-212, "Please implement oplus_auth sdk!"),
    ERROR_UNKNOWN_CLIENT_ERROR(-213, "Can't get a correct client"),
    ERROR_UNKNOWN_INNER_ERROR(-214, "unknown inner error happened"),
    DEVICE_NETWORK_NO_AVAILABLE(-215, "device network is not available"),
    ERROR_APID_APKY_NULL(-216, "Apid or apkey is null"),
    ERROR_RUN_IN_MAIN_THREAD(-217, "Can't run in main thread"),
    ERROR_NETWORK_NOT_AVAILABLE(-218, "Network is not available"),
    SUCCESS_FREQUENTLY(-219, "Network is not available"),
    REMOTE_UNKNOWN_ERROR(-1001, "Unknown remote exception occurs"),
    REMOTE_SERVICE_DEAD(-1002, "Remote service is dead"),
    REMOTE_CALLED_APP_ILLEGAL(-1003, "Remote service called by a illegal app"),
    REMOTE_CALLED_INFO_NONE(-1004, "Get the called app info error"),
    REMOTE_REQ_TYPE_ILLEGAL(-1005, "Request remote service with a illegal type"),
    REMOTE_DATA_NULL(ResponseInfo.ConfigException, "Ipc response data is null"),
    REMOTE_ACTIVITY_DATA_NULL(RequestConstant.TYPE_GET_SSOID, "Auth activity response data is null"),
    AUTH_VERIFY_ERROR(-2001, "Verify error"),
    AUTH_REQ_PARAMS_NULL(-2002, "Request auth with a null params"),
    AUTH_CALLED_INFO_NONE(-2003, "Get the called app info error"),
    AUTH_REQ_TYPE_ILLEGAL(-2004, "Request auth with a illegal type"),
    AUTH_REQ_NO_RESPONSE(-2005, "Auth request no response"),
    AUTH_LOGIN_ERROR(-2006, "Login error"),
    AUTH_NOT_SHOW_PAGE(-2007, "Not show page"),
    AUTH_NEED_UPGRADE(-2008, "Need upgrade remote service. Please try later"),
    OAUTH_URL_NULL_ERROR(-2009, "Get oauth url error"),
    OAUTH_VERSION_NOT_SUPPORT(ConstantCode.CloganStatus.CLOGAN_OPEN_SUCCESS, "Account app is not support this version."),
    OAUTH_STATE_CHANGE_ERROR(-2011, "state has changed"),
    OAUTH_H5_DATA_ERROR(-2012, "oauth h5 returns a wrong data"),
    OAUTH_H5_OPERATE_FAILED(-2013, "oauth h5 operated fail"),
    OAUTH_H5_NO_RESPONSE(-2014, "oauth h5 no response"),
    OAUTH_NO_LOGIN_ERROR(-2015, "oauth failed! User not logged in."),
    AUTH_CALLED_FREQUENTLY_ERROR(-2016, "Auth called too frequently! Please call later"),
    AUTH_H5_RESULT_NULL(-2017, "Auth result return, but result is null"),
    AUTH_ACCOUNT_VERSION_NOT_SUPPORT(-2018, "Account app version is low,not support this request"),
    PROFILE_NULL_ERROR(-3001, "User info is empty"),
    GET_TOKEN_IN_MAIN_ERROR(-3002, "Can't invoke getAccountToken in main thread! Please use getAccountTokenAsync or invoke in worker thread"),
    PROFILE_NO_ACCOUNT_ERROR(-3003, "Get user info error, no account"),
    GET_PROFILE_FREQUENTLY_ERROR(-3004, "get profile frequently, please try later."),
    PARSE_ID_ERROR(-4001, "Refresh token error: parse id error"),
    REFRESH_FREQUENTLY_ERROR(-4002, "refresh frequently, please try later."),
    REFRESH_V1_TOKEN_FREQUENTLY_ERROR(-4003, "request refresh v1 frequently, please try later."),
    VERIFY_RESULT_CODE_FAILED(-5001, "verify_result_code_failed"),
    VERIFY_RESULT_CODE_CANCEL(-5002, "verify_result_code_cancel"),
    COMPLETE_RESULT_CODE_FAILED(-5003, "complete_result_code_failed"),
    COMPLETE_RESULT_CODE_CANCEL(-5004, "complete_result_code_cancel"),
    COMPLETE_RESULT_CODE_EXIST(-5005, "complete_result_code_exist"),
    VERIFY_APP_VERSION_NOT_SUPPORT(-5006, "verify_app_version_not_support"),
    VERIFY_NEED_UPGRADE_GUIDE(-5007, "verify_need_upgrade_account_app"),
    TEENATE_VERIFY_RESULT_CODE_FAILED(-6001, "teenage_verify_result_code_failed"),
    TEENATE_RESULT_CODE_CANCEL(-6002, "teenage_verify_result_code_cancel"),
    TEENATE_APP_VERSION_NOT_SUPPORT(-6006, "teenage_verify_app_version_not_support"),
    TEENATE_VERIFY_RESULT_NULL(-6007, "teenagee_verify_result_null"),
    TEENATE_VERIFY_NEED_UPGRADE_GUIDE(-6008, "teenate_verify_need_upgrade_account_app"),
    MOVE_HOME_SSOID_IS_NULL(-7001, "ssoid is null"),
    MOVE_HOME_SSOID_ENCRYPT_ERROR(-7002, "ssoid encrypt error"),
    MOVE_HOME_ACCOUNT_ALREADY_LOGIN(-7003, "account already login"),
    MOVE_HOME_LOCAL_TOKEN_IS_EMPTY(-7004, "local token is null"),
    MOVE_HOME_CTA_NOT_PASS(-7005, "cta not pass, login fail"),
    NEED_OPLUS_AUTH_SDK(-8001, "need sdk com.heytap.accountsdk:oplus_auth"),
    NEED_SELL_MODE_SDK(-8002, "need sdk com.heytap.accountsdk:sell_model_wrapper"),
    ERROR_NOT_OAUTH_MANAGER(ErrorCode.ERROR_ASR_NODE_NOT_CONNECT, "oauth manager is null"),
    ERROR_NOT_VERIFY_AGENT(-40002, "verify agent is null"),
    ERROR_NOT_TEENAGE_VERIFY_AGENT(-40003, "teenageVerify agent is null"),
    ERROR_NOT_SDK_CONFIG(-40004, "SDK not init"),
    ERROR_NOT_TICKET_AGENT(-40005, "ticket agent is null"),
    ERROR_INVALID_PARAM(-40006, "invalid param");

    public int code;
    public String remark;

    ResponseEnum(int i, String str) {
        this.code = i;
        this.remark = str;
    }

    public int getCode() {
        return this.code;
    }

    public String getRemark() {
        return this.remark;
    }
}
