package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes13.dex */
public class te1 implements mtf<Bitmap, byte[]> {
    public final Bitmap.CompressFormat a;
    public final int b;

    public te1() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // com.oplus.aiunit.vision.mtf
    @Nullable
    public usf<byte[]> a(@NonNull usf<Bitmap> usfVar, @NonNull erd erdVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        usfVar.get().compress(this.a, this.b, byteArrayOutputStream);
        usfVar.recycle();
        return new td2(byteArrayOutputStream.toByteArray());
    }

    public te1(@NonNull Bitmap.CompressFormat compressFormat, int i) {
        this.a = compressFormat;
        this.b = i;
    }
}
