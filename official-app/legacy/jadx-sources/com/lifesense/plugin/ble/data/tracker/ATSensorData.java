package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.c.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ATSensorData extends ATDeviceData {
    private int dataSize;
    private int gSensorSize;
    private int heartRateSize;
    private int offset;
    private int remainCount;
    private List sensorItems;
    private int stepSize;
    private int utc;

    public ATSensorData(byte[] bArr) {
        super(bArr);
        this.sensorItems = new ArrayList();
    }

    public void addMeasureData(ATSensorItem aTSensorItem) {
        this.sensorItems.add(aTSensorItem);
    }

    public int getDataSize() {
        return this.dataSize;
    }

    public int getHeartRateSize() {
        return this.heartRateSize;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getRemainCount() {
        return this.remainCount;
    }

    public List getSensorItems() {
        return this.sensorItems;
    }

    public int getStepSize() {
        return this.stepSize;
    }

    public int getUtc() {
        return this.utc;
    }

    public int getgSensorSize() {
        return this.gSensorSize;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        int i;
        int i2;
        int iF;
        int iF2;
        int iF3;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 1, bArr2, 0, 4);
            int iF4 = a.f(bArr2);
            int i3 = iF4 & 3;
            int i4 = (iF4 >> 2) & 3;
            int i5 = (iF4 >> 4) & 3;
            byte[] bArr3 = new byte[4];
            System.arraycopy(bArr, 5, bArr3, 0, 4);
            int iF5 = a.f(bArr3);
            byte[] bArr4 = new byte[2];
            System.arraycopy(bArr, 9, bArr4, 0, 2);
            int iG = a.g(bArr4);
            byte[] bArr5 = new byte[2];
            System.arraycopy(bArr, 11, bArr5, 0, 2);
            int iG2 = a.g(bArr5);
            byte[] bArr6 = new byte[2];
            System.arraycopy(bArr, 13, bArr6, 0, 2);
            int iG3 = a.g(bArr6);
            if (i3 != 0 || i4 != 0 || i5 != 0) {
                int i6 = 15;
                for (int i7 = 0; i7 < iG3; i7++) {
                    if (i3 > 0) {
                        byte[] bArr7 = new byte[4];
                        int i8 = 4 - i3;
                        System.arraycopy(bArr, i6, bArr7, i8, i3);
                        int iF6 = a.f(bArr7);
                        int i9 = i6 + i3;
                        byte[] bArr8 = new byte[4];
                        System.arraycopy(bArr, i9, bArr8, i8, i3);
                        int iF7 = a.f(bArr8);
                        int i10 = i9 + i3;
                        byte[] bArr9 = new byte[4];
                        System.arraycopy(bArr, i10, bArr9, i8, i3);
                        i6 = i10 + i3;
                        iF = a.f(bArr9);
                        i = iF6;
                        i2 = iF7;
                    } else {
                        i = 0;
                        i2 = 0;
                        iF = 0;
                    }
                    if (i4 > 0) {
                        byte[] bArr10 = new byte[4];
                        System.arraycopy(bArr, i6, bArr10, 4 - i4, i4);
                        i6 += i4;
                        iF2 = a.f(bArr10);
                    } else {
                        iF2 = 0;
                    }
                    if (i5 > 0) {
                        byte[] bArr11 = new byte[4];
                        System.arraycopy(bArr, i6, bArr11, 4 - i5, i5);
                        i6++;
                        iF3 = a.f(bArr11);
                    } else {
                        iF3 = 0;
                    }
                    addMeasureData(new ATSensorItem(i, i2, iF, iF2, iF3));
                }
            }
            setgSensorSize(i3);
            setHeartRateSize(i4);
            setStepSize(i5);
            setUtc(iF5);
            setOffset(iG);
            setRemainCount(iG2);
            setDataSize(iG3);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setDataSize(int i) {
        this.dataSize = i;
    }

    public void setHeartRateSize(int i) {
        this.heartRateSize = i;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setRemainCount(int i) {
        this.remainCount = i;
    }

    public void setSensorItems(List list) {
        this.sensorItems = list;
    }

    public void setStepSize(int i) {
        this.stepSize = i;
    }

    public void setUtc(int i) {
        this.utc = i;
    }

    public void setgSensorSize(int i) {
        this.gSensorSize = i;
    }

    public String toString() {
        return "ATSensorData{gSensorSize=" + this.gSensorSize + ", heartRateSize=" + this.heartRateSize + ", stepSize=" + this.stepSize + ", utc=" + this.utc + ", offset=" + this.offset + ", remainCount=" + this.remainCount + ", sensorItems=" + this.sensorItems + '}';
    }
}
