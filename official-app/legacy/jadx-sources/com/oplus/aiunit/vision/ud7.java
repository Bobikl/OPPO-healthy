package com.oplus.aiunit.vision;

import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysJvmKt;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/ud7;", "", "Ljava/io/InputStream;", "inputStream", "", "start", "", "count", "", "a", "<init>", "()V", "olive-decoder"}, k = 1, mv = {1, 6, 0})
public final class ud7 {

    @NotNull
    public static final ud7 INSTANCE = new ud7();

    @JvmStatic
    @NotNull
    public static final byte[] a(@NotNull InputStream inputStream, long start, int count) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        long jSkip = 0;
        while (jSkip < start) {
            try {
                jSkip += inputStream.skip(start - jSkip);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(inputStream, th);
                    throw th2;
                }
            }
        }
        byte[] bArr = new byte[count];
        int i = 0;
        int i2 = count;
        while (i < count) {
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 == -1) {
                break;
            }
            i += i3;
            i2 -= i3;
        }
        byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(bArr, 0, i);
        CloseableKt.closeFinally(inputStream, null);
        return bArrCopyOfRange;
    }
}
