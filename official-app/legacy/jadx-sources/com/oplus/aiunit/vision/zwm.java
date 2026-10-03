package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Base64;
import com.customer.feedback.sdk.util.LogUtil;
import io.netty.util.internal.StringUtil;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes10.dex */
public final class zwm {
    public static RSAPublicKey feedbacka;

    public static String a(Context context, String str) {
        try {
            if (feedbacka == null) {
                InputStream inputStreamOpen = context.getApplicationContext().getResources().getAssets().open("feedback_public_key.pem");
                try {
                    try {
                        feedbacka = d(b(inputStreamOpen));
                        inputStreamOpen.close();
                    } catch (NullPointerException unused) {
                        throw new IOException("公钥输入流为空");
                    }
                } catch (IOException unused2) {
                    throw new IOException("公钥数据流读取错误");
                }
            }
            return c(str, feedbacka);
        } catch (Exception e2) {
            LogUtil.e("RsaUtil", "exceptionInfo：" + e2);
            return "";
        }
    }

    public static String b(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return sb.toString();
            }
            if (line.charAt(0) != '-') {
                sb.append(line);
                sb.append(StringUtil.CARRIAGE_RETURN);
            }
        }
    }

    public static String c(String str, PublicKey publicKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
        cipher.init(1, publicKey);
        int length = str.getBytes().length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = length - i;
            if (i3 <= 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return Base64.encodeToString(byteArray, 2);
            }
            byte[] bArrDoFinal = i3 > 117 ? cipher.doFinal(str.getBytes(), i, 117) : cipher.doFinal(str.getBytes(), i, i3);
            byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
            i2++;
            i = i2 * 117;
        }
    }

    public static RSAPublicKey d(String str) throws IOException {
        try {
            return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
        } catch (NullPointerException unused) {
            throw new IOException("公钥数据为空");
        } catch (NoSuchAlgorithmException unused2) {
            throw new IOException("无此算法");
        } catch (InvalidKeySpecException unused3) {
            throw new IOException("公钥非法");
        }
    }
}
