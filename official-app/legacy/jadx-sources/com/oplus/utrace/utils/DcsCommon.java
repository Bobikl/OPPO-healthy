package com.oplus.utrace.utils;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/oplus/utrace/utils/DcsCommon;", "", "()V", "APP_ID", "", "EVENT_ID_CAUGHT_EXCEPTION", "EVENT_ID_CODE_TRACE", "EVENT_ID_HLOG_REPORTER", "EVENT_ID_INTENT_TRACE", "LOG_TAG_INTERNAL", "LOG_TAG_TRACE", "LOG_TAG_ULOG", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DcsCommon {

    @NotNull
    public static final String APP_ID = "123701";

    @NotNull
    public static final String EVENT_ID_CAUGHT_EXCEPTION = "1001";

    @NotNull
    public static final String EVENT_ID_CODE_TRACE = "3000";

    @NotNull
    public static final String EVENT_ID_HLOG_REPORTER = "1000";

    @NotNull
    public static final String EVENT_ID_INTENT_TRACE = "4000";

    @NotNull
    public static final DcsCommon INSTANCE = new DcsCommon();

    @NotNull
    public static final String LOG_TAG_INTERNAL = "UTRACE_INTERNAL";

    @NotNull
    public static final String LOG_TAG_TRACE = "DCS_PRE";

    @NotNull
    public static final String LOG_TAG_ULOG = "ULOG";

    private DcsCommon() {
    }
}
