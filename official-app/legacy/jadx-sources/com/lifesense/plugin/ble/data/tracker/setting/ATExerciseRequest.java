package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.ATExerciseType;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATExerciseRequest extends LSDeviceSyncSetting {
    public static final int START = 0;
    public static final int STOP = 1;
    private boolean enable;
    private ATExerciseType exerciseType;

    private ATExerciseRequest() {
    }

    public ATExerciseRequest(ATExerciseType aTExerciseType, boolean z) {
        this.exerciseType = aTExerciseType;
        this.enable = z;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        byte[] bArr = new byte[10];
        bArr[0] = (byte) getCmd();
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        System.arraycopy(a.a(0, byteOrder), 0, bArr, 1, 4);
        ATExerciseType aTExerciseType = this.exerciseType;
        if (aTExerciseType != null) {
            bArr[5] = (byte) aTExerciseType.getValue();
        } else {
            bArr[5] = (byte) ATExerciseType.Unknown.getValue();
        }
        bArr[6] = (byte) (!this.enable ? 1 : 0);
        System.arraycopy(a.a(0, byteOrder), 0, bArr, 7, 3);
        return bArr;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 175;
        return 175;
    }

    public ATExerciseType getExerciseType() {
        return this.exerciseType;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setExerciseType(ATExerciseType aTExerciseType) {
        this.exerciseType = aTExerciseType;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATExerciseRequest{exerciseType=" + this.exerciseType + ", enable=" + this.enable + '}';
    }
}
