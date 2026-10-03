package com.sensorsdata.analytics.android.sdk.encrypt.utils;

import android.text.TextUtils;
import com.heytap.health.protocol.userinfo.UserInfoProto$UserInfoCmdId;
import com.oplus.aiunit.vision.apj;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.encrypt.encryptor.SymmetricEncryptMode;
import com.sensorsdata.analytics.android.sdk.util.Base64Coder;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes10.dex */
public class EncryptUtils {
    private static final String TAG = "SensorsDataEncrypt";

    public static String encryptAESKey(String str, byte[] bArr, String str2) {
        return publicKeyEncrypt(str, str2, bArr);
    }

    public static byte[] generateSymmetricKey(SymmetricEncryptMode symmetricEncryptMode) throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(symmetricEncryptMode.algorithm);
        keyGenerator.init(128);
        return keyGenerator.generateKey().getEncoded();
    }

    public static boolean isECEncrypt() {
        try {
            String str = BouncyCastleProvider.PROVIDER_NAME;
            return true;
        } catch (Exception unused) {
            SALog.i("SA.Encrypt", "No integrated ECC encryption library");
            return false;
        }
    }

    private static String publicKeyEncrypt(String str, String str2, byte[] bArr) {
        Cipher cipher;
        if (TextUtils.isEmpty(str)) {
            SALog.i(TAG, "PublicKey is null.");
            return null;
        }
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64Coder.decode(str));
            if (apj.Thread_Type_Executor_Cached.equals(str2)) {
                ECPublicKey eCPublicKey = (ECPublicKey) KeyFactory.getInstance(apj.Thread_Type_Executor_Cached, "SC").generatePublic(x509EncodedKeySpec);
                cipher = Cipher.getInstance("ECIES", "SC");
                cipher.init(1, eCPublicKey);
            } else {
                PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(x509EncodedKeySpec);
                cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
                cipher.init(1, publicKeyGeneratePublic);
            }
            int length = bArr.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            while (true) {
                int i2 = length - i;
                if (i2 <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return new String(Base64Coder.encode(byteArray));
                }
                byte[] bArrDoFinal = i2 > 245 ? cipher.doFinal(bArr, i, UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE) : cipher.doFinal(bArr, i, i2);
                byteArrayOutputStream.write(bArrDoFinal, 0, bArrDoFinal.length);
                i += UserInfoProto$UserInfoCmdId.CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE;
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
            return null;
        }
    }

    public static String symmetricEncrypt(byte[] bArr, byte[] bArr2, SymmetricEncryptMode symmetricEncryptMode) {
        if (bArr != null && bArr2 != null) {
            try {
                byte[] bArr3 = new byte[16];
                new SecureRandom().nextBytes(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, symmetricEncryptMode.algorithm);
                Cipher cipher = Cipher.getInstance(symmetricEncryptMode.transformation);
                cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                byte[] bArrDoFinal = cipher.doFinal(bArr2);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16 + bArrDoFinal.length);
                byteBufferAllocate.put(bArr3);
                byteBufferAllocate.put(bArrDoFinal);
                return new String(Base64Coder.encode(byteBufferAllocate.array()));
            } catch (Exception e2) {
                SALog.printStackTrace(e2);
            }
        }
        return null;
    }
}
