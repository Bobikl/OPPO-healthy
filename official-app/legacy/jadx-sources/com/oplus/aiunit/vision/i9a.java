package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(api = 28)
public final class i9a implements btf<InputStream, Bitmap> {
    public final ef1 a = new ef1();

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public usf<Bitmap> a(@NonNull InputStream inputStream, int i, int i2, @NonNull erd erdVar) throws IOException {
        return this.a.a(ImageDecoder.createSource(md2.b(inputStream)), i, i2, erdVar);
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull InputStream inputStream, @NonNull erd erdVar) throws IOException {
        return true;
    }
}
