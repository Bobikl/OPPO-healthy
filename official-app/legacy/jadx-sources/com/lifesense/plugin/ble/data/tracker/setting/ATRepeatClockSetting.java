package com.lifesense.plugin.ble.data.tracker.setting;

import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.device.proto.A5.parser.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATRepeatClockSetting extends LSDeviceSyncSetting {
    private boolean enable;
    private String endTime;
    private int remindCycle;
    private ATEventReminderType reminderType;
    private String startTime;
    private ATVibrationMode vibrationMode;
    private int vibrationStrength1;
    private int vibrationStrength2;
    private int vibrationTime;

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder.put((byte) getCmd());
            byteBufferOrder.put((byte) this.reminderType.getValue());
            byteBufferOrder.put((byte) (this.enable ? 1 : 0));
            byteBufferOrder.put((byte) f.a(this.startTime));
            byteBufferOrder.put((byte) f.b(this.startTime));
            byteBufferOrder.put((byte) f.a(this.endTime));
            byteBufferOrder.put((byte) f.b(this.endTime));
            byteBufferOrder.putShort((short) this.remindCycle);
            ATVibrationMode aTVibrationMode = this.vibrationMode;
            if (aTVibrationMode != null) {
                byteBufferOrder.put((byte) aTVibrationMode.getValue());
            } else {
                byteBufferOrder.put((byte) 0);
            }
            int i = this.vibrationTime;
            if (i > 60) {
                i = 60;
            }
            byteBufferOrder.put((byte) i);
            byteBufferOrder.put((byte) this.vibrationStrength1);
            byteBufferOrder.put((byte) this.vibrationStrength2);
            return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = Proto$SyncEventMessage.OUTFIT_WF_VERSION_FIELD_NUMBER;
        return Proto$SyncEventMessage.OUTFIT_WF_VERSION_FIELD_NUMBER;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public int getRemindCycle() {
        return this.remindCycle;
    }

    public ATEventReminderType getReminderType() {
        return this.reminderType;
    }

    public String getStartTime() {
        return this.startTime;
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

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setRemindCycle(int i) {
        this.remindCycle = i;
    }

    public void setReminderType(ATEventReminderType aTEventReminderType) {
        this.reminderType = aTEventReminderType;
    }

    public void setStartTime(String str) {
        this.startTime = str;
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
        return "ATRepeatClockSetting{reminderType=" + this.reminderType + ", enable=" + this.enable + ", startTime='" + this.startTime + "', endTime='" + this.endTime + "', remindCycle=" + this.remindCycle + ", vibrationMode=" + this.vibrationMode + ", vibrationTime=" + this.vibrationTime + ", vibrationStrength1=" + this.vibrationStrength1 + ", vibrationStrength2=" + this.vibrationStrength2 + '}';
    }
}
