package com.oplus.accountsdk.service.old.heytap.utils;

import android.content.Context;
import androidx.annotation.Keep;
import com.oplus.accountsdk.service.common.constants.AcConstants;
import com.oplus.aiunit.vision.l7;
import com.oplus.aiunit.vision.ml;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AcOldConstants {
    public static final String AC_BASIC_INFO_CACHE_VALID_TIME = "ac_basic_info_cache_valid_time";
    public static final String IS_SHOW_LOGIN_PAGE = "is_show_login_page";
    public static final int REQUEST_TYPE_REQRESIGNIN = 48059;
    public static final int USERCENTER_PLUGIN_ID = 1002;
    public static final String EXTRA_NAME_REQUEST_TYPE = ml.a("mp|ziWzmy}m{|W|qxmWcmq");
    public static final String EXTRA_NAME_USERCENTER_PLUGIN_NAME = ml.a("mp|ziWcmqW}{mzkmf|mzWxd}oafWcmq");
    public static final String EXTRA_NAME_ACTION_AUTO_LOGIN = ml.a("mp|ziWik|agfWi}|gWdgoafWcmq");
    public static final String EXTRA_NAME_ACTION_APPINFO = ml.a("mp|ziWik|agfWixxafngWcmq");
    public static final String SP_NAME_USERCENTER = ml.a("}{mzkmf|mzWikkg}f|Wcmq");

    public static final class a {
        public static final String EXTRA_BROADCAST_MODIFY_NEW_USERNAME = "UserName";
        public static final String EXTRA_BROADCAST_MODIFY_OLD_USERNAME = "OldUserName";
        public static final String EXTRA_NAME_BROADCAST_ACTION_USERENTITY_NEEDCALLBACK = ml.a("mp|ziWjzgilki{|Wik|agfW}{mzmf|a|qWcmqWfmmlWkiddjikc");
        public static final String EXTRA_BROADCAST_USERCENTER_AESCODER_NAME = ml.a("kge&gxxg&}{mzkmf|mz&im{kglmzWcmq");
        public static final String PROVIDER_USERCENTER_ACCOUNT_MODIFY_NAME_XOR8 = ml.a("kge&gxxg&}{mzkmf|mz&eglanqWfiem");
        public static final String PROVIDER_USERCENTER_ACCOUNT_LOGOUT_COMPONENT_SAFE_XOR8 = ml.a("gxxg&af|mf|&ik|agf&}{mzkmf|mz&IKKG]F\\WDGOG]\\");
        public static final String PROVIDER_USERCENTER_ACCOUNT_LOGOUT_XOR8 = ml.a("kge&gxxg&}{mzkmf|mz&ikkg}f|Wdgog}|");
        public static final String PROVIDER_USERCENTER_ACCOUNT_LOGIN_COMPONENT_SAFE_XOR8 = ml.a("gxxg&af|mf|&ik|agf&}{mzkmf|mz&IKKG]F\\WDGOAF");
        public static final String ACTION_USERCENTER_ACCOUNT_LOGIN = ml.a("kge&}{mzkmf|mz&ik|agf&zmkma~mz&ikkg}f|Wdgoaf");
        public static final String ACTION_ACCOUNT_USERINFO_CHANGED = ml.a("kge&}{mzkmf|mz&ik|agf&jzgilki{|&][MZAFNGWK@IFOML");
        public static final String ACTION_USERCENTER_ACCOUNT_LOGOUT = ml.a("kge&`mq|ix&}{mzkmf|mz&ikkg}f|Wdgog}|");
        public static final String PROVIDER_USERCENTER_ACCOUNT_LOGIN_XOR8 = ml.a("kge&gxxg&}{mzkmf|mz&ikkg}f|Wdgoaf");
        public static final String PROVIDER_USERCENTER_ACCOUNT_MODIFY_NAME_COMPONENT_SAFE_XOR8 = ml.a("gxxg&af|mf|&ik|agf&}{mzkmf|mz&EGLANQWFIEM");
        public static String EXTRA_NAME_BROADCAST_ACTION_USERENTITY = ml.a("mp|ziWjzgilki{|Wik|agfW}{mzmf|a|qWcmq");
    }

    public static final class b {
        public static String a(Context context) {
            return l7.c(context, AcConstants.b.PACKAGE_NAME_OLD_ACCOUNT) ? ml.a("gxxg&}{mkmf|mz&af|mf|&ik|agf&gxmf&af|mznikm") : ml.a("kge&}{mzkmf|mz&ik|agf&ik|a~a|q&gxmf&af|mznikm");
        }

        public static String b(Context context) {
            return l7.c(context, AcConstants.b.PACKAGE_NAME_OLD_ACCOUNT) ? ml.a("kge&gxxg&}{mzkmf|mz&xzg~almz&gxmf") : ml.a("kge&}{mzkmf|mz&i}|`gza|am{&xzg~almz&gxmf");
        }

        public static String c(Context context) {
            return l7.c(context, AcConstants.b.PACKAGE_NAME_OLD_ACCOUNT) ? ml.a("gxxg&}{mkmf|mz&af|mf|&ik|agf&naz{|af") : ml.a("kge&}{mzkmf|mz&ik|agf&ik|a~a|q&naz{|af");
        }
    }
}
