package org.spongycastle.util;

import com.oplus.aiunit.vision.oei;
import com.oplus.aiunit.vision.u48;
import com.oplus.weatherservicesdk.data.Weather;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import okio.Utf8;

/* JADX INFO: loaded from: classes11.dex */
public final class Strings {
    public static String a;

    public static class StringListImpl extends ArrayList<String> implements Iterable {
        private StringListImpl() {
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ String get(int i) {
            return (String) super.get(i);
        }

        public String[] toStringArray() {
            int size = size();
            String[] strArr = new String[size];
            for (int i = 0; i != size; i++) {
                strArr[i] = get(i);
            }
            return strArr;
        }

        public /* synthetic */ StringListImpl(a aVar) {
            this();
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public String set(int i, String str) {
            return (String) super.set(i, str);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(String str) {
            return super.add(str);
        }

        public String[] toStringArray(int i, int i2) {
            String[] strArr = new String[i2 - i];
            for (int i3 = i; i3 != size() && i3 != i2; i3++) {
                strArr[i3 - i] = get(i3);
            }
            return strArr;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public void add(int i, String str) {
            super.add(i, str);
        }
    }

    public static class a implements PrivilegedAction<String> {
        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            try {
                a = (String) AccessController.doPrivileged(new a());
            } catch (Exception unused) {
                a = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            a = Weather.SEPARATOR;
        }
    }

    public static char[] a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    public static String b(byte[] bArr) {
        return new String(a(bArr));
    }

    public static String c(byte[] bArr) {
        char c2;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < bArr.length) {
            i3++;
            byte b = bArr[i2];
            if ((b & 240) == 240) {
                i3++;
                i2 += 4;
            } else if ((b & 224) == 224) {
                i2 += 3;
            } else {
                i2 = (b & 192) == 192 ? i2 + 2 : i2 + 1;
            }
        }
        char[] cArr = new char[i3];
        int i4 = 0;
        while (i < bArr.length) {
            byte b2 = bArr[i];
            if ((b2 & 240) == 240) {
                int i5 = (((((b2 & 3) << 18) | ((bArr[i + 1] & Utf8.REPLACEMENT_BYTE) << 12)) | ((bArr[i + 2] & Utf8.REPLACEMENT_BYTE) << 6)) | (bArr[i + 3] & Utf8.REPLACEMENT_BYTE)) - 65536;
                char c3 = (char) ((i5 >> 10) | u48.SURR1_FIRST);
                c2 = (char) ((i5 & 1023) | 56320);
                cArr[i4] = c3;
                i += 4;
                i4++;
            } else if ((b2 & 224) == 224) {
                c2 = (char) (((b2 & 15) << 12) | ((bArr[i + 1] & Utf8.REPLACEMENT_BYTE) << 6) | (bArr[i + 2] & Utf8.REPLACEMENT_BYTE));
                i += 3;
            } else if ((b2 & 208) == 208 || (b2 & 192) == 192) {
                int i6 = (b2 & 31) << 6;
                byte b3 = bArr[i + 1];
                c2 = (char) (i6 | (b3 & Utf8.REPLACEMENT_BYTE));
                i += 2;
            } else {
                c2 = (char) (b2 & 255);
                i++;
            }
            cArr[i4] = c2;
            i4++;
        }
        return new String(cArr);
    }

    public static String d() {
        return a;
    }

    public static byte[] e(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static String f(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c2 = charArray[i];
            if ('A' <= c2 && 'Z' >= c2) {
                charArray[i] = (char) ((c2 - 'A') + 97);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static void g(char[] cArr, OutputStream outputStream) throws IOException {
        int i = 0;
        while (i < cArr.length) {
            char c2 = cArr[i];
            if (c2 < 128) {
                outputStream.write(c2);
            } else if (c2 < 2048) {
                outputStream.write((c2 >> 6) | 192);
                outputStream.write((c2 & '?') | 128);
            } else if (c2 < 55296 || c2 > 57343) {
                outputStream.write((c2 >> '\f') | oei.TAI_CHI);
                outputStream.write(((c2 >> 6) & 63) | 128);
                outputStream.write((c2 & '?') | 128);
            } else {
                i++;
                if (i >= cArr.length) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                char c3 = cArr[i];
                if (c2 > 56319) {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
                int i2 = (((c2 & 1023) << 10) | (c3 & 1023)) + 65536;
                outputStream.write((i2 >> 18) | 240);
                outputStream.write(((i2 >> 12) & 63) | 128);
                outputStream.write(((i2 >> 6) & 63) | 128);
                outputStream.write((i2 & 63) | 128);
            }
            i++;
        }
    }

    public static byte[] h(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            g(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static String i(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c2 = charArray[i];
            if ('a' <= c2 && 'z' >= c2) {
                charArray[i] = (char) ((c2 - 'a') + 65);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }
}
