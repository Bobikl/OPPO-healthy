package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.eef, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\t\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/eef;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "c", "()I", "target", "b", "dataSource", "", "Lcom/oplus/aiunit/vision/cef;", "Ljava/util/List;", "()Ljava/util/List;", "courses", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RecommendCourseList {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("target")
    private final int target;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("dataSource")
    private final int dataSource;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("courses")
    @NotNull
    private final List<RecommendCourse> courses;

    @NotNull
    public final List<RecommendCourse> a() {
        return this.courses;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDataSource() {
        return this.dataSource;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTarget() {
        return this.target;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendCourseList)) {
            return false;
        }
        RecommendCourseList recommendCourseList = (RecommendCourseList) other;
        return this.target == recommendCourseList.target && this.dataSource == recommendCourseList.dataSource && Intrinsics.areEqual(this.courses, recommendCourseList.courses);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.target) * 31) + Integer.hashCode(this.dataSource)) * 31) + this.courses.hashCode();
    }

    @NotNull
    public String toString() {
        return "RecommendCourseList(target=" + this.target + ", dataSource=" + this.dataSource + ", courses=" + this.courses + ")";
    }
}
