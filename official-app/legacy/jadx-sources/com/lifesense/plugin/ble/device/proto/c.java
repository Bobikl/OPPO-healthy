package com.lifesense.plugin.ble.device.proto;

import com.lifesense.plugin.ble.data.LSDeviceInfo;
import com.lifesense.plugin.ble.data.LSProtocolType;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static Queue a() {
        LinkedList linkedList = new LinkedList();
        f fVar = new f(a.CONNECT_DEVICE, null);
        f fVar2 = new f(a.SET_INDICATE_FOR_CHARACTERISTICS, null);
        f fVar3 = new f(a.WRITE_START_DFU_COMMAND, null);
        f fVar4 = new f(a.WRITE_IMAGE_SIZE_COMMAND, null);
        f fVar5 = new f(a.WRITE_INIT_DFU_COMMAND, null);
        f fVar6 = new f(a.WRITE_RECEIVE_FIRMWARE_IMAGE_COMMAND, null);
        f fVar7 = new f(a.WRITE_VALIDATE_FIRMWARE_COMMAND, null);
        f fVar8 = new f(a.WRITE_ACTIVATE_AND_RESET_COMMAND, null);
        f fVar9 = new f(a.WRITE_FILE_DATA_TO_DEVICE, null);
        f fVar10 = new f(a.WAITING_TO_RECEIVE_DATA, null);
        linkedList.add(fVar);
        linkedList.add(fVar2);
        linkedList.add(fVar3);
        linkedList.add(fVar4);
        linkedList.add(fVar5);
        linkedList.add(fVar6);
        linkedList.add(fVar9);
        linkedList.add(fVar7);
        linkedList.add(fVar8);
        linkedList.add(fVar10);
        return linkedList;
    }

    public static Queue b() {
        LinkedList linkedList = new LinkedList();
        f fVar = new f(a.CONNECT_DEVICE, null);
        f fVar2 = new f(a.SET_INDICATE_FOR_CHARACTERISTICS, null);
        f fVar3 = new f(a.WRITE_AUTH_RESPONSE_FOR_WECHAT, null);
        f fVar4 = new f(a.WRITE_UPGRADE_MODE_TO_DEVICE, null);
        f fVar5 = new f(a.WRITE_UPGRADE_FILE_HEADER, null);
        f fVar6 = new f(a.WRITE_FILE_DATA_TO_DEVICE, null);
        f fVar7 = new f(a.WRITE_START_VERIFY_COMMAND, null);
        f fVar8 = new f(a.WRITE_FILE_DOWNLOAD_COMPLETE_COMMAND, null);
        f fVar9 = new f(a.WRITE_START_UPGRADING_NOTIFY_COMMAND, null);
        f fVar10 = new f(a.WAITING_TO_RECEIVE_DATA, null);
        linkedList.add(fVar);
        linkedList.add(fVar2);
        linkedList.add(fVar3);
        linkedList.add(fVar4);
        linkedList.add(fVar5);
        linkedList.add(fVar6);
        linkedList.add(fVar7);
        linkedList.add(fVar8);
        linkedList.add(fVar9);
        linkedList.add(fVar10);
        return linkedList;
    }

    public static Queue c() {
        LinkedList linkedList = new LinkedList();
        f fVar = new f(a.CONNECT_DEVICE, null);
        f fVar2 = new f(a.WRITE_UPGRADE_MODE_TO_DEVICE, null);
        f fVar3 = new f(a.WRITE_UPGRADE_FILE_HEADER, null);
        f fVar4 = new f(a.WRITE_FILE_DATA_TO_DEVICE, null);
        f fVar5 = new f(a.WRITE_START_VERIFY_COMMAND, null);
        f fVar6 = new f(a.WRITE_FILE_DOWNLOAD_COMPLETE_COMMAND, null);
        f fVar7 = new f(a.WRITE_START_UPGRADING_NOTIFY_COMMAND, null);
        f fVar8 = new f(a.WAITING_TO_RECEIVE_DATA, null);
        linkedList.add(fVar);
        linkedList.add(fVar2);
        linkedList.add(fVar3);
        linkedList.add(fVar4);
        linkedList.add(fVar5);
        linkedList.add(fVar6);
        linkedList.add(fVar7);
        linkedList.add(fVar8);
        return linkedList;
    }

    private static Queue d() {
        LinkedList linkedList = new LinkedList();
        f fVar = new f(a.CONNECT_DEVICE, null);
        f fVar2 = new f(a.READ_DEVICE_INFO, null);
        f fVar3 = new f(a.RESET_MTU, null);
        f fVar4 = new f(a.SET_INDICATE_FOR_CHARACTERISTICS, null);
        f fVar5 = new f(a.WRITE_AUTH_RESPONSE, null);
        f fVar6 = new f(a.WAITING_TO_RECEIVE_DATA, null);
        linkedList.add(fVar);
        linkedList.add(fVar2);
        linkedList.add(fVar3);
        linkedList.add(fVar4);
        linkedList.add(fVar5);
        linkedList.add(fVar6);
        return linkedList;
    }

    public static Queue a(LSDeviceInfo lSDeviceInfo) {
        if (lSDeviceInfo == null || lSDeviceInfo.getProtocolType() == null || lSDeviceInfo.getProtocolType().length() == 0) {
            return null;
        }
        if (LSProtocolType.A5.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType())) {
            return d();
        }
        return null;
    }

    public static Queue b(LSDeviceInfo lSDeviceInfo) {
        if (lSDeviceInfo == null || lSDeviceInfo.getProtocolType() == null || lSDeviceInfo.getProtocolType().length() == 0) {
            return null;
        }
        if (LSProtocolType.A5.toString().equalsIgnoreCase(lSDeviceInfo.getProtocolType())) {
            return c(lSDeviceInfo);
        }
        return null;
    }

    private static Queue c(LSDeviceInfo lSDeviceInfo) {
        LinkedList linkedList = new LinkedList();
        f fVar = new f(a.CONNECT_DEVICE, null);
        f fVar2 = new f(a.READ_DEVICE_ID, null);
        f fVar3 = new f(a.SET_INDICATE_FOR_CHARACTERISTICS, null);
        f fVar4 = new f(a.WRITE_AUTH_RESPONSE, null);
        f fVar5 = new f(a.RECEIVE_RANDOM_NUMBER, null);
        f fVar6 = new f(a.WRITE_RANDOM_NUMBER_CHECK_RESULT, null);
        f fVar7 = new f(a.RECEIVE_CONFIRM_PAIR, null);
        f fVar8 = new f(a.WRITE_PAIR_CONFIRM_RESULT, null);
        f fVar9 = new f(a.PROCESSING_PAIRED_RESULTS, null);
        f fVar10 = new f(a.WRITE_DISCONNECT, null);
        linkedList.add(fVar);
        linkedList.add(fVar2);
        linkedList.add(fVar3);
        linkedList.add(fVar4);
        linkedList.add(fVar5);
        linkedList.add(fVar6);
        linkedList.add(fVar7);
        linkedList.add(fVar8);
        linkedList.add(fVar9);
        linkedList.add(fVar10);
        return linkedList;
    }

    public static Queue a(LSProtocolType lSProtocolType) {
        LinkedList linkedList;
        f fVar;
        f fVar2;
        f fVar3;
        f fVar4;
        f fVar5;
        if (LSProtocolType.WechatActivityTracker != lSProtocolType) {
            if (LSProtocolType.WechatCallAT == lSProtocolType) {
                linkedList = new LinkedList();
                f fVar6 = new f(a.READ_DEVICE_INFO, null);
                f fVar7 = new f(a.SET_INDICATE_FOR_CHARACTERISTICS, null);
                f fVar8 = new f(a.WAITING_TO_SEND_CALL_MESSAGE, null);
                linkedList.add(fVar6);
                linkedList.add(fVar7);
                linkedList.add(fVar8);
            } else {
                if (LSProtocolType.A5 != lSProtocolType) {
                    return null;
                }
                linkedList = new LinkedList();
                fVar = new f(a.READ_DEVICE_INFO, null);
                fVar2 = new f(a.RESET_MTU, null);
                fVar3 = new f(a.SET_INDICATE_FOR_CHARACTERISTICS, null);
                fVar4 = new f(a.WRITE_AUTH_RESPONSE, null);
                fVar5 = new f(a.WAITING_TO_RECEIVE_DATA, null);
            }
            return linkedList;
        }
        linkedList = new LinkedList();
        fVar = new f(a.READ_DEVICE_INFO, null);
        fVar2 = new f(a.SET_INDICATE_FOR_CHARACTERISTICS, null);
        fVar3 = new f(a.WRITE_AUTH_RESPONSE_FOR_WECHAT, null);
        fVar4 = new f(a.WRITE_INIT_RESPONSE_FOR_WECHAT, null);
        fVar5 = new f(a.WAITING_TO_RECEIVE_DATA, null);
        linkedList.add(fVar);
        linkedList.add(fVar2);
        linkedList.add(fVar3);
        linkedList.add(fVar4);
        linkedList.add(fVar5);
        return linkedList;
    }
}
