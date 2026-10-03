package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.device.proto.A5.parser.f;

/* JADX INFO: loaded from: classes5.dex */
public class ATHeartRateDetectSetting extends LSDeviceSyncSetting {
    public static final int HR_DETECT_MODE_OF_M2 = 109;
    public static final int HR_DETECT_MODE_OF_M5 = 118;
    private boolean enable;
    private String endTime;
    private String startTime;

    private ATHeartRateDetectSetting() {
    }

    public ATHeartRateDetectSetting(boolean z) {
        this.enable = z;
        this.cmd = 118;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (getCmd() == 118) {
            return new byte[]{(byte) getCmd(), this.enable ? (byte) 1 : (byte) 0};
        }
        byte[] bArr = new byte[6];
        bArr[0] = (byte) getCmd();
        if (this.enable) {
            bArr[1] = 1;
            bArr[2] = 0;
            bArr[3] = 0;
            bArr[4] = 0;
            bArr[5] = 0;
        } else {
            bArr[1] = 0;
            bArr[2] = (byte) f.a(this.startTime);
            bArr[3] = (byte) f.b(this.startTime);
            bArr[4] = (byte) f.a(this.endTime);
            bArr[5] = (byte) f.b(this.endTime);
        }
        return bArr;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return this.cmd;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public boolean isEnable() {
        return this.enable;
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
}
