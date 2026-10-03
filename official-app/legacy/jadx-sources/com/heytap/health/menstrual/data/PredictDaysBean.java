package com.heytap.health.menstrual.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/menstrual/data/PredictDaysBean;", "", "predictDays", "", "(I)V", "getPredictDays", "()I", "setPredictDays", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "menstrual_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PredictDaysBean {
    private int predictDays;

    public PredictDaysBean() {
        this(0, 1, null);
    }

    public static /* synthetic */ PredictDaysBean copy$default(PredictDaysBean predictDaysBean, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = predictDaysBean.predictDays;
        }
        return predictDaysBean.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPredictDays() {
        return this.predictDays;
    }

    @NotNull
    public final PredictDaysBean copy(int predictDays) {
        return new PredictDaysBean(predictDays);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PredictDaysBean) && this.predictDays == ((PredictDaysBean) other).predictDays;
    }

    public final int getPredictDays() {
        return this.predictDays;
    }

    public int hashCode() {
        return Integer.hashCode(this.predictDays);
    }

    public final void setPredictDays(int i) {
        this.predictDays = i;
    }

    @NotNull
    public String toString() {
        return "PredictDaysBean(predictDays=" + this.predictDays + ")";
    }

    public PredictDaysBean(int i) {
        this.predictDays = i;
    }

    public /* synthetic */ PredictDaysBean(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
