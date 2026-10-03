package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes16.dex */
public class um0 {
    public static final String a = vo6.b(b78.a(), y80.LOGKIT_PUB_KEY);

    public class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                stringBuffer.append('0');
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    public static String b(int i, String str, Key key) {
        try {
            Cipher cipher = Cipher.getInstance(dj.RSA_TRANSFORMATION);
            cipher.init(i, key);
            return Base64.getEncoder().encodeToString(cipher.doFinal(str.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String c(Map<String, String> map) {
        ArrayList<String> arrayList = new ArrayList(map.keySet());
        g(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            String strValueOf = Objects.isNull(map.get(str)) ? null : String.valueOf(map.get(str));
            if (str != null) {
                sb.append(strValueOf);
            }
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("encryptPhone : ");
        sb2.append(string);
        return f(string);
    }

    public static Key d() {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.getDecoder().decode(a)));
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static String e(String str) {
        return b(1, str, d());
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return a(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(str.getBytes(StandardCharsets.UTF_8)));
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void g(List<String> list) {
        Collections.sort(list, new a());
    }
}
