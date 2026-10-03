package com.lifesense.android.bluetooth.core.protocol;

import com.lifesense.android.bluetooth.core.bean.LsDeviceInfo;
import java.util.UUID;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public class a {
    public static final a DEVICEINFO_SERVICE_SYSTEM_ID_CHARACTERISTIC_UUID;
    public static final a FIRMWARE_REVISION_CHARACTERISTIC_UUID;
    public static final a HARDWARE_REVISION_CHARACTERISTIC_UUID;
    public static final a MANUFACTURER_CHARACTERISTIC_UUID;
    public static final a MODEL_CHARACTERISTIC_UUID;
    public static final a SERIAL_NUMBER_CHARACTERISTIC_UUID;
    public static final a SERVICE_SOFTWARE_REVISION_CHARACTERISTIC_UUID;
    public static final a SERVICE_UUID;
    public static final a SYSTEM_ID_CHARACTERISTIC_UUID;
    public static final /* synthetic */ a[] b;
    public UUID a;

    /* JADX INFO: renamed from: com.lifesense.android.bluetooth.core.protocol.a$a, reason: collision with other inner class name */
    public static enum C0830a extends a {
        public C0830a(String str, int i, UUID uuid) {
            super(str, i, uuid, null);
        }

        @Override // com.lifesense.android.bluetooth.core.protocol.a
        public void a(LsDeviceInfo lsDeviceInfo, byte[] bArr) {
            lsDeviceInfo.setManufactureName(com.lifesense.android.bluetooth.core.tools.e.a(bArr));
            StringBuilder sb = new StringBuilder();
            sb.append("Device information-ManufactureName-");
            sb.append(com.lifesense.android.bluetooth.core.tools.e.a(bArr));
        }
    }

    static {
        a aVar = new a("SERVICE_UUID", 0, UUID.fromString("0000180a-0000-1000-8000-00805f9b34fb"));
        SERVICE_UUID = aVar;
        C0830a c0830a = new C0830a("MANUFACTURER_CHARACTERISTIC_UUID", 1, UUID.fromString("00002a29-0000-1000-8000-00805f9b34fb"));
        MANUFACTURER_CHARACTERISTIC_UUID = c0830a;
        a aVar2 = new a("MODEL_CHARACTERISTIC_UUID", 2, UUID.fromString("00002a24-0000-1000-8000-00805f9b34fb")) { // from class: com.lifesense.android.bluetooth.core.protocol.a.b
            {
                C0830a c0830a2 = null;
            }

            @Override // com.lifesense.android.bluetooth.core.protocol.a
            public void a(LsDeviceInfo lsDeviceInfo, byte[] bArr) {
                String strTrim = new String(bArr).trim();
                lsDeviceInfo.setModelNumber(strTrim);
                StringBuilder sb = new StringBuilder();
                sb.append("Device information-ModelNumber-");
                sb.append(strTrim);
            }
        };
        MODEL_CHARACTERISTIC_UUID = aVar2;
        a aVar3 = new a("SERIAL_NUMBER_CHARACTERISTIC_UUID", 3, UUID.fromString("00002a25-0000-1000-8000-00805f9b34fb")) { // from class: com.lifesense.android.bluetooth.core.protocol.a.c
            {
                C0830a c0830a2 = null;
            }

            @Override // com.lifesense.android.bluetooth.core.protocol.a
            public void a(LsDeviceInfo lsDeviceInfo, byte[] bArr) {
            }
        };
        SERIAL_NUMBER_CHARACTERISTIC_UUID = aVar3;
        a aVar4 = new a("HARDWARE_REVISION_CHARACTERISTIC_UUID", 4, UUID.fromString("00002a27-0000-1000-8000-00805f9b34fb")) { // from class: com.lifesense.android.bluetooth.core.protocol.a.d
            {
                C0830a c0830a2 = null;
            }

            @Override // com.lifesense.android.bluetooth.core.protocol.a
            public void a(LsDeviceInfo lsDeviceInfo, byte[] bArr) {
                lsDeviceInfo.setHardwareVersion(com.lifesense.android.bluetooth.core.tools.e.a(bArr));
                StringBuilder sb = new StringBuilder();
                sb.append("Device information-HardwareVersion-");
                sb.append(com.lifesense.android.bluetooth.core.tools.e.a(bArr));
            }
        };
        HARDWARE_REVISION_CHARACTERISTIC_UUID = aVar4;
        a aVar5 = new a("FIRMWARE_REVISION_CHARACTERISTIC_UUID", 5, UUID.fromString("00002a26-0000-1000-8000-00805f9b34fb")) { // from class: com.lifesense.android.bluetooth.core.protocol.a.e
            {
                C0830a c0830a2 = null;
            }

            @Override // com.lifesense.android.bluetooth.core.protocol.a
            public void a(LsDeviceInfo lsDeviceInfo, byte[] bArr) {
                lsDeviceInfo.setFirmwareVersion(com.lifesense.android.bluetooth.core.tools.e.a(bArr));
                StringBuilder sb = new StringBuilder();
                sb.append("Device information-FirmwareVersion-");
                sb.append(com.lifesense.android.bluetooth.core.tools.e.a(bArr));
            }
        };
        FIRMWARE_REVISION_CHARACTERISTIC_UUID = aVar5;
        a aVar6 = new a("SERVICE_SOFTWARE_REVISION_CHARACTERISTIC_UUID", 6, UUID.fromString("00002a28-0000-1000-8000-00805f9b34fb")) { // from class: com.lifesense.android.bluetooth.core.protocol.a.f
            {
                C0830a c0830a2 = null;
            }

            @Override // com.lifesense.android.bluetooth.core.protocol.a
            public void a(LsDeviceInfo lsDeviceInfo, byte[] bArr) {
                String strA = com.lifesense.android.bluetooth.core.tools.e.a(bArr);
                if (strA.length() > 4) {
                    strA = strA.substring(4);
                }
                lsDeviceInfo.setSoftwareVersion(strA);
                StringBuilder sb = new StringBuilder();
                sb.append("Device information-SoftwareVersion-");
                sb.append(strA);
            }
        };
        SERVICE_SOFTWARE_REVISION_CHARACTERISTIC_UUID = aVar6;
        a aVar7 = new a("SYSTEM_ID_CHARACTERISTIC_UUID", 7, UUID.fromString("00002a23-0000-1000-8000-00805f9b34fb")) { // from class: com.lifesense.android.bluetooth.core.protocol.a.g
            {
                C0830a c0830a2 = null;
            }
        };
        SYSTEM_ID_CHARACTERISTIC_UUID = aVar7;
        a aVar8 = new a("DEVICEINFO_SERVICE_SYSTEM_ID_CHARACTERISTIC_UUID", 8, UUID.fromString("00002a23-0000-1000-8000-00805f9b34fb")) { // from class: com.lifesense.android.bluetooth.core.protocol.a.h
            {
                C0830a c0830a2 = null;
            }

            @Override // com.lifesense.android.bluetooth.core.protocol.a
            public void a(LsDeviceInfo lsDeviceInfo, byte[] bArr) {
                String strA = com.lifesense.android.bluetooth.core.tools.c.a(bArr);
                lsDeviceInfo.setDeviceId(strA.substring(0, Math.min(12, strA.length())));
            }
        };
        DEVICEINFO_SERVICE_SYSTEM_ID_CHARACTERISTIC_UUID = aVar8;
        b = new a[]{aVar, c0830a, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
    }

    public a(String str, int i, UUID uuid) {
        super(str, i);
        this.a = uuid;
    }

    public static a a(UUID uuid) {
        for (a aVar : values()) {
            if (aVar.a.equals(uuid)) {
                return aVar;
            }
        }
        return null;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) b.clone();
    }

    public /* synthetic */ a(String str, int i, UUID uuid, C0830a c0830a) {
        this(str, i, uuid);
    }

    public void a(LsDeviceInfo lsDeviceInfo, byte[] bArr) {
    }
}
