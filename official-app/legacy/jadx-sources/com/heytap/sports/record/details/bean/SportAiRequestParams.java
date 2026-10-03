package com.heytap.sports.record.details.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/heytap/sports/record/details/bean/SportAiRequestParams;", "", "currentJsonData", "Lcom/heytap/sports/record/details/bean/SportSummary;", "lastJsonData", "Lcom/heytap/sports/record/details/bean/LastData;", "historyJsonData", "Lcom/heytap/sports/record/details/bean/HistoryData;", "(Lcom/heytap/sports/record/details/bean/SportSummary;Lcom/heytap/sports/record/details/bean/LastData;Lcom/heytap/sports/record/details/bean/HistoryData;)V", "getCurrentJsonData", "()Lcom/heytap/sports/record/details/bean/SportSummary;", "getHistoryJsonData", "()Lcom/heytap/sports/record/details/bean/HistoryData;", "getLastJsonData", "()Lcom/heytap/sports/record/details/bean/LastData;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SportAiRequestParams {
    public static final int $stable = 8;

    @NotNull
    private final SportSummary currentJsonData;

    @NotNull
    private final HistoryData historyJsonData;

    @NotNull
    private final LastData lastJsonData;

    public SportAiRequestParams(@NotNull SportSummary currentJsonData, @NotNull LastData lastJsonData, @NotNull HistoryData historyJsonData) {
        Intrinsics.checkNotNullParameter(currentJsonData, "currentJsonData");
        Intrinsics.checkNotNullParameter(lastJsonData, "lastJsonData");
        Intrinsics.checkNotNullParameter(historyJsonData, "historyJsonData");
        this.currentJsonData = currentJsonData;
        this.lastJsonData = lastJsonData;
        this.historyJsonData = historyJsonData;
    }

    public static /* synthetic */ SportAiRequestParams copy$default(SportAiRequestParams sportAiRequestParams, SportSummary sportSummary, LastData lastData, HistoryData historyData, int i, Object obj) {
        if ((i & 1) != 0) {
            sportSummary = sportAiRequestParams.currentJsonData;
        }
        if ((i & 2) != 0) {
            lastData = sportAiRequestParams.lastJsonData;
        }
        if ((i & 4) != 0) {
            historyData = sportAiRequestParams.historyJsonData;
        }
        return sportAiRequestParams.copy(sportSummary, lastData, historyData);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SportSummary getCurrentJsonData() {
        return this.currentJsonData;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LastData getLastJsonData() {
        return this.lastJsonData;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final HistoryData getHistoryJsonData() {
        return this.historyJsonData;
    }

    @NotNull
    public final SportAiRequestParams copy(@NotNull SportSummary currentJsonData, @NotNull LastData lastJsonData, @NotNull HistoryData historyJsonData) {
        Intrinsics.checkNotNullParameter(currentJsonData, "currentJsonData");
        Intrinsics.checkNotNullParameter(lastJsonData, "lastJsonData");
        Intrinsics.checkNotNullParameter(historyJsonData, "historyJsonData");
        return new SportAiRequestParams(currentJsonData, lastJsonData, historyJsonData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportAiRequestParams)) {
            return false;
        }
        SportAiRequestParams sportAiRequestParams = (SportAiRequestParams) other;
        return Intrinsics.areEqual(this.currentJsonData, sportAiRequestParams.currentJsonData) && Intrinsics.areEqual(this.lastJsonData, sportAiRequestParams.lastJsonData) && Intrinsics.areEqual(this.historyJsonData, sportAiRequestParams.historyJsonData);
    }

    @NotNull
    public final SportSummary getCurrentJsonData() {
        return this.currentJsonData;
    }

    @NotNull
    public final HistoryData getHistoryJsonData() {
        return this.historyJsonData;
    }

    @NotNull
    public final LastData getLastJsonData() {
        return this.lastJsonData;
    }

    public int hashCode() {
        return (((this.currentJsonData.hashCode() * 31) + this.lastJsonData.hashCode()) * 31) + this.historyJsonData.hashCode();
    }

    @NotNull
    public String toString() {
        return "SportAiRequestParams(currentJsonData=" + this.currentJsonData + ", lastJsonData=" + this.lastJsonData + ", historyJsonData=" + this.historyJsonData + ")";
    }
}
