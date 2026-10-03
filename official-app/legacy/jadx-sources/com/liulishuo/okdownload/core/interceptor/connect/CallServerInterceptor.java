package com.liulishuo.okdownload.core.interceptor.connect;

import android.support.annotation.NonNull;
import com.liulishuo.okdownload.OkDownload;
import com.liulishuo.okdownload.core.connection.DownloadConnection;
import com.liulishuo.okdownload.core.download.DownloadChain;
import com.liulishuo.okdownload.core.interceptor.Interceptor;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class CallServerInterceptor implements Interceptor.Connect {
    @Override // com.liulishuo.okdownload.core.interceptor.Interceptor.Connect
    @NonNull
    public DownloadConnection.Connected interceptConnect(DownloadChain downloadChain) throws IOException {
        OkDownload.with().downloadStrategy().inspectNetworkOnWifi(downloadChain.getTask());
        OkDownload.with().downloadStrategy().inspectNetworkAvailable();
        return downloadChain.getConnectionOrCreate().execute();
    }
}
