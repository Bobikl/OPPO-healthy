package com.oplus.aiunit.vision;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public final class gui {
    public static File a(Context context, boolean z) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir;
        }
        return new File("/data/data/" + context.getPackageName() + "/cache/");
    }

    public static File b(Context context) {
        return new File(a(context, true), "video-cache");
    }
}
