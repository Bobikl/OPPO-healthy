package com.oplus.accountsdk.base.account.config;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.heytap.health.safety.safetycheck.SafetyCheckManager;
import com.oplus.aiunit.vision.qbm;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcOpenAccountConfig extends AcAccountConfig {
    private String brand;
    private String country;

    @Keep
    public enum Brand {
        BRAND_OPPO(qbm.b),
        BRAND_REALME("realme"),
        BRAND_ONEPLUS("oneplus"),
        BRAND_HEYTAP(SafetyCheckManager.CHANNEL_HEYTAP);

        private final String mBrand;

        Brand(String str) {
            this.mBrand = str;
        }

        public String getName() {
            return this.mBrand;
        }
    }

    @Keep
    public static class Builder {
        String appI;
        String appK;
        String openId = "";
        String country = "CN";
        String brand = Brand.BRAND_HEYTAP.getName();
        boolean isHost = false;

        public AcOpenAccountConfig create() {
            if (TextUtils.isEmpty(this.appI) || TextUtils.isEmpty(this.appK) || TextUtils.isEmpty(this.brand) || TextUtils.isEmpty(this.country)) {
                return null;
            }
            return new AcOpenAccountConfig(this.appI, this.appK, this.country, this.brand, this.isHost);
        }

        public Builder setAppI(String str) {
            this.appI = str;
            return this;
        }

        public Builder setAppK(String str) {
            this.appK = str;
            return this;
        }

        public Builder setBrand(Brand brand) {
            this.brand = brand.getName();
            return this;
        }

        public Builder setCountry(String str) {
            this.country = str;
            return this;
        }

        public Builder setHost(Boolean bool) {
            this.isHost = bool.booleanValue();
            return this;
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public String getCountry() {
        return this.country;
    }

    private AcOpenAccountConfig(String str, String str2, String str3, String str4, boolean z) {
        super(str, str2, false, z);
        this.country = str3;
        this.brand = str4;
    }
}
