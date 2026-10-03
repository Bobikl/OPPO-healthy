package com.oplus.ocs.oms.downloader;

import androidx.annotation.Keep;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public interface IBackgroundDownloadListener {
    void setDownloadStatus(HashMap<String, Integer> map);
}
