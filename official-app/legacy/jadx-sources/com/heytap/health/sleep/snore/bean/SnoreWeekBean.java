package com.heytap.health.sleep.snore.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.widget.charts.data.SnoreLevelData;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0005\"\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0005\"\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/heytap/health/sleep/snore/bean/SnoreWeekBean;", "", "()V", "isEmpty", "", "()Z", "setEmpty", "(Z)V", "isShowSleepApnea", "setShowSleepApnea", "sleepApneaDataList", "", "Lcom/heytap/health/core/widget/charts/data/SnoreLevelData;", "getSleepApneaDataList", "()Ljava/util/List;", "sleepApneaIsEmpty", "getSleepApneaIsEmpty", "setSleepApneaIsEmpty", "snoreLevelDataList", "getSnoreLevelDataList", "toString", "", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SnoreWeekBean {
    public static final int $stable = 8;
    private boolean isShowSleepApnea;

    @NotNull
    private final List<SnoreLevelData> snoreLevelDataList = new ArrayList();

    @NotNull
    private final List<SnoreLevelData> sleepApneaDataList = new ArrayList();
    private boolean isEmpty = true;
    private boolean sleepApneaIsEmpty = true;

    @NotNull
    public final List<SnoreLevelData> getSleepApneaDataList() {
        return this.sleepApneaDataList;
    }

    public final boolean getSleepApneaIsEmpty() {
        return this.sleepApneaIsEmpty;
    }

    @NotNull
    public final List<SnoreLevelData> getSnoreLevelDataList() {
        return this.snoreLevelDataList;
    }

    /* JADX INFO: renamed from: isEmpty, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    /* JADX INFO: renamed from: isShowSleepApnea, reason: from getter */
    public final boolean getIsShowSleepApnea() {
        return this.isShowSleepApnea;
    }

    public final void setEmpty(boolean z) {
        this.isEmpty = z;
    }

    public final void setShowSleepApnea(boolean z) {
        this.isShowSleepApnea = z;
    }

    public final void setSleepApneaIsEmpty(boolean z) {
        this.sleepApneaIsEmpty = z;
    }

    @NotNull
    public String toString() {
        return "SnoreWeekBean(isEmpty=" + this.isEmpty + ", snoreSize=" + this.snoreLevelDataList.size() + ", sleepApneaIsEmpty=" + this.sleepApneaIsEmpty + ", apneaSize=" + this.sleepApneaDataList.size() + "), isShowSleepApnea=" + this.isShowSleepApnea;
    }
}
