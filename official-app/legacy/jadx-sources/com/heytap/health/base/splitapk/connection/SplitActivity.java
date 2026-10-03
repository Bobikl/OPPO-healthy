package com.heytap.health.base.splitapk.connection;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/heytap/health/base/splitapk/connection/SplitActivity;", "", "activityPath", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getActivityPath", "()Ljava/lang/String;", "MY_GOAL_ACTIVITY", "GOAL_CONFIG_ACTIVITY", "CREATE_NEW_GOAL_ACTIVITY", "lib_base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum SplitActivity {
    MY_GOAL_ACTIVITY("com.heytap.health.splitapk.operation.goal.business.MyGoalActivity"),
    GOAL_CONFIG_ACTIVITY("com.heytap.health.splitapk.operation.goal.business.GoalConfigActivity"),
    CREATE_NEW_GOAL_ACTIVITY("com.heytap.health.splitapk.operation.goal.business.CreateNewGoalActivity");


    @NotNull
    private final String activityPath;

    SplitActivity(String str) {
        this.activityPath = str;
    }

    @NotNull
    public final String getActivityPath() {
        return this.activityPath;
    }
}
