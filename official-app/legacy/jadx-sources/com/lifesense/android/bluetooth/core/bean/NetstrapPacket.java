package com.lifesense.android.bluetooth.core.bean;

import com.oplus.carlink.controlsdk.Constant;
import com.oplus.weatherservicesdk.data.Weather;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class NetstrapPacket {
    public static final int AUTH_MODE_OPEN = 0;
    public static final int AUTH_MODE_WEP = 1;
    public static final int AUTH_MODE_WPA2_ENTERPRISE_PSK = 5;
    public static final int AUTH_MODE_WPA2_PSK = 3;
    public static final int AUTH_MODE_WPA_PSK = 2;
    public static final int AUTH_MODE_WPA_WPA2_PSK = 4;
    public static final int CONNECT_STATUS_SUCCESS = 0;
    public static final int PDU_TYPE_BLEWIFI_RSP_WIFI_STATUS = 4103;
    public static final int PDU_TYPE_CAL_EXT_READ_REQ = 1546;
    public static final int PDU_TYPE_CAL_EXT_READ_RSP = 5642;
    public static final int PDU_TYPE_CAL_EXT_READ_VDD_VOUT_REQ = 1547;
    public static final int PDU_TYPE_CAL_EXT_READ_VDD_VOUT_RSP = 5643;
    public static final int PDU_TYPE_CAL_EXT_REQ = 1545;
    public static final int PDU_TYPE_CAL_EXT_RSP = 5641;
    public static final int PDU_TYPE_CAL_READ_USER_DEFINE_OFFSET_REQ = 2050;
    public static final int PDU_TYPE_CAL_READ_USER_DEFINE_OFFSET_RSP = 6146;
    public static final int PDU_TYPE_CAL_USER_DEFINE_OFFSET_REQ = 2049;
    public static final int PDU_TYPE_CAL_USER_DEFINE_OFFSET_RSP = 6145;
    public static final int PDU_TYPE_CMD_BLEWIFI_REQ_WIFI_STATUS = 6;
    public static final int PDU_TYPE_CMD_CONNECT_REQ = 1;
    public static final int PDU_TYPE_CMD_OTA_END_REQ = 259;
    public static final int PDU_TYPE_CMD_OTA_RAW_DATA_REQ = 258;
    public static final int PDU_TYPE_CMD_OTA_UPGRADE_REQ = 257;
    public static final int PDU_TYPE_CMD_OTA_VERSION_REQ = 256;
    public static final int PDU_TYPE_CMD_READ_DEVICE_INFO_REQ = 4;
    public static final int PDU_TYPE_CMD_SCAN_REQ = 0;
    public static final int PDU_TYPE_CMD_WRITE_DEVICE_INFO_REQ = 5;
    public static final int PDU_TYPE_EVT_CONNECT_RSP = 4098;
    public static final int PDU_TYPE_EVT_OTA_END_RSP = 4355;
    public static final int PDU_TYPE_EVT_OTA_RAW_DATA_RSP = 4354;
    public static final int PDU_TYPE_EVT_OTA_UPGRADE_RSP = 4353;
    public static final int PDU_TYPE_EVT_OTA_VERSION_RSP = 4352;
    public static final int PDU_TYPE_EVT_READ_DEVICE_INFO_RSP = 4101;
    public static final int PDU_TYPE_EVT_SCAN_END = 4097;
    public static final int PDU_TYPE_EVT_SCAN_RSP = 4096;
    public static final int PDU_TYPE_EVT_WRITE_DEVICE_INFO_RSP = 4102;
    public static final int PDU_TYPE_IO_VOL_CAL = 1026;
    public static final int PDU_TYPE_IO_VOL_CAL_RSP = 5122;
    public static final int PDU_TYPE_READ_BLE_MAC_REQ = 1541;
    public static final int PDU_TYPE_READ_BLE_MAC_RSP = 5637;
    public static final int PDU_TYPE_READ_DEVICE_MODE = 1029;
    public static final int PDU_TYPE_READ_DEVICE_MODE_RSP = 5125;
    public static final int PDU_TYPE_READ_MAC_SOURCE_REQ = 1544;
    public static final int PDU_TYPE_READ_MAC_SOURCE_RSP = 5640;
    public static final int PDU_TYPE_READ_WIFI_MAC_REQ = 1539;
    public static final int PDU_TYPE_READ_WIFI_MAC_RSP = 5635;
    public static final int PDU_TYPE_RESET_RSP = 5633;
    public static final int PDU_TYPE_RESET_WIFI_REQ = 7;
    public static final int PDU_TYPE_SEND_BLE_STR_REQ = 1542;
    public static final int PDU_TYPE_SEND_BLE_STR_RSP = 5638;
    public static final int PDU_TYPE_SEND_SINGLE_TONE_REQ = 1689;
    public static final int PDU_TYPE_SEND_SINGLE_TONE_RSP = 5785;
    public static final int PDU_TYPE_SET_DEVICE_MODE = 1028;
    public static final int PDU_TYPE_SET_DEVICE_MODE_RSP = 5124;
    public static final int PDU_TYPE_TEMP_CAL = 1027;
    public static final int PDU_TYPE_TEMP_CAL_RSP = 5123;
    public static final int PDU_TYPE_VBATT_CAL = 1025;
    public static final int PDU_TYPE_VBATT_CAL_RSP = 5121;
    public static final int PDU_TYPE_WRITE_BLE_MAC_REQ = 1540;
    public static final int PDU_TYPE_WRITE_BLE_MAC_RSP = 5636;
    public static final int PDU_TYPE_WRITE_MAC_SOURCE_REQ = 1543;
    public static final int PDU_TYPE_WRITE_MAC_SOURCE_RSP = 5639;
    public static final int PDU_TYPE_WRITE_WIFI_MAC_REQ = 1538;
    public static final int PDU_TYPE_WRITE_WIFI_MAC_RSP = 5634;
    public static final int SCAN_TYPE_ACTIVE = 0;
    public static final int SCAN_TYPE_MIX = 2;
    public static final int SCAN_TYPE_PASSIVE = 1;
    public static int currentLength;
    public static ByteBuffer rxBuffer;
    public int ApConnectStatus;
    public int Ap_ConnectStatus;
    public int Apflag;
    public byte IndexForTempCal;
    public String ReadbackStr;
    public int authMode;
    public byte[] bssid;
    public long chipId;
    public int cmdId;
    public int connectStatus;
    public String connnected_ssid;
    public byte[] deviceId;
    public byte devicemode;
    public long fwId;
    public String gatewayaddr;
    public String ipaddr;
    public int length;
    public String manufactureName;
    public String maskaddr;
    public int maxRxOctet;
    public String password;
    public long projectId;
    public byte[] rawData;
    public int reason;
    public int rssi;
    public int scanType;
    public boolean showHidden;
    public String ssid;
    public int status;
    public int writeStatus;
    public byte[] bleMac = new byte[6];
    public byte[] WiFiMac = new byte[6];
    public byte[] MacSrc = new byte[2];
    public float[] CalExtReadValue = new float[6];
    public int CalExtIndex = 0;

    public static NetstrapPacket createBleStringPacket(byte[] bArr) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = PDU_TYPE_SEND_BLE_STR_REQ;
        netstrapPacket.rawData = bArr;
        return netstrapPacket;
    }

    public static NetstrapPacket createCalExtReadOffsetPacket() {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = PDU_TYPE_CAL_READ_USER_DEFINE_OFFSET_REQ;
        return netstrapPacket;
    }

    public static NetstrapPacket createCalExtReadPacket() {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 1546;
        return netstrapPacket;
    }

    public static NetstrapPacket createCalExtReadVddVoutPacket() {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = PDU_TYPE_CAL_EXT_READ_VDD_VOUT_REQ;
        return netstrapPacket;
    }

    public static NetstrapPacket createConnectReqPacket(byte[] bArr, String str, int i) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 1;
        netstrapPacket.bssid = bArr;
        netstrapPacket.password = str;
        netstrapPacket.Ap_ConnectStatus = i;
        return netstrapPacket;
    }

    public static NetstrapPacket createDeviceModePacket(byte b) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 1028;
        netstrapPacket.devicemode = b;
        return netstrapPacket;
    }

    public static NetstrapPacket createOtaEndReqPacket(int i) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 259;
        netstrapPacket.reason = i;
        return netstrapPacket;
    }

    public static NetstrapPacket createOtaRawDataReqPacket(byte[] bArr) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 258;
        netstrapPacket.rawData = bArr;
        return netstrapPacket;
    }

    public static NetstrapPacket createOtaUpgradeReqPacket(int i, byte[] bArr) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 257;
        netstrapPacket.maxRxOctet = i;
        netstrapPacket.rawData = bArr;
        return netstrapPacket;
    }

    public static NetstrapPacket createOtaVersionReqPacket() {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 256;
        return netstrapPacket;
    }

    public static NetstrapPacket createReadBleMacPacket() {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = PDU_TYPE_READ_BLE_MAC_REQ;
        return netstrapPacket;
    }

    public static NetstrapPacket createReadDeviceInfoReqPacket() {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 4;
        return netstrapPacket;
    }

    public static NetstrapPacket createReadDeviceModePacket() {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 1029;
        return netstrapPacket;
    }

    public static NetstrapPacket createReadDeviceWiFiInfoPacket() {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 6;
        return netstrapPacket;
    }

    public static NetstrapPacket createReadMacSrcPacket() {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = PDU_TYPE_READ_MAC_SOURCE_REQ;
        return netstrapPacket;
    }

    public static NetstrapPacket createReadWiFiMacPacket() {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = PDU_TYPE_READ_WIFI_MAC_REQ;
        return netstrapPacket;
    }

    public static NetstrapPacket createResetPacket() {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 7;
        return netstrapPacket;
    }

    public static NetstrapPacket createScanReqPacket(boolean z, int i) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 0;
        netstrapPacket.showHidden = z;
        netstrapPacket.scanType = i;
        return netstrapPacket;
    }

    public static NetstrapPacket createSingleTonePacket(short s, int i) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = PDU_TYPE_SEND_SINGLE_TONE_REQ;
        netstrapPacket.rawData = new byte[6];
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byte[] bArrArray = byteBufferAllocate.order(byteOrder).putShort(s).array();
        byte[] bArr = netstrapPacket.rawData;
        bArr[0] = bArrArray[0];
        bArr[1] = bArrArray[1];
        byte[] bArrArray2 = ByteBuffer.allocate(4).order(byteOrder).putInt(i).array();
        byte[] bArr2 = netstrapPacket.rawData;
        bArr2[2] = bArrArray2[0];
        bArr2[3] = bArrArray2[1];
        bArr2[4] = bArrArray2[2];
        bArr2[5] = bArrArray2[3];
        return netstrapPacket;
    }

    public static NetstrapPacket createWriteBleMacPacket(byte[] bArr) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = PDU_TYPE_WRITE_BLE_MAC_REQ;
        netstrapPacket.rawData = bArr;
        return netstrapPacket;
    }

    public static NetstrapPacket createWriteDeviceInfoReqPacket(byte[] bArr, String str) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 5;
        netstrapPacket.deviceId = bArr;
        netstrapPacket.manufactureName = str;
        return netstrapPacket;
    }

    public static NetstrapPacket createWriteMacSrcPacket(byte b, byte b2) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = PDU_TYPE_WRITE_MAC_SOURCE_REQ;
        netstrapPacket.rawData = new byte[]{b, b2};
        return netstrapPacket;
    }

    public static NetstrapPacket createWriteWiFiMacPacket(byte[] bArr) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = PDU_TYPE_WRITE_WIFI_MAC_REQ;
        netstrapPacket.rawData = bArr;
        return netstrapPacket;
    }

    public static NetstrapPacket createcalTempextPacket(int i, float f) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 1027;
        byte[] bArr = new byte[5];
        netstrapPacket.rawData = bArr;
        bArr[0] = (byte) i;
        byte[] bArrArray = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f).array();
        byte[] bArr2 = netstrapPacket.rawData;
        bArr2[1] = bArrArray[0];
        bArr2[2] = bArrArray[1];
        bArr2[3] = bArrArray[2];
        bArr2[4] = bArrArray[3];
        return netstrapPacket;
    }

    public static NetstrapPacket createcalextPacket(float f, float f2, float f3, float f4, float f5, float f6) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 1545;
        netstrapPacket.rawData = new byte[24];
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byte[] bArrArray = byteBufferAllocate.order(byteOrder).putFloat(f).array();
        byte[] bArr = netstrapPacket.rawData;
        bArr[0] = bArrArray[0];
        bArr[1] = bArrArray[1];
        bArr[2] = bArrArray[2];
        bArr[3] = bArrArray[3];
        byte[] bArrArray2 = ByteBuffer.allocate(4).order(byteOrder).putFloat(f2).array();
        byte[] bArr2 = netstrapPacket.rawData;
        bArr2[4] = bArrArray2[0];
        bArr2[5] = bArrArray2[1];
        bArr2[6] = bArrArray2[2];
        bArr2[7] = bArrArray2[3];
        byte[] bArrArray3 = ByteBuffer.allocate(4).order(byteOrder).putFloat(f3).array();
        byte[] bArr3 = netstrapPacket.rawData;
        bArr3[8] = bArrArray3[0];
        bArr3[9] = bArrArray3[1];
        bArr3[10] = bArrArray3[2];
        bArr3[11] = bArrArray3[3];
        byte[] bArrArray4 = ByteBuffer.allocate(4).order(byteOrder).putFloat(f4).array();
        byte[] bArr4 = netstrapPacket.rawData;
        bArr4[12] = bArrArray4[0];
        bArr4[13] = bArrArray4[1];
        bArr4[14] = bArrArray4[2];
        bArr4[15] = bArrArray4[3];
        byte[] bArrArray5 = ByteBuffer.allocate(4).order(byteOrder).putFloat(f5).array();
        byte[] bArr5 = netstrapPacket.rawData;
        bArr5[16] = bArrArray5[0];
        bArr5[17] = bArrArray5[1];
        bArr5[18] = bArrArray5[2];
        bArr5[19] = bArrArray5[3];
        byte[] bArrArray6 = ByteBuffer.allocate(4).order(byteOrder).putFloat(f6).array();
        byte[] bArr6 = netstrapPacket.rawData;
        bArr6[20] = bArrArray6[0];
        bArr6[21] = bArrArray6[1];
        bArr6[22] = bArrArray6[2];
        bArr6[23] = bArrArray6[3];
        return netstrapPacket;
    }

    public static NetstrapPacket createcaliovolPacket(byte b, float f) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 1026;
        byte[] bArr = new byte[5];
        netstrapPacket.rawData = bArr;
        bArr[0] = b;
        byte[] bArrArray = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f).array();
        byte[] bArr2 = netstrapPacket.rawData;
        bArr2[1] = bArrArray[0];
        bArr2[2] = bArrArray[1];
        bArr2[3] = bArrArray[2];
        bArr2[4] = bArrArray[3];
        return netstrapPacket;
    }

    public static NetstrapPacket createcaltempPacket(float f) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 1027;
        netstrapPacket.rawData = ByteBuffer.allocate(5).order(ByteOrder.LITTLE_ENDIAN).putFloat(f).array();
        return netstrapPacket;
    }

    public static NetstrapPacket createcaluserdefinePacket(float f) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 2049;
        netstrapPacket.rawData = new byte[4];
        byte[] bArrArray = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f).array();
        byte[] bArr = netstrapPacket.rawData;
        bArr[0] = bArrArray[0];
        bArr[1] = bArrArray[1];
        bArr[2] = bArrArray[2];
        bArr[3] = bArrArray[3];
        return netstrapPacket;
    }

    public static NetstrapPacket createcalvbattPacket(float f) {
        NetstrapPacket netstrapPacket = new NetstrapPacket();
        netstrapPacket.cmdId = 1025;
        netstrapPacket.rawData = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f).array();
        return netstrapPacket;
    }

    public static void decodeCalExtReadRsp(NetstrapPacket netstrapPacket, ByteBuffer byteBuffer) {
        netstrapPacket.CalExtReadValue[0] = byteBuffer.getFloat(4);
        netstrapPacket.CalExtReadValue[1] = byteBuffer.getFloat(8);
        netstrapPacket.CalExtReadValue[2] = byteBuffer.getFloat(12);
        netstrapPacket.CalExtReadValue[3] = byteBuffer.getFloat(16);
        netstrapPacket.CalExtReadValue[4] = byteBuffer.getFloat(20);
        netstrapPacket.CalExtReadValue[5] = byteBuffer.getFloat(24);
    }

    public static void decodeCalExtReadUerdefineRsp(NetstrapPacket netstrapPacket, ByteBuffer byteBuffer) {
        netstrapPacket.CalExtReadValue[0] = byteBuffer.getFloat(4);
    }

    public static void decodeCalExtReadVddVoutRsp(NetstrapPacket netstrapPacket, ByteBuffer byteBuffer) {
        netstrapPacket.CalExtReadValue[0] = byteBuffer.getFloat(4);
        netstrapPacket.CalExtReadValue[1] = byteBuffer.getFloat(8);
    }

    public static void decodeDeviceWifiStatusRsp(NetstrapPacket netstrapPacket, ByteBuffer byteBuffer) {
        int i = byteBuffer.get(5);
        netstrapPacket.connectStatus = byteBuffer.get(4);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = byteBuffer.get(i2 + 6);
        }
        netstrapPacket.ssid = new String(bArr);
    }

    public static void decodeOtaVersionRsp(NetstrapPacket netstrapPacket, ByteBuffer byteBuffer) {
        netstrapPacket.status = byteBuffer.get(4);
        netstrapPacket.projectId = byteBuffer.getInt(5);
        netstrapPacket.chipId = byteBuffer.getInt(7);
        netstrapPacket.fwId = byteBuffer.getInt(9);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00de A[Catch: all -> 0x013c, FALL_THROUGH, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000e, B:7:0x001a, B:8:0x0042, B:10:0x0050, B:28:0x0081, B:29:0x0084, B:30:0x0087, B:48:0x00f3, B:49:0x00fb, B:51:0x00ff, B:52:0x010c, B:35:0x00a1, B:36:0x00a7, B:37:0x00ad, B:38:0x00b3, B:32:0x008c, B:33:0x0092, B:34:0x009b, B:39:0x00b9, B:40:0x00bf, B:41:0x00c6, B:42:0x00c9, B:43:0x00d2, B:44:0x00d8, B:45:0x00de, B:46:0x00e5, B:47:0x00ee, B:53:0x0122), top: B:59:0x0003 }] */
    public static synchronized List<NetstrapPacket> decodePacket(byte[] bArr) {
        ArrayList arrayList;
        byte b;
        arrayList = new ArrayList();
        if (rxBuffer == null) {
            rxBuffer = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        }
        rxBuffer.put(bArr);
        currentLength += bArr.length;
        StringBuilder sb = new StringBuilder();
        sb.append("in: ");
        sb.append(bArr.length);
        sb.append(", all: ");
        sb.append(currentLength);
        sb.append(", ");
        while (true) {
            int i = rxBuffer.getShort(2) + 4;
            if (currentLength >= i) {
                NetstrapPacket netstrapPacket = new NetstrapPacket();
                short s = rxBuffer.getShort(0);
                netstrapPacket.cmdId = s;
                if (s == 4352) {
                    decodeOtaVersionRsp(netstrapPacket, rxBuffer);
                } else if (s == 4353) {
                    netstrapPacket.status = rxBuffer.get(4);
                } else if (s == 6145) {
                    b = rxBuffer.get(4);
                    netstrapPacket.reason = b;
                } else if (s == 6146) {
                    decodeCalExtReadUerdefineRsp(netstrapPacket, rxBuffer);
                } else if (s == 4096) {
                    decodeScanRsp(netstrapPacket, rxBuffer);
                } else if (s != 4098) {
                    if (s != 5633) {
                        if (s != 5635) {
                            if (s != 5785) {
                                switch (s) {
                                    case 4101:
                                        decodeReadDeviceInfoRsp(netstrapPacket, rxBuffer);
                                        break;
                                    case 4102:
                                        netstrapPacket.writeStatus = rxBuffer.get(4);
                                        break;
                                    case 4103:
                                        decodeDeviceWifiStatusRsp(netstrapPacket, rxBuffer);
                                        break;
                                    default:
                                        switch (s) {
                                            case 5121:
                                            case 5122:
                                                break;
                                            default:
                                                switch (s) {
                                                    case PDU_TYPE_READ_BLE_MAC_RSP /* 5637 */:
                                                        decodeReadbleMacRsp(netstrapPacket, rxBuffer);
                                                        break;
                                                    case PDU_TYPE_READ_MAC_SOURCE_RSP /* 5640 */:
                                                        decodeReadMacSrcRsp(netstrapPacket, rxBuffer);
                                                        break;
                                                    case PDU_TYPE_CAL_EXT_READ_RSP /* 5642 */:
                                                        decodeCalExtReadRsp(netstrapPacket, rxBuffer);
                                                        decodeCalExtReadUerdefineRsp(netstrapPacket, rxBuffer);
                                                        break;
                                                    case PDU_TYPE_CAL_EXT_READ_VDD_VOUT_RSP /* 5643 */:
                                                        decodeCalExtReadVddVoutRsp(netstrapPacket, rxBuffer);
                                                        break;
                                                }
                                            case 5123:
                                            case 5124:
                                            case 5125:
                                                b = rxBuffer.get(4);
                                                netstrapPacket.reason = b;
                                                break;
                                        }
                                        break;
                                }
                            }
                            b = rxBuffer.get(4);
                            netstrapPacket.reason = b;
                        } else {
                            decodeReadwifiMacRsp(netstrapPacket, rxBuffer);
                        }
                    }
                    b = rxBuffer.get(6);
                    netstrapPacket.reason = b;
                } else {
                    netstrapPacket.connectStatus = rxBuffer.get(4);
                }
                currentLength -= i;
                byte[] bArr2 = new byte[1024];
                for (int i2 = 0; i2 < currentLength; i2++) {
                    bArr2[i2] = rxBuffer.get(i + i2);
                }
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
                byteBufferOrder.put(bArr2, 0, currentLength);
                rxBuffer = byteBufferOrder;
                arrayList.add(netstrapPacket);
            } else {
                currentLength = 0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("rx_pkt: ");
                sb2.append(arrayList.size());
                rxBuffer.clear();
            }
        }
        return arrayList;
    }

    public static void decodeReadDeviceInfoRsp(NetstrapPacket netstrapPacket, ByteBuffer byteBuffer) {
        byte[] bArr = new byte[6];
        for (int i = 0; i < 6; i++) {
            bArr[i] = byteBuffer.get(4 + i);
        }
        netstrapPacket.deviceId = bArr;
        int i2 = byteBuffer.get(10);
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr2[i3] = byteBuffer.get(11 + i3);
        }
        netstrapPacket.manufactureName = new String(bArr2);
    }

    public static void decodeReadMacSrcRsp(NetstrapPacket netstrapPacket, ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2];
        for (int i = 0; i < 2; i++) {
            bArr[i] = byteBuffer.get(4 + i);
        }
        netstrapPacket.MacSrc = bArr;
    }

    public static void decodeReadbleMacRsp(NetstrapPacket netstrapPacket, ByteBuffer byteBuffer) {
        byte[] bArr = new byte[6];
        for (int i = 0; i < 6; i++) {
            bArr[i] = byteBuffer.order(ByteOrder.BIG_ENDIAN).get(4 + i);
        }
        netstrapPacket.bleMac = bArr;
    }

    public static void decodeReadwifiMacRsp(NetstrapPacket netstrapPacket, ByteBuffer byteBuffer) {
        byte[] bArr = new byte[6];
        for (int i = 0; i < 6; i++) {
            bArr[i] = byteBuffer.order(ByteOrder.BIG_ENDIAN).get(4 + i);
        }
        netstrapPacket.WiFiMac = bArr;
    }

    public static void decodeScanRsp(NetstrapPacket netstrapPacket, ByteBuffer byteBuffer) {
        int i = byteBuffer.get(4);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = byteBuffer.get(i2 + 5);
        }
        netstrapPacket.ssid = new String(bArr);
        byte[] bArr2 = new byte[6];
        for (int i3 = 0; i3 < 6; i3++) {
            bArr2[i3] = byteBuffer.get(i3 + 5 + i);
        }
        netstrapPacket.bssid = bArr2;
        netstrapPacket.authMode = byteBuffer.get(i + 11);
        netstrapPacket.rssi = byteBuffer.get(i + 12);
        netstrapPacket.status = byteBuffer.get(i + 13);
    }

    public static void dump(byte[] bArr) {
        for (byte b : bArr) {
            System.out.printf("%02X ", Byte.valueOf(b));
        }
        System.out.println("\n\n");
    }

    public static String getAuthModeDescription(int i) {
        if (i == 0) {
            return Constant.CONTROL_ACTION_OPEN;
        }
        if (i == 1) {
            return "WEP";
        }
        if (i == 2) {
            return "WPA";
        }
        if (i == 3) {
            return "WPA2";
        }
        if (i != 4) {
            return i != 5 ? "" : "WPA2-Enterprise";
        }
        return "WPA/WPA2";
    }

    public static String getMacAddress(byte[] bArr) {
        return String.format("%02X-%02X-%02X-%02X-%02X-%02X", Byte.valueOf(bArr[0]), Byte.valueOf(bArr[1]), Byte.valueOf(bArr[2]), Byte.valueOf(bArr[3]), Byte.valueOf(bArr[4]), Byte.valueOf(bArr[5]));
    }

    public static void main(String[] strArr) {
        NetstrapPacket netstrapPacketCreateOtaVersionReqPacket = createOtaVersionReqPacket();
        System.out.println(netstrapPacketCreateOtaVersionReqPacket);
        dump(netstrapPacketCreateOtaVersionReqPacket.getBytes());
        Iterator<NetstrapPacket> it = decodePacket(new byte[]{0, 17, 9, 0, 0, 1, 0, 2, 0, 3, 0}).iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        NetstrapPacket netstrapPacketCreateOtaUpgradeReqPacket = createOtaUpgradeReqPacket(300, new byte[]{1, 2, 3, 4});
        System.out.println(netstrapPacketCreateOtaUpgradeReqPacket);
        dump(netstrapPacketCreateOtaUpgradeReqPacket.getBytes());
        Iterator<NetstrapPacket> it2 = decodePacket(new byte[]{1, 17, 1, 0, 0}).iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        NetstrapPacket netstrapPacketCreateOtaRawDataReqPacket = createOtaRawDataReqPacket(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(netstrapPacketCreateOtaRawDataReqPacket);
        dump(netstrapPacketCreateOtaRawDataReqPacket.getBytes());
        NetstrapPacket netstrapPacketCreateOtaEndReqPacket = createOtaEndReqPacket(0);
        System.out.println(netstrapPacketCreateOtaEndReqPacket);
        dump(netstrapPacketCreateOtaEndReqPacket.getBytes());
        Iterator<NetstrapPacket> it3 = decodePacket(new byte[]{2, 17, 1, 0, 0}).iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }
    }

    public int getAuthMode() {
        return this.authMode;
    }

    public String getBleMac() {
        return String.format("%02X:%02X:%02X:%02X:%02X:%02X", Byte.valueOf(this.bleMac[0]), Byte.valueOf(this.bleMac[1]), Byte.valueOf(this.bleMac[2]), Byte.valueOf(this.bleMac[3]), Byte.valueOf(this.bleMac[4]), Byte.valueOf(this.bleMac[5]));
    }

    public byte[] getBssid() {
        return this.bssid;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x01ec  */
    public byte[] getBytes() {
        ByteBuffer byteBufferPut;
        ByteBuffer byteBufferPutShort;
        byte b;
        int i = this.cmdId;
        if (i == 0) {
            ByteBuffer byteBufferPut2 = ByteBuffer.allocate(6).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 2).put(this.showHidden ? (byte) 1 : (byte) 0).put((byte) this.scanType);
            this.Apflag = 0;
            byteBufferPut = byteBufferPut2;
        } else if (i == 1) {
            this.password.length();
            byteBufferPut = ByteBuffer.allocate(this.password.length() + 12).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) (this.password.length() + 8)).put(this.bssid).put((byte) this.Ap_ConnectStatus).put((byte) this.password.length()).put(this.password.getBytes());
        } else if (i == 1689) {
            byteBufferPut = ByteBuffer.allocate(10).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) this.rawData.length).put(this.rawData);
        } else if (i == 2049) {
            byteBufferPut = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 4).put(this.rawData);
        } else if (i == 2050 || i == 4) {
            byteBufferPut = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 0);
        } else if (i == 5) {
            byteBufferPut = ByteBuffer.allocate(this.manufactureName.length() + 11).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) (this.manufactureName.length() + 7)).put(this.deviceId).put((byte) this.manufactureName.length()).put(this.manufactureName.getBytes());
        } else if (i != 6 && i != 7) {
            switch (i) {
                case 256:
                    byteBufferPut = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 0);
                    break;
                case 257:
                    byteBufferPut = ByteBuffer.allocate(30).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 26).putShort((short) this.maxRxOctet).put(this.rawData);
                    break;
                case 258:
                    byteBufferPut = ByteBuffer.allocate(this.rawData.length + 4).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) this.rawData.length).put(this.rawData);
                    break;
                case 259:
                    byteBufferPutShort = ByteBuffer.allocate(5).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 1);
                    b = (byte) this.reason;
                    byteBufferPut = byteBufferPutShort.put(b);
                    break;
                default:
                    switch (i) {
                        case 1025:
                            byteBufferPut = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 4).put(this.rawData);
                            break;
                        case 1026:
                            byteBufferPut = ByteBuffer.allocate(9).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 5).put(this.rawData);
                            break;
                        case 1027:
                            byteBufferPut = ByteBuffer.allocate(9).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 5).put(this.rawData);
                            break;
                        case 1028:
                            byteBufferPutShort = ByteBuffer.allocate(5).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 1);
                            b = this.devicemode;
                            byteBufferPut = byteBufferPutShort.put(b);
                            break;
                        default:
                            switch (i) {
                                case PDU_TYPE_WRITE_WIFI_MAC_REQ /* 1538 */:
                                    byteBufferPut = ByteBuffer.allocate(10).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 6).put(this.rawData);
                                    break;
                                case PDU_TYPE_READ_WIFI_MAC_REQ /* 1539 */:
                                case PDU_TYPE_READ_BLE_MAC_REQ /* 1541 */:
                                case PDU_TYPE_READ_MAC_SOURCE_REQ /* 1544 */:
                                case 1546:
                                case PDU_TYPE_CAL_EXT_READ_VDD_VOUT_REQ /* 1547 */:
                                    break;
                                case PDU_TYPE_WRITE_BLE_MAC_REQ /* 1540 */:
                                    byteBufferPut = ByteBuffer.allocate(10).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 6).put(this.rawData);
                                    break;
                                case PDU_TYPE_SEND_BLE_STR_REQ /* 1542 */:
                                    byteBufferPut = ByteBuffer.allocate(this.rawData.length + 4).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) this.rawData.length).put(this.rawData);
                                    break;
                                case PDU_TYPE_WRITE_MAC_SOURCE_REQ /* 1543 */:
                                    byteBufferPut = ByteBuffer.allocate(6).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 2).put(this.rawData);
                                    break;
                                case 1545:
                                    byteBufferPut = ByteBuffer.allocate(28).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 24).put(this.rawData);
                                    break;
                                default:
                                    byteBufferPut = null;
                                    break;
                            }
                        case 1029:
                            byteBufferPut = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 0);
                            break;
                    }
                    break;
            }
        } else {
            byteBufferPut = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putShort((short) this.cmdId).putShort((short) 0);
        }
        return byteBufferPut.array();
    }

    public int getCalExtIndex() {
        return this.CalExtIndex;
    }

    public float[] getCalExtReadValue() {
        return this.CalExtReadValue;
    }

    public long getChipId() {
        return this.chipId;
    }

    public int getCmdId() {
        return this.cmdId;
    }

    public int getConnectStatus() {
        return this.connectStatus;
    }

    public long getFwId() {
        return this.fwId;
    }

    public String getGateway() {
        return this.gatewayaddr;
    }

    public String getIpaddr() {
        return this.ipaddr;
    }

    public String getMacSrc() {
        byte[] bArr = this.MacSrc;
        byte b = bArr[0];
        String str = b == 0 ? "WiFi: OTP" : "";
        if (b == 1) {
            str = "WiFi: flash";
        }
        byte b2 = bArr[1];
        String str2 = b2 == 0 ? "BLE: OTP" : "";
        if (b2 == 1) {
            str2 = "BLE: flash";
        }
        return String.format("%s, %s", str, str2);
    }

    public String getMaskddr() {
        return this.maskaddr;
    }

    public long getProjectId() {
        return this.projectId;
    }

    public String getReadbackStr() {
        return this.ReadbackStr;
    }

    public int getReason() {
        return this.reason;
    }

    public int getRssi() {
        return this.rssi;
    }

    public String getSsid() {
        return this.ssid;
    }

    public int getStatus() {
        return this.status;
    }

    public String getWiFiMac() {
        return String.format("%02X:%02X:%02X:%02X:%02X:%02X", Byte.valueOf(this.WiFiMac[0]), Byte.valueOf(this.WiFiMac[1]), Byte.valueOf(this.WiFiMac[2]), Byte.valueOf(this.WiFiMac[3]), Byte.valueOf(this.WiFiMac[4]), Byte.valueOf(this.WiFiMac[5]));
    }

    public void setCalExtIndex(int i) {
        this.CalExtIndex = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0045. Please report as an issue. */
    public String toString() {
        StringBuilder sb;
        int length;
        String string;
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i = this.cmdId;
        if (i != 0) {
            if (i != 1) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 4101) {
                            String str2 = "status: ";
                            if (i != 4102) {
                                if (i == 5785) {
                                    sb2.append("[PDU_TYPE_SEND_SINGLE_TONE_RSP]\n");
                                    sb = new StringBuilder();
                                } else if (i == 6145) {
                                    sb2.append("[PDU_TYPE_CAL_USER_DEFINE_OFFSET_RSP]\n");
                                    sb = new StringBuilder();
                                } else if (i != 6146) {
                                    switch (i) {
                                        case 256:
                                            string = "[OTA_VERSION_REQ]\n";
                                            break;
                                        case 257:
                                            sb2.append("[OTA_UPGRADE_REQ]\n");
                                            sb = new StringBuilder();
                                            sb.append("maxRxOctet: ");
                                            length = this.maxRxOctet;
                                            break;
                                        case 258:
                                            sb2.append("[OTA_RAW_DATA_REQ]\n");
                                            sb = new StringBuilder();
                                            sb.append("rawData.length: ");
                                            length = this.rawData.length;
                                            break;
                                        case 259:
                                            sb2.append("[OTA_END_REQ]\n");
                                            sb = new StringBuilder();
                                            str2 = "reason: ";
                                            break;
                                        default:
                                            switch (i) {
                                                case 4096:
                                                    sb2.append("[SCAN_RSP]\n");
                                                    sb2.append("ssid: " + this.ssid + Weather.SEPARATOR);
                                                    sb2.append("bssid: " + getMacAddress(this.bssid) + Weather.SEPARATOR);
                                                    sb2.append("authMode: " + getAuthModeDescription(this.authMode) + Weather.SEPARATOR);
                                                    sb = new StringBuilder();
                                                    sb.append("rssi: ");
                                                    length = this.rssi;
                                                    break;
                                                case 4097:
                                                    string = "[SCAN_END]\n";
                                                    break;
                                                case 4098:
                                                    sb2.append("[CONNECT_RSP]\n");
                                                    sb = new StringBuilder();
                                                    sb.append("status: ");
                                                    str = this.connectStatus != 0 ? "FAIL" : "SUCCESS";
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 4352:
                                                            sb2.append("[OTA_VERSION_RSP]\n");
                                                            sb2.append("status: " + this.status + Weather.SEPARATOR);
                                                            sb2.append("projectId: " + String.format("0x%04X", Long.valueOf(this.projectId)) + Weather.SEPARATOR);
                                                            sb2.append("chipId: " + String.format("0x%04X", Long.valueOf(this.chipId)) + Weather.SEPARATOR);
                                                            sb = new StringBuilder();
                                                            sb.append("fwId: ");
                                                            str = String.format("0x%04X", Long.valueOf(this.fwId));
                                                            break;
                                                        case 4353:
                                                            sb2.append("[OTA_UPGRADE_RSP]\n");
                                                            sb = new StringBuilder();
                                                            sb.append("status: ");
                                                            length = this.status;
                                                            break;
                                                        case 4354:
                                                            string = "[OTA_RAW_DATA_RSP]\n";
                                                            break;
                                                        case PDU_TYPE_EVT_OTA_END_RSP /* 4355 */:
                                                            sb2.append("[OTA_END_RSP]\n");
                                                            sb = new StringBuilder();
                                                            str2 = "reason: ";
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 5121:
                                                                    sb2.append("[VBATT_CAL_END_RSP]\n");
                                                                    sb = new StringBuilder();
                                                                    str2 = "reason: ";
                                                                    break;
                                                                case 5122:
                                                                    sb2.append("[IO_VOL_CAL_END_RSP]\n");
                                                                    sb = new StringBuilder();
                                                                    str2 = "reason: ";
                                                                    break;
                                                                case 5123:
                                                                    sb2.append("[TEMP_CAL_END_RSP]\n");
                                                                    sb = new StringBuilder();
                                                                    str2 = "reason: ";
                                                                    break;
                                                                case 5124:
                                                                    sb2.append("[PDU_TYPE_SET_DEVICE_MODE_RSP]\n");
                                                                    sb = new StringBuilder();
                                                                    break;
                                                                case 5125:
                                                                    sb2.append("[PDU_TYPE_READ_DEVICE_MODE_RSP]\n");
                                                                    sb = new StringBuilder();
                                                                    str2 = "Mode: ";
                                                                    break;
                                                                default:
                                                                    switch (i) {
                                                                        case PDU_TYPE_RESET_RSP /* 5633 */:
                                                                            sb2.append("[PDU_TYPE_RESET_RSP]\n");
                                                                            sb = new StringBuilder();
                                                                            str2 = "reason: ";
                                                                            break;
                                                                        case PDU_TYPE_WRITE_WIFI_MAC_RSP /* 5634 */:
                                                                            sb2.append("[PDU_TYPE_WRITE_WIFI_MAC_RSP]\n");
                                                                            sb = new StringBuilder();
                                                                            str2 = "reason: ";
                                                                            break;
                                                                        case PDU_TYPE_READ_WIFI_MAC_RSP /* 5635 */:
                                                                            sb2.append("[PDU_TYPE_READ_WIFI_MAC_RSP]\n");
                                                                            sb = new StringBuilder();
                                                                            sb.append("Wifi Mac: ");
                                                                            str = String.format("%02X-%02X-%02X-%02X-%02X-%02X", Byte.valueOf(this.WiFiMac[0]), Byte.valueOf(this.WiFiMac[1]), Byte.valueOf(this.WiFiMac[2]), Byte.valueOf(this.WiFiMac[3]), Byte.valueOf(this.WiFiMac[4]), Byte.valueOf(this.WiFiMac[5]));
                                                                            break;
                                                                        case PDU_TYPE_WRITE_BLE_MAC_RSP /* 5636 */:
                                                                            sb2.append("[PDU_TYPE_WRITE_BLE_MAC_RSP]\n");
                                                                            sb = new StringBuilder();
                                                                            str2 = "reason: ";
                                                                            break;
                                                                        case PDU_TYPE_READ_BLE_MAC_RSP /* 5637 */:
                                                                            sb2.append("[PDU_TYPE_READ_BLE_MAC_RSP]\n");
                                                                            sb = new StringBuilder();
                                                                            sb.append("Ble Mac: ");
                                                                            str = String.format("%02X-%02X-%02X-%02X-%02X-%02X", Byte.valueOf(this.bleMac[0]), Byte.valueOf(this.bleMac[1]), Byte.valueOf(this.bleMac[2]), Byte.valueOf(this.bleMac[3]), Byte.valueOf(this.bleMac[4]), Byte.valueOf(this.bleMac[5]));
                                                                            break;
                                                                        case PDU_TYPE_SEND_BLE_STR_RSP /* 5638 */:
                                                                            sb2.append("[PDU_TYPE_SEND_BLE_STR_RSP]\n");
                                                                            sb = new StringBuilder();
                                                                            break;
                                                                        case PDU_TYPE_WRITE_MAC_SOURCE_RSP /* 5639 */:
                                                                            sb2.append("[PDU_TYPE_WRITE_MAC_SOURCE_RSP]\n");
                                                                            sb = new StringBuilder();
                                                                            break;
                                                                        case PDU_TYPE_READ_MAC_SOURCE_RSP /* 5640 */:
                                                                            sb2.append("[PDU_TYPE_READ_MAC_SOURCE_RSP]\n");
                                                                            sb = new StringBuilder();
                                                                            sb.append("WiFi MAC Source: ");
                                                                            sb.append((int) this.MacSrc[0]);
                                                                            sb.append(",BLE MAC Source: ");
                                                                            length = this.MacSrc[1];
                                                                            break;
                                                                        case PDU_TYPE_CAL_EXT_RSP /* 5641 */:
                                                                            sb2.append("[CAL_EXT_RSP]\n");
                                                                            sb = new StringBuilder();
                                                                            str2 = "reason: ";
                                                                            break;
                                                                        case PDU_TYPE_CAL_EXT_READ_RSP /* 5642 */:
                                                                            sb2.append("[PDU_TYPE_CAL_EXT_READ_RSP]\n");
                                                                            sb = new StringBuilder();
                                                                            str = String.format("Temp1.=%.3f, Vdd1=%.3f, Vout1=%.3f, Temp2.=%.3f, Vdd2=%.3f, Vout2=%.3f", Float.valueOf(this.CalExtReadValue[0]), Float.valueOf(this.CalExtReadValue[1]), Float.valueOf(this.CalExtReadValue[2]), Float.valueOf(this.CalExtReadValue[3]), Float.valueOf(this.CalExtReadValue[4]), Float.valueOf(this.CalExtReadValue[5]));
                                                                            break;
                                                                        case PDU_TYPE_CAL_EXT_READ_VDD_VOUT_RSP /* 5643 */:
                                                                            sb2.append("[PDU_TYPE_CAL_EXT_READ_VDD_VOUT_RSP]\n");
                                                                            sb = new StringBuilder();
                                                                            str = String.format("Vdd=%.3f, Vout=%.3f, ", Float.valueOf(this.CalExtReadValue[0]), Float.valueOf(this.CalExtReadValue[1]));
                                                                            break;
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    sb2.append("[PDU_TYPE_CAL_READ_USER_DEFINE_OFFSET_RSP]\n");
                                    sb = new StringBuilder();
                                    str = String.format("Offset=%.3f", Float.valueOf(this.CalExtReadValue[0]));
                                }
                                sb.append(str2);
                                length = this.reason;
                            } else {
                                sb2.append("[WRITE_DEVICE_RSP]\n");
                                sb = new StringBuilder();
                                sb.append("status: ");
                                length = this.writeStatus;
                            }
                        } else {
                            sb2.append("[READ_DEVICE_RSP]\n");
                            sb2.append("deviceId: " + getMacAddress(this.deviceId) + Weather.SEPARATOR);
                            sb = new StringBuilder();
                        }
                        return sb2.toString();
                    }
                    sb2.append("[WRITE_DEVICE_REQ]\n");
                    sb2.append("deviceId: " + getMacAddress(this.deviceId) + Weather.SEPARATOR);
                    sb = new StringBuilder();
                    sb.append("manufactureName: ");
                    str = this.manufactureName;
                } else {
                    string = "[READ_DEVICE_REQ]\n";
                }
                sb2.append(string);
                return sb2.toString();
            }
            sb2.append("[CONNECT_REQ]\n");
            sb2.append("bssid: " + getMacAddress(this.bssid) + Weather.SEPARATOR);
            sb = new StringBuilder();
            sb.append("password: ");
            str = this.password;
            sb.append(str);
            sb.append(Weather.SEPARATOR);
            string = sb.toString();
            sb2.append(string);
            return sb2.toString();
        }
        sb2.append("[SCAN_REQ]\n");
        sb2.append("showHidden: " + this.showHidden + Weather.SEPARATOR);
        sb = new StringBuilder();
        sb.append("scanType: ");
        length = this.scanType;
        sb.append(length);
        sb.append(Weather.SEPARATOR);
        string = sb.toString();
        sb2.append(string);
        return sb2.toString();
    }
}
