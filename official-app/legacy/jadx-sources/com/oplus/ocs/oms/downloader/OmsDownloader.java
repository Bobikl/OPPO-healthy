package com.oplus.ocs.oms.downloader;

import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.hpm;
import com.oplus.aiunit.vision.pbm;
import com.oplus.aiunit.vision.thm;
import com.oplus.oms.split.full.splitdownload.DownloadCallback;
import com.oplus.oms.split.full.splitdownload.DownloadRequest;
import com.oplus.oms.split.full.splitdownload.Downloader;
import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class OmsDownloader implements Downloader {
    public final thm a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f19986c;

    public OmsDownloader() {
        this(10485760L, false);
    }

    public static long calculateNeedDownloadSize(@NonNull List<DownloadRequest> list, long j2) {
        long size = 0;
        long length = 0;
        for (DownloadRequest downloadRequest : list) {
            size += downloadRequest.getSize();
            File file = new File(downloadRequest.getSavePath(), downloadRequest.getSaveFileName());
            if (file.exists() && !file.isDirectory() && file.length() > 0) {
                length += file.length();
            }
        }
        if (j2 == -1) {
            j2 = size;
        }
        return Math.max(j2 - length, 0L);
    }

    @Override // com.oplus.oms.split.full.splitdownload.Downloader
    public long calculateDownloadSize(@NonNull List<DownloadRequest> list, long j2) {
        return calculateNeedDownloadSize(list, j2);
    }

    @Override // com.oplus.oms.split.full.splitdownload.Downloader
    public boolean cancelDownloadSync(int i) {
        this.a.a(i);
        return true;
    }

    @Override // com.oplus.oms.split.full.splitdownload.Downloader
    public void deferredDownload(int i, List<DownloadRequest> list, DownloadCallback downloadCallback, boolean z) {
    }

    @Override // com.oplus.oms.split.full.splitdownload.Downloader
    public boolean forceUserConfirm() {
        return this.f19986c;
    }

    @Override // com.oplus.oms.split.full.splitdownload.Downloader
    public long getDownloadSizeThresholdWhenUsingMobileData() {
        long j2 = this.b;
        if (j2 == 0) {
            return 10485760L;
        }
        return j2;
    }

    @Override // com.oplus.oms.split.full.splitdownload.Downloader
    public boolean isDeferredDownloadOnlyWhenUsingWifiData() {
        return true;
    }

    @Override // com.oplus.oms.split.full.splitdownload.Downloader
    public void startDownload(int i, List<DownloadRequest> list, DownloadCallback downloadCallback) {
        if (list == null || downloadCallback == null) {
            hpm.e("OmsDownloader", "requests is null or callback is null", new Object[0]);
        } else {
            this.a.b(new pbm(i, list, false, downloadCallback, false), calculateDownloadSize(list, -1L));
        }
    }

    public OmsDownloader(long j2, boolean z) {
        this.a = new thm();
        this.b = 10485760L;
        if (j2 >= 0) {
            this.b = j2;
        }
        hpm.d("OmsDownloader", "usingMobileDataThreshold is " + j2 + " mUsingMobileDataThreshold is " + this.b, new Object[0]);
        this.f19986c = z;
    }
}
