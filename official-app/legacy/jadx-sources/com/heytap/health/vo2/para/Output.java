package com.heytap.health.vo2.para;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class Output {
    public float aerobicTE;
    public String checksumStr;
    public int dataCheck;
    public int recoveryTime;
    public float vo2max;

    public String toString() {
        return "Output{vo2max=" + this.vo2max + ", checksum=" + this.checksumStr + ", TE=" + this.aerobicTE + ", RT=" + this.recoveryTime + ", check=" + this.dataCheck + "}";
    }
}
