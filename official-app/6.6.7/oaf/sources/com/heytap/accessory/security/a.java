package com.heytap.accessory.security;

import com.heytap.accessory.utils.SystemUtils;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import javax.crypto.Mac;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
public class a {
    public static a a;
    public static KeyStore b;

    public a() throws com.heytap.accessory.security.wms.e {
        try {
            if (b == null) {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                b = keyStore;
                keyStore.load(null);
            }
        } catch (Exception e) {
            throw new com.heytap.accessory.security.wms.e(e);
        }
    }

    public static a a() throws com.heytap.accessory.security.wms.e {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public Mac b() throws com.heytap.accessory.security.wms.e {
        try {
            return Mac.getInstance("HmacSHA512");
        } catch (Exception e) {
            throw new com.heytap.accessory.security.wms.e(e);
        }
    }

    public byte[] a(SecretKey secretKey, byte[] bArr, int i) throws com.heytap.accessory.security.wms.e, InvalidKeyException {
        Mac macB = b();
        macB.init(secretKey);
        return a(macB, bArr, i);
    }

    public byte[] a(Mac mac, byte[] bArr, int i) {
        byte[] bArrDoFinal = mac.doFinal(bArr);
        byte[] bArr2 = new byte[i];
        SystemUtils.arraycopy(bArrDoFinal, 0, bArr2, 0, i);
        return bArr2;
    }
}
