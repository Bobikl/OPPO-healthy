package com.platform.usercenter.account.ams.ipc;

/* JADX INFO: loaded from: classes9.dex */
public class RequestConstant {
    public static final String BINDER_ACCOUNT_PROVIDER_OS17_AUTHORITY_SUFFIX = ".provider.account.service.support";
    public static final String BINDER_PROVIDER_AUTHORITY = "com.platform.usercenter.account.ams.provider";
    public static final String BINDER_REQUEST = "BINDER_REQUEST";
    public static final String BINDER_THIRD_PROVIDER_OS17_AUTHORITY_SUFFIX = ".provider.third.service.support";
    public static final RequestConstant INSTANCE = new RequestConstant();
    public static final String KEY_GET_BINDER = "KEY_GET_BINDER";
    public static final int SETTINGS_NONSUPPORT_LOGIN = 0;
    public static final String SETTINGS_SDK_CONFIG_KEY = "SETTINGS_ACCOUNT_SDK_CONFIG_KEY";
    public static final int SETTINGS_VALUE_USER_LOGIN = 1;
    public static final int SETTINGS_VALUE_USER_NO_LOGIN = 2;
    public static final String SETTING_KEY_ID_TOKEN_HASH = "USERCENTER_ACCOUNT_TOKEN_HASH";
    public static final String SETTING_KEY_LOGIN = "USERCENTER_ACCOUNT_LOGIN";
    public static final String SETTING_KEY_USERINFO_HASH = "USERCENTER_ACCOUNT_USERINFO_HASH";
    public static final int TYPE_AUTH_REQUEST = -1001;
    public static final int TYPE_BACKUP_SILENT_LOGIN = -1009;
    public static final int TYPE_GET_SSOID = -1007;
    public static final int TYPE_NET_NUMBER_FORMAT_EXCEPTION = -1000;
    public static final int TYPE_OAUTH_REQUEST = -1003;
    public static final int TYPE_OAUTH_USER_INFO_REQUEST = -1010;
    public static final int TYPE_OPEN_GET_TOKEN_V1 = -1011;
    public static final int TYPE_OPEN_INIT = -1010;
    public static final int TYPE_PROFILE_REQUEST = -1002;
    public static final int TYPE_REFRESH_V1 = -1008;

    private RequestConstant() {
    }
}
