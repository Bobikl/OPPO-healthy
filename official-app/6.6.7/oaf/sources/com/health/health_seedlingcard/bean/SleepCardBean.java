package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/health/health_seedlingcard/bean/SleepCardBean;", "", "uiData", "Lcom/health/health_seedlingcard/bean/UiData;", "(Lcom/health/health_seedlingcard/bean/UiData;)V", "getUiData", "()Lcom/health/health_seedlingcard/bean/UiData;", "setUiData", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SleepCardBean {

    @NotNull
    private UiData uiData;

    public SleepCardBean(@NotNull UiData uiData) {
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        this.uiData = uiData;
    }

    public static /* synthetic */ SleepCardBean copy$default(SleepCardBean sleepCardBean, UiData uiData, int i, Object obj) {
        if ((i & 1) != 0) {
            uiData = sleepCardBean.uiData;
        }
        return sleepCardBean.copy(uiData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UiData getUiData() {
        return this.uiData;
    }

    @NotNull
    public final SleepCardBean copy(@NotNull UiData uiData) {
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        return new SleepCardBean(uiData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SleepCardBean) && Intrinsics.areEqual(this.uiData, ((SleepCardBean) other).uiData);
    }

    @NotNull
    public final UiData getUiData() {
        return this.uiData;
    }

    public int hashCode() {
        return this.uiData.hashCode();
    }

    public final void setUiData(@NotNull UiData uiData) {
        Intrinsics.checkNotNullParameter(uiData, "<set-?>");
        this.uiData = uiData;
    }

    @NotNull
    public String toString() {
        return "SleepCardBean(uiData=" + this.uiData + ")";
    }
}
