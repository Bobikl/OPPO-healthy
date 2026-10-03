package com.lifesense.plugin.ble.data.tracker.setting;

import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;
import com.lifesense.plugin.ble.data.LSDeviceSyncSetting;
import com.lifesense.plugin.ble.data.tracker.config.ATDisturbMode;
import com.lifesense.plugin.ble.device.proto.A5.parser.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATQuietModeSetting extends LSDeviceSyncSetting {
    private boolean autoState;
    private String endTime;
    private List functions;
    private String startTime;
    private boolean status;

    public ATQuietModeSetting() {
        this.cmd = 179;
    }

    private int getFunctionsStatus() {
        List list = this.functions;
        int i = 0;
        if (list != null && list.size() != 0) {
            for (ATFunctionSetting aTFunctionSetting : this.functions) {
                if (aTFunctionSetting.getType() == ATFunctionType.ScreenPowerOn) {
                    i |= aTFunctionSetting.isEnable() ? 1 : 0;
                }
                if (ATFunctionType.IncomingCall == aTFunctionSetting.getType() && aTFunctionSetting.isEnable()) {
                    i |= 2;
                }
                if (ATFunctionType.MessageRemind == aTFunctionSetting.getType() && aTFunctionSetting.isEnable()) {
                    i |= 4;
                }
            }
        }
        return i;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        if (getCmd() != 179) {
            ATDisturbMode aTDisturbMode = new ATDisturbMode(this.startTime, this.endTime, this.autoState, this.functions);
            aTDisturbMode.setStatus(this.status);
            ArrayList arrayList = new ArrayList();
            arrayList.add(aTDisturbMode);
            return new ATConfigItemSetting(arrayList).encodeCmdBytes();
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) getCmd());
        byteBufferOrder.put(this.status ? (byte) 1 : (byte) 0);
        byte bA = (byte) f.a(this.startTime);
        byte b = (byte) f.b(this.startTime);
        byteBufferOrder.put(bA);
        byteBufferOrder.put(b);
        byte bA2 = (byte) f.a(this.endTime);
        byte b2 = (byte) f.b(this.endTime);
        byteBufferOrder.put(bA2);
        byteBufferOrder.put(b2);
        byteBufferOrder.putInt(getFunctionsStatus());
        byteBufferOrder.putInt(0);
        return Arrays.copyOf(byteBufferOrder.array(), byteBufferOrder.position());
    }

    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public int getCmd() {
        String str = this.deviceModel;
        int i = (str == null || !str.contains("437")) ? 179 : Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER;
        this.cmd = i;
        return i;
    }

    public String getEndsTime() {
        return this.endTime;
    }

    public List getFunctions() {
        return this.functions;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public boolean isAutoState() {
        return this.autoState;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setAutoState(boolean z) {
        this.autoState = z;
    }

    public void setEndsTime(String str) {
        this.endTime = str;
    }

    public void setFunctions(List list) {
        this.functions = list;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setStatus(boolean z) {
        this.status = z;
    }

    @Override // com.lifesense.plugin.ble.data.IDeviceSetting
    public String toString() {
        return "ATQuietModeSetting{status=" + this.status + ", autoState=" + this.autoState + ", startTime='" + this.startTime + "', endTime='" + this.endTime + "', functions=" + this.functions + ", cmd=" + this.cmd + '}';
    }
}
