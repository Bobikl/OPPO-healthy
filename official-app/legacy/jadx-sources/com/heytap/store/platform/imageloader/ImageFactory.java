package com.heytap.store.platform.imageloader;

import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/heytap/store/platform/imageloader/ImageFactory;", "", "()V", "config", "Lcom/heytap/store/platform/imageloader/ImageLoaderConfig;", "getConfig", "()Lcom/heytap/store/platform/imageloader/ImageLoaderConfig;", "setConfig", "(Lcom/heytap/store/platform/imageloader/ImageLoaderConfig;)V", "fileCache", "Lcom/heytap/store/platform/imageloader/FileCache;", "mainFileCache", "getMainFileCache", "()Lcom/heytap/store/platform/imageloader/FileCache;", "init", "", "ImageLoader_release"}, k = 1, mv = {1, 4, 0})
public final class ImageFactory {
    public static final ImageFactory INSTANCE = new ImageFactory();

    @Nullable
    private static ImageLoaderConfig config;
    private static FileCache fileCache;

    private ImageFactory() {
    }

    @Nullable
    public final ImageLoaderConfig getConfig() {
        return config;
    }

    @Nullable
    public final FileCache getMainFileCache() {
        if (fileCache == null) {
            ImageLoaderConfig imageLoaderConfig = config;
            fileCache = imageLoaderConfig != null ? imageLoaderConfig.getImageEngine() : null;
        }
        return fileCache;
    }

    public final void init(@Nullable ImageLoaderConfig config2) {
        ImageEngine imageEngine;
        config = config2;
        if (config2 == null || (imageEngine = config2.getImageEngine()) == null) {
            return;
        }
        imageEngine.init(config2.getCacheConfig());
    }

    public final void setConfig(@Nullable ImageLoaderConfig imageLoaderConfig) {
        config = imageLoaderConfig;
    }
}
