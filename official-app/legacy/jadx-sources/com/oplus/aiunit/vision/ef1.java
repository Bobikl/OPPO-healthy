package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(api = 28)
public final class ef1 implements btf<ImageDecoder.Source, Bitmap> {
    public final kf1 a = new lf1();

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public usf<Bitmap> a(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull erd erdVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new h55(i, i2, erdVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new mf1(bitmapDecodeBitmap, this.a);
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ImageDecoder.Source source, @NonNull erd erdVar) throws IOException {
        return true;
    }
}
