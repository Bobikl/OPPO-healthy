package com.lifesense.plugin.ble.data.tracker.setting;

import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.config.ATTime;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class ATTimeSetting extends LSDeviceSyncSetting {
    private ATTime time;

    public ATTimeSetting(ATTime aTTime) {
        this.time = aTTime;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.time);
        return new ATConfigItemSetting(arrayList).encodeCmdBytes();
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER;
        return Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER;
    }

    public ATTime getTime() {
        return this.time;
    }

    public void setTime(ATTime aTTime) {
        this.time = aTTime;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATTimeSetting{time=" + this.time + '}';
    }
}
