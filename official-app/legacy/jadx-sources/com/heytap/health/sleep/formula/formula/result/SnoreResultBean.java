package com.heytap.health.sleep.formula.formula.result;

import androidx.annotation.Keep;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SnoreResultBean {
    public SnoreDbBuff[] snoreDbBuff;
    public int snoreDbBuffLen;
    public int snoreSumNum;
    public int snoreSumTimeMs;
    public float snoreTotalMaxDb;
    public float snoreTotalMeanDb;

    public String toString() {
        return "SnoreResultBean{snoreDbBuffLen=" + this.snoreDbBuffLen + ", snoreMeanDb=" + this.snoreTotalMeanDb + ", snoreMaxDb=" + this.snoreTotalMaxDb + ", snoreSumTimeMs=" + this.snoreSumTimeMs + ", snoreSumNum=" + this.snoreSumNum + "snoreDbBuff=" + Arrays.toString(this.snoreDbBuff) + '}';
    }
}
