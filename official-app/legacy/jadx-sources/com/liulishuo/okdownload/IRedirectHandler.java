package com.liulishuo.okdownload;

import android.support.annotation.Nullable;
import com.liulishuo.okdownload.core.connection.DownloadConnection;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public interface IRedirectHandler {
    @Nullable
    String getRedirectLocation();

    void handleRedirect(DownloadConnection downloadConnection, DownloadConnection.Connected connected, Map<String, List<String>> map) throws IOException;
}
