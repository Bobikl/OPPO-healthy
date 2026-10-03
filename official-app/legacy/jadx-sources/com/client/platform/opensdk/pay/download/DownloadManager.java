package com.client.platform.opensdk.pay.download;

import android.content.Context;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import com.client.platform.opensdk.pay.Constants;
import com.client.platform.opensdk.pay.IPayTaskResult;
import com.client.platform.opensdk.pay.PayXorUtils;
import com.client.platform.opensdk.pay.download.dialog.DownloadingInfoDialog;
import com.client.platform.opensdk.pay.download.dialog.OnBottomBtnClickListener;
import com.client.platform.opensdk.pay.download.resource.Colors;
import com.client.platform.opensdk.pay.download.resource.LanUtils;
import com.client.platform.opensdk.pay.download.task.DownloadTask;
import com.client.platform.opensdk.pay.download.util.FloatDivUtil;
import com.client.platform.opensdk.pay.download.util.LogUtil;
import com.client.platform.opensdk.pay.download.util.Util;
import com.client.platform.opensdk.pay.download.util.http.MyHttpClient;
import com.oplus.aiunit.vision.usm;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class DownloadManager {
    private static final String GET_URL = PayXorUtils.payEncrypt(Constants.CN_DOWNLOAD_URL, 8);
    private static final String GET_URL_OVERSEAS = PayXorUtils.payEncrypt(Constants.OVER_SEA_DOWNLOAD_URL, 8);
    public static final int STATE_CANCELED = 5;
    public static final int STATE_ERROR = 3;
    public static final int STATE_NORMAL = 1;
    public static final int STATE_PAUSE = 2;
    public static final int STATE_SUCESSED = 4;
    private DownloadCallback callback;
    private Context mContext;
    private String mCountryCode;
    private DownloadTask mDownloadTask;
    private DownloadingInfoDialog mDownloadingInfoDialog;
    private Handler mHandler;
    private long mLastProgress;
    private IPayTaskResult mPayTaskResult;
    private int mState;
    private String mDownloadUrl = "";
    private DownloadTask.UpdateDownloadInfo mUpdateDownloadInfo = new DownloadTask.UpdateDownloadInfo() { // from class: com.client.platform.opensdk.pay.download.DownloadManager.1
        @Override // com.client.platform.opensdk.pay.download.task.DownloadTask.UpdateDownloadInfo
        public void downloadFail() {
            DownloadManager.this.mHandler.post(new Runnable() { // from class: com.client.platform.opensdk.pay.download.DownloadManager.1.3
                @Override // java.lang.Runnable
                public void run() {
                    DownloadManager downloadManager = DownloadManager.this;
                    downloadManager.chageState(3, "CN".equals(downloadManager.mCountryCode) ? LanUtils.CN.HINT_DOWNLOAD_FAIL : LanUtils.US.HINT_DOWNLOAD_FAIL);
                }
            });
        }

        @Override // com.client.platform.opensdk.pay.download.task.DownloadTask.UpdateDownloadInfo
        public void downloadSuccess(String str) {
            if (DownloadManager.this.callback != null) {
                DownloadManager.this.callback.downloadSuccess();
            }
            DownloadManager.this.mHandler.post(new Runnable() { // from class: com.client.platform.opensdk.pay.download.DownloadManager.1.2
                @Override // java.lang.Runnable
                public void run() {
                    DownloadManager.this.mDownloadingInfoDialog.dismiss();
                    StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build());
                    Util.installPayApk(DownloadManager.this.mContext);
                }
            });
        }

        @Override // com.client.platform.opensdk.pay.download.task.DownloadTask.UpdateDownloadInfo
        public void updateDownloadProgress(final long j2, final long j3, final long j4) {
            if (DownloadManager.this.mLastProgress == j4) {
                return;
            }
            DownloadManager.this.mLastProgress = j4;
            DownloadManager.this.mHandler.post(new Runnable() { // from class: com.client.platform.opensdk.pay.download.DownloadManager.1.1
                @Override // java.lang.Runnable
                public void run() {
                    String str = FloatDivUtil.div(j2, 1048576L, 2) + "M";
                    String str2 = FloatDivUtil.div(j3, 1048576L, 2) + "M";
                    DownloadManager.this.mDownloadingInfoDialog.setPercent(str + "/" + str2);
                    DownloadManager.this.mDownloadingInfoDialog.setProgress((int) j4);
                }
            });
        }
    };
    private OnBottomBtnClickListener mBottomBtnClickListener = new OnBottomBtnClickListener() { // from class: com.client.platform.opensdk.pay.download.DownloadManager.2
        @Override // com.client.platform.opensdk.pay.download.dialog.OnBottomBtnClickListener
        public void leftBtnClicked() {
            DownloadManager.this.cancel();
            DownloadManager.this.mDownloadingInfoDialog.dismiss();
            if (DownloadManager.this.mPayTaskResult != null) {
                DownloadManager.this.mPayTaskResult.onTaskResult(10044, "");
            }
        }

        @Override // com.client.platform.opensdk.pay.download.dialog.OnBottomBtnClickListener
        public void rightBtnClicked() {
            if (1 == DownloadManager.this.mState) {
                DownloadManager downloadManager = DownloadManager.this;
                downloadManager.chageState(2, "CN".equals(downloadManager.mCountryCode) ? LanUtils.CN.DOWNLOAD_PAUSED : LanUtils.US.DOWNLOAD_PAUSED);
                return;
            }
            int i = DownloadManager.this.mState;
            String str = LanUtils.CN.DOWNLOADING;
            if (2 == i) {
                DownloadManager downloadManager2 = DownloadManager.this;
                if (!"CN".equals(downloadManager2.mCountryCode)) {
                    str = LanUtils.US.DOWNLOADING;
                }
                downloadManager2.chageState(1, str);
                return;
            }
            if (3 == DownloadManager.this.mState) {
                DownloadManager downloadManager3 = DownloadManager.this;
                if (!"CN".equals(downloadManager3.mCountryCode)) {
                    str = LanUtils.US.DOWNLOADING;
                }
                downloadManager3.chageState(1, str);
            }
        }
    };

    public interface DownloadCallback {
        void downloadSuccess();
    }

    public DownloadManager(Context context, String str, IPayTaskResult iPayTaskResult) {
        this.mPayTaskResult = iPayTaskResult;
        this.mContext = context;
        DownloadingInfoDialog downloadingInfoDialog = new DownloadingInfoDialog(context);
        this.mDownloadingInfoDialog = downloadingInfoDialog;
        downloadingInfoDialog.setBottomBtnClickedListener(this.mBottomBtnClickListener);
        this.mHandler = new Handler();
        this.mLastProgress = -1L;
        this.mCountryCode = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancel() {
        this.mState = 5;
        DownloadTask downloadTask = this.mDownloadTask;
        if (downloadTask != null) {
            downloadTask.stopDownload();
        }
        this.mLastProgress = -1L;
    }

    private void getDownloadUrl() {
        new Thread() { // from class: com.client.platform.opensdk.pay.download.DownloadManager.3
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                String str;
                try {
                    new HashMap().put(usm.f, "application/json");
                    if ("CN".equals(DownloadManager.this.mCountryCode)) {
                        str = DownloadManager.GET_URL;
                    } else {
                        str = DownloadManager.GET_URL_OVERSEAS + DownloadManager.this.mCountryCode;
                    }
                    HttpURLConnection urlConnecttion = MyHttpClient.getUrlConnecttion(DownloadManager.this.mContext, str);
                    urlConnecttion.setConnectTimeout(30000);
                    urlConnecttion.setReadTimeout(30000);
                    urlConnecttion.setDoInput(true);
                    urlConnecttion.setDoOutput(true);
                    urlConnecttion.setRequestMethod("POST");
                    urlConnecttion.setRequestProperty(usm.f, "application/json; charset=UTF-8");
                    OutputStream outputStream = urlConnecttion.getOutputStream();
                    outputStream.write("hail{\"createtime\":\"\",\"ext1\":\"\",\"ext2\":\"\",\"sign\":\"\",\"status\":\"0\",\"type\":\"0\",\"url\":\"\"}ng".getBytes());
                    outputStream.flush();
                    outputStream.close();
                    if (200 == urlConnecttion.getResponseCode()) {
                        InputStream inputStream = urlConnecttion.getInputStream();
                        byte[] bArr = new byte[1012];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i = inputStream.read(bArr);
                            if (i == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr, 0, i);
                            }
                        }
                        final String str2 = new String(byteArrayOutputStream.toByteArray());
                        LogUtil.d("mDownloadUrl is " + str2);
                        if (5 != DownloadManager.this.mState && 2 != DownloadManager.this.mState) {
                            DownloadManager.this.mHandler.post(new Runnable() { // from class: com.client.platform.opensdk.pay.download.DownloadManager.3.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (TextUtils.isEmpty(str2)) {
                                        DownloadManager downloadManager = DownloadManager.this;
                                        downloadManager.chageState(3, "CN".equals(downloadManager.mCountryCode) ? LanUtils.CN.HINT_DOWNLOAD_FAIL : LanUtils.US.HINT_DOWNLOAD_FAIL);
                                    } else {
                                        DownloadManager.this.mDownloadUrl = str2;
                                        DownloadManager.this.chageState(1, "");
                                    }
                                }
                            });
                        }
                        inputStream.close();
                    } else {
                        DownloadManager.this.mHandler.post(new Runnable() { // from class: com.client.platform.opensdk.pay.download.DownloadManager.3.2
                            @Override // java.lang.Runnable
                            public void run() {
                                DownloadManager downloadManager = DownloadManager.this;
                                downloadManager.chageState(3, "CN".equals(downloadManager.mCountryCode) ? LanUtils.CN.HINT_DOWNLOAD_FAIL : LanUtils.US.HINT_DOWNLOAD_FAIL);
                            }
                        });
                    }
                    urlConnecttion.disconnect();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    DownloadManager.this.mHandler.post(new Runnable() { // from class: com.client.platform.opensdk.pay.download.DownloadManager.3.3
                        @Override // java.lang.Runnable
                        public void run() {
                            DownloadManager downloadManager = DownloadManager.this;
                            downloadManager.chageState(3, "CN".equals(downloadManager.mCountryCode) ? LanUtils.CN.HINT_DOWNLOAD_FAIL : LanUtils.US.HINT_DOWNLOAD_FAIL);
                        }
                    });
                }
            }
        }.start();
    }

    private void pause() {
        DownloadTask downloadTask = this.mDownloadTask;
        if (downloadTask != null) {
            downloadTask.pause();
        }
    }

    private void startDownlad() {
        DownloadTask downloadTask = new DownloadTask(this.mContext, this.mUpdateDownloadInfo, this.mDownloadUrl);
        this.mDownloadTask = downloadTask;
        downloadTask.execute(new Void[0]);
    }

    public void chageState(int i, String str) {
        this.mState = i;
        String str2 = LanUtils.CN.CANCEL;
        if (i == 1) {
            DownloadingInfoDialog downloadingInfoDialog = this.mDownloadingInfoDialog;
            if (!"CN".equals(this.mCountryCode)) {
                str2 = "CANCEL";
            }
            downloadingInfoDialog.setLeftBtnText(str2);
            this.mDownloadingInfoDialog.setRightBtnText("CN".equals(this.mCountryCode) ? LanUtils.CN.PAUSE : LanUtils.US.PAUSE);
            this.mDownloadingInfoDialog.setState("CN".equals(this.mCountryCode) ? LanUtils.CN.DOWNLOADING : LanUtils.US.DOWNLOADING);
            this.mDownloadingInfoDialog.setStateTextColor(Colors.new_main_color);
            if (TextUtils.isEmpty(this.mDownloadUrl)) {
                getDownloadUrl();
                return;
            } else {
                startDownlad();
                return;
            }
        }
        String str3 = LanUtils.CN.RESUME_DOWNLOAD;
        if (i == 2) {
            DownloadingInfoDialog downloadingInfoDialog2 = this.mDownloadingInfoDialog;
            if (!"CN".equals(this.mCountryCode)) {
                str2 = "CANCEL";
            }
            downloadingInfoDialog2.setLeftBtnText(str2);
            DownloadingInfoDialog downloadingInfoDialog3 = this.mDownloadingInfoDialog;
            if (!"CN".equals(this.mCountryCode)) {
                str3 = LanUtils.US.RESUME_DOWNLOAD;
            }
            downloadingInfoDialog3.setRightBtnText(str3);
            this.mDownloadingInfoDialog.setState("CN".equals(this.mCountryCode) ? LanUtils.CN.DOWNLOAD_PAUSED : LanUtils.US.DOWNLOAD_PAUSED);
            this.mDownloadingInfoDialog.setStateTextColor(Colors.new_main_color);
            pause();
            return;
        }
        if (i != 3) {
            return;
        }
        DownloadingInfoDialog downloadingInfoDialog4 = this.mDownloadingInfoDialog;
        if (!"CN".equals(this.mCountryCode)) {
            str2 = "CANCEL";
        }
        downloadingInfoDialog4.setLeftBtnText(str2);
        DownloadingInfoDialog downloadingInfoDialog5 = this.mDownloadingInfoDialog;
        if (!"CN".equals(this.mCountryCode)) {
            str3 = LanUtils.US.RESUME_DOWNLOAD;
        }
        downloadingInfoDialog5.setRightBtnText(str3);
        this.mDownloadingInfoDialog.setState("CN".equals(this.mCountryCode) ? LanUtils.CN.HINT_DOWNLOAD_FAIL : LanUtils.US.HINT_DOWNLOAD_FAIL);
        this.mDownloadingInfoDialog.setStateTextColor(Colors.error);
        pause();
    }

    public void setDownloadCallback(DownloadCallback downloadCallback) {
        this.callback = downloadCallback;
    }

    public void start() {
        chageState(1, "");
        this.mDownloadingInfoDialog.show();
    }
}
