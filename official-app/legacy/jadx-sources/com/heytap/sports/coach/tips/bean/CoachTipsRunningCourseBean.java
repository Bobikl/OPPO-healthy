package com.heytap.sports.coach.tips.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.operations.bean.RunningCourseDetailBean;
import com.oplus.smartenginehelper.ParserTag;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/heytap/sports/coach/tips/bean/CoachTipsRunningCourseBean;", "", "title", "", "content", ParserTag.TYPE_BUTTON, "courseList", "", "Lcom/heytap/health/operations/bean/RunningCourseDetailBean;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getButton", "()Ljava/lang/String;", "getContent", "getCourseList", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CoachTipsRunningCourseBean {
    public static final int $stable = 8;

    @NotNull
    private final String button;

    @NotNull
    private final String content;

    @NotNull
    private final List<RunningCourseDetailBean> courseList;

    @NotNull
    private final String title;

    public CoachTipsRunningCourseBean() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoachTipsRunningCourseBean copy$default(CoachTipsRunningCourseBean coachTipsRunningCourseBean, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coachTipsRunningCourseBean.title;
        }
        if ((i & 2) != 0) {
            str2 = coachTipsRunningCourseBean.content;
        }
        if ((i & 4) != 0) {
            str3 = coachTipsRunningCourseBean.button;
        }
        if ((i & 8) != 0) {
            list = coachTipsRunningCourseBean.courseList;
        }
        return coachTipsRunningCourseBean.copy(str, str2, str3, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getButton() {
        return this.button;
    }

    @NotNull
    public final List<RunningCourseDetailBean> component4() {
        return this.courseList;
    }

    @NotNull
    public final CoachTipsRunningCourseBean copy(@NotNull String title, @NotNull String content, @NotNull String button, @NotNull List<RunningCourseDetailBean> courseList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(courseList, "courseList");
        return new CoachTipsRunningCourseBean(title, content, button, courseList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachTipsRunningCourseBean)) {
            return false;
        }
        CoachTipsRunningCourseBean coachTipsRunningCourseBean = (CoachTipsRunningCourseBean) other;
        return Intrinsics.areEqual(this.title, coachTipsRunningCourseBean.title) && Intrinsics.areEqual(this.content, coachTipsRunningCourseBean.content) && Intrinsics.areEqual(this.button, coachTipsRunningCourseBean.button) && Intrinsics.areEqual(this.courseList, coachTipsRunningCourseBean.courseList);
    }

    @NotNull
    public final String getButton() {
        return this.button;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final List<RunningCourseDetailBean> getCourseList() {
        return this.courseList;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + this.button.hashCode()) * 31) + this.courseList.hashCode();
    }

    @NotNull
    public String toString() {
        return "CoachTipsRunningCourseBean(title=" + this.title + ", content=" + this.content + ", button=" + this.button + ", courseList=" + this.courseList + ")";
    }

    public CoachTipsRunningCourseBean(@NotNull String title, @NotNull String content, @NotNull String button, @NotNull List<RunningCourseDetailBean> courseList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(courseList, "courseList");
        this.title = title;
        this.content = content;
        this.button = button;
        this.courseList = courseList;
    }

    public /* synthetic */ CoachTipsRunningCourseBean(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
