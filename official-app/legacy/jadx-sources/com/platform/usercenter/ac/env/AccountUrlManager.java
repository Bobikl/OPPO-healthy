package com.platform.usercenter.ac.env;

import android.content.Context;
import androidx.annotation.Keep;
import com.heytap.usercenter.accountsdk.BuildConfig;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AccountUrlManager {
    private static boolean IS_DEBUG = false;
    private static int env = 0;
    private static boolean mIsOp = false;
    private static boolean needCheckMeta = true;
    private static String openAB = AcUrlUtils.encrypt(";kl<0j8k?090;=<?0j8i9?0;i1mnn8k1", 8);
    private static String openAS = AcUrlUtils.encrypt("lk1<1;8j0<k<;m?>1>in1jn9<jk<=j>=", 8);
    private static String PRODUCT_HOST = AcUrlUtils.encrypt(BuildConfig.HOST_RELEASE_XOR8, 8);
    private static String PRODUCT_OP_HOST = AcUrlUtils.encrypt("`||x{2''}k%gfmxd}{kdamf|%od&`mq|ixegjadm&kge'", 8);
    private static String PRODUCT_WEB_HOST = AcUrlUtils.encrypt("`||x{2''e}k&`mq|ix&kge'", 8);
    private static String PRODUCT_OP_WEB_HOST = AcUrlUtils.encrypt("`||x{2''}k%`=&gfmxd}{&kge'", 8);
    private static String PRODUCT_WEB_LOGIN_HOST = AcUrlUtils.encrypt("`||x{2''al&`mq|ix&kge'", 8);
    private static String PRODUCT_TRACK_HOST = AcUrlUtils.encrypt("`||x{2''}k%|zikc%od&`mq|ixegja&kge'", 8);
    private static String PEODUCT_OP_TRACK_HOST = AcUrlUtils.encrypt("`||x{2''}k%|zikc%od&gfmxd}{&kge", 8);

    private AccountUrlManager() {
    }

    public static int getEnv() {
        return env;
    }

    public static String getH5StaticUrl() {
        return mIsOp ? PRODUCT_OP_WEB_HOST : PRODUCT_WEB_HOST;
    }

    public static String getOpenAB() {
        return openAB;
    }

    public static String getOpenAS() {
        return openAS;
    }

    public static String getServerUrl() {
        return mIsOp ? PRODUCT_OP_HOST : PRODUCT_HOST;
    }

    public static String getTrackHost() {
        return mIsOp ? PEODUCT_OP_TRACK_HOST : PRODUCT_TRACK_HOST;
    }

    public static String getWebLoginUrl() {
        return PRODUCT_WEB_LOGIN_HOST;
    }

    public static void init(Context context, boolean z) {
        mIsOp = z;
        if (needCheckMeta) {
            needCheckMeta = false;
            AcEnvMetaUtil.checkMeta(context);
        }
    }

    @Deprecated
    public static boolean isDebug() {
        return IS_DEBUG;
    }

    public static boolean isDebugMode() {
        return IS_DEBUG;
    }

    public static String getServerUrl(boolean z) {
        return z ? PRODUCT_OP_HOST : PRODUCT_HOST;
    }
}
