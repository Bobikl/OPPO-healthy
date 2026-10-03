package com.lifesense.android.bluetooth.scale.enums;

import com.lifesense.android.bluetooth.core.bean.Bytable;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.tools.e;

/* JADX INFO: loaded from: classes4.dex */
public enum UnitType implements Bytable {
    UNIT_KG(0),
    UNIT_LB(1),
    UNIT_ST(2),
    UNIT_JIN(3),
    UNIT_GONG_JIN(4);

    public int command;

    UnitType(int i) {
        this.command = i;
    }

    public int getCommand() {
        return this.command;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.Bytable
    public byte[] toBytes() {
        byte[] bArr = new byte[3];
        byte[] bArrA = e.a((short) PacketProfile.PUSH_UNIT_TO_WEIGHT_FOR_A6.getCommndValue());
        byte command = (byte) getCommand();
        System.arraycopy(bArrA, 0, bArr, 0, bArrA.length);
        bArr[bArrA.length + 0] = command;
        return bArr;
    }
}
