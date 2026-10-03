package com.heytap.health.core.widget.charts.formatter;

/* JADX INFO: loaded from: classes16.dex */
public enum TimeXAxisValueFormatter$Style {
    MINUTE,
    HOUR,
    DAY,
    MONTH;

    public long getTimeUnit() {
        return 60000L;
    }
}
