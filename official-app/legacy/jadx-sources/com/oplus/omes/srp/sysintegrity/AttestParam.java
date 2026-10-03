package com.oplus.omes.srp.sysintegrity;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class AttestParam {
    public String mAppId;
    private String mCustomDgst;
    public byte[] mNonce;
    private long mConnectTimeout = 0;
    private boolean mRetry = false;
    private boolean mCompatMode = false;
    private boolean mForceToken = false;
    private boolean mCertsHash = false;
    private boolean mTeeCompat = false;

    public static final class Builder {
        public String mAppId;
        private String mCustomDgst;
        public byte[] mNonce;
        private long mConnectTimeout = 0;
        private boolean mRetry = false;
        private boolean mCompatMode = false;
        private boolean mForceToken = false;
        private boolean mCertsHash = false;
        private boolean mTeeCompat = false;

        public AttestParam build() {
            AttestParam attestParam = new AttestParam();
            attestParam.mAppId = this.mAppId;
            attestParam.mNonce = this.mNonce;
            attestParam.mRetry = this.mRetry;
            attestParam.mConnectTimeout = this.mConnectTimeout;
            attestParam.mCompatMode = this.mCompatMode;
            attestParam.mCustomDgst = this.mCustomDgst;
            attestParam.mTeeCompat = this.mTeeCompat;
            attestParam.mForceToken = this.mForceToken;
            attestParam.mCertsHash = this.mCertsHash;
            return attestParam;
        }

        public Builder setAppId(String str) {
            this.mAppId = str;
            return this;
        }

        public Builder setCertsHash(boolean z) {
            this.mCertsHash = z;
            return this;
        }

        public Builder setCompatMode(boolean z) {
            this.mCompatMode = z;
            return this;
        }

        public Builder setConnectTimeout(long j2) {
            this.mConnectTimeout = j2;
            return this;
        }

        public Builder setCustomDgst(String str) {
            this.mCustomDgst = str;
            return this;
        }

        public Builder setForceToken(boolean z) {
            this.mForceToken = z;
            return this;
        }

        public Builder setNonce(byte[] bArr) {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            this.mNonce = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, length);
            return this;
        }

        public Builder setRetry(boolean z) {
            this.mRetry = z;
            return this;
        }

        public Builder setTeeCompat(boolean z) {
            this.mTeeCompat = z;
            return this;
        }
    }

    public String getAppId() {
        return this.mAppId;
    }

    public long getConnectTimeout() {
        return this.mConnectTimeout;
    }

    public String getCustomDgst() {
        return this.mCustomDgst;
    }

    public byte[] getNonce() {
        return this.mNonce;
    }

    public boolean isCertsHash() {
        return this.mCertsHash;
    }

    public boolean isCompatMode() {
        return this.mCompatMode;
    }

    public boolean isForceToken() {
        return this.mForceToken;
    }

    public boolean isRetry() {
        return this.mRetry;
    }

    public boolean isTeeCompat() {
        return this.mTeeCompat;
    }
}
