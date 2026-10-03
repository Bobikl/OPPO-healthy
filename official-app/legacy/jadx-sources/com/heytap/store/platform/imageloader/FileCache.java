package com.heytap.store.platform.imageloader;

import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import java.io.File;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010\u0011\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/heytap/store/platform/imageloader/FileCache;", "", "count", "", "getCount", "()J", "size", "getSize", "clearCache", "", "clearMemory", "getCacheFile", "Ljava/io/File;", "url", "", "isDownloaded", "", EventType.STATE_PACKAGE_CHANGED_REMOVE, "ImageLoader_release"}, k = 1, mv = {1, 4, 0})
public interface FileCache {
    void clearCache();

    void clearMemory();

    @Nullable
    File getCacheFile(@Nullable String url);

    long getCount();

    long getSize();

    boolean isDownloaded(@Nullable String url);

    void remove(@Nullable String url);
}
