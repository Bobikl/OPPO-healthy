package com.lifesense.plugin.ble.data.other;

import com.oplus.aiunit.vision.apj;

/* JADX INFO: loaded from: classes5.dex */
public enum ConnectionStableStatus {
    UNKNOWN(0),
    CONNECTION_STABLE(208),
    CONNECTION_UNSTABLE_1(209),
    CONNECTION_UNSTABLE_2(210);

    private int statusValue;

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
