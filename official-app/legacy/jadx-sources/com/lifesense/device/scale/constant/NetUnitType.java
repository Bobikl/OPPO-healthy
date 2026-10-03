package com.lifesense.device.scale.constant;

import com.lifesense.android.bluetooth.scale.enums.UnitType;

/* JADX INFO: loaded from: classes4.dex */
public enum NetUnitType {
    KG(1, UnitType.UNIT_KG),
    JIN(2, UnitType.UNIT_JIN),
    LB(3, UnitType.UNIT_LB),
    ST(4, UnitType.UNIT_ST);

    public int netUnitTypeCommand;
    public UnitType unitType;

    NetUnitType(int i, UnitType unitType) {
        this.netUnitTypeCommand = i;
        this.unitType = unitType;
    }

    public static NetUnitType getUnitByNetUnitType(int i) {
        for (NetUnitType netUnitType : values()) {
            if (netUnitType.netUnitTypeCommand == i) {
                return netUnitType;
            }
        }
        return KG;
    }

    public static NetUnitType getUnitByUnitType(UnitType unitType) {
        for (NetUnitType netUnitType : values()) {
            if (netUnitType.unitType == unitType) {
                return netUnitType;
            }
        }
        return KG;
    }

    public int getNetUnitTypeCommand() {
        return this.netUnitTypeCommand;
    }

    public UnitType getUnitType() {
        return this.unitType;
    }
}
