package com.omron;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

/* JADX INFO: loaded from: classes5.dex */
public class d {
    public static String a(String str) throws Exception {
        try {
            SecretKeySpec secretKeySpecA = a("Lep1HGXt", "ASCII");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(2, secretKeySpecA);
            return new String(cipher.doFinal(Hex.decodeHex(str.toCharArray())), "UTF-8");
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException | DecoderException e2) {
            throw new Exception(e2);
        }
    }

    public static SecretKeySpec a(String str, String str2) {
        try {
            byte[] bArr = new byte[16];
            byte[] bytes = str.getBytes(str2);
            int length = bytes.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                int i4 = i2 % 16;
                bArr[i4] = (byte) (bytes[i] ^ bArr[i4]);
                i++;
                i2 = i3;
            }
            return new SecretKeySpec(bArr, "AES");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }
}
