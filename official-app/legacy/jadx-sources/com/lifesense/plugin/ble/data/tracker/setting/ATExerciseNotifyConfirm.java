package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.ATExerciseNotify;

/* JADX INFO: loaded from: classes5.dex */
public class ATExerciseNotifyConfirm extends LSDeviceSyncSetting {
    private ATGpsStatus gpsStatus;
    private ATExerciseNotify notify;

    private ATExerciseNotifyConfirm() {
    }

    public ATExerciseNotifyConfirm(ATExerciseNotify aTExerciseNotify, ATGpsStatus aTGpsStatus) {
        this.notify = aTExerciseNotify;
        this.gpsStatus = aTGpsStatus;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (this.notify == null) {
            return null;
        }
        byte[] bArr = new byte[10];
        bArr[0] = (byte) getCmd();
        bArr[1] = (byte) this.notify.getFlag();
        if (this.notify.getFlag() != 1) {
            bArr[2] = 1;
            for (int i = 0; i < 7; i++) {
                bArr[i + 3] = 0;
            }
            return bArr;
        }
        ATGpsStatus aTGpsStatus = this.gpsStatus;
        if (aTGpsStatus == null) {
            bArr[2] = (byte) ATGpsStatus.Unavailable.getGpsStatus();
        } else {
            bArr[2] = (byte) aTGpsStatus.getGpsStatus();
        }
        for (int i2 = 0; i2 < 7; i2++) {
            bArr[i2 + 3] = 0;
        }
        return bArr;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 225;
    }

    public ATGpsStatus getGpsStatus() {
        return this.gpsStatus;
    }

    public ATExerciseNotify getNotify() {
        return this.notify;
    }

    public void setGpsStatus(ATGpsStatus aTGpsStatus) {
        this.gpsStatus = aTGpsStatus;
    }

    public void setNotify(ATExerciseNotify aTExerciseNotify) {
        this.notify = aTExerciseNotify;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATExerciseNotifyConfirm{notify=" + this.notify + ", gpsStatus=" + this.gpsStatus + '}';
    }
}
