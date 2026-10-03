package com.oplus.aiunit.vision;

import android.util.Base64;
import com.andes.crypto.exception.SeException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: classes12.dex */
public class re4 {
    public static final String a = "re4";
    public static final byte[] b = new byte[32];

    public static byte[] a() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(256);
            return keyGenerator.generateKey().getEncoded();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] b(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static byte[] c(String str, byte[] bArr) {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 2)));
            Cipher cipher = Cipher.getInstance("RSA/None/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(1, rSAPublicKey);
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) throws SeException {
        com.andes.crypto.manager.se.a aVar = new com.andes.crypto.manager.se.a();
        int iD = aVar.d();
        int i = 3;
        if (iD == -10001) {
            int i2 = 3;
            while (true) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                aVar = new com.andes.crypto.manager.se.a();
                iD = aVar.d();
                if (iD == 0) {
                    break;
                }
                i2 = i3;
            }
        }
        if (iD != 0) {
            x6b.a(a, "decryptKey", "se error code is " + iD);
            throw new SeException("se error code:" + iD);
        }
        j5g j5gVarA = aVar.a(bArr, b, (short) 23612);
        if (j5gVarA.c()) {
            byte[] bArrB = j5gVarA.b();
            if (Arrays.equals(bArr2, em6.a(bArrB))) {
                return bArrB;
            }
            x6b.a(a, "decryptKey", "the sha256 of the decrypted data by the se is incorrect!");
            throw new SeException("the sha256 of the decrypted data by the se is incorrect");
        }
        if (j5gVarA.a() == -10001) {
            while (true) {
                int i4 = i - 1;
                if (i > 0) {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                    j5gVarA = new com.andes.crypto.manager.se.a().a(bArr, b, (short) 23612);
                    if (j5gVarA.c()) {
                        byte[] bArrB2 = j5gVarA.b();
                        if (Arrays.equals(bArr2, em6.a(bArrB2))) {
                            return bArrB2;
                        }
                        x6b.a(a, "decryptKey", "the sha256 of the decrypted data by the se is incorrect!");
                        throw new SeException("the sha256 of the decrypted data by the se is incorrect");
                    }
                    i = i4;
                }
            }
        }
        x6b.a(a, "decryptKey", "se error code is " + j5gVarA.a());
        throw new SeException("se decryption error code:" + j5gVarA.a());
    }

    public static byte[] e(byte[] bArr) {
        com.andes.crypto.manager.se.a aVar = new com.andes.crypto.manager.se.a();
        int iD = aVar.d();
        int i = 3;
        if (iD == -10001) {
            int i2 = 3;
            while (true) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                aVar = new com.andes.crypto.manager.se.a();
                iD = aVar.d();
                if (iD == 0) {
                    break;
                }
                i2 = i3;
            }
        }
        if (iD != 0) {
            return null;
        }
        j5g j5gVarB = aVar.b(bArr, b, (short) 23612);
        if (j5gVarB.c()) {
            return j5gVarB.b();
        }
        if (j5gVarB.a() == -10001) {
            while (true) {
                int i4 = i - 1;
                if (i <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
                j5gVarB = new com.andes.crypto.manager.se.a().b(bArr, b, (short) 23612);
                if (j5gVarB.c()) {
                    return j5gVarB.b();
                }
                i = i4;
            }
        }
        x6b.a(a, "encryptBySE", "se error code is " + j5gVarB.a());
        return null;
    }
}
