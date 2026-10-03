package com.heytap.usercenter.accountsdk.helper;

import com.heytap.usercenter.accountsdk.utils.UCAccountXor8Provider;
import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class Constants {
    public static final String EXTRA_BROADCAST_MODIFY_NEW_USERNAME = "UserName";
    public static final String EXTRA_BROADCAST_MODIFY_OLD_USERNAME = "OldUserName";
    public static final String EXTRA_MODIFY_RESULT = "EXTRA_MODIFY_RESULT";
    public static final String IS_SHOW_LOGIN_PAGE = "is_show_login_page";
    public static final int MSG_RESULT_FOR_REQ_BINDINFO = 40001000;
    public static final int MSG_WHAT_UC_OPERATE_LOGIN = 40001000;
    public static final int MSG_WHAT_UC_OPERATE_REFRESH = 20001000;
    public static final int MSG_WHAT_UC_OPERATE_REGITSER = 30001000;
    public static final String NAME_MODIFY_FULLNAME_ACCOUNT_COUNTRY = "MODIFY_FULLNAME_ACCOUNT_COUNTRY";
    public static final String NAME_MODIFY_FULLNAME_FIRST_NAME = "MODIFY_FULLNAME_FIRST_NAME";
    public static final String NAME_MODIFY_FULLNAME_LAST_NAME = "MODIFY_FULLNAME_LAST_NAME";
    public static final int REQUESTCODE_USERCENTER_BINDINFO = 171;
    public static final int REQUEST_CODE_MODIFY_ACCOUNTNAME = 582;
    public static final int REQUEST_CODE_MODIFY_FULLNAME = 113;
    public static final int REQUSET_TYPE_REQRESIGNIN = 48059;

    @Deprecated
    public static final int REQUSET_TYPE_REQSWITCH_ACCOUNT = 52428;
    public static final int REQUSET_TYPE_REQTOKEN = 43690;
    public static final int REQ_AIDL_TIMEOUT = 30001003;
    public static final int REQ_APK_NOT_EXIST = 30001007;
    public static final int REQ_CANCLE = 30001004;
    public static final int REQ_EXCEPTION = 30001006;
    public static final int REQ_FAILED = 30001002;
    public static final int REQ_GUEST_MODE_CODE = 30004046;
    public static final int REQ_LOW_VERSION_SDK = 30003041;
    public static final int REQ_NONE_ACCOUNT = 30003042;
    public static final int REQ_NO_SUPPORT_ACCOUNT = 30003044;
    public static final int REQ_NO_SUPPORT_ACCOUNTNAME = 30003045;
    public static final int REQ_OCCUPY = 30001005;
    public static final int REQ_PARAM_ERROR = 30001102;
    public static final int REQ_SERVICE_NOT_EXIST = 30001101;
    public static final int REQ_SUCCESS = 30001001;
    public static final int REQ_TOKEN_EXCEPTION = 30003046;
    public static final int REQ_TOKEN_NOT_EXIST = 30003040;
    public static final int REQ_USERCENTER_NOT_EXIST = 30003043;
    public static final int RESULT_CODE_MODIFY_ACCOUNTNAME = 23;
    public static final int RESULT_CODE_MODIFY_FULLNAME = 24;
    public static final int USERCENTER_PLUGIN_ID = 1002;
    public static final String USERCENTER_SP_SUFFIX = "_suffix_usercenter_sharepreference";
    public static final String EXTRA_NAME_REQUEST_TYPE = UCAccountXor8Provider.getExtraNAmeRequestTypeXor8();
    public static final String EXTRA_NAME_USERCENTER_PLUGIN_NAME = UCAccountXor8Provider.getExtraNameUsercenterPluginNameXor8();
    public static final String EXTRA_NAME_BROADCAST_ACTION_USERENTITY = UCAccountXor8Provider.getExtraNameBroadcastActionUserentityXor8();
    public static final String EXTRA_NAME_BROADCAST_ACTION_USERENTITY_NEEDCALLBACK = UCAccountXor8Provider.getExtraNameBroadcastActionNeedCallbackXor8();
    public static final String EXTRA_NAME_ACTION_APPINFO = UCAccountXor8Provider.getExtraNameAppInfoXor8();
    public static final String EXTRA_NAME_ACTION_AUTO_LOGIN = UCAccountXor8Provider.getExtraNameActionAutoLoginXor8();
    public static final String EXTRA_NAME_ACTION_ACCOUNT_NAME = UCAccountXor8Provider.getExtraNameActionAccouontNameXor8();
    public static final String PACKAGE_NAME_OPUSERCENTER = UCAccountXor8Provider.getPackageNameOPUsercenterXor8();
    public static final String PACKAGE_NAME_NEW_USERCENTER = UCAccountXor8Provider.getPackageNameNewUserCenterXor8();
    public static final String PACKAGE_NAME_NEW_ACCOUNT = UCAccountXor8Provider.getPackageNameNewAccountUserCenterXor8();
    public static final String PACKAGE_NAME_OPS_ACCOUNT = UCAccountXor8Provider.getPackageNameOPSUserCenterXor8();
}
