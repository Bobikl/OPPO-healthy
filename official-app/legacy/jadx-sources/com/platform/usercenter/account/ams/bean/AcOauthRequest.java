package com.platform.usercenter.account.ams.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcOauthRequest {
    private String appId;
    private String appKey;
    private String scope;
    private String state;

    @Keep
    public static class Builder {
        private String appId;
        private String appKey;
        private String scope;
        private String state;

        public AcOauthRequest build() {
            if (TextUtils.isEmpty(this.appId)) {
                throw new IllegalArgumentException("Please set appId!");
            }
            if (TextUtils.isEmpty(this.appKey)) {
                throw new IllegalArgumentException("Please set appKey!");
            }
            if (TextUtils.isEmpty(this.state)) {
                throw new IllegalArgumentException("Please set state!");
            }
            if (TextUtils.isEmpty(this.scope)) {
                throw new IllegalArgumentException("Please set scope!");
            }
            return new AcOauthRequest(this.appId, this.appKey, this.state, this.scope);
        }

        public Builder setAppId(String str) {
            this.appId = str;
            return this;
        }

        public Builder setAppKey(String str) {
            this.appKey = str;
            return this;
        }

        public Builder setScope(String str) {
            this.scope = str;
            return this;
        }

        public Builder setState(String str) {
            this.state = str;
            return this;
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public String getScope() {
        return this.scope;
    }

    public String getState() {
        return this.state;
    }

    public String toString() {
        return "AcOAuthRequest{appId='" + this.appId + "', appKey='" + this.appKey + "', state='" + this.state + "', scope='" + this.scope + "'}";
    }

    private AcOauthRequest(String str, String str2, String str3, String str4) {
        this.appId = str;
        this.appKey = str2;
        this.state = str3;
        this.scope = str4;
    }
}
