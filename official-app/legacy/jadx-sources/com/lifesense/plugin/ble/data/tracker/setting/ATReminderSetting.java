package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATReminderSetting extends LSDeviceSyncSetting {
    private List items;
    private boolean stateOfAllReminder;
    private ATEventReminderType type;

    public ATReminderSetting(ATEventReminderType aTEventReminderType, boolean z, List list) {
        this.type = aTEventReminderType;
        this.stateOfAllReminder = z;
        this.items = list;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (this.type == null) {
            return null;
        }
        if (!this.stateOfAllReminder) {
            return new byte[]{(byte) getCmd(), (byte) this.type.getValue(), 0};
        }
        List list = this.items;
        if (list == null || list.size() <= 0) {
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(23).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) getCmd());
        byteBufferOrder.put((byte) this.type.getValue());
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) this.items.size());
        for (int i = 0; i < this.items.size(); i++) {
            byteBufferOrder.put(((ATReminderItem) this.items.get(i)).toBytes());
        }
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 254;
        return 254;
    }

    public List getItems() {
        return this.items;
    }

    public ATEventReminderType getType() {
        return this.type;
    }

    public boolean isStateOfAllReminder() {
        return this.stateOfAllReminder;
    }

    public void setItems(List list) {
        this.items = list;
    }

    public void setStateOfAllReminder(boolean z) {
        this.stateOfAllReminder = z;
    }

    public void setType(ATEventReminderType aTEventReminderType) {
        this.type = aTEventReminderType;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATReminderSetting{type=" + this.type + ", stateOfAllReminder=" + this.stateOfAllReminder + ", items=" + this.items + '}';
    }
}
