package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import com.heytap.health.operations.bean.RunningCourseDetailBean;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.bc4, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\u0017\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0011\u0018\u00010\u0010\u0012\u0012\b\u0002\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR6\u0010\u0017\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\t\u0010\u0014\"\u0004\b\u0015\u0010\u0016R,\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/bc4;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "setConfig", "(Ljava/util/List;)V", "config", "Lcom/heytap/health/operations/bean/RunningCourseDetailBean;", "c", "setCourseList", "courseList", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "fitness_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CourseSubData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("title")
    @Nullable
    private String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("config")
    @Nullable
    private List<? extends Map<String, String>> config;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("courseList")
    @Nullable
    private List<RunningCourseDetailBean> courseList;

    public CourseSubData() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final List<Map<String, String>> a() {
        return this.config;
    }

    @Nullable
    public final List<RunningCourseDetailBean> b() {
        return this.courseList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseSubData)) {
            return false;
        }
        CourseSubData courseSubData = (CourseSubData) other;
        return Intrinsics.areEqual(this.title, courseSubData.title) && Intrinsics.areEqual(this.config, courseSubData.config) && Intrinsics.areEqual(this.courseList, courseSubData.courseList);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<? extends Map<String, String>> list = this.config;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<RunningCourseDetailBean> list2 = this.courseList;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CourseSubData(title=" + this.title + ", config=" + this.config + ", courseList=" + this.courseList + ")";
    }

    public CourseSubData(@Nullable String str, @Nullable List<? extends Map<String, String>> list, @Nullable List<RunningCourseDetailBean> list2) {
        this.title = str;
        this.config = list;
        this.courseList = list2;
    }

    public /* synthetic */ CourseSubData(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2);
    }
}
