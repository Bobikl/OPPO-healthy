package com.heytap.accessory.accessorymanager;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.heytap.accessory.logging.SdkLog;
import com.heytap.accessory.utils.HexUtils;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class ConnectConfig implements Serializable {
    private static final String ADDRESS = "address";
    private static final String CONNECT_DEVICE_CATEGORY = "connect_device_category";
    public static final int CONNECT_UID_TYPE_DEFAULT = 0;
    public static final int CONNECT_UID_TYPE_INSECURE = 2;
    public static final int CONNECT_UID_TYPE_SECONDARY = 1;
    private static final String CONNECT_UUID = "connect_uuid";
    public static final int COUNT_FIELD_CONNECT_CONFIG = 6;
    private static final String DEVICE_ID = "device_id";
    private static final String KSC_ALIAS = "ksc_alias";
    private static final String RETRY_MODE = "retry_mode";
    private static final String TAG = "ConnectConfig";
    private static final String TRANSPORT_TYPE = "transport_type";
    private static final long serialVersionUID = 1;
    private String mAddress;
    private byte[] mDeviceId;
    private int mDeviceType;
    private byte[] mKscAlias;
    private int mRetryMode;
    private int mTransportType;
    private int mUidType;

    public static class Builder {
        private String mAddress;
        private byte[] mDeviceId;
        private int mDeviceType;
        private byte[] mKscAlias;
        private int mRetryMode;
        private int mTransportType;
        private int mUidType;

        public ConnectConfig build() {
            return new ConnectConfig(this);
        }

        public Builder of(ConnectConfig connectConfig) {
            this.mAddress = connectConfig.mAddress;
            this.mTransportType = connectConfig.mTransportType;
            this.mDeviceId = connectConfig.mDeviceId;
            this.mKscAlias = connectConfig.mKscAlias;
            this.mRetryMode = connectConfig.mRetryMode;
            this.mUidType = connectConfig.mUidType;
            this.mDeviceType = connectConfig.mDeviceType;
            return this;
        }

        public Builder setAddress(String str) {
            this.mAddress = str;
            return this;
        }

        public Builder setDeviceId(byte[] bArr) {
            this.mDeviceId = bArr;
            return this;
        }

        public Builder setDeviceType(int i) {
            this.mDeviceType = i;
            return this;
        }

        public Builder setKscAlias(byte[] bArr) {
            this.mKscAlias = bArr;
            return this;
        }

        public Builder setRetryMode(int i) {
            this.mRetryMode = i;
            return this;
        }

        public Builder setTransportType(int i) {
            this.mTransportType = i;
            return this;
        }

        public Builder setUidType(int i) {
            this.mUidType = i;
            return this;
        }

        private Builder() {
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Nullable
    public static ConnectConfig createFromBundle(Bundle bundle) {
        String string = bundle.getString("address");
        int i = bundle.getInt(TRANSPORT_TYPE);
        byte[] byteArray = bundle.getByteArray("device_id");
        byte[] byteArray2 = bundle.getByteArray(KSC_ALIAS);
        int i2 = bundle.getInt(RETRY_MODE);
        int i3 = bundle.getInt(CONNECT_UUID);
        if (byteArray == null || TextUtils.isEmpty(string) || byteArray2 == null) {
            SdkLog.w(TAG, "invalid ConnectConfig, deviceId, address, kscAlias cannot be empty.");
            return null;
        }
        int i4 = bundle.getInt(CONNECT_DEVICE_CATEGORY, -1);
        ConnectConfig connectConfig = new ConnectConfig(string, i, byteArray, byteArray2, i2, i3);
        connectConfig.setDeviceType(i4);
        return connectConfig;
    }

    public String getAddress() {
        String str = this.mAddress;
        return str == null ? "" : str.toUpperCase();
    }

    public Bundle getBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("address", this.mAddress);
        bundle.putInt(TRANSPORT_TYPE, this.mTransportType);
        bundle.putByteArray("device_id", this.mDeviceId);
        bundle.putByteArray(KSC_ALIAS, this.mKscAlias);
        bundle.putInt(RETRY_MODE, this.mRetryMode);
        bundle.putInt(CONNECT_UUID, this.mUidType);
        bundle.putInt(CONNECT_DEVICE_CATEGORY, this.mDeviceType);
        return bundle;
    }

    public byte[] getDeviceId() {
        return this.mDeviceId;
    }

    public int getDeviceType() {
        return this.mDeviceType;
    }

    public byte[] getKscAlias() {
        return this.mKscAlias;
    }

    public int getRetryMode() {
        return this.mRetryMode;
    }

    public int getTransportType() {
        return this.mTransportType;
    }

    public int getUidType() {
        return this.mUidType;
    }

    public void setAddress(String str) {
        this.mAddress = str;
    }

    public void setDeviceId(byte[] bArr) {
        this.mDeviceId = bArr;
    }

    public void setDeviceType(int i) {
        this.mDeviceType = i;
    }

    public void setKscAlias(byte[] bArr) {
        this.mKscAlias = bArr;
    }

    public void setRetryMode(int i) {
        this.mRetryMode = i;
    }

    public void setTransportType(int i) {
        this.mTransportType = i;
    }

    public void setUidType(int i) {
        this.mUidType = i;
    }

    public String toString() {
        return "ConnectConfig{address='" + HexUtils.hideAddress(this.mAddress) + "', transportType=" + this.mTransportType + ", deviceId=" + HexUtils.hide(this.mDeviceId) + ", kscAlias=" + HexUtils.hide(this.mKscAlias) + ", retryMode=" + this.mRetryMode + ", UUname=" + this.mUidType + ", deviceType=" + this.mDeviceType + '}';
    }

    public ConnectConfig(String str, int i, byte[] bArr, byte[] bArr2) {
        this(str, i, bArr, bArr2, 0);
    }

    public ConnectConfig(String str, int i, byte[] bArr, byte[] bArr2, int i2) {
        this(str, i, bArr, bArr2, i2, 0);
    }

    public ConnectConfig(String str, int i, int i2, int i3) {
        this.mDeviceType = -1;
        this.mAddress = str;
        this.mTransportType = i;
        this.mRetryMode = i2;
        this.mUidType = i3;
    }

    public ConnectConfig(String str, int i, byte[] bArr, byte[] bArr2, int i2, int i3) {
        this.mDeviceType = -1;
        this.mDeviceId = bArr;
        this.mAddress = str;
        this.mKscAlias = bArr2;
        this.mRetryMode = i2;
        this.mTransportType = i;
        this.mUidType = i3;
    }

    private ConnectConfig(Builder builder) {
        this.mDeviceType = -1;
        this.mAddress = builder.mAddress;
        this.mTransportType = builder.mTransportType;
        this.mDeviceId = builder.mDeviceId;
        this.mKscAlias = builder.mKscAlias;
        this.mRetryMode = builder.mRetryMode;
        this.mUidType = builder.mUidType;
        this.mDeviceType = builder.mDeviceType;
    }
}
