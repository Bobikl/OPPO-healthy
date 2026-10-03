package com.oplus.aiunit.vision;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class xe1<DataType> implements btf<DataType, BitmapDrawable> {
    public final btf<DataType, Bitmap> a;
    public final Resources b;

    public xe1(@NonNull Resources resources, @NonNull btf<DataType, Bitmap> btfVar) {
        this.b = (Resources) cpe.d(resources);
        this.a = (btf) cpe.d(btfVar);
    }

    @Override // com.oplus.aiunit.vision.btf
    public usf<BitmapDrawable> a(@NonNull DataType datatype, int i, int i2, @NonNull erd erdVar) throws IOException {
        return xua.c(this.b, this.a.a(datatype, i, i2, erdVar));
    }

    @Override // com.oplus.aiunit.vision.btf
    public boolean b(@NonNull DataType datatype, @NonNull erd erdVar) throws IOException {
        return this.a.b(datatype, erdVar);
    }
}
