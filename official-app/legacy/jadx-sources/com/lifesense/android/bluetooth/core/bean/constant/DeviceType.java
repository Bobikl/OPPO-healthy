package com.lifesense.android.bluetooth.core.bean.constant;

import com.lifesense.android.bluetooth.core.enums.ProtocolType;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'FAT_SCALE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class DeviceType {
    public static final /* synthetic */ DeviceType[] $VALUES;
    public static final DeviceType BLOOD_PRESSURE;
    public static final DeviceType FAT_SCALE;
    public static final DeviceType PEDOMETER;
    public static final DeviceType UNKNOWN;
    public String id;
    public List<ProtocolType> protocolTypeList;

    static {
        DeviceType deviceType = new DeviceType(LanConstants.OPERATOR_UNKNOWN, 0, "00", Collections.EMPTY_LIST);
        UNKNOWN = deviceType;
        ProtocolType protocolType = ProtocolType.A6;
        DeviceType deviceType2 = new DeviceType("FAT_SCALE", 1, "02", Arrays.asList(protocolType));
        FAT_SCALE = deviceType2;
        DeviceType deviceType3 = new DeviceType("BLOOD_PRESSURE", 2, "08", Arrays.asList(protocolType));
        BLOOD_PRESSURE = deviceType3;
        DeviceType deviceType4 = new DeviceType("PEDOMETER", 3, "04", Arrays.asList(ProtocolType.A5));
        PEDOMETER = deviceType4;
        $VALUES = new DeviceType[]{deviceType, deviceType2, deviceType3, deviceType4};
    }

    public DeviceType(String str, int i, String str2, List list) {
        super(str, i);
        this.id = str2;
        this.protocolTypeList = list;
    }

    public static DeviceType getDeviceTypeById(String str) {
        for (DeviceType deviceType : values()) {
            if (deviceType.id.equalsIgnoreCase(str)) {
                return deviceType;
            }
        }
        return UNKNOWN;
    }

    public static DeviceType getDeviceTypeByProductTypeCode(int i) {
        if (i != 3) {
            if (i == 4) {
                return BLOOD_PRESSURE;
            }
            if (i != 5) {
                return UNKNOWN;
            }
        }
        return FAT_SCALE;
    }

    public static DeviceType valueOf(String str) {
        return (DeviceType) Enum.valueOf(DeviceType.class, str);
    }

    public static DeviceType[] values() {
        return (DeviceType[]) $VALUES.clone();
    }

    public String getId() {
        return this.id;
    }

    public List<ProtocolType> getProtocolTypeList() {
        return this.protocolTypeList;
    }

    public List<String> getServiceUUIDStringList() {
        ArrayList arrayList = new ArrayList();
        Iterator<ProtocolType> it = this.protocolTypeList.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getServiceUUIDStringList());
        }
        return arrayList;
    }
}
