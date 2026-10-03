package com.lifesense.plugin.ble.data.tracker.setting;

import android.util.Log;
import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;
import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.config.ATBloodOxygenMonitor;
import com.lifesense.plugin.ble.data.tracker.config.ATBrightness;
import com.lifesense.plugin.ble.data.tracker.config.ATConfigItem;
import com.lifesense.plugin.ble.data.tracker.config.ATDisturbMode;
import com.lifesense.plugin.ble.data.tracker.config.ATHeartRateAlert;
import com.lifesense.plugin.ble.data.tracker.config.ATHotkeyPage;
import com.lifesense.plugin.ble.data.tracker.config.ATMeasureUnit;
import com.lifesense.plugin.ble.data.tracker.config.ATNightMode;
import com.lifesense.plugin.ble.data.tracker.config.ATStrideInfo;
import com.lifesense.plugin.ble.data.tracker.config.ATVibrationIntensity;
import com.lifesense.plugin.ble.data.tracker.config.ATWatchFace;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATConfigItemSetting extends LSDeviceSyncSetting {
    private List items;

    public ATConfigItemSetting(ATConfigQueryCmd aTConfigQueryCmd, byte[] bArr) {
        ATConfigItem aTVibrationIntensity;
        ArrayList arrayList;
        try {
            if (aTConfigQueryCmd == ATConfigQueryCmd.DisplayBrightness) {
                aTVibrationIntensity = new ATBrightness(bArr);
                arrayList = new ArrayList();
                this.items = arrayList;
            } else {
                if (aTConfigQueryCmd != ATConfigQueryCmd.VibrationIntensity) {
                    if (aTConfigQueryCmd == ATConfigQueryCmd.Settings) {
                        this.items = new ArrayList();
                        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
                        int iA = a.a(byteBufferOrder.get());
                        if (iA > 0) {
                            ATStrideInfo aTStrideInfo = new ATStrideInfo();
                            do {
                                int iA2 = a.a(byteBufferOrder.get());
                                int iA3 = a.a(byteBufferOrder.get());
                                byte[] bArr2 = new byte[iA3];
                                byteBufferOrder.get(bArr2, 0, iA3);
                                ATConfigItem configItem = parseConfigItem(iA2, bArr2, aTStrideInfo);
                                if (configItem != null && !(configItem instanceof ATStrideInfo)) {
                                    this.items.add(configItem);
                                }
                                iA--;
                            } while (iA > 0);
                            if (aTStrideInfo.getRunningStride() > 0 || aTStrideInfo.getWalkingStride() > 0) {
                                this.items.add(aTStrideInfo);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                aTVibrationIntensity = new ATVibrationIntensity(bArr);
                arrayList = new ArrayList();
                this.items = arrayList;
            }
            arrayList.add(aTVibrationIntensity);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private ATConfigItem parseConfigItem(int i, byte[] bArr, ATStrideInfo aTStrideInfo) {
        if (3 == i) {
            return new ATBrightness(bArr);
        }
        if (2 == i) {
            return new ATVibrationIntensity(bArr);
        }
        if (14 == i || 13 == i) {
            byte b = bArr[0];
            aTStrideInfo.setRunningStride(a.a(b));
            return aTStrideInfo;
        }
        if (19 == i) {
            return new ATNightMode(bArr);
        }
        if (20 == i) {
            return new ATDisturbMode(bArr);
        }
        if (32 == i) {
            return new ATBloodOxygenMonitor(bArr);
        }
        if (10 == i) {
            return new ATWatchFace(bArr);
        }
        if (4 == i) {
            return new ATHotkeyPage(bArr);
        }
        if (8 == i || 6 == i || 7 == i || 5 == i) {
            return new ATMeasureUnit(bArr, i);
        }
        if (21 == i) {
            return new ATHeartRateAlert(bArr);
        }
        if (22 == i) {
            return new ATSedentaryItem(bArr);
        }
        Log.e("LS-BLE", "undefined config item = " + String.format("%02X", Integer.valueOf(i)));
        return null;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        List list = this.items;
        if (list == null || list.size() <= 0) {
            return null;
        }
        int length = 0;
        int iCountOfItem = 0;
        for (ATConfigItem aTConfigItem : this.items) {
            byte[] bArrEncodeCmdBytes = aTConfigItem.encodeCmdBytes();
            if (bArrEncodeCmdBytes != null && bArrEncodeCmdBytes.length > 0) {
                length += bArrEncodeCmdBytes.length;
                iCountOfItem += aTConfigItem.countOfItem();
            }
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(length + 2).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) getCmd());
        byteBufferOrder.put((byte) iCountOfItem);
        Iterator it = this.items.iterator();
        while (it.hasNext()) {
            byte[] bArrEncodeCmdBytes2 = ((ATConfigItem) it.next()).encodeCmdBytes();
            if (bArrEncodeCmdBytes2 != null && bArrEncodeCmdBytes2.length > 0) {
                byteBufferOrder.put(bArrEncodeCmdBytes2);
            }
        }
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER;
        return Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER;
    }

    public List getItems() {
        return this.items;
    }

    public void setItems(List list) {
        this.items = list;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATConfigItemSetting{items=" + this.items + '}';
    }

    public ATConfigItemSetting(List list) {
        this.items = list;
    }
}
