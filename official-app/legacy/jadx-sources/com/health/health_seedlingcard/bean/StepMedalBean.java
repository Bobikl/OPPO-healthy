package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/health/health_seedlingcard/bean/StepMedalBean;", "", "uiData", "Lcom/health/health_seedlingcard/bean/StepMedal;", "(Lcom/health/health_seedlingcard/bean/StepMedal;)V", "getUiData", "()Lcom/health/health_seedlingcard/bean/StepMedal;", "setUiData", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class StepMedalBean {

    @NotNull
    private StepMedal uiData;

    public StepMedalBean(@NotNull StepMedal uiData) {
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        this.uiData = uiData;
    }

    public static /* synthetic */ StepMedalBean copy$default(StepMedalBean stepMedalBean, StepMedal stepMedal, int i, Object obj) {
        if ((i & 1) != 0) {
            stepMedal = stepMedalBean.uiData;
        }
        return stepMedalBean.copy(stepMedal);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StepMedal getUiData() {
        return this.uiData;
    }

    @NotNull
    public final StepMedalBean copy(@NotNull StepMedal uiData) {
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        return new StepMedalBean(uiData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StepMedalBean) && Intrinsics.areEqual(this.uiData, ((StepMedalBean) other).uiData);
    }

    @NotNull
    public final StepMedal getUiData() {
        return this.uiData;
    }

    public int hashCode() {
        return this.uiData.hashCode();
    }

    public final void setUiData(@NotNull StepMedal stepMedal) {
        Intrinsics.checkNotNullParameter(stepMedal, "<set-?>");
        this.uiData = stepMedal;
    }

    @NotNull
    public String toString() {
        return "StepMedalBean(uiData=" + this.uiData + ")";
    }
}
