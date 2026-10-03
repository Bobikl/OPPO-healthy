package com.lifesense.plugin.ble.data;

/* JADX INFO: loaded from: classes5.dex */
public enum LSUpgradeState {
    Unknown(0),
    Search(1),
    SearchOfUpgradeMode(2),
    VerifyFailure(3),
    Upgrading(4),
    UpgradeSuccess(5),
    UpgradeFailure(6),
    ConnectOfUpgradeMode(7),
    EnterUpgradeMode(8),
    Connect(9);

    private int value;

    LSUpgradeState(int i) {
        this.value = i;
    }

    public static LSUpgradeState getUpgradeState(int i) {
        for (LSUpgradeState lSUpgradeState : values()) {
            if (lSUpgradeState.getValue() == i) {
                return lSUpgradeState;
            }
        }
        return Unknown;
    }

    public int getValue() {
        return this.value;
    }
}
