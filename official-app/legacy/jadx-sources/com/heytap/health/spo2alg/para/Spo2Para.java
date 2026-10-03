package com.heytap.health.spo2alg.para;

import androidx.annotation.Keep;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class Spo2Para {
    public short[] spo21SBuff;
    public int spo2BuffLen;
    public long spo2StartUnix;

    public String toString() {
        return "Spo2{spo2StartUnix=" + this.spo2StartUnix + ", spo2BuffLen=" + this.spo2BuffLen + ", spo21sBuff=" + Arrays.toString(this.spo21SBuff) + '}';
    }
}
