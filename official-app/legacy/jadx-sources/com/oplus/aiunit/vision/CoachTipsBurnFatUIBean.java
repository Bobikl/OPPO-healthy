package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.coach.tips.bean.BurnFatCardUIBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.vj3, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\n\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/vj3;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/k48;", "a", "Lcom/oplus/aiunit/vision/k48;", "b", "()Lcom/oplus/aiunit/vision/k48;", "reviewBean", "", "Lcom/heytap/sports/coach/tips/bean/BurnFatCardUIBean;", "Ljava/util/List;", "()Ljava/util/List;", "cardList", "<init>", "(Lcom/oplus/aiunit/vision/k48;Ljava/util/List;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CoachTipsBurnFatUIBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final GeneralReviewBean reviewBean;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<BurnFatCardUIBean> cardList;

    public CoachTipsBurnFatUIBean(@NotNull GeneralReviewBean reviewBean, @NotNull List<BurnFatCardUIBean> cardList) {
        Intrinsics.checkNotNullParameter(reviewBean, "reviewBean");
        Intrinsics.checkNotNullParameter(cardList, "cardList");
        this.reviewBean = reviewBean;
        this.cardList = cardList;
    }

    @NotNull
    public final List<BurnFatCardUIBean> a() {
        return this.cardList;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final GeneralReviewBean getReviewBean() {
        return this.reviewBean;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachTipsBurnFatUIBean)) {
            return false;
        }
        CoachTipsBurnFatUIBean coachTipsBurnFatUIBean = (CoachTipsBurnFatUIBean) other;
        return Intrinsics.areEqual(this.reviewBean, coachTipsBurnFatUIBean.reviewBean) && Intrinsics.areEqual(this.cardList, coachTipsBurnFatUIBean.cardList);
    }

    public int hashCode() {
        return (this.reviewBean.hashCode() * 31) + this.cardList.hashCode();
    }

    @NotNull
    public String toString() {
        return "CoachTipsBurnFatUIBean(reviewBean=" + this.reviewBean + ", cardList=" + this.cardList + ")";
    }
}
