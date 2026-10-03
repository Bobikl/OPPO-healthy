package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.data.IPacketDecoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ATDeviceData implements IPacketDecoder {
    protected String broadcastId;
    protected int cmd;
    protected String measureTime;
    protected byte[] srcData;

    public ATDeviceData(byte[] bArr) {
        this.srcData = bArr;
        parse(bArr);
    }

    public int byte2Uint16(byte[] bArr, ByteOrder byteOrder) {
        int i;
        int i2;
        int i3 = 0;
        try {
            if (ByteOrder.BIG_ENDIAN.equals(byteOrder)) {
                i = (bArr[0] & 255) << 8;
                i2 = bArr[1] & 255;
            } else {
                i = bArr[0] & 255;
                i2 = (bArr[1] & 255) << 8;
            }
            i3 = i2 | i;
            return i3;
        } catch (Exception e2) {
            e2.printStackTrace();
            return i3;
        }
    }

    public int byte2Uint32(byte[] bArr, ByteOrder byteOrder) {
        try {
            return ByteBuffer.wrap(bArr).order(byteOrder).getInt();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public String floatArrayToString(float[] fArr) {
        if (fArr == null || fArr.length <= 0) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (float f : fArr) {
            stringBuffer.append(f + ";");
        }
        return stringBuffer.toString();
    }

    public String formatUtcTime(long j2) {
        return j2 > 0 ? ATDataProfile.timeDateFormat.format(new Date(j2 * 1000)) : "null";
    }

    public String getBroadcastId() {
        return this.broadcastId;
    }

    public int getCmd() {
        return this.cmd;
    }

    public String getMeasureTime() {
        return this.measureTime;
    }

    public byte[] getSrcData() {
        return this.srcData;
    }

    public String intArrayToString(List list) {
        if (list == null || list.size() <= 0) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            stringBuffer.append(((Integer) it.next()) + ";");
        }
        return stringBuffer.toString();
    }

    public void setBroadcastId(String str) {
        this.broadcastId = str;
    }

    public void setCmd(int i) {
        this.cmd = i;
    }

    public void setMeasureTime(String str) {
        this.measureTime = str;
    }

    public void setSrcData(byte[] bArr) {
        this.srcData = bArr;
    }

    public int toUnsignedInt(byte b) {
        return b & 255;
    }

    public int toUnsignedInt(short s) {
        return 65535 & s;
    }
}
