package com.nearme.instant.xcard.statitics;

/* JADX INFO: loaded from: classes5.dex */
public class StatConfig {
    private StatisticCallback statisticCaller;

    public StatConfig(StatisticCallback statisticCallback) {
        this.statisticCaller = statisticCallback;
    }

    public StatisticCallback getStatisticCaller() {
        return this.statisticCaller;
    }

    public void setStatisticCaller(StatisticCallback statisticCallback) {
        this.statisticCaller = statisticCallback;
    }
}
