package com.oplus.pantanal.seedling.file;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005H&¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/oplus/pantanal/seedling/file/IFileShare;", "", "deleteDefaultShareFile", "", "fileName", "", "context", "Landroid/content/Context;", "getDefaultFileUri", "Landroid/net/Uri;", "getDefaultShareFileByName", "Ljava/io/File;", "getDefaultShareFileDir", "getShareFileUri", "path", "getShareFileUriByAuthority", "authority", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface IFileShare {
    void deleteDefaultShareFile(@NotNull String fileName, @NotNull Context context);

    @NotNull
    Uri getDefaultFileUri(@NotNull String fileName, @NotNull Context context);

    @NotNull
    File getDefaultShareFileByName(@NotNull String fileName, @NotNull Context context);

    @NotNull
    File getDefaultShareFileDir(@NotNull Context context);

    @NotNull
    Uri getShareFileUri(@NotNull String path, @NotNull Context context);

    @NotNull
    Uri getShareFileUriByAuthority(@NotNull String path, @NotNull Context context, @NotNull String authority);
}
