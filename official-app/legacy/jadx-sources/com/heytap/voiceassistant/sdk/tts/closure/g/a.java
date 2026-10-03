package com.heytap.voiceassistant.sdk.tts.closure.g;

import java.nio.charset.StandardCharsets;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes19.dex */
public class a {
    public static String a(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            byte[] bArrDoFinal = mac.doFinal(str2.getBytes(StandardCharsets.UTF_8));
            char[] charArray = "0123456789abcdef".toCharArray();
            char[] cArr = new char[bArrDoFinal.length * 2];
            for (int i = 0; i < bArrDoFinal.length; i++) {
                int i2 = bArrDoFinal[i] & 255;
                int i3 = i * 2;
                cArr[i3] = charArray[i2 >>> 4];
                cArr[i3 + 1] = charArray[i2 & 15];
            }
            return new String(cArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }
}
