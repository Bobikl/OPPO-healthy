package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class bb7 extends l4b<ParcelFileDescriptor> {
    public bb7(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.oplus.aiunit.vision.ft4
    @NonNull
    public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    @Override // com.oplus.aiunit.vision.l4b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // com.oplus.aiunit.vision.l4b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor e(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
