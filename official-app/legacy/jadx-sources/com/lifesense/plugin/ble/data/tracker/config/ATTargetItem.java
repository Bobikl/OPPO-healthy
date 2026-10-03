package com.lifesense.plugin.ble.data.tracker.config;

import com.lifesense.plugin.ble.data.tracker.setting.ATEncourageType;

/* JADX INFO: loaded from: classes5.dex */
public class ATTargetItem {
    private ATEncourageType type;
    private int value;

    public ATTargetItem(ATEncourageType aTEncourageType, int i) {
        this.type = aTEncourageType;
        this.value = i;
    }

    public ATEncourageType getType() {
        return this.type;
    }

    public int getValue() {
        return this.value;
    }

    public void setType(ATEncourageType aTEncourageType) {
        this.type = aTEncourageType;
    }

    public void setValue(int i) {
        this.value = i;
    }

    public String toString() {
        return "ATTargetItem{type=" + this.type + ", value=" + this.value + '}';
    }
}
