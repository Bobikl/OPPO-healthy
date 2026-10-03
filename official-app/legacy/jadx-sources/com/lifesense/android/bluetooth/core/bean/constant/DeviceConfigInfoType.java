package com.lifesense.android.bluetooth.core.bean.constant;

import com.lifesense.plugin.ble.data.other.DeviceTypeConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public enum DeviceConfigInfoType {
    A2_PEDOMETER_USER_MESSAGE,
    A2_PEDOMETER_CURRENT_STATE,
    A2_PEDOMETER_WEEK_TARGET_STATE,
    A2_PEDOMETER_UNIT_CONVERSION,
    A5_PEDOMETER_USER_INFO,
    A5_PEDOMETER_ALARM_CLOCK,
    A5_PEDOMETER_ANTI_LOST,
    A5_PEDOMETER_SEDENTARY,
    A5_HEART_RATE_DETECTION,
    PEDOMETER_INCOMING_CALL_MESSAGE,
    PEDOMETER_ANCS_MESSAGE,
    MOMBO_PLUS_ENCOURAGE_INFO,
    MOMBO_PLUS_HEART_RATE_RANGE,
    MOMBO_PLUS_PEDOMETER_FLASH_INFO,
    CALL_REMINDER_INFO,
    CLEAR_USER_RECORDS,
    UPDATE_DEVICE_UNIT,
    A6_WEIGHT_SCALE_USER_INFO,
    A6_WEIGHT_SCALE_UNBIND,
    A6_WEIGHT_SCALE_UNIT,
    A6_WEIGHT_SCALE_FORMULA,
    A6_WEIGHT_SCALE_TARGET,
    A6_WEIGHT_SCALE_TIME,
    A6_HEART_RATE_SWITCH;

    public static Map<DeviceConfigInfoType, PacketProfile> commandMapping;

    static {
        DeviceConfigInfoType deviceConfigInfoType = A6_WEIGHT_SCALE_USER_INFO;
        DeviceConfigInfoType deviceConfigInfoType2 = A6_WEIGHT_SCALE_UNBIND;
        DeviceConfigInfoType deviceConfigInfoType3 = A6_WEIGHT_SCALE_UNIT;
        DeviceConfigInfoType deviceConfigInfoType4 = A6_WEIGHT_SCALE_FORMULA;
        DeviceConfigInfoType deviceConfigInfoType5 = A6_WEIGHT_SCALE_TARGET;
        DeviceConfigInfoType deviceConfigInfoType6 = A6_WEIGHT_SCALE_TIME;
        DeviceConfigInfoType deviceConfigInfoType7 = A6_HEART_RATE_SWITCH;
        HashMap map = new HashMap();
        commandMapping = map;
        map.put(deviceConfigInfoType5, PacketProfile.PUSH_TARGET_TO_WEIGHT_FOR_A6);
        commandMapping.put(deviceConfigInfoType, PacketProfile.PUSH_USER_INFO_TO_WEIGHT_FOR_A6);
        commandMapping.put(deviceConfigInfoType6, PacketProfile.PUSH_TIME_TO_WEIGHT_FOR_A6);
        commandMapping.put(deviceConfigInfoType3, PacketProfile.PUSH_UNIT_TO_WEIGHT_FOR_A6);
        commandMapping.put(deviceConfigInfoType4, PacketProfile.PUSH_FORMULA_TO_WEIGHT_FOR_A6);
        commandMapping.put(deviceConfigInfoType7, PacketProfile.PUSH_HEART_RATE_SWITCH_FOR_A6);
        commandMapping.put(deviceConfigInfoType2, PacketProfile.DEVICE_A6_UNBIND_NOTICE);
    }

    public static DeviceConfigInfoType formType(String str) {
        if ("00".equalsIgnoreCase(str)) {
            return MOMBO_PLUS_PEDOMETER_FLASH_INFO;
        }
        if ("01".equalsIgnoreCase(str)) {
            return A5_PEDOMETER_USER_INFO;
        }
        if ("02".equalsIgnoreCase(str)) {
            return A5_PEDOMETER_ALARM_CLOCK;
        }
        if (DeviceTypeConstants.HEIGHT_RULER.equalsIgnoreCase(str)) {
            return PEDOMETER_INCOMING_CALL_MESSAGE;
        }
        if ("04".equalsIgnoreCase(str)) {
            return A5_HEART_RATE_DETECTION;
        }
        if (DeviceTypeConstants.WAIST_RULER.equalsIgnoreCase(str)) {
            return A5_PEDOMETER_SEDENTARY;
        }
        if ("06".equalsIgnoreCase(str)) {
            return A5_PEDOMETER_ANTI_LOST;
        }
        return null;
    }

    public static PacketProfile get(DeviceConfigInfoType deviceConfigInfoType) {
        return commandMapping.get(deviceConfigInfoType);
    }
}
