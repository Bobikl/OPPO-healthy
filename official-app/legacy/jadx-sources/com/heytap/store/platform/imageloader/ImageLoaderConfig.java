package com.heytap.store.platform.imageloader;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/heytap/store/platform/imageloader/ImageLoaderConfig;", "", "cacheConfig", "Lcom/heytap/store/platform/imageloader/DiskCacheConfig;", "imageEngine", "Lcom/heytap/store/platform/imageloader/ImageEngine;", "(Lcom/heytap/store/platform/imageloader/DiskCacheConfig;Lcom/heytap/store/platform/imageloader/ImageEngine;)V", "getCacheConfig", "()Lcom/heytap/store/platform/imageloader/DiskCacheConfig;", "setCacheConfig", "(Lcom/heytap/store/platform/imageloader/DiskCacheConfig;)V", "getImageEngine", "()Lcom/heytap/store/platform/imageloader/ImageEngine;", "setImageEngine", "(Lcom/heytap/store/platform/imageloader/ImageEngine;)V", "ImageLoader_release"}, k = 1, mv = {1, 4, 0})
public class ImageLoaderConfig {

    @Nullable
    private DiskCacheConfig cacheConfig;

    @NotNull
    private ImageEngine imageEngine;

    public ImageLoaderConfig(@Nullable DiskCacheConfig diskCacheConfig, @NotNull ImageEngine imageEngine) {
        Intrinsics.checkNotNullParameter(imageEngine, "imageEngine");
        this.cacheConfig = diskCacheConfig;
        this.imageEngine = imageEngine;
    }

    @Nullable
    public final DiskCacheConfig getCacheConfig() {
        return this.cacheConfig;
    }

    @NotNull
    public final ImageEngine getImageEngine() {
        return this.imageEngine;
    }

    public final void setCacheConfig(@Nullable DiskCacheConfig diskCacheConfig) {
        this.cacheConfig = diskCacheConfig;
    }

    public final void setImageEngine(@NotNull ImageEngine imageEngine) {
        Intrinsics.checkNotNullParameter(imageEngine, "<set-?>");
        this.imageEngine = imageEngine;
    }
}
