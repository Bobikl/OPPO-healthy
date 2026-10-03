package com.heytap.statistics.config;

import android.content.Context;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class SDKConfig {
    private boolean mCloseImeI;
    private boolean mFirstUseOutOpenId;
    private boolean mIsCtaCheckPass;
    private boolean mIsDebug;
    private boolean mIsSwitchOn;
    private boolean mIsTraceError;
    private boolean mTimeSwitchOn;

    @Keep
    public static class Builder {
        private boolean mIsSwitchOn = true;
        private boolean mIsDebug = false;
        private boolean mIsCtaCheckPass = true;
        private boolean mIsTraceError = true;
        private boolean mTimeSwitchOn = false;
        private boolean mCloseImeI = false;
        private boolean mFirstUseOutOpenId = true;

        public SDKConfig build() {
            return new SDKConfig(this);
        }

        public Builder setCloseImeI(boolean z) {
            this.mCloseImeI = z;
            return this;
        }

        public Builder setCtaCheckPass(boolean z) {
            this.mIsCtaCheckPass = z;
            return this;
        }

        public Builder setDebug(boolean z) {
            this.mIsDebug = z;
            return this;
        }

        public Builder setFirstUseOutOpenId(boolean z) {
            this.mFirstUseOutOpenId = z;
            return this;
        }

        public Builder setSwitchOn(boolean z) {
            this.mIsSwitchOn = z;
            return this;
        }

        public Builder setTimeSwitchOn(boolean z) {
            this.mTimeSwitchOn = z;
            return this;
        }

        public Builder setTraceError(boolean z) {
            this.mIsTraceError = z;
            return this;
        }
    }

    public void update(Context context) {
    }

    private SDKConfig(Builder builder) {
        this.mIsSwitchOn = builder.mIsSwitchOn;
        this.mIsDebug = builder.mIsDebug;
        this.mIsCtaCheckPass = builder.mIsCtaCheckPass;
        this.mIsTraceError = builder.mIsTraceError;
        this.mTimeSwitchOn = builder.mTimeSwitchOn;
        this.mCloseImeI = builder.mCloseImeI;
        this.mFirstUseOutOpenId = builder.mFirstUseOutOpenId;
    }
}
