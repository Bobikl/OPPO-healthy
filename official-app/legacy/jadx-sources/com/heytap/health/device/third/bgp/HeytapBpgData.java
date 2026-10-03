package com.heytap.health.device.third.bgp;

import com.omron.lib.model.BPData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public class HeytapBpgData extends BPData implements Serializable {
    public HeytapBpgData(BPData bPData) {
        setSystolic(bPData.getSystolic());
        setDiastolic(bPData.getDiastolic());
        setPulse(bPData.getPulse());
        setArrhythmiaFlg(bPData.getArrhythmiaFlg());
        setBmFlg(bPData.getBmFlg());
        setCwsFlg(bPData.getCwsFlg());
        setMeasureUser(bPData.getMeasureUser());
        setMeasureTime(bPData.getMeasureTime());
    }
}
