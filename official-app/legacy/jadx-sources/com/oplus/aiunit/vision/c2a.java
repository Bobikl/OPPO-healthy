package com.oplus.aiunit.vision;

import com.leon.channel.common.verify.ApkSignatureSchemeV2Verifier;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class c2a {
    public static Map<Integer, ByteBuffer> a(File file) {
        if (file != null && file.exists() && file.isFile()) {
            try {
                return lsk.a(lsk.b(file));
            } catch (ApkSignatureSchemeV2Verifier.SignatureNotFoundException unused) {
                System.out.println("APK : " + file.getAbsolutePath() + " not have apk signature block");
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static ByteBuffer b(File file, int i) {
        if (file != null && file.exists() && file.isFile()) {
            Map<Integer, ByteBuffer> mapA = a(file);
            System.out.println("getByteBufferValueById , destApk " + file.getAbsolutePath() + " IdValueMap = " + mapA);
            if (mapA != null) {
                return mapA.get(Integer.valueOf(i));
            }
        }
        return null;
    }

    public static byte[] c(File file, int i) {
        if (file != null && file.exists() && file.isFile()) {
            ByteBuffer byteBufferB = b(file, i);
            System.out.println("getByteValueById , id = " + i + " , value = " + byteBufferB);
            if (byteBufferB != null) {
                return Arrays.copyOfRange(byteBufferB.array(), byteBufferB.arrayOffset() + byteBufferB.position(), byteBufferB.arrayOffset() + byteBufferB.limit());
            }
        }
        return null;
    }

    public static String d(File file, int i) {
        byte[] bArrC;
        if (file != null && file.exists() && file.isFile() && (bArrC = c(file, i)) != null) {
            try {
                if (bArrC.length > 0) {
                    return new String(bArrC, "UTF-8");
                }
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }
}
