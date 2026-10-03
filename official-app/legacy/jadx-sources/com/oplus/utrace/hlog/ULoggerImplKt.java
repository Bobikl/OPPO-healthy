package com.oplus.utrace.hlog;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"FLUSH_DELAY", "", "FLUSH_INTERVAL", "FLUSH_LOG_COUNT", "", "FLUSH_SYNC_INTERVAL", "MAX_RETRY_COUNT", "MSG_FLUSH", "TAG", "", "utrace-sdk-log_logRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ULoggerImplKt {
    private static final long FLUSH_DELAY = 15000;
    private static final long FLUSH_INTERVAL = 5000;
    private static final int FLUSH_LOG_COUNT = 100;
    private static final long FLUSH_SYNC_INTERVAL = 60000;
    private static final int MAX_RETRY_COUNT = 3;
    private static final int MSG_FLUSH = 300;

    @NotNull
    private static final String TAG = "UTrace.Sdk.HLog.ULoggerImpl";
}
