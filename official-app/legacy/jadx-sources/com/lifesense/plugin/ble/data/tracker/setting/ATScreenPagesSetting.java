package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATScreenPagesSetting extends LSDeviceSyncSetting {
    private List pages;

    private ATScreenPagesSetting() {
    }

    public ATScreenPagesSetting(List list) {
        this.pages = list;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        List list = this.pages;
        if (list == null || list.size() <= 0) {
            return null;
        }
        int size = this.pages.size();
        byte[] bArr = new byte[size + 2];
        byte cmd = (byte) getCmd();
        byte b = (byte) size;
        byte[] bArr2 = new byte[size];
        for (int i = 0; i < size; i++) {
            bArr2[i] = (byte) ((Integer) this.pages.get(i)).intValue();
        }
        bArr[0] = cmd;
        bArr[1] = b;
        System.arraycopy(bArr2, 0, bArr, 2, size);
        return bArr;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 126;
    }

    public List getPages() {
        return this.pages;
    }

    public void setPages(List list) {
        this.pages = list;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATScreenPagesSetting{pages=" + this.pages + '}';
    }
}
