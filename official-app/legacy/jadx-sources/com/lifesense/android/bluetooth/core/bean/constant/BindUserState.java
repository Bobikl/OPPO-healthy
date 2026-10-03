package com.lifesense.android.bluetooth.core.bean.constant;

import com.lifesense.android.bluetooth.core.bean.Bytable;
import com.lifesense.android.bluetooth.core.tools.e;

/* JADX INFO: loaded from: classes4.dex */
public enum BindUserState implements Bytable {
    GUEST(0),
    USER1(1),
    USER2(2),
    USER3(3),
    USER4(4),
    INVALID_USER(255);

    public int command;

    BindUserState(int i) {
        this.command = i;
    }

    public int getCommand() {
        return this.command;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.Bytable
    public byte[] toBytes() {
        String strC = e.c(e.a((short) PacketProfile.DEVICE_A6_UNBIND_NOTICE.getCommndValue()));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strC);
        stringBuffer.append(e.a(getCommand() + "", 2));
        return e.a(stringBuffer.toString().toCharArray());
    }
}
