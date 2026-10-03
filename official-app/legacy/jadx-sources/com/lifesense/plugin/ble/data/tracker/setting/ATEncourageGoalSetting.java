package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATEncourageGoalSetting extends LSDeviceSyncSetting {
    public static final int ENCOURAGE_GOAL_OF_M2 = 112;
    public static final int ENCOURAGE_GOAL_OF_M5 = 165;
    private boolean enable;
    private ATEncourageType targetType;
    private float targetValue;

    private ATEncourageGoalSetting() {
    }

    public ATEncourageGoalSetting(ATEncourageType aTEncourageType, boolean z, float f) {
        this.targetType = aTEncourageType;
        this.enable = z;
        this.targetValue = f;
        this.cmd = 165;
    }

    private byte[] formatWatchTargetSetting() {
        int cmd = getCmd();
        if (!this.enable) {
            return new byte[]{(byte) cmd, 0};
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.asIntBuffer().put((int) this.targetValue);
        byte[] bArrArray = byteBufferAllocate.array();
        return new byte[]{(byte) cmd, 1, bArrArray[0], bArrArray[1], bArrArray[2], bArrArray[3]};
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (getCmd() != 165) {
            return formatWatchTargetSetting();
        }
        byte[] bArr = {(byte) getCmd(), isEnable() ? (byte) 1 : (byte) 0, (byte) getTargetType().getValue(), 0, 0, 0, 0};
        byte[] bArrA = a.a((int) ((this.targetType == ATEncourageType.Step || getTargetType() == ATEncourageType.Distance) ? getTargetValue() : getTargetValue() * 10.0f));
        System.arraycopy(bArrA, 0, bArr, 3, bArrA.length);
        return bArr;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return this.cmd;
    }

    public ATEncourageType getTargetType() {
        return this.targetType;
    }

    public float getTargetValue() {
        return this.targetValue;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setTargetType(ATEncourageType aTEncourageType) {
        this.targetType = aTEncourageType;
    }

    public void setTargetValue(float f) {
        this.targetValue = f;
    }
}
