package com.lifesense.plugin.ble.data;

/* JADX INFO: loaded from: classes5.dex */
public enum LSPairCommand {
    Unknown(0),
    RandomCodeConfirm(1),
    DeviceIdRequest(2),
    PairConfirm(3),
    UnbindConfirm(4),
    PairRequest(5);

    private int value;

    LSPairCommand(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
