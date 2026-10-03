package com.heytap.health;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes15.dex */
@Keep
public class EcgResult {
    public int hr;
    public int hr_flag;
    public int signal_quality;

    public EcgResult() {
    }

    public EcgResult(int i, int i2, int i3) {
        this.hr = i;
        this.hr_flag = i2;
        this.signal_quality = i3;
    }

    public String toString() {
        return "EcgResult{hr: " + this.hr + ",hr_flag: " + this.hr_flag + ",signal_quality:" + this.signal_quality + "}";
    }
}
