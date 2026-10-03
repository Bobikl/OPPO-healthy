package com.lifesense.plugin.ble.data.tracker.setting;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATAlarmClockItem {
    private boolean enable;
    private List repeatDay;
    private String time;
    private ATVibrationMode vibrationMode;
    private int vibrationStrength1;
    private int vibrationStrength2;
    private int vibrationTime;

    public List getRepeatDay() {
        return this.repeatDay;
    }

    public String getTime() {
        return this.time;
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

    public void setRepeatDay(List list) {
        this.repeatDay = list;
    }

    public void setTime(String str) {
        this.time = str;
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
        return "ATAlarmClockItem{enable=" + this.enable + ", time='" + this.time + "', repeatDay=" + this.repeatDay + ", vibrationMode=" + this.vibrationMode + ", vibrationStrength1=" + this.vibrationStrength1 + ", vibrationStrength2=" + this.vibrationStrength2 + ", vibrationTime=" + this.vibrationTime + '}';
    }
}
