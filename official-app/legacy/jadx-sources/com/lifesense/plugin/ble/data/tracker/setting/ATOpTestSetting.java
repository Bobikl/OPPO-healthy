package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;

/* JADX INFO: loaded from: classes5.dex */
public class ATOpTestSetting extends LSDeviceSyncSetting {
    private String cmdStr;

    public ATOpTestSetting(String str) {
        this.cmdStr = str;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        String str = this.cmdStr;
        return str == null ? new byte[]{0, 0} : a.b(str);
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 255;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATOpTestSetting{cmdStr='" + this.cmdStr + "'}";
    }
}
