package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.h2g, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B,\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R+\u0010\u001c\u001a\u00020\u00178\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u001a\u0004\b\n\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/h2g;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "dataList", "b", "I", "()I", "setColorIndex", "(I)V", "colorIndex", "Landroidx/compose/ui/graphics/Color;", "J", "()J", "setColor-8_81llA", "(J)V", "color", "<init>", "(Ljava/util/List;IJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class RuningEvaluationCriteriaBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public List<String> dataList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int colorIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public long color;

    public /* synthetic */ RuningEvaluationCriteriaBean(List list, int i, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, i, j2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getColorIndex() {
        return this.colorIndex;
    }

    @NotNull
    public final List<String> c() {
        return this.dataList;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RuningEvaluationCriteriaBean)) {
            return false;
        }
        RuningEvaluationCriteriaBean runingEvaluationCriteriaBean = (RuningEvaluationCriteriaBean) other;
        return Intrinsics.areEqual(this.dataList, runingEvaluationCriteriaBean.dataList) && this.colorIndex == runingEvaluationCriteriaBean.colorIndex && Color.m1619equalsimpl0(this.color, runingEvaluationCriteriaBean.color);
    }

    public int hashCode() {
        return (((this.dataList.hashCode() * 31) + Integer.hashCode(this.colorIndex)) * 31) + Color.m1625hashCodeimpl(this.color);
    }

    @NotNull
    public String toString() {
        return "RuningEvaluationCriteriaBean(dataList=" + this.dataList + ", colorIndex=" + this.colorIndex + ", color=" + Color.m1626toStringimpl(this.color) + ")";
    }

    public RuningEvaluationCriteriaBean(List<String> list, int i, long j2) {
        this.dataList = list;
        this.colorIndex = i;
        this.color = j2;
    }
}
