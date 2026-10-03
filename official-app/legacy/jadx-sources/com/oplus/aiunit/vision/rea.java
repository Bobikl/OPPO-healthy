package com.oplus.aiunit.vision;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public final class rea extends bu5 {

    public class a implements bu5.a {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;

        public a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // com.oplus.aiunit.vision.bu5.a
        public File a() {
            File cacheDir = this.a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.b != null ? new File(cacheDir, this.b) : cacheDir;
        }
    }

    public rea(Context context) {
        this(context, st5.a.DEFAULT_DISK_CACHE_DIR, 262144000L);
    }

    public rea(Context context, String str, long j2) {
        super(new a(context, str), j2);
    }
}
