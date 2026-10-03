package com.health.health_seedlingcard.bean;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/health/health_seedlingcard/bean/SleepReminderCardBean;", "", "uiData", "Lcom/health/health_seedlingcard/bean/SleepReminderUiData;", "(Lcom/health/health_seedlingcard/bean/SleepReminderUiData;)V", "getUiData", "()Lcom/health/health_seedlingcard/bean/SleepReminderUiData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SleepReminderCardBean {

    @NotNull
    private final SleepReminderUiData uiData;

    public SleepReminderCardBean(@NotNull SleepReminderUiData uiData) {
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        this.uiData = uiData;
    }

    public static /* synthetic */ SleepReminderCardBean copy$default(SleepReminderCardBean sleepReminderCardBean, SleepReminderUiData sleepReminderUiData, int i, Object obj) {
        if ((i & 1) != 0) {
            sleepReminderUiData = sleepReminderCardBean.uiData;
        }
        return sleepReminderCardBean.copy(sleepReminderUiData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SleepReminderUiData getUiData() {
        return this.uiData;
    }

    @NotNull
    public final SleepReminderCardBean copy(@NotNull SleepReminderUiData uiData) {
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        return new SleepReminderCardBean(uiData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SleepReminderCardBean) && Intrinsics.areEqual(this.uiData, ((SleepReminderCardBean) other).uiData);
    }

    @NotNull
    public final SleepReminderUiData getUiData() {
        return this.uiData;
    }

    public int hashCode() {
        return this.uiData.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepReminderCardBean(uiData=" + this.uiData + ")";
    }
}
