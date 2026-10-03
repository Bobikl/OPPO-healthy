package com.heytap.sports.coach.tips;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.mnc;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/heytap/sports/coach/tips/DescriptionPageBean;", "Ljava/io/Serializable;", mnc.DOCTOR_LEVEL, "", "textList", "", "Lcom/heytap/sports/coach/tips/DescriptionPageText;", "(ILjava/util/List;)V", "getTextList", "()Ljava/util/List;", "getTitleId", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class DescriptionPageBean implements Serializable {
    public static final int $stable = 8;

    @NotNull
    private final List<DescriptionPageText> textList;
    private final int titleId;

    /* JADX WARN: Multi-variable type inference failed */
    public DescriptionPageBean(@StringRes int i, @NotNull List<? extends DescriptionPageText> textList) {
        Intrinsics.checkNotNullParameter(textList, "textList");
        this.titleId = i;
        this.textList = textList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DescriptionPageBean copy$default(DescriptionPageBean descriptionPageBean, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = descriptionPageBean.titleId;
        }
        if ((i2 & 2) != 0) {
            list = descriptionPageBean.textList;
        }
        return descriptionPageBean.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTitleId() {
        return this.titleId;
    }

    @NotNull
    public final List<DescriptionPageText> component2() {
        return this.textList;
    }

    @NotNull
    public final DescriptionPageBean copy(@StringRes int titleId, @NotNull List<? extends DescriptionPageText> textList) {
        Intrinsics.checkNotNullParameter(textList, "textList");
        return new DescriptionPageBean(titleId, textList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DescriptionPageBean)) {
            return false;
        }
        DescriptionPageBean descriptionPageBean = (DescriptionPageBean) other;
        return this.titleId == descriptionPageBean.titleId && Intrinsics.areEqual(this.textList, descriptionPageBean.textList);
    }

    @NotNull
    public final List<DescriptionPageText> getTextList() {
        return this.textList;
    }

    public final int getTitleId() {
        return this.titleId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.titleId) * 31) + this.textList.hashCode();
    }

    @NotNull
    public String toString() {
        return "DescriptionPageBean(titleId=" + this.titleId + ", textList=" + this.textList + ")";
    }
}
