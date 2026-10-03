package com.oplus.pantanal.seedling.util;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/oplus/pantanal/seedling/util/StringCompressor;", "", "()V", "COMPRESS_SIZE", "", "DECOMPRESS_SIZE", "TAG", "", "decompress", "compressed", "encompress", "uncompressSrc", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class StringCompressor {
    private static final int COMPRESS_SIZE = 512;
    private static final int DECOMPRESS_SIZE = 1024;

    @NotNull
    public static final StringCompressor INSTANCE = new StringCompressor();

    @NotNull
    private static final String TAG = "StringCompressor";

    private StringCompressor() {
    }

    @Nullable
    public final String decompress(@NotNull String compressed) {
        Intrinsics.checkNotNullParameter(compressed, "compressed");
        Logger.INSTANCE.d(TAG, "+ deCompress src size is " + compressed.length());
        byte[] bArrDecode = Base64.decode(compressed, 1);
        Inflater inflater = new Inflater();
        inflater.setInput(bArrDecode);
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        try {
            Result.Companion companion = Result.INSTANCE;
            while (!inflater.finished()) {
                byteArrayOutputStream.write(bArr, 0, inflater.inflate(bArr));
            }
            inflater.end();
            return byteArrayOutputStream.toString();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl == null) {
                return null;
            }
            Logger.INSTANCE.e(TAG, "deCompress has error: " + thM5290exceptionOrNullimpl.getMessage());
            return null;
        }
    }

    @NotNull
    public final String encompress(@NotNull String uncompressSrc) {
        Intrinsics.checkNotNullParameter(uncompressSrc, "uncompressSrc");
        Logger.INSTANCE.d(TAG, "- enCompress source size is " + uncompressSrc.length());
        Deflater deflater = new Deflater(9);
        byte[] bytes = uncompressSrc.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        deflater.setInput(bytes);
        deflater.finish();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        byte[] bArr = new byte[512];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr, 0, deflater.deflate(bArr));
        }
        deflater.end();
        String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 1);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}
