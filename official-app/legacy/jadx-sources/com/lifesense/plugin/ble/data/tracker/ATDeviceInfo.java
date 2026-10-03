package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.c.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public class ATDeviceInfo extends ATDeviceData {
    private String customVersion;
    private String deviceMac;
    private String endTimeOfHRDisable;
    private String firmwareVersion;
    private int flag;
    private String hardwareVersion;
    private String model;
    private int remainDataCount;
    private String startTimeOfHRDisable;
    private boolean stateOfBond;
    private boolean statusOfHeartRate;
    private int timezone;

    public ATDeviceInfo(byte[] bArr) {
        super(bArr);
    }

    public String getCustomVersion() {
        return this.customVersion;
    }

    public String getDeviceMac() {
        return this.deviceMac;
    }

    public String getEndTimeOfHRDisable() {
        return this.endTimeOfHRDisable;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public int getFlag() {
        return this.flag;
    }

    public String getHardwareVersion() {
        return this.hardwareVersion;
    }

    public String getModel() {
        return this.model;
    }

    public int getRemainDataCount() {
        return this.remainDataCount;
    }

    public String getStartTimeOfHRDisable() {
        return this.startTimeOfHRDisable;
    }

    public int getTimezone() {
        return this.timezone;
    }

    public boolean isStateOfBond() {
        return this.stateOfBond;
    }

    public boolean isStatusOfHeartRate() {
        return this.statusOfHeartRate;
    }

    @Override // com.lifesense.plugin.ble.data.IPacketDecoder
    public void parse(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        try {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
            this.cmd = toUnsignedInt(byteBufferOrder.get());
            byte[] bArr2 = new byte[6];
            byteBufferOrder.get(bArr2, 0, 6);
            this.deviceMac = a.d(bArr2);
            byte[] bArr3 = new byte[5];
            byteBufferOrder.get(bArr3, 0, 5);
            this.model = a.b(bArr3);
            byte[] bArr4 = new byte[4];
            byteBufferOrder.get(bArr4, 0, 4);
            this.firmwareVersion = a.a(bArr4);
            byte[] bArr5 = new byte[4];
            byteBufferOrder.get(bArr5, 0, 4);
            this.hardwareVersion = a.a(bArr5);
            this.timezone = toUnsignedInt(byteBufferOrder.get());
            int unsignedInt = toUnsignedInt(byteBufferOrder.get());
            this.flag = unsignedInt;
            this.statusOfHeartRate = unsignedInt == 1;
            this.stateOfBond = unsignedInt == 3;
            if (unsignedInt == 0) {
                this.startTimeOfHRDisable = toUnsignedInt(byteBufferOrder.get()) + ":" + toUnsignedInt(byteBufferOrder.get());
                this.endTimeOfHRDisable = toUnsignedInt(byteBufferOrder.get()) + ":" + toUnsignedInt(byteBufferOrder.get());
            }
            if (bArr.length - byteBufferOrder.position() >= 4) {
                this.remainDataCount = byteBufferOrder.getInt();
            }
            if (bArr.length - byteBufferOrder.position() > 0) {
                int length = (bArr.length - byteBufferOrder.position()) - 1;
                byte[] bArr6 = new byte[length];
                byteBufferOrder.get(bArr6, 0, length);
                this.customVersion = a.i(bArr6);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void setCustomVersion(String str) {
        this.customVersion = str;
    }

    public void setDeviceMac(String str) {
        this.deviceMac = str;
    }

    public void setEndTimeOfHRDisable(String str) {
        this.endTimeOfHRDisable = str;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public void setHardwareVersion(String str) {
        this.hardwareVersion = str;
    }

    public void setModel(String str) {
        this.model = str;
    }

    public void setRemainDataCount(int i) {
        this.remainDataCount = i;
    }

    public void setStartTimeOfHRDisable(String str) {
        this.startTimeOfHRDisable = str;
    }

    public void setStateOfBond(boolean z) {
        this.stateOfBond = z;
    }

    public void setStatusOfHeartRate(boolean z) {
        this.statusOfHeartRate = z;
    }

    public void setTimezone(int i) {
        this.timezone = i;
    }

    public String toString() {
        return "ATDeviceInfo{deviceMac='" + this.deviceMac + "', model='" + this.model + "', firmwareVersion='" + this.firmwareVersion + "', hardwareVersion='" + this.hardwareVersion + "', timezone=" + this.timezone + ", flag=" + this.flag + ", statusOfHeartRate=" + this.statusOfHeartRate + ", stateOfBond=" + this.stateOfBond + ", startTimeOfHRDisable='" + this.startTimeOfHRDisable + "', endTimeOfHRDisable='" + this.endTimeOfHRDisable + "', remainDataCount=" + this.remainDataCount + ", customVersion='" + this.customVersion + "'}";
    }
}
