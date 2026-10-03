package com.lifesense.plugin.ble.data.tracker.setting;

import com.lifesense.plugin.ble.data.LSDataQueryRequest;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class ATDataQuerySetting extends LSDataQueryRequest {
    private int flag = 0;
    private ATDataQueryCmd queryCmd;

    private ATDataQuerySetting() {
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (getQueryCmd() == null) {
            return null;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(6).order(ByteOrder.BIG_ENDIAN);
            byteBufferOrder.put((byte) getCmd());
            byteBufferOrder.put((byte) getQueryCmd().getValue());
            byteBufferOrder.putInt(this.flag);
            return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        this.cmd = 240;
        return 240;
    }

    public ATDataQueryCmd getQueryCmd() {
        return this.queryCmd;
    }

    public void setQueryCmd(ATDataQueryCmd aTDataQueryCmd) {
        this.queryCmd = aTDataQueryCmd;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATDataQuerySetting{queryCmd=" + this.queryCmd + ", flag=" + this.flag + '}';
    }

    public ATDataQuerySetting(ATDataQueryCmd aTDataQueryCmd) {
        this.queryCmd = aTDataQueryCmd;
    }
}
