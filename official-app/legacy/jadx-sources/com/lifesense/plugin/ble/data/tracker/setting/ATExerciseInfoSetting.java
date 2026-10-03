package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;

/* JADX INFO: loaded from: classes5.dex */
public class ATExerciseInfoSetting extends LSDeviceSyncSetting {
    private int distance;
    private short speed;

    private ATExerciseInfoSetting() {
    }

    public ATExerciseInfoSetting(short s, int i) {
        this.speed = s;
        this.distance = i;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        byte[] bArr = new byte[9];
        bArr[0] = (byte) getCmd();
        System.arraycopy(new byte[2], 0, bArr, 1, 2);
        byte[] bArrB = a.b(getSpeed());
        System.arraycopy(bArrB, 0, bArr, 3, bArrB.length);
        int length = 3 + bArrB.length;
        byte[] bArrA = a.a(getDistance());
        System.arraycopy(bArrA, 0, bArr, length, bArrA.length);
        return bArr;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 171;
        return 171;
    }

    public int getDistance() {
        return this.distance;
    }

    public short getSpeed() {
        return this.speed;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public void setSpeed(short s) {
        this.speed = s;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATExerciseInfoSetting{speed=" + ((int) this.speed) + ", distance=" + this.distance + '}';
    }
}
