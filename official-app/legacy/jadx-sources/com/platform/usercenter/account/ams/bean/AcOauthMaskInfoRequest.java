package com.platform.usercenter.account.ams.bean;

import android.text.TextUtils;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class AcOauthMaskInfoRequest {
    private String appId;
    private String appKey;
    private List<String> scopeList;

    @Keep
    public static class Builder {
        private String appId;
        private String appKey;
        private List<String> scopeList = new ArrayList();

        public Builder addScope(String str) {
            if (!TextUtils.isEmpty(str) && !this.scopeList.contains(str)) {
                this.scopeList.add(str);
            }
            return this;
        }

        public AcOauthMaskInfoRequest build() {
            if (TextUtils.isEmpty(this.appId)) {
                throw new IllegalArgumentException("Please set appId!");
            }
            if (TextUtils.isEmpty(this.appKey)) {
                throw new IllegalArgumentException("Please set appKey!");
            }
            if (this.scopeList.isEmpty()) {
                throw new IllegalArgumentException("Please add scope!");
            }
            return new AcOauthMaskInfoRequest(this.appId, this.appKey, this.scopeList);
        }

        public Builder setAppId(String str) {
            this.appId = str;
            return this;
        }

        public Builder setAppKey(String str) {
            this.appKey = str;
            return this;
        }
    }

    public String getAppId() {
        return this.appId;
    }

    public String getAppKey() {
        return this.appKey;
    }

    public List<String> getScopeList() {
        return this.scopeList;
    }

    private AcOauthMaskInfoRequest(String str, String str2, List<String> list) {
        this.appId = str;
        this.appKey = str2;
        this.scopeList = list;
    }
}
