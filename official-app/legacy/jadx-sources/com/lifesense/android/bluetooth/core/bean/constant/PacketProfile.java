package com.lifesense.android.bluetooth.core.bean.constant;

import android.util.Log;
import com.lifesense.android.bluetooth.core.bean.BaseDeviceData;
import com.lifesense.android.bluetooth.core.bean.HandlerMessage;
import com.lifesense.android.bluetooth.core.protocol.parser.c;
import java.util.Collections;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes4.dex */
public enum PacketProfile {
    EXCEPTION(255),
    UNKNOWN(0),
    PACKET_RESPONSE_COMMAND(1),
    PUSH_CALL_MESSAGE(2),
    PUSH_ANCS_MESSAGE(3),
    PUSH_USER_INFO_TO_PEDOMETER(104),
    PUSH_ALARM_CLOCK_TO_PEDOMETER(105),
    PUSH_CALLS_TO_REMIND_TO_PEDOMETER(106),
    PUSH_HEART_RATE_DETECTION_PEDOMETER(109),
    PUSH_SEDENTARY_TO_PEDOMETER(110),
    PUSH_ANTI_LOST(111),
    PUSH_HEART_DETECTION(118),
    PUSH_ATNIGHT(119),
    PUSH_DISTURB(179),
    PUSH_WEARING_WAY(122),
    PUSH_SCREEN_MODE(125),
    PUSH_PAGE_CUSTOM(126),
    PUSH_CLOCK_DIA_STYLE(161),
    PUSH_AUTO_RECOGNITION(162),
    PUSH_EVENT_REMINDER(163),
    PUSH_ENCOURAGE_MULTI(165),
    PUSH_WEATHER(166),
    PUSH_UNIT(120),
    PUSH_TIME_FORMAT(121),
    PUSH_HEART_RATE_ALERT(168),
    PUSH_GPS_STATE(167),
    PUSH_CONTROL_STATUS(169),
    PUSH_SPORTS_INFO(171),
    PUSH_SWIMMING_INFO(172),
    PUSH_LANGUAGE(170),
    PUSH_FUNCTION_SWITCH(173),
    PUSH_MOMBO_PLUS_ENCOURAGE_INFO(112),
    PUSH_MOMBO_PLUS_HEART_RATE_RANGE(113),
    PUSH_MOMBO_PLUS_HEART_RATE_RANGE_FOR_AGE(116),
    QUERY_DEVICE_CONFIG_INFO(102),
    PEDOMETER_DEVIE_INFO(80) { // from class: com.lifesense.android.bluetooth.core.bean.constant.PacketProfile.1
        @Override // com.lifesense.android.bluetooth.core.bean.constant.PacketProfile
        public BaseDeviceData decodePackage(HandlerMessage handlerMessage) {
            return super.decodePackage(handlerMessage);
        }
    },
    DAILY_MEASUREMENT_DATA(81),
    PER_HOUR_MEASUREMENT_DATA(87),
    SLEEP_DATA(82),
    HEART_RATE_DATA(83),
    SWIMMING_LAPS(100),
    HEART_RATE_STATISTICS(117),
    BLOOD_OXYGEN_DATA(101),
    RUNNING_STATUS_DATA(114),
    RUNNING_HEART_RATE_DATA(115),
    RUNNING_CALORIE_DATA(127),
    UPLOAD_DEVICE_CONFIG_INFO(103),
    PUSH_AEROBIC(175),
    NOTIFY_AEROBIC(235),
    SPORTS_MODE_NOTIFY(225),
    SPORTS_STATUS_DATA(226),
    SPORTS_PACE_DATA(228),
    SPORTS_HEART_RATE_DATA(229),
    SPORTS_CALORIE_DATA(230),
    HEART_BEAT_DATA(232),
    DEVICE_LOG_INFO(234),
    NEW_MEASURE_DATA(233),
    PEDOMETER_PAIRING_RANDOM(123),
    PEDOMETER_PAIRING_CONFIRM(227),
    DEVICE_REGISTE_DEVIEC_ID(1),
    DEVICE_REGISTE_RESULT(2),
    DEVICE_A6_AUTH(8),
    DEVICE_A6_BIND_NOTICE(3),
    DEVICE_A6_UNBIND_NOTICE(5),
    DEVICE_A6_BIND_RESULT(4),
    DEVICE_A6_UNBIND_RESULT(6),
    DEVICE_A6_RECEIVER_AUTH(7),
    DEVICE_A6_RECEIVER_INIT(9),
    DEVICE_A6_RESPONSE_INIT(10),
    DEVICE_A6_SETTING_CALLBACK(4096),
    DEVICE_A6_MEASURE_SETTING(18433),
    DEVICE_A6_WEIGHT_DATA(18434),
    PUSH_USER_INFO_TO_WEIGHT_FOR_A6(4097),
    PUSH_TIME_TO_WEIGHT_FOR_A6(4098),
    PUSH_TARGET_TO_WEIGHT_FOR_A6(4099),
    PUSH_UNIT_TO_WEIGHT_FOR_A6(4100),
    PUSH_CLEAR_DATA_TO_WEIGHT_FOR_A6(4101),
    PUSH_FORMULA_TO_WEIGHT_FOR_A6(4102),
    RECEIVE_USER_INFO_TO_WEIGHT_FOR_A6(8193),
    RECEIVE_TARGET_TO_WEIGHT_FOR_A6(8195),
    RECEIVE_UNIT_TO_WEIGHT_FOR_A6(8196),
    REAL_TIME_MEASURE_DATA(65535),
    PUSH_HEART_RATE_SWITCH_FOR_A6(4103),
    GET_BP_MEASURE_DATA(18689),
    BP_MEASURE_DATA(18690);

    public int commndValue;

    PacketProfile(int i) {
        this.commndValue = i;
    }

    public static PacketProfile fromCommand(String str) {
        if (StringUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        try {
            int i = Integer.parseInt(str, 16);
            for (PacketProfile packetProfile : values()) {
                if (packetProfile.getCommndValue() == i) {
                    return packetProfile;
                }
            }
            return UNKNOWN;
        } catch (Exception e2) {
            Log.e("Exception", "parse command error", e2);
            return EXCEPTION;
        }
    }

    public BaseDeviceData decodePackage(HandlerMessage handlerMessage) {
        c.a aVarA = c.a(this);
        BaseDeviceData baseDeviceData = null;
        if (aVarA == null) {
            return null;
        }
        try {
            BaseDeviceData baseDeviceDataNewInstance = aVarA.a().newInstance();
            try {
                baseDeviceDataNewInstance.decodeFromMessage(handlerMessage);
                if (handlerMessage.getLsDevice() == null) {
                    return baseDeviceDataNewInstance;
                }
                baseDeviceDataNewInstance.setDeviceId(handlerMessage.getLsDevice().getDeviceId());
                baseDeviceDataNewInstance.setBroadcastId(handlerMessage.getLsDevice().getBroadcastID());
                return baseDeviceDataNewInstance;
            } catch (Exception e2) {
                e = e2;
                baseDeviceData = baseDeviceDataNewInstance;
                Log.e("Package", e.getMessage());
                return baseDeviceData;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public List<BaseDeviceData> decodePackages(HandlerMessage handlerMessage) {
        c.a aVarA = c.a(this);
        if (aVarA == null) {
            return null;
        }
        try {
            List<BaseDeviceData> listDecodeListFromData = aVarA.a().newInstance().decodeListFromData((String) handlerMessage.getData());
            if (CollectionUtils.isEmpty(listDecodeListFromData)) {
                return Collections.emptyList();
            }
            if (handlerMessage.getLsDevice() != null) {
                for (BaseDeviceData baseDeviceData : listDecodeListFromData) {
                    baseDeviceData.setBroadcastId(handlerMessage.getLsDevice().getBroadcastID());
                    baseDeviceData.setDeviceId(handlerMessage.getLsDevice().getDeviceId());
                }
            }
            return listDecodeListFromData;
        } catch (Exception e2) {
            Log.e("Package", e2.getMessage());
            return null;
        }
    }

    public int getCommndValue() {
        return this.commndValue;
    }
}
