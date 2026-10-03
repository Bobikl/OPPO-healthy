package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes13.dex */
public class ed2 implements btf<ByteBuffer, Bitmap> {
    public final com.bumptech.glide.load.resource.bitmap.a a;

    public ed2(com.bumptech.glide.load.resource.bitmap.a aVar) {
        this.a = aVar;
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public usf<Bitmap> a(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull erd erdVar) throws IOException {
        return this.a.g(byteBuffer, i, i2, erdVar);
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ByteBuffer byteBuffer, @NonNull erd erdVar) {
        return this.a.q(byteBuffer);
    }
}
