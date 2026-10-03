package com.platform.usercenter.network.safe;

import android.text.TextUtils;
import com.platform.usercenter.tools.log.UCLogUtil;
import com.platform.usercenter.tools.security.AESUtilTest;
import com.platform.usercenter.tools.security.RsaCoder;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public class SecurityProtocolManager {
    private static final String TAG = "SecurityProtocolManager";
    private SecurityKeys mSecurityKeys;

    public static class LazyHolder {
        static final SecurityProtocolManager INSTANCE = new SecurityProtocolManager();

        private LazyHolder() {
        }
    }

    public static class SecurityKeys {
        public String mAES;
        public byte[] mIV;
        public String mIVStr;
        public String mRSA;
        public String mSecurityTicket;

        public SecurityKeys() {
            byte[] bArrGenerateRandom16byte = generateRandom16byte();
            this.mIV = bArrGenerateRandom16byte;
            this.mIVStr = AESUtilTest.base64EncodeSafe(bArrGenerateRandom16byte);
            String strBase64EncodeSafe = AESUtilTest.base64EncodeSafe(generateRandom16byte());
            this.mAES = strBase64EncodeSafe;
            this.mRSA = RsaCoder.encrypt(strBase64EncodeSafe, RsaCoder.Key);
            this.mSecurityTicket = null;
        }

        private byte[] generateRandom16byte() {
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            return bArr;
        }

        public boolean available() {
            return (TextUtils.isEmpty(this.mAES) || this.mIV == null || TextUtils.isEmpty(this.mRSA) || TextUtils.isEmpty(this.mSecurityTicket)) ? false : true;
        }

        public String decrypt(String str) {
            if (TextUtils.isEmpty(this.mAES)) {
                UCLogUtil.e(SecurityProtocolManager.TAG, "decrypt fail aes is null");
                return null;
            }
            try {
                return AESUtilTest.aesDecryptWithPassKey(str, this.mAES, this.mIV);
            } catch (Exception e2) {
                UCLogUtil.e(e2);
                return null;
            }
        }

        public String encrypt(String str) {
            if (TextUtils.isEmpty(this.mAES)) {
                UCLogUtil.e(SecurityProtocolManager.TAG, "encrypt fail aes is null");
                return null;
            }
            try {
                return AESUtilTest.aesEncryptWithPassKey(str, this.mAES, this.mIV);
            } catch (Exception e2) {
                UCLogUtil.e(e2);
                return null;
            }
        }
    }

    public static SecurityProtocolManager getInstance() {
        return LazyHolder.INSTANCE;
    }

    public void clearSecurityKeys() {
        this.mSecurityKeys = null;
    }

    public SecurityKeys getSecurityKeys() {
        return this.mSecurityKeys;
    }

    public void setSecurityKeys(SecurityKeys securityKeys) {
        this.mSecurityKeys = securityKeys;
    }

    private SecurityProtocolManager() {
    }
}
