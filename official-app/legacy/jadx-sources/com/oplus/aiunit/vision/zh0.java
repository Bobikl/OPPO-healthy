package com.oplus.aiunit.vision;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public final class zh0 extends l4b<AssetFileDescriptor> {
    public zh0(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // com.oplus.aiunit.vision.ft4
    @NonNull
    public Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.oplus.aiunit.vision.l4b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.oplus.aiunit.vision.l4b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor e(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorOpenAssetFileDescriptor != null) {
            return assetFileDescriptorOpenAssetFileDescriptor;
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
