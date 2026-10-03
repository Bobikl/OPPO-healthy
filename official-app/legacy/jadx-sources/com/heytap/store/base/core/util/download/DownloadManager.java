package com.heytap.store.base.core.util.download;

import android.app.Activity;
import com.heytap.store.base.core.util.file.FileUtils;
import com.heytap.store.base.core.util.permission.PermissionDialog;
import com.heytap.store.base.core.util.thread.AppThreadExecutor;
import com.heytap.store.platform.download.DownloadManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public class DownloadManager {
    private static volatile DownloadManager instance;
    private final DownloadManagerImpl downloadManagerImpl;

    private DownloadManager() {
        DownloadManagerImpl downloadManagerImpl = new DownloadManagerImpl() { // from class: com.heytap.store.base.core.util.download.DownloadManager.1
            @Override // com.heytap.store.platform.download.DownloadManagerImpl
            public DownLoadTask createdDownloadTaskAction(String str, boolean z, DownLoadTask.DownLoadListener downLoadListener) {
                return new StoreDownloadTask(str, z, downLoadListener);
            }
        };
        this.downloadManagerImpl = downloadManagerImpl;
        downloadManagerImpl.setThreadExecutor(AppThreadExecutor.getInstance().forBackgroundTasks());
        downloadManagerImpl.setDefaultPath(FileUtils.GOODS_INVOICE);
    }

    public static DownloadManager getInstance() {
        if (instance == null) {
            synchronized (DownloadManager.class) {
                if (instance == null) {
                    instance = new DownloadManager();
                }
            }
        }
        return instance;
    }

    public void cancelDownload(String str) {
        this.downloadManagerImpl.cancelDownload(str);
    }

    public synchronized void checkUnRegisterNet() {
        this.downloadManagerImpl.checkUnRegisterNet();
    }

    public synchronized void download(Activity activity, String str, DownLoadTask.DownLoadListener downLoadListener) {
        if (activity == null) {
            return;
        }
        if (PermissionDialog.reCheckStoragePermission(activity, 109)) {
            this.downloadManagerImpl.download(activity, str, downLoadListener);
        }
    }

    public synchronized void downloadForFailUrl(String str, DownLoadTask downLoadTask) {
        this.downloadManagerImpl.downloadForFailUrl(str, downLoadTask);
    }

    public synchronized void downloadForPointDown(Activity activity, String str, DownLoadTask.DownLoadListener downLoadListener, String str2, String str3) {
        if (activity == null) {
            return;
        }
        if (PermissionDialog.reCheckStoragePermission(activity, 109)) {
            download(str, downLoadListener, str2, str3, false, true, true);
        }
    }

    public boolean hasDownloadingTask() {
        return this.downloadManagerImpl.hasDownloadingTask();
    }

    public boolean isDownloading(String str) {
        return this.downloadManagerImpl.isDownloading(str);
    }

    public void registerNetWorkMonitor() {
        this.downloadManagerImpl.registerNetWorkMonitor();
    }

    public void removeDownload(String str) {
        this.downloadManagerImpl.removeDownload(str);
    }

    public synchronized void saveFailDownLoadUrl(String str, DownLoadTask downLoadTask) {
        this.downloadManagerImpl.saveFailDownLoadUrl(str, downLoadTask);
    }

    public void unRegisterNetWorkMonitor() {
        this.downloadManagerImpl.unRegisterNetWorkMonitor();
    }

    public synchronized void download(Activity activity, String str, DownLoadTask.DownLoadListener downLoadListener, String str2, String str3) {
        if (activity == null) {
            return;
        }
        if (PermissionDialog.reCheckStoragePermission(activity, 109)) {
            download(str, downLoadListener, str2, str3, false);
        }
    }

    public synchronized void download(String str, DownLoadTask.DownLoadListener downLoadListener, String str2, String str3, boolean z) {
        this.downloadManagerImpl.download(str, downLoadListener, str2, str3, z);
    }

    public synchronized void download(String str, DownLoadTask.DownLoadListener downLoadListener, String str2, String str3, boolean z, boolean z2, boolean z3) {
        download(str, downLoadListener, str2, str3, z, z2, z3, -1L);
    }

    public synchronized void download(String str, DownLoadTask.DownLoadListener downLoadListener, String str2, String str3, boolean z, boolean z2, boolean z3, long j2) {
        this.downloadManagerImpl.download(str, downLoadListener, str2, str3, z, z2, z3, j2);
    }
}
