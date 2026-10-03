package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.device.proto.A5.parser.f;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATAlarmClockSetting extends LSDeviceSyncSetting {
    public static final int MAX_NUMBER_OF_ALARM_CLOCKS = 6;
    private List clockItems;
    private boolean statusOfAll;

    public ATAlarmClockSetting(boolean z, List list) {
        this.statusOfAll = z;
        this.clockItems = list;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (!this.statusOfAll) {
            return new byte[]{(byte) getCmd(), 1, 0};
        }
        List list = this.clockItems;
        if (list == null || list.size() <= 0) {
            return null;
        }
        int size = this.clockItems.size();
        if (size > 6) {
            size = 6;
        }
        int i = 4;
        byte[] bArr = new byte[(size * 9) + 4];
        bArr[0] = (byte) getCmd();
        bArr[1] = 1;
        bArr[2] = 1;
        bArr[3] = (byte) size;
        for (int i2 = 0; i2 < size; i2++) {
            bArr[i + i2] = (byte) i2;
            i++;
            ATAlarmClockItem aTAlarmClockItem = (ATAlarmClockItem) this.clockItems.get(i2);
            if (aTAlarmClockItem != null) {
                int i3 = i + i2;
                bArr[i3] = 0;
                if (aTAlarmClockItem.isEnable()) {
                    bArr[i3] = 1;
                }
                int i4 = i + 1;
                bArr[i4 + i2] = (byte) f.a(aTAlarmClockItem.getTime());
                int i5 = i4 + 1;
                bArr[i5 + i2] = (byte) f.b(aTAlarmClockItem.getTime());
                int i6 = i5 + 1;
                bArr[i6 + i2] = f.a(aTAlarmClockItem.getRepeatDay());
                int i7 = i6 + 1;
                ATVibrationMode vibrationMode = aTAlarmClockItem.getVibrationMode();
                if (vibrationMode == null) {
                    vibrationMode = ATVibrationMode.Continuous;
                }
                bArr[i7 + i2] = (byte) vibrationMode.getValue();
                int i8 = i7 + 1;
                bArr[i8 + i2] = (byte) (aTAlarmClockItem.getVibrationTime() <= 60 ? aTAlarmClockItem.getVibrationTime() : 60);
                int i9 = i8 + 1;
                bArr[i9 + i2] = (byte) aTAlarmClockItem.getVibrationStrength1();
                i = i9 + 1;
                bArr[i + i2] = (byte) aTAlarmClockItem.getVibrationStrength2();
            }
        }
        return bArr;
    }

    public List getClockItems() {
        return this.clockItems;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 105;
        return 105;
    }

    public boolean isStatusOfAll() {
        return this.statusOfAll;
    }

    public void setClockItems(List list) {
        this.clockItems = list;
    }

    public void setStatusOfAll(boolean z) {
        this.statusOfAll = z;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATAlarmClockSetting{statusOfAll=" + this.statusOfAll + ", clockItems=" + this.clockItems + '}';
    }
}
