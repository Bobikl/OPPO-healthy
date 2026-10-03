package com.platform.sdk.center.cons;

import com.platform.sdk.center.utils.AcAppUtils;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.tools.env.EnvConstantManager;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcConstants {
    public static final String APP_S = "k=6CyfIPKEDKF0RIR3fdtFsQ==";
    public static final String GET_SESSION_INFO = "getVisitSessionInfo";
    public static final String JS_ARGUMENTS_BUSINESS = "business";
    public static final String JS_ARGUMENTS_PACKAGENAME = "packageName";
    public static final String JS_JSON_ARGUMENTS = "jsonArguments";
    public static final String K_HTML = "html";
    public static final String K_SP_VIP_ACCOUNT_INFO = "k_sp_vip_account_info";
    public static final String K_SP_VIP_ACCOUNT_INFO_V2 = "k_sp_vip_account_info_v2";
    public static final String K_SP_VIP_PRIVILEGE_INFO = "k_sp_vip_privilege_info";
    public static final String OPERATE_VISIT_CHAIN = "operateVisitChain";
    public static final String OPERATE_VISIT_NODE = "operateVisitNode";
    public static final String ORDER_TYPE_PREORDER = "1";
    public static final String TAG = "VipSDK_TAG";
    public static final String USERCENTER_SP_SUFFIX = "_suffix_usercenter_sharepreference";
    public static final String UWS_PRODUCT_ID = "UC_VIP";
    public static final String VIP_SCHEME = "ucvip";
    public static final int VISUAL_MODEL_LIGHT = 1;
    public static final int VISUAL_MODEL_NIGHT = 2;
    private static String app_C;
    private static final String SDK_APPID_RELEASE = AcAppUtils.encrypt(";98?>>:9", 8);
    private static final String SDK_APPKEY_RELEASE = AcAppUtils.encrypt(":1;<?89?0<n:;m;=i=8<>>ki=i1;ll09", 8);
    private static final String SDK_APPID_TEST = AcAppUtils.encrypt("9", 8);
    private static final String SDK_APPKEY_TEST = AcAppUtils.encrypt("bnq", 8);
    public static final String APP_K = getSdkAppKey();

    public static class a {
        public static String a;
        public static String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f20262c = UCCommonXor8Provider.getNormalStrByDecryptXOR8("}k~ax2''~ax&}{mzkmf|mz&`mq|ix&kge");
        public static final String d = UCCommonXor8Provider.getNormalStrByDecryptXOR8("}k~ax2''~ax&}{mzkmf|mz&`mq|ix&kge") + "/vipMain?";

        static {
            UCCommonXor8Provider.getNormalStrByDecryptXOR8("}k~ax2''~ax&}{mzkmf|mz&`mq|ix&kge");
        }
    }

    public static String getAppC() {
        return app_C;
    }

    public static String getSdkAppId() {
        return (EnvConstantManager.getInstance().ENV() == 1 || EnvConstantManager.getInstance().ENV() == 2 || EnvConstantManager.getInstance().ENV() == 3) ? SDK_APPID_TEST : SDK_APPID_RELEASE;
    }

    public static String getSdkAppKey() {
        return (EnvConstantManager.getInstance().ENV() == 1 || EnvConstantManager.getInstance().ENV() == 2 || EnvConstantManager.getInstance().ENV() == 3) ? SDK_APPKEY_TEST : SDK_APPKEY_RELEASE;
    }

    public static void setAppC(String str) {
        app_C = str;
    }
}
