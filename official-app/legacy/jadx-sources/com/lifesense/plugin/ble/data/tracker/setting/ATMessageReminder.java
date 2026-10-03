package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATMessageReminder extends LSDeviceSyncSetting {
    private boolean enable;
    private ATMessageRemindType msgType;
    private int vibrationDelay;
    private ATVibrationMode vibrationMode;
    private int vibrationStrength1;
    private int vibrationStrength2;
    private int vibrationTime;

    public ATMessageReminder(ATMessageRemindType aTMessageRemindType, boolean z) {
        this.msgType = aTMessageRemindType;
        this.enable = z;
        this.vibrationDelay = 3;
        this.vibrationStrength1 = 6;
        this.vibrationStrength2 = 9;
        this.vibrationTime = 8;
        this.vibrationMode = ATVibrationMode.Intermittent2;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (this.msgType == null) {
            return null;
        }
        return this.enable ? new byte[]{(byte) getCmd(), (byte) this.msgType.getValue(), 1, (byte) this.vibrationDelay, (byte) this.vibrationMode.getValue(), (byte) this.vibrationTime, (byte) this.vibrationStrength1, (byte) this.vibrationStrength2} : new byte[]{(byte) getCmd(), (byte) this.msgType.getValue(), 0};
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 106;
        return 106;
    }

    public ATMessageRemindType getMsgType() {
        return this.msgType;
    }

    public int getVibrationDelay() {
        return this.vibrationDelay;
    }

    public ATVibrationMode getVibrationMode() {
        return this.vibrationMode;
    }

    public int getVibrationStrength1() {
        return this.vibrationStrength1;
    }

    public int getVibrationStrength2() {
        return this.vibrationStrength2;
    }

    public int getVibrationTime() {
        return this.vibrationTime;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setMsgType(ATMessageRemindType aTMessageRemindType) {
        this.msgType = aTMessageRemindType;
    }

    public void setVibrationDelay(int i) {
        this.vibrationDelay = i;
    }

    public void setVibrationMode(ATVibrationMode aTVibrationMode) {
        this.vibrationMode = aTVibrationMode;
    }

    public void setVibrationStrength1(int i) {
        this.vibrationStrength1 = i;
    }

    public void setVibrationStrength2(int i) {
        this.vibrationStrength2 = i;
    }

    public void setVibrationTime(int i) {
        this.vibrationTime = i;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATMessageReminder{msgType=" + this.msgType + ", enable=" + this.enable + ", vibrationDelay=" + this.vibrationDelay + ", vibrationMode=" + this.vibrationMode + ", vibrationTime=" + this.vibrationTime + ", vibrationStrength1=" + this.vibrationStrength1 + ", vibrationStrength2=" + this.vibrationStrength2 + '}';
    }

    public ATMessageReminder(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            boolean z = true;
            if (a.a(byteBufferOrder.get()) != 1) {
                z = false;
            }
            this.enable = z;
            this.vibrationDelay = a.a(byteBufferOrder.get());
            this.vibrationMode = ATVibrationMode.getVibrationMode(a.a(byteBufferOrder.get()));
            this.vibrationTime = a.a(byteBufferOrder.get());
            this.vibrationStrength1 = a.a(byteBufferOrder.get());
            this.vibrationStrength2 = a.a(byteBufferOrder.get());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
