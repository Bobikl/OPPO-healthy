package com.lifesense.plugin.ble.data;

/* JADX INFO: loaded from: classes5.dex */
public class LSDevicePairSetting {
    private Object obj;
    private LSPairCommand pairCmd;

    public Object getObj() {
        return this.obj;
    }

    public LSPairCommand getPairCmd() {
        return this.pairCmd;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public void setPairCmd(LSPairCommand lSPairCommand) {
        this.pairCmd = lSPairCommand;
    }

    public String toString() {
        return "LSDevicePairSetting{pairCmd=" + this.pairCmd + ", obj=" + this.obj + '}';
    }
}
