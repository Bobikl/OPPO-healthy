package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.tracker.config.ATNapRemind;
import com.lifesense.plugin.ble.data.tracker.config.ATSleepWakeup;
import com.lifesense.plugin.ble.device.proto.A5.parser.f;
import com.squareup.moshi.Json;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATEventClockItem {
    private int index;
    private ATNapRemind napRemind;
    private ATEventReminderType reminderType = ATEventReminderType.AlarmClock;
    private List repeatDay;
    private ATEventClockState state;
    private String time;
    private String title;
    private ATVibrationMode vibrationMode;
    private int vibrationStrength1;
    private int vibrationStrength2;
    private int vibrationTime;
    private ATSleepWakeup wakeupRemind;

    private int getBufferSize(int i) {
        ATNapRemind aTNapRemind = this.napRemind;
        if (aTNapRemind != null && aTNapRemind.isEnable()) {
            i++;
        }
        ATSleepWakeup aTSleepWakeup = this.wakeupRemind;
        return (aTSleepWakeup == null || !aTSleepWakeup.isEnable()) ? i : i + 1;
    }

    private int getClockState(int i) {
        ATNapRemind aTNapRemind = this.napRemind;
        if (aTNapRemind != null && aTNapRemind.isEnable()) {
            i |= 2;
        }
        ATSleepWakeup aTSleepWakeup = this.wakeupRemind;
        return (aTSleepWakeup == null || !aTSleepWakeup.isEnable()) ? i : i | 4;
    }

    public int getIndex() {
        return this.index;
    }

    public ATNapRemind getNapRemind() {
        return this.napRemind;
    }

    public ATEventReminderType getReminderType() {
        return this.reminderType;
    }

    public List getRepeatDay() {
        return this.repeatDay;
    }

    public ATEventClockState getState() {
        return this.state;
    }

    public String getTime() {
        return this.time;
    }

    public String getTitle() {
        return this.title;
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

    public ATSleepWakeup getWakeupRemind() {
        return this.wakeupRemind;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setNapRemind(ATNapRemind aTNapRemind) {
        this.napRemind = aTNapRemind;
    }

    public void setReminderType(ATEventReminderType aTEventReminderType) {
        this.reminderType = aTEventReminderType;
    }

    public void setRepeatDay(List list) {
        this.repeatDay = list;
    }

    public void setState(ATEventClockState aTEventClockState) {
        this.state = aTEventClockState;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setTitle(String str) {
        this.title = str;
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

    public void setWakeupRemind(ATSleepWakeup aTSleepWakeup) {
        this.wakeupRemind = aTSleepWakeup;
    }

    public byte[] toBytes(int i) {
        byte[] bArr;
        int i2;
        int i3;
        if (this.state == null) {
            return null;
        }
        byte[] bArrA = a.a(a.b(getTitle(), 24) + Json.UNSET_NAME);
        int length = bArrA.length;
        byte[] bArr2 = new byte[bArrA.length + 10];
        int index = getIndex();
        if (i == 184) {
            bArr = new byte[bArrA.length + 11];
            bArr[0] = (byte) index;
            bArr[1] = (byte) getReminderType().getValue();
            i2 = 2;
        } else {
            bArr = new byte[getBufferSize(bArrA.length + 10)];
            bArr[0] = (byte) index;
            i2 = 1;
        }
        bArr[i2] = (byte) length;
        int i4 = i2 + 1;
        System.arraycopy(bArrA, 0, bArr, i4, bArrA.length);
        int length2 = i4 + bArrA.length;
        int state = this.state.getState();
        ATEventClockState aTEventClockState = this.state;
        if (aTEventClockState == ATEventClockState.Disable || aTEventClockState == ATEventClockState.Remove) {
            bArr[length2] = (byte) state;
            i3 = length2 + 1;
        } else {
            bArr[length2] = (byte) getClockState(state);
            i3 = length2 + 1;
            ATNapRemind aTNapRemind = this.napRemind;
            if (aTNapRemind != null && aTNapRemind.isEnable()) {
                bArr[i3] = (byte) this.napRemind.getNapTime();
                i3++;
            }
            ATSleepWakeup aTSleepWakeup = this.wakeupRemind;
            if (aTSleepWakeup != null && aTSleepWakeup.isEnable()) {
                bArr[i3] = (byte) this.wakeupRemind.getWakeupTime();
                i3++;
            }
        }
        bArr[i3] = (byte) f.a(getTime());
        int i5 = i3 + 1;
        bArr[i5] = (byte) f.b(getTime());
        int i6 = i5 + 1;
        bArr[i6] = f.a(getRepeatDay());
        int i7 = i6 + 1;
        bArr[i7] = (byte) getVibrationMode().getValue();
        int i8 = i7 + 1;
        bArr[i8] = (byte) (getVibrationTime() <= 60 ? getVibrationTime() : 60);
        int i9 = i8 + 1;
        bArr[i9] = (byte) getVibrationStrength1();
        bArr[i9 + 1] = (byte) getVibrationStrength2();
        return bArr;
    }

    public String toString() {
        return "ATEventClockItem{index=" + this.index + ", title='" + this.title + "', state=" + this.state + ", time='" + this.time + "', repeatDay=" + this.repeatDay + ", vibrationMode=" + this.vibrationMode + ", vibrationStrength1=" + this.vibrationStrength1 + ", vibrationStrength2=" + this.vibrationStrength2 + ", vibrationTime=" + this.vibrationTime + ", reminderType=" + this.reminderType + ", napRemind=" + this.napRemind + ", wakeupRemind=" + this.wakeupRemind + '}';
    }
}
