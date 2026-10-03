package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(api = 28)
public final class fd2 implements btf<ByteBuffer, Bitmap> {
    public final ef1 a = new ef1();

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public usf<Bitmap> a(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull erd erdVar) throws IOException {
        return this.a.a(ImageDecoder.createSource(byteBuffer), i, i2, erdVar);
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ByteBuffer byteBuffer, @NonNull erd erdVar) throws IOException {
        return true;
    }
}
