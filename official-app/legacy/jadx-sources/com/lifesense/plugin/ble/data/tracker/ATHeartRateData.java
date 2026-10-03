package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.c.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATHeartRateData extends ATDeviceData {
    protected int dataSize;
    protected List heartRates;
    protected boolean isRealtimeData;
    protected int offset;
    protected int remainCount;
    protected int type;
    protected long utc;

    public ATHeartRateData(byte[] bArr) {
        super(bArr);
        this.type = 0;
        this.isRealtimeData = false;
    }

    public static ATHeartRateData parseRealtimeData(byte[] bArr, String str) {
        if (bArr != null && bArr.length >= 0) {
            int iG = 0;
            try {
                if ((bArr[0] & 1) == 0) {
                    if (bArr.length >= 2) {
                        iG = bArr[1] & 255;
                    }
                } else if (bArr.length >= 4) {
                    byte[] bArr2 = new byte[2];
                    System.arraycopy(bArr, 2, bArr2, 0, 2);
                    iG = a.g(bArr2);
                }
                ATHeartRateData aTHeartRateData = new ATHeartRateData(null);
                aTHeartRateData.setUtc(System.currentTimeMillis() / 1000);
                aTHeartRateData.setMeasureTime(ATDataProfile.timeDateFormat.format(new Date(aTHeartRateData.getUtc() * 1000)));
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(iG));
                aTHeartRateData.setHeartRates(arrayList);
                aTHeartRateData.setBroadcastId(str);
                aTHeartRateData.setRealtimeData(true);
                return aTHeartRateData;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public int getDataSize() {
        return this.dataSize;
    }

    public List getHeartRates() {
        return this.heartRates;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getRemainCount() {
        return this.remainCount;
    }

    public int getType() {
        return this.type;
    }

    public long getUtc() {
        return this.utc;
    }

    public boolean isRealtimeData() {
        return this.isRealtimeData;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        int i;
        byte[] bArr2 = this.srcData;
        if (bArr2 == null || bArr2.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.BIG_ENDIAN);
            int unsignedInt = toUnsignedInt(byteBufferOrder.get());
            this.cmd = unsignedInt;
            if (unsignedInt == 16) {
                this.type = toUnsignedInt(byteBufferOrder.get());
                i = 5;
            } else {
                i = 60;
            }
            long j2 = byteBufferOrder.getInt();
            this.utc = j2;
            this.measureTime = formatUtcTime(j2);
            this.offset = toUnsignedInt(byteBufferOrder.get()) * i;
            this.remainCount = toUnsignedInt(byteBufferOrder.getShort());
            this.dataSize = toUnsignedInt(byteBufferOrder.getShort());
            int iPosition = byteBufferOrder.position();
            byte[] bArr3 = this.srcData;
            int length = bArr3.length - iPosition;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr3, iPosition, bArr4, 0, length);
            this.heartRates = new ArrayList();
            for (int i2 = 0; i2 < this.dataSize; i2++) {
                this.heartRates.add(i2, Integer.valueOf(toUnsignedInt(bArr4[i2])));
            }
            this.isRealtimeData = false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setDataSize(int i) {
        this.dataSize = i;
    }

    public void setHeartRates(List list) {
        this.heartRates = list;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setRealtimeData(boolean z) {
        this.isRealtimeData = z;
    }

    public void setRemainCount(int i) {
        this.remainCount = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUtc(long j2) {
        this.utc = j2;
    }

    public String toString() {
        return "ATHeartRateData{, type=" + this.type + ", utc=" + this.utc + ", offset=" + this.offset + ", remainCount=" + this.remainCount + ", dataSize=" + this.dataSize + ", heartRates=" + intArrayToString(this.heartRates) + ", isRealtimeData=" + this.isRealtimeData + '}';
    }
}
