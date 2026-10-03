package com.heytap.usercenter.accountsdk;

import android.content.Context;
import androidx.annotation.Keep;
import com.heytap.usercenter.accountsdk.utils.UCAccountXor8Provider;
import com.platform.usercenter.BaseApp;
import com.platform.usercenter.basic.provider.UCCommonXor8Provider;
import com.platform.usercenter.tools.ApkInfoHelper;
import com.platform.usercenter.tools.datastructure.StringUtil;
import com.platform.usercenter.tools.device.UCDeviceInfoUtil;
import com.platform.usercenter.tools.os.UCRuntimeEnvironment;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class AccountSDKConfig {
    private static final String BRAND_HT = UCAccountXor8Provider.getConstantsHTXor8();

    @Deprecated
    public static ENV sEnv = ENV.ENV_RELEASE;
    public final String apid;
    public final String auid;
    public final String brand;
    public final String currentArea;
    public final String duid;
    public final ENV env;
    public final String guid;
    public final boolean isOverseaOp;
    public final boolean isShowGuest;
    public final Context mContext;
    public final AcExtension mExtension;
    public final String ouid;
    public final boolean showOpLogin;

    @Keep
    public enum ENV {
        ENV_RELEASE(0),
        ENV_TEST_1(1),
        ENV_TEST_3(2),
        ENV_DEV(3),
        ENV_PRE(4),
        ENV_OP_RELEASE(5),
        ENV_OP_TEST_1(6),
        ENV_OP_TEST_3(7);

        ENV(int i) {
        }
    }

    public boolean isOverseaOp() {
        return this.isOverseaOp;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    @Keep
    public static class Builder {
        private String apid;
        private String auid;
        private String brand;
        private String currentArea;
        private String duid;

        @Deprecated
        ENV env;
        private String guid;
        private Boolean isOverseaOp;
        private boolean isShowGuest;
        private Context mContext;
        private AcExtension mExtension;
        private String ouid;
        private ENV realEnv;
        private boolean showOpLogin;

        public Builder() {
            this.showOpLogin = false;
        }

        public Builder apid(String str) {
            this.apid = str;
            return this;
        }

        public Builder area(String str) {
            this.currentArea = str;
            return this;
        }

        public Builder auid(String str) {
            this.auid = str;
            return this;
        }

        public Builder brand(String str) {
            this.brand = str;
            return this;
        }

        @Deprecated
        public Builder build() {
            return this;
        }

        public Builder context(Context context) {
            this.mContext = context;
            return this;
        }

        public AccountSDKConfig create() {
            if (this.mContext == null) {
                this.mContext = BaseApp.mContext;
            }
            if (this.realEnv == null) {
                this.realEnv = ENV.ENV_RELEASE;
            }
            if (StringUtil.isEmpty(this.currentArea)) {
                this.currentArea = UCDeviceInfoUtil.getCurRegion();
            }
            if (StringUtil.isEmpty(this.brand)) {
                this.brand = AccountSDKConfig.BRAND_HT;
            }
            if (this.mExtension == null) {
                this.mExtension = new com.heytap.usercenter.accountsdk.a();
            }
            if (this.isOverseaOp == null) {
                this.isOverseaOp = Boolean.valueOf(UCDeviceInfoUtil.isRed(this.mContext) && UCRuntimeEnvironment.sIsExp && ApkInfoHelper.getVersionCode(this.mContext, UCCommonXor8Provider.getPkgnameOpHtXor8()) >= 82800);
            }
            return new AccountSDKConfig(this);
        }

        public Builder duid(String str) {
            this.duid = str;
            return this;
        }

        public Builder env(ENV env) {
            this.env = env;
            this.realEnv = env;
            return this;
        }

        public Builder extension(AcExtension acExtension) {
            this.mExtension = acExtension;
            return this;
        }

        public Builder guid(String str) {
            this.guid = str;
            return this;
        }

        public Builder ouid(String str) {
            this.ouid = str;
            return this;
        }

        public Builder setOverseaOp(Boolean bool) {
            this.isOverseaOp = bool;
            return this;
        }

        public Builder setShowGuest(boolean z) {
            this.isShowGuest = z;
            return this;
        }

        public Builder showOpLogin(boolean z) {
            this.showOpLogin = z;
            return this;
        }

        public Builder(AccountSDKConfig accountSDKConfig) {
            this.showOpLogin = false;
            this.guid = accountSDKConfig.guid;
            this.ouid = accountSDKConfig.ouid;
            this.duid = accountSDKConfig.duid;
            this.auid = accountSDKConfig.auid;
            this.apid = accountSDKConfig.apid;
            this.isShowGuest = accountSDKConfig.isShowGuest;
            this.currentArea = accountSDKConfig.currentArea;
            this.brand = accountSDKConfig.brand;
            this.showOpLogin = accountSDKConfig.showOpLogin;
            this.isOverseaOp = Boolean.valueOf(accountSDKConfig.isOverseaOp);
            this.realEnv = accountSDKConfig.env;
            this.mExtension = accountSDKConfig.mExtension;
        }
    }

    private AccountSDKConfig(Builder builder) {
        this.guid = builder.guid;
        this.ouid = builder.ouid;
        this.duid = builder.duid;
        this.auid = builder.auid;
        this.apid = builder.apid;
        this.currentArea = builder.currentArea;
        this.brand = builder.brand;
        this.showOpLogin = builder.showOpLogin;
        this.isOverseaOp = builder.isOverseaOp.booleanValue();
        this.mContext = builder.mContext;
        this.env = builder.realEnv;
        sEnv = builder.realEnv;
        this.isShowGuest = builder.isShowGuest;
        this.mExtension = builder.mExtension;
    }
}
