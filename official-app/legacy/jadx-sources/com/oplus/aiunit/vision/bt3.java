package com.oplus.aiunit.vision;

import android.os.SystemClock;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/bt3;", "", "", "compressedData", "a", "<init>", "()V", "foundation-internal_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCompressHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompressHelper.kt\ncom/pantanal/fundation/internal/utils/CompressHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
public final class bt3 {

    @NotNull
    public static final bt3 INSTANCE = new bt3();

    @NotNull
    public final byte[] a(@NotNull byte[] compressedData) {
        Intrinsics.checkNotNullParameter(compressedData, "compressedData");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(compressedData);
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = gZIPInputStream.read(bArr);
                            if (i <= 0) {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                bs9.a.c(t6e.INSTANCE, "CompressHelper", "decompressData old size=" + compressedData.length + ", new size=" + byteArray.length + ",const time=" + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms", false, null, false, 0, false, null, 252, null);
                                CloseableKt.closeFinally(byteArrayOutputStream, null);
                                CloseableKt.closeFinally(gZIPInputStream, null);
                                CloseableKt.closeFinally(byteArrayInputStream, null);
                                Intrinsics.checkNotNullExpressionValue(byteArray, "{\n            // 使用 try-…}\n            }\n        }");
                                return byteArray;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                            try {
                                throw th;
                            } catch (Throwable th) {
                                CloseableKt.closeFinally(gZIPInputStream, th);
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(byteArrayOutputStream, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    CloseableKt.closeFinally(byteArrayInputStream, th5);
                    throw th6;
                }
            }
        } catch (IOException e2) {
            bs9.a.e(t6e.INSTANCE, "CompressHelper", "the original data is uncompressed and does not support decompression: " + e2.getMessage(), false, null, false, 0, false, null, 252, null);
            return compressedData;
        }
    }
}
