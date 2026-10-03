package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.t2k, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0011\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0013\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/t2k;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "b", "setLeftData", "leftData", "setRightData", "rightData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class TouchdownBalanceEvaluationCriteriaBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public String leftData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public String rightData;

    public TouchdownBalanceEvaluationCriteriaBean(@NotNull String title, @NotNull String leftData, @NotNull String rightData) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(leftData, "leftData");
        Intrinsics.checkNotNullParameter(rightData, "rightData");
        this.title = title;
        this.leftData = leftData;
        this.rightData = rightData;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLeftData() {
        return this.leftData;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRightData() {
        return this.rightData;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TouchdownBalanceEvaluationCriteriaBean)) {
            return false;
        }
        TouchdownBalanceEvaluationCriteriaBean touchdownBalanceEvaluationCriteriaBean = (TouchdownBalanceEvaluationCriteriaBean) other;
        return Intrinsics.areEqual(this.title, touchdownBalanceEvaluationCriteriaBean.title) && Intrinsics.areEqual(this.leftData, touchdownBalanceEvaluationCriteriaBean.leftData) && Intrinsics.areEqual(this.rightData, touchdownBalanceEvaluationCriteriaBean.rightData);
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.leftData.hashCode()) * 31) + this.rightData.hashCode();
    }

    @NotNull
    public String toString() {
        return "TouchdownBalanceEvaluationCriteriaBean(title=" + this.title + ", leftData=" + this.leftData + ", rightData=" + this.rightData + ")";
    }
}
