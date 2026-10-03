package com.heytap.store.platform.download;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.heytap.store.base.core.util.download.DownLoadTask;
import com.heytap.store.platform.tools.NetworkUtils;
import com.heytap.store.platform.tools.OnNetworkStatusChangedListener;
import com.heytap.store.platform.tools.SimpleNetworkInfo;
import com.heytap.store.platform.tools.ThreadUtils;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public class DownloadManagerImpl {
    private static volatile DownloadManagerImpl instance;
    private Executor executor;
    private final List<String> downloadInfoList = new ArrayList();
    private final HashMap<String, DownLoadTask> failDownLoadTaskMap = new HashMap<>();
    private final Map<String, DownLoadTask> mDownloadTaskMap = new HashMap();
    private String defaultDir = null;
    private final OnNetworkStatusChangedListener networkMonitor = new OnNetworkStatusChangedListener() { // from class: com.heytap.store.platform.download.DownloadManagerImpl.1
        @Override // com.heytap.store.platform.tools.OnNetworkStatusChangedListener
        public void onConnected(@Nullable SimpleNetworkInfo simpleNetworkInfo) {
            if (simpleNetworkInfo == null || !simpleNetworkInfo.isAvailable().booleanValue()) {
                return;
            }
            for (String str : DownloadManagerImpl.this.failDownLoadTaskMap.keySet()) {
                DownloadManagerImpl downloadManagerImpl = DownloadManagerImpl.this;
                downloadManagerImpl.downloadForFailUrl(str, (DownLoadTask) downloadManagerImpl.failDownLoadTaskMap.get(str));
            }
            DownloadManagerImpl.this.failDownLoadTaskMap.clear();
        }

        @Override // com.heytap.store.platform.tools.OnNetworkStatusChangedListener
        public void onDisconnected() {
        }
    };
    private boolean isRegister = false;

    private DownLoadTask createdDownloadTask(String str, boolean z, DownLoadTask.DownLoadListener downLoadListener, String str2, String str3) {
        DownLoadTask downLoadTaskCreatedDownloadTaskAction = createdDownloadTaskAction(str, z, downLoadListener);
        if (str2 == null) {
            str2 = this.defaultDir;
        }
        if (str3 == null) {
            str3 = getDeepLinkParameter(str) + ".pdf";
        }
        if (str2 != null) {
            downLoadTaskCreatedDownloadTaskAction.setFileName(str2, str3);
        }
        return downLoadTaskCreatedDownloadTaskAction;
    }

    private String getDeepLinkParameter(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("pid");
        if (!TextUtils.isEmpty(queryParameter)) {
            return queryParameter;
        }
        return System.currentTimeMillis() + "";
    }

    public static DownloadManagerImpl getInstance() {
        if (instance == null) {
            synchronized (DownloadManagerImpl.class) {
                if (instance == null) {
                    instance = new DownloadManagerImpl();
                }
            }
        }
        return instance;
    }

    private synchronized Executor getThreadExecutor() {
        if (this.executor == null) {
            this.executor = Executors.newFixedThreadPool(5);
        }
        return this.executor;
    }

    public void cancelDownload(String str) {
        DownLoadTask downLoadTask;
        if (TextUtils.isEmpty(str) || (downLoadTask = this.mDownloadTaskMap.get(str)) == null) {
            return;
        }
        downLoadTask.cancel();
    }

    public synchronized void checkUnRegisterNet() {
        if (this.downloadInfoList.size() == 0) {
            unRegisterNetWorkMonitor();
        }
    }

    public DownLoadTask createdDownloadTaskAction(String str, boolean z, DownLoadTask.DownLoadListener downLoadListener) {
        return new DownLoadTask(str, z, downLoadListener);
    }

    public synchronized void download(Activity activity, String str, DownLoadTask.DownLoadListener downLoadListener) {
        if (activity == null) {
            return;
        }
        this.downloadInfoList.add(str);
        getThreadExecutor().execute(createdDownloadTask(str, false, downLoadListener, null, null));
    }

    public synchronized void downloadForFailUrl(String str, DownLoadTask downLoadTask) {
        if (this.downloadInfoList.contains(str)) {
            return;
        }
        this.downloadInfoList.add(str);
        this.mDownloadTaskMap.put(str, downLoadTask);
        getThreadExecutor().execute(downLoadTask);
    }

    public synchronized void downloadForPointDown(Activity activity, String str, DownLoadTask.DownLoadListener downLoadListener, String str2, String str3) {
        if (activity == null) {
            return;
        }
        download(str, downLoadListener, str2, str3, false, true, true);
    }

    public boolean hasDownloadingTask() {
        return this.downloadInfoList.size() > 0;
    }

    public boolean isDownloading(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            for (String str2 : this.downloadInfoList) {
                if (!TextUtils.isEmpty(str2) && str2.equals(str)) {
                    return true;
                }
            }
        } catch (ConcurrentModificationException e2) {
            e2.printStackTrace();
        }
        return false;
    }

    public void registerNetWorkMonitor() {
        ThreadUtils.runOnUiThread(new Runnable() { // from class: com.heytap.store.platform.download.DownloadManagerImpl.2
            @Override // java.lang.Runnable
            public void run() {
                if (DownloadManagerImpl.this.isRegister) {
                    return;
                }
                DownloadManagerImpl.this.isRegister = true;
                DownloadManagerImpl.this.failDownLoadTaskMap.clear();
                NetworkUtils.INSTANCE.registerNetworkStatusChangedListener(DownloadManagerImpl.this.networkMonitor);
            }
        });
    }

    public void removeDownload(String str) {
        this.downloadInfoList.remove(str);
        this.mDownloadTaskMap.remove(str);
    }

    public synchronized void saveFailDownLoadUrl(final String str, final DownLoadTask downLoadTask) {
        ThreadUtils.runOnUiThread(new Runnable() { // from class: com.heytap.store.platform.download.DownloadManagerImpl.4
            @Override // java.lang.Runnable
            public void run() {
                DownloadManagerImpl.this.failDownLoadTaskMap.put(str, downLoadTask);
            }
        });
    }

    public void setDefaultPath(String str) {
        this.defaultDir = str;
    }

    public synchronized void setThreadExecutor(Executor executor) {
        this.executor = executor;
    }

    public void unRegisterNetWorkMonitor() {
        ThreadUtils.runOnUiThread(new Runnable() { // from class: com.heytap.store.platform.download.DownloadManagerImpl.3
            @Override // java.lang.Runnable
            public void run() {
                if (DownloadManagerImpl.this.isRegister) {
                    NetworkUtils.INSTANCE.unregisterNetworkStatusChangedListener(DownloadManagerImpl.this.networkMonitor);
                    DownloadManagerImpl.this.isRegister = false;
                }
            }
        });
    }

    public synchronized void download(Activity activity, String str, DownLoadTask.DownLoadListener downLoadListener, String str2, String str3) {
        download(str, downLoadListener, str2, str3, false);
    }

    public synchronized void download(String str, DownLoadTask.DownLoadListener downLoadListener, String str2, String str3, boolean z) {
        this.downloadInfoList.add(str);
        DownLoadTask downLoadTaskCreatedDownloadTask = createdDownloadTask(str, false, downLoadListener, str2, str3);
        downLoadTaskCreatedDownloadTask.setNeedNotice(Boolean.valueOf(z));
        this.mDownloadTaskMap.put(str, downLoadTaskCreatedDownloadTask);
        getThreadExecutor().execute(downLoadTaskCreatedDownloadTask);
    }

    public synchronized void download(String str, DownLoadTask.DownLoadListener downLoadListener, String str2, String str3, boolean z, boolean z2, boolean z3) {
        download(str, downLoadListener, str2, str3, z, z2, z3, -1L);
    }

    public synchronized void download(String str, DownLoadTask.DownLoadListener downLoadListener, String str2, String str3, boolean z, boolean z2, boolean z3, long j2) {
        if (z3) {
            registerNetWorkMonitor();
        }
        List<String> list = this.downloadInfoList;
        if (list != null && list.contains(str)) {
            this.mDownloadTaskMap.get(str).addDownLoadListener(downLoadListener);
            return;
        }
        this.downloadInfoList.add(str);
        DownLoadTask downLoadTaskCreatedDownloadTask = createdDownloadTask(str, z2, downLoadListener, str2, str3);
        downLoadTaskCreatedDownloadTask.setNeedNotice(Boolean.valueOf(z));
        downLoadTaskCreatedDownloadTask.setLimitedLength(j2);
        this.mDownloadTaskMap.put(str, downLoadTaskCreatedDownloadTask);
        getThreadExecutor().execute(downLoadTaskCreatedDownloadTask);
    }
}
