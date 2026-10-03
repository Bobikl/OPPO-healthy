package com.oplus.utrace.lib;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/oplus/utrace/lib/TraceConst;", "", "()V", "BASE_PKG", "", "FLAG_TIMEOUT", "", "KEY_MESSAGE", "KEY_RECV_DBS", "KEY_SDK_CONFIG", "KEY_SEND_DBS", "NO", "TAG_SAMPLER", "TAG_USER_LABEL", "YES", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TraceConst {

    @NotNull
    public static final String BASE_PKG = "com.oplus.utrace";
    public static final int FLAG_TIMEOUT = 1;

    @NotNull
    public static final TraceConst INSTANCE = new TraceConst();

    @NotNull
    public static final String KEY_MESSAGE = "message";

    @NotNull
    public static final String KEY_RECV_DBS = "received_dbs";

    @NotNull
    public static final String KEY_SDK_CONFIG = "sdk_config";

    @NotNull
    public static final String KEY_SEND_DBS = "send_dbs";
    public static final int NO = 0;

    @NotNull
    public static final String TAG_SAMPLER = "sampler";

    @NotNull
    public static final String TAG_USER_LABEL = "user_label";
    public static final int YES = 1;

    private TraceConst() {
    }
}
