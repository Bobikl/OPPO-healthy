package com.platform.usercenter.sdk.verifysystembasic.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class VerifyBusinessParamConfig implements Parcelable {
    public static final Parcelable.Creator<VerifyBusinessParamConfig> CREATOR = new Parcelable.Creator<VerifyBusinessParamConfig>() { // from class: com.platform.usercenter.sdk.verifysystembasic.data.VerifyBusinessParamConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VerifyBusinessParamConfig createFromParcel(Parcel parcel) {
            return new VerifyBusinessParamConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public VerifyBusinessParamConfig[] newArray(int i) {
            return new VerifyBusinessParamConfig[i];
        }
    };
    private final String appId;
    private final String businessId;
    private String deviceId;
    private final boolean isExp;
    private final boolean isOpen;
    private final String mCurBrand;
    private String mCurRegion;
    private final String mOperateType;
    private final String mk;
    private final String ms;
    private final String processToken;
    private final String requestCode;
    private final String ssoId;
    private final String userToken;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getBusinessId() {
        return this.businessId;
    }

    public String getCurBrand() {
        return this.mCurBrand;
    }

    public String getCurRegion() {
        return this.mCurRegion;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getMS() {
        return this.ms;
    }

    public String getMk() {
        return this.mk;
    }

    public String getOperateType() {
        return this.mOperateType;
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

    public boolean isExp() {
        return this.isExp;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mk);
        parcel.writeString(this.ms);
        parcel.writeString(this.appId);
        parcel.writeString(this.businessId);
        parcel.writeString(this.ssoId);
        parcel.writeString(this.processToken);
        parcel.writeString(this.userToken);
        parcel.writeString(this.requestCode);
        parcel.writeByte(this.isOpen ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isExp ? (byte) 1 : (byte) 0);
        parcel.writeString(this.mCurBrand);
        parcel.writeString(this.mCurRegion);
        parcel.writeString(this.mOperateType);
    }

    public VerifyBusinessParamConfig(Parcel parcel) {
        this.mCurRegion = "CN";
        this.mk = parcel.readString();
        this.ms = parcel.readString();
        this.appId = parcel.readString();
        this.businessId = parcel.readString();
        this.ssoId = parcel.readString();
        this.processToken = parcel.readString();
        this.userToken = parcel.readString();
        this.requestCode = parcel.readString();
        this.isOpen = parcel.readByte() != 0;
        this.isExp = parcel.readByte() != 0;
        this.mCurBrand = parcel.readString();
        this.mCurRegion = parcel.readString();
        this.mOperateType = parcel.readString();
    }

    private VerifyBusinessParamConfig(Builder builder) {
        this.mCurRegion = "CN";
        this.isOpen = builder.isOpen;
        this.isExp = builder.isExp;
        this.mCurBrand = builder.mCurBrand;
        this.mCurRegion = builder.mCurRegion;
        this.mk = builder.mk;
        this.ms = builder.ms;
        this.appId = builder.appId;
        this.businessId = builder.businessId;
        if (builder.deviceId == null) {
            this.deviceId = "";
        } else {
            this.deviceId = builder.deviceId;
        }
        this.userToken = builder.userToken;
        this.ssoId = builder.ssoId;
        this.processToken = builder.processToken;
        this.requestCode = builder.requestCode;
        this.mOperateType = builder.mOperateType;
    }

    @Keep
    public static class Builder implements Parcelable {
        public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() { // from class: com.platform.usercenter.sdk.verifysystembasic.data.VerifyBusinessParamConfig.Builder.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Builder createFromParcel(Parcel parcel) {
                return new Builder(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public Builder[] newArray(int i) {
                return new Builder[i];
            }
        };
        private String appId;
        private String businessId;
        private String deviceId;
        private boolean isExp;
        private boolean isOpen;
        private String mCurBrand;
        private String mCurRegion;
        private String mOperateType;
        private String mk;
        private String ms;
        private String processToken;
        private String requestCode;
        private String ssoId;
        private String userToken;

        public Builder(Parcel parcel) {
            this.requestCode = "";
            this.isOpen = false;
            this.isExp = false;
            this.mCurBrand = "";
            this.mCurRegion = "CN";
            this.mk = parcel.readString();
            this.ms = parcel.readString();
            this.appId = parcel.readString();
            this.businessId = parcel.readString();
            this.userToken = parcel.readString();
            this.ssoId = parcel.readString();
            this.requestCode = parcel.readString();
            this.processToken = parcel.readString();
            this.isOpen = parcel.readByte() != 0;
            this.isExp = parcel.readByte() != 0;
            this.mCurBrand = parcel.readString();
            this.mCurRegion = parcel.readString();
            this.mOperateType = parcel.readString();
        }

        public Builder addUserToken(String str) {
            this.userToken = str;
            return this;
        }

        public Builder appId(String str) {
            this.appId = str;
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

        public VerifyBusinessParamConfig create() {
            return new VerifyBusinessParamConfig(this);
        }

        public Builder curBrand(String str) {
            this.mCurBrand = str;
            return this;
        }

        public Builder curRegion(String str) {
            this.mCurRegion = str;
            return this;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public Builder deviceId(String str) {
            this.deviceId = str;
            return this;
        }

        public Builder isExp(boolean z) {
            this.isExp = z;
            return this;
        }

        public Builder isOpen(boolean z) {
            this.isOpen = z;
            return this;
        }

        public Builder operateType(String str) {
            this.mOperateType = str;
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

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mk);
            parcel.writeString(this.ms);
            parcel.writeString(this.appId);
            parcel.writeString(this.businessId);
            parcel.writeString(this.userToken);
            parcel.writeString(this.ssoId);
            parcel.writeString(this.requestCode);
            parcel.writeString(this.processToken);
            parcel.writeByte(this.isOpen ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.isExp ? (byte) 1 : (byte) 0);
            parcel.writeString(this.mCurBrand);
            parcel.writeString(this.mCurRegion);
            parcel.writeString(this.mOperateType);
        }

        public Builder() {
            this.requestCode = "";
            this.isOpen = false;
            this.isExp = false;
            this.mCurBrand = "";
            this.mCurRegion = "CN";
        }

        public Builder(VerifyBusinessParamConfig verifyBusinessParamConfig) {
            this.requestCode = "";
            this.isOpen = false;
            this.isExp = false;
            this.mCurBrand = "";
            this.mCurRegion = "CN";
            this.appId = verifyBusinessParamConfig.appId;
            this.mk = verifyBusinessParamConfig.mk;
            this.ms = verifyBusinessParamConfig.ms;
            this.businessId = verifyBusinessParamConfig.businessId;
            if (verifyBusinessParamConfig.deviceId == null) {
                verifyBusinessParamConfig.deviceId = "";
            }
            this.deviceId = verifyBusinessParamConfig.deviceId;
            this.mOperateType = verifyBusinessParamConfig.mOperateType;
            this.isExp = verifyBusinessParamConfig.isExp;
            this.isOpen = verifyBusinessParamConfig.isOpen;
            this.mCurBrand = verifyBusinessParamConfig.mCurBrand;
            this.mCurRegion = verifyBusinessParamConfig.mCurRegion;
            this.ssoId = verifyBusinessParamConfig.ssoId;
            this.userToken = verifyBusinessParamConfig.userToken;
            this.processToken = verifyBusinessParamConfig.processToken;
            this.requestCode = verifyBusinessParamConfig.requestCode;
        }
    }
}
