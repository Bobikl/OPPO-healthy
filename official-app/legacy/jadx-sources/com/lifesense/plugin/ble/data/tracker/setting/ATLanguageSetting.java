package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.squareup.moshi.Json;

/* JADX INFO: loaded from: classes5.dex */
public class ATLanguageSetting extends LSDeviceSyncSetting {
    private String language;

    public ATLanguageSetting(String str) {
        this.language = str;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (getLanguage() == null) {
            return null;
        }
        byte[] bytes = (this.language + Json.UNSET_NAME).getBytes();
        byte[] bArr = new byte[bytes.length + 5];
        bArr[0] = (byte) getCmd();
        System.arraycopy(bytes, 0, bArr, 1, bytes.length);
        System.arraycopy(new byte[4], 0, bArr, 1 + bytes.length, 4);
        return bArr;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 170;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATLanguageSetting{language='" + this.language + "'}";
    }
}
