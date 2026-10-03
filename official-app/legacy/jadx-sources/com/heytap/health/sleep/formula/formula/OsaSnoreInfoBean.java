package com.heytap.health.sleep.formula.formula;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class OsaSnoreInfoBean {
    public float[] features = new float[7];
    public int snoreEndTimeMs;
    public int snoreStartTimeMs;

    public String toString() {
        return "OsaSnoreInfoBean{snoreStartTimeMs=" + this.snoreStartTimeMs + ", snoreEndTimeMs=" + this.snoreEndTimeMs + '}';
    }
}
