package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.config.ATNapRemind;
import com.lifesense.plugin.ble.data.tracker.config.ATSleepWakeup;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATEventClockSetting extends LSDeviceSyncSetting {
    public static final int MAX_INDEX = 10;
    private List clocks;
    private int count;

    public ATEventClockSetting() {
    }

    public ATEventClockSetting(List list) {
        this.clocks = list;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        List list = this.clocks;
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList<byte[]> arrayList = new ArrayList();
        Iterator it = this.clocks.iterator();
        while (it.hasNext()) {
            arrayList.add(((ATEventClockItem) it.next()).toBytes(getCmd()));
        }
        int size = arrayList.size();
        Iterator it2 = arrayList.iterator();
        int length = 0;
        while (it2.hasNext()) {
            length += ((byte[]) it2.next()).length;
        }
        int length2 = 2;
        byte[] bArr = new byte[length + 2];
        bArr[0] = (byte) getCmd();
        bArr[1] = (byte) size;
        for (byte[] bArr2 : arrayList) {
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public List getClocks() {
        return this.clocks;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 163;
        return 163;
    }

    public int getCount() {
        return this.count;
    }

    public void setClocks(List list) {
        this.clocks = list;
    }

    public void setCount(int i) {
        this.count = i;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATEventClockSetting{count=" + this.count + ", clocks=" + this.clocks + '}';
    }

    public ATEventClockSetting(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.count = a.a(byteBufferOrder.get());
            this.clocks = new ArrayList();
            for (int i = 0; i < this.count; i++) {
                ATEventClockItem aTEventClockItem = new ATEventClockItem();
                int iA = a.a(byteBufferOrder.get());
                int iA2 = a.a(byteBufferOrder.get()) - 1;
                byte[] bArr2 = new byte[iA2];
                byteBufferOrder.get(bArr2, 0, iA2);
                byteBufferOrder.get();
                int iA3 = a.a(byteBufferOrder.get());
                if ((iA3 & 3) == 3) {
                    ATNapRemind aTNapRemind = new ATNapRemind();
                    aTNapRemind.setEnable(true);
                    aTNapRemind.setNapTime(a.a(byteBufferOrder.get()));
                    aTEventClockItem.setNapRemind(aTNapRemind);
                }
                if ((iA3 & 5) == 5) {
                    ATSleepWakeup aTSleepWakeup = new ATSleepWakeup();
                    aTSleepWakeup.setEnable(true);
                    aTSleepWakeup.setWakeupTime(a.a(byteBufferOrder.get()));
                    aTEventClockItem.setWakeupRemind(aTSleepWakeup);
                }
                String str = String.format("%02d:%02d", Integer.valueOf(a.a(byteBufferOrder.get())), Integer.valueOf(a.a(byteBufferOrder.get())));
                int iA4 = a.a(byteBufferOrder.get());
                ATVibrationMode vibrationMode = ATVibrationMode.getVibrationMode(a.a(byteBufferOrder.get()));
                int iA5 = a.a(byteBufferOrder.get());
                int iA6 = a.a(byteBufferOrder.get());
                int iA7 = a.a(byteBufferOrder.get());
                aTEventClockItem.setIndex(iA);
                aTEventClockItem.setTitle(a.i(bArr2));
                aTEventClockItem.setVibrationTime(iA5);
                aTEventClockItem.setVibrationStrength1(iA6);
                aTEventClockItem.setVibrationStrength2(iA7);
                aTEventClockItem.setTime(str);
                aTEventClockItem.setState(ATEventClockState.getClockState(iA3));
                aTEventClockItem.setVibrationMode(vibrationMode);
                aTEventClockItem.setRepeatDay(ATWeekDay.toWeekDay(iA4));
                this.clocks.add(aTEventClockItem);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
