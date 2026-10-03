package com.liulishuo.okdownload.core.interceptor;

import android.support.annotation.NonNull;
import com.liulishuo.okdownload.core.connection.DownloadConnection;
import com.liulishuo.okdownload.core.download.DownloadCache;
import com.liulishuo.okdownload.core.download.DownloadChain;
import com.liulishuo.okdownload.core.exception.InterruptException;
import com.liulishuo.okdownload.core.exception.RetryException;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class RetryInterceptor implements Interceptor.Connect, Interceptor.Fetch {
    @Override // com.liulishuo.okdownload.core.interceptor.Interceptor.Connect
    @NonNull
    public DownloadConnection.Connected interceptConnect(DownloadChain downloadChain) throws IOException {
        DownloadCache cache = downloadChain.getCache();
        while (true) {
            try {
                if (cache.isInterrupt()) {
                    throw InterruptException.SIGNAL;
                }
                return downloadChain.processConnect();
            } catch (IOException e2) {
                if (!(e2 instanceof RetryException)) {
                    downloadChain.getCache().catchException(e2);
                    downloadChain.getOutputStream().catchBlockConnectException(downloadChain.getBlockIndex());
                    throw e2;
                }
                downloadChain.resetConnectForRetry();
            }
        }
    }

    @Override // com.liulishuo.okdownload.core.interceptor.Interceptor.Fetch
    public long interceptFetch(DownloadChain downloadChain) throws IOException {
        try {
            return downloadChain.processFetch();
        } catch (IOException e2) {
            downloadChain.getCache().catchException(e2);
            throw e2;
        }
    }
}
