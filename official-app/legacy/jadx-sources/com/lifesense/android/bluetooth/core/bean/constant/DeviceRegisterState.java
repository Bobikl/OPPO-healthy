package com.lifesense.android.bluetooth.core.bean.constant;

import com.lifesense.android.bluetooth.core.tools.e;

/* JADX INFO: loaded from: classes4.dex */
public enum DeviceRegisterState {
    UNKNOWN(0),
    NORMAL_UNREGISTER(1),
    REGISTER(2),
    ILLEGAL(3),
    OTHER(255);

    public int command;

    DeviceRegisterState(int i) {
        this.command = i;
    }

    public int getCommand() {
        return this.command;
    }

    public byte[] toBytes(String str) {
        byte[] bArrA = e.a((short) PacketProfile.DEVICE_REGISTE_DEVIEC_ID.getCommndValue());
        byte[] bArrB = e.b(str);
        byte[] bArr = new byte[bArrA.length + bArrB.length + 1];
        System.arraycopy(bArrA, 0, bArr, 0, bArrA.length);
        int length = bArrA.length + 0;
        System.arraycopy(bArrB, 0, bArr, length, bArrB.length);
        bArr[length + bArrB.length] = (byte) getCommand();
        return bArr;
    }
}
