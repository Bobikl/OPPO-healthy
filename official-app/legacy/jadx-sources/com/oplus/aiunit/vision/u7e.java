package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
@RequiresApi(21)
public final class u7e implements btf<ParcelFileDescriptor, Bitmap> {
    public final com.bumptech.glide.load.resource.bitmap.a a;

    public u7e(com.bumptech.glide.load.resource.bitmap.a aVar) {
        this.a = aVar;
    }

    @Override // com.oplus.aiunit.vision.btf
    @Nullable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public usf<Bitmap> a(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @NonNull erd erdVar) throws IOException {
        return this.a.d(parcelFileDescriptor, i, i2, erdVar);
    }

    @Override // com.oplus.aiunit.vision.btf
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull erd erdVar) {
        return e(parcelFileDescriptor) && this.a.o(parcelFileDescriptor);
    }

    public final boolean e(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }
}
