package com.oplus.aiunit.vision;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class bwi implements btf<InputStream, GifDrawable> {
    public final List<ImageHeaderParser> a;
    public final btf<ByteBuffer, GifDrawable> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ch0 f9875c;

    public bwi(List<ImageHeaderParser> list, btf<ByteBuffer, GifDrawable> btfVar, ch0 ch0Var) {
        this.a = list;
        this.b = btfVar;
        this.f9875c = ch0Var;
    }

    public static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (IOException e2) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            return null;
        }
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public usf<GifDrawable> a(@NonNull InputStream inputStream, int i, int i2, @NonNull erd erdVar) throws IOException {
        byte[] bArrE = e(inputStream);
        if (bArrE == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(bArrE), i, i2, erdVar);
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull InputStream inputStream, @NonNull erd erdVar) throws IOException {
        return !((Boolean) erdVar.a(r68.DISABLE_ANIMATION)).booleanValue() && com.bumptech.glide.load.a.f(this.a, inputStream, this.f9875c) == ImageHeaderParser.ImageType.GIF;
    }
}
