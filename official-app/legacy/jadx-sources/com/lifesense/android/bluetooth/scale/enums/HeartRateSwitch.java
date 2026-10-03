package com.lifesense.android.bluetooth.scale.enums;

import com.lifesense.android.bluetooth.core.bean.Bytable;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.tools.e;

/* JADX INFO: loaded from: classes4.dex */
public enum HeartRateSwitch implements Bytable {
    OPEN(1),
    CLOSE(2);

    public int command;

    HeartRateSwitch(int i) {
        this.command = i;
    }

    public static HeartRateSwitch getHeartRateSwitchByCommand(int i) {
        for (HeartRateSwitch heartRateSwitch : values()) {
            if (heartRateSwitch.command == i) {
                return heartRateSwitch;
            }
        }
        return OPEN;
    }

    public int getCommand() {
        return this.command;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.Bytable
    public byte[] toBytes() {
        String strC = e.c(e.a((short) PacketProfile.PUSH_HEART_RATE_SWITCH_FOR_A6.getCommndValue()));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strC);
        stringBuffer.append(e.a(getCommand() + "", 2));
        return e.a(stringBuffer.toString().toCharArray());
    }
}
