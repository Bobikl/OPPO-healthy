package com.heytap.health.core.widget.charts.data;

import android.text.format.DateFormat;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/core/widget/charts/data/RecordTimeStampedData;", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", "x", "", "y", "timestamp", "", "(FFJ)V", "getX", "()F", "setX", "(F)V", "toString", "", "lib_chart_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RecordTimeStampedData extends TimeStampedData {
    private float x;

    public RecordTimeStampedData(float f, float f2, long j2) {
        super(j2, f2);
        this.x = f;
    }

    public final float getX() {
        return this.x;
    }

    public final void setX(float f) {
        this.x = f;
    }

    @Override // com.heytap.health.core.widget.charts.data.TimeStampedData
    @NotNull
    public String toString() {
        long j2 = this.timestamp;
        CharSequence charSequence = DateFormat.format("yyyy/MM/dd:HH:mm:ss", j2);
        return "TimeStampedData{timestamp=" + j2 + "/" + ((Object) charSequence) + ", x=" + this.x + ", y=" + getY() + ", color=" + getColor() + ", gradientColor=" + getGradientColor() + ", heartRateType=" + getHeartRateType() + "}";
    }
}
