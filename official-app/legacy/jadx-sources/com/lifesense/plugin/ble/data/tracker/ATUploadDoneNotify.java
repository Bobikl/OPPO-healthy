package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.data.tracker.setting.ATDataQueryCmd;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATUploadDoneNotify extends ATDeviceData {
    private ATDataQueryCmd dataType;
    private int reserved;

    public ATUploadDoneNotify(byte[] bArr) {
        super(bArr);
    }

    public ATDataQueryCmd getDataType() {
        return this.dataType;
    }

    public int getReserved() {
        return this.reserved;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            this.dataType = ATDataQueryCmd.getDataType(toUnsignedInt(byteBufferOrder.get()));
            this.reserved = toUnsignedInt(byteBufferOrder.get());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setDataType(ATDataQueryCmd aTDataQueryCmd) {
        this.dataType = aTDataQueryCmd;
    }

    public void setReserved(int i) {
        this.reserved = i;
    }

    public String toString() {
        return "ATUploadDoneNotify{dataType=" + this.dataType + ", reserved=" + this.reserved + '}';
    }
}
