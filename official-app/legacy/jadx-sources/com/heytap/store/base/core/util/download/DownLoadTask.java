package com.heytap.store.base.core.util.download;

import android.net.Uri;
import android.text.TextUtils;
import com.heytap.store.platform.download.DownloadManagerImpl;
import com.heytap.store.platform.tools.ThreadUtils;
import com.heytap.store.platform.tools.ToastUtils;
import com.oplus.aiunit.vision.cuf;
import com.oplus.aiunit.vision.efd;
import com.oplus.aiunit.vision.wr2;
import com.oplus.aiunit.vision.ytf;
import com.oplus.aiunit.vision.zs2;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.Request;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes3.dex */
public class DownLoadTask implements Runnable {
    private static final String TAG = "DownLoadTask";
    AtomicLong contentLength;
    protected String fileName;
    protected String fileSavePath;
    private final String fileUrl;
    private boolean isNeedBreakPointDownLoad;
    AtomicLong limitedLength;
    private Set<DownLoadListener> listeners;
    protected boolean mIsCancel;
    private boolean needNotice;
    private final int position;

    /* JADX INFO: renamed from: com.heytap.store.base.core.util.download.DownLoadTask$2, reason: invalid class name */
    public class AnonymousClass2 implements zs2 {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFailure$0(IOException iOException) {
            DownloadManagerImpl.getInstance().removeDownload(DownLoadTask.this.fileUrl);
            DownLoadTask.this.callDownLoadFail(null, iOException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onResponse$1(boolean z) {
            DownloadManagerImpl.getInstance().removeDownload(DownLoadTask.this.fileUrl);
            if (!z) {
                if (DownLoadTask.this.needNotice) {
                    ToastUtils.INSTANCE.show("失败，请重新下载", 0, 0, 0);
                }
                DownLoadTask.this.callDownLoadFail(null, new Exception("download failed"));
                return;
            }
            if (DownLoadTask.this.needNotice) {
                ToastUtils.INSTANCE.show("下载成功，可在系统文件管理中查看" + DownLoadTask.this.fileSavePath, 0, 0, 0);
            }
            DownLoadTask downLoadTask = DownLoadTask.this;
            downLoadTask.callDownLoadSuccess(downLoadTask.fileSavePath, -1);
            DownloadManagerImpl.getInstance().checkUnRegisterNet();
        }

        @Override // com.oplus.aiunit.vision.zs2
        public void onFailure(wr2 wr2Var, final IOException iOException) {
            ThreadUtils.runOnUiThread(new Runnable() { // from class: com.heytap.store.base.core.util.download.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$onFailure$0(iOException);
                }
            });
        }

        @Override // com.oplus.aiunit.vision.zs2
        public void onResponse(wr2 wr2Var, ytf ytfVar) throws IOException {
            final boolean zDownloadNormalFile = false;
            if (ytfVar != null) {
                zDownloadNormalFile = ytfVar.getBody() != null ? DownLoadTask.this.downloadNormalFile(ytfVar.getBody(), DownLoadTask.this.contentLength.get()) : false;
                ytfVar.close();
            }
            ThreadUtils.runOnUiThread(new Runnable() { // from class: com.heytap.store.base.core.util.download.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$onResponse$1(zDownloadNormalFile);
                }
            });
        }
    }

    public interface DownLoadListener<T> {
        void onDownLoadStart();

        void onFailure(T t, Throwable th);

        void onSuccess(T t, int i);

        void updateProgress(T t, long j2, long j3);
    }

    public DownLoadTask(String str, DownLoadListener downLoadListener) {
        this.position = -1;
        this.needNotice = true;
        this.mIsCancel = false;
        this.isNeedBreakPointDownLoad = false;
        this.listeners = new HashSet();
        this.contentLength = new AtomicLong();
        this.limitedLength = new AtomicLong(-1L);
        this.fileUrl = str;
        this.listeners.add(downLoadListener);
    }

    private long getContentLength() {
        if (ThreadUtils.isMainThread()) {
            throw new IllegalArgumentException("can not run UIThread!");
        }
        try {
            String strP = new efd().a(new Request.Builder().get().url(this.fileUrl).build()).execute().p("Content-Length");
            if (strP == null) {
                return 0L;
            }
            return Long.parseLong(strP);
        } catch (Exception unused) {
            return 0L;
        }
    }

    private String getDeepLinkParameter(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("pid");
        if (!TextUtils.isEmpty(queryParameter)) {
            return queryParameter;
        }
        return System.currentTimeMillis() + "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$run$0() {
        callDownLoadFail(null, new NullPointerException("limitedLength :" + this.contentLength.get() + " is more sized than  contentLength : " + this.contentLength.get()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$run$1() {
        callDownLoadFail(null, new NullPointerException("contentLength is 0"));
    }

    public synchronized void addDownLoadListener(DownLoadListener downLoadListener) {
        this.listeners.add(downLoadListener);
    }

    public synchronized void addDownLoadListeners(Set<DownLoadListener> set) {
        set.addAll(set);
    }

    public synchronized void callDownLoadFail(Object obj, Throwable th) {
        Set<DownLoadListener> set = this.listeners;
        if (set != null && set.size() != 0) {
            for (DownLoadListener downLoadListener : this.listeners) {
                if (downLoadListener != null) {
                    downLoadListener.onFailure(obj, th);
                }
            }
        }
        if ((th instanceof StreamResetException) && ((StreamResetException) th).errorCode.httpCode == 8 && ((StreamResetException) th).errorCode.name().equals("CANCEL")) {
            DownloadManagerImpl.getInstance().saveFailDownLoadUrl(this.fileUrl, this);
        }
    }

    public synchronized void callDownLoadProgress(Object obj, long j2, long j3) {
        Set<DownLoadListener> set = this.listeners;
        if (set != null && set.size() != 0) {
            for (DownLoadListener downLoadListener : this.listeners) {
                if (downLoadListener != null) {
                    downLoadListener.updateProgress(obj, j2, j3);
                }
            }
        }
    }

    public synchronized void callDownLoadStart() {
        Set<DownLoadListener> set = this.listeners;
        if (set != null && set.size() != 0) {
            for (DownLoadListener downLoadListener : this.listeners) {
                if (downLoadListener != null) {
                    downLoadListener.onDownLoadStart();
                }
            }
        }
    }

    public synchronized void callDownLoadSuccess(Object obj, int i) {
        Set<DownLoadListener> set = this.listeners;
        if (set != null && set.size() != 0) {
            for (DownLoadListener downLoadListener : this.listeners) {
                if (downLoadListener != null) {
                    downLoadListener.onSuccess(obj, i);
                }
            }
        }
    }

    public void cancel() {
        this.mIsCancel = true;
    }

    public boolean downloadNormalFile(cuf cufVar, final long j2) {
        final CommonSaveFileTask commonSaveFileTaskNewInstance = CommonSaveFileTask.newInstance();
        return commonSaveFileTaskNewInstance.save(cufVar.a(), this.fileSavePath, this.isNeedBreakPointDownLoad, j2, new CommonSaveFileTask.ProgressHandler() { // from class: com.heytap.store.base.core.util.download.DownLoadTask.3
            @Override // com.heytap.store.base.core.util.download.CommonSaveFileTask.ProgressHandler
            public void updateProgress(long j3, long j4) {
                DownLoadTask downLoadTask = DownLoadTask.this;
                if (!downLoadTask.mIsCancel) {
                    downLoadTask.callDownLoadProgress(null, j2, j4);
                } else {
                    commonSaveFileTaskNewInstance.cancel();
                    DownLoadTask.this.callDownLoadFail(null, new Exception("cancel the download"));
                }
            }
        });
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public synchronized void removeDownLoadListener(DownLoadListener downLoadListener) {
        this.listeners.remove(downLoadListener);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    @Override // java.lang.Runnable
    public void run() {
        String str;
        long length;
        String str2;
        if (this.fileName == null || (str = this.fileSavePath) == null || str.contains("../")) {
            return;
        }
        callDownLoadStart();
        if (this.limitedLength.get() > 0) {
            this.contentLength.set(getContentLength());
            if (this.contentLength.get() > this.limitedLength.get()) {
                ThreadUtils.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.w06
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.lambda$run$0();
                    }
                });
                return;
            }
        }
        if (this.isNeedBreakPointDownLoad) {
            if (this.contentLength.get() == 0) {
                this.contentLength.set(getContentLength());
            }
            if (this.contentLength.get() == 0) {
                ThreadUtils.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.x06
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.i.lambda$run$1();
                    }
                });
                return;
            }
            File file = new File(this.fileSavePath);
            if (file.exists()) {
                length = file.length();
                if (length == this.contentLength.get()) {
                    ThreadUtils.runOnUiThread(new Runnable() { // from class: com.heytap.store.base.core.util.download.DownLoadTask.1
                        @Override // java.lang.Runnable
                        public void run() {
                            DownLoadTask downLoadTask = DownLoadTask.this;
                            downLoadTask.callDownLoadSuccess(downLoadTask.fileSavePath, -1);
                        }
                    });
                    return;
                }
            } else {
                length = 0;
            }
        } else {
            length = 0;
        }
        if (this.contentLength.get() == 0) {
            str2 = null;
        } else {
            str2 = "bytes=" + length + "-" + this.contentLength.get();
        }
        efd efdVar = new efd();
        Request.Builder builderUrl = new Request.Builder().get().url(this.fileUrl);
        if (str2 != null) {
            builderUrl.header("Range", str2);
        }
        efdVar.a(builderUrl.build()).g(new AnonymousClass2());
    }

    public void setFileName(String str, String str2) {
        this.fileName = str2;
        this.fileSavePath = str + "/" + str2;
    }

    public void setLimitedLength(long j2) {
        this.limitedLength.set(j2);
    }

    public void setNeedNotice(Boolean bool) {
        this.needNotice = bool.booleanValue();
    }

    public DownLoadTask(String str, boolean z, DownLoadListener downLoadListener) {
        this.position = -1;
        this.needNotice = true;
        this.mIsCancel = false;
        this.isNeedBreakPointDownLoad = false;
        this.listeners = new HashSet();
        this.contentLength = new AtomicLong();
        this.limitedLength = new AtomicLong(-1L);
        this.fileUrl = str;
        this.isNeedBreakPointDownLoad = z;
        this.listeners.add(downLoadListener);
    }

    public DownLoadTask(String str, boolean z, Set<DownLoadListener> set) {
        this.position = -1;
        this.needNotice = true;
        this.mIsCancel = false;
        this.isNeedBreakPointDownLoad = false;
        this.listeners = new HashSet();
        this.contentLength = new AtomicLong();
        this.limitedLength = new AtomicLong(-1L);
        this.fileUrl = str;
        this.isNeedBreakPointDownLoad = z;
        this.listeners.addAll(set);
    }
}
