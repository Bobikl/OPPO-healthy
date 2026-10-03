package com.heytap.usercenter.accountsdk.http;

import com.heytap.usercenter.accountsdk.AccountAgentClient;
import com.heytap.usercenter.accountsdk.AccountSDKConfig;
import com.heytap.usercenter.accountsdk.BuildConfig;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.tools.algorithm.XORUtils;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class UCNetworkManager extends UCBaseNetworkManager {
    private static final String SERVER_RELEASE_URL = XORUtils.encrypt(BuildConfig.HOST_RELEASE_XOR8, 8);
    private static final String SERVER_OPS_RELEASE_URL = XORUtils.encrypt(BuildConfig.HOST_OP_RELEASE_XOR8, 8);
    private static final String SERVER_OPS_US_TEST_URL = XORUtils.encrypt(BuildConfig.HOST_OP_TEST_1_XOR8, 8);
    private static final String SERVER_OPS_IN_TEST_URL = XORUtils.encrypt(BuildConfig.HOST_OP_TEST_3_XOR8, 8);
    private static final String SERVER_TEST1_URL = XORUtils.encrypt(BuildConfig.HOST_TEST_1_XOR8, 8);
    private static final String SERVER_TEST3_URL = XORUtils.encrypt(BuildConfig.HOST_TEST_3_XOR8, 8);
    private static final String SERVER_DEV_URL = XORUtils.encrypt(BuildConfig.HOST_DEV_XOR8, 8);

    @Keep
    public static class UCNetworkManagerHolder {
        private static final UCNetworkManager INSTANCE = new UCNetworkManager(null);

        private UCNetworkManagerHolder() {
        }
    }

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AccountSDKConfig.ENV.values().length];
            a = iArr;
            try {
                iArr[AccountSDKConfig.ENV.ENV_TEST_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AccountSDKConfig.ENV.ENV_TEST_3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AccountSDKConfig.ENV.ENV_DEV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AccountSDKConfig.ENV.ENV_OP_RELEASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AccountSDKConfig.ENV.ENV_OP_TEST_1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[AccountSDKConfig.ENV.ENV_OP_TEST_3.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public /* synthetic */ UCNetworkManager(a aVar) {
        this();
    }

    public static UCNetworkManager getInstance() {
        return UCNetworkManagerHolder.INSTANCE;
    }

    @Override // com.heytap.usercenter.accountsdk.http.UCBaseNetworkManager
    public String getUrlByEnvironment() {
        boolean zIsOverseaOp = AccountAgentClient.get().getConfig() != null ? AccountAgentClient.get().getConfig().isOverseaOp() : false;
        switch (a.a[AccountSDKConfig.sEnv.ordinal()]) {
            case 1:
                return zIsOverseaOp ? SERVER_OPS_US_TEST_URL : SERVER_TEST1_URL;
            case 2:
                return zIsOverseaOp ? SERVER_OPS_IN_TEST_URL : SERVER_TEST3_URL;
            case 3:
                return zIsOverseaOp ? SERVER_OPS_IN_TEST_URL : SERVER_DEV_URL;
            case 4:
                return SERVER_OPS_RELEASE_URL;
            case 5:
                return SERVER_OPS_US_TEST_URL;
            case 6:
                return SERVER_OPS_IN_TEST_URL;
            default:
                return zIsOverseaOp ? SERVER_OPS_RELEASE_URL : SERVER_RELEASE_URL;
        }
    }

    private UCNetworkManager() {
    }
}
