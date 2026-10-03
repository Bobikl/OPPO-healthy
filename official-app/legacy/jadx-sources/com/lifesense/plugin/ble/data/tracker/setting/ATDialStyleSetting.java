package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATDialStyleSetting extends LSDeviceSyncSetting {
    private ATDialStyle dial;
    private List dialStyles;

    private ATDialStyleSetting() {
    }

    public ATDialStyleSetting(ATDialStyle aTDialStyle) {
        this.dial = aTDialStyle;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (getDial() == null) {
            return null;
        }
        List list = this.dialStyles;
        if (list == null || list.size() <= 0) {
            return new byte[]{(byte) getCmd(), (byte) getDial().getCommand()};
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) -9);
        for (int i = 0; i < 6; i++) {
            if (i < this.dialStyles.size()) {
                byteBufferOrder.put((byte) ((ATDialStyle) this.dialStyles.get(i)).getCommand());
            } else {
                byteBufferOrder.put((byte) 0);
            }
        }
        byteBufferOrder.put((byte) this.dial.getCommand());
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        List list = this.dialStyles;
        int i = (list == null || list.size() <= 0) ? 161 : 247;
        this.cmd = i;
        return i;
    }

    public ATDialStyle getDial() {
        return this.dial;
    }

    public List getDialStyles() {
        return this.dialStyles;
    }

    public void setDial(ATDialStyle aTDialStyle) {
        this.dial = aTDialStyle;
    }

    public void setDialStyles(List list) {
        this.dialStyles = list;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATDialStyleSetting{dial=" + this.dial + ", dialStyles=" + this.dialStyles + '}';
    }

    public ATDialStyleSetting(ATDialStyle aTDialStyle, List list) {
        this.dial = aTDialStyle;
        this.dialStyles = list;
    }
}
