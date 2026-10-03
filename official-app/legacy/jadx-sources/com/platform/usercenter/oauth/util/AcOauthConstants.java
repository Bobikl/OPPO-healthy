package com.platform.usercenter.oauth.util;

import androidx.annotation.Keep;
import com.heytap.usercenter.accountsdk.helper.AccountHelper;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcOauthConstants {
    public static final String H5_OAUTH_MANAGER_CLASS_NAME = "com.platform.account.oauth.web.agents.OAuthAgentWeb";
    public static final int MIN_MASKED_PHONE_VERSION = 918000;
    public static final String OPEN_SDK_OAUTH_MANAGER_CLASS_NAME = "com.platform.usercenter.account.sdk.open.AcOpenOAuthManager";

    public static final class AcPackageNameConstants {
        public static final String PACKAGE_NAME_OS17_ACCOUNT = AcXORUtils.encrypt("kge&gxd}{&{q{ikkg}f|");
        public static final String PACKAGE_NAME_OS17_OP_ACCOUNT = AcXORUtils.encrypt("kge&gfmxd}{&{q{ikkg}f|");
        public static final String PACKAGE_NAME_OPUSERCENTER = AcXORUtils.encrypt("kge&`mq|ix&~ax");
        public static final String PACKAGE_NAME_NEW_USERCENTER = AcXORUtils.encrypt("kge&gxd}{&~ax");
        public static final String PACKAGE_NAME_NEW_ACCOUNT = AcXORUtils.encrypt("kge&gxd}{&ikkg}f|");
        public static final String PACKAGE_NAME_OPS_ACCOUNT = AcXORUtils.encrypt(AccountHelper.OP_ACCOUNT_PACKAGE_NAME_XOR8);
        public static final String PACKAGE_NAME_OLD_ACCOUNT = AcXORUtils.encrypt("kge&gxxg&}{mzkmf|mz");
        public static String PACKAGE_NAME_HT_ACCOUNT = AcXORUtils.encrypt("kge&`mq|ix&}{mzkmf|mz");
    }
}
