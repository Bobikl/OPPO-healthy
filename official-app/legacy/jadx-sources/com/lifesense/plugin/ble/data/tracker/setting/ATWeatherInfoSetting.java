package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATWeatherInfoSetting extends LSDeviceSyncSetting {
    private int updateTime;
    private List weatherItems;

    public ATWeatherInfoSetting(int i, List list) {
        this.updateTime = i;
        this.weatherItems = list;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        List list = this.weatherItems;
        if (list == null || list.size() <= 0) {
            return null;
        }
        List weatherItems = getWeatherItems();
        byte[] bArr = new byte[(weatherItems.size() * 5) + 6];
        bArr[0] = (byte) getCmd();
        byte[] bArrA = a.a(getUpdateTime());
        System.arraycopy(bArrA, 0, bArr, 1, bArrA.length);
        int length = bArrA.length + 1;
        bArr[length] = (byte) weatherItems.size();
        int length2 = length + 1;
        for (int i = 0; i < weatherItems.size(); i++) {
            ATWeatherItem aTWeatherItem = (ATWeatherItem) weatherItems.get(i);
            bArr[length2] = (byte) aTWeatherItem.getWeatherState().getCommand();
            int i2 = length2 + 1;
            bArr[i2] = (byte) aTWeatherItem.getTemperature1();
            int i3 = i2 + 1;
            bArr[i3] = (byte) aTWeatherItem.getTemperature2();
            int i4 = i3 + 1;
            byte[] bArrB = a.b((short) aTWeatherItem.getAqi());
            System.arraycopy(bArrB, 0, bArr, i4, bArrB.length);
            length2 = i4 + bArrB.length;
        }
        return bArr;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 166;
        return 166;
    }

    public int getUpdateTime() {
        return this.updateTime;
    }

    public List getWeatherItems() {
        return this.weatherItems;
    }

    public void setUpdateTime(int i) {
        this.updateTime = i;
    }

    public void setWeatherItems(List list) {
        this.weatherItems = list;
    }
}
