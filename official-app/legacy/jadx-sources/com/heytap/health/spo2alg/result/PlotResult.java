package com.heytap.health.spo2alg.result;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class PlotResult {
    public Spo2MinPlot spo2MinPlot;
    public int totalSpo2Max;
    public int totalSpo2Mean;
    public int totalSpo2Min;

    public String toString() {
        return "PlotResult{spo2MinPlot=" + this.spo2MinPlot + ", totalSpo2Mean=" + this.totalSpo2Mean + ", totalSpo2Max=" + this.totalSpo2Max + ", totalSpo2Min=" + this.totalSpo2Min + '}';
    }
}
