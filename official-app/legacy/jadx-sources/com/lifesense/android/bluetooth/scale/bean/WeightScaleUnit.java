package com.lifesense.android.bluetooth.scale.bean;

import com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.scale.enums.UnitType;

/* JADX INFO: loaded from: classes4.dex */
public class WeightScaleUnit extends BaseDeviceProperty {
    public UnitType unit;

    public WeightScaleUnit() {
    }

    public WeightScaleUnit(UnitType unitType) {
        this.unit = unitType;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014 A[PHI: r1
  0x0014: PHI (r1v4 com.lifesense.android.bluetooth.scale.enums.UnitType) = 
  (r1v1 com.lifesense.android.bluetooth.scale.enums.UnitType)
  (r1v2 com.lifesense.android.bluetooth.scale.enums.UnitType)
  (r1v3 com.lifesense.android.bluetooth.scale.enums.UnitType)
 binds: [B:6:0x0012, B:9:0x001c, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    public static WeightScaleUnit fromBytes(byte[] bArr, LsDeviceInfo lsDeviceInfo) {
        byte b = bArr[2];
        UnitType unitType = UnitType.UNIT_KG;
        if (b != unitType.getCommand()) {
            UnitType unitType2 = UnitType.UNIT_LB;
            if (b == unitType2.getCommand()) {
                unitType = unitType2;
            } else {
                unitType2 = UnitType.UNIT_ST;
                if (b == unitType2.getCommand()) {
                    unitType = unitType2;
                } else {
                    unitType2 = UnitType.UNIT_JIN;
                    if (b == unitType2.getCommand()) {
                        unitType = unitType2;
                    }
                }
            }
        }
        WeightScaleUnit weightScaleUnit = new WeightScaleUnit(unitType);
        weightScaleUnit.setBroadcastId(lsDeviceInfo.getBroadcastID());
        weightScaleUnit.setDeviceId(lsDeviceInfo.getDeviceId());
        weightScaleUnit.setMacAddress(lsDeviceInfo.getMacAddress());
        return weightScaleUnit;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty
    public boolean canEqual(Object obj) {
        return obj instanceof WeightScaleUnit;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WeightScaleUnit)) {
            return false;
        }
        WeightScaleUnit weightScaleUnit = (WeightScaleUnit) obj;
        if (!weightScaleUnit.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        UnitType unit = getUnit();
        UnitType unit2 = weightScaleUnit.getUnit();
        return unit != null ? unit.equals(unit2) : unit2 == null;
    }

    public UnitType getUnit() {
        return this.unit;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty
    public int hashCode() {
        int iHashCode = super.hashCode() + 59;
        UnitType unit = getUnit();
        return (iHashCode * 59) + (unit == null ? 43 : unit.hashCode());
    }

    public void setUnit(UnitType unitType) {
        this.unit = unitType;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty
    public String toString() {
        return "WeightScaleUnit(unit=" + getUnit() + ")";
    }
}
