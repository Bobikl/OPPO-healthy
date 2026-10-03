package com.heytap.health.bloodpressure.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/heytap/health/bloodpressure/bean/BloodPressureTrainJoinedBean;", "", "joinDays", "", "progress", "projectName", "", "todayTodo", "", "Lcom/heytap/health/bloodpressure/bean/TodayTodoListBean;", "(IILjava/lang/String;Ljava/util/List;)V", "getJoinDays", "()I", "setJoinDays", "(I)V", "getProgress", ClickApiEntity.SET_PROGRESS, "getProjectName", "()Ljava/lang/String;", "setProjectName", "(Ljava/lang/String;)V", "getTodayTodo", "()Ljava/util/List;", "setTodayTodo", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "blood_pressure_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BloodPressureTrainJoinedBean {
    public static final int $stable = 8;
    private int joinDays;
    private int progress;

    @NotNull
    private String projectName;

    @NotNull
    private List<TodayTodoListBean> todayTodo;

    public BloodPressureTrainJoinedBean(int i, int i2, @NotNull String projectName, @NotNull List<TodayTodoListBean> todayTodo) {
        Intrinsics.checkNotNullParameter(projectName, "projectName");
        Intrinsics.checkNotNullParameter(todayTodo, "todayTodo");
        this.joinDays = i;
        this.progress = i2;
        this.projectName = projectName;
        this.todayTodo = todayTodo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BloodPressureTrainJoinedBean copy$default(BloodPressureTrainJoinedBean bloodPressureTrainJoinedBean, int i, int i2, String str, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bloodPressureTrainJoinedBean.joinDays;
        }
        if ((i3 & 2) != 0) {
            i2 = bloodPressureTrainJoinedBean.progress;
        }
        if ((i3 & 4) != 0) {
            str = bloodPressureTrainJoinedBean.projectName;
        }
        if ((i3 & 8) != 0) {
            list = bloodPressureTrainJoinedBean.todayTodo;
        }
        return bloodPressureTrainJoinedBean.copy(i, i2, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getJoinDays() {
        return this.joinDays;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProjectName() {
        return this.projectName;
    }

    @NotNull
    public final List<TodayTodoListBean> component4() {
        return this.todayTodo;
    }

    @NotNull
    public final BloodPressureTrainJoinedBean copy(int joinDays, int progress, @NotNull String projectName, @NotNull List<TodayTodoListBean> todayTodo) {
        Intrinsics.checkNotNullParameter(projectName, "projectName");
        Intrinsics.checkNotNullParameter(todayTodo, "todayTodo");
        return new BloodPressureTrainJoinedBean(joinDays, progress, projectName, todayTodo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureTrainJoinedBean)) {
            return false;
        }
        BloodPressureTrainJoinedBean bloodPressureTrainJoinedBean = (BloodPressureTrainJoinedBean) other;
        return this.joinDays == bloodPressureTrainJoinedBean.joinDays && this.progress == bloodPressureTrainJoinedBean.progress && Intrinsics.areEqual(this.projectName, bloodPressureTrainJoinedBean.projectName) && Intrinsics.areEqual(this.todayTodo, bloodPressureTrainJoinedBean.todayTodo);
    }

    public final int getJoinDays() {
        return this.joinDays;
    }

    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final String getProjectName() {
        return this.projectName;
    }

    @NotNull
    public final List<TodayTodoListBean> getTodayTodo() {
        return this.todayTodo;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.joinDays) * 31) + Integer.hashCode(this.progress)) * 31) + this.projectName.hashCode()) * 31) + this.todayTodo.hashCode();
    }

    public final void setJoinDays(int i) {
        this.joinDays = i;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    public final void setProjectName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.projectName = str;
    }

    public final void setTodayTodo(@NotNull List<TodayTodoListBean> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.todayTodo = list;
    }

    @NotNull
    public String toString() {
        return "BloodPressureTrainJoinedBean(joinDays=" + this.joinDays + ", progress=" + this.progress + ", projectName=" + this.projectName + ", todayTodo=" + this.todayTodo + ")";
    }

    public /* synthetic */ BloodPressureTrainJoinedBean(int i, int i2, String str, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, list);
    }
}
