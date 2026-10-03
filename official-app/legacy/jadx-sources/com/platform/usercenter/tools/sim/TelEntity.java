package com.platform.usercenter.tools.sim;

import com.platform.usercenter.basic.annotation.Keep;

/* JADX INFO: loaded from: classes9.dex */
@Keep
public class TelEntity {
    public String iccid;
    public String imsi;
    public String phoneNum;
    public int slotIndex;
    public Object subId;
    public Class subIdType;

    public TelEntity(int i) {
        this.slotIndex = i;
    }

    public String toString() {
        return "TelEntity{slotIndex=" + this.slotIndex + ", subId=" + this.subId + ", subIdType=" + this.subIdType + ", iccid='" + this.iccid + "', imsi='" + this.imsi + "', phoneNum='" + this.phoneNum + "'}";
    }
}
