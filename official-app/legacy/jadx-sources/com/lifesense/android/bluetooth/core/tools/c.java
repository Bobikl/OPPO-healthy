package com.lifesense.android.bluetooth.core.tools;

import android.annotation.SuppressLint;
import com.heytap.connect.cipher.AESUtil;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"DefaultLocale"})
public class c {
    public static byte a(char c2) {
        return (byte) AESUtil.HEX.indexOf(c2);
    }

    public static int b(byte[] bArr) {
        try {
            return new DataInputStream(new ByteArrayInputStream(bArr)).readInt();
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int c(byte[] bArr) {
        try {
            return new DataInputStream(new ByteArrayInputStream(bArr)).readShort();
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static String a(byte[] bArr) {
        StringBuilder sb;
        if (bArr == null) {
            return "null";
        }
        String string = "";
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb = new StringBuilder();
                sb.append(string);
                string = "0";
            } else {
                sb = new StringBuilder();
            }
            sb.append(string);
            sb.append(hexString);
            string = sb.toString();
        }
        return string.toUpperCase().trim();
    }

    public static byte[] a(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (a(charArray[i2 + 1]) | (a(charArray[i2]) << 4));
        }
        return bArr;
    }
}
