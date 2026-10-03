package com.oplus.aiunit.vision;

import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public class yvi extends ei0<InputStream> {
    public yvi(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.oplus.aiunit.vision.ft4
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.oplus.aiunit.vision.ei0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // com.oplus.aiunit.vision.ei0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream e(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }
}
