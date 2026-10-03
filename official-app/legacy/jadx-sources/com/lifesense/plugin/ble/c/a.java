package com.lifesense.plugin.ble.c;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import com.heytap.connect.cipher.AESUtil;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import p010kotlin.UShort;

/* JADX INFO: loaded from: classes5.dex */
@SuppressLint({"DefaultLocale"})
public class a {
    public static byte a(char c2) {
        return (byte) AESUtil.HEX.indexOf(c2);
    }

    public static int b(byte[] bArr, ByteOrder byteOrder) {
        if (bArr == null || bArr.length == 0) {
            return 0;
        }
        return ByteBuffer.wrap(bArr).order(byteOrder).getInt();
    }

    public static float c(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.asIntBuffer().put(i);
        byte[] bArrArray = byteBufferAllocate.array();
        int iA = a(bArrArray[0]);
        return (float) (((double) ((a(bArrArray[1]) << 16) + (a(bArrArray[2]) << 8) + a(bArrArray[3]))) * Math.pow(10.0d, (iA & 15) - 16));
    }

    private static String d(float f) {
        int iE = e(f);
        for (int i = 0; i < iE; i++) {
            f = (float) (((double) f) * 10.0d);
        }
        return Integer.toHexString((int) f);
    }

    private static int e(float f) {
        String strValueOf = String.valueOf(f);
        if (strValueOf.contains(".")) {
            return (strValueOf.length() - strValueOf.indexOf(".")) - 1;
        }
        return 0;
    }

    private static int f(float f) {
        String strValueOf = String.valueOf(f);
        if (strValueOf.contains(".")) {
            return strValueOf.indexOf(".");
        }
        return 0;
    }

    public static int g(byte[] bArr) {
        try {
            return new DataInputStream(new ByteArrayInputStream(bArr)).readShort();
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    @TargetApi(9)
    public static byte[] h(byte[] bArr) {
        int length = bArr.length - 1;
        while (length >= 0 && bArr[length] == 0) {
            length--;
        }
        return Arrays.copyOf(bArr, length + 1);
    }

    public static String i(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static byte[] j(byte[] bArr) {
        return b(c(Long.toHexString(m(bArr)), 8));
    }

    public static int k(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return 0;
        }
        return ((bArr[1] << 8) & 65280) | (bArr[0] & 255);
    }

    public static int l(byte[] bArr) {
        if (bArr.length <= 0) {
            return 0;
        }
        int iA = 0;
        for (byte b : bArr) {
            iA += a(b);
        }
        return iA;
    }

    private static long m(byte[] bArr) {
        long[] jArr = new long[256];
        a(jArr);
        long j2 = 0;
        for (byte b : bArr) {
            j2 = (j2 >> 8) ^ jArr[(int) ((((long) b) ^ j2) & 255)];
        }
        return j2;
    }

    public static double a(int i, double d) {
        try {
            return new BigDecimal(d).setScale(i, 4).doubleValue();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0.0d;
        }
    }

    public static String b(int i) {
        if (i <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("0");
        }
        return sb.toString();
    }

    public static float c(short s) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.asShortBuffer().put(s);
        byte[] bArrArray = byteBufferAllocate.array();
        int iA = a(bArrArray[0]);
        return (float) (((double) (((iA & 15) << 8) + a(bArrArray[1]))) * Math.pow(10.0d, ((iA & 240) >> 4) - 16));
    }

    public static String d(byte[] bArr) {
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

    public static String e(byte[] bArr) {
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

    public static int f(byte[] bArr) {
        try {
            return new DataInputStream(new ByteArrayInputStream(bArr)).readInt();
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    private static float a(float f, int i) {
        return new BigDecimal(f).setScale(i - f(f), RoundingMode.HALF_UP).floatValue();
    }

    public static String b(String str, int i) {
        if (str == null || str.equals("")) {
            return "";
        }
        byte[] bytes = str.getBytes();
        int iMin = Math.min(i, bytes.length);
        byte[] bArr = new byte[iMin];
        System.arraycopy(bytes, 0, bArr, 0, iMin);
        String str2 = new String(bArr);
        while (!str.contains(str2)) {
            str2 = str2.substring(0, str2.length() - 1);
        }
        return str2;
    }

    public static String c(String str, int i) {
        String str2 = "";
        if (str == null) {
            return "";
        }
        for (int i2 = 0; i2 < i - str.length(); i2++) {
            str2 = str2 + "0";
        }
        return str2 + str;
    }

    public static int a(byte b) {
        return b & 255;
    }

    public static String b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static String c(byte[] bArr) {
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

    private static int a(char c2, int i) {
        int iDigit = Character.digit(c2, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new RuntimeException("Illegal hexadecimal character " + c2 + " at index " + i);
    }

    public static byte[] b(float f) {
        return new byte[]{(byte) (((float) a(2, f)) * 100.0f), -32};
    }

    public static byte[] c(float f) {
        byte[] bArrA = a(((int) (((float) a(2, f)) * 1000.0f)) / 10, ByteOrder.LITTLE_ENDIAN);
        bArrA[3] = -2;
        return bArrA;
    }

    public static int a(short s) {
        return s & UShort.MAX_VALUE;
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

    public static String a(double d, int i) {
        if (i == 0) {
            return String.valueOf(Math.round(d));
        }
        double d2 = i;
        return String.valueOf(Math.round(d * Math.pow(10.0d, d2)) / Math.pow(10.0d, d2));
    }

    public static byte[] b(short s) {
        return new byte[]{(byte) ((s >> 8) & 255), (byte) (s & 255)};
    }

    public static String a(float f) {
        float fA = a(f, 6);
        String hexString = Integer.toHexString((-e(fA)) & 255);
        String strD = d(fA);
        if (strD.length() < 6) {
            strD = b(6 - strD.length()) + strD;
        }
        return hexString + strD;
    }

    public static String a(String str, int i) {
        int length;
        StringBuilder sb = new StringBuilder();
        if (str != null && str.length() > 0) {
            if (str.length() < i && (length = i - str.length()) > 0) {
                for (int i2 = 0; i2 < length; i2++) {
                    sb.append("0");
                }
            }
            sb.append(str);
        }
        return sb.toString();
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

    @SuppressLint({"NewApi"})
    public static ArrayList a(byte[] bArr, int i) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = bArr.length;
        int i2 = 0;
        while (i2 < length - i) {
            int i3 = i2 + i;
            arrayList.add(Arrays.copyOfRange(bArr, i2, i3));
            i2 = i3;
        }
        arrayList.add(Arrays.copyOfRange(bArr, i2, length));
        return arrayList;
    }

    public static short a(byte[] bArr, ByteOrder byteOrder) {
        if (bArr == null || bArr.length == 0) {
            return (short) 0;
        }
        return ByteBuffer.wrap(bArr).order(byteOrder).getShort();
    }

    private static void a(long[] jArr) {
        for (int i = 0; i < 256; i++) {
            long j2 = i;
            for (int i2 = 0; i2 < 8; i2++) {
                j2 = (j2 & 1) == 1 ? (j2 >> 1) ^ 3988292384L : j2 >> 1;
            }
            jArr[i] = j2;
        }
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

    public static byte[] a(long j2) {
        long j3 = j2 & (-1);
        return new byte[]{(byte) (255 & j3), (byte) ((65280 & j3) >>> 8), (byte) ((16711680 & j3) >>> 16), (byte) ((j3 & (-16777216)) >>> 24)};
    }

    public static byte[] a(String str) {
        if (str != null && str.length() >= 0) {
            try {
                return str.getBytes();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
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
