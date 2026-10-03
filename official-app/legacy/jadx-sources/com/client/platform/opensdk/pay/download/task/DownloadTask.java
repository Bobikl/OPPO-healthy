package com.client.platform.opensdk.pay.download.task;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.client.platform.opensdk.pay.download.util.PrefUtil;
import com.client.platform.opensdk.pay.download.util.Util;
import com.client.platform.opensdk.pay.download.util.http.MyHttpClient;
import com.platform.usercenter.network.header.HeaderConstant;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes13.dex */
public class DownloadTask extends AsyncTask<Void, Long, Boolean> {
    private static final int BACK_SIZE = 1024;
    public static final int COMPLETE = 2;
    public static final int DOWNLOADING = 0;
    public static final int DOWNLOAD_PAUSE = 1;
    public static final int DOWNLOAD_RECOVER = 3;
    public static final int MSG_WHAT_UPDATE_PROGRESS = 111222333;
    public static final int NOTIFY_UPGRADE = 10011;
    private static final String TAG = "DownloadTask";
    private boolean isFirstDowload;
    private Context mContext;
    public int mDownladStatus;
    String mDownloadUrl;
    private UpdateDownloadInfo mListener;
    long progress;
    int retryTime = 0;
    private long fileSize = 0;
    private long downSize = 0;
    public boolean doingRequest = false;
    boolean bStop = false;

    public interface UpdateDownloadInfo {
        void downloadFail();

        void downloadSuccess(String str);

        void updateDownloadProgress(long j2, long j3, long j4);
    }

    public DownloadTask(Context context, UpdateDownloadInfo updateDownloadInfo, String str) {
        this.progress = 0L;
        this.isFirstDowload = true;
        this.mContext = context;
        this.mListener = updateDownloadInfo;
        this.mDownloadUrl = str;
        this.isFirstDowload = true;
        String downloadProgress = PrefUtil.getDownloadProgress(this.mContext);
        if (TextUtils.isEmpty(downloadProgress)) {
            return;
        }
        this.progress = Long.parseLong(downloadProgress);
    }

    private void setDownLoadData() {
        PrefUtil.setDownloadProgress(this.mContext, "" + this.progress);
        PrefUtil.setDownloadStatus(this.mContext, "" + this.mDownladStatus);
    }

    public void doDownFail() {
        if (this.downSize < this.fileSize) {
            this.mDownladStatus = 1;
            setDownLoadData();
            this.doingRequest = false;
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        stopDownload();
        super.onCancelled();
    }

    public void pause() {
        this.bStop = true;
    }

    public void stopDownload() {
        this.bStop = true;
        File file = new File(Util.getDownloadPath(this.mContext));
        if (file.exists()) {
            file.delete();
        }
        PrefUtil.removeDownloadFileSize(this.mContext);
        PrefUtil.removeDownloadProgress(this.mContext);
        PrefUtil.removeDownloadStatus(this.mContext);
    }

    /* JADX WARN: Code duplicated, block: B:202:0x03ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:215:0x03f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:216:0x03f3 A[Catch: Exception -> 0x0459, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0459, blocks: (B:203:0x03bc, B:204:0x03c0, B:216:0x03f3, B:228:0x0423, B:240:0x0453), top: B:285:0x03bc }] */
    /* JADX WARN: Code duplicated, block: B:227:0x0421 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x0423 A[Catch: Exception -> 0x0459, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0459, blocks: (B:203:0x03bc, B:204:0x03c0, B:216:0x03f3, B:228:0x0423, B:240:0x0453), top: B:285:0x03bc }] */
    /* JADX WARN: Code duplicated, block: B:239:0x0451 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:240:0x0453 A[Catch: Exception -> 0x0459, TRY_ENTER, TRY_LEAVE, TryCatch #17 {Exception -> 0x0459, blocks: (B:203:0x03bc, B:204:0x03c0, B:216:0x03f3, B:228:0x0423, B:240:0x0453), top: B:285:0x03bc }] */
    /* JADX WARN: Code duplicated, block: B:262:0x03e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0467 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x0416 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x03bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x0446 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x03af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:322:0x03dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:323:0x040c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:324:0x043c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:0x0459 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x0459 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:0x0459 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x0459 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.RandomAccessFile] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [int] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // android.os.AsyncTask
    public Boolean doInBackground(Void... voidArr) throws Throwable {
        ?? r15;
        int i;
        InputStream inputStream;
        int i2;
        int i3;
        int i4;
        ?? randomAccessFile;
        Throwable th;
        String str;
        ?? r6;
        int i5 = 1;
        this.doingRequest = true;
        ?? file = new File(Util.getDownloadPath(this.mContext));
        ?? r4 = 2;
        ?? r5 = 0;
        ?? r7 = 0;
        if (!file.exists() || file.length() <= 0) {
            try {
                file.createNewFile();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            PrefUtil.removeDownloadFileSize(this.mContext);
            PrefUtil.removeDownloadProgress(this.mContext);
            PrefUtil.removeDownloadStatus(this.mContext);
        } else {
            int i6 = Integer.parseInt(PrefUtil.getDownloadStatus(this.mContext));
            if (i6 == 0) {
                this.downSize = Long.parseLong(PrefUtil.getDownloadSize(this.mContext));
            }
            if (i6 == 2) {
                this.mDownladStatus = 2;
                this.downSize = Long.parseLong(PrefUtil.getDownloadSize(this.mContext));
                this.fileSize = Long.parseLong(PrefUtil.getDownloadFileSize(this.mContext));
                long length = file.length();
                long j2 = this.downSize;
                long j3 = this.fileSize;
                if (j2 == j3 && length == j2 && j3 > 0) {
                    this.doingRequest = false;
                    return Boolean.TRUE;
                }
            }
            if (i6 == 1) {
                this.mDownladStatus = 1;
                this.downSize = Long.parseLong(PrefUtil.getDownloadSize(this.mContext));
            }
        }
        this.mListener.updateDownloadProgress(this.downSize, this.fileSize, this.progress);
        long j4 = this.downSize;
        this.downSize = j4 - 1024 > 0 ? j4 - 1024 : 0L;
        String str2 = "bytes=" + this.downSize + "-";
        HttpURLConnection urlConnecttion = null;
        try {
            if (TextUtils.isEmpty(null)) {
                urlConnecttion = MyHttpClient.getUrlConnecttion(this.mContext, this.mDownloadUrl);
                urlConnecttion.setConnectTimeout(30000);
                urlConnecttion.setReadTimeout(30000);
                urlConnecttion.setRequestMethod("GET");
                urlConnecttion.setRequestProperty("RANGE", str2);
                urlConnecttion.setDoInput(true);
                this.doingRequest = false;
            }
            if (urlConnecttion.getResponseCode() == 302) {
                String headerField = urlConnecttion.getHeaderField(HeaderConstant.HEAD_K_302_LOCATION);
                StringBuilder sb = new StringBuilder();
                r15 = "location=";
                sb.append("location=");
                sb.append(headerField);
                Log.e(TAG, sb.toString());
                urlConnecttion = MyHttpClient.getUrlConnecttion(this.mContext, headerField);
                urlConnecttion.setConnectTimeout(30000);
                urlConnecttion.setReadTimeout(30000);
                urlConnecttion.setRequestMethod("GET");
                urlConnecttion.setRequestProperty("RANGE", str2);
                urlConnecttion.setDoInput(true);
            }
            while (true) {
                if (this.bStop) {
                    doDownFail();
                    return Boolean.FALSE;
                }
                try {
                    try {
                        try {
                            randomAccessFile = new RandomAccessFile((File) file, "rw");
                            try {
                                int i7 = this.mDownladStatus;
                                byte b = -1;
                                String str3 = "";
                                try {
                                    if ((i7 == i5 || i7 == r4 || i7 == 0) && this.downSize > (r7 == true ? 1L : 0L)) {
                                        urlConnecttion.connect();
                                        this.fileSize = Long.parseLong(PrefUtil.getDownloadFileSize(this.mContext));
                                    } else {
                                        urlConnecttion.connect();
                                        if (urlConnecttion.getContentLength() > 0) {
                                            this.fileSize = urlConnecttion.getContentLength();
                                            PrefUtil.setDownloadFileSize(this.mContext, "" + this.fileSize);
                                        }
                                        if (urlConnecttion.getContentLength() == -1) {
                                            Boolean bool = Boolean.FALSE;
                                            randomAccessFile.close();
                                            try {
                                                urlConnecttion.getInputStream().close();
                                                urlConnecttion.disconnect();
                                            } catch (Exception unused) {
                                            }
                                            return bool;
                                        }
                                    }
                                    long j5 = this.fileSize;
                                    r15 = file;
                                    try {
                                        long j6 = this.downSize;
                                        if (j5 != j6 || j5 <= (r7 == true ? 1L : 0L)) {
                                            randomAccessFile.seek(j6);
                                            InputStream inputStream2 = urlConnecttion.getInputStream();
                                            byte[] bArr = new byte[16384];
                                            if (this.bStop) {
                                                r7 = r5;
                                                urlConnecttion = urlConnecttion;
                                                str = "";
                                            } else {
                                                try {
                                                    this.mDownladStatus = r5;
                                                    PrefUtil.setDownloadStatus(this.mContext, "" + this.mDownladStatus);
                                                    ?? r3 = r5;
                                                    long j7 = r7 == true ? 1 : 0;
                                                    r5 = r5;
                                                    while (this.mContext != null && !this.bStop && r3 != b) {
                                                        int i8 = inputStream2.read(bArr);
                                                        if (i8 == b || this.bStop) {
                                                            r6 = r5;
                                                        } else {
                                                            randomAccessFile.write(bArr, r5, i8);
                                                            long j8 = this.downSize + ((long) i8);
                                                            try {
                                                                this.downSize = j8;
                                                                if (j8 - j7 > 61440) {
                                                                    PrefUtil.setDownloadSize(this.mContext, str3 + this.downSize);
                                                                    j7 = this.downSize;
                                                                    this.progress = (100 * j7) / this.fileSize;
                                                                    PrefUtil.setDownloadProgress(this.mContext, str3 + this.progress);
                                                                    try {
                                                                        this.mListener.updateDownloadProgress(this.downSize, this.fileSize, this.progress);
                                                                        Long[] lArr = new Long[1];
                                                                        r6 = 0;
                                                                        try {
                                                                            lArr[0] = Long.valueOf(this.downSize);
                                                                            publishProgress(lArr);
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            th = th;
                                                                            randomAccessFile.close();
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        th = th;
                                                                        randomAccessFile.close();
                                                                        throw th;
                                                                    }
                                                                } else {
                                                                    r6 = 0;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                            }
                                                        }
                                                        r5 = r6;
                                                        str3 = str3;
                                                        urlConnecttion = urlConnecttion;
                                                        b = -1;
                                                        r3 = i8;
                                                    }
                                                    r7 = r5;
                                                    urlConnecttion = urlConnecttion;
                                                    str = str3;
                                                    this.mDownladStatus = 1;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                }
                                            }
                                            try {
                                                setDownLoadData();
                                                i5 = 1;
                                                if (this.mDownladStatus != 1) {
                                                    break;
                                                }
                                                try {
                                                    if (!this.bStop) {
                                                        break;
                                                    }
                                                    Boolean bool2 = Boolean.TRUE;
                                                    try {
                                                        randomAccessFile.close();
                                                        try {
                                                            urlConnecttion.getInputStream().close();
                                                            urlConnecttion.disconnect();
                                                        } catch (Exception unused2) {
                                                        }
                                                        return bool2;
                                                    } catch (SocketException e3) {
                                                        e = e3;
                                                        file = 0;
                                                        r5 = 2;
                                                        i4 = this.retryTime;
                                                        this.retryTime = i4 + 1;
                                                        if (i4 > 30) {
                                                            e.printStackTrace();
                                                            doDownFail();
                                                            Boolean bool3 = Boolean.FALSE;
                                                            if (urlConnecttion != null) {
                                                                try {
                                                                    urlConnecttion.getInputStream().close();
                                                                    urlConnecttion.disconnect();
                                                                } catch (Exception unused3) {
                                                                }
                                                            }
                                                            return bool3;
                                                        }
                                                        if (urlConnecttion != null) {
                                                            inputStream = urlConnecttion.getInputStream();
                                                            file = file;
                                                            r5 = r5;
                                                            r7 = r7;
                                                            r15 = r15;
                                                            inputStream.close();
                                                            urlConnecttion.disconnect();
                                                        }
                                                        urlConnecttion = urlConnecttion;
                                                        ?? r25 = file;
                                                        r4 = r5;
                                                        r5 = r7;
                                                        file = r15;
                                                        r7 = r25;
                                                    } catch (SocketTimeoutException e4) {
                                                        e = e4;
                                                        file = 0;
                                                        r5 = 2;
                                                        i3 = this.retryTime;
                                                        this.retryTime = i3 + 1;
                                                        if (i3 > 30) {
                                                            e.printStackTrace();
                                                            doDownFail();
                                                            Boolean bool4 = Boolean.FALSE;
                                                            if (urlConnecttion != null) {
                                                                try {
                                                                    urlConnecttion.getInputStream().close();
                                                                    urlConnecttion.disconnect();
                                                                } catch (Exception unused4) {
                                                                }
                                                            }
                                                            return bool4;
                                                        }
                                                        if (urlConnecttion != null) {
                                                            inputStream = urlConnecttion.getInputStream();
                                                            file = file;
                                                            r5 = r5;
                                                            r7 = r7;
                                                            r15 = r15;
                                                            inputStream.close();
                                                            urlConnecttion.disconnect();
                                                        }
                                                        urlConnecttion = urlConnecttion;
                                                        ?? r26 = file;
                                                        r4 = r5;
                                                        r5 = r7;
                                                        file = r15;
                                                        r7 = r26;
                                                    } catch (UnknownHostException e5) {
                                                        e = e5;
                                                        file = 0;
                                                        r5 = 2;
                                                        i2 = this.retryTime;
                                                        this.retryTime = i2 + 1;
                                                        if (i2 > 30) {
                                                            e.printStackTrace();
                                                            doDownFail();
                                                            Boolean bool5 = Boolean.FALSE;
                                                            if (urlConnecttion != null) {
                                                                try {
                                                                    urlConnecttion.getInputStream().close();
                                                                    urlConnecttion.disconnect();
                                                                } catch (Exception unused5) {
                                                                }
                                                            }
                                                            return bool5;
                                                        }
                                                        if (urlConnecttion != null) {
                                                            inputStream = urlConnecttion.getInputStream();
                                                            file = file;
                                                            r5 = r5;
                                                            r7 = r7;
                                                            r15 = r15;
                                                            inputStream.close();
                                                            urlConnecttion.disconnect();
                                                        }
                                                        urlConnecttion = urlConnecttion;
                                                        ?? r27 = file;
                                                        r4 = r5;
                                                        r5 = r7;
                                                        file = r15;
                                                        r7 = r27;
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                        file = 0;
                                                        r5 = 2;
                                                        try {
                                                            i = this.retryTime;
                                                            this.retryTime = i + 1;
                                                            if (i > 30) {
                                                                e.printStackTrace();
                                                                doDownFail();
                                                                Boolean bool6 = Boolean.FALSE;
                                                                if (urlConnecttion != null) {
                                                                    try {
                                                                        urlConnecttion.getInputStream().close();
                                                                        urlConnecttion.disconnect();
                                                                    } catch (Exception unused6) {
                                                                    }
                                                                }
                                                                return bool6;
                                                            }
                                                            if (urlConnecttion != null) {
                                                                try {
                                                                    inputStream = urlConnecttion.getInputStream();
                                                                    file = file;
                                                                    r5 = r5;
                                                                    r7 = r7;
                                                                    r15 = r15;
                                                                    inputStream.close();
                                                                    urlConnecttion.disconnect();
                                                                } catch (Exception unused7) {
                                                                }
                                                            }
                                                            urlConnecttion = urlConnecttion;
                                                            ?? r28 = file;
                                                            r4 = r5;
                                                            r5 = r7;
                                                            file = r15;
                                                            r7 = r28;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            if (urlConnecttion != null) {
                                                                try {
                                                                    urlConnecttion.getInputStream().close();
                                                                    urlConnecttion.disconnect();
                                                                } catch (Exception unused8) {
                                                                }
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                    randomAccessFile.close();
                                                    throw th;
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                            }
                                        } else {
                                            try {
                                                this.mDownladStatus = r4;
                                                Boolean bool7 = Boolean.TRUE;
                                                try {
                                                    randomAccessFile.close();
                                                    if (urlConnecttion != null) {
                                                        try {
                                                            urlConnecttion.getInputStream().close();
                                                            urlConnecttion.disconnect();
                                                        } catch (Exception unused9) {
                                                        }
                                                    }
                                                    return bool7;
                                                } catch (SocketException e7) {
                                                    e = e7;
                                                    i5 = 1;
                                                    r15 = r15;
                                                    ?? r29 = r5;
                                                    r5 = r4;
                                                    file = r7 == true ? 1 : 0;
                                                    r7 = r29 == true ? 1 : 0;
                                                    i4 = this.retryTime;
                                                    this.retryTime = i4 + 1;
                                                    if (i4 > 30) {
                                                        e.printStackTrace();
                                                        doDownFail();
                                                        Boolean bool8 = Boolean.FALSE;
                                                        if (urlConnecttion != null) {
                                                            urlConnecttion.getInputStream().close();
                                                            urlConnecttion.disconnect();
                                                        }
                                                        return bool8;
                                                    }
                                                    if (urlConnecttion != null) {
                                                        inputStream = urlConnecttion.getInputStream();
                                                        file = file;
                                                        r5 = r5;
                                                        r7 = r7;
                                                        r15 = r15;
                                                        inputStream.close();
                                                        urlConnecttion.disconnect();
                                                    }
                                                    urlConnecttion = urlConnecttion;
                                                    ?? r210 = file;
                                                    r4 = r5;
                                                    r5 = r7;
                                                    file = r15;
                                                    r7 = r210;
                                                } catch (SocketTimeoutException e8) {
                                                    e = e8;
                                                    i5 = 1;
                                                    r15 = r15;
                                                    ?? r211 = r5;
                                                    r5 = r4;
                                                    file = r7 == true ? 1 : 0;
                                                    r7 = r211 == true ? 1 : 0;
                                                    i3 = this.retryTime;
                                                    this.retryTime = i3 + 1;
                                                    if (i3 > 30) {
                                                        e.printStackTrace();
                                                        doDownFail();
                                                        Boolean bool9 = Boolean.FALSE;
                                                        if (urlConnecttion != null) {
                                                            urlConnecttion.getInputStream().close();
                                                            urlConnecttion.disconnect();
                                                        }
                                                        return bool9;
                                                    }
                                                    if (urlConnecttion != null) {
                                                        inputStream = urlConnecttion.getInputStream();
                                                        file = file;
                                                        r5 = r5;
                                                        r7 = r7;
                                                        r15 = r15;
                                                        inputStream.close();
                                                        urlConnecttion.disconnect();
                                                    }
                                                    urlConnecttion = urlConnecttion;
                                                    ?? r212 = file;
                                                    r4 = r5;
                                                    r5 = r7;
                                                    file = r15;
                                                    r7 = r212;
                                                } catch (UnknownHostException e9) {
                                                    e = e9;
                                                    i5 = 1;
                                                    r15 = r15;
                                                    ?? r213 = r5;
                                                    r5 = r4;
                                                    file = r7 == true ? 1 : 0;
                                                    r7 = r213 == true ? 1 : 0;
                                                    i2 = this.retryTime;
                                                    this.retryTime = i2 + 1;
                                                    if (i2 > 30) {
                                                        e.printStackTrace();
                                                        doDownFail();
                                                        Boolean bool10 = Boolean.FALSE;
                                                        if (urlConnecttion != null) {
                                                            urlConnecttion.getInputStream().close();
                                                            urlConnecttion.disconnect();
                                                        }
                                                        return bool10;
                                                    }
                                                    if (urlConnecttion != null) {
                                                        inputStream = urlConnecttion.getInputStream();
                                                        file = file;
                                                        r5 = r5;
                                                        r7 = r7;
                                                        r15 = r15;
                                                        inputStream.close();
                                                        urlConnecttion.disconnect();
                                                    }
                                                    urlConnecttion = urlConnecttion;
                                                    ?? r214 = file;
                                                    r4 = r5;
                                                    r5 = r7;
                                                    file = r15;
                                                    r7 = r214;
                                                } catch (Exception e10) {
                                                    e = e10;
                                                    i5 = 1;
                                                    r15 = r15;
                                                    ?? r215 = r5;
                                                    r5 = r4;
                                                    file = r7 == true ? 1 : 0;
                                                    r7 = r215 == true ? 1 : 0;
                                                    i = this.retryTime;
                                                    this.retryTime = i + 1;
                                                    if (i > 30) {
                                                        e.printStackTrace();
                                                        doDownFail();
                                                        Boolean bool11 = Boolean.FALSE;
                                                        if (urlConnecttion != null) {
                                                            urlConnecttion.getInputStream().close();
                                                            urlConnecttion.disconnect();
                                                        }
                                                        return bool11;
                                                    }
                                                    if (urlConnecttion != null) {
                                                        inputStream = urlConnecttion.getInputStream();
                                                        file = file;
                                                        r5 = r5;
                                                        r7 = r7;
                                                        r15 = r15;
                                                        inputStream.close();
                                                        urlConnecttion.disconnect();
                                                    }
                                                    urlConnecttion = urlConnecttion;
                                                    ?? r216 = file;
                                                    r4 = r5;
                                                    r5 = r7;
                                                    file = r15;
                                                    r7 = r216;
                                                }
                                            } catch (Throwable th9) {
                                                th = th9;
                                                long j9 = r7 == true ? 1 : 0;
                                                th = th;
                                                randomAccessFile.close();
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        long j10 = r7 == true ? 1 : 0;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                            }
                            th = th;
                            try {
                                randomAccessFile.close();
                                throw th;
                            } catch (Throwable th13) {
                                th.addSuppressed(th13);
                                throw th;
                            }
                        } catch (Throwable th14) {
                            th = th14;
                            urlConnecttion = urlConnecttion;
                            if (urlConnecttion != null) {
                                urlConnecttion.getInputStream().close();
                                urlConnecttion.disconnect();
                            }
                            throw th;
                        }
                    } catch (SocketException e11) {
                        e = e11;
                        r15 = file;
                    } catch (SocketTimeoutException e12) {
                        e = e12;
                        r15 = file;
                    } catch (UnknownHostException e13) {
                        e = e13;
                        r15 = file;
                    } catch (Exception e14) {
                        e = e14;
                        r15 = file;
                    }
                } catch (SocketException e15) {
                    e = e15;
                } catch (SocketTimeoutException e16) {
                    e = e16;
                } catch (UnknownHostException e17) {
                    e = e17;
                } catch (Exception e18) {
                    e = e18;
                }
                urlConnecttion = urlConnecttion;
                ?? r217 = file;
                r4 = r5;
                r5 = r7;
                file = r15;
                r7 = r217;
            }
        } catch (IOException e19) {
            e19.printStackTrace();
        }
        try {
            long j11 = this.downSize;
            long j12 = this.fileSize;
            try {
                if (j11 != j12 || j12 <= 0) {
                    Boolean bool12 = Boolean.FALSE;
                    randomAccessFile.close();
                    try {
                        urlConnecttion.getInputStream().close();
                        urlConnecttion.disconnect();
                    } catch (Exception unused10) {
                    }
                    return bool12;
                }
                try {
                    Context context = this.mContext;
                    StringBuilder sb2 = new StringBuilder();
                    String str4 = str;
                    sb2.append(str4);
                    sb2.append(this.downSize);
                    PrefUtil.setDownloadSize(context, sb2.toString());
                    this.mDownladStatus = 2;
                    PrefUtil.setDownloadStatus(this.mContext, str4 + this.mDownladStatus);
                    Boolean bool13 = Boolean.TRUE;
                    randomAccessFile.close();
                    try {
                        urlConnecttion.getInputStream().close();
                        urlConnecttion.disconnect();
                    } catch (Exception unused11) {
                    }
                    return bool13;
                } catch (Throwable th15) {
                    th = th15;
                    th = th;
                    randomAccessFile.close();
                    throw th;
                }
            } catch (Throwable th16) {
                th = th16;
            }
        } catch (Throwable th17) {
            th = th17;
            th = th;
            randomAccessFile.close();
            throw th;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Boolean bool) {
        if (!bool.booleanValue()) {
            try {
                this.mListener.downloadFail();
            } catch (Exception unused) {
            }
        } else if (this.mDownladStatus == 2) {
            PrefUtil.removeDownloadFileSize(this.mContext);
            PrefUtil.removeDownloadProgress(this.mContext);
            PrefUtil.removeDownloadStatus(this.mContext);
            this.mListener.downloadSuccess(Util.getDownloadPath(this.mContext));
        }
        super.onPostExecute(bool);
    }

    @Override // android.os.AsyncTask
    public void onProgressUpdate(Long... lArr) {
        super.onProgressUpdate((Object[]) lArr);
    }
}
