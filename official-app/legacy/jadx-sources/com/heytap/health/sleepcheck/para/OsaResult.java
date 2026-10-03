package com.heytap.health.sleepcheck.para;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class OsaResult {
    public int continueSpo2;
    public int osaLevel;
    public int snore;
    public int stepSpo2 = -1;

    public String toString() {
        return "OsaResult{osaLevel=" + this.osaLevel + ", continueSpo2=" + this.continueSpo2 + ", snore=" + this.snore + ", stepSpo2=" + this.stepSpo2 + '}';
    }
}
