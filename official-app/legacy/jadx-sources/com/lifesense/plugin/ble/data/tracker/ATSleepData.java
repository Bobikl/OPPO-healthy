package com.lifesense.plugin.ble.data.tracker;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import p010kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes5.dex */
public class ATSleepData extends ATDeviceData {
    private int dataSize;
    private int offset;
    private int remainCount;
    private List sleepStatus;
    private long utc;

    public ATSleepData(byte[] bArr) {
        super(bArr);
    }

    public int getDataSize() {
        return this.dataSize;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getRemainCount() {
        return this.remainCount;
    }

    public List getSleepStatus() {
        return this.sleepStatus;
    }

    public long getUtc() {
        return this.utc;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        byte[] bArr2 = this.srcData;
        if (bArr2 == null || bArr2.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            long j2 = byteBufferOrder.getInt();
            this.utc = j2;
            this.measureTime = formatUtcTime(j2);
            this.offset = toUnsignedInt(byteBufferOrder.get()) * 5;
            this.remainCount = toUnsignedInt(byteBufferOrder.getShort());
            this.dataSize = toUnsignedInt(byteBufferOrder.getShort());
            int iPosition = byteBufferOrder.position();
            byte[] bArr3 = this.srcData;
            int length = bArr3.length - iPosition;
            byte[] bArr4 = new byte[length];
            int i = 0;
            System.arraycopy(bArr3, iPosition, bArr4, 0, length);
            this.sleepStatus = new ArrayList();
            while (i < length) {
                byte b = bArr4[i];
                int i2 = b & ByteCompanionObject.MAX_VALUE;
                if (((b & ByteCompanionObject.MIN_VALUE) >> 7) == 1) {
                    i++;
                    for (int unsignedInt = toUnsignedInt(bArr4[i]); unsignedInt > 0; unsignedInt--) {
                        this.sleepStatus.add(Integer.valueOf(i2));
                    }
                } else {
                    this.sleepStatus.add(Integer.valueOf(i2));
                }
                i++;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setDataSize(int i) {
        this.dataSize = i;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setRemainCount(int i) {
        this.remainCount = i;
    }

    public void setSleepStatus(List list) {
        this.sleepStatus = list;
    }

    public void setUtc(long j2) {
        this.utc = j2;
    }

    public String toString() {
        return "ATSleepData{, utc=" + this.utc + ", offset=" + this.offset + ", remainCount=" + this.remainCount + ", dataSize=" + this.dataSize + ", sleepStatus=" + intArrayToString(this.sleepStatus) + ", cmd=" + this.cmd + ", measureTime=" + this.measureTime + '}';
    }
}
