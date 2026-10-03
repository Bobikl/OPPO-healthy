package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

/* JADX INFO: loaded from: classes13.dex */
public interface st5 {

    public interface a {
        public static final String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
        public static final int DEFAULT_DISK_CACHE_SIZE = 262144000;

        @Nullable
        st5 build();
    }

    public interface b {
        boolean a(@NonNull File file);
    }

    @Nullable
    File a(ona onaVar);

    void b(ona onaVar, b bVar);

    void clear();
}
