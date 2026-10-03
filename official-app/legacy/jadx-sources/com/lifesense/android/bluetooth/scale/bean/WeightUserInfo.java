package com.lifesense.android.bluetooth.scale.bean;

import com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.bean.constant.SexType;
import com.lifesense.android.bluetooth.core.tools.e;
import com.lifesense.android.bluetooth.scale.enums.UnitType;

/* JADX INFO: loaded from: classes4.dex */
public class WeightUserInfo extends BaseDeviceProperty {
    public float goalWeight;
    public float height;
    public UnitType unit;
    public float waistline;
    public byte flags = -33;
    public int productUserNumber = 1;
    public SexType sex = SexType.MALE;
    public int age = 20;
    public boolean isAthlete = false;
    public int athleteActivityLevel = 0;
    public float weight = 0.0f;

    public WeightUserInfo() {
        this.height = 1.0f;
        this.height = 1.7f;
    }

    public static WeightUserInfo fromBytes(byte[] bArr, LsDeviceInfo lsDeviceInfo) {
        byte b = bArr[2];
        SexType sexType = bArr[3] == 0 ? SexType.MALE : SexType.FEMALE;
        byte b2 = bArr[4];
        float fH = e.h(e.a(bArr, 5, 7)) / 100.0f;
        boolean z = (bArr[7] & 1) == 1;
        int i = bArr[8] & 255;
        float fH2 = e.h(e.a(bArr, 9, 11)) / 100.0f;
        WeightUserInfo weightUserInfo = new WeightUserInfo();
        weightUserInfo.setProductUserNumber(b);
        weightUserInfo.setSex(sexType);
        weightUserInfo.setAge(b2);
        weightUserInfo.setHeight(fH);
        weightUserInfo.setAthlete(z);
        weightUserInfo.setAthleteActivityLevel(i);
        weightUserInfo.setWeight(fH2);
        return weightUserInfo;
    }

    private int getSexValue(SexType sexType, boolean z) {
        if (sexType == SexType.MALE) {
            return z ? 3 : 1;
        }
        if (sexType == SexType.FEMALE) {
            return z ? 4 : 2;
        }
        return 1;
    }

    public static UnitType getUnitTypeByUnitValue(int i) {
        if (i == 1) {
            return UnitType.UNIT_LB;
        }
        return i == 2 ? UnitType.UNIT_ST : UnitType.UNIT_KG;
    }

    private int getUnitValueByUnitType(UnitType unitType) {
        if (unitType == UnitType.UNIT_LB) {
            return 1;
        }
        return unitType == UnitType.UNIT_ST ? 2 : 0;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty
    public boolean canEqual(Object obj) {
        return obj instanceof WeightUserInfo;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WeightUserInfo)) {
            return false;
        }
        WeightUserInfo weightUserInfo = (WeightUserInfo) obj;
        if (!weightUserInfo.canEqual(this) || !super.equals(obj) || getProductUserNumber() != weightUserInfo.getProductUserNumber()) {
            return false;
        }
        SexType sex = getSex();
        SexType sex2 = weightUserInfo.getSex();
        if (sex != null ? !sex.equals(sex2) : sex2 != null) {
            return false;
        }
        if (getAge() != weightUserInfo.getAge() || Float.compare(getHeight(), weightUserInfo.getHeight()) != 0 || isAthlete() != weightUserInfo.isAthlete() || getAthleteActivityLevel() != weightUserInfo.getAthleteActivityLevel() || Float.compare(getWeight(), weightUserInfo.getWeight()) != 0) {
            return false;
        }
        UnitType unit = getUnit();
        UnitType unit2 = weightUserInfo.getUnit();
        if (unit != null ? unit.equals(unit2) : unit2 == null) {
            return Float.compare(getGoalWeight(), weightUserInfo.getGoalWeight()) == 0 && Float.compare(getWaistline(), weightUserInfo.getWaistline()) == 0 && getFlags() == weightUserInfo.getFlags();
        }
        return false;
    }

    public int getAge() {
        return this.age;
    }

    public int getAthleteActivityLevel() {
        return this.athleteActivityLevel;
    }

    public byte[] getBytes() {
        byte[] bArrA = e.a(this.height);
        byte[] bArrB = e.b(this.goalWeight);
        return new byte[]{81, -33, (byte) this.productUserNumber, (byte) getSexValue(this.sex, this.isAthlete), (byte) this.age, bArrA[0], bArrA[1], (byte) this.athleteActivityLevel, (byte) getUnitValueByUnitType(this.unit), bArrB[0], bArrB[1], bArrB[2], bArrB[3], 0, 0};
    }

    public byte getFlags() {
        return this.flags;
    }

    public float getGoalWeight() {
        return this.goalWeight;
    }

    public float getHeight() {
        return this.height;
    }

    public int getProductUserNumber() {
        return this.productUserNumber;
    }

    public SexType getSex() {
        return this.sex;
    }

    public UnitType getUnit() {
        return this.unit;
    }

    public float getWaistline() {
        return this.waistline;
    }

    public float getWeight() {
        return this.weight;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty
    public int hashCode() {
        int iHashCode = ((super.hashCode() + 59) * 59) + getProductUserNumber();
        SexType sex = getSex();
        int iHashCode2 = (((((((((((iHashCode * 59) + (sex == null ? 43 : sex.hashCode())) * 59) + getAge()) * 59) + Float.floatToIntBits(getHeight())) * 59) + (isAthlete() ? 79 : 97)) * 59) + getAthleteActivityLevel()) * 59) + Float.floatToIntBits(getWeight());
        UnitType unit = getUnit();
        return (((((((iHashCode2 * 59) + (unit != null ? unit.hashCode() : 43)) * 59) + Float.floatToIntBits(getGoalWeight())) * 59) + Float.floatToIntBits(getWaistline())) * 59) + getFlags();
    }

    public boolean isAthlete() {
        return this.isAthlete;
    }

    public void setAge(int i) {
        if (i <= 0 || i >= 150) {
            return;
        }
        this.age = i;
    }

    public void setAthlete(boolean z) {
        this.isAthlete = z;
    }

    public void setAthleteActivityLevel(int i) {
        if (i <= 0 || i >= 255) {
            return;
        }
        this.athleteActivityLevel = i;
    }

    public void setFlags(byte b) {
        this.flags = b;
    }

    public void setGoalWeight(float f) {
        this.goalWeight = f;
    }

    public void setHeight(float f) {
        if (f <= 0.0f || f >= 10.0f) {
            return;
        }
        this.height = f;
    }

    public void setProductUserNumber(int i) {
        if (i >= 0) {
            this.productUserNumber = i;
        }
    }

    public void setSex(SexType sexType) {
        this.sex = sexType;
    }

    public void setUnit(UnitType unitType) {
        this.unit = unitType;
    }

    public void setWaistline(float f) {
        this.waistline = f;
    }

    public void setWeight(float f) {
        if (f <= 0.0f || f >= 1000.0f) {
            return;
        }
        this.weight = f;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty, com.lifesense.android.bluetooth.core.bean.Bytable
    public byte[] toBytes() {
        byte[] bArr = new byte[11];
        byte[] bArrA = e.a((short) PacketProfile.PUSH_USER_INFO_TO_WEIGHT_FOR_A6.getCommndValue());
        System.arraycopy(bArrA, 0, bArr, 0, bArrA.length);
        int length = bArrA.length + 0;
        bArr[length] = (byte) (getProductUserNumber() & 255);
        int i = length + 1;
        bArr[i] = (byte) getSex().getCommand();
        int i2 = i + 1;
        bArr[i2] = (byte) getAge();
        int i3 = i2 + 1;
        byte[] bArrA2 = e.a((short) (getHeight() * 100.0f));
        System.arraycopy(bArrA2, 0, bArr, i3, bArrA2.length);
        int length2 = i3 + bArrA2.length;
        bArr[length2] = isAthlete() ? (byte) 1 : (byte) 0;
        int i4 = length2 + 1;
        bArr[i4] = (byte) getAthleteActivityLevel();
        int i5 = i4 + 1;
        byte[] bArrA3 = e.a((short) (getWeight() * 100.0f));
        if (getWeight() <= 0.0f) {
            bArrA3 = new byte[]{-1, -1};
        }
        System.arraycopy(bArrA3, 0, bArr, i5, bArrA3.length);
        return bArr;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty
    public String toString() {
        return "WeightUserInfo(productUserNumber=" + getProductUserNumber() + ", sex=" + getSex() + ", age=" + getAge() + ", height=" + getHeight() + ", isAthlete=" + isAthlete() + ", athleteActivityLevel=" + getAthleteActivityLevel() + ", weight=" + getWeight() + ", unit=" + getUnit() + ", goalWeight=" + getGoalWeight() + ", waistline=" + getWaistline() + ", flags=" + ((int) getFlags()) + ")";
    }
}
