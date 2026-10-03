package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.c.a;

/* JADX INFO: loaded from: classes5.dex */
public class ATUndefinedData extends ATDeviceData {
    private String dataStr;

    public ATUndefinedData(byte[] bArr) {
        super(bArr);
    }

    public String getDataStr() {
        return this.dataStr;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        this.dataStr = a.d(bArr);
    }

    public void setDataStr(String str) {
        this.dataStr = str;
    }

    public String toString() {
        return "ATUndefinedData{dataStr='" + this.dataStr + "'}";
    }
}
