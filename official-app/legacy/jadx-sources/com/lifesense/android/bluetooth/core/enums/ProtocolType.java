package com.lifesense.android.bluetooth.core.enums;

import android.content.Context;
import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import com.lifesense.android.bluetooth.core.bean.constant.DeviceType;
import com.lifesense.android.bluetooth.core.bean.constant.GattServiceType;
import com.lifesense.android.bluetooth.core.bean.constant.PacketProfile;
import com.lifesense.android.bluetooth.core.protocol.e;
import com.lifesense.android.bluetooth.core.protocol.stack.a;
import com.lifesense.android.bluetooth.core.protocol.stack.b;
import com.lifesense.android.bluetooth.core.protocol.worker.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.UUID;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public enum ProtocolType {
    UNKNOWN(Collections.EMPTY_LIST),
    A6(Arrays.asList(DeviceGattServiceUUID.DEVICE_A6_SERVICE_UUID, DeviceGattServiceUUID.DEVICE_A6_SERVICE_UUID_BP)) { // from class: com.lifesense.android.bluetooth.core.enums.ProtocolType.1
        @Override // com.lifesense.android.bluetooth.core.enums.ProtocolType
        public boolean checkPushPermission(GattServiceType gattServiceType, PacketProfile packetProfile) {
            switch (AnonymousClass3.$SwitchMap$com$lifesense$android$bluetooth$core$bean$constant$PacketProfile[packetProfile.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return true;
                default:
                    return false;
            }
        }

        @Override // com.lifesense.android.bluetooth.core.enums.ProtocolType
        public Queue<a> getDataSyncProtocolStack() {
            return new LinkedList<a>() { // from class: com.lifesense.android.bluetooth.core.enums.ProtocolType.1.4
                {
                    add(a.a(b.CONNECT_DEVICE, null));
                    add(a.a(b.READ_DEVICE_INFO, null));
                    add(a.a(b.READ_FEATURE_INFO, null));
                    add(a.a(b.SET_INDICATE_FOR_CHARACTERISTICS, null));
                    add(a.a(b.RECEIVE_AUTH, null));
                    add(a.a(b.WRITE_AUTH_RESPONSE, null));
                    add(a.a(b.RECEIVE_INIT, null));
                    add(a.a(b.WRITE_INIT_RESPONSE, null));
                    add(a.a(b.START_MEASURE_DATA, null));
                    add(a.a(b.WAITING_TO_RECEIVE_DATA, e.b()));
                }
            };
        }

        @Override // com.lifesense.android.bluetooth.core.enums.ProtocolType
        public DeviceType getDeviceTypeByUUID(List<UUID> list) {
            for (UUID uuid : list) {
                if (uuid.equals(DeviceGattServiceUUID.DEVICE_A6_SERVICE_UUID_BP.getServiceUUID())) {
                    return DeviceType.BLOOD_PRESSURE;
                }
                if (uuid.equals(DeviceGattServiceUUID.DEVICE_A6_SERVICE_UUID.getServiceUUID())) {
                    return DeviceType.FAT_SCALE;
                }
            }
            return DeviceType.UNKNOWN;
        }

        @Override // com.lifesense.android.bluetooth.core.enums.ProtocolType
        public Queue<a> getPairingProtocolStack(LsDeviceInfo lsDeviceInfo) {
            return new LinkedList<a>(lsDeviceInfo) { // from class: com.lifesense.android.bluetooth.core.enums.ProtocolType.1.1
                public final /* synthetic */ LsDeviceInfo val$deviceInfo;

                {
                    this.val$deviceInfo = lsDeviceInfo;
                    add(a.a(b.CONNECT_DEVICE, null));
                    add(a.a(b.READ_DEVICE_INFO, null));
                    add(a.a(b.READ_FEATURE_INFO, null));
                    add(a.a(b.SET_INDICATE_FOR_CHARACTERISTICS, null));
                    if (lsDeviceInfo.getRegisterStatus() == 0) {
                        add(a.a(b.REQUEST_DEVICE_ID, null));
                        add(a.a(b.WRITE_REGISTER, null));
                        add(a.a(b.RECEIVE_REGISTER_RESULT, null));
                    }
                    add(a.a(b.RECEIVE_AUTH, null));
                    add(a.a(b.WRITE_AUTH_RESPONSE, null));
                    add(a.a(b.REQUEST_BIND_STATE, null));
                    add(a.a(b.WRITE_BIND_NOTICE, null));
                    add(a.a(b.RECEIVE_BIND_RESULT, null));
                    add(a.a(b.WRITE_DISCONNECT, e.b()));
                }
            };
        }

        @Override // com.lifesense.android.bluetooth.core.enums.ProtocolType
        public Queue<a> getUnPairingProtocolStack() {
            return new LinkedList<a>() { // from class: com.lifesense.android.bluetooth.core.enums.ProtocolType.1.3
                {
                    add(a.a(b.CONNECT_DEVICE, null));
                    add(a.a(b.READ_DEVICE_INFO, null));
                    add(a.a(b.READ_FEATURE_INFO, null));
                    add(a.a(b.SET_INDICATE_FOR_CHARACTERISTICS, null));
                    add(a.a(b.RECEIVE_AUTH, null));
                    add(a.a(b.WRITE_AUTH_RESPONSE, null));
                    add(a.a(b.RECEIVE_INIT, null));
                    add(a.a(b.WRITE_INIT_RESPONSE, null));
                    add(a.a(b.START_MEASURE_DATA, null));
                    add(a.a(b.WAITING_TO_RECEIVE_DATA, e.b()));
                }
            };
        }

        @Override // com.lifesense.android.bluetooth.core.enums.ProtocolType
        public Queue<a> getUpgradeProtocolStack() {
            return new LinkedList<a>() { // from class: com.lifesense.android.bluetooth.core.enums.ProtocolType.1.2
                {
                    add(a.a(b.CONNECT_DEVICE, null));
                    add(a.a(b.ANALYSIS_OTA_FILE, null));
                    add(a.a(b.SET_INDICATE_FOR_CHARACTERISTICS, null));
                    add(a.a(b.WRITE_ACTIVATE_AND_RESET_COMMAND, null));
                    add(a.a(b.WAITING_TO_RECEIVE_DATA, null));
                }
            };
        }

        @Override // com.lifesense.android.bluetooth.core.enums.ProtocolType
        public boolean isLongConnectDevice() {
            return true;
        }
    },
    A5(Arrays.asList(DeviceGattServiceUUID.PEDOMETER_SERVICE_UUID_A5)) { // from class: com.lifesense.android.bluetooth.core.enums.ProtocolType.2
        @Override // com.lifesense.android.bluetooth.core.enums.ProtocolType
        public Queue<a> getDataSyncProtocolStack() {
            LinkedList linkedList = new LinkedList();
            a aVar = new a(b.READ_DEVICE_INFO, null);
            a aVar2 = new a(b.SET_INDICATE_FOR_CHARACTERISTICS, null);
            a aVar3 = new a(b.WRITE_AUTH_RESPONSE, null);
            a aVar4 = new a(b.WAITING_TO_RECEIVE_DATA, null);
            linkedList.add(aVar);
            linkedList.add(aVar2);
            linkedList.add(aVar3);
            linkedList.add(aVar4);
            return linkedList;
        }

        @Override // com.lifesense.android.bluetooth.core.enums.ProtocolType
        public DeviceType getDeviceTypeByUUID(List<UUID> list) {
            return DeviceType.PEDOMETER;
        }

        @Override // com.lifesense.android.bluetooth.core.enums.ProtocolType
        public Queue<a> getPairingProtocolStack(LsDeviceInfo lsDeviceInfo) {
            LinkedList linkedList = new LinkedList();
            a aVar = new a(b.CONNECT_DEVICE, null);
            a aVar2 = new a(b.READ_DEVICE_ID, null);
            a aVar3 = new a(b.SET_INDICATE_FOR_CHARACTERISTICS, null);
            a aVar4 = new a(b.WRITE_AUTH_RESPONSE, null);
            a aVar5 = new a(b.RECEIVE_RANDOM_NUMBER, e.a());
            a aVar6 = new a(b.WRITE_RANDOM_NUMBER_CHECK_RESULT, null);
            a aVar7 = new a(b.RECEIVE_CONFIRM_PAIR, null);
            a aVar8 = new a(b.WRITE_PAIR_CONFIRM_RESULT, null);
            a aVar9 = new a(b.PROCESSING_PAIRED_RESULTS, null);
            a aVar10 = new a(b.WRITE_DISCONNECT, e.b());
            linkedList.add(aVar);
            linkedList.add(aVar2);
            linkedList.add(aVar3);
            linkedList.add(aVar4);
            linkedList.add(aVar5);
            linkedList.add(aVar6);
            linkedList.add(aVar7);
            linkedList.add(aVar8);
            linkedList.add(aVar9);
            linkedList.add(aVar10);
            return linkedList;
        }

        @Override // com.lifesense.android.bluetooth.core.enums.ProtocolType
        public Queue<a> getUpgradeProtocolStack() {
            return super.getUpgradeProtocolStack();
        }
    };

    public static final Logger log = Logger.getLogger(ProtocolType.class.getName());
    public List<DeviceGattServiceUUID> deviceGattServiceUUIDList;

    /* JADX INFO: renamed from: com.lifesense.android.bluetooth.core.enums.ProtocolType$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$lifesense$android$bluetooth$core$bean$constant$PacketProfile;

        static {
            int[] iArr = new int[PacketProfile.values().length];
            $SwitchMap$com$lifesense$android$bluetooth$core$bean$constant$PacketProfile = iArr;
            try {
                iArr[PacketProfile.PUSH_USER_INFO_TO_WEIGHT_FOR_A6.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$lifesense$android$bluetooth$core$bean$constant$PacketProfile[PacketProfile.PUSH_TIME_TO_WEIGHT_FOR_A6.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$lifesense$android$bluetooth$core$bean$constant$PacketProfile[PacketProfile.PUSH_TARGET_TO_WEIGHT_FOR_A6.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$lifesense$android$bluetooth$core$bean$constant$PacketProfile[PacketProfile.PUSH_UNIT_TO_WEIGHT_FOR_A6.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$lifesense$android$bluetooth$core$bean$constant$PacketProfile[PacketProfile.PUSH_CLEAR_DATA_TO_WEIGHT_FOR_A6.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$lifesense$android$bluetooth$core$bean$constant$PacketProfile[PacketProfile.DEVICE_A6_UNBIND_NOTICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$lifesense$android$bluetooth$core$bean$constant$PacketProfile[PacketProfile.PUSH_FORMULA_TO_WEIGHT_FOR_A6.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$lifesense$android$bluetooth$core$bean$constant$PacketProfile[PacketProfile.PUSH_HEART_RATE_SWITCH_FOR_A6.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    ProtocolType(List list) {
        this.deviceGattServiceUUIDList = list;
    }

    public static ProtocolType getProtocolByName(String str) {
        for (ProtocolType protocolType : values()) {
            if (protocolType.name().equalsIgnoreCase(str)) {
                return protocolType;
            }
        }
        return UNKNOWN;
    }

    public static ProtocolType getProtocolByService(UUID uuid) {
        if (uuid == null) {
            return UNKNOWN;
        }
        for (ProtocolType protocolType : values()) {
            if (protocolType.getServiceUUIDList().contains(uuid)) {
                return protocolType;
            }
        }
        return UNKNOWN;
    }

    public static ProtocolType getProtocolTypeByServices(List<UUID> list) {
        ProtocolType protocolByService;
        if (list == null || list.size() == 0) {
            return UNKNOWN;
        }
        for (UUID uuid : list) {
            if (uuid != null && (protocolByService = getProtocolByService(uuid)) != UNKNOWN) {
                return protocolByService;
            }
        }
        return UNKNOWN;
    }

    public boolean checkPushPermission(GattServiceType gattServiceType, PacketProfile packetProfile) {
        return false;
    }

    public com.lifesense.android.bluetooth.core.protocol.worker.a createOtaWorker(Context context, LsDeviceInfo lsDeviceInfo, File file) {
        try {
            return c.b(DeviceType.getDeviceTypeById(lsDeviceInfo.getDeviceType())).getConstructor(Context.class, String.class, Queue.class, File.class).newInstance(context, lsDeviceInfo.getMacAddress(), getUpgradeProtocolStack(), file);
        } catch (NoSuchMethodException | Exception e2) {
            log.warning(e2.getMessage());
            return null;
        }
    }

    public com.lifesense.android.bluetooth.core.protocol.worker.a createPairWorker(Context context, LsDeviceInfo lsDeviceInfo) {
        try {
            return c.c(DeviceType.getDeviceTypeById(lsDeviceInfo.getDeviceType())).getConstructor(String.class, LsDeviceInfo.class, Context.class).newInstance(lsDeviceInfo.getMacAddress(), lsDeviceInfo, context);
        } catch (NoSuchMethodException | Exception e2) {
            log.warning(e2.getMessage());
            return null;
        }
    }

    public com.lifesense.android.bluetooth.core.protocol.worker.a createSyncWorker(Context context, LsDeviceInfo lsDeviceInfo) {
        try {
            return c.d(DeviceType.getDeviceTypeById(lsDeviceInfo.getDeviceType())).getConstructor(String.class, LsDeviceInfo.class, Context.class).newInstance(lsDeviceInfo.getMacAddress(), lsDeviceInfo, context);
        } catch (NoSuchMethodException | Exception e2) {
            log.warning(e2.getMessage());
            return null;
        }
    }

    public Queue<a> getDataSyncProtocolStack() {
        return null;
    }

    public DeviceType getDeviceTypeByUUID(List<UUID> list) {
        return DeviceType.UNKNOWN;
    }

    public Queue<a> getPairingProtocolStack(LsDeviceInfo lsDeviceInfo) {
        return null;
    }

    public List<UUID> getServiceUUIDList() {
        ArrayList arrayList = new ArrayList();
        Iterator<DeviceGattServiceUUID> it = this.deviceGattServiceUUIDList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getServiceUUID());
        }
        return arrayList;
    }

    public List<String> getServiceUUIDStringList() {
        ArrayList arrayList = new ArrayList();
        Iterator<UUID> it = getServiceUUIDList().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toString());
        }
        return arrayList;
    }

    public Queue<a> getUnPairingProtocolStack() {
        return null;
    }

    public Queue<a> getUpgradeProtocolStack() {
        return null;
    }

    public boolean isLongConnectDevice() {
        return true;
    }
}
