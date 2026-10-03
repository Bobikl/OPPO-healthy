package com.heytap.health.vo2.para;

import androidx.annotation.Keep;
import java.util.Arrays;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class Input {
    public float[] altitudeList;
    public float[] hrList;
    public int listLen;
    public float[] speedList;
    public float[] tsList;
    public float[] vo2List;

    public String toString() {
        return "Input{tsList=" + Arrays.toString(this.tsList) + ", hrList=" + Arrays.toString(this.hrList) + ", speedList=" + Arrays.toString(this.speedList) + ", altitudeList=" + Arrays.toString(this.altitudeList) + ", vo2List=" + Arrays.toString(this.vo2List) + ", listLen=" + this.listLen + '}';
    }
}
