package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.operations.bean.RunningCourseDetailBean;
import com.heytap.sports.course.RunningCourseSubData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/k2g;", "", "Lcom/heytap/sports/course/RunningCourseSubData;", "b", "cache", "", "c", "", "courseCode", "Lcom/heytap/health/operations/bean/RunningCourseDetailBean;", "a", "Lcom/heytap/sports/course/RunningCourseSubData;", "ownerCourseCache", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRunningCourseDataCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunningCourseDataCache.kt\ncom/heytap/sports/course/RunningCourseDataCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
public final class k2g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static RunningCourseSubData ownerCourseCache;

    @NotNull
    public static final k2g INSTANCE = new k2g();
    public static final int $stable = 8;

    @Nullable
    public final RunningCourseDetailBean a(@Nullable String courseCode) {
        List<RunningCourseDetailBean> courseList;
        RunningCourseSubData runningCourseSubDataB = b();
        Object obj = null;
        if (runningCourseSubDataB == null || (courseList = runningCourseSubDataB.getCourseList()) == null) {
            return null;
        }
        for (Object obj2 : courseList) {
            RunningCourseDetailBean runningCourseDetailBean = (RunningCourseDetailBean) obj2;
            if (Intrinsics.areEqual(runningCourseDetailBean != null ? runningCourseDetailBean.getCourseCode() : null, courseCode)) {
                obj = obj2;
                break;
            }
        }
        return (RunningCourseDetailBean) obj;
    }

    @Nullable
    public final RunningCourseSubData b() {
        return ownerCourseCache;
    }

    public final void c(@NotNull RunningCourseSubData cache) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        ownerCourseCache = RunningCourseSubData.copy$default(cache, null, null, null, 7, null);
    }
}
