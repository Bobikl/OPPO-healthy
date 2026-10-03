package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.heytap.health.wallet.model.WatchImageInfo;

/* JADX INFO: loaded from: classes18.dex */
public class bg1 {
    public static WatchImageInfo a() {
        return aec.n();
    }

    public static Bitmap b(Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }
}
