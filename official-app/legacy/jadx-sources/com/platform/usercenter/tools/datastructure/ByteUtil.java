package com.platform.usercenter.tools.datastructure;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes9.dex */
public final class ByteUtil {
    private ByteUtil() {
    }

    public static byte[] getUTF8Bytes(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            try {
                return str.getBytes("UTF-8");
            } catch (IOException unused) {
                return new byte[0];
            }
        } catch (UnsupportedEncodingException unused2) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeUTF(str);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            dataOutputStream.close();
            int length = byteArray.length - 2;
            byte[] bArr = new byte[length];
            System.arraycopy(byteArray, 2, bArr, 0, length);
            return bArr;
        }
    }

    public static boolean isNullOrEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }
}
