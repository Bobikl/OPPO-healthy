package com.lifesense.plugin.ble.data.tracker.setting;

import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.config.ATNightMode;
import com.lifesense.plugin.ble.device.proto.A5.parser.f;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class ATNightModeSetting extends LSDeviceSyncSetting {
    private boolean autoState;
    private boolean enable;
    private String endTime;
    private String startTime;

    private ATNightModeSetting() {
        this.cmd = 119;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (getCmd() != 119) {
            ATNightMode aTNightMode = new ATNightMode(this.autoState, this.startTime, this.endTime);
            aTNightMode.setEnable(this.enable);
            ArrayList arrayList = new ArrayList();
            arrayList.add(aTNightMode);
            return new ATConfigItemSetting(arrayList).encodeCmdBytes();
        }
        byte[] bArr = new byte[6];
        byte cmd = (byte) getCmd();
        byte b = this.enable ? (byte) 1 : (byte) 0;
        byte[] bArr2 = {(byte) f.a(this.startTime), (byte) f.b(this.startTime)};
        byte[] bArr3 = {(byte) f.a(this.endTime), (byte) f.b(this.endTime)};
        bArr[0] = cmd;
        bArr[1] = b;
        System.arraycopy(bArr2, 0, bArr, 2, 2);
        System.arraycopy(bArr3, 0, bArr, 4, 2);
        return bArr;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        String str = this.deviceModel;
        int i = (str == null || !str.contains("437")) ? 119 : Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER;
        this.cmd = i;
        return i;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public boolean isAutoState() {
        return this.autoState;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setAutoState(boolean z) {
        this.autoState = z;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATNightModeSetting{enable=" + this.enable + ", autoState=" + this.autoState + ", startTime='" + this.startTime + "', endTime='" + this.endTime + "', cmd=" + this.cmd + '}';
    }

    public ATNightModeSetting(boolean z, String str, String str2) {
        this.autoState = z;
        this.startTime = str;
        this.endTime = str2;
        this.cmd = 119;
    }
}
