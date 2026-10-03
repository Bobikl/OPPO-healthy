package com.lifesense.plugin.ble.data.other;

import android.bluetooth.BluetoothGatt;
import com.lifesense.plugin.ble.data.LSConnectState;
import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.device.proto.q;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class HandlerMessage {
    private UUID characteristicName;
    private LSConnectState connectState;
    private Object data;
    private BluetoothGatt gatt;
    private LSDeviceInfo lsDevice;
    private String macAddress;
    private int packetType;
    private q protocolHandler;
    private UUID serviceName;
    private String srcData;
    private ProductUserInfoType userInfoType;

    public UUID getCharacteristicName() {
        return this.characteristicName;
    }

    public LSConnectState getConnectState() {
        return this.connectState;
    }

    public synchronized Object getData() {
        return this.data;
    }

    public synchronized BluetoothGatt getGatt() {
        return this.gatt;
    }

    public synchronized LSDeviceInfo getLsDevice() {
        return this.lsDevice;
    }

    public synchronized String getMacAddress() {
        return this.macAddress;
    }

    public synchronized int getPacketType() {
        return this.packetType;
    }

    public q getProtocolHandler() {
        return this.protocolHandler;
    }

    public UUID getServiceName() {
        return this.serviceName;
    }

    public String getSrcData() {
        return this.srcData;
    }

    public ProductUserInfoType getUserInfoType() {
        return this.userInfoType;
    }

    public void setCharacteristicName(UUID uuid) {
        this.characteristicName = uuid;
    }

    public void setConnectState(LSConnectState lSConnectState) {
        this.connectState = lSConnectState;
    }

    public synchronized void setData(Object obj) {
        this.data = obj;
    }

    public synchronized void setGatt(BluetoothGatt bluetoothGatt) {
        this.gatt = bluetoothGatt;
    }

    public synchronized void setLsDevice(LSDeviceInfo lSDeviceInfo) {
        this.lsDevice = lSDeviceInfo;
    }

    public synchronized void setMacAddress(String str) {
        this.macAddress = str;
    }

    public synchronized void setPacketType(int i) {
        this.packetType = i;
    }

    public void setProtocolHandler(q qVar) {
        this.protocolHandler = qVar;
    }

    public void setServiceName(UUID uuid) {
        this.serviceName = uuid;
    }

    public void setSrcData(String str) {
        this.srcData = str;
    }

    public void setUserInfoType(ProductUserInfoType productUserInfoType) {
        this.userInfoType = productUserInfoType;
    }

    public String toString() {
        return "HandlerMessage{lsDevice=" + this.lsDevice + ", data=" + this.data + ", macAddress='" + this.macAddress + "', packetType=" + this.packetType + ", connectState=" + this.connectState + ", protocolHandler=" + this.protocolHandler + ", serviceName=" + this.serviceName + ", characteristicName=" + this.characteristicName + ", gatt=" + this.gatt + ", userInfoType=" + this.userInfoType + ", srcData='" + this.srcData + "'}";
    }
}
