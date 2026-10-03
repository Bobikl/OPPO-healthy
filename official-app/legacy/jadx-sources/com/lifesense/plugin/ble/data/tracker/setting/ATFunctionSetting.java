package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;

/* JADX INFO: loaded from: classes5.dex */
public class ATFunctionSetting extends LSDeviceSyncSetting {
    private boolean enable;
    private ATFunctionType type;

    private ATFunctionSetting() {
    }

    public ATFunctionSetting(boolean z, ATFunctionType aTFunctionType) {
        this.type = aTFunctionType;
        this.enable = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        byte[] bArr = new byte[10];
        bArr[0] = (byte) getCmd();
        byte[] bArrB = a.b((short) getType().command);
        System.arraycopy(bArrB, 0, bArr, 1, bArrB.length);
        int length = 1 + bArrB.length;
        byte[] bArr2 = new byte[7];
        if (getType() == ATFunctionType.ScreenPowerOn) {
            bArr2[6] = (byte) (bArr2[6] | (isEnable() ? (byte) 2 : (byte) 0));
        }
        if (getType() == ATFunctionType.ManualExerciseMode) {
            bArr2[6] = (byte) (bArr2[6] | (isEnable() ? (byte) 4 : (byte) 0));
        }
        if (getType() == ATFunctionType.LowBatteryReminder) {
            bArr2[6] = (byte) (bArr2[6] | (isEnable() ? (byte) 8 : (byte) 0));
        }
        if (getType() == ATFunctionType.HeartbeatDataCollect) {
            bArr2[6] = bArr2[6] | (isEnable() ? 1 : 0) ? (byte) 1 : (byte) 0;
        }
        if (getType() == ATFunctionType.scrollDisplay) {
            bArr2[6] = (byte) ((isEnable() ? (byte) 16 : (byte) 0) | bArr2[6]);
        }
        System.arraycopy(bArr2, 0, bArr, length, 7);
        return bArr;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 173;
        return 173;
    }

    public ATFunctionType getType() {
        return this.type;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setType(ATFunctionType aTFunctionType) {
        this.type = aTFunctionType;
    }
}
