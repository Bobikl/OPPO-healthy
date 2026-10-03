package com.lifesense.android.bluetooth.core.tools;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import com.heytap.connect.cipher.AESUtil;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"DefaultLocale"})
public class e {
    public static byte a(char c2) {
        return (byte) AESUtil.HEX.indexOf(c2);
    }

    public static String b(byte[] bArr) {
        StringBuilder sb;
        String string = "";
        if (bArr == null) {
            return "";
        }
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i] & 255);
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
            if (i < bArr.length - 1) {
                string = string + "-";
            }
        }
        return string.toUpperCase();
    }

    public static String c(byte[] bArr) {
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

    @TargetApi(9)
    public static byte[] d(byte[] bArr) {
        int length = bArr.length - 1;
        while (length >= 0 && bArr[length] == 0) {
            length--;
        }
        return Arrays.copyOf(bArr, length + 1);
    }

    public static String e(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static long f(byte[] bArr) {
        long[] jArr = new long[256];
        a(jArr);
        long j2 = 0;
        for (byte b : bArr) {
            j2 = (j2 >> 8) ^ jArr[(int) ((((long) b) ^ j2) & 255)];
        }
        return j2;
    }

    public static int g(byte[] bArr) {
        try {
            return new DataInputStream(new ByteArrayInputStream(bArr)).readInt();
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static int h(byte[] bArr) {
        try {
            return new DataInputStream(new ByteArrayInputStream(bArr)).readShort();
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static double a(int i, double d) {
        try {
            return new BigDecimal(d).setScale(i, 4).doubleValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0.0d;
        }
    }

    public static byte[] b(float f) {
        byte[] bArrA = a(((int) (((float) a(2, f)) * 1000.0f)) / 10, ByteOrder.LITTLE_ENDIAN);
        bArrA[3] = -2;
        return bArrA;
    }

    public static int a(byte b) {
        return b & 255;
    }

    public static byte[] b(String str) {
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

    public static int a(char c2, int i) {
        int iDigit = Character.digit(c2, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new RuntimeException("Illegal hexadecimal character " + c2 + " at index " + i);
    }

    public static String a(String str) {
        return a(Long.toHexString(f(b(str.replace(" ", "").toUpperCase()))), 8);
    }

    public static String a(String str, int i) {
        String str2 = "";
        if (str == null) {
            return "";
        }
        for (int i2 = 0; i2 < i - str.length(); i2++) {
            str2 = str2 + "0";
        }
        return str2 + str;
    }

    public static String a(byte[] bArr) {
        String str = "";
        if (bArr == null) {
            return "";
        }
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i < bArr.length; i++) {
            cArr[i] = (char) bArr[i];
        }
        for (int i2 = 0; i2 < length; i2++) {
            str = str + cArr[i2];
        }
        return str.trim();
    }

    public static void a(long[] jArr) {
        for (int i = 0; i < 256; i++) {
            long j2 = i;
            for (int i2 = 0; i2 < 8; i2++) {
                long j3 = j2 & 1;
                j2 >>= 1;
                if (j3 == 1) {
                    j2 ^= 3988292384L;
                }
            }
            jArr[i] = j2;
        }
    }

    public static byte[] a(float f) {
        return new byte[]{(byte) (((float) a(2, f)) * 100.0f), -32};
    }

    public static byte[] a(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] a(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(byteOrder);
        byteBufferAllocate.asIntBuffer().put(i);
        return byteBufferAllocate.array();
    }

    public static byte[] a(short s) {
        return new byte[]{(byte) ((s >> 8) & 255), (byte) (s & 255)};
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        try {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            return bArr2;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] a(char[] cArr) {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new RuntimeException("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int iA = a(cArr[i], i) << 4;
            int i3 = i + 1;
            int iA2 = iA | a(cArr[i3], i3);
            i = i3 + 1;
            bArr[i2] = (byte) (iA2 & 255);
            i2++;
        }
        return bArr;
    }
}
