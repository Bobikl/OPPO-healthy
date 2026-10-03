package com.lifesense.plugin.ble.data.tracker;

import com.lifesense.plugin.ble.data.LSAppCategory;

/* JADX INFO: loaded from: classes5.dex */
public class ATImageMessage extends ATTextMessage {
    private int algorithm;
    private int color;
    private int horizontalPx;
    private byte[] imageBytes;
    private int imageType;
    private ATIotDevice iotDevice;
    private String time;
    private int verticalPx;

    public ATImageMessage(LSAppCategory lSAppCategory) {
        super(lSAppCategory);
    }

    public int getAlgorithm() {
        return this.algorithm;
    }

    public int getColor() {
        return this.color;
    }

    public int getHorizontalPx() {
        return this.horizontalPx;
    }

    public byte[] getImageBytes() {
        return this.imageBytes;
    }

    public int getImageType() {
        return this.imageType;
    }

    public ATIotDevice getIotDevice() {
        return this.iotDevice;
    }

    public String getTime() {
        return this.time;
    }

    public int getVerticalPx() {
        return this.verticalPx;
    }

    public void setAlgorithm(int i) {
        this.algorithm = i;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setHorizontalPx(int i) {
        this.horizontalPx = i;
    }

    public void setImageBytes(byte[] bArr) {
        this.imageBytes = bArr;
    }

    public void setImageType(int i) {
        this.imageType = i;
    }

    public void setIotDevice(ATIotDevice aTIotDevice) {
        this.iotDevice = aTIotDevice;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setVerticalPx(int i) {
        this.verticalPx = i;
    }

    @Override // com.lifesense.plugin.ble.data.tracker.ATTextMessage, com.lifesense.plugin.ble.data.LSDeviceMessage
    public String toString() {
        return "ATImageMessage{imageType=" + this.imageType + ", horizontalPx=" + this.horizontalPx + ", verticalPx=" + this.verticalPx + ", color=" + this.color + ", algorithm=" + this.algorithm + ", time='" + this.time + "', iotDevice=" + this.iotDevice + '}';
    }
}
