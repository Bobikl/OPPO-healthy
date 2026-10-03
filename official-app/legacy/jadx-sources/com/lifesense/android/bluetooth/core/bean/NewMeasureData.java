package com.lifesense.android.bluetooth.core.bean;

import com.lifesense.android.bluetooth.core.tools.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class NewMeasureData extends BaseDeviceData {
    public int deltaUtc;
    public int gSensorSize;
    public int heartRateSize;
    public List<MeasureData> measures;
    public int remainCount;
    public int stepSize;
    public int utc;

    public static class MeasureData {
        public int gSensorX;
        public int gSensorY;
        public int gSensorZ;
        public int heartRate;
        public int step;

        public MeasureData() {
        }

        public MeasureData(int i, int i2, int i3, int i4, int i5) {
            this.gSensorX = i;
            this.gSensorY = i2;
            this.gSensorZ = i3;
            this.heartRate = i4;
            this.step = i5;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof MeasureData;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MeasureData)) {
                return false;
            }
            MeasureData measureData = (MeasureData) obj;
            return measureData.canEqual(this) && getGSensorX() == measureData.getGSensorX() && getGSensorY() == measureData.getGSensorY() && getGSensorZ() == measureData.getGSensorZ() && getHeartRate() == measureData.getHeartRate() && getStep() == measureData.getStep();
        }

        public int getGSensorX() {
            return this.gSensorX;
        }

        public int getGSensorY() {
            return this.gSensorY;
        }

        public int getGSensorZ() {
            return this.gSensorZ;
        }

        public int getHeartRate() {
            return this.heartRate;
        }

        public int getStep() {
            return this.step;
        }

        public int hashCode() {
            return ((((((((getGSensorX() + 59) * 59) + getGSensorY()) * 59) + getGSensorZ()) * 59) + getHeartRate()) * 59) + getStep();
        }

        public void setGSensorX(int i) {
            this.gSensorX = i;
        }

        public void setGSensorY(int i) {
            this.gSensorY = i;
        }

        public void setGSensorZ(int i) {
            this.gSensorZ = i;
        }

        public void setHeartRate(int i) {
            this.heartRate = i;
        }

        public void setStep(int i) {
            this.step = i;
        }

        public String toString() {
            return "NewMeasureData.MeasureData(gSensorX=" + getGSensorX() + ", gSensorY=" + getGSensorY() + ", gSensorZ=" + getGSensorZ() + ", heartRate=" + getHeartRate() + ", step=" + getStep() + ")";
        }
    }

    public NewMeasureData() {
        this.measures = new ArrayList();
    }

    public void addMeasureData(MeasureData measureData) {
        this.measures.add(measureData);
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceData
    public boolean canEqual(Object obj) {
        return obj instanceof NewMeasureData;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceData
    public void decodeFromData(String str) {
        int i;
        int i2;
        int iB;
        int iB2;
        int iB3;
        byte[] bArrA = c.a(str);
        byte[] bArr = new byte[4];
        System.arraycopy(bArrA, 1, bArr, 0, 4);
        int iB4 = c.b(bArr);
        int i3 = iB4 & 3;
        int i4 = (iB4 >> 2) & 3;
        int i5 = (iB4 >> 4) & 3;
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArrA, 5, bArr2, 0, 4);
        int iB5 = c.b(bArr2);
        byte[] bArr3 = new byte[2];
        System.arraycopy(bArrA, 9, bArr3, 0, 2);
        int iC = c.c(bArr3);
        byte[] bArr4 = new byte[2];
        System.arraycopy(bArrA, 11, bArr4, 0, 2);
        int iC2 = c.c(bArr4);
        byte[] bArr5 = new byte[2];
        System.arraycopy(bArrA, 13, bArr5, 0, 2);
        int iC3 = c.c(bArr5);
        if (i3 != 0 || i4 != 0 || i5 != 0) {
            int i6 = 15;
            for (int i7 = 0; i7 < iC3; i7++) {
                if (i3 > 0) {
                    byte[] bArr6 = new byte[4];
                    int i8 = 4 - i3;
                    System.arraycopy(bArrA, i6, bArr6, i8, i3);
                    int iB6 = c.b(bArr6);
                    int i9 = i6 + i3;
                    byte[] bArr7 = new byte[4];
                    System.arraycopy(bArrA, i9, bArr7, i8, i3);
                    int iB7 = c.b(bArr7);
                    int i10 = i9 + i3;
                    byte[] bArr8 = new byte[4];
                    System.arraycopy(bArrA, i10, bArr8, i8, i3);
                    i6 = i10 + i3;
                    iB = c.b(bArr8);
                    i = iB6;
                    i2 = iB7;
                } else {
                    i = 0;
                    i2 = 0;
                    iB = 0;
                }
                if (i4 > 0) {
                    byte[] bArr9 = new byte[4];
                    System.arraycopy(bArrA, i6, bArr9, 4 - i4, i4);
                    i6 += i4;
                    iB2 = c.b(bArr9);
                } else {
                    iB2 = 0;
                }
                if (i5 > 0) {
                    byte[] bArr10 = new byte[4];
                    System.arraycopy(bArrA, i6, bArr10, 4 - i5, i5);
                    i6++;
                    iB3 = c.b(bArr10);
                } else {
                    iB3 = 0;
                }
                addMeasureData(new MeasureData(i, i2, iB, iB2, iB3));
            }
        }
        setGSensorSize(i3);
        setHeartRateSize(i4);
        setStepSize(i5);
        setUtc(iB5);
        setDeltaUtc(iC);
        setRemainCount(iC2);
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceData
    public List<BaseDeviceData> decodeListFromData(String str) {
        return null;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceData
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewMeasureData)) {
            return false;
        }
        NewMeasureData newMeasureData = (NewMeasureData) obj;
        if (!newMeasureData.canEqual(this) || !super.equals(obj) || getGSensorSize() != newMeasureData.getGSensorSize() || getHeartRateSize() != newMeasureData.getHeartRateSize() || getStepSize() != newMeasureData.getStepSize() || getUtc() != newMeasureData.getUtc() || getDeltaUtc() != newMeasureData.getDeltaUtc() || getRemainCount() != newMeasureData.getRemainCount()) {
            return false;
        }
        List<MeasureData> measures = getMeasures();
        List<MeasureData> measures2 = newMeasureData.getMeasures();
        return measures != null ? measures.equals(measures2) : measures2 == null;
    }

    public int getDeltaUtc() {
        return this.deltaUtc;
    }

    public int getGSensorSize() {
        return this.gSensorSize;
    }

    public int getHeartRateSize() {
        return this.heartRateSize;
    }

    public List<MeasureData> getMeasures() {
        return this.measures;
    }

    public int getRemainCount() {
        return this.remainCount;
    }

    public int getStepSize() {
        return this.stepSize;
    }

    public int getUtc() {
        return this.utc;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceData
    public int hashCode() {
        int iHashCode = ((((((((((((super.hashCode() + 59) * 59) + getGSensorSize()) * 59) + getHeartRateSize()) * 59) + getStepSize()) * 59) + getUtc()) * 59) + getDeltaUtc()) * 59) + getRemainCount();
        List<MeasureData> measures = getMeasures();
        return (iHashCode * 59) + (measures == null ? 43 : measures.hashCode());
    }

    public void setDeltaUtc(int i) {
        this.deltaUtc = i;
    }

    public void setGSensorSize(int i) {
        this.gSensorSize = i;
    }

    public void setHeartRateSize(int i) {
        this.heartRateSize = i;
    }

    public void setMeasures(List<MeasureData> list) {
        this.measures = list;
    }

    public void setRemainCount(int i) {
        this.remainCount = i;
    }

    public void setStepSize(int i) {
        this.stepSize = i;
    }

    public void setUtc(int i) {
        this.utc = i;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceData
    public String toString() {
        return "NewMeasureData(gSensorSize=" + getGSensorSize() + ", heartRateSize=" + getHeartRateSize() + ", stepSize=" + getStepSize() + ", utc=" + getUtc() + ", deltaUtc=" + getDeltaUtc() + ", remainCount=" + getRemainCount() + ", measures=" + getMeasures() + ")";
    }

    public NewMeasureData(int i, int i2, int i3, int i4, int i5, int i6, List<MeasureData> list) {
        new ArrayList();
        this.gSensorSize = i;
        this.heartRateSize = i2;
        this.stepSize = i3;
        this.utc = i4;
        this.deltaUtc = i5;
        this.remainCount = i6;
        this.measures = list;
    }
}
