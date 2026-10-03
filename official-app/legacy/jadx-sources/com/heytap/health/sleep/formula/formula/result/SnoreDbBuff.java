package com.heytap.health.sleep.formula.formula.result;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class SnoreDbBuff {
    public long snoreDbStartUnix;
    public float snoreMaxDb;
    public float snoreMeanDb;
    public float snoreMinDb;
    public byte snoreNum;

    public String toString() {
        return "SnoreDbBuff{, snoreDbStartUnix=" + this.snoreDbStartUnix + ", snoreMaxDb=" + this.snoreMaxDb + ", snoreMinDb=" + this.snoreMinDb + ", snoreMeanDb=" + this.snoreMeanDb + ", snoreNum=" + ((int) this.snoreNum) + '}';
    }
}
