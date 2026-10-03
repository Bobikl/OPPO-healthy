package com.oplus.oms.split.full.splitdownload;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface Downloader {
    long calculateDownloadSize(List<DownloadRequest> list, long j2);

    boolean cancelDownloadSync(int i);

    void deferredDownload(int i, List<DownloadRequest> list, DownloadCallback downloadCallback, boolean z);

    boolean forceUserConfirm();

    long getDownloadSizeThresholdWhenUsingMobileData();

    boolean isDeferredDownloadOnlyWhenUsingWifiData();

    void startDownload(int i, List<DownloadRequest> list, DownloadCallback downloadCallback);
}
