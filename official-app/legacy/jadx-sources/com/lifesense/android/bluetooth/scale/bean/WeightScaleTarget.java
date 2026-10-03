package com.lifesense.android.bluetooth.scale.bean;

import com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.tools.e;

/* JADX INFO: loaded from: classes4.dex */
public class WeightScaleTarget extends BaseDeviceProperty {
    public float target;
    public int userNumber;

    public WeightScaleTarget(int i, float f) {
        this.userNumber = i;
        this.target = f;
    }

    public static WeightScaleTarget fromBytes(byte[] bArr, LsDeviceInfo lsDeviceInfo) {
        byte b = bArr[2];
        byte b2 = bArr[3];
        WeightScaleTarget weightScaleTarget = new WeightScaleTarget(b, e.g(e.a(bArr, 4, 8)));
        weightScaleTarget.setBroadcastId(lsDeviceInfo.getBroadcastID());
        weightScaleTarget.setDeviceId(lsDeviceInfo.getDeviceId());
        return weightScaleTarget;
    }

    public float getTarget() {
        return this.target;
    }

    public int getUserNumber() {
        return this.userNumber;
    }

    public void setTarget(float f) {
        this.target = f;
    }

    public void setUserNumber(int i) {
        this.userNumber = i;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty, com.lifesense.android.bluetooth.core.bean.Bytable
    public byte[] toBytes() {
        byte[] bArr = new byte[6];
        byte[] bArrA = e.a((short) PacketProfile.PUSH_TARGET_TO_WEIGHT_FOR_A6.getCommndValue());
        byte userNumber = (byte) (getUserNumber() & 255);
        byte[] bArrA2 = e.a((short) (getTarget() * 100.0f));
        System.arraycopy(bArrA, 0, bArr, 0, bArrA.length);
        int length = bArrA.length + 0;
        bArr[length] = userNumber;
        int i = length + 1;
        bArr[i] = 1;
        System.arraycopy(bArrA2, 0, bArr, i + 1, bArrA2.length);
        return bArr;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty
    public String toString() {
        return "WeightTarget [userNumber=" + this.userNumber + ", target=" + this.target + "]";
    }
}
