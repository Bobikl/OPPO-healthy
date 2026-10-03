package com.lifesense.plugin.ble.data.tracker.config;

import com.lifesense.plugin.ble.data.tracker.setting.ATMessageRemindType;

/* JADX INFO: loaded from: classes5.dex */
public class ATMessageItem extends ATConfigItem {
    private boolean enable;
    private ATMessageRemindType msgType;

    public ATMessageItem() {
        this.type = 33;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        return 1;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        ATMessageRemindType aTMessageRemindType = this.msgType;
        if (aTMessageRemindType == null) {
            return null;
        }
        return new byte[]{(byte) this.type, 2, (byte) aTMessageRemindType.getValue(), this.enable ? (byte) 1 : (byte) 0};
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public ATMessageRemindType getMsgType() {
        return this.msgType;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public void setMsgType(ATMessageRemindType aTMessageRemindType) {
        this.msgType = aTMessageRemindType;
    }

    public String toString() {
        return "ATMessageItem{enable=" + this.enable + ", msgType=" + this.msgType + '}';
    }

    public ATMessageItem(boolean z, ATMessageRemindType aTMessageRemindType) {
        this.enable = z;
        this.msgType = aTMessageRemindType;
        this.type = 33;
    }
}
