package com.oplus.channel.server.utils;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/oplus/channel/server/utils/Constants;", "", "()V", "BATCH_CALL_RESULT", "", "CALL_RESULT", "CONSUMED", "METHOD_BATCH_CALLBACK", "METHOD_CALLBACK", "METHOD_PULL", "METHOD_PULL_COMMAND", "RESULT_BATCH_CALLBACK_SUPPORT", "RESULT_CALLBACK_DATA", "RESULT_CALLBACK_ID", "RESULT_CALLBACK_ID_LIST", "RESULT_COMMAND_LIST", "RESULT_FAILURE", "", "RESULT_IDLE_STATE", "RESULT_SUCCESS", "server_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class Constants {

    @NotNull
    public static final String BATCH_CALL_RESULT = "batch_call_result";

    @NotNull
    public static final String CALL_RESULT = "call_result";

    @NotNull
    public static final String CONSUMED = "consumed";

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    public static final String METHOD_BATCH_CALLBACK = "batch_callback";

    @NotNull
    public static final String METHOD_CALLBACK = "callback";

    @NotNull
    public static final String METHOD_PULL = "pull";

    @NotNull
    public static final String METHOD_PULL_COMMAND = "pullCommand";

    @NotNull
    public static final String RESULT_BATCH_CALLBACK_SUPPORT = "RESULT_BATCH_CALLBACK_SUPPORT";

    @NotNull
    public static final String RESULT_CALLBACK_DATA = "RESULT_CALLBACK_DATA";

    @NotNull
    public static final String RESULT_CALLBACK_ID = "RESULT_CALLBACK_ID";

    @NotNull
    public static final String RESULT_CALLBACK_ID_LIST = "RESULT_CALLBACK_ID_LIST";

    @NotNull
    public static final String RESULT_COMMAND_LIST = "RESULT_COMMAND_LIST";
    public static final int RESULT_FAILURE = 1;

    @NotNull
    public static final String RESULT_IDLE_STATE = "RESULT_IDLE_STATE";
    public static final int RESULT_SUCCESS = 0;

    private Constants() {
    }
}
