package com.heytap.health.base.splitapk.connection;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/heytap/health/base/splitapk/connection/SplitOperationInterface;", "", "function", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getFunction", "()Ljava/lang/String;", "START_ACTIVITY", "INIT_GOAL_ALARM", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum SplitOperationInterface {
    START_ACTIVITY("startActivity"),
    INIT_GOAL_ALARM("initGoalAlarm");


    @NotNull
    private final String function;

    SplitOperationInterface(String str) {
        this.function = str;
    }

    @NotNull
    public final String getFunction() {
        return this.function;
    }
}
