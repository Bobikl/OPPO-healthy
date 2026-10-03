package com.heytap.health.sleep.formula.formula.result;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes18.dex */
@Keep
public class OsaResultBean {
    public int invalidSpo2Ratio;
    public byte noPersonInBedFlag;
    public float osaAhi;
    public float[] osaFeature;
    public byte osaFeatureLen;
    public byte osaLevel;
    public SnoreResultBean snoreResult;
    public float totalSilencedRatio;
    public int totalSilencedTime;
    public TypicalFragmentBean[] typicalFragmentBeans;
    public byte typicalFragmentNum;

    public String toString() {
        return "OsaResultBean{osaLevel=" + ((int) this.osaLevel) + ", featLen=" + ((int) this.osaFeatureLen) + ", feat=" + this.osaFeature.toString() + ", fragNum=" + ((int) this.typicalFragmentNum) + ", invalidSpo2Ratio=" + this.invalidSpo2Ratio + ", noPersonInBedFlag=" + ((int) this.noPersonInBedFlag) + '}';
    }
}
