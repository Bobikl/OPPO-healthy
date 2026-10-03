package com.oplus.utrace.hlog;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"DEFAULT_MAX_FILE_SIZE", "", "DELAY_UPLOAD", "KEEP_LOGS_ON_FINISH", "", "MSG_FINISH", "", "MSG_UPLOAD", "TAG", "", "utrace-sdk-log_logRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HLogUploaderTaskKt {
    public static final long DEFAULT_MAX_FILE_SIZE = 8388608;
    public static final long DELAY_UPLOAD = 30000;
    public static final boolean KEEP_LOGS_ON_FINISH = false;
    private static final int MSG_FINISH = 202;
    private static final int MSG_UPLOAD = 201;

    @NotNull
    private static final String TAG = "UTrace.Sdk.HLogUploaderTask";
}
