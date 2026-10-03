package com.lifesense.android.bluetooth.scale.bean;

import com.lifesense.android.bluetooth.core.bean.BaseDeviceData;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.tools.e;
import com.lifesense.android.bluetooth.scale.enums.UnitType;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class WeightData_A3 extends BaseDeviceData {
    public static final String IMPEDANCE_STATUS_BAREFOOT = "BAREFOOT";
    public static final String IMPEDANCE_STATUS_ERROR = "ERROR";
    public static final String IMPEDANCE_STATUS_FINISH = "FINISH";
    public static final String IMPEDANCE_STATUS_IDLE = "IDLE";
    public static final String IMPEDANCE_STATUS_PROCESSING = "PROCESSING";
    public static final String IMPEDANCE_STATUS_SHOES = "SHOES";
    public static final String WEIGHT_STATUS_WEIGHT_STABLE = "WEIGHT STABLE";
    public static final String WEIGHT_STATUS_WEIGHT_UNSTABLE = "WEIGHT UNSTABLE";

    @Deprecated
    public String accuracyStatus;
    public boolean appendMeasurement;
    public float basalMetabolism;
    public int battery;
    public int bmi;
    public float bodyFatRatio;
    public float bodyWaterRatio;
    public float boneDensity;
    public String date;
    public String deviceSelectedUnit = "kg";
    public String deviceSn;
    public int fatFreeMass;
    public int heartRate;
    public double impedance;

    @Deprecated
    public String impedanceStatus;
    public float infantWeight;
    public double lbWeightValue;
    public int muscleMass;
    public float muscleMassRatio;
    public int remainCount;
    public int softLeanMass;
    public int stSectionValue;
    public double stWeightValue;
    public int timeZone;
    public long utc;
    public float visceralFatLevel;
    public double weight;

    @Deprecated
    public double weightDifferenceValue;

    @Deprecated
    public String weightStatus;

    /* JADX WARN: Code duplicated, block: B:101:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01db  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:113:0x020e  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0103  */
    /* JADX WARN: Code duplicated, block: B:86:0x0106  */
    /* JADX WARN: Code duplicated, block: B:88:0x0117  */
    /* JADX WARN: Code duplicated, block: B:90:0x0122  */
    /* JADX WARN: Code duplicated, block: B:91:0x0155  */
    /* JADX WARN: Code duplicated, block: B:93:0x0159  */
    /* JADX WARN: Code duplicated, block: B:95:0x016b  */
    /* JADX WARN: Code duplicated, block: B:97:0x017e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0191  */
    public static WeightData_A3 formBytes(byte[] bArr, LsDeviceInfo lsDeviceInfo) {
        String str;
        int i;
        WeightData_A3 weightData_A3 = new WeightData_A3();
        int iH = e.h(e.a(bArr, 2, 4));
        int iG = e.g(e.a(bArr, 4, 8));
        int i2 = iG & 3;
        UnitType[] unitTypeArrValues = UnitType.values();
        int length = unitTypeArrValues.length;
        for (int i3 = 0; i3 < length && i2 != unitTypeArrValues[i3].getCommand(); i3++) {
        }
        boolean z = ((iG >> 2) & 1) == 1;
        boolean z2 = ((iG >> 3) & 1) == 1;
        boolean z3 = ((iG >> 4) & 1) == 1;
        boolean z4 = ((iG >> 5) & 1) == 1;
        boolean z5 = ((iG >> 6) & 1) == 1;
        boolean z6 = ((iG >> 7) & 1) == 1;
        boolean z7 = ((iG >> 8) & 1) == 1;
        boolean z8 = ((iG >> 9) & 1) == 1;
        boolean z9 = ((iG >> 10) & 1) == 1;
        boolean z10 = ((iG >> 11) & 1) == 1;
        boolean z11 = ((iG >> 12) & 1) == 1;
        boolean z12 = ((iG >> 13) & 1) == 1;
        boolean z13 = ((iG >> 14) & 1) == 1;
        boolean z14 = ((iG >> 16) & 1) == 1;
        boolean z15 = ((iG >> 17) & 1) == 1;
        float fH = (float) (((double) e.h(e.a(bArr, 8, 10))) * 0.01d);
        weightData_A3.setRemainCount(iH);
        if (i2 == 0) {
            str = "Kg";
        } else if (i2 == 1) {
            str = "LB";
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    str = "Jin";
                }
                weightData_A3.setWeight(Double.parseDouble(String.valueOf(fH)));
                if (z) {
                    byte b = bArr[10];
                    weightData_A3.setUserId("0");
                    i = 11;
                } else {
                    i = 10;
                }
                if (z2) {
                    int i4 = i + 4;
                    weightData_A3.setUtc(e.g(e.a(bArr, i, i4)));
                    i = i4;
                }
                if (z3) {
                    int i5 = bArr[i] & 255;
                    i++;
                    weightData_A3.setTimeZone(i5);
                }
                if (z4) {
                    int i6 = i + 2;
                    int iH2 = e.h(e.a(bArr, i, i6));
                    int i7 = bArr[i6] & 255;
                    int i8 = i6 + 1;
                    int i9 = bArr[i8] & 255;
                    int i10 = i8 + 1;
                    int i11 = bArr[i10] & 255;
                    int i12 = i10 + 1;
                    int i13 = bArr[i12] & 255;
                    int i14 = i12 + 1;
                    weightData_A3.setDate(iH2, i7, i9, i11, i13, bArr[i14] & 255);
                    i = i14 + 1;
                }
                if (z5) {
                    int i15 = i + 2;
                    weightData_A3.setBmi(e.h(e.a(bArr, i, i15)) * 10);
                    i = i15;
                }
                if (z6) {
                    int i16 = i + 2;
                    weightData_A3.setBodyFatRatio(e.h(e.a(bArr, i, i16)) * 10);
                    i = i16;
                }
                if (z7) {
                    int i17 = i + 2;
                    weightData_A3.setBasalMetabolism(e.h(e.a(bArr, i, i17)) * 10);
                    i = i17;
                }
                if (z8) {
                    int i18 = i + 2;
                    weightData_A3.setMuscleMassRatio(e.h(e.a(bArr, i, i18)) * 10);
                    i = i18;
                }
                if (z9) {
                    int i19 = i + 2;
                    weightData_A3.setMuscleMassRatio(e.h(e.a(bArr, i, i19)) * 100);
                    i = i19;
                }
                if (z10) {
                    int i20 = i + 2;
                    weightData_A3.setFatFreeMass(e.h(e.a(bArr, i, i20)) * 100);
                    i = i20;
                }
                if (z11) {
                    int i21 = i + 2;
                    weightData_A3.setSoftLeanMass(e.h(e.a(bArr, i, i21)) * 100);
                    i = i21;
                }
                if (z12) {
                    int i22 = i + 2;
                    weightData_A3.setBodyWaterRatio(e.h(e.a(bArr, i, i22)) * 100);
                    i = i22;
                }
                if (z13) {
                    int i23 = i + 2;
                    weightData_A3.setImpedance(e.h(e.a(bArr, i, i23)));
                    i = i23;
                }
                if (z14) {
                    int i24 = i + 1;
                    weightData_A3.setHeartRate(e.a(bArr, i, i24)[0]);
                    i = i24;
                }
                if (z15) {
                    weightData_A3.setInfantWeight((float) (((double) e.g(e.a(bArr, i, i + 2))) * 0.01d));
                }
                weightData_A3.setBroadcastId(lsDeviceInfo.getBroadcastID());
                weightData_A3.setDeviceId(lsDeviceInfo.getDeviceId());
                return weightData_A3;
            }
            str = "St";
        }
        weightData_A3.setDeviceSelectedUnit(str);
        weightData_A3.setWeight(Double.parseDouble(String.valueOf(fH)));
        if (z) {
            byte b2 = bArr[10];
            weightData_A3.setUserId("0");
            i = 11;
        } else {
            i = 10;
        }
        if (z2) {
            int i25 = i + 4;
            weightData_A3.setUtc(e.g(e.a(bArr, i, i25)));
            i = i25;
        }
        if (z3) {
            int i26 = bArr[i] & 255;
            i++;
            weightData_A3.setTimeZone(i26);
        }
        if (z4) {
            int i27 = i + 2;
            int iH3 = e.h(e.a(bArr, i, i27));
            int i28 = bArr[i27] & 255;
            int i29 = i27 + 1;
            int i30 = bArr[i29] & 255;
            int i110 = i29 + 1;
            int i111 = bArr[i110] & 255;
            int i112 = i110 + 1;
            int i113 = bArr[i112] & 255;
            int i114 = i112 + 1;
            weightData_A3.setDate(iH3, i28, i30, i111, i113, bArr[i114] & 255);
            i = i114 + 1;
        }
        if (z5) {
            int i115 = i + 2;
            weightData_A3.setBmi(e.h(e.a(bArr, i, i115)) * 10);
            i = i115;
        }
        if (z6) {
            int i116 = i + 2;
            weightData_A3.setBodyFatRatio(e.h(e.a(bArr, i, i116)) * 10);
            i = i116;
        }
        if (z7) {
            int i117 = i + 2;
            weightData_A3.setBasalMetabolism(e.h(e.a(bArr, i, i117)) * 10);
            i = i117;
        }
        if (z8) {
            int i118 = i + 2;
            weightData_A3.setMuscleMassRatio(e.h(e.a(bArr, i, i118)) * 10);
            i = i118;
        }
        if (z9) {
            int i119 = i + 2;
            weightData_A3.setMuscleMassRatio(e.h(e.a(bArr, i, i119)) * 100);
            i = i119;
        }
        if (z10) {
            int i210 = i + 2;
            weightData_A3.setFatFreeMass(e.h(e.a(bArr, i, i210)) * 100);
            i = i210;
        }
        if (z11) {
            int i211 = i + 2;
            weightData_A3.setSoftLeanMass(e.h(e.a(bArr, i, i211)) * 100);
            i = i211;
        }
        if (z12) {
            int i212 = i + 2;
            weightData_A3.setBodyWaterRatio(e.h(e.a(bArr, i, i212)) * 100);
            i = i212;
        }
        if (z13) {
            int i213 = i + 2;
            weightData_A3.setImpedance(e.h(e.a(bArr, i, i213)));
            i = i213;
        }
        if (z14) {
            int i214 = i + 1;
            weightData_A3.setHeartRate(e.a(bArr, i, i214)[0]);
            i = i214;
        }
        if (z15) {
            weightData_A3.setInfantWeight((float) (((double) e.g(e.a(bArr, i, i + 2))) * 0.01d));
        }
        weightData_A3.setBroadcastId(lsDeviceInfo.getBroadcastID());
        weightData_A3.setDeviceId(lsDeviceInfo.getDeviceId());
        return weightData_A3;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceData
    public boolean canEqual(Object obj) {
        return obj instanceof WeightData_A3;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceData
    public void decodeFromData(String str) {
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
        if (!(obj instanceof WeightData_A3)) {
            return false;
        }
        WeightData_A3 weightData_A3 = (WeightData_A3) obj;
        if (!weightData_A3.canEqual(this)) {
            return false;
        }
        String deviceSn = getDeviceSn();
        String deviceSn2 = weightData_A3.getDeviceSn();
        if (deviceSn != null ? !deviceSn.equals(deviceSn2) : deviceSn2 != null) {
            return false;
        }
        String deviceSelectedUnit = getDeviceSelectedUnit();
        String deviceSelectedUnit2 = weightData_A3.getDeviceSelectedUnit();
        if (deviceSelectedUnit != null ? !deviceSelectedUnit.equals(deviceSelectedUnit2) : deviceSelectedUnit2 != null) {
            return false;
        }
        if (Double.compare(getWeight(), weightData_A3.getWeight()) != 0 || getUtc() != weightData_A3.getUtc()) {
            return false;
        }
        String date = getDate();
        String date2 = weightData_A3.getDate();
        if (date != null ? !date.equals(date2) : date2 != null) {
            return false;
        }
        if (Double.compare(getWeightDifferenceValue(), weightData_A3.getWeightDifferenceValue()) != 0 || Double.compare(getImpedance(), weightData_A3.getImpedance()) != 0) {
            return false;
        }
        String weightStatus = getWeightStatus();
        String weightStatus2 = weightData_A3.getWeightStatus();
        if (weightStatus != null ? !weightStatus.equals(weightStatus2) : weightStatus2 != null) {
            return false;
        }
        String impedanceStatus = getImpedanceStatus();
        String impedanceStatus2 = weightData_A3.getImpedanceStatus();
        if (impedanceStatus != null ? !impedanceStatus.equals(impedanceStatus2) : impedanceStatus2 != null) {
            return false;
        }
        if (isAppendMeasurement() != weightData_A3.isAppendMeasurement()) {
            return false;
        }
        String accuracyStatus = getAccuracyStatus();
        String accuracyStatus2 = weightData_A3.getAccuracyStatus();
        if (accuracyStatus != null ? accuracyStatus.equals(accuracyStatus2) : accuracyStatus2 == null) {
            return Float.compare(getBasalMetabolism(), weightData_A3.getBasalMetabolism()) == 0 && Float.compare(getBodyFatRatio(), weightData_A3.getBodyFatRatio()) == 0 && Float.compare(getBodyWaterRatio(), weightData_A3.getBodyWaterRatio()) == 0 && Float.compare(getVisceralFatLevel(), weightData_A3.getVisceralFatLevel()) == 0 && Float.compare(getMuscleMassRatio(), weightData_A3.getMuscleMassRatio()) == 0 && Float.compare(getBoneDensity(), weightData_A3.getBoneDensity()) == 0 && getBattery() == weightData_A3.getBattery() && getRemainCount() == weightData_A3.getRemainCount() && getTimeZone() == weightData_A3.getTimeZone() && getBmi() == weightData_A3.getBmi() && getMuscleMass() == weightData_A3.getMuscleMass() && getFatFreeMass() == weightData_A3.getFatFreeMass() && getSoftLeanMass() == weightData_A3.getSoftLeanMass() && Double.compare(getLbWeightValue(), weightData_A3.getLbWeightValue()) == 0 && Double.compare(getStWeightValue(), weightData_A3.getStWeightValue()) == 0 && getStSectionValue() == weightData_A3.getStSectionValue() && getHeartRate() == weightData_A3.getHeartRate() && Float.compare(getInfantWeight(), weightData_A3.getInfantWeight()) == 0;
        }
        return false;
    }

    @Deprecated
    public String getAccuracyStatus() {
        return this.accuracyStatus;
    }

    public float getBasalMetabolism() {
        return this.basalMetabolism;
    }

    public int getBattery() {
        return this.battery;
    }

    public int getBmi() {
        return this.bmi;
    }

    public float getBodyFatRatio() {
        return this.bodyFatRatio;
    }

    public float getBodyWaterRatio() {
        return this.bodyWaterRatio;
    }

    public float getBoneDensity() {
        return this.boneDensity;
    }

    public String getDate() {
        return this.date;
    }

    public String getDeviceSelectedUnit() {
        return this.deviceSelectedUnit;
    }

    public String getDeviceSn() {
        return this.deviceSn;
    }

    public int getFatFreeMass() {
        return this.fatFreeMass;
    }

    public int getHeartRate() {
        return this.heartRate;
    }

    public double getImpedance() {
        return this.impedance;
    }

    @Deprecated
    public String getImpedanceStatus() {
        return this.impedanceStatus;
    }

    public float getInfantWeight() {
        return this.infantWeight;
    }

    public double getLbWeightValue() {
        return this.lbWeightValue;
    }

    public int getMuscleMass() {
        return this.muscleMass;
    }

    public float getMuscleMassRatio() {
        return this.muscleMassRatio;
    }

    public int getRemainCount() {
        return this.remainCount;
    }

    public int getSoftLeanMass() {
        return this.softLeanMass;
    }

    public int getStSectionValue() {
        return this.stSectionValue;
    }

    public double getStWeightValue() {
        return this.stWeightValue;
    }

    public int getTimeZone() {
        return this.timeZone;
    }

    public long getUtc() {
        return this.utc;
    }

    public float getVisceralFatLevel() {
        return this.visceralFatLevel;
    }

    public double getWeight() {
        return this.weight;
    }

    @Deprecated
    public double getWeightDifferenceValue() {
        return this.weightDifferenceValue;
    }

    @Deprecated
    public String getWeightStatus() {
        return this.weightStatus;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceData
    public int hashCode() {
        String deviceSn = getDeviceSn();
        int iHashCode = deviceSn == null ? 43 : deviceSn.hashCode();
        String deviceSelectedUnit = getDeviceSelectedUnit();
        int iHashCode2 = ((iHashCode + 59) * 59) + (deviceSelectedUnit == null ? 43 : deviceSelectedUnit.hashCode());
        long jDoubleToLongBits = Double.doubleToLongBits(getWeight());
        int i = (iHashCode2 * 59) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        long utc = getUtc();
        int i2 = (i * 59) + ((int) (utc ^ (utc >>> 32)));
        String date = getDate();
        int iHashCode3 = (i2 * 59) + (date == null ? 43 : date.hashCode());
        long jDoubleToLongBits2 = Double.doubleToLongBits(getWeightDifferenceValue());
        int i3 = (iHashCode3 * 59) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(getImpedance());
        int i4 = (i3 * 59) + ((int) (jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32)));
        String weightStatus = getWeightStatus();
        int iHashCode4 = (i4 * 59) + (weightStatus == null ? 43 : weightStatus.hashCode());
        String impedanceStatus = getImpedanceStatus();
        int iHashCode5 = (((iHashCode4 * 59) + (impedanceStatus == null ? 43 : impedanceStatus.hashCode())) * 59) + (isAppendMeasurement() ? 79 : 97);
        String accuracyStatus = getAccuracyStatus();
        int iHashCode6 = (((((((((((((((((((((((((((iHashCode5 * 59) + (accuracyStatus != null ? accuracyStatus.hashCode() : 43)) * 59) + Float.floatToIntBits(getBasalMetabolism())) * 59) + Float.floatToIntBits(getBodyFatRatio())) * 59) + Float.floatToIntBits(getBodyWaterRatio())) * 59) + Float.floatToIntBits(getVisceralFatLevel())) * 59) + Float.floatToIntBits(getMuscleMassRatio())) * 59) + Float.floatToIntBits(getBoneDensity())) * 59) + getBattery()) * 59) + getRemainCount()) * 59) + getTimeZone()) * 59) + getBmi()) * 59) + getMuscleMass()) * 59) + getFatFreeMass()) * 59) + getSoftLeanMass();
        long jDoubleToLongBits4 = Double.doubleToLongBits(getLbWeightValue());
        int i5 = (iHashCode6 * 59) + ((int) (jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32)));
        long jDoubleToLongBits5 = Double.doubleToLongBits(getStWeightValue());
        return (((((((i5 * 59) + ((int) (jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32)))) * 59) + getStSectionValue()) * 59) + getHeartRate()) * 59) + Float.floatToIntBits(getInfantWeight());
    }

    public boolean isAppendMeasurement() {
        return this.appendMeasurement;
    }

    @Deprecated
    public void setAccuracyStatus(String str) {
        this.accuracyStatus = str;
    }

    public void setAppendMeasurement(boolean z) {
        this.appendMeasurement = z;
    }

    public void setBasalMetabolism(float f) {
        this.basalMetabolism = f;
    }

    public void setBattery(int i) {
        this.battery = i;
    }

    public void setBmi(int i) {
        this.bmi = i;
    }

    public void setBodyFatRatio(float f) {
        this.bodyFatRatio = f;
    }

    public void setBodyWaterRatio(float f) {
        this.bodyWaterRatio = f;
    }

    public void setBoneDensity(float f) {
        this.boneDensity = f;
    }

    public void setDate(int i, int i2, int i3, int i4, int i5, int i6) {
        this.date = i + "-" + i2 + "-" + i3 + " " + i4 + ":" + i5 + ":" + i6;
    }

    public void setDeviceSelectedUnit(String str) {
        this.deviceSelectedUnit = str;
    }

    public void setDeviceSn(String str) {
        this.deviceSn = str;
    }

    public void setFatFreeMass(int i) {
        this.fatFreeMass = i;
    }

    public void setHeartRate(int i) {
        this.heartRate = i;
    }

    public void setImpedance(double d) {
        this.impedance = d;
    }

    @Deprecated
    public void setImpedanceStatus(String str) {
        this.impedanceStatus = str;
    }

    public void setInfantWeight(float f) {
        this.infantWeight = f;
    }

    public void setLbWeightValue(double d) {
        this.lbWeightValue = d;
    }

    public void setMuscleMass(int i) {
        this.muscleMass = i;
    }

    public void setMuscleMassRatio(float f) {
        this.muscleMassRatio = f;
    }

    public void setRemainCount(int i) {
        this.remainCount = i;
    }

    public void setSoftLeanMass(int i) {
        this.softLeanMass = i;
    }

    public void setStSectionValue(int i) {
        this.stSectionValue = i;
    }

    public void setStWeightValue(double d) {
        this.stWeightValue = d;
    }

    public void setTimeZone(int i) {
        this.timeZone = i;
    }

    public void setUtc(long j2) {
        this.utc = j2;
    }

    public void setVisceralFatLevel(float f) {
        this.visceralFatLevel = f;
    }

    public void setWeight(double d) {
        this.weight = d;
    }

    @Deprecated
    public void setWeightDifferenceValue(double d) {
        this.weightDifferenceValue = d;
    }

    @Deprecated
    public void setWeightStatus(String str) {
        this.weightStatus = str;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceData
    public String toString() {
        return "WeightData_A3(deviceSn=" + getDeviceSn() + ", deviceSelectedUnit=" + getDeviceSelectedUnit() + ", weight=" + getWeight() + ", utc=" + getUtc() + ", date=" + getDate() + ", weightDifferenceValue=" + getWeightDifferenceValue() + ", impedance=" + getImpedance() + ", weightStatus=" + getWeightStatus() + ", impedanceStatus=" + getImpedanceStatus() + ", appendMeasurement=" + isAppendMeasurement() + ", accuracyStatus=" + getAccuracyStatus() + ", basalMetabolism=" + getBasalMetabolism() + ", bodyFatRatio=" + getBodyFatRatio() + ", bodyWaterRatio=" + getBodyWaterRatio() + ", visceralFatLevel=" + getVisceralFatLevel() + ", muscleMassRatio=" + getMuscleMassRatio() + ", boneDensity=" + getBoneDensity() + ", battery=" + getBattery() + ", remainCount=" + getRemainCount() + ", timeZone=" + getTimeZone() + ", bmi=" + getBmi() + ", muscleMass=" + getMuscleMass() + ", fatFreeMass=" + getFatFreeMass() + ", softLeanMass=" + getSoftLeanMass() + ", lbWeightValue=" + getLbWeightValue() + ", stWeightValue=" + getStWeightValue() + ", stSectionValue=" + getStSectionValue() + ", heartRate=" + getHeartRate() + ", infantWeight=" + getInfantWeight() + ")";
    }

    public void setDate(String str) {
        this.date = str;
    }
}
