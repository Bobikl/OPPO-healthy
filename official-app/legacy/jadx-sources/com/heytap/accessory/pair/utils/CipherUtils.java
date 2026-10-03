package com.heytap.accessory.pair.utils;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.heytap.accessory.pair.logging.PairLog;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes14.dex */
public class CipherUtils {
    private static final String TAG = "CipherUtils - kscTrack";

    public static Cipher getDecryptCipher(String str) {
        Cipher cipher;
        SecretKey aESKeyForce;
        if (TextUtils.isEmpty(str)) {
            PairLog.e(TAG, "iv can't be empty. return.");
            return null;
        }
        try {
            cipher = Cipher.getInstance(SecurityUtils.AES_CBC_NOPADDING);
            try {
                aESKeyForce = KeyStoreHelper.getInstance().getAESKeyForce("ksc_key_alias");
            } catch (Exception e2) {
                e = e2;
                PairLog.e(TAG, "getDecryptCipher: ex " + e);
                aESKeyForce = null;
            }
        } catch (Exception e3) {
            e = e3;
            cipher = null;
        }
        if (cipher == null || aESKeyForce == null) {
            PairLog.e("CipherUtils - kscTrack - kscTrack", "getEncryptCipher, cipher is null or secretKey is null. return.");
            return null;
        }
        try {
            cipher.init(2, aESKeyForce, SecurityUtils.getIVSpec(HexUtils.hexStrToByteArray(str)));
            return cipher;
        } catch (Exception e4) {
            PairLog.e(TAG, "getDecryptCipher: ex " + e4);
            return null;
        }
    }

    @Nullable
    public static Pair<String, Cipher> getEncryptCipher() {
        Cipher cipher;
        SecretKey aESKeyForce;
        try {
            cipher = Cipher.getInstance(SecurityUtils.AES_CBC_NOPADDING);
            try {
                aESKeyForce = KeyStoreHelper.getInstance().getAESKeyForce("ksc_key_alias");
            } catch (Exception e2) {
                e = e2;
                PairLog.e(TAG, "getEncryptCipher: ex " + e);
                aESKeyForce = null;
            }
        } catch (Exception e3) {
            e = e3;
            cipher = null;
        }
        if (cipher == null || aESKeyForce == null) {
            PairLog.e("CipherUtils - kscTrack - kscTrack", "getEncryptCipher, cipher is null or secretKey is null. return.");
            return null;
        }
        try {
            cipher.init(1, aESKeyForce);
            String strByteArrayToHexStr = HexUtils.byteArrayToHexStr(((IvParameterSpec) cipher.getParameters().getParameterSpec(IvParameterSpec.class)).getIV());
            PairLog.d("CipherUtils - kscTrack - kscTrack", "getEncryptCipher, iv is " + strByteArrayToHexStr);
            return new Pair<>(strByteArrayToHexStr, cipher);
        } catch (Exception e4) {
            PairLog.e(TAG, "getEncryptCipher: ex " + e4);
            return null;
        }
    }
}
