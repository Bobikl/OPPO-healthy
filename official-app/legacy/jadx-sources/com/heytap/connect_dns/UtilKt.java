package com.heytap.connect_dns;

import androidx.exifinterface.media.ExifInterface;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Regex;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0003*\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0001\u0010\u0004\u001a\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000e\u0010\u000b\u001a\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a+\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0014*\u00020\u00132\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u0002\u001a\u0015\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"", "default", "(Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/lang/Integer;)I", "", "timeMillis", "()J", "ip", "", "isValidIP", "(Ljava/lang/String;)Z", "isIpv4", "ipAddr", "isValidIpv6", "src", "", "textToByteV4", "(Ljava/lang/String;)[B", "Lcom/heytap/connect_dns/IWeight;", ExifInterface.GPS_DIRECTION_TRUE, "", "weightArr", "randomByWeight", "(Ljava/util/List;)Lcom/heytap/connect_dns/IWeight;", "input", "calcMD5", "data", "([B)Ljava/lang/String;", "connect_release"}, k = 2, mv = {1, 5, 1})
public final class UtilKt {
    @NotNull
    public static final String calcMD5(@NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset()");
        byte[] bytes = input.getBytes(charsetDefaultCharset);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        return calcMD5(bytes);
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final int m4612default(@Nullable Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static final boolean isIpv4(@Nullable String str) {
        if (str == null) {
            return false;
        }
        return IpPattern.INSTANCE.getPATTERN().matcher(new Regex("\\s").replace(str, "")).matches();
    }

    public static final boolean isValidIP(@Nullable String str) {
        return isIpv4(str) || isValidIpv6(str);
    }

    public static final boolean isValidIpv6(@Nullable String str) {
        if (str == null) {
            return false;
        }
        return IpPattern.INSTANCE.getIPV6PATTERN().matcher(str).matches();
    }

    @Nullable
    public static final <T extends IWeight> T randomByWeight(@Nullable List<? extends T> list) {
        int iWeight;
        T t;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int size = list.size();
        int[][] iArr = new int[size][];
        for (int i = 0; i < size; i++) {
            iArr[i] = new int[2];
        }
        if (size > 0) {
            int i2 = 0;
            iWeight = 0;
            while (true) {
                int i3 = i2 + 1;
                iWeight += list.get(i2).weight();
                int[] iArr2 = iArr[i2];
                iArr2[0] = i2;
                iArr2[1] = iWeight;
                if (i3 >= size) {
                    break;
                }
                i2 = i3;
            }
        } else {
            iWeight = 0;
        }
        int iNextInt = new Random().nextInt(iWeight) + 1;
        int i4 = size - 1;
        if (i4 < 0) {
            t = list.get(0);
            break;
        }
        int i5 = 0;
        while (true) {
            int i6 = i5 + 1;
            int[] iArr3 = iArr[i5];
            if (iNextInt <= iArr3[1]) {
                t = list.get(iArr3[0]);
                break;
            }
            if (i6 > i4) {
                t = list.get(0);
                break;
            }
            i5 = i6;
        }
        return t;
    }

    @Nullable
    public static final byte[] textToByteV4(@NotNull String src) {
        int i;
        Intrinsics.checkNotNullParameter(src, "src");
        byte[] bArr = new byte[4];
        int length = src.length();
        if (length != 0 && length <= 15) {
            long j2 = 255;
            long j3 = 0;
            if (length > 0) {
                int i2 = 0;
                i = 0;
                while (true) {
                    int i3 = i2 + 1;
                    char cCharAt = src.charAt(i2);
                    if (cCharAt != '.') {
                        int iDigit = Character.digit(cCharAt, 10);
                        if (iDigit < 0) {
                            return null;
                        }
                        j3 = (j3 * ((long) 10)) + ((long) iDigit);
                    } else {
                        if (j3 < 0 || j3 > j2 || i == 3) {
                            return null;
                        }
                        bArr[i] = (byte) (j3 & j2);
                        j3 = 0;
                        i++;
                    }
                    if (i3 >= length) {
                        break;
                    }
                    i2 = i3;
                    j2 = 255;
                }
            } else {
                i = 0;
            }
            if (j3 >= 0 && j3 < (1 << ((4 - i) * 8))) {
                if (i == 0) {
                    bArr[0] = (byte) ((j3 >> 24) & 255);
                    bArr[1] = (byte) ((j3 >> 16) & 255);
                    bArr[2] = (byte) ((j3 >> 8) & 255);
                    bArr[3] = (byte) ((j3 >> 0) & 255);
                } else if (i == 1) {
                    bArr[1] = (byte) ((j3 >> 16) & 255);
                    bArr[2] = (byte) ((j3 >> 8) & 255);
                    bArr[3] = (byte) ((j3 >> 0) & 255);
                } else if (i == 2) {
                    bArr[2] = (byte) ((j3 >> 8) & 255);
                    bArr[3] = (byte) ((j3 >> 0) & 255);
                } else if (i == 3) {
                    bArr[3] = (byte) ((j3 >> 0) & 255);
                }
                return bArr;
            }
        }
        return null;
    }

    public static final long timeMillis() {
        return System.currentTimeMillis();
    }

    @NotNull
    public static final String calcMD5(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(\"MD5\")");
            messageDigest.update(data);
            byte[] hash = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            Intrinsics.checkNotNullExpressionValue(hash, "hash");
            int length = hash.length;
            int i = 0;
            while (i < length) {
                byte b = hash[i];
                i++;
                int i2 = b & 255;
                if (i2 < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toString(i2, 16));
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sbRet.toString()");
            return string;
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    @NotNull
    /* JADX INFO: renamed from: default, reason: not valid java name */
    public static final String m4613default(@Nullable String str) {
        return str == null ? "" : str;
    }
}
