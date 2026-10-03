package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.ATIotDevice;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATIotDeviceSetting extends LSDeviceSyncSetting {
    private List iotDevices;

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        List list = this.iotDevices;
        if (list != null && list.size() > 0) {
            try {
                ByteBuffer byteBufferOrder = ByteBuffer.allocate((this.iotDevices.size() * 16) + 2).order(ByteOrder.BIG_ENDIAN);
                byteBufferOrder.put((byte) getCmd());
                byteBufferOrder.put((byte) this.iotDevices.size());
                for (int i = 0; i < this.iotDevices.size(); i++) {
                    byte[] bytes = ((ATIotDevice) this.iotDevices.get(i)).toBytes();
                    byteBufferOrder.put(bytes, 0, bytes.length);
                }
                return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 252;
        return 252;
    }

    public List getIotDevices() {
        return this.iotDevices;
    }

    public void setIotDevices(List list) {
        this.iotDevices = list;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATIotDeviceSetting{iotDevices=" + this.iotDevices + '}';
    }
}
