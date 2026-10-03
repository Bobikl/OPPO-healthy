package com.heytap.omas.omkms.data;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.mna;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public final class InitParamSpec implements h {
    public static final int SIGN_MODE_AUTO = 0;
    public static final int SIGN_MODE_WB = 1;
    private static final String TAG = "InitParamSpec";
    private byte[] accessKey;
    private byte[] appName;
    private AreaCode areaCode;
    private String cipherProvider;
    private String countryCode;
    private byte[] deviceId;
    private EnvConfig envConfig;

    @b
    private int signMode;
    private String ticketAuthMode;
    private byte[] wbId;
    private byte[] wbKeyId;
    private int wbVersion;

    @Keep
    public static final class Builder {
        private byte[] accessKey;
        private byte[] appName;
        private AreaCode areaCode;
        private String cipherProvider;
        private String countryCode;
        private byte[] deviceId;
        private EnvConfig envConfig;
        private volatile boolean isWbAuth;

        @b
        private int signMode;
        private byte[] wbId;
        private byte[] wbKeyId;
        private int wbVersion;

        private Builder(@NonNull byte[] bArr) {
            this.isWbAuth = false;
            this.envConfig = EnvConfig.RELEASE;
            AreaCode areaCode = AreaCode.CN;
            this.countryCode = "CN";
            this.signMode = 0;
            this.appName = bArr;
            this.areaCode = areaCode;
        }

        public InitParamSpec build() {
            return new InitParamSpec(this);
        }

        public Builder setAccessKey(byte[] bArr) {
            this.accessKey = bArr;
            this.isWbAuth = true;
            return this;
        }

        public Builder setAreaCode(AreaCode areaCode) {
            if (areaCode == null) {
                throw new IllegalArgumentException("areaCode cannot be null.");
            }
            if (areaCode == AreaCode.SEA) {
                throw new IllegalArgumentException("areaCode is not match with region.");
            }
            this.areaCode = areaCode;
            return this;
        }

        public Builder setCipherProvider(String str) {
            InitParamSpec.checkCipherProvider(str);
            this.cipherProvider = str;
            return this;
        }

        public Builder setCountryCode(String str) {
            if (str == null) {
                throw new IllegalArgumentException("countryCode cannot be null.");
            }
            this.countryCode = str;
            return this;
        }

        public Builder setDeviceId(byte[] bArr) {
            if (bArr == null || bArr.length == 0) {
                com.heytap.omas.a.e.i.b(InitParamSpec.TAG, "newBuilder: parameter invalid,deviceId cannot be null or empty.");
                throw new IllegalArgumentException("parameter invalid,deviceId cannot be null or empty.");
            }
            new String(bArr);
            this.deviceId = bArr;
            return this;
        }

        public Builder setEnvConfig(EnvConfig envConfig) {
            if (envConfig == null) {
                throw new IllegalArgumentException("envConfig cannot be null.");
            }
            this.envConfig = envConfig;
            return this;
        }

        public Builder setSignMode(@b int i) {
            this.signMode = i;
            return this;
        }

        public Builder setWbId(byte[] bArr) {
            this.wbId = bArr;
            this.isWbAuth = true;
            return this;
        }

        public Builder setWbKeyId(byte[] bArr) {
            this.wbKeyId = bArr;
            this.isWbAuth = true;
            return this;
        }

        public Builder setWbVersion(int i) {
            this.wbVersion = i;
            this.isWbAuth = true;
            return this;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface b {
    }

    private InitParamSpec(Builder builder) {
        this.envConfig = EnvConfig.RELEASE;
        this.ticketAuthMode = "WB";
        this.cipherProvider = null;
        this.areaCode = AreaCode.CN;
        this.countryCode = "CN";
        this.signMode = 0;
        if (builder.deviceId != null && builder.deviceId.length != 0) {
            com.heytap.omas.a.e.i.c(TAG, "device id set by user,but will not be in use.");
        }
        this.deviceId = "a6cc6ef1715493d878457d6c7898f098ccd97e541aecb993ce4500f8e4572fe0".getBytes();
        this.appName = builder.appName;
        this.envConfig = builder.envConfig;
        this.cipherProvider = builder.cipherProvider;
        this.areaCode = builder.areaCode;
        this.countryCode = builder.countryCode;
        if (!builder.isWbAuth) {
            this.ticketAuthMode = com.heytap.omas.a.b.c.b;
            return;
        }
        checkParameter(builder.accessKey, mna.ACCESSKEY);
        this.accessKey = builder.accessKey;
        checkParameter(builder.wbId, "wbId");
        this.wbId = builder.wbId;
        checkParameter(builder.wbKeyId, "wbKeyId");
        this.wbKeyId = builder.wbKeyId;
        if (builder.wbVersion < 0) {
            throw new IllegalArgumentException("wbVersion cannot <= 0");
        }
        this.wbVersion = builder.wbVersion;
        this.ticketAuthMode = "WB";
        this.signMode = builder.signMode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkCipherProvider(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("CipherProvider Can not be null or empty.");
        }
    }

    private static void checkParameter(byte[] bArr, String str) {
        if (bArr != null && bArr.length != 0) {
            new String(bArr);
            return;
        }
        throw new IllegalArgumentException("checkParameter:" + str + " cannot be null or length cannot <= 0");
    }

    public static Builder newBuilder(@NonNull byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return new Builder(bArr);
        }
        com.heytap.omas.a.e.i.b(TAG, "newBuilder: parameter invalid,appName cannot be null or empty.");
        throw new IllegalArgumentException("parameter invalid,appName cannot be null or empty.");
    }

    @Override // com.heytap.omas.omkms.data.h
    public byte[] getAccessKey() {
        return this.accessKey;
    }

    @Override // com.heytap.omas.omkms.data.h
    public String getAccessKeyString() {
        return new String(this.accessKey);
    }

    @Override // com.heytap.omas.omkms.data.h
    public byte[] getAppName() {
        return this.appName;
    }

    @Override // com.heytap.omas.omkms.data.h
    public AreaCode getAreaCode() {
        return this.areaCode;
    }

    @Override // com.heytap.omas.omkms.data.h
    public String getAuthMode() {
        return this.ticketAuthMode;
    }

    @Override // com.heytap.omas.omkms.data.h
    public String getCipherProvider() {
        return this.cipherProvider;
    }

    @Override // com.heytap.omas.omkms.data.h
    public String getCountryCode() {
        return this.countryCode;
    }

    @Override // com.heytap.omas.omkms.data.h
    public byte[] getDeviceId() {
        return this.deviceId;
    }

    @Override // com.heytap.omas.omkms.data.h
    public EnvConfig getEnvConfig() {
        return this.envConfig;
    }

    @Override // com.heytap.omas.omkms.data.h
    public int getSignMode() {
        return this.signMode;
    }

    public String getTicketAuthMode() {
        return this.ticketAuthMode;
    }

    @Override // com.heytap.omas.omkms.data.h
    public byte[] getWbId() {
        return this.wbId;
    }

    @Override // com.heytap.omas.omkms.data.h
    public byte[] getWbKeyId() {
        return this.wbKeyId;
    }

    @Override // com.heytap.omas.omkms.data.h
    public int getWbVersion() {
        return this.wbVersion;
    }

    @Override // com.heytap.omas.omkms.data.h
    public byte[] getWbVersionBytes() {
        return new byte[]{(byte) this.wbVersion};
    }

    public String toString() {
        return "InitParamSpec{envConfig=" + this.envConfig + ", deviceId=" + Arrays.toString(this.deviceId) + ", appName=" + Arrays.toString(this.appName) + ", accessKey=" + Arrays.toString(this.accessKey) + ", wbId=" + Arrays.toString(this.wbId) + ", wbKeyId=" + Arrays.toString(this.wbKeyId) + ", wbVersion=" + this.wbVersion + ", ticketAuthMode='" + this.ticketAuthMode + "', cipherProvider='" + this.cipherProvider + "', areaCore='" + this.areaCode + "', areaCore='" + this.countryCode + "', signMode='" + this.signMode + "'}";
    }

    private InitParamSpec(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, @NonNull byte[] bArr4, @NonNull byte[] bArr5, @NonNull int i) throws IllegalArgumentException {
        this.envConfig = EnvConfig.RELEASE;
        this.ticketAuthMode = "WB";
        this.cipherProvider = null;
        this.areaCode = AreaCode.CN;
        this.countryCode = "CN";
        this.signMode = 0;
    }
}
