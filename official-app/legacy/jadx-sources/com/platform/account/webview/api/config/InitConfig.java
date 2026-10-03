package com.platform.account.webview.api.config;

import android.content.Context;
import androidx.annotation.Keep;
import com.platform.account.webview.api.IJsApiInterceptor;
import com.platform.account.webview.api.IWebLogCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class InitConfig {
    private String mBrand;
    private Context mContext;
    private List<String> mExtUserAgentList;
    private boolean mIsDebug;
    private boolean mIsOpenSdk;
    private IJsApiInterceptor mJsApiInterceptor;
    private String mRegionCode;
    private IWebLogCallback mWebLogCallback;

    @Keep
    public static class Builder {
        private String mBrand;
        private Context mContext;
        private List<String> mExtUserAgent = new ArrayList();
        private boolean mIsDebug;
        private boolean mIsOpenSdk;
        private IJsApiInterceptor mJsApiInterceptor;
        private String mRegionCode;
        private IWebLogCallback mWebLogCallback;

        public Builder(Context context) {
            this.mContext = context;
        }

        public Builder addExtUserAgent(String str) {
            this.mExtUserAgent.add(str);
            return this;
        }

        public InitConfig build() {
            if (this.mContext == null) {
                throw new IllegalArgumentException("context must not be null");
            }
            if (this.mJsApiInterceptor != null) {
                return new InitConfig(this);
            }
            throw new IllegalArgumentException("jsApiInterceptor must not be null");
        }

        public Builder setBrand(String str) {
            this.mBrand = str;
            return this;
        }

        public Builder setIsDebug(boolean z) {
            this.mIsDebug = z;
            return this;
        }

        public Builder setIsOpenSdk(boolean z) {
            this.mIsOpenSdk = z;
            return this;
        }

        public Builder setJsApiInterceptor(IJsApiInterceptor iJsApiInterceptor) {
            this.mJsApiInterceptor = iJsApiInterceptor;
            return this;
        }

        public Builder setRegionCode(String str) {
            this.mRegionCode = str;
            return this;
        }

        public Builder setWebLogCallback(IWebLogCallback iWebLogCallback) {
            this.mWebLogCallback = iWebLogCallback;
            return this;
        }
    }

    public String getBrand() {
        return this.mBrand;
    }

    public Context getContext() {
        return this.mContext;
    }

    public List<String> getExtUserAgentList() {
        return this.mExtUserAgentList;
    }

    public IJsApiInterceptor getJsApiInterceptor() {
        return this.mJsApiInterceptor;
    }

    public String getRegionCode() {
        return this.mRegionCode;
    }

    public IWebLogCallback getWebLogCallback() {
        return this.mWebLogCallback;
    }

    public boolean isDebug() {
        return this.mIsDebug;
    }

    public boolean isOpenSdk() {
        return this.mIsOpenSdk;
    }

    public void setBrand(String str) {
        this.mBrand = str;
    }

    public void setContext(Context context) {
        this.mContext = context;
    }

    public void setIsDebug(boolean z) {
        this.mIsDebug = z;
    }

    public void setIsOpenSdk(boolean z) {
        this.mIsOpenSdk = z;
    }

    public void setJsApiInterceptor(IJsApiInterceptor iJsApiInterceptor) {
        this.mJsApiInterceptor = iJsApiInterceptor;
    }

    public void setRegionCode(String str) {
        this.mRegionCode = str;
    }

    public void setWebLogCallback(IWebLogCallback iWebLogCallback) {
        this.mWebLogCallback = iWebLogCallback;
    }

    private InitConfig(Builder builder) {
        this.mExtUserAgentList = new ArrayList();
        this.mContext = builder.mContext;
        this.mJsApiInterceptor = builder.mJsApiInterceptor;
        this.mIsOpenSdk = builder.mIsOpenSdk;
        this.mRegionCode = builder.mRegionCode;
        this.mBrand = builder.mBrand;
        this.mIsDebug = builder.mIsDebug;
        this.mExtUserAgentList.addAll(builder.mExtUserAgent);
        this.mWebLogCallback = builder.mWebLogCallback;
    }
}
