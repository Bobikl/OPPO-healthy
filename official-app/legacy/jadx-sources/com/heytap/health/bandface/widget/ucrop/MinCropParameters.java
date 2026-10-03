package com.heytap.health.bandface.widget.ucrop;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.yalantis.ucrop.model.CropParameters;
import com.yalantis.ucrop.model.ExifInfo;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class MinCropParameters extends CropParameters {
    private int mMinResultImageSizeX;
    private int mMinResultImageSizeY;

    public MinCropParameters(int i, int i2, int i3, int i4, Bitmap.CompressFormat compressFormat, int i5, String str, String str2, ExifInfo exifInfo) {
        super(i3, i4, compressFormat, i5, str, str2, exifInfo);
        this.mMinResultImageSizeX = i;
        this.mMinResultImageSizeY = i2;
    }

    public int getMinResultImageSizeX() {
        return this.mMinResultImageSizeX;
    }

    public int getMinResultImageSizeY() {
        return this.mMinResultImageSizeY;
    }
}
