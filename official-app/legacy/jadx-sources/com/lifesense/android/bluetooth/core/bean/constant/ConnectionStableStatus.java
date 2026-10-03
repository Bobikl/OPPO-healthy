package com.lifesense.android.bluetooth.core.bean.constant;

import com.oplus.aiunit.vision.apj;

/* JADX INFO: loaded from: classes4.dex */
public enum ConnectionStableStatus {
    UNKNOWN(0),
    CONNECTION_STABLE(208),
    CONNECTION_UNSTABLE_1(209),
    CONNECTION_UNSTABLE_2(210);

    public int statusValue;

    ConnectionStableStatus(int i) {
        this.statusValue = i;
    }

    public String getStatusStringValue() {
        int i = this.statusValue;
        return i == 0 ? apj.Thread_Type_ScheduledExecutor_Single : Integer.toHexString(i).toUpperCase().replace("D", "S");
    }

    public int getStatusValue() {
        return this.statusValue;
    }
}
