package com.garmin.fit;

import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.record.details.bean.SportSummaryBean;
import com.oplus.aiunit.vision.bxb;
import com.oplus.aiunit.vision.da7;
import com.oplus.aiunit.vision.jxb;
import com.oplus.aiunit.vision.p2j;
import com.oplus.aiunit.vision.s05;
import com.oplus.aiunit.vision.w07;
import com.oplus.aiunit.vision.w97;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes13.dex */
public class e extends bxb implements jxb {
    public static final int AvgAltitudeFieldNum = 42;
    public static final int AvgCadenceFieldNum = 17;
    public static final int AvgCadencePositionFieldNum = 108;
    public static final int AvgCombinedPedalSmoothnessFieldNum = 95;
    public static final int AvgCoreTemperatureFieldNum = 158;
    public static final int AvgDepthFieldNum = 122;
    public static final int AvgFlowFieldNum = 154;
    public static final int AvgFractionalCadenceFieldNum = 80;
    public static final int AvgGradeFieldNum = 45;
    public static final int AvgGritFieldNum = 153;
    public static final int AvgHeartRateFieldNum = 15;
    public static final int AvgLeftPcoFieldNum = 100;
    public static final int AvgLeftPedalSmoothnessFieldNum = 93;
    public static final int AvgLeftPowerPhaseFieldNum = 102;
    public static final int AvgLeftPowerPhasePeakFieldNum = 103;
    public static final int AvgLeftTorqueEffectivenessFieldNum = 91;
    public static final int AvgLevMotorPowerFieldNum = 115;
    public static final int AvgNegGradeFieldNum = 47;
    public static final int AvgNegVerticalSpeedFieldNum = 54;
    public static final int AvgPosGradeFieldNum = 46;
    public static final int AvgPosVerticalSpeedFieldNum = 53;
    public static final int AvgPowerFieldNum = 19;
    public static final int AvgPowerPositionFieldNum = 106;
    public static final int AvgRespirationRateFieldNum = 147;
    public static final int AvgRightPcoFieldNum = 101;
    public static final int AvgRightPedalSmoothnessFieldNum = 94;
    public static final int AvgRightPowerPhaseFieldNum = 104;
    public static final int AvgRightPowerPhasePeakFieldNum = 105;
    public static final int AvgRightTorqueEffectivenessFieldNum = 92;
    public static final int AvgSaturatedHemoglobinPercentFieldNum = 87;
    public static final int AvgSpeedFieldNum = 13;
    public static final int AvgStanceTimeBalanceFieldNum = 119;
    public static final int AvgStanceTimeFieldNum = 79;
    public static final int AvgStanceTimePercentFieldNum = 78;
    public static final int AvgStepLengthFieldNum = 120;
    public static final int AvgStrokeDistanceFieldNum = 37;
    public static final int AvgTemperatureFieldNum = 50;
    public static final int AvgTotalHemoglobinConcFieldNum = 84;
    public static final int AvgVamFieldNum = 121;
    public static final int AvgVerticalOscillationFieldNum = 77;
    public static final int AvgVerticalRatioFieldNum = 118;
    public static final int EndPositionLatFieldNum = 5;
    public static final int EndPositionLongFieldNum = 6;
    public static final int EnhancedAvgAltitudeFieldNum = 112;
    public static final int EnhancedAvgRespirationRateFieldNum = 136;
    public static final int EnhancedAvgSpeedFieldNum = 110;
    public static final int EnhancedMaxAltitudeFieldNum = 114;
    public static final int EnhancedMaxRespirationRateFieldNum = 137;
    public static final int EnhancedMaxSpeedFieldNum = 111;
    public static final int EnhancedMinAltitudeFieldNum = 113;
    public static final int EventFieldNum = 0;
    public static final int EventGroupFieldNum = 26;
    public static final int EventTypeFieldNum = 1;
    public static final int FirstLengthIndexFieldNum = 35;
    public static final int GpsAccuracyFieldNum = 44;
    public static final int IntensityFieldNum = 23;
    public static final int JumpCountFieldNum = 151;
    public static final int LapTriggerFieldNum = 24;
    public static final int LeftRightBalanceFieldNum = 34;
    public static final int LevBatteryConsumptionFieldNum = 117;
    public static final int MaxAltitudeFieldNum = 43;
    public static final int MaxCadenceFieldNum = 18;
    public static final int MaxCadencePositionFieldNum = 109;
    public static final int MaxCoreTemperatureFieldNum = 160;
    public static final int MaxDepthFieldNum = 123;
    public static final int MaxFractionalCadenceFieldNum = 81;
    public static final int MaxHeartRateFieldNum = 16;
    public static final int MaxLevMotorPowerFieldNum = 116;
    public static final int MaxNegGradeFieldNum = 49;
    public static final int MaxNegVerticalSpeedFieldNum = 56;
    public static final int MaxPosGradeFieldNum = 48;
    public static final int MaxPosVerticalSpeedFieldNum = 55;
    public static final int MaxPowerFieldNum = 20;
    public static final int MaxPowerPositionFieldNum = 107;
    public static final int MaxRespirationRateFieldNum = 148;
    public static final int MaxSaturatedHemoglobinPercentFieldNum = 89;
    public static final int MaxSpeedFieldNum = 14;
    public static final int MaxTemperatureFieldNum = 51;
    public static final int MaxTotalHemoglobinConcFieldNum = 86;
    public static final int MessageIndexFieldNum = 254;
    public static final int MinAltitudeFieldNum = 62;
    public static final int MinCoreTemperatureFieldNum = 159;
    public static final int MinHeartRateFieldNum = 63;
    public static final int MinSaturatedHemoglobinPercentFieldNum = 88;
    public static final int MinTemperatureFieldNum = 124;
    public static final int MinTotalHemoglobinConcFieldNum = 85;
    public static final int NormalizedPowerFieldNum = 33;
    public static final int NumActiveLengthsFieldNum = 40;
    public static final int NumLengthsFieldNum = 32;
    public static final int OpponentScoreFieldNum = 74;
    public static final int PlayerScoreFieldNum = 83;
    public static final int RepetitionNumFieldNum = 61;
    public static final int SportFieldNum = 25;
    public static final int StandCountFieldNum = 99;
    public static final int StartPositionLatFieldNum = 3;
    public static final int StartPositionLongFieldNum = 4;
    public static final int StartTimeFieldNum = 2;
    public static final int StrokeCountFieldNum = 75;
    public static final int SubSportFieldNum = 39;
    public static final int SwimStrokeFieldNum = 38;
    public static final int TimeInCadenceZoneFieldNum = 59;
    public static final int TimeInHrZoneFieldNum = 57;
    public static final int TimeInPowerZoneFieldNum = 60;
    public static final int TimeInSpeedZoneFieldNum = 58;
    public static final int TimeStandingFieldNum = 98;
    public static final int TimestampFieldNum = 253;
    public static final int TotalAscentFieldNum = 21;
    public static final int TotalCaloriesFieldNum = 11;
    public static final int TotalCyclesFieldNum = 10;
    public static final int TotalDescentFieldNum = 22;
    public static final int TotalDistanceFieldNum = 9;
    public static final int TotalElapsedTimeFieldNum = 7;
    public static final int TotalFatCaloriesFieldNum = 12;
    public static final int TotalFlowFieldNum = 150;
    public static final int TotalFractionalAscentFieldNum = 156;
    public static final int TotalFractionalCyclesFieldNum = 82;
    public static final int TotalFractionalDescentFieldNum = 157;
    public static final int TotalGritFieldNum = 149;
    public static final int TotalMovingTimeFieldNum = 52;
    public static final int TotalTimerTimeFieldNum = 8;
    public static final int TotalWorkFieldNum = 41;
    public static final int WktStepIndexFieldNum = 71;
    public static final int ZoneCountFieldNum = 76;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("lap", 19);
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
        bxbVar.d.get(12).k.add(new p2j("total_strides", 134, 1.0d, 0.0d, "strides"));
        bxbVar.d.get(12).k.get(0).b(25, 1L);
        bxbVar.d.get(12).k.get(0).b(25, 11L);
        bxbVar.d.get(12).k.add(new p2j("total_strokes", 134, 1.0d, 0.0d, "strokes"));
        bxbVar.d.get(12).k.get(1).b(25, 2L);
        bxbVar.d.get(12).k.get(1).b(25, 5L);
        bxbVar.d.get(12).k.get(1).b(25, 15L);
        bxbVar.d.get(12).k.get(1).b(25, 37L);
        Profile$Type profile$Type5 = Profile$Type.UINT16;
        bxbVar.e(new w97("total_calories", 11, 132, 1.0d, 0.0d, "kcal", false, profile$Type5));
        bxbVar.e(new w97("total_fat_calories", 12, 132, 1.0d, 0.0d, "kcal", false, profile$Type5));
        bxbVar.e(new w97(SportSummaryBean.AVG_SPEED, 13, 132, 1000.0d, 0.0d, "m/s", false, profile$Type5));
        bxbVar.d.get(15).f18167j.add(new da7(110, false, 16, 1000.0d, 0.0d));
        bxbVar.e(new w97(SportSummaryBean.MAX_SPEED, 14, 132, 1000.0d, 0.0d, "m/s", false, profile$Type5));
        bxbVar.d.get(16).f18167j.add(new da7(111, false, 16, 1000.0d, 0.0d));
        Profile$Type profile$Type6 = Profile$Type.UINT8;
        bxbVar.e(new w97(Element.ELEMENT_NAME_AVG_HEART_RATE, 15, 2, 1.0d, 0.0d, "bpm", false, profile$Type6));
        bxbVar.e(new w97(Element.ELEMENT_NAME_MAX_HEART_RATE, 16, 2, 1.0d, 0.0d, "bpm", false, profile$Type6));
        bxbVar.e(new w97("avg_cadence", 17, 2, 1.0d, 0.0d, "rpm", false, profile$Type6));
        bxbVar.d.get(19).k.add(new p2j("avg_running_cadence", 2, 1.0d, 0.0d, "strides/min"));
        bxbVar.d.get(19).k.get(0).b(25, 1L);
        bxbVar.e(new w97("max_cadence", 18, 2, 1.0d, 0.0d, "rpm", false, profile$Type6));
        bxbVar.d.get(20).k.add(new p2j("max_running_cadence", 2, 1.0d, 0.0d, "strides/min"));
        bxbVar.d.get(20).k.get(0).b(25, 1L);
        bxbVar.e(new w97("avg_power", 19, 132, 1.0d, 0.0d, "watts", false, profile$Type5));
        bxbVar.e(new w97("max_power", 20, 132, 1.0d, 0.0d, "watts", false, profile$Type5));
        bxbVar.e(new w97("total_ascent", 21, 132, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        bxbVar.e(new w97("total_descent", 22, 132, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        bxbVar.e(new w97("intensity", 23, 0, 1.0d, 0.0d, "", false, Profile$Type.INTENSITY));
        bxbVar.e(new w97("lap_trigger", 24, 0, 1.0d, 0.0d, "", false, Profile$Type.LAP_TRIGGER));
        bxbVar.e(new w97("sport", 25, 0, 1.0d, 0.0d, "", false, Profile$Type.SPORT));
        bxbVar.e(new w97("event_group", 26, 2, 1.0d, 0.0d, "", false, profile$Type6));
        bxbVar.e(new w97("num_lengths", 32, 132, 1.0d, 0.0d, "lengths", false, profile$Type5));
        bxbVar.e(new w97("normalized_power", 33, 132, 1.0d, 0.0d, "watts", false, profile$Type5));
        bxbVar.e(new w97("left_right_balance", 34, 132, 1.0d, 0.0d, "", false, Profile$Type.LEFT_RIGHT_BALANCE_100));
        bxbVar.e(new w97("first_length_index", 35, 132, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("avg_stroke_distance", 37, 132, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        bxbVar.e(new w97("swim_stroke", 38, 0, 1.0d, 0.0d, "", false, Profile$Type.SWIM_STROKE));
        bxbVar.e(new w97("sub_sport", 39, 0, 1.0d, 0.0d, "", false, Profile$Type.SUB_SPORT));
        bxbVar.e(new w97("num_active_lengths", 40, 132, 1.0d, 0.0d, "lengths", false, profile$Type5));
        bxbVar.e(new w97("total_work", 41, 134, 1.0d, 0.0d, "J", false, profile$Type4));
        bxbVar.e(new w97("avg_altitude", 42, 132, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        bxbVar.d.get(38).f18167j.add(new da7(112, false, 16, 5.0d, 500.0d));
        bxbVar.e(new w97("max_altitude", 43, 132, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        bxbVar.d.get(39).f18167j.add(new da7(114, false, 16, 5.0d, 500.0d));
        bxbVar.e(new w97("gps_accuracy", 44, 2, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type6));
        Profile$Type profile$Type7 = Profile$Type.SINT16;
        bxbVar.e(new w97("avg_grade", 45, 131, 100.0d, 0.0d, "%", false, profile$Type7));
        bxbVar.e(new w97("avg_pos_grade", 46, 131, 100.0d, 0.0d, "%", false, profile$Type7));
        bxbVar.e(new w97("avg_neg_grade", 47, 131, 100.0d, 0.0d, "%", false, profile$Type7));
        bxbVar.e(new w97("max_pos_grade", 48, 131, 100.0d, 0.0d, "%", false, profile$Type7));
        bxbVar.e(new w97("max_neg_grade", 49, 131, 100.0d, 0.0d, "%", false, profile$Type7));
        Profile$Type profile$Type8 = Profile$Type.SINT8;
        bxbVar.e(new w97("avg_temperature", 50, 1, 1.0d, 0.0d, "C", false, profile$Type8));
        bxbVar.e(new w97("max_temperature", 51, 1, 1.0d, 0.0d, "C", false, profile$Type8));
        bxbVar.e(new w97("total_moving_time", 52, 134, 1000.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("avg_pos_vertical_speed", 53, 131, 1000.0d, 0.0d, "m/s", false, profile$Type7));
        bxbVar.e(new w97("avg_neg_vertical_speed", 54, 131, 1000.0d, 0.0d, "m/s", false, profile$Type7));
        bxbVar.e(new w97("max_pos_vertical_speed", 55, 131, 1000.0d, 0.0d, "m/s", false, profile$Type7));
        bxbVar.e(new w97("max_neg_vertical_speed", 56, 131, 1000.0d, 0.0d, "m/s", false, profile$Type7));
        bxbVar.e(new w97("time_in_hr_zone", 57, 134, 1000.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("time_in_speed_zone", 58, 134, 1000.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("time_in_cadence_zone", 59, 134, 1000.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("time_in_power_zone", 60, 134, 1000.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("repetition_num", 61, 132, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("min_altitude", 62, 132, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        bxbVar.d.get(58).f18167j.add(new da7(113, false, 16, 5.0d, 500.0d));
        bxbVar.e(new w97("min_heart_rate", 63, 2, 1.0d, 0.0d, "bpm", false, profile$Type6));
        bxbVar.e(new w97("wkt_step_index", 71, 132, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("opponent_score", 74, 132, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("stroke_count", 75, 132, 1.0d, 0.0d, "counts", false, profile$Type5));
        bxbVar.e(new w97("zone_count", 76, 132, 1.0d, 0.0d, "counts", false, profile$Type5));
        bxbVar.e(new w97("avg_vertical_oscillation", 77, 132, 10.0d, 0.0d, "mm", false, profile$Type5));
        bxbVar.e(new w97("avg_stance_time_percent", 78, 132, 100.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type5));
        bxbVar.e(new w97("avg_stance_time", 79, 132, 10.0d, 0.0d, "ms", false, profile$Type5));
        bxbVar.e(new w97("avg_fractional_cadence", 80, 2, 128.0d, 0.0d, "rpm", false, profile$Type6));
        bxbVar.e(new w97("max_fractional_cadence", 81, 2, 128.0d, 0.0d, "rpm", false, profile$Type6));
        bxbVar.e(new w97("total_fractional_cycles", 82, 2, 128.0d, 0.0d, "cycles", false, profile$Type6));
        bxbVar.e(new w97("player_score", 83, 132, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("avg_total_hemoglobin_conc", 84, 132, 100.0d, 0.0d, "g/dL", false, profile$Type5));
        bxbVar.e(new w97("min_total_hemoglobin_conc", 85, 132, 100.0d, 0.0d, "g/dL", false, profile$Type5));
        bxbVar.e(new w97("max_total_hemoglobin_conc", 86, 132, 100.0d, 0.0d, "g/dL", false, profile$Type5));
        bxbVar.e(new w97("avg_saturated_hemoglobin_percent", 87, 132, 10.0d, 0.0d, "%", false, profile$Type5));
        bxbVar.e(new w97("min_saturated_hemoglobin_percent", 88, 132, 10.0d, 0.0d, "%", false, profile$Type5));
        bxbVar.e(new w97("max_saturated_hemoglobin_percent", 89, 132, 10.0d, 0.0d, "%", false, profile$Type5));
        bxbVar.e(new w97("avg_left_torque_effectiveness", 91, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type6));
        bxbVar.e(new w97("avg_right_torque_effectiveness", 92, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type6));
        bxbVar.e(new w97("avg_left_pedal_smoothness", 93, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type6));
        bxbVar.e(new w97("avg_right_pedal_smoothness", 94, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type6));
        bxbVar.e(new w97("avg_combined_pedal_smoothness", 95, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type6));
        bxbVar.e(new w97("time_standing", 98, 134, 1000.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("stand_count", 99, 132, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("avg_left_pco", 100, 1, 1.0d, 0.0d, "mm", false, profile$Type8));
        bxbVar.e(new w97("avg_right_pco", 101, 1, 1.0d, 0.0d, "mm", false, profile$Type8));
        bxbVar.e(new w97("avg_left_power_phase", 102, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type6));
        bxbVar.e(new w97("avg_left_power_phase_peak", 103, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type6));
        bxbVar.e(new w97("avg_right_power_phase", 104, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type6));
        bxbVar.e(new w97("avg_right_power_phase_peak", 105, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type6));
        bxbVar.e(new w97("avg_power_position", 106, 132, 1.0d, 0.0d, "watts", false, profile$Type5));
        bxbVar.e(new w97("max_power_position", 107, 132, 1.0d, 0.0d, "watts", false, profile$Type5));
        bxbVar.e(new w97("avg_cadence_position", 108, 2, 1.0d, 0.0d, "rpm", false, profile$Type6));
        bxbVar.e(new w97("max_cadence_position", 109, 2, 1.0d, 0.0d, "rpm", false, profile$Type6));
        bxbVar.e(new w97("enhanced_avg_speed", 110, 134, 1000.0d, 0.0d, "m/s", false, profile$Type4));
        bxbVar.e(new w97("enhanced_max_speed", 111, 134, 1000.0d, 0.0d, "m/s", false, profile$Type4));
        bxbVar.e(new w97("enhanced_avg_altitude", 112, 134, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("enhanced_min_altitude", 113, 134, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("enhanced_max_altitude", 114, 134, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("avg_lev_motor_power", 115, 132, 1.0d, 0.0d, "watts", false, profile$Type5));
        bxbVar.e(new w97("max_lev_motor_power", 116, 132, 1.0d, 0.0d, "watts", false, profile$Type5));
        bxbVar.e(new w97("lev_battery_consumption", 117, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type6));
        bxbVar.e(new w97("avg_vertical_ratio", 118, 132, 100.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type5));
        bxbVar.e(new w97("avg_stance_time_balance", 119, 132, 100.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type5));
        bxbVar.e(new w97("avg_step_length", 120, 132, 10.0d, 0.0d, "mm", false, profile$Type5));
        bxbVar.e(new w97("avg_vam", 121, 132, 1000.0d, 0.0d, "m/s", false, profile$Type5));
        bxbVar.e(new w97("avg_depth", 122, 134, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("max_depth", 123, 134, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("min_temperature", 124, 1, 1.0d, 0.0d, "C", false, profile$Type8));
        bxbVar.e(new w97("enhanced_avg_respiration_rate", 136, 132, 100.0d, 0.0d, "Breaths/min", false, profile$Type5));
        bxbVar.e(new w97("enhanced_max_respiration_rate", 137, 132, 100.0d, 0.0d, "Breaths/min", false, profile$Type5));
        bxbVar.e(new w97("avg_respiration_rate", 147, 2, 1.0d, 0.0d, "", false, profile$Type6));
        bxbVar.d.get(111).f18167j.add(new da7(136, false, 8, 1.0d, 0.0d));
        bxbVar.e(new w97("max_respiration_rate", 148, 2, 1.0d, 0.0d, "", false, profile$Type6));
        bxbVar.d.get(112).f18167j.add(new da7(137, false, 8, 1.0d, 0.0d));
        Profile$Type profile$Type9 = Profile$Type.FLOAT32;
        bxbVar.e(new w97("total_grit", 149, 136, 1.0d, 0.0d, "kGrit", false, profile$Type9));
        bxbVar.e(new w97("total_flow", 150, 136, 1.0d, 0.0d, "Flow", false, profile$Type9));
        bxbVar.e(new w97("jump_count", 151, 132, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("avg_grit", 153, 136, 1.0d, 0.0d, "kGrit", false, profile$Type9));
        bxbVar.e(new w97("avg_flow", 154, 136, 1.0d, 0.0d, "Flow", false, profile$Type9));
        bxbVar.e(new w97("total_fractional_ascent", 156, 2, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type6));
        bxbVar.e(new w97("total_fractional_descent", TotalFractionalDescentFieldNum, 2, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type6));
        bxbVar.e(new w97("avg_core_temperature", 158, 132, 100.0d, 0.0d, "C", false, profile$Type5));
        bxbVar.e(new w97("min_core_temperature", 159, 132, 100.0d, 0.0d, "C", false, profile$Type5));
        bxbVar.e(new w97("max_core_temperature", 160, 132, 100.0d, 0.0d, "C", false, profile$Type5));
    }

    public e() {
        super(w07.b(19));
    }

    public Float A() {
        return k(13, 0, 65535);
    }

    public Short B() {
        return n(16, 0, 65535);
    }

    public Float C() {
        return k(14, 0, 65535);
    }

    public Integer D() {
        return l(21, 0, 65535);
    }

    public Integer E() {
        return l(11, 0, 65535);
    }

    public Float F() {
        return k(9, 0, 65535);
    }

    public Float G() {
        return k(8, 0, 65535);
    }

    public void H(Short sh) {
        v(15, 0, sh, 65535);
    }

    public void I(Float f) {
        v(13, 0, f, 65535);
    }

    public void J(Short sh) {
        v(16, 0, sh, 65535);
    }

    public void K(Float f) {
        v(14, 0, f, 65535);
    }

    public void L(Integer num) {
        v(21, 0, num, 65535);
    }

    public void M(Integer num) {
        v(11, 0, num, 65535);
    }

    public void N(Float f) {
        v(9, 0, f, 65535);
    }

    public void O(Float f) {
        v(8, 0, f, 65535);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public Short a() {
        return n(26, 0, 65535);
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

    public Short z() {
        return n(15, 0, 65535);
    }

    public e(bxb bxbVar) {
        super(bxbVar);
    }
}
