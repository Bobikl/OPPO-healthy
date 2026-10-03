package com.heytap.usercenter.accountsdk.http;

import com.heytap.usercenter.accountsdk.AccountSDKConfig;
import com.heytap.usercenter.accountsdk.BuildConfig;
import com.platform.usercenter.basic.annotation.Host;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.annotation.Path;
import com.platform.usercenter.tools.algorithm.XORUtils;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Host(host_dev = BuildConfig.HOST_TEST_3_XOR8, host_release = BuildConfig.HOST_RELEASE_XOR8, host_test1 = BuildConfig.HOST_TEST_1_XOR8, host_test3 = BuildConfig.HOST_TEST_3_XOR8)
@Deprecated
public class UCAccountHostParam extends UCBaseRequest {
    @Override // com.heytap.usercenter.accountsdk.http.UCBaseRequest
    public String getAnnotationUrl() {
        if (!(getClass().isAnnotationPresent(Host.class) && getClass().isAnnotationPresent(Path.class))) {
            throw new IllegalStateException("must make this class of annotations Host and Path");
        }
        Path path = (Path) getClass().getAnnotation(Path.class);
        Host host = (Host) getClass().getAnnotation(Host.class);
        if (AccountSDKConfig.sEnv == AccountSDKConfig.ENV.ENV_TEST_1) {
            return String.format(Locale.US, "%s%s", XORUtils.encrypt(host.host_test1(), 8), path.path());
        }
        if (AccountSDKConfig.sEnv == AccountSDKConfig.ENV.ENV_TEST_3) {
            return String.format(Locale.US, "%s%s", XORUtils.encrypt(host.host_test3(), 8), path.path());
        }
        return AccountSDKConfig.sEnv == AccountSDKConfig.ENV.ENV_DEV ? String.format(Locale.US, "%s%s", XORUtils.encrypt(host.host_dev(), 8), path.path()) : String.format(Locale.US, "%s%s", XORUtils.encrypt(host.host_release(), 8), path.path());
    }

    @Override // com.heytap.usercenter.accountsdk.http.UCBaseRequest
    public String getRequestBody() {
        return super.getRequestBody();
    }

    @Override // com.heytap.usercenter.accountsdk.http.UCBaseRequest
    public String getUrl() {
        return getAnnotationUrl();
    }
}
