package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.setting.ATConfigItemSetting;
import com.lifesense.plugin.ble.data.tracker.setting.ATConfigQueryCmd;
import com.lifesense.plugin.ble.data.tracker.setting.ATEventClockSetting;
import com.lifesense.plugin.ble.data.tracker.setting.ATFlashSetting;
import com.lifesense.plugin.ble.data.tracker.setting.ATMessageReminder;
import com.lifesense.plugin.ble.data.tracker.setting.ATSedentarySetting;
import com.lifesense.plugin.ble.data.tracker.setting.ATUserInfoSetting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATConfigItemData extends ATDeviceData {
    private ATConfigQueryCmd item;
    private LSDeviceSyncSetting setting;

    public ATConfigItemData(byte[] bArr) {
        super(bArr);
    }

    public ATConfigQueryCmd getItem() {
        return this.item;
    }

    public LSDeviceSyncSetting getSetting() {
        return this.setting;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        ATConfigItemSetting aTConfigItemSetting;
        LSDeviceSyncSetting aTEventClockSetting;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.item = ATConfigQueryCmd.getConfigQueryItem(toUnsignedInt(byteBufferOrder.get()));
            int length = bArr.length - byteBufferOrder.position();
            byte[] bArr2 = new byte[length];
            byteBufferOrder.get(bArr2, 0, length);
            ATConfigQueryCmd aTConfigQueryCmd = this.item;
            if (aTConfigQueryCmd == ATConfigQueryCmd.Flash) {
                aTEventClockSetting = new ATFlashSetting(bArr2);
            } else if (aTConfigQueryCmd == ATConfigQueryCmd.UserInfo) {
                aTEventClockSetting = new ATUserInfoSetting(bArr2);
            } else if (aTConfigQueryCmd == ATConfigQueryCmd.SedentaryRemind) {
                aTEventClockSetting = new ATSedentarySetting(bArr2);
            } else {
                if (aTConfigQueryCmd != ATConfigQueryCmd.IncomingCallRemind) {
                    if (aTConfigQueryCmd == ATConfigQueryCmd.VibrationIntensity || aTConfigQueryCmd == ATConfigQueryCmd.DisplayBrightness) {
                        aTConfigItemSetting = new ATConfigItemSetting(aTConfigQueryCmd, bArr2);
                    } else if (aTConfigQueryCmd == ATConfigQueryCmd.AlarmClock) {
                        aTEventClockSetting = new ATEventClockSetting(bArr2);
                    } else if (aTConfigQueryCmd != ATConfigQueryCmd.Settings) {
                        return;
                    } else {
                        aTConfigItemSetting = new ATConfigItemSetting(aTConfigQueryCmd, bArr2);
                    }
                    this.setting = aTConfigItemSetting;
                    return;
                }
                aTEventClockSetting = new ATMessageReminder(bArr2);
            }
            this.setting = aTEventClockSetting;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setItem(ATConfigQueryCmd aTConfigQueryCmd) {
        this.item = aTConfigQueryCmd;
    }

    public void setSetting(LSDeviceSyncSetting lSDeviceSyncSetting) {
        this.setting = lSDeviceSyncSetting;
    }

    public String toString() {
        return "ATConfigItemData{item=" + this.item + ", setting=" + this.setting + '}';
    }
}
