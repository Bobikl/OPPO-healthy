package com.lifesense.plugin.ble.data.tracker;

/* JADX INFO: loaded from: classes5.dex */
public enum ATPairConfirmState {
    Success(1),
    Failure(2),
    Unregistered(3),
    Illegal(4),
    Other(255);

    private int command;

    ATPairConfirmState(int i) {
        this.command = i;
    }

    public int getCommand() {
        return this.command;
    }
}
