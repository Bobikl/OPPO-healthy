package com.heytap.usercenter.accountsdk.utils;

import com.heytap.usercenter.accountsdk.helper.AccountHelper;
import com.heytap.usercenter.accountsdk.helper.Constants;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.tools.ApkInfoHelper;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class UCAccountXor8Provider {
    public static final String ACTION_ACCOUNT_USERINFO_CHANGED = "com.usercenter.action.broadcast.USERINFO_CHANGED";
    public static final String ACTION_USERCENTER_ACCOUNT_LOGIN = "com.usercenter.action.receiver.account_login";
    public static final String ACTION_USERCENTER_ACCOUNT_LOGOUT = UCCommonXor8Provider.getNormalStrByDecryptXOR8("kge&`mq|ix&}{mzkmf|mz&ikkg}f|Wdgog}|");
    private static final String EXTRA_BROADCAST_USERCENTER_AESCODER_NAME = "kge&gxxg&}{mzkmf|mz&im{kglmzWcmq";

    @Deprecated
    private static final String EXTRA_REQUEST_BIND_MESSENGER_NAME = "kge&gxxg&}{mzkmf|mz&zmy}m{|WjaflWem{{mfomzWcmq";

    @Deprecated
    private static final String EXTRA_RESULT_USERCENTER_BIND_INFO = "kge&gxxg&}{mzkmf|mz&jaflWafng";
    private static final String PROVIDER_EXP_RELEASE_URL_XOR8 = "`||x{2''a}kn&gxxgegjadm&kge'~=&8'}{mzafng'ji{ak";
    private static final String PROVIDER_HT_USERCENTER_BIND_PAGE_XOR8 = "com.usercenter.action.activity.bindinfo";
    private static final String PROVIDER_HT_USERCENTER_MODIFY_ACCOUNTNAME_XOR8 = "com.usercenter.action.activity.modify_accountname";
    private static final String PROVIDER_INTF_USERCENTER_CONTAINER_ACTIVITY_XOR8 = "gxxg&}{mkmf|mz&af|mf|&ik|agf&gxmf&af|mznikm";
    private static final String PROVIDER_INTF_USERCENTER_HT_CONTAINER_ACTIVITY_XOR8 = "kge&}{mzkmf|mz&ik|agf&ik|a~a|q&gxmf&af|mznikm";
    private static final String PROVIDER_RELEASE_URL_XOR8 = "`||x{2''a}k&gxxgegjadm&kge'~=&8'}{mzafng'ji{ak";
    private static final String PROVIDER_RLME_HOST_URL_XOR8 = "`||x{2''kdamf|%}k&zmidemegjadm&kge'~=&8'}{mzafng'ji{ak";
    private static final String PROVIDER_TEST_URL_XOR8 = "`||x{2''a&egjadmixa&}kfm\u007f|m{|&\u007fifqgd&kge'~=&8'}{mzafng'ji{ak";
    private static final String PROVIDER_URL_USERCENTER_HT_OPEN_XOR8 = "kgf|mf|2''kge&}{mzkmf|mz&i}|`gza|am{&xzg~almz&gxmf";
    private static final String PROVIDER_URL_USERCENTER_OP_OPEN_XOR8 = "kgf|mf|2''kge&gxxg&}{mzkmf|mz&xzg~almz&gxmf";

    @Deprecated
    private static final String PROVIDER_USERCENTER_ACCOUNT_LOGIN_COMPONENT_SAFE_XOR8 = "gxxg&af|mf|&ik|agf&}{mzkmf|mz&IKKG]F\\WDGOAF";
    private static final String PROVIDER_USERCENTER_ACCOUNT_LOGIN_XOR8 = "kge&gxxg&}{mzkmf|mz&ikkg}f|Wdgoaf";

    @Deprecated
    private static final String PROVIDER_USERCENTER_ACCOUNT_LOGOUT_COMPONENT_SAFE_XOR8 = "gxxg&af|mf|&ik|agf&}{mzkmf|mz&IKKG]F\\WDGOG]\\";
    private static final String PROVIDER_USERCENTER_ACCOUNT_LOGOUT_XOR8 = "kge&gxxg&}{mzkmf|mz&ikkg}f|Wdgog}|";

    @Deprecated
    private static final String PROVIDER_USERCENTER_ACCOUNT_MODIFY_NAME_COMPONENT_SAFE_XOR8 = "gxxg&af|mf|&ik|agf&}{mzkmf|mz&EGLANQWFIEM";
    private static final String PROVIDER_USERCENTER_ACCOUNT_MODIFY_NAME_XOR8 = "kge&gxxg&}{mzkmf|mz&eglanqWfiem";

    @Deprecated
    private static final String PROVIDER_USERCENTER_AUTOLOGIN_SERVICE_XOR8 = "gxxg&}{mkmf|mz&af|mf|&ik|agf&i}|gdgoafW{mz~akm";

    @Deprecated
    private static final String PROVIDER_USERCENTER_BIND_PAGE_XOR8 = "gxxg&af|mf|&ik|agf&jaflafng";
    private static final String PROVIDER_USERCENTER_FIRSTIN_XOR8 = "gxxg&}{mkmf|mz&af|mf|&ik|agf&naz{|af";
    private static final String PROVIDER_USERCENTER_HT_FIRSTIN_XOR8 = "kge&}{mzkmf|mz&ik|agf&ik|a~a|q&naz{|af";

    @Deprecated
    private static final String PROVIDER_USERCENTER_MODIFY_ACCOUNTNAME_XOR8 = "gxxg&}{mkmf|mz&af|mf|&ik|agf&eglanqWikkg}f|fiem";

    @Deprecated
    private static final String PROVIDER_USERCENTER_MODIFY_FULLNAME_XOR8 = "gxxg&}{mkmf|mz&af|mf|&ik|agf&eglanqWn}ddfiem";

    public static String getConstantsHTXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("@mq|ix");
    }

    public static String getExtraBroadcastUsercenterAescoderName() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(EXTRA_BROADCAST_USERCENTER_AESCODER_NAME);
    }

    public static String getExtraNAmeRequestTypeXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("mp|ziWzmy}m{|W|qxmWcmq");
    }

    public static String getExtraNameActionAccouontNameXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("ik|a~a|qWmp|ziWcmqW}{mzfiem");
    }

    public static String getExtraNameActionAutoLoginXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("mp|ziWik|agfWi}|gWdgoafWcmq");
    }

    public static String getExtraNameAppInfoXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("mp|ziWik|agfWixxafngWcmq");
    }

    public static String getExtraNameBroadcastActionNeedCallbackXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("mp|ziWjzgilki{|Wik|agfW}{mzmf|a|qWcmqWfmmlWkiddjikc");
    }

    public static String getExtraNameBroadcastActionUserentityXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("mp|ziWjzgilki{|Wik|agfW}{mzmf|a|qWcmq");
    }

    public static String getExtraNameUsercenterPluginNameXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("mp|ziWcmqW}{mzkmf|mzWxd}oafWcmq");
    }

    public static String getExtraRequestBindMessengerName() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(EXTRA_REQUEST_BIND_MESSENGER_NAME);
    }

    public static String getExtraResultUsercenterBindInfo() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(EXTRA_RESULT_USERCENTER_BIND_INFO);
    }

    public static String getPackageNameNewAccountUserCenterXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("kge&gxd}{&ikkg}f|");
    }

    public static String getPackageNameNewUserCenterXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("kge&gxd}{&~ax");
    }

    public static String getPackageNameOPSUserCenterXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(AccountHelper.OP_ACCOUNT_PACKAGE_NAME_XOR8);
    }

    public static String getPackageNameOPUsercenterXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("kge&`mq|ix&~ax");
    }

    public static String getProviderExpReleaseUrlXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_EXP_RELEASE_URL_XOR8);
    }

    public static String getProviderIntfUsercenterOpenContainerActivityXor8() {
        return ApkInfoHelper.appExistByPkgName(BaseApp.mContext, UCCommonXor8Provider.getUCPackageName()) ? UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_INTF_USERCENTER_CONTAINER_ACTIVITY_XOR8) : UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_INTF_USERCENTER_HT_CONTAINER_ACTIVITY_XOR8);
    }

    public static String getProviderNameAppCodXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("ixxKglm");
    }

    public static String getProviderRLMEHostUrlXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_RLME_HOST_URL_XOR8);
    }

    public static String getProviderReleaseUrlXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_RELEASE_URL_XOR8);
    }

    public static String getProviderSecreXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("{mkzmCmq");
    }

    public static String getProviderTestUrlXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_TEST_URL_XOR8);
    }

    public static String getProviderUrlUsercenterOpOpenXor8() {
        return ApkInfoHelper.appExistByPkgName(BaseApp.mContext, UCCommonXor8Provider.getUCPackageName()) ? UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_URL_USERCENTER_OP_OPEN_XOR8) : UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_URL_USERCENTER_HT_OPEN_XOR8);
    }

    public static String getProviderUsercenterAccountLoginComponentSafeXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_USERCENTER_ACCOUNT_LOGIN_COMPONENT_SAFE_XOR8);
    }

    public static String getProviderUsercenterAccountLoginXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_USERCENTER_ACCOUNT_LOGIN_XOR8);
    }

    public static String getProviderUsercenterAccountLogoutComponentSafeXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_USERCENTER_ACCOUNT_LOGOUT_COMPONENT_SAFE_XOR8);
    }

    public static String getProviderUsercenterAccountLogoutXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_USERCENTER_ACCOUNT_LOGOUT_XOR8);
    }

    public static String getProviderUsercenterAccountModifyNameComponentSafeXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_USERCENTER_ACCOUNT_MODIFY_NAME_COMPONENT_SAFE_XOR8);
    }

    public static String getProviderUsercenterAccountModifyNameXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_USERCENTER_ACCOUNT_MODIFY_NAME_XOR8);
    }

    public static String getProviderUsercenterAutologinServiceXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_USERCENTER_AUTOLOGIN_SERVICE_XOR8);
    }

    public static String getProviderUsercenterBindPageXor8() {
        return (ApkInfoHelper.appExistByPkgName(BaseApp.mContext, UCCommonXor8Provider.getPkgnameUcHtXor8()) || ApkInfoHelper.appExistByPkgName(BaseApp.mContext, Constants.PACKAGE_NAME_OPUSERCENTER) || ApkInfoHelper.appExistByPkgName(BaseApp.mContext, Constants.PACKAGE_NAME_NEW_USERCENTER)) ? PROVIDER_HT_USERCENTER_BIND_PAGE_XOR8 : UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_USERCENTER_BIND_PAGE_XOR8);
    }

    public static String getProviderUsercenterFirstinXor8() {
        return ApkInfoHelper.appExistByPkgName(BaseApp.mContext, UCCommonXor8Provider.getUCPackageName()) ? UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_USERCENTER_FIRSTIN_XOR8) : UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_USERCENTER_HT_FIRSTIN_XOR8);
    }

    public static String getProviderUsercenterModifyAccountnameXor8() {
        return ApkInfoHelper.appExistByPkgName(BaseApp.mContext, UCCommonXor8Provider.getUCPackageName()) ? UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_USERCENTER_MODIFY_ACCOUNTNAME_XOR8) : PROVIDER_HT_USERCENTER_MODIFY_ACCOUNTNAME_XOR8;
    }

    @Deprecated
    public static String getProviderUsercenterModifyFullnameXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8(PROVIDER_USERCENTER_MODIFY_FULLNAME_XOR8);
    }

    public static String getSPNameUsercenterAccountXor8() {
        return UCCommonXor8Provider.getNormalStrByDecryptXOR8("}{mzkmf|mzWikkg}f|Wcmq");
    }
}
