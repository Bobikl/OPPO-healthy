package com.oplus.accountsdk.base.sdk.verifysystembasic.data;

import android.text.TextUtils;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class VerifyParam {
    private final String appI;
    private final String businessId;
    private String extraCallbackScene;
    private final String mk;
    private final String ms;
    private final String operateType;
    private final String processToken;
    private final String requestCode;
    private final String ssoId;
    private final String userToken;

    public String getAppI() {
        return this.appI;
    }

    public String getBusinessId() {
        return this.businessId;
    }

    public String getExtraCallbackScene() {
        return this.extraCallbackScene;
    }

    public String getMk() {
        return this.mk;
    }

    public String getMs() {
        return this.ms;
    }

    public String getOperateType() {
        return this.operateType;
    }

    public String getProcessToken() {
        return this.processToken;
    }

    public String getRequestCode() {
        return this.requestCode;
    }

    public String getSsoId() {
        return this.ssoId;
    }

    public String getUserToken() {
        return this.userToken;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    @Keep
    public static class Builder {
        private String appI;
        private String businessId;
        private String extraCallbackScene;
        private String mk;
        private String ms;
        private String operateType;
        private String processToken;
        private String requestCode;
        private String ssoId;
        private String userToken;

        public Builder() {
            this.requestCode = "";
        }

        public Builder appI(String str) {
            this.appI = str;
            return this;
        }

        public Builder bizk(String str) {
            this.mk = str;
            return this;
        }

        public Builder bizs(String str) {
            this.ms = str;
            return this;
        }

        public Builder businessId(String str) {
            this.businessId = str;
            return this;
        }

        public VerifyParam create() {
            if (TextUtils.isEmpty(this.ms)) {
                throw new IllegalArgumentException("please init ms");
            }
            if (TextUtils.isEmpty(this.mk)) {
                throw new IllegalArgumentException("please init mk");
            }
            if (TextUtils.isEmpty(this.appI)) {
                throw new IllegalArgumentException("please init appI");
            }
            if (TextUtils.isEmpty(this.businessId)) {
                throw new IllegalArgumentException("please init businessId");
            }
            if (TextUtils.isEmpty(this.operateType)) {
                throw new IllegalArgumentException("please init operateType");
            }
            if ((TextUtils.isEmpty(this.userToken) || (TextUtils.isEmpty(this.processToken) && TextUtils.isEmpty(this.ssoId))) ? false : true) {
                throw new IllegalArgumentException(" param only require userToken or  ssoId or processToken");
            }
            if ((!TextUtils.isEmpty(this.userToken) || TextUtils.isEmpty(this.ssoId) || TextUtils.isEmpty(this.processToken)) ? false : true) {
                throw new IllegalArgumentException(" param only require ssoId or processToken");
            }
            if (TextUtils.isEmpty(this.requestCode)) {
                this.requestCode = this.businessId;
            }
            return new VerifyParam(this);
        }

        public Builder extraCallbackScene(String str) {
            this.extraCallbackScene = str;
            return this;
        }

        public Builder operateType(String str) {
            this.operateType = str;
            return this;
        }

        public Builder processToken(String str) {
            this.processToken = str;
            return this;
        }

        public Builder requestCode(String str) {
            this.requestCode = str;
            return this;
        }

        public Builder ssoId(String str) {
            this.ssoId = str;
            return this;
        }

        public Builder userToken(String str) {
            this.userToken = str;
            return this;
        }

        public Builder(VerifyParam verifyParam) {
            this.requestCode = "";
            this.appI = verifyParam.appI;
            this.mk = verifyParam.mk;
            this.ms = verifyParam.ms;
            this.businessId = verifyParam.businessId;
            this.operateType = verifyParam.operateType;
            this.ssoId = verifyParam.ssoId;
            this.userToken = verifyParam.userToken;
            this.processToken = verifyParam.processToken;
            this.requestCode = verifyParam.requestCode;
            this.extraCallbackScene = verifyParam.extraCallbackScene;
        }
    }

    private VerifyParam(Builder builder) {
        this.extraCallbackScene = "";
        this.mk = builder.mk;
        this.ms = builder.ms;
        this.appI = builder.appI;
        this.businessId = builder.businessId;
        this.userToken = builder.userToken;
        this.ssoId = builder.ssoId;
        this.processToken = builder.processToken;
        this.requestCode = builder.requestCode;
        this.operateType = builder.operateType;
        this.extraCallbackScene = builder.extraCallbackScene;
    }
}
