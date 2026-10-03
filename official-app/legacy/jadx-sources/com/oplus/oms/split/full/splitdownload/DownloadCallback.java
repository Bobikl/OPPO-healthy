package com.oplus.oms.split.full.splitdownload;

/* JADX INFO: loaded from: classes8.dex */
public interface DownloadCallback {
    void onCanceled();

    void onCanceling();

    void onCompleted();

    void onError(int i);

    void onProgress(long j2);

    void onStart();
}
