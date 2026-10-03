package com.heytap.store.platform.imageloader;

import android.net.Uri;
import android.widget.ImageView;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH&J,\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/heytap/store/platform/imageloader/ImageEngine;", "Lcom/heytap/store/platform/imageloader/FileCache;", "downloadOnly", "", "url", "", "listener", "Lcom/heytap/store/platform/imageloader/DownloadListener;", "init", "diskCacheConfig", "Lcom/heytap/store/platform/imageloader/DiskCacheConfig;", "loadUri", ParserTag.TAG_URI, "Landroid/net/Uri;", "imageView", "Landroid/widget/ImageView;", "options", "Lcom/heytap/store/platform/imageloader/Options;", "Lcom/heytap/store/platform/imageloader/RequestListener;", "ImageLoader_release"}, k = 1, mv = {1, 4, 0})
public interface ImageEngine extends FileCache {
    void downloadOnly(@NotNull String url, @Nullable DownloadListener listener);

    void init(@Nullable DiskCacheConfig diskCacheConfig);

    void loadUri(@NotNull Uri uri, @NotNull ImageView imageView, @Nullable Options options, @Nullable RequestListener listener);
}
