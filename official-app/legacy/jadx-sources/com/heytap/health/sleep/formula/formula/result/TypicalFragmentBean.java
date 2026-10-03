package com.heytap.health.sleep.formula.formula.result;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class TypicalFragmentBean {
    public int mode;
    public long snoreBeginUnix;
    public long snoreEndUnix;
    public float snoreTypicalFragMaxDb;
    public float snoreTypicalFragMinDb;
    public int snoreTypicalFragNum;
    public int source;
    public int spo2BeginTime;
    public int spo2EndTime;
    public int weighted;

    public String toString() {
        return "TypicalFragmentBean{snoreBeginUnix=" + this.snoreBeginUnix + ", snoreEndUnix=" + this.snoreEndUnix + ", spo2BeginTime=" + this.spo2BeginTime + ", spo2EndTime=" + this.spo2EndTime + ", mode=" + this.mode + ", snoreNum=" + this.snoreTypicalFragNum + ", snoreMaxDb=" + this.snoreTypicalFragMaxDb + ", snoreMinDb=" + this.snoreTypicalFragMinDb + ", weighted=" + this.weighted + ", source=" + this.source + '}';
    }
}
