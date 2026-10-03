package com.oplus.aiunit.vision;

import android.content.Context;
import android.util.Base64;
import com.customer.feedback.sdk.R;
import com.customer.feedback.sdk.util.LogUtil;
import com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoCmdId;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes10.dex */
public final class wwm {
    public static PublicKey feedbacka;

    public static synchronized String a(Context context, String str) {
        String strB;
        strB = "";
        try {
            if (feedbacka == null) {
                try {
                    feedbacka = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(zo6.a() == 0 ? context.getString(R.string.new_feedback_public_key) : context.getString(R.string.new_feedback_public_key_test), 0)));
                } catch (NoSuchAlgorithmException unused) {
                    throw new IOException("无此算法");
                } catch (InvalidKeySpecException unused2) {
                    throw new IOException("公钥非法");
                }
            }
            strB = b(str, feedbacka);
        } catch (Exception e2) {
            LogUtil.e("NewRsaUtil", "exceptionInfo：" + e2);
        }
        return strB;
    }

    public static String b(String str, PublicKey publicKey) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        Cipher cipher = Cipher.getInstance("RSA/None/OAEPPadding");
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
            byte[] bArrDoFinal = i3 > 245 ? cipher.doFinal(str.getBytes(), i, UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE) : cipher.doFinal(str.getBytes(), i, i3);
            byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
            i2++;
            i = i2 * UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE;
        }
    }
}
