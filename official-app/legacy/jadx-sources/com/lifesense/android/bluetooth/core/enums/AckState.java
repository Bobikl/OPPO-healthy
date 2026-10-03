package com.lifesense.android.bluetooth.core.enums;

/* JADX INFO: loaded from: classes4.dex */
public enum AckState {
    SUCCESS(1),
    FAIL(2);

    public int command;

    AckState(int i) {
        this.command = i;
    }

    public int getCommand() {
        return this.command;
    }
}
