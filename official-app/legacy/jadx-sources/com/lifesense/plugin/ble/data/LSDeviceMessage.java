package com.lifesense.plugin.ble.data;

/* JADX INFO: loaded from: classes5.dex */
public abstract class LSDeviceMessage {
    protected LSAppCategory msgCategory;

    public LSDeviceMessage(LSAppCategory lSAppCategory) {
        this.msgCategory = lSAppCategory;
    }

    public LSAppCategory getMsgCategory() {
        return this.msgCategory;
    }

    public void setMsgCategory(LSAppCategory lSAppCategory) {
        this.msgCategory = lSAppCategory;
    }

    public String toString() {
        return "LSDeviceMessage{msgCategory=" + this.msgCategory + '}';
    }
}
