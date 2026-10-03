package com.heytap.accessory.security;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.heytap.accessory.pair.utils.SecurityUtils;
import com.heytap.accessory.utils.HexUtils;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class e {
    @Nullable
    public static Pair<String, Cipher> a() {
        Cipher cipher;
        SecretKey secretKeyA;
        try {
            cipher = Cipher.getInstance(SecurityUtils.AES_CBC_NOPADDING);
            try {
                secretKeyA = h.a().a("ksc_key_alias");
            } catch (Exception e) {
                e = e;
                com.heytap.accessory.base.logging.a.b("CipherUtils - kscTrack", "getEncryptCipher error1," + e);
                secretKeyA = null;
            }
        } catch (Exception e2) {
            e = e2;
            cipher = null;
        }
        if (cipher == null || secretKeyA == null) {
            com.heytap.accessory.base.logging.a.b("CipherUtils - kscTrack - kscTrack", "getEncryptCipher, cipher is null or secretKey is null. return.");
            return null;
        }
        try {
            cipher.init(1, secretKeyA);
            String strByteArrayToHexStr = HexUtils.byteArrayToHexStr(((IvParameterSpec) cipher.getParameters().getParameterSpec(IvParameterSpec.class)).getIV());
            com.heytap.accessory.base.logging.a.a("CipherUtils - kscTrack - kscTrack", "getEncryptCipher, iv is " + strByteArrayToHexStr);
            return new Pair<>(strByteArrayToHexStr, cipher);
        } catch (Exception e3) {
            com.heytap.accessory.base.logging.a.b("CipherUtils - kscTrack", "getEncryptCipher error2," + e3);
            return null;
        }
    }

    public static Cipher a(String str) {
        Cipher cipher;
        SecretKey secretKeyA;
        if (TextUtils.isEmpty(str)) {
            com.heytap.accessory.base.logging.a.b("CipherUtils - kscTrack", "iv can't be empty. return.");
            return null;
        }
        try {
            cipher = Cipher.getInstance(SecurityUtils.AES_CBC_NOPADDING);
            try {
                secretKeyA = h.a().a("ksc_key_alias");
            } catch (Exception e) {
                e = e;
                com.heytap.accessory.base.logging.a.b("CipherUtils - kscTrack", "getDecryptCipher error," + e);
                secretKeyA = null;
            }
        } catch (Exception e2) {
            e = e2;
            cipher = null;
        }
        if (cipher != null && secretKeyA != null) {
            try {
                cipher.init(2, secretKeyA, b.a(HexUtils.hexStrToByteArray(str)));
                return cipher;
            } catch (Exception e3) {
                com.heytap.accessory.base.logging.a.b("CipherUtils - kscTrack", "getDecryptCipher error2," + e3);
                return null;
            }
        }
        com.heytap.accessory.base.logging.a.b("CipherUtils - kscTrack - kscTrack", "getEncryptCipher, cipher is null or secretKey is null. return.");
        return null;
    }
}
