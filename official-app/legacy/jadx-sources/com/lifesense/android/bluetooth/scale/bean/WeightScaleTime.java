package com.lifesense.android.bluetooth.scale.bean;

import com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.tools.e;

/* JADX INFO: loaded from: classes4.dex */
public class WeightScaleTime extends BaseDeviceProperty {
    public int day;
    public int hour;
    public int min;
    public int month;
    public int second;
    public int timeZone;
    public int utc;
    public int year;
    public boolean isSettingUtc = false;
    public boolean isSettingTimeZone = false;
    public boolean isSettingTimeStamp = false;

    public int getDay() {
        return this.day;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMin() {
        return this.min;
    }

    public int getMonth() {
        return this.month;
    }

    public int getSecond() {
        return this.second;
    }

    public int getTimeZone() {
        return this.timeZone;
    }

    public int getUtc() {
        return this.utc;
    }

    public int getYear() {
        return this.year;
    }

    public boolean isSettingTimeStamp() {
        return this.isSettingTimeStamp;
    }

    public boolean isSettingTimeZone() {
        return this.isSettingTimeZone;
    }

    public boolean isSettingUtc() {
        return this.isSettingUtc;
    }

    public void setTimeStamp(int i, int i2, int i3, int i4, int i5, int i6) {
        this.year = i;
        this.month = i2;
        this.day = i3;
        this.hour = i4;
        this.min = i5;
        this.second = i6;
        this.isSettingTimeStamp = true;
    }

    public void setTimeZone(int i) {
        this.timeZone = i;
        this.isSettingTimeZone = true;
    }

    public void setUtc(int i) {
        this.utc = i;
        this.isSettingUtc = true;
    }

    @Override // com.lifesense.android.bluetooth.core.bean.BaseDeviceProperty, com.lifesense.android.bluetooth.core.bean.Bytable
    public byte[] toBytes() {
        byte[] bArrA;
        byte b;
        Byte bValueOf;
        byte[] bArrA2 = e.a((short) PacketProfile.PUSH_TIME_TO_WEIGHT_FOR_A6.getCommndValue());
        int length = 3;
        byte[] bArr = null;
        if (isSettingUtc()) {
            b = (byte) 1;
            bArrA = e.a(getUtc());
            length = 3 + bArrA.length;
        } else {
            bArrA = null;
            b = 0;
        }
        if (isSettingTimeZone()) {
            b = (byte) (b | 2);
            bValueOf = Byte.valueOf((byte) (getTimeZone() & 255));
            length++;
        } else {
            bValueOf = null;
        }
        if (isSettingTimeStamp()) {
            b = (byte) (b | 4);
            bArr = new byte[7];
            byte[] bArrA3 = e.a((short) getYear());
            System.arraycopy(bArrA3, 0, bArr, 0, bArrA3.length);
            int length2 = bArrA3.length + 0;
            bArr[length2] = (byte) (getMonth() & 255);
            int i = length2 + 1;
            bArr[i] = (byte) (getDay() & 255);
            int i2 = i + 1;
            bArr[i2] = (byte) (getHour() & 255);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (getMin() & 255);
            bArr[i3 + 1] = (byte) (getSecond() & 255);
            length += 7;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArrA2, 0, bArr2, 0, bArrA2.length);
        int length3 = bArrA2.length + 0;
        bArr2[length3] = b;
        int length4 = length3 + 1;
        if (bArrA != null) {
            System.arraycopy(bArrA, 0, bArr2, length4, bArrA.length);
            length4 += bArrA.length;
        }
        if (bValueOf != null) {
            bArr2[length4] = bValueOf.byteValue();
            length4++;
        }
        if (bArr != null) {
            System.arraycopy(bArr, 0, bArr2, length4, bArr.length);
        }
        return bArr2;
    }
}
