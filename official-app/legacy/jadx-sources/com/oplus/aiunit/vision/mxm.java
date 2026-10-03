package com.oplus.aiunit.vision;

import android.util.Log;
import com.oplus.onet.obcommon.WifiConfig;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes8.dex */
public final class mxm {

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final byte[] f136do = {92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92, 92};

    /* JADX INFO: renamed from: if, reason: not valid java name */
    public static final byte[] f137if = {54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54, 54};

    public class a implements yqm<String, String> {
        public final /* synthetic */ SecretKeySpec a;
        public final /* synthetic */ IvParameterSpec b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WifiConfig f14263c;

        public a(SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec, WifiConfig wifiConfig) {
            this.a = secretKeySpec;
            this.b = ivParameterSpec;
            this.f14263c = wifiConfig;
        }

        public final void a(Object obj, Object obj2) {
            byte[] bArrB;
            String str;
            String str2 = (String) obj;
            String str3 = (String) obj2;
            if (g0n.a(str3) == null || (bArrB = mxm.b(this.a, this.b, g0n.a(str3))) == null || bArrB.length <= 0) {
                return;
            }
            try {
                str = new String(bArrB, "UTF-8");
            } catch (UnsupportedEncodingException e2) {
                Log.e("c", e2.getLocalizedMessage());
                str = null;
            }
            this.f14263c.setValue(str2, str, false);
        }
    }

    public static WifiConfig a(SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec, WifiConfig wifiConfig) {
        WifiConfig wifiConfig2 = new WifiConfig();
        if (wifiConfig == null) {
            return wifiConfig2;
        }
        wifiConfig.forSelf(new a(secretKeySpec, ivParameterSpec, wifiConfig2));
        return wifiConfig2;
    }

    public static byte[] b(SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec, byte[] bArr) {
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 8);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 8, 16);
            byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr, 16, bArr.length);
            if (Arrays.equals(bArrCopyOfRange, e(secretKeySpec.getEncoded(), bArrCopyOfRange2, bArrCopyOfRange3))) {
                return c(secretKeySpec, ivParameterSpec, bArrCopyOfRange3, bArrCopyOfRange2);
            }
            Log.d("c", "hmac not match");
            return null;
        } catch (Exception e2) {
            Log.e("c", e2.getLocalizedMessage());
            return null;
        }
    }

    public static byte[] c(SecretKeySpec secretKeySpec, IvParameterSpec ivParameterSpec, byte[] bArr, byte[] bArr2) throws Exception {
        int i = 16;
        int length = bArr.length % 16;
        int length2 = length == 0 ? bArr.length / 16 : (bArr.length / 16) + 1;
        byte[] bArr3 = new byte[16];
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[bArr.length];
        System.arraycopy(bArr2, 0, bArr3, 16 - bArr2.length, bArr2.length);
        for (int i2 = 0; i2 < length2; i2++) {
            if (i2 == length2 - 1 && length != 0) {
                bArr4 = new byte[length];
                i = length;
            }
            bArr3[0] = (byte) i2;
            Cipher cipher = Cipher.getInstance(e7.AES_TRANSFORMATION);
            cipher.init(1, secretKeySpec, ivParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(bArr3);
            int i3 = i2 * 16;
            System.arraycopy(bArr, i3, bArr4, 0, i);
            System.arraycopy(d(bArr4, bArrDoFinal), 0, bArr5, i3, i);
        }
        return bArr5;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            byte[] bArr4 = new byte[64];
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
            return Arrays.copyOfRange(MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(f(d(bArr4, f136do), MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(f(d(bArr4, f137if), bArr2, bArr3)))), 0, 8);
        } catch (Exception e2) {
            Log.e("c", e2.getLocalizedMessage());
            return null;
        }
    }

    public static byte[] f(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }
}
