package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public class ATControlStatus {
    public static final int DISCONNECT = 1;
    public static final int RESET_AUTH = 0;
    private int workStaus;

    public ATControlStatus(int i) {
        this.workStaus = i;
    }

    public int getWorkStaus() {
        return this.workStaus;
    }
}
