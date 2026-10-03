package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATExerciseModeSetting extends LSDeviceSyncSetting {
    private List autoRecognitionItems;

    private ATExerciseModeSetting() {
    }

    public ATExerciseModeSetting(List list) {
        this.autoRecognitionItems = list;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        List list = this.autoRecognitionItems;
        if (list == null || list.size() <= 0) {
            return null;
        }
        int size = this.autoRecognitionItems.size();
        int i = size * 2;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < this.autoRecognitionItems.size(); i2++) {
            ATAutoRecognitionItem aTAutoRecognitionItem = (ATAutoRecognitionItem) this.autoRecognitionItems.get(i2);
            int i3 = i2 * 2;
            bArr[i3] = (byte) aTAutoRecognitionItem.getType().getValue();
            bArr[i3 + 1] = aTAutoRecognitionItem.isEnable() ? (byte) 1 : (byte) 0;
        }
        byte[] bArr2 = new byte[i + 3];
        bArr2[0] = (byte) getCmd();
        bArr2[1] = (byte) size;
        System.arraycopy(bArr, 0, bArr2, 2, i);
        bArr2[2 + i] = 0;
        return bArr2;
    }

    public List getAutoRecognitionItems() {
        return this.autoRecognitionItems;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 162;
    }

    public void setAutoRecognitionItems(List list) {
        this.autoRecognitionItems = list;
    }
}
