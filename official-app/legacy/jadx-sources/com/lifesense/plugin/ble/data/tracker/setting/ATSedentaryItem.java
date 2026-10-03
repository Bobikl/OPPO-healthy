package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.tracker.config.ATConfigItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATSedentaryItem extends ATConfigItem {
    private boolean enable;
    private String endTime;
    private int index;
    private List repeatDay;
    private int sedentaryTime;
    private String startTime;
    private ATVibrationMode vibrationMode;
    private int vibrationStrength1;
    private int vibrationStrength2;
    private int vibrationTime;

    public ATSedentaryItem() {
    }

    public ATSedentaryItem(byte[] bArr) {
        this.type = 22;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.enable = a.a(byteBufferOrder.get()) == 1;
            this.startTime = String.format("%02d:%02d", Integer.valueOf(a.a(byteBufferOrder.get())), Integer.valueOf(a.a(byteBufferOrder.get())));
            this.endTime = String.format("%02d:%02d", Integer.valueOf(a.a(byteBufferOrder.get())), Integer.valueOf(a.a(byteBufferOrder.get())));
            this.sedentaryTime = a.a(byteBufferOrder.get());
            this.repeatDay = ATWeekDay.toWeekDay(a.a(byteBufferOrder.get()));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        return 0;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        return null;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public int getIndex() {
        return this.index;
    }

    public List getRepeatDay() {
        return this.repeatDay;
    }

    public int getSedentaryTime() {
        return this.sedentaryTime;
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

    public void setIndex(int i) {
        this.index = i;
    }

    public void setRepeatDay(List list) {
        this.repeatDay = list;
    }

    public void setSedentaryTime(int i) {
        this.sedentaryTime = i;
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

    public String toString() {
        return "ATSedentaryItem{index=" + this.index + ", enable=" + this.enable + ", startTime='" + this.startTime + "', endTime='" + this.endTime + "', sedentaryTime=" + this.sedentaryTime + ", vibrationTime=" + this.vibrationTime + ", repeatDay=" + this.repeatDay + ", vibrationMode=" + this.vibrationMode + ", vibrationStrength1=" + this.vibrationStrength1 + ", vibrationStrength2=" + this.vibrationStrength2 + '}';
    }
}
