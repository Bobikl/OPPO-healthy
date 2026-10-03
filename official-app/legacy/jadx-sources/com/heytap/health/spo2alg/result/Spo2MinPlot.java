package com.heytap.health.spo2alg.result;

import androidx.annotation.Keep;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class Spo2MinPlot {
    public byte[] spo21MinBuff;
    public int spo21MinBuffLen;
    public long spo2PlotStartUnix;

    public String toString() {
        return "Spo2MinPlot{spo2PlotStartUnix=" + this.spo2PlotStartUnix + ", spo21MinBuffLen=" + this.spo21MinBuffLen + ", spo21MinBuff=" + Arrays.toString(this.spo21MinBuff) + '}';
    }
}
