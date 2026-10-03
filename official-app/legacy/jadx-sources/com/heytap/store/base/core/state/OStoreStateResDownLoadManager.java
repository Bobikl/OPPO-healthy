package com.heytap.store.base.core.state;

import com.heytap.log.consts.LogSenderConst;
import com.heytap.store.base.core.util.download.DownLoadTask;
import com.heytap.store.base.core.util.download.DownloadManager;
import com.heytap.store.platform.tools.LogUtils;
import io.netty.util.internal.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/store/base/core/state/OStoreStateResDownLoadManager;", "", "()V", "downLoadRes", "", "url", "", "filePath", LogSenderConst.FILENAME, "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreStateResDownLoadManager {

    @NotNull
    public static final OStoreStateResDownLoadManager INSTANCE = new OStoreStateResDownLoadManager();

    private OStoreStateResDownLoadManager() {
    }

    public final void downLoadRes(@NotNull String url, @NotNull String filePath, @NotNull final String fileName) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (fileName.length() == 0) {
            return;
        }
        if (filePath.length() == 0) {
            return;
        }
        if (url.length() == 0) {
            return;
        }
        DownloadManager.getInstance().download(url, (DownLoadTask.DownLoadListener) new DownLoadTask.DownLoadListener<Object>() { // from class: com.heytap.store.base.core.state.OStoreStateResDownLoadManager$downLoadRes$downLoadListener$1
            @Override // com.heytap.store.base.core.util.download.DownLoadTask.DownLoadListener
            public void onDownLoadStart() {
            }

            @Override // com.heytap.store.base.core.util.download.DownLoadTask.DownLoadListener
            public void onFailure(@Nullable Object t, @Nullable Throwable e2) {
                LogUtils.INSTANCE.d("文件操作", "文件下载失败：" + fileName + StringUtil.COMMA + e2);
            }

            @Override // com.heytap.store.base.core.util.download.DownLoadTask.DownLoadListener
            public void onSuccess(@Nullable Object t, int pisiton) {
                LogUtils logUtils = LogUtils.INSTANCE;
                StringBuilder sb = new StringBuilder();
                sb.append("文件下载成功：");
                sb.append(fileName);
                sb.append(",请下次进入使用---");
                sb.append((Object) (t == null ? null : t.toString()));
                logUtils.d("文件操作", sb.toString());
            }

            @Override // com.heytap.store.base.core.util.download.DownLoadTask.DownLoadListener
            public void updateProgress(@Nullable Object t, long total, long current) {
                LogUtils.INSTANCE.d("文件操作", "文件下载中：" + fileName + StringUtil.COMMA + current + "--" + total);
            }
        }, filePath, fileName, false);
    }
}
