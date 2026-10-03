package com.lifesense.android.bluetooth.core.bean.constant;

import com.lifesense.android.bluetooth.core.tools.e;

/* JADX INFO: loaded from: classes4.dex */
public enum PairedConfirmState {
    PAIRING_SUCCESS(1),
    PAIRING_FAIL(2),
    UNREGISTERED(3),
    ILLEGAL(4),
    OTHER(255);

    public int command;

    PairedConfirmState(int i) {
        this.command = i;
    }

    public byte[] getBindNotice(int i) {
        String strC = e.c(e.a((short) PacketProfile.DEVICE_A6_BIND_NOTICE.getCommndValue()));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strC);
        stringBuffer.append(e.a(i + "", 2));
        stringBuffer.append(e.a(getCommand() + "", 2));
        return e.a(stringBuffer.toString().toCharArray());
    }

    public int getCommand() {
        return this.command;
    }
}
