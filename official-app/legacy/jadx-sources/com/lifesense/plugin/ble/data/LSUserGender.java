package com.lifesense.plugin.ble.data;

/* JADX INFO: loaded from: classes5.dex */
public enum LSUserGender {
    Male(0),
    Female(1);

    private int command;

    LSUserGender(int i) {
        this.command = i;
    }

    public int getCommand() {
        return this.command;
    }
}
