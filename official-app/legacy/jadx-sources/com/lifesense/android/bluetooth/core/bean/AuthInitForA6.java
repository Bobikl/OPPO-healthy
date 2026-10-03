package com.lifesense.android.bluetooth.core.bean;

import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.tools.e;

/* JADX INFO: loaded from: classes4.dex */
public class AuthInitForA6 implements Bytable {
    public int day;
    public int hour;
    public boolean isSlaveLatency;
    public boolean isSupervisoryTimeOut;
    public int min;
    public int month;
    public int mtu;
    public int second;
    public int slaveLatency;
    public int supervisoryTimeOut;
    public int timeZone;
    public int utc;
    public int year;
    public boolean isSettingUtc = false;
    public boolean isSettingTimeZone = false;
    public boolean isSettingTimeStamp = false;

    public static AuthInitForA6 initFromData(byte[] bArr) {
        AuthInitForA6 authInitForA6 = new AuthInitForA6();
        byte b = bArr[2];
        boolean z = (b & 1) == 1;
        boolean z2 = ((b >> 1) & 1) == 1;
        boolean z3 = ((b >> 2) & 1) == 1;
        boolean z4 = ((b >> 3) & 1) == 1;
        boolean z5 = ((b >> 4) & 1) == 1;
        boolean z6 = ((b >> 5) & 1) == 1;
        int i = 3;
        if (z) {
            authInitForA6.setMtu(bArr[3] & 255);
            i = 4;
        }
        if (z2) {
            authInitForA6.setSlaveLatency(bArr[i] & 255);
            i++;
        }
        if (z3) {
            authInitForA6.setSupervisoryTimeOut(bArr[i] & 255);
        }
        authInitForA6.setSettingUtc(z4);
        authInitForA6.setSettingTimeZone(z5);
        authInitForA6.setSettingTimeStamp(z6);
        return authInitForA6;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof AuthInitForA6;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthInitForA6)) {
            return false;
        }
        AuthInitForA6 authInitForA6 = (AuthInitForA6) obj;
        return authInitForA6.canEqual(this) && isSlaveLatency() == authInitForA6.isSlaveLatency() && getSupervisoryTimeOut() == authInitForA6.getSupervisoryTimeOut() && getMtu() == authInitForA6.getMtu() && getSlaveLatency() == authInitForA6.getSlaveLatency() && getSupervisoryTimeOut() == authInitForA6.getSupervisoryTimeOut() && isSettingUtc() == authInitForA6.isSettingUtc() && isSettingTimeZone() == authInitForA6.isSettingTimeZone() && isSettingTimeStamp() == authInitForA6.isSettingTimeStamp() && getUtc() == authInitForA6.getUtc() && getTimeZone() == authInitForA6.getTimeZone() && getYear() == authInitForA6.getYear() && getMonth() == authInitForA6.getMonth() && getDay() == authInitForA6.getDay() && getHour() == authInitForA6.getHour() && getMin() == authInitForA6.getMin() && getSecond() == authInitForA6.getSecond();
    }

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

    public int getMtu() {
        return this.mtu;
    }

    public int getSecond() {
        return this.second;
    }

    public int getSlaveLatency() {
        return this.slaveLatency;
    }

    public int getSupervisoryTimeOut() {
        return this.supervisoryTimeOut;
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

    public int hashCode() {
        return (((((((((((((((((((((((((((((((isSlaveLatency() ? 79 : 97) + 59) * 59) + getSupervisoryTimeOut()) * 59) + getMtu()) * 59) + getSlaveLatency()) * 59) + getSupervisoryTimeOut()) * 59) + (isSettingUtc() ? 79 : 97)) * 59) + (isSettingTimeZone() ? 79 : 97)) * 59) + (isSettingTimeStamp() ? 79 : 97)) * 59) + getUtc()) * 59) + getTimeZone()) * 59) + getYear()) * 59) + getMonth()) * 59) + getDay()) * 59) + getHour()) * 59) + getMin()) * 59) + getSecond();
    }

    public boolean isMtu() {
        return this.mtu != 0;
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

    public boolean isSlaveLatency() {
        return this.isSlaveLatency;
    }

    public boolean isSupervisoryTimeOut() {
        return this.isSupervisoryTimeOut;
    }

    public void setDay(int i) {
        this.day = i;
    }

    public void setHour(int i) {
        this.hour = i;
    }

    public void setMin(int i) {
        this.min = i;
    }

    public void setMonth(int i) {
        this.month = i;
    }

    public void setMtu(int i) {
        this.mtu = i;
    }

    public void setSecond(int i) {
        this.second = i;
    }

    public void setSettingTimeStamp(boolean z) {
        this.isSettingTimeStamp = z;
    }

    public void setSettingTimeZone(boolean z) {
        this.isSettingTimeZone = z;
    }

    public void setSettingUtc(boolean z) {
        this.isSettingUtc = z;
    }

    public void setSlaveLatency(int i) {
        this.isSlaveLatency = true;
        this.slaveLatency = i;
    }

    public void setSupervisoryTimeOut(int i) {
        this.isSupervisoryTimeOut = true;
        this.supervisoryTimeOut = i;
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

    public void setYear(int i) {
        this.year = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // com.lifesense.android.bluetooth.core.bean.Bytable
    public byte[] toBytes() {
        String strC = e.c(e.a((short) PacketProfile.DEVICE_A6_RESPONSE_INIT.getCommndValue()));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strC);
        boolean zIsMtu = isMtu();
        ?? r0 = zIsMtu;
        if (isSlaveLatency()) {
            r0 = (zIsMtu ? 1 : 0) | 2;
        }
        ?? r1 = r0;
        if (isSupervisoryTimeOut()) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        ?? r2 = r1;
        if (isSettingUtc()) {
            r2 = (r1 == true ? 1 : 0) | 8;
        }
        ?? r3 = r2;
        if (isSettingTimeZone()) {
            r3 = (r2 == true ? 1 : 0) | 16;
        }
        ?? r4 = r3;
        if (isSettingTimeStamp()) {
            r4 = (r3 == true ? 1 : 0) | 32;
        }
        stringBuffer.append(e.a(Integer.toHexString(r4 & 255), 2));
        if (isMtu()) {
            stringBuffer.append(e.a(Integer.toHexString(getMtu()), 2));
        }
        if (isSlaveLatency()) {
            stringBuffer.append(e.a(Integer.toHexString(getSlaveLatency()), 2));
        }
        if (isSupervisoryTimeOut()) {
            stringBuffer.append(e.a(Integer.toHexString(getSupervisoryTimeOut()), 2));
        }
        if (isSettingUtc()) {
            stringBuffer.append(e.c(e.a(getUtc())));
        }
        if (isSettingTimeZone()) {
            stringBuffer.append(e.a(Integer.toHexString(getTimeZone()), 2));
        }
        if (isSettingTimeStamp()) {
            byte[] bArr = new byte[7];
            byte[] bArrA = e.a((short) getYear());
            System.arraycopy(bArrA, 0, bArr, 0, bArrA.length);
            int length = bArrA.length + 0;
            bArr[length] = (byte) (getMonth() & 255);
            int i = length + 1;
            bArr[i] = (byte) (getDay() & 255);
            int i2 = i + 1;
            bArr[i2] = (byte) (getHour() & 255);
            int i3 = i2 + 1;
            bArr[i3] = (byte) (getMin() & 255);
            bArr[i3 + 1] = (byte) (getSecond() & 255);
            stringBuffer.append(e.c(bArr));
        }
        return e.a(stringBuffer.toString().toCharArray());
    }

    public String toString() {
        return "AuthInitForA6(isSlaveLatency=" + isSlaveLatency() + ", isSupervisoryTimeOut=" + getSupervisoryTimeOut() + ", mtu=" + getMtu() + ", slaveLatency=" + getSlaveLatency() + ", supervisoryTimeOut=" + getSupervisoryTimeOut() + ", isSettingUtc=" + isSettingUtc() + ", isSettingTimeZone=" + isSettingTimeZone() + ", isSettingTimeStamp=" + isSettingTimeStamp() + ", utc=" + getUtc() + ", timeZone=" + getTimeZone() + ", year=" + getYear() + ", month=" + getMonth() + ", day=" + getDay() + ", hour=" + getHour() + ", min=" + getMin() + ", second=" + getSecond() + ")";
    }
}
