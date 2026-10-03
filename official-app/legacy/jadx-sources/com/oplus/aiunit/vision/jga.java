package com.oplus.aiunit.vision;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Regex;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u001a\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0000¨\u0006\t"}, d2 = {"", "ip", "", "a", "ipAddr", "b", "src", "", "c", "core-statistics_release"}, k = 2, mv = {1, 7, 1})
public final class jga {
    public static final boolean a(@Nullable String str) {
        if (str == null) {
            return false;
        }
        return hga.INSTANCE.b().matcher(new Regex("\\s").replace(str, "")).matches();
    }

    public static final boolean b(@Nullable String str) {
        if (str == null) {
            return false;
        }
        return hga.INSTANCE.a().matcher(str).matches();
    }

    @Nullable
    public static final byte[] c(@NotNull String src) {
        Intrinsics.checkNotNullParameter(src, "src");
        byte[] bArr = new byte[4];
        int length = src.length();
        if (length != 0 && length <= 15) {
            long j2 = 0;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = src.charAt(i2);
                if (cCharAt != '.') {
                    int iDigit = Character.digit(cCharAt, 10);
                    if (iDigit < 0) {
                        return null;
                    }
                    j2 = (j2 * ((long) 10)) + ((long) iDigit);
                } else {
                    if (j2 < 0 || j2 > 255 || i == 3) {
                        return null;
                    }
                    bArr[i] = (byte) (j2 & 255);
                    j2 = 0;
                    i++;
                }
            }
            if (j2 >= 0 && j2 < (1 << ((4 - i) * 8))) {
                if (i == 0) {
                    bArr[0] = (byte) ((j2 >> 24) & 255);
                    bArr[1] = (byte) ((j2 >> 16) & 255);
                    bArr[2] = (byte) ((j2 >> 8) & 255);
                    bArr[3] = (byte) ((j2 >> 0) & 255);
                } else if (i == 1) {
                    bArr[1] = (byte) ((j2 >> 16) & 255);
                    bArr[2] = (byte) ((j2 >> 8) & 255);
                    bArr[3] = (byte) ((j2 >> 0) & 255);
                } else if (i == 2) {
                    bArr[2] = (byte) ((j2 >> 8) & 255);
                    bArr[3] = (byte) ((j2 >> 0) & 255);
                } else if (i == 3) {
                    bArr[3] = (byte) ((j2 >> 0) & 255);
                }
                return bArr;
            }
        }
        return null;
    }
}
