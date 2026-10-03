package com.lifesense.plugin.ble.data.tracker.config;

import com.lifesense.plugin.ble.c.a;
import com.lifesense.plugin.ble.data.tracker.setting.ATFunctionSetting;
import com.lifesense.plugin.ble.data.tracker.setting.ATFunctionType;
import com.lifesense.plugin.ble.device.proto.A5.parser.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATDisturbMode extends ATConfigItem {
    private boolean autoState;
    private String endTime;
    private List functions;
    private String startTime;
    private boolean status;

    public ATDisturbMode(String str, String str2, boolean z, List list) {
        this.startTime = str;
        this.endTime = str2;
        this.autoState = z;
        this.functions = list;
        this.type = 20;
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

    @Override // com.lifesense.plugin.ble.data.tracker.config.ATConfigItem
    public int countOfItem() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.lifesense.plugin.ble.data.IPacketEncoder
    public byte[] encodeCmdBytes() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(20).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.put((byte) this.type);
        byteBufferOrder.put((byte) 13);
        boolean z = this.status;
        int i = z;
        if (this.autoState) {
            i = (z ? 1 : 0) | 2;
        }
        byteBufferOrder.put((byte) i);
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
        return 0;
    }

    public String getEndTime() {
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

    public void setEndTime(String str) {
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

    public String toString() {
        return "ATDisturbMode{startTime='" + this.startTime + "', endsTime='" + this.endTime + "', status=" + this.status + ", functions=" + this.functions + '}';
    }

    public ATDisturbMode(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        this.type = 20;
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            int iA = a.a(byteBufferOrder.get());
            this.status = (iA & 1) == 1;
            this.autoState = (iA & 2) == 2;
            this.startTime = String.format("%02d:%02d", Integer.valueOf(a.a(byteBufferOrder.get())), Integer.valueOf(a.a(byteBufferOrder.get())));
            this.endTime = String.format("%02d:%02d", Integer.valueOf(a.a(byteBufferOrder.get())), Integer.valueOf(a.a(byteBufferOrder.get())));
            int i = byteBufferOrder.getInt();
            ArrayList arrayList = new ArrayList();
            ATFunctionSetting aTFunctionSetting = new ATFunctionSetting(false, ATFunctionType.ScreenPowerOn);
            ATFunctionSetting aTFunctionSetting2 = new ATFunctionSetting(false, ATFunctionType.IncomingCall);
            ATFunctionSetting aTFunctionSetting3 = new ATFunctionSetting(false, ATFunctionType.MessageRemind);
            if ((i & 1) == 1) {
                aTFunctionSetting.setEnable(true);
            }
            if ((i & 2) == 2) {
                aTFunctionSetting2.setEnable(true);
            }
            if ((i & 4) == 4) {
                aTFunctionSetting3.setEnable(true);
            }
            arrayList.add(aTFunctionSetting);
            arrayList.add(aTFunctionSetting2);
            arrayList.add(aTFunctionSetting3);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
