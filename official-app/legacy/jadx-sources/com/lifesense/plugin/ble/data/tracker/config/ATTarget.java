package com.lifesense.plugin.ble.data.tracker.config;

import com.lifesense.plugin.ble.data.tracker.setting.ATEncourageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATTarget extends ATConfigItem {
    private List items;
    private ATEncourageType mainGoal;

    public static int toConfigItemType(ATEncourageType aTEncourageType) {
        if (aTEncourageType == ATEncourageType.Distance) {
            return 17;
        }
        return aTEncourageType == ATEncourageType.Calories ? 18 : 16;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        int i = this.mainGoal != null ? 1 : 0;
        List list = this.items;
        return (list == null || list.size() <= 0) ? i : i + this.items.size();
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        byte[] bArrCopyOf;
        int length;
        byte[] bArr;
        List list = this.items;
        if (list == null || list.size() <= 0) {
            bArrCopyOf = null;
            length = 0;
        } else {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(this.items.size() * 6).order(ByteOrder.BIG_ENDIAN);
            for (ATTargetItem aTTargetItem : this.items) {
                byteBufferOrder.put((byte) toConfigItemType(aTTargetItem.getType()));
                byteBufferOrder.put((byte) 4);
                byteBufferOrder.putInt(aTTargetItem.getValue());
            }
            bArrCopyOf = Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
            length = bArrCopyOf.length + 0;
        }
        ATEncourageType aTEncourageType = this.mainGoal;
        if (aTEncourageType != null) {
            bArr = new byte[]{15, 1, (byte) aTEncourageType.getValue()};
            length += 3;
        } else {
            bArr = null;
        }
        if (length == 0) {
            return null;
        }
        ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(length).order(ByteOrder.BIG_ENDIAN);
        if (bArr != null) {
            byteBufferOrder2.put(bArr);
        }
        if (bArrCopyOf != null) {
            byteBufferOrder2.put(bArrCopyOf);
        }
        return Arrays.copyOf(byteBufferOrder2.array(), byteBufferOrder2.position());
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        return 0;
    }

    public List getItems() {
        return this.items;
    }

    public ATEncourageType getMainGoal() {
        return this.mainGoal;
    }

    public void setItems(List list) {
        this.items = list;
    }

    public void setMainGoal(ATEncourageType aTEncourageType) {
        this.mainGoal = aTEncourageType;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "ATTarget{mainGoal=" + this.mainGoal + ", items=" + this.items + '}';
    }
}
