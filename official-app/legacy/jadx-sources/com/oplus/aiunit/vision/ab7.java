package com.oplus.aiunit.vision;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class ab7 extends ei0<AssetFileDescriptor> {
    public ab7(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.oplus.aiunit.vision.ft4
    @NonNull
    public Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // com.oplus.aiunit.vision.ei0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // com.oplus.aiunit.vision.ei0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public AssetFileDescriptor e(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }
}
