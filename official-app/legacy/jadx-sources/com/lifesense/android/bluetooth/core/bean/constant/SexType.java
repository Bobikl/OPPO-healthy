package com.lifesense.android.bluetooth.core.bean.constant;

/* JADX INFO: loaded from: classes4.dex */
public enum SexType {
    MALE(0),
    FEMALE(1);

    public int command;

    SexType(int i) {
        this.command = i;
    }

    public int getCommand() {
        return this.command;
    }

    public int getDeepSexType(boolean z) {
        if (this == MALE) {
            return z ? 3 : 1;
        }
        if (this == FEMALE) {
            return z ? 4 : 2;
        }
        return 1;
    }
}
