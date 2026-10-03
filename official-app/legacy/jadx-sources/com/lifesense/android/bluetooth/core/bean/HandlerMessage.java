package com.lifesense.android.bluetooth.core.bean;

import android.bluetooth.BluetoothGatt;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceConnectState;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.bean.constant.ProductUserInfoType;
import com.lifesense.android.bluetooth.core.protocol.worker.a;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public class HandlerMessage {
    public UUID characteristicName;
    public DeviceConnectState connectState;
    public Object data;
    public BluetoothGatt gatt;
    public LsDeviceInfo lsDevice;
    public String macAddress;
    public PacketProfile packetType;
    public a protocolHandler;
    public UUID serviceName;
    public int sportMode = 1;
    public String srcData;
    public ProductUserInfoType userInfoType;

    public boolean canEqual(Object obj) {
        return obj instanceof HandlerMessage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HandlerMessage)) {
            return false;
        }
        HandlerMessage handlerMessage = (HandlerMessage) obj;
        if (!handlerMessage.canEqual(this)) {
            return false;
        }
        LsDeviceInfo lsDevice = getLsDevice();
        LsDeviceInfo lsDevice2 = handlerMessage.getLsDevice();
        if (lsDevice != null ? !lsDevice.equals(lsDevice2) : lsDevice2 != null) {
            return false;
        }
        Object data = getData();
        Object data2 = handlerMessage.getData();
        if (data != null ? !data.equals(data2) : data2 != null) {
            return false;
        }
        String macAddress = getMacAddress();
        String macAddress2 = handlerMessage.getMacAddress();
        if (macAddress != null ? !macAddress.equals(macAddress2) : macAddress2 != null) {
            return false;
        }
        PacketProfile packetType = getPacketType();
        PacketProfile packetType2 = handlerMessage.getPacketType();
        if (packetType != null ? !packetType.equals(packetType2) : packetType2 != null) {
            return false;
        }
        DeviceConnectState connectState = getConnectState();
        DeviceConnectState connectState2 = handlerMessage.getConnectState();
        if (connectState != null ? !connectState.equals(connectState2) : connectState2 != null) {
            return false;
        }
        if (getSportMode() != handlerMessage.getSportMode()) {
            return false;
        }
        a protocolHandler = getProtocolHandler();
        a protocolHandler2 = handlerMessage.getProtocolHandler();
        if (protocolHandler != null ? !protocolHandler.equals(protocolHandler2) : protocolHandler2 != null) {
            return false;
        }
        UUID serviceName = getServiceName();
        UUID serviceName2 = handlerMessage.getServiceName();
        if (serviceName != null ? !serviceName.equals(serviceName2) : serviceName2 != null) {
            return false;
        }
        UUID characteristicName = getCharacteristicName();
        UUID characteristicName2 = handlerMessage.getCharacteristicName();
        if (characteristicName != null ? !characteristicName.equals(characteristicName2) : characteristicName2 != null) {
            return false;
        }
        BluetoothGatt gatt = getGatt();
        BluetoothGatt gatt2 = handlerMessage.getGatt();
        if (gatt != null ? !gatt.equals(gatt2) : gatt2 != null) {
            return false;
        }
        ProductUserInfoType userInfoType = getUserInfoType();
        ProductUserInfoType userInfoType2 = handlerMessage.getUserInfoType();
        if (userInfoType != null ? !userInfoType.equals(userInfoType2) : userInfoType2 != null) {
            return false;
        }
        String srcData = getSrcData();
        String srcData2 = handlerMessage.getSrcData();
        return srcData != null ? srcData.equals(srcData2) : srcData2 == null;
    }

    public UUID getCharacteristicName() {
        return this.characteristicName;
    }

    public DeviceConnectState getConnectState() {
        return this.connectState;
    }

    public Object getData() {
        return this.data;
    }

    public BluetoothGatt getGatt() {
        return this.gatt;
    }

    public LsDeviceInfo getLsDevice() {
        return this.lsDevice;
    }

    public String getMacAddress() {
        return this.macAddress;
    }

    public PacketProfile getPacketType() {
        return this.packetType;
    }

    public a getProtocolHandler() {
        return this.protocolHandler;
    }

    public UUID getServiceName() {
        return this.serviceName;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    public String getSrcData() {
        return this.srcData;
    }

    public ProductUserInfoType getUserInfoType() {
        return this.userInfoType;
    }

    public int hashCode() {
        LsDeviceInfo lsDevice = getLsDevice();
        int iHashCode = lsDevice == null ? 43 : lsDevice.hashCode();
        Object data = getData();
        int iHashCode2 = ((iHashCode + 59) * 59) + (data == null ? 43 : data.hashCode());
        String macAddress = getMacAddress();
        int iHashCode3 = (iHashCode2 * 59) + (macAddress == null ? 43 : macAddress.hashCode());
        PacketProfile packetType = getPacketType();
        int iHashCode4 = (iHashCode3 * 59) + (packetType == null ? 43 : packetType.hashCode());
        DeviceConnectState connectState = getConnectState();
        int iHashCode5 = (((iHashCode4 * 59) + (connectState == null ? 43 : connectState.hashCode())) * 59) + getSportMode();
        a protocolHandler = getProtocolHandler();
        int iHashCode6 = (iHashCode5 * 59) + (protocolHandler == null ? 43 : protocolHandler.hashCode());
        UUID serviceName = getServiceName();
        int iHashCode7 = (iHashCode6 * 59) + (serviceName == null ? 43 : serviceName.hashCode());
        UUID characteristicName = getCharacteristicName();
        int iHashCode8 = (iHashCode7 * 59) + (characteristicName == null ? 43 : characteristicName.hashCode());
        BluetoothGatt gatt = getGatt();
        int iHashCode9 = (iHashCode8 * 59) + (gatt == null ? 43 : gatt.hashCode());
        ProductUserInfoType userInfoType = getUserInfoType();
        int i = iHashCode9 * 59;
        int iHashCode10 = userInfoType == null ? 43 : userInfoType.hashCode();
        String srcData = getSrcData();
        return ((i + iHashCode10) * 59) + (srcData != null ? srcData.hashCode() : 43);
    }

    public void setCharacteristicName(UUID uuid) {
        this.characteristicName = uuid;
    }

    public void setConnectState(DeviceConnectState deviceConnectState) {
        this.connectState = deviceConnectState;
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public void setGatt(BluetoothGatt bluetoothGatt) {
        this.gatt = bluetoothGatt;
    }

    public void setLsDevice(LsDeviceInfo lsDeviceInfo) {
        this.lsDevice = lsDeviceInfo;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public void setPacketType(PacketProfile packetProfile) {
        this.packetType = packetProfile;
    }

    public void setProtocolHandler(a aVar) {
        this.protocolHandler = aVar;
    }

    public void setServiceName(UUID uuid) {
        this.serviceName = uuid;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSrcData(String str) {
        this.srcData = str;
    }

    public void setUserInfoType(ProductUserInfoType productUserInfoType) {
        this.userInfoType = productUserInfoType;
    }

    public String toString() {
        return "HandlerMessage(lsDevice=" + getLsDevice() + ", data=" + getData() + ", macAddress=" + getMacAddress() + ", packetType=" + getPacketType() + ", connectState=" + getConnectState() + ", sportMode=" + getSportMode() + ", protocolHandler=" + getProtocolHandler() + ", serviceName=" + getServiceName() + ", characteristicName=" + getCharacteristicName() + ", gatt=" + getGatt() + ", userInfoType=" + getUserInfoType() + ", srcData=" + getSrcData() + ")";
    }
}
