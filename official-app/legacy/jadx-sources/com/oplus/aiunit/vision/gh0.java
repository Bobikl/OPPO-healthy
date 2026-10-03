package com.oplus.aiunit.vision;

import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\"\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t\u001a\n\u0010\r\u001a\u00020\u0000*\u00020\u0000¨\u0006\u000e"}, d2 = {"", "", "reverse", "", "b", "", "c", "start", "length", "Ljava/nio/charset/Charset;", "charset", "", "d", "a", "olive-decoder"}, k = 2, mv = {1, 6, 0})
public final class gh0 {
    @NotNull
    public static final byte[] a(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length == 2) {
            return new byte[]{bArr[1], bArr[0]};
        }
        throw new IllegalArgumentException("byteArray must be 2 size");
    }

    public static final int b(@NotNull byte[] bArr, boolean z) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 4) {
            throw new IllegalArgumentException("byteArray must less 4 byte");
        }
        int i = 0;
        if (z) {
            for (int lastIndex = ArraysKt___ArraysKt.getLastIndex(bArr); lastIndex >= 0; lastIndex--) {
                i = (i << 8) | (bArr[lastIndex] & 255);
            }
            return i;
        }
        int length = bArr.length;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            i++;
            i2 = (i2 << 8) | (b & 255);
        }
        return i2;
    }

    public static final short c(@NotNull byte[] bArr, boolean z) {
        byte b;
        byte b2;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (bArr.length > 2) {
            throw new IllegalArgumentException("byteArray must less 2 byte");
        }
        if (z) {
            b = bArr[0];
            b2 = bArr[1];
        } else {
            b = bArr[1];
            b2 = bArr[0];
        }
        return (short) (b2 | (b << 8));
    }

    @NotNull
    public static final String d(@NotNull byte[] bArr, int i, int i2, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(bArr, i, i2, charset);
    }
}
