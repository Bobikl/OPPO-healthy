package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.device.proto.A5.parser.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATSedentarySetting extends LSDeviceSyncSetting {
    private static final int MAX_NUMBER = 3;
    private List sedentaryItems;
    private boolean statusOfAll;

    private ATSedentarySetting() {
    }

    public ATSedentarySetting(boolean z, List list) {
        this.statusOfAll = z;
        this.sedentaryItems = list;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (!this.statusOfAll) {
            return new byte[]{(byte) getCmd(), 1, 0};
        }
        List list = this.sedentaryItems;
        if (list == null || list.size() <= 0) {
            return null;
        }
        int size = this.sedentaryItems.size() < 3 ? this.sedentaryItems.size() : 3;
        int i = 4;
        byte[] bArr = new byte[(size * 12) + 4];
        bArr[0] = (byte) getCmd();
        bArr[1] = 1;
        bArr[2] = 1;
        bArr[3] = (byte) size;
        for (int i2 = 0; i2 < size; i2++) {
            bArr[i + i2] = (byte) i2;
            i++;
            ATSedentaryItem aTSedentaryItem = (ATSedentaryItem) this.sedentaryItems.get(i2);
            if (aTSedentaryItem != null) {
                int i3 = i + i2;
                bArr[i3] = 0;
                if (aTSedentaryItem.isEnable()) {
                    bArr[i3] = 1;
                }
                String startTime = aTSedentaryItem.getStartTime();
                String endTime = aTSedentaryItem.getEndTime();
                int i4 = i + 1;
                bArr[i4 + i2] = (byte) f.a(startTime);
                int i5 = i4 + 1;
                bArr[i5 + i2] = (byte) f.b(startTime);
                int i6 = i5 + 1;
                bArr[i6 + i2] = (byte) f.a(endTime);
                int i7 = i6 + 1;
                bArr[i7 + i2] = (byte) f.b(endTime);
                int i8 = i7 + 1;
                int iD = f.d(startTime, endTime);
                if (iD < 0) {
                    iD = 0;
                } else if (aTSedentaryItem.getSedentaryTime() < iD) {
                    iD = aTSedentaryItem.getSedentaryTime();
                }
                bArr[i8 + i2] = (byte) iD;
                int i9 = i8 + 1;
                bArr[i9 + i2] = f.a(aTSedentaryItem.getRepeatDay());
                int i10 = i9 + 1;
                bArr[i10 + i2] = (byte) aTSedentaryItem.getVibrationMode().getValue();
                int i11 = i10 + 1;
                bArr[i11 + i2] = (byte) (aTSedentaryItem.getVibrationTime() <= 60 ? aTSedentaryItem.getVibrationTime() : 60);
                int i12 = i11 + 1;
                bArr[i12 + i2] = (byte) aTSedentaryItem.getVibrationStrength1();
                i = i12 + 1;
                bArr[i + i2] = (byte) aTSedentaryItem.getVibrationStrength2();
            }
        }
        return bArr;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 110;
    }

    public List getSedentaryItems() {
        return this.sedentaryItems;
    }

    public boolean isStatusOfAll() {
        return this.statusOfAll;
    }

    public void setSedentaryItems(List list) {
        this.sedentaryItems = list;
    }

    public void setStatusOfAll(boolean z) {
        this.statusOfAll = z;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATSedentarySetting{statusOfAll=" + this.statusOfAll + ", sedentaryItems=" + this.sedentaryItems + '}';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ATSedentarySetting(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            int i = 1;
            boolean z = a.a(byteBufferOrder.get()) == 1;
            this.statusOfAll = z;
            if (z) {
                int iA = a.a(byteBufferOrder.get());
                this.sedentaryItems = new ArrayList();
                int i2 = 0;
                while (i2 < iA) {
                    int iA2 = a.a(byteBufferOrder.get());
                    boolean z2 = a.a(byteBufferOrder.get()) == i ? i : 0;
                    String str = a.a(byteBufferOrder.get()) + ":" + a.a(byteBufferOrder.get());
                    String str2 = a.a(byteBufferOrder.get()) + ":" + a.a(byteBufferOrder.get());
                    int iA3 = a.a(byteBufferOrder.get());
                    int iA4 = a.a(byteBufferOrder.get());
                    ATVibrationMode vibrationMode = ATVibrationMode.getVibrationMode(a.a(byteBufferOrder.get()));
                    int iA5 = a.a(byteBufferOrder.get());
                    int iA6 = a.a(byteBufferOrder.get());
                    int iA7 = a.a(byteBufferOrder.get());
                    ATSedentaryItem aTSedentaryItem = new ATSedentaryItem();
                    aTSedentaryItem.setIndex(iA2);
                    aTSedentaryItem.setVibrationTime(iA5);
                    aTSedentaryItem.setVibrationStrength1(iA6);
                    aTSedentaryItem.setVibrationStrength2(iA7);
                    aTSedentaryItem.setEndTime(str2);
                    aTSedentaryItem.setStartTime(str);
                    aTSedentaryItem.setEnable(z2);
                    aTSedentaryItem.setSedentaryTime(iA3);
                    aTSedentaryItem.setVibrationMode(vibrationMode);
                    aTSedentaryItem.setRepeatDay(ATWeekDay.toWeekDay(iA4));
                    this.sedentaryItems.add(aTSedentaryItem);
                    i2++;
                    i = 1;
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
