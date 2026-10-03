package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.heytap.health.operations.bean.KeepTrainBean;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.nna, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R,\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\"\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u0017\u0010\u001d\"\u0004\b!\u0010\u001f¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/nna;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lcom/heytap/health/operations/bean/KeepTrainBean;", "a", "Ljava/util/List;", "()Ljava/util/List;", MapSchema.FIELD_NAME_ENTRY, "(Ljava/util/List;)V", "courseList", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", iim.a.f, "c", "d", b2n.f, "title", "I", "getCount", "()I", "setCount", "(I)V", "count", "f", "target", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;II)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class KeepTransSubList {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("courseList")
    @Nullable
    private List<KeepTrainBean> courseList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName(iim.a.f)
    @Nullable
    private String description;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("title")
    @Nullable
    private String title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("count")
    private int count;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @SerializedName("target")
    private int target;

    public KeepTransSubList() {
        this(null, null, null, 0, 0, 31, null);
    }

    @Nullable
    public final List<KeepTrainBean> a() {
        return this.courseList;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTarget() {
        return this.target;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final void e(@Nullable List<KeepTrainBean> list) {
        this.courseList = list;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeepTransSubList)) {
            return false;
        }
        KeepTransSubList keepTransSubList = (KeepTransSubList) other;
        return Intrinsics.areEqual(this.courseList, keepTransSubList.courseList) && Intrinsics.areEqual(this.description, keepTransSubList.description) && Intrinsics.areEqual(this.title, keepTransSubList.title) && this.count == keepTransSubList.count && this.target == keepTransSubList.target;
    }

    public final void f(int i) {
        this.target = i;
    }

    public final void g(@Nullable String str) {
        this.title = str;
    }

    public int hashCode() {
        List<KeepTrainBean> list = this.courseList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.target);
    }

    @NotNull
    public String toString() {
        return "KeepTransSubList(courseList=" + this.courseList + ", description=" + this.description + ", title=" + this.title + ", count=" + this.count + ", target=" + this.target + ")";
    }

    public KeepTransSubList(@Nullable List<KeepTrainBean> list, @Nullable String str, @Nullable String str2, int i, int i2) {
        this.courseList = list;
        this.description = str;
        this.title = str2;
        this.count = i;
        this.target = i2;
    }

    public /* synthetic */ KeepTransSubList(List list, String str, String str2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2);
    }
}
