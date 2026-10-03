package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.device.proto.A5.parser.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATReminderItem {
    public static final int LEN_OF_ITEM = 19;
    private ATDisturbItem disturb;
    private boolean enable;
    private String endTime;
    private int index;
    private int remindCycle;
    private int remindMode;
    private String remindTime;
    private List repeatDay;
    private String startTime;
    private ATVibrationMode vibrationMode;
    private int vibrationStrength1;
    private int vibrationStrength2;
    private int vibrationTime;

    public ATDisturbItem getDisturb() {
        return this.disturb;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public int getIndex() {
        return this.index;
    }

    public int getRemindCycle() {
        return this.remindCycle;
    }

    public int getRemindMode() {
        return this.remindMode;
    }

    public String getRemindTime() {
        return this.remindTime;
    }

    public List getRepeatDay() {
        return this.repeatDay;
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

    public void setDisturb(ATDisturbItem aTDisturbItem) {
        this.disturb = aTDisturbItem;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setEndTime(String str) {
        this.endTime = str;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setRemindCycle(int i) {
        this.remindCycle = i;
    }

    public void setRemindMode(int i) {
        this.remindMode = i;
    }

    public void setRemindTime(String str) {
        this.remindTime = str;
    }

    public void setRepeatDay(List list) {
        this.repeatDay = list;
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

    public byte[] toBytes() {
        byte b;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(19).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) this.index);
        byteBufferOrder.put(this.enable ? (byte) 1 : (byte) 0);
        byteBufferOrder.put((byte) f.a(this.startTime));
        byteBufferOrder.put((byte) f.b(this.startTime));
        byteBufferOrder.put((byte) f.a(this.endTime));
        byteBufferOrder.put((byte) f.b(this.endTime));
        byteBufferOrder.put((byte) this.remindMode);
        if (this.remindMode == 1) {
            byteBufferOrder.putShort((short) this.remindCycle);
        } else {
            byteBufferOrder.put((byte) f.a(this.remindTime));
            byteBufferOrder.put((byte) f.b(this.remindTime));
        }
        byteBufferOrder.put(f.a(this.repeatDay));
        byteBufferOrder.put((byte) getVibrationMode().getValue());
        byteBufferOrder.put((byte) (getVibrationTime() <= 60 ? getVibrationTime() : 60));
        byteBufferOrder.put((byte) getVibrationStrength1());
        byteBufferOrder.put((byte) getVibrationStrength2());
        if (this.disturb == null) {
            b = 0;
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.put((byte) 0);
        } else {
            byteBufferOrder.put((byte) 1);
            byteBufferOrder.put((byte) f.a(this.disturb.getStartTime()));
            byteBufferOrder.put((byte) f.b(this.disturb.getStartTime()));
            byteBufferOrder.put((byte) f.a(this.disturb.getEndTime()));
            b = (byte) f.b(this.disturb.getEndTime());
        }
        byteBufferOrder.put(b);
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    public String toString() {
        return "ATReminderItem{index=" + this.index + ", enable=" + this.enable + ", startTime='" + this.startTime + "', endTime='" + this.endTime + "', remindMode=" + this.remindMode + ", remindTime='" + this.remindTime + "', remindCycle=" + this.remindCycle + ", vibrationTime=" + this.vibrationTime + ", repeatDay=" + this.repeatDay + ", vibrationMode=" + this.vibrationMode + ", vibrationStrength1=" + this.vibrationStrength1 + ", vibrationStrength2=" + this.vibrationStrength2 + ", disturb=" + this.disturb + '}';
    }
}
