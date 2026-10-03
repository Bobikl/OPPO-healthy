package com.lifesense.weidong.lzsimplenetlibs.file;

import com.lifesense.weidong.lzsimplenetlibs.net.callback.IRequestCallBack;

/* JADX INFO: loaded from: classes5.dex */
public interface IDownloadRequestCallback extends IRequestCallBack<DownloadResponse> {
    void onDownloading(int i);
}
