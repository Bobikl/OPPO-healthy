package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.cef, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/cef;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "courseCode", "b", "getModuleTitle", "moduleTitle", "c", "getName", "name", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RecommendCourse {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("courseCode")
    @NotNull
    private final String courseCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("moduleTitle")
    @NotNull
    private final String moduleTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("name")
    @NotNull
    private final String name;

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCourseCode() {
        return this.courseCode;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendCourse)) {
            return false;
        }
        RecommendCourse recommendCourse = (RecommendCourse) other;
        return Intrinsics.areEqual(this.courseCode, recommendCourse.courseCode) && Intrinsics.areEqual(this.moduleTitle, recommendCourse.moduleTitle) && Intrinsics.areEqual(this.name, recommendCourse.name);
    }

    public int hashCode() {
        return (((this.courseCode.hashCode() * 31) + this.moduleTitle.hashCode()) * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "RecommendCourse(courseCode=" + this.courseCode + ", moduleTitle=" + this.moduleTitle + ", name=" + this.name + ")";
    }
}
