package com.oplus.utrace.sdk;

import com.oplus.utrace.utils.ILogger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/oplus/utrace/sdk/IULogger;", "Lcom/oplus/utrace/utils/ILogger;", "available", "", "deleteLog", "", "release", "upload", "pushRawContent", "", "listener", "Lcom/oplus/utrace/sdk/IUploadListener;", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IULogger extends ILogger {
    boolean available();

    void deleteLog();

    void release();

    void upload(@NotNull String pushRawContent, @NotNull IUploadListener listener);
}
