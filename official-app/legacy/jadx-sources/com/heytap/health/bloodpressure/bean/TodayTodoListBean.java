package com.heytap.health.bloodpressure.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengineservice.db.table.healtharchives.DBIndicatorStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/bloodpressure/bean/TodayTodoListBean;", "", "isCompleted", "", DBIndicatorStat.SORT, "", "type", "", "(ZILjava/lang/String;)V", "()Z", "setCompleted", "(Z)V", "getSort", "()I", "setSort", "(I)V", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "blood_pressure_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TodayTodoListBean {
    public static final int $stable = 8;
    private boolean isCompleted;
    private int sort;

    @NotNull
    private String type;

    public TodayTodoListBean(boolean z, int i, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.isCompleted = z;
        this.sort = i;
        this.type = type;
    }

    public static /* synthetic */ TodayTodoListBean copy$default(TodayTodoListBean todayTodoListBean, boolean z, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = todayTodoListBean.isCompleted;
        }
        if ((i2 & 2) != 0) {
            i = todayTodoListBean.sort;
        }
        if ((i2 & 4) != 0) {
            str = todayTodoListBean.type;
        }
        return todayTodoListBean.copy(z, i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final TodayTodoListBean copy(boolean isCompleted, int sort, @NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new TodayTodoListBean(isCompleted, sort, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TodayTodoListBean)) {
            return false;
        }
        TodayTodoListBean todayTodoListBean = (TodayTodoListBean) other;
        return this.isCompleted == todayTodoListBean.isCompleted && this.sort == todayTodoListBean.sort && Intrinsics.areEqual(this.type, todayTodoListBean.type);
    }

    public final int getSort() {
        return this.sort;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isCompleted;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + Integer.hashCode(this.sort)) * 31) + this.type.hashCode();
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public final void setCompleted(boolean z) {
        this.isCompleted = z;
    }

    public final void setSort(int i) {
        this.sort = i;
    }

    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    @NotNull
    public String toString() {
        return "TodayTodoListBean(isCompleted=" + this.isCompleted + ", sort=" + this.sort + ", type=" + this.type + ")";
    }
}
