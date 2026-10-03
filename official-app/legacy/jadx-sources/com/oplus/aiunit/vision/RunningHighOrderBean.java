package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.MetadataUnit;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.r2g, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0016\u0010\u000fR(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0019\u0010\u000fR(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u001b\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/r2g;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "Lcom/heytap/databaseengine/model/MetadataUnit;", "a", "Ljava/util/List;", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "aerobicTeList", "b", MapSchema.FIELD_NAME_ENTRY, "j", "vo2MaxList", "c", b2n.f, "avgPowerList", "d", b2n.g, "avgStanceList", "i", "avgVerticalList", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RunningHighOrderBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public List<MetadataUnit> aerobicTeList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public List<MetadataUnit> vo2MaxList;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public List<MetadataUnit> avgPowerList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public List<MetadataUnit> avgStanceList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public List<MetadataUnit> avgVerticalList;

    public RunningHighOrderBean() {
        this(null, null, null, null, null, 31, null);
    }

    @NotNull
    public final List<MetadataUnit> a() {
        return this.aerobicTeList;
    }

    @NotNull
    public final List<MetadataUnit> b() {
        return this.avgPowerList;
    }

    @NotNull
    public final List<MetadataUnit> c() {
        return this.avgStanceList;
    }

    @NotNull
    public final List<MetadataUnit> d() {
        return this.avgVerticalList;
    }

    @NotNull
    public final List<MetadataUnit> e() {
        return this.vo2MaxList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunningHighOrderBean)) {
            return false;
        }
        RunningHighOrderBean runningHighOrderBean = (RunningHighOrderBean) other;
        return Intrinsics.areEqual(this.aerobicTeList, runningHighOrderBean.aerobicTeList) && Intrinsics.areEqual(this.vo2MaxList, runningHighOrderBean.vo2MaxList) && Intrinsics.areEqual(this.avgPowerList, runningHighOrderBean.avgPowerList) && Intrinsics.areEqual(this.avgStanceList, runningHighOrderBean.avgStanceList) && Intrinsics.areEqual(this.avgVerticalList, runningHighOrderBean.avgVerticalList);
    }

    public final void f(@NotNull List<MetadataUnit> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.aerobicTeList = list;
    }

    public final void g(@NotNull List<MetadataUnit> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.avgPowerList = list;
    }

    public final void h(@NotNull List<MetadataUnit> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.avgStanceList = list;
    }

    public int hashCode() {
        return (((((((this.aerobicTeList.hashCode() * 31) + this.vo2MaxList.hashCode()) * 31) + this.avgPowerList.hashCode()) * 31) + this.avgStanceList.hashCode()) * 31) + this.avgVerticalList.hashCode();
    }

    public final void i(@NotNull List<MetadataUnit> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.avgVerticalList = list;
    }

    public final void j(@NotNull List<MetadataUnit> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.vo2MaxList = list;
    }

    @NotNull
    public String toString() {
        return "RunningHighOrderBean(aerobicTeList=" + this.aerobicTeList + ", vo2MaxList=" + this.vo2MaxList + ", avgPowerList=" + this.avgPowerList + ", avgStanceList=" + this.avgStanceList + ", avgVerticalList=" + this.avgVerticalList + ")";
    }

    public RunningHighOrderBean(@NotNull List<MetadataUnit> aerobicTeList, @NotNull List<MetadataUnit> vo2MaxList, @NotNull List<MetadataUnit> avgPowerList, @NotNull List<MetadataUnit> avgStanceList, @NotNull List<MetadataUnit> avgVerticalList) {
        Intrinsics.checkNotNullParameter(aerobicTeList, "aerobicTeList");
        Intrinsics.checkNotNullParameter(vo2MaxList, "vo2MaxList");
        Intrinsics.checkNotNullParameter(avgPowerList, "avgPowerList");
        Intrinsics.checkNotNullParameter(avgStanceList, "avgStanceList");
        Intrinsics.checkNotNullParameter(avgVerticalList, "avgVerticalList");
        this.aerobicTeList = aerobicTeList;
        this.vo2MaxList = vo2MaxList;
        this.avgPowerList = avgPowerList;
        this.avgStanceList = avgStanceList;
        this.avgVerticalList = avgVerticalList;
    }

    public /* synthetic */ RunningHighOrderBean(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? new ArrayList() : list3, (i & 8) != 0 ? new ArrayList() : list4, (i & 16) != 0 ? new ArrayList() : list5);
    }
}
