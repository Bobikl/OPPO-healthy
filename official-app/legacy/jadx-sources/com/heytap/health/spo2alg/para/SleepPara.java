package com.heytap.health.spo2alg.para;

import androidx.annotation.Keep;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SleepPara {
    public short[] sleep1MinBuff;
    public int sleepDataLen;
    public long sleepStartUnix;

    public String toString() {
        return "SleepPara{sleepStartUnix=" + this.sleepStartUnix + ", sleepDataLen=" + this.sleepDataLen + ", sleep1minBuff=" + Arrays.toString(this.sleep1MinBuff) + '}';
    }
}
