package com.heytap.health.quickcard.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/quickcard/data/QuickAppMsgBean;", "", "()V", "appFunctionName", "", "getAppFunctionName", "()Ljava/lang/String;", "setAppFunctionName", "(Ljava/lang/String;)V", "data", "getData", "setData", "type", "getType", "setType", "toString", "AppFunctionName", "quickcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QuickAppMsgBean {

    @NotNull
    private String appFunctionName = "";

    @NotNull
    private String type = "";

    @NotNull
    private String data = "";

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/heytap/health/quickcard/data/QuickAppMsgBean$AppFunctionName;", "", "()V", "GET_STEP_MONTH_DATA", "", "UPDATE_STEPS_GOAL", "quickcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AppFunctionName {

        @NotNull
        public static final String GET_STEP_MONTH_DATA = "getMonthAndTotalStepsForQuickApp";

        @NotNull
        public static final AppFunctionName INSTANCE = new AppFunctionName();

        @NotNull
        public static final String UPDATE_STEPS_GOAL = "updateStepsGoal";

        private AppFunctionName() {
        }
    }

    @NotNull
    public final String getAppFunctionName() {
        return this.appFunctionName;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final void setAppFunctionName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.appFunctionName = str;
    }

    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data = str;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "QuickAppMsgBean(appFunctionName='" + this.appFunctionName + "', data='" + this.data + "', type='" + this.type + "')";
    }
}
