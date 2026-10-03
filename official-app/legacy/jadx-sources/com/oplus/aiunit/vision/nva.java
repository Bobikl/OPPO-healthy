package com.oplus.aiunit.vision;

import android.util.Base64;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
public final class nva {
    public static final int ENCRYPT_TYPE_RANDOM_IV = 1;

    public static String a(String str, String str2, int i) {
        if (str != null && !str.isEmpty()) {
            if (str2 != null && !str2.isEmpty()) {
                if (i != 1) {
                    z6b.q("LegacyTrackDecryptor", "decryptIfSupported: unsupported encryptType=" + i + ", only type=1 will be decrypted");
                    return null;
                }
                try {
                    byte[] bArrDecode = Base64.decode(str, 2);
                    if (bArrDecode != null && bArrDecode.length > 16) {
                        byte[] bArrA = pe4.a(bArrDecode, str2);
                        if (bArrA != null && bArrA.length != 0) {
                            return new String(bArrA, StandardCharsets.UTF_8);
                        }
                        return null;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("decryptIfSupported: packed data too short, len=");
                    sb.append(bArrDecode == null ? 0 : bArrDecode.length);
                    z6b.u("LegacyTrackDecryptor", sb.toString());
                    return null;
                } catch (Exception e2) {
                    z6b.p("LegacyTrackDecryptor", "decryptIfSupported: decrypt error", e2);
                    return null;
                }
            }
            z6b.u("LegacyTrackDecryptor", "decryptIfSupported: appSecret is empty, skip decrypt");
        }
        return null;
    }
}
