package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.c.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATIotDeviceInfo extends ATDeviceData {
    private int count;
    private List iotDevices;

    public ATIotDeviceInfo(byte[] bArr) {
        super(bArr);
    }

    public int getCount() {
        return this.count;
    }

    public List getIotDevices() {
        return this.iotDevices;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.count = toUnsignedInt(byteBufferOrder.get());
            this.iotDevices = new ArrayList();
            do {
                int unsignedInt = toUnsignedInt(byteBufferOrder.get());
                int unsignedInt2 = toUnsignedInt(byteBufferOrder.get());
                int unsignedInt3 = toUnsignedInt(byteBufferOrder.get());
                byte[] bArr2 = new byte[12];
                byteBufferOrder.get(bArr2, 0, 12);
                String strI = a.i(bArr2);
                byteBufferOrder.get();
                ATIotDevice aTIotDevice = new ATIotDevice();
                aTIotDevice.setIndex(unsignedInt);
                aTIotDevice.setNodeState(unsignedInt2);
                aTIotDevice.setWorkingState(unsignedInt3);
                aTIotDevice.setName(strI);
                this.iotDevices.add(aTIotDevice);
            } while (this.srcData.length - byteBufferOrder.position() >= 16);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setIotDevices(List list) {
        this.iotDevices = list;
    }

    public String toString() {
        return "ATIotDeviceInfo{count=" + this.count + ", iotDevices=" + this.iotDevices + '}';
    }
}
