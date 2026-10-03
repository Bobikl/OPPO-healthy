package com.oplus.aiunit.vision;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes13.dex */
public class k68 implements etf<GifDrawable> {
    @Override // com.oplus.aiunit.vision.etf
    @NonNull
    public EncodeStrategy a(@NonNull erd erdVar) {
        return EncodeStrategy.SOURCE;
    }

    @Override // com.oplus.aiunit.vision.im6
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull usf<GifDrawable> usfVar, @NonNull File file, @NonNull erd erdVar) throws Throwable {
        try {
            md2.f(usfVar.get().c(), file);
            return true;
        } catch (IOException e2) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            }
            return false;
        }
    }
}
