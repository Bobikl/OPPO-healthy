package com.oplus.oms.split.full.splitdownload;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface ISplitUpdateManager {
    long getLastUpdateTime();

    SplitUpdateInfo getSplitUpdateInfo(String str);

    boolean queryVersionFromCloud(Context context, List<DownloadRequest> list, boolean z);
}
