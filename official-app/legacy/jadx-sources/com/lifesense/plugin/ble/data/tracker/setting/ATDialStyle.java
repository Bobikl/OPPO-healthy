package com.lifesense.plugin.ble.data.tracker.setting;

/* JADX INFO: loaded from: classes5.dex */
public enum ATDialStyle {
    DialPeace1(1),
    DialPeace2(2),
    DialPeace3(3),
    DialPeace4(4),
    DialPeace5(5),
    DialPeace6(6),
    DialPeace7(7),
    DialPeace8(8),
    DialPeace9(9),
    DialPeace10(10),
    DialPeace11(11),
    DialPeace12(12);

    private int command;

    ATDialStyle(int i) {
        this.command = i;
    }

    public int getCommand() {
        return this.command;
    }
}
