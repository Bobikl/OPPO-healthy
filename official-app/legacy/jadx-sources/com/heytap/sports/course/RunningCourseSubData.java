package com.heytap.sports.course;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.health.operations.bean.RunningCourseDetailBean;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u0005\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u0015\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u0005HÆ\u0003J\u0013\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005HÆ\u0003JG\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u00052\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R2\u0010\u0004\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/heytap/sports/course/RunningCourseSubData;", "", "title", "", "config", "", "", "courseList", "Lcom/heytap/health/operations/bean/RunningCourseDetailBean;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getConfig", "()Ljava/util/List;", "setConfig", "(Ljava/util/List;)V", "getCourseList", "setCourseList", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class RunningCourseSubData {
    public static final int $stable = 8;

    @SerializedName("config")
    @Nullable
    private List<? extends Map<String, String>> config;

    @SerializedName("courseList")
    @Nullable
    private List<RunningCourseDetailBean> courseList;

    @SerializedName("title")
    @Nullable
    private String title;

    public RunningCourseSubData() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RunningCourseSubData copy$default(RunningCourseSubData runningCourseSubData, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = runningCourseSubData.title;
        }
        if ((i & 2) != 0) {
            list = runningCourseSubData.config;
        }
        if ((i & 4) != 0) {
            list2 = runningCourseSubData.courseList;
        }
        return runningCourseSubData.copy(str, list, list2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final List<Map<String, String>> component2() {
        return this.config;
    }

    @Nullable
    public final List<RunningCourseDetailBean> component3() {
        return this.courseList;
    }

    @NotNull
    public final RunningCourseSubData copy(@Nullable String title, @Nullable List<? extends Map<String, String>> config, @Nullable List<RunningCourseDetailBean> courseList) {
        return new RunningCourseSubData(title, config, courseList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunningCourseSubData)) {
            return false;
        }
        RunningCourseSubData runningCourseSubData = (RunningCourseSubData) other;
        return Intrinsics.areEqual(this.title, runningCourseSubData.title) && Intrinsics.areEqual(this.config, runningCourseSubData.config) && Intrinsics.areEqual(this.courseList, runningCourseSubData.courseList);
    }

    @Nullable
    public final List<Map<String, String>> getConfig() {
        return this.config;
    }

    @Nullable
    public final List<RunningCourseDetailBean> getCourseList() {
        return this.courseList;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<? extends Map<String, String>> list = this.config;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<RunningCourseDetailBean> list2 = this.courseList;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setConfig(@Nullable List<? extends Map<String, String>> list) {
        this.config = list;
    }

    public final void setCourseList(@Nullable List<RunningCourseDetailBean> list) {
        this.courseList = list;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "RunningCourseSubData(title=" + this.title + ", config=" + this.config + ", courseList=" + this.courseList + ")";
    }

    public RunningCourseSubData(@Nullable String str, @Nullable List<? extends Map<String, String>> list, @Nullable List<RunningCourseDetailBean> list2) {
        this.title = str;
        this.config = list;
        this.courseList = list2;
    }

    public /* synthetic */ RunningCourseSubData(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
