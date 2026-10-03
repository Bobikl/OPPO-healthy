package com.oplus.accountsdk.base.account.config;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.oplus.aiunit.vision.xa;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcAccountConfig implements Serializable {
    private static String TAG = "AcAccountConfig";
    private String appI;
    private String appK;
    boolean isHost;
    private boolean isOpHeytap;

    @Keep
    public static class Builder {
        String appI;
        String appK;
        boolean isOpHeytap = false;
        boolean isHost = false;

        public AcAccountConfig create() {
            String str = this.appI;
            String str2 = this.appK;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalStateException("Please add appi into AmsSignInConfig");
            }
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalStateException("Please add appK into AmsSignInConfig");
            }
            return new AcAccountConfig(str, str2, this.isOpHeytap, this.isHost);
        }

        public Builder setAppI(String str) {
            this.appI = str;
            return this;
        }

        public Builder setAppK(String str) {
            this.appK = str;
            return this;
        }

        public Builder setHost(boolean z) {
            this.isHost = z;
            return this;
        }

        public Builder setIsOpHeytap(boolean z) {
            this.isOpHeytap = z;
            AcLogUtil.i(AcAccountConfig.TAG, "setIsOpHeytap " + z);
            return this;
        }
    }

    public AcAccountConfig(String str, String str2, boolean z, boolean z2) {
        this.appI = str;
        this.appK = str2;
        this.isOpHeytap = z;
        this.isHost = z2;
    }

    public String getAppI() {
        return this.appI;
    }

    public String getAppK() {
        return this.appK;
    }

    public boolean isHost() {
        return this.isHost;
    }

    public boolean isOpHeytap() {
        return this.isOpHeytap;
    }

    @NonNull
    public String toString() {
        return xa.d(this);
    }
}
