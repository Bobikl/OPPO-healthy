package com.lifesense.plugin.ble.data.tracker.setting;

import android.text.TextUtils;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATHeartRateZoneSetting extends LSDeviceSyncSetting {
    private String deviceModel;
    private List heartRateZoneItems;
    private int userAge;

    private int[] getHearRange(int i) {
        if (!TextUtils.isEmpty(this.deviceModel) && this.deviceModel.equalsIgnoreCase("LS437")) {
            int i2 = 220 - i;
            return new int[]{(i2 * 45) / 100, (i2 * 50) / 100, (i2 * 60) / 100, (i2 * 75) / 100, (i2 * 85) / 100, i2};
        }
        int i3 = 220 - i;
        int i4 = (i3 * 70) / 100;
        int i5 = (i3 * 85) / 100;
        return new int[]{(i3 * 60) / 100, i4, i4, i5, i5, i3};
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        int i = this.userAge;
        byte b = (byte) (i & 255);
        int[] hearRange = getHearRange(i);
        List list = this.heartRateZoneItems;
        if (list != null && list.size() >= 3) {
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = i2 * 2;
                hearRange[i3] = ((ATHeartRateZoneItem) this.heartRateZoneItems.get(i2)).getMin();
                hearRange[i3 + 1] = ((ATHeartRateZoneItem) this.heartRateZoneItems.get(i2)).getMax();
            }
        }
        int length = hearRange.length;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < hearRange.length; i4++) {
            bArr[i4] = (byte) (hearRange[i4] & 255);
        }
        byte[] bArr2 = new byte[2 + length];
        bArr2[0] = (byte) getCmd();
        bArr2[1] = b;
        System.arraycopy(bArr, 0, bArr2, 2, length);
        return bArr2;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 116;
        return 116;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public List getHeartRateZoneItems() {
        return this.heartRateZoneItems;
    }

    public int getUserAge() {
        return this.userAge;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setHeartRateZoneItems(List list) {
        this.heartRateZoneItems = list;
    }

    public void setUserAge(int i) {
        this.userAge = i;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATHeartRateZoneSetting{userAge=" + this.userAge + ", deviceModel='" + this.deviceModel + "', heartRateZoneItems=" + this.heartRateZoneItems + '}';
    }
}
