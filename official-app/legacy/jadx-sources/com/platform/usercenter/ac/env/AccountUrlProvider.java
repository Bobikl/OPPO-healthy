package com.platform.usercenter.ac.env;

import androidx.annotation.Keep;
import com.heytap.usercenter.accountsdk.BuildConfig;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Deprecated
public class AccountUrlProvider {
    private static boolean IS_DEBUG = false;
    private boolean mIsOp;
    private static String PRODUCT_HOST = AcUrlUtils.encrypt(BuildConfig.HOST_RELEASE_XOR8, 8);
    private static String PRODUCT_OP_HOST = AcUrlUtils.encrypt("`||x{2''}k%gfmxd}{kdamf|%od&`mq|ixegjadm&kge'", 8);
    private static String PRODUCT_WEB_HOST = AcUrlUtils.encrypt("`||x{2''e}k&`mq|ix&kge'", 8);
    private static String PRODUCT_OP_WEB_HOST = AcUrlUtils.encrypt("`||x{2''}k%`=&gfmxd}{&kge'", 8);

    public static class Builder {
        private boolean mIsOP = false;

        public AccountUrlProvider create() {
            return new AccountUrlProvider(this);
        }

        @Deprecated
        public Builder exp(boolean z) {
            return this;
        }

        public Builder opUrl(boolean z) {
            this.mIsOP = z;
            return this;
        }

        @Deprecated
        public Builder serverUrl(int i) {
            return this;
        }

        @Deprecated
        public Builder webUrl(int i) {
            return this;
        }
    }

    public static boolean isDebug() {
        return IS_DEBUG;
    }

    public String getH5StaticUrl() {
        return this.mIsOp ? PRODUCT_OP_WEB_HOST : PRODUCT_WEB_HOST;
    }

    public String getServerUrl() {
        return this.mIsOp ? PRODUCT_OP_HOST : PRODUCT_HOST;
    }

    private AccountUrlProvider(Builder builder) {
        this.mIsOp = builder.mIsOP;
    }
}
