package com.garmin.fit;

import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.record.details.bean.SportSummaryBean;
import com.oplus.aiunit.vision.bxb;
import com.oplus.aiunit.vision.da7;
import com.oplus.aiunit.vision.jxb;
import com.oplus.aiunit.vision.p2j;
import com.oplus.aiunit.vision.s05;
import com.oplus.aiunit.vision.w97;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes13.dex */
public class h extends bxb implements jxb {
    public static final int ActiveTimeFieldNum = 56;
    public static final int AvgAltitudeFieldNum = 34;
    public static final int AvgCadenceFieldNum = 17;
    public static final int AvgCadencePositionFieldNum = 81;
    public static final int AvgCombinedPedalSmoothnessFieldNum = 63;
    public static final int AvgFlowFieldNum = 87;
    public static final int AvgFractionalCadenceFieldNum = 66;
    public static final int AvgGradeFieldNum = 37;
    public static final int AvgGritFieldNum = 86;
    public static final int AvgHeartRateFieldNum = 15;
    public static final int AvgLeftPcoFieldNum = 73;
    public static final int AvgLeftPedalSmoothnessFieldNum = 61;
    public static final int AvgLeftPowerPhaseFieldNum = 75;
    public static final int AvgLeftPowerPhasePeakFieldNum = 76;
    public static final int AvgLeftTorqueEffectivenessFieldNum = 59;
    public static final int AvgNegGradeFieldNum = 39;
    public static final int AvgNegVerticalSpeedFieldNum = 46;
    public static final int AvgPosGradeFieldNum = 38;
    public static final int AvgPosVerticalSpeedFieldNum = 45;
    public static final int AvgPowerFieldNum = 19;
    public static final int AvgPowerPositionFieldNum = 79;
    public static final int AvgRightPcoFieldNum = 74;
    public static final int AvgRightPedalSmoothnessFieldNum = 62;
    public static final int AvgRightPowerPhaseFieldNum = 77;
    public static final int AvgRightPowerPhasePeakFieldNum = 78;
    public static final int AvgRightTorqueEffectivenessFieldNum = 60;
    public static final int AvgSpeedFieldNum = 13;
    public static final int AvgTemperatureFieldNum = 42;
    public static final int EndPositionLatFieldNum = 5;
    public static final int EndPositionLongFieldNum = 6;
    public static final int EnhancedAvgAltitudeFieldNum = 91;
    public static final int EnhancedMaxAltitudeFieldNum = 92;
    public static final int EnhancedMinAltitudeFieldNum = 93;
    public static final int EventFieldNum = 0;
    public static final int EventGroupFieldNum = 24;
    public static final int EventTypeFieldNum = 1;
    public static final int FrontGearShiftCountFieldNum = 69;
    public static final int GpsAccuracyFieldNum = 36;
    public static final int LeftRightBalanceFieldNum = 31;
    public static final int ManufacturerFieldNum = 83;
    public static final int MaxAltitudeFieldNum = 35;
    public static final int MaxCadenceFieldNum = 18;
    public static final int MaxCadencePositionFieldNum = 82;
    public static final int MaxFractionalCadenceFieldNum = 67;
    public static final int MaxHeartRateFieldNum = 16;
    public static final int MaxNegGradeFieldNum = 41;
    public static final int MaxNegVerticalSpeedFieldNum = 48;
    public static final int MaxPosGradeFieldNum = 40;
    public static final int MaxPosVerticalSpeedFieldNum = 47;
    public static final int MaxPowerFieldNum = 20;
    public static final int MaxPowerPositionFieldNum = 80;
    public static final int MaxSpeedFieldNum = 14;
    public static final int MaxTemperatureFieldNum = 43;
    public static final int MessageIndexFieldNum = 254;
    public static final int MinAltitudeFieldNum = 54;
    public static final int MinHeartRateFieldNum = 55;
    public static final int NameFieldNum = 29;
    public static final int NecLatFieldNum = 25;
    public static final int NecLongFieldNum = 26;
    public static final int NormalizedPowerFieldNum = 30;
    public static final int RearGearShiftCountFieldNum = 70;
    public static final int RepetitionNumFieldNum = 53;
    public static final int SportEventFieldNum = 58;
    public static final int SportFieldNum = 23;
    public static final int StandCountFieldNum = 72;
    public static final int StartPositionLatFieldNum = 3;
    public static final int StartPositionLongFieldNum = 4;
    public static final int StartTimeFieldNum = 2;
    public static final int StatusFieldNum = 64;
    public static final int SubSportFieldNum = 32;
    public static final int SwcLatFieldNum = 27;
    public static final int SwcLongFieldNum = 28;
    public static final int TimeInCadenceZoneFieldNum = 51;
    public static final int TimeInHrZoneFieldNum = 49;
    public static final int TimeInPowerZoneFieldNum = 52;
    public static final int TimeInSpeedZoneFieldNum = 50;
    public static final int TimeStandingFieldNum = 71;
    public static final int TimestampFieldNum = 253;
    public static final int TotalAscentFieldNum = 21;
    public static final int TotalCaloriesFieldNum = 11;
    public static final int TotalCyclesFieldNum = 10;
    public static final int TotalDescentFieldNum = 22;
    public static final int TotalDistanceFieldNum = 9;
    public static final int TotalElapsedTimeFieldNum = 7;
    public static final int TotalFatCaloriesFieldNum = 12;
    public static final int TotalFlowFieldNum = 85;
    public static final int TotalFractionalAscentFieldNum = 89;
    public static final int TotalFractionalCyclesFieldNum = 68;
    public static final int TotalFractionalDescentFieldNum = 90;
    public static final int TotalGritFieldNum = 84;
    public static final int TotalMovingTimeFieldNum = 44;
    public static final int TotalTimerTimeFieldNum = 8;
    public static final int TotalWorkFieldNum = 33;
    public static final int UuidFieldNum = 65;
    public static final int WktStepIndexFieldNum = 57;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("segment_lap", 142);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.MESSAGE_INDEX;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.DATE_TIME;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, profile$Type2));
        bxbVar.e(new w97("event", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.EVENT));
        bxbVar.e(new w97("event_type", 1, 0, 1.0d, 0.0d, "", false, Profile$Type.EVENT_TYPE));
        bxbVar.e(new w97("start_time", 2, 134, 1.0d, 0.0d, "", false, profile$Type2));
        Profile$Type profile$Type3 = Profile$Type.SINT32;
        bxbVar.e(new w97("start_position_lat", 3, 133, 1.0d, 0.0d, "semicircles", false, profile$Type3));
        bxbVar.e(new w97("start_position_long", 4, 133, 1.0d, 0.0d, "semicircles", false, profile$Type3));
        bxbVar.e(new w97("end_position_lat", 5, 133, 1.0d, 0.0d, "semicircles", false, profile$Type3));
        bxbVar.e(new w97("end_position_long", 6, 133, 1.0d, 0.0d, "semicircles", false, profile$Type3));
        Profile$Type profile$Type4 = Profile$Type.UINT32;
        bxbVar.e(new w97("total_elapsed_time", 7, 134, 1000.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("total_timer_time", 8, 134, 1000.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("total_distance", 9, 134, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("total_cycles", 10, 134, 1.0d, 0.0d, "cycles", false, profile$Type4));
        bxbVar.d.get(12).k.add(new p2j("total_strokes", 134, 1.0d, 0.0d, "strokes"));
        bxbVar.d.get(12).k.get(0).b(23, 2L);
        Profile$Type profile$Type5 = Profile$Type.UINT16;
        bxbVar.e(new w97("total_calories", 11, 132, 1.0d, 0.0d, "kcal", false, profile$Type5));
        bxbVar.e(new w97("total_fat_calories", 12, 132, 1.0d, 0.0d, "kcal", false, profile$Type5));
        bxbVar.e(new w97(SportSummaryBean.AVG_SPEED, 13, 132, 1000.0d, 0.0d, "m/s", false, profile$Type5));
        bxbVar.e(new w97(SportSummaryBean.MAX_SPEED, 14, 132, 1000.0d, 0.0d, "m/s", false, profile$Type5));
        Profile$Type profile$Type6 = Profile$Type.UINT8;
        bxbVar.e(new w97(Element.ELEMENT_NAME_AVG_HEART_RATE, 15, 2, 1.0d, 0.0d, "bpm", false, profile$Type6));
        bxbVar.e(new w97(Element.ELEMENT_NAME_MAX_HEART_RATE, 16, 2, 1.0d, 0.0d, "bpm", false, profile$Type6));
        bxbVar.e(new w97("avg_cadence", 17, 2, 1.0d, 0.0d, "rpm", false, profile$Type6));
        bxbVar.e(new w97("max_cadence", 18, 2, 1.0d, 0.0d, "rpm", false, profile$Type6));
        bxbVar.e(new w97("avg_power", 19, 132, 1.0d, 0.0d, "watts", false, profile$Type5));
        bxbVar.e(new w97("max_power", 20, 132, 1.0d, 0.0d, "watts", false, profile$Type5));
        bxbVar.e(new w97("total_ascent", 21, 132, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        bxbVar.e(new w97("total_descent", 22, 132, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        bxbVar.e(new w97("sport", 23, 0, 1.0d, 0.0d, "", false, Profile$Type.SPORT));
        bxbVar.e(new w97("event_group", 24, 2, 1.0d, 0.0d, "", false, profile$Type6));
        bxbVar.e(new w97("nec_lat", 25, 133, 1.0d, 0.0d, "semicircles", false, profile$Type3));
        bxbVar.e(new w97("nec_long", 26, 133, 1.0d, 0.0d, "semicircles", false, profile$Type3));
        bxbVar.e(new w97("swc_lat", 27, 133, 1.0d, 0.0d, "semicircles", false, profile$Type3));
        bxbVar.e(new w97("swc_long", 28, 133, 1.0d, 0.0d, "semicircles", false, profile$Type3));
        Profile$Type profile$Type7 = Profile$Type.STRING;
        bxbVar.e(new w97("name", 29, 7, 1.0d, 0.0d, "", false, profile$Type7));
        bxbVar.e(new w97("normalized_power", 30, 132, 1.0d, 0.0d, "watts", false, profile$Type5));
        bxbVar.e(new w97("left_right_balance", 31, 132, 1.0d, 0.0d, "", false, Profile$Type.LEFT_RIGHT_BALANCE_100));
        bxbVar.e(new w97("sub_sport", 32, 0, 1.0d, 0.0d, "", false, Profile$Type.SUB_SPORT));
        bxbVar.e(new w97("total_work", 33, 134, 1.0d, 0.0d, "J", false, profile$Type4));
        bxbVar.e(new w97("avg_altitude", 34, 132, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        bxbVar.d.get(36).f18167j.add(new da7(91, false, 16, 5.0d, 500.0d));
        bxbVar.e(new w97("max_altitude", 35, 132, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        bxbVar.d.get(37).f18167j.add(new da7(92, false, 16, 5.0d, 500.0d));
        bxbVar.e(new w97("gps_accuracy", 36, 2, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type6));
        Profile$Type profile$Type8 = Profile$Type.SINT16;
        bxbVar.e(new w97("avg_grade", 37, 131, 100.0d, 0.0d, "%", false, profile$Type8));
        bxbVar.e(new w97("avg_pos_grade", 38, 131, 100.0d, 0.0d, "%", false, profile$Type8));
        bxbVar.e(new w97("avg_neg_grade", 39, 131, 100.0d, 0.0d, "%", false, profile$Type8));
        bxbVar.e(new w97("max_pos_grade", 40, 131, 100.0d, 0.0d, "%", false, profile$Type8));
        bxbVar.e(new w97("max_neg_grade", 41, 131, 100.0d, 0.0d, "%", false, profile$Type8));
        Profile$Type profile$Type9 = Profile$Type.SINT8;
        bxbVar.e(new w97("avg_temperature", 42, 1, 1.0d, 0.0d, "C", false, profile$Type9));
        bxbVar.e(new w97("max_temperature", 43, 1, 1.0d, 0.0d, "C", false, profile$Type9));
        bxbVar.e(new w97("total_moving_time", 44, 134, 1000.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("avg_pos_vertical_speed", 45, 131, 1000.0d, 0.0d, "m/s", false, profile$Type8));
        bxbVar.e(new w97("avg_neg_vertical_speed", 46, 131, 1000.0d, 0.0d, "m/s", false, profile$Type8));
        bxbVar.e(new w97("max_pos_vertical_speed", 47, 131, 1000.0d, 0.0d, "m/s", false, profile$Type8));
        bxbVar.e(new w97("max_neg_vertical_speed", 48, 131, 1000.0d, 0.0d, "m/s", false, profile$Type8));
        bxbVar.e(new w97("time_in_hr_zone", 49, 134, 1000.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("time_in_speed_zone", 50, 134, 1000.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("time_in_cadence_zone", 51, 134, 1000.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("time_in_power_zone", 52, 134, 1000.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("repetition_num", 53, 132, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("min_altitude", 54, 132, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        bxbVar.d.get(56).f18167j.add(new da7(93, false, 16, 5.0d, 500.0d));
        bxbVar.e(new w97("min_heart_rate", 55, 2, 1.0d, 0.0d, "bpm", false, profile$Type6));
        bxbVar.e(new w97("active_time", 56, 134, 1000.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("wkt_step_index", 57, 132, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("sport_event", 58, 0, 1.0d, 0.0d, "", false, Profile$Type.SPORT_EVENT));
        bxbVar.e(new w97("avg_left_torque_effectiveness", 59, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type6));
        bxbVar.e(new w97("avg_right_torque_effectiveness", 60, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type6));
        bxbVar.e(new w97("avg_left_pedal_smoothness", 61, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type6));
        bxbVar.e(new w97("avg_right_pedal_smoothness", 62, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type6));
        bxbVar.e(new w97("avg_combined_pedal_smoothness", 63, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type6));
        bxbVar.e(new w97("status", 64, 0, 1.0d, 0.0d, "", false, Profile$Type.SEGMENT_LAP_STATUS));
        bxbVar.e(new w97("uuid", 65, 7, 1.0d, 0.0d, "", false, profile$Type7));
        bxbVar.e(new w97("avg_fractional_cadence", 66, 2, 128.0d, 0.0d, "rpm", false, profile$Type6));
        bxbVar.e(new w97("max_fractional_cadence", 67, 2, 128.0d, 0.0d, "rpm", false, profile$Type6));
        bxbVar.e(new w97("total_fractional_cycles", 68, 2, 128.0d, 0.0d, "cycles", false, profile$Type6));
        bxbVar.e(new w97("front_gear_shift_count", 69, 132, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("rear_gear_shift_count", 70, 132, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("time_standing", 71, 134, 1000.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("stand_count", 72, 132, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("avg_left_pco", 73, 1, 1.0d, 0.0d, "mm", false, profile$Type9));
        bxbVar.e(new w97("avg_right_pco", 74, 1, 1.0d, 0.0d, "mm", false, profile$Type9));
        bxbVar.e(new w97("avg_left_power_phase", 75, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type6));
        bxbVar.e(new w97("avg_left_power_phase_peak", 76, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type6));
        bxbVar.e(new w97("avg_right_power_phase", 77, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type6));
        bxbVar.e(new w97("avg_right_power_phase_peak", 78, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type6));
        bxbVar.e(new w97("avg_power_position", 79, 132, 1.0d, 0.0d, "watts", false, profile$Type5));
        bxbVar.e(new w97("max_power_position", 80, 132, 1.0d, 0.0d, "watts", false, profile$Type5));
        bxbVar.e(new w97("avg_cadence_position", 81, 2, 1.0d, 0.0d, "rpm", false, profile$Type6));
        bxbVar.e(new w97("max_cadence_position", 82, 2, 1.0d, 0.0d, "rpm", false, profile$Type6));
        bxbVar.e(new w97("manufacturer", 83, 132, 1.0d, 0.0d, "", false, Profile$Type.MANUFACTURER));
        Profile$Type profile$Type10 = Profile$Type.FLOAT32;
        bxbVar.e(new w97("total_grit", 84, 136, 1.0d, 0.0d, "kGrit", false, profile$Type10));
        bxbVar.e(new w97("total_flow", 85, 136, 1.0d, 0.0d, "Flow", false, profile$Type10));
        bxbVar.e(new w97("avg_grit", 86, 136, 1.0d, 0.0d, "kGrit", false, profile$Type10));
        bxbVar.e(new w97("avg_flow", 87, 136, 1.0d, 0.0d, "Flow", false, profile$Type10));
        bxbVar.e(new w97("total_fractional_ascent", 89, 2, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type6));
        bxbVar.e(new w97("total_fractional_descent", 90, 2, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type6));
        bxbVar.e(new w97("enhanced_avg_altitude", 91, 134, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("enhanced_max_altitude", 92, 134, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("enhanced_min_altitude", 93, 134, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
    }

    public h(bxb bxbVar) {
        super(bxbVar);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public Short a() {
        return n(24, 0, 65535);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public void b(s05 s05Var) {
        v(253, 0, s05Var.l(), 65535);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public void c(EventType eventType) {
        v(1, 0, Short.valueOf(eventType.value), 65535);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public Event getEvent() {
        Short shN = n(0, 0, 65535);
        if (shN == null) {
            return null;
        }
        return Event.getByValue(shN);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public EventType getEventType() {
        Short shN = n(1, 0, 65535);
        if (shN == null) {
            return null;
        }
        return EventType.getByValue(shN);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public s05 getTimestamp() {
        return x(m(253, 0, 65535));
    }
}
