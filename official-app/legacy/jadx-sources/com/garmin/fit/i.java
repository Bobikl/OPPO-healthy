package com.garmin.fit;

import com.heytap.databaseengine.apiv3.data.Element;
import com.heytap.databaseengineservice.db.table.phycialmental.DBPhysicalMentalStat;
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
public class i extends bxb implements jxb {
    public static final int AvgAltitudeFieldNum = 49;
    public static final int AvgBallSpeedFieldNum = 88;
    public static final int AvgCadenceFieldNum = 18;
    public static final int AvgCadencePositionFieldNum = 122;
    public static final int AvgCombinedPedalSmoothnessFieldNum = 105;
    public static final int AvgCoreTemperatureFieldNum = 208;
    public static final int AvgDepthFieldNum = 140;
    public static final int AvgFlowFieldNum = 187;
    public static final int AvgFractionalCadenceFieldNum = 92;
    public static final int AvgGradeFieldNum = 52;
    public static final int AvgGritFieldNum = 186;
    public static final int AvgHeartRateFieldNum = 16;
    public static final int AvgLapTimeFieldNum = 69;
    public static final int AvgLeftPcoFieldNum = 114;
    public static final int AvgLeftPedalSmoothnessFieldNum = 103;
    public static final int AvgLeftPowerPhaseFieldNum = 116;
    public static final int AvgLeftPowerPhasePeakFieldNum = 117;
    public static final int AvgLeftTorqueEffectivenessFieldNum = 101;
    public static final int AvgLevMotorPowerFieldNum = 129;
    public static final int AvgNegGradeFieldNum = 54;
    public static final int AvgNegVerticalSpeedFieldNum = 61;
    public static final int AvgPosGradeFieldNum = 53;
    public static final int AvgPosVerticalSpeedFieldNum = 60;
    public static final int AvgPowerFieldNum = 20;
    public static final int AvgPowerPositionFieldNum = 120;
    public static final int AvgRespirationRateFieldNum = 147;
    public static final int AvgRightPcoFieldNum = 115;
    public static final int AvgRightPedalSmoothnessFieldNum = 104;
    public static final int AvgRightPowerPhaseFieldNum = 118;
    public static final int AvgRightPowerPhasePeakFieldNum = 119;
    public static final int AvgRightTorqueEffectivenessFieldNum = 102;
    public static final int AvgSaturatedHemoglobinPercentFieldNum = 98;
    public static final int AvgSpeedFieldNum = 14;
    public static final int AvgSpo2FieldNum = 194;
    public static final int AvgStanceTimeBalanceFieldNum = 133;
    public static final int AvgStanceTimeFieldNum = 91;
    public static final int AvgStanceTimePercentFieldNum = 90;
    public static final int AvgStepLengthFieldNum = 134;
    public static final int AvgStressFieldNum = 195;
    public static final int AvgStrokeCountFieldNum = 41;
    public static final int AvgStrokeDistanceFieldNum = 42;
    public static final int AvgTemperatureFieldNum = 57;
    public static final int AvgTotalHemoglobinConcFieldNum = 95;
    public static final int AvgVamFieldNum = 139;
    public static final int AvgVerticalOscillationFieldNum = 89;
    public static final int AvgVerticalRatioFieldNum = 132;
    public static final int BestLapIndexFieldNum = 70;
    public static final int DiveNumberFieldNum = 156;
    public static final int EndCnsFieldNum = 144;
    public static final int EndN2FieldNum = 146;
    public static final int EndPositionLatFieldNum = 38;
    public static final int EndPositionLongFieldNum = 39;
    public static final int EnhancedAvgAltitudeFieldNum = 126;
    public static final int EnhancedAvgRespirationRateFieldNum = 169;
    public static final int EnhancedAvgSpeedFieldNum = 124;
    public static final int EnhancedMaxAltitudeFieldNum = 128;
    public static final int EnhancedMaxRespirationRateFieldNum = 170;
    public static final int EnhancedMaxSpeedFieldNum = 125;
    public static final int EnhancedMinAltitudeFieldNum = 127;
    public static final int EnhancedMinRespirationRateFieldNum = 180;
    public static final int EventFieldNum = 0;
    public static final int EventGroupFieldNum = 27;
    public static final int EventTypeFieldNum = 1;
    public static final int FirstLapIndexFieldNum = 25;
    public static final int GpsAccuracyFieldNum = 51;
    public static final int IntensityFactorFieldNum = 36;
    public static final int JumpCountFieldNum = 183;
    public static final int LeftRightBalanceFieldNum = 37;
    public static final int LevBatteryConsumptionFieldNum = 131;
    public static final int MaxAltitudeFieldNum = 50;
    public static final int MaxBallSpeedFieldNum = 87;
    public static final int MaxCadenceFieldNum = 19;
    public static final int MaxCadencePositionFieldNum = 123;
    public static final int MaxCoreTemperatureFieldNum = 210;
    public static final int MaxDepthFieldNum = 141;
    public static final int MaxFractionalCadenceFieldNum = 93;
    public static final int MaxHeartRateFieldNum = 17;
    public static final int MaxLevMotorPowerFieldNum = 130;
    public static final int MaxNegGradeFieldNum = 56;
    public static final int MaxNegVerticalSpeedFieldNum = 63;
    public static final int MaxPosGradeFieldNum = 55;
    public static final int MaxPosVerticalSpeedFieldNum = 62;
    public static final int MaxPowerFieldNum = 21;
    public static final int MaxPowerPositionFieldNum = 121;
    public static final int MaxRespirationRateFieldNum = 148;
    public static final int MaxSaturatedHemoglobinPercentFieldNum = 100;
    public static final int MaxSpeedFieldNum = 15;
    public static final int MaxTemperatureFieldNum = 58;
    public static final int MaxTotalHemoglobinConcFieldNum = 97;
    public static final int MessageIndexFieldNum = 254;
    public static final int MinAltitudeFieldNum = 71;
    public static final int MinCoreTemperatureFieldNum = 209;
    public static final int MinHeartRateFieldNum = 64;
    public static final int MinRespirationRateFieldNum = 149;
    public static final int MinSaturatedHemoglobinPercentFieldNum = 99;
    public static final int MinTemperatureFieldNum = 150;
    public static final int MinTotalHemoglobinConcFieldNum = 96;
    public static final int NecLatFieldNum = 29;
    public static final int NecLongFieldNum = 30;
    public static final int NormalizedPowerFieldNum = 34;
    public static final int NumActiveLengthsFieldNum = 47;
    public static final int NumLapsFieldNum = 26;
    public static final int NumLengthsFieldNum = 33;
    public static final int O2ToxicityFieldNum = 155;
    public static final int OpponentNameFieldNum = 84;
    public static final int OpponentScoreFieldNum = 83;
    public static final int PlayerScoreFieldNum = 82;
    public static final int PoolLengthFieldNum = 44;
    public static final int PoolLengthUnitFieldNum = 46;
    public static final int RmssdHrvFieldNum = 198;
    public static final int SdrrHrvFieldNum = 197;
    public static final int SportFieldNum = 5;
    public static final int SportIndexFieldNum = 111;
    public static final int SportProfileNameFieldNum = 110;
    public static final int StandCountFieldNum = 113;
    public static final int StartCnsFieldNum = 143;
    public static final int StartN2FieldNum = 145;
    public static final int StartPositionLatFieldNum = 3;
    public static final int StartPositionLongFieldNum = 4;
    public static final int StartTimeFieldNum = 2;
    public static final int StrokeCountFieldNum = 85;
    public static final int SubSportFieldNum = 6;
    public static final int SurfaceIntervalFieldNum = 142;
    public static final int SwcLatFieldNum = 31;
    public static final int SwcLongFieldNum = 32;
    public static final int SwimStrokeFieldNum = 43;
    public static final int ThresholdPowerFieldNum = 45;
    public static final int TimeInCadenceZoneFieldNum = 67;
    public static final int TimeInHrZoneFieldNum = 65;
    public static final int TimeInPowerZoneFieldNum = 68;
    public static final int TimeInSpeedZoneFieldNum = 66;
    public static final int TimeStandingFieldNum = 112;
    public static final int TimestampFieldNum = 253;
    public static final int TotalAnaerobicTrainingEffectFieldNum = 137;
    public static final int TotalAscentFieldNum = 22;
    public static final int TotalCaloriesFieldNum = 11;
    public static final int TotalCyclesFieldNum = 10;
    public static final int TotalDescentFieldNum = 23;
    public static final int TotalDistanceFieldNum = 9;
    public static final int TotalElapsedTimeFieldNum = 7;
    public static final int TotalFatCaloriesFieldNum = 13;
    public static final int TotalFlowFieldNum = 182;
    public static final int TotalFractionalAscentFieldNum = 199;
    public static final int TotalFractionalCyclesFieldNum = 94;
    public static final int TotalFractionalDescentFieldNum = 200;
    public static final int TotalGritFieldNum = 181;
    public static final int TotalMovingTimeFieldNum = 59;
    public static final int TotalTimerTimeFieldNum = 8;
    public static final int TotalTrainingEffectFieldNum = 24;
    public static final int TotalWorkFieldNum = 48;
    public static final int TrainingLoadPeakFieldNum = 168;
    public static final int TrainingStressScoreFieldNum = 35;
    public static final int TriggerFieldNum = 28;
    public static final int WorkoutFeelFieldNum = 192;
    public static final int WorkoutRpeFieldNum = 193;
    public static final int ZoneCountFieldNum = 86;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("session", 18);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        Profile$Type profile$Type = Profile$Type.DATE_TIME;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("event", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.EVENT));
        bxbVar.e(new w97("event_type", 1, 0, 1.0d, 0.0d, "", false, Profile$Type.EVENT_TYPE));
        bxbVar.e(new w97("start_time", 2, 134, 1.0d, 0.0d, "", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.SINT32;
        bxbVar.e(new w97("start_position_lat", 3, 133, 1.0d, 0.0d, "semicircles", false, profile$Type2));
        bxbVar.e(new w97("start_position_long", 4, 133, 1.0d, 0.0d, "semicircles", false, profile$Type2));
        bxbVar.e(new w97("sport", 5, 0, 1.0d, 0.0d, "", false, Profile$Type.SPORT));
        bxbVar.e(new w97("sub_sport", 6, 0, 1.0d, 0.0d, "", false, Profile$Type.SUB_SPORT));
        Profile$Type profile$Type3 = Profile$Type.UINT32;
        bxbVar.e(new w97("total_elapsed_time", 7, 134, 1000.0d, 0.0d, "s", false, profile$Type3));
        bxbVar.e(new w97("total_timer_time", 8, 134, 1000.0d, 0.0d, "s", false, profile$Type3));
        bxbVar.e(new w97("total_distance", 9, 134, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type3));
        bxbVar.e(new w97("total_cycles", 10, 134, 1.0d, 0.0d, "cycles", false, profile$Type3));
        bxbVar.d.get(12).k.add(new p2j("total_strides", 134, 1.0d, 0.0d, "strides"));
        bxbVar.d.get(12).k.get(0).b(5, 1L);
        bxbVar.d.get(12).k.get(0).b(5, 11L);
        bxbVar.d.get(12).k.add(new p2j("total_strokes", 134, 1.0d, 0.0d, "strokes"));
        bxbVar.d.get(12).k.get(1).b(5, 2L);
        bxbVar.d.get(12).k.get(1).b(5, 5L);
        bxbVar.d.get(12).k.get(1).b(5, 15L);
        bxbVar.d.get(12).k.get(1).b(5, 37L);
        Profile$Type profile$Type4 = Profile$Type.UINT16;
        bxbVar.e(new w97("total_calories", 11, 132, 1.0d, 0.0d, "kcal", false, profile$Type4));
        bxbVar.e(new w97("total_fat_calories", 13, 132, 1.0d, 0.0d, "kcal", false, profile$Type4));
        bxbVar.e(new w97(SportSummaryBean.AVG_SPEED, 14, 132, 1000.0d, 0.0d, "m/s", false, profile$Type4));
        bxbVar.d.get(15).f18167j.add(new da7(124, false, 16, 1000.0d, 0.0d));
        bxbVar.e(new w97(SportSummaryBean.MAX_SPEED, 15, 132, 1000.0d, 0.0d, "m/s", false, profile$Type4));
        bxbVar.d.get(16).f18167j.add(new da7(125, false, 16, 1000.0d, 0.0d));
        Profile$Type profile$Type5 = Profile$Type.UINT8;
        bxbVar.e(new w97(Element.ELEMENT_NAME_AVG_HEART_RATE, 16, 2, 1.0d, 0.0d, "bpm", false, profile$Type5));
        bxbVar.e(new w97(Element.ELEMENT_NAME_MAX_HEART_RATE, 17, 2, 1.0d, 0.0d, "bpm", false, profile$Type5));
        bxbVar.e(new w97("avg_cadence", 18, 2, 1.0d, 0.0d, "rpm", false, profile$Type5));
        bxbVar.d.get(19).k.add(new p2j("avg_running_cadence", 2, 1.0d, 0.0d, "strides/min"));
        bxbVar.d.get(19).k.get(0).b(5, 1L);
        bxbVar.e(new w97("max_cadence", 19, 2, 1.0d, 0.0d, "rpm", false, profile$Type5));
        bxbVar.d.get(20).k.add(new p2j("max_running_cadence", 2, 1.0d, 0.0d, "strides/min"));
        bxbVar.d.get(20).k.get(0).b(5, 1L);
        bxbVar.e(new w97("avg_power", 20, 132, 1.0d, 0.0d, "watts", false, profile$Type4));
        bxbVar.e(new w97("max_power", 21, 132, 1.0d, 0.0d, "watts", false, profile$Type4));
        bxbVar.e(new w97("total_ascent", 22, 132, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("total_descent", 23, 132, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("total_training_effect", 24, 2, 10.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("first_lap_index", 25, 132, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("num_laps", 26, 132, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("event_group", 27, 2, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("trigger", 28, 0, 1.0d, 0.0d, "", false, Profile$Type.SESSION_TRIGGER));
        bxbVar.e(new w97("nec_lat", 29, 133, 1.0d, 0.0d, "semicircles", false, profile$Type2));
        bxbVar.e(new w97("nec_long", 30, 133, 1.0d, 0.0d, "semicircles", false, profile$Type2));
        bxbVar.e(new w97("swc_lat", 31, 133, 1.0d, 0.0d, "semicircles", false, profile$Type2));
        bxbVar.e(new w97("swc_long", 32, 133, 1.0d, 0.0d, "semicircles", false, profile$Type2));
        bxbVar.e(new w97("num_lengths", 33, 132, 1.0d, 0.0d, "lengths", false, profile$Type4));
        bxbVar.e(new w97("normalized_power", 34, 132, 1.0d, 0.0d, "watts", false, profile$Type4));
        bxbVar.e(new w97("training_stress_score", 35, 132, 10.0d, 0.0d, "tss", false, profile$Type4));
        bxbVar.e(new w97("intensity_factor", 36, 132, 1000.0d, 0.0d, "if", false, profile$Type4));
        bxbVar.e(new w97("left_right_balance", 37, 132, 1.0d, 0.0d, "", false, Profile$Type.LEFT_RIGHT_BALANCE_100));
        bxbVar.e(new w97("end_position_lat", 38, 133, 1.0d, 0.0d, "semicircles", false, profile$Type2));
        bxbVar.e(new w97("end_position_long", 39, 133, 1.0d, 0.0d, "semicircles", false, profile$Type2));
        bxbVar.e(new w97("avg_stroke_count", 41, 134, 10.0d, 0.0d, "strokes/lap", false, profile$Type3));
        bxbVar.e(new w97("avg_stroke_distance", 42, 132, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("swim_stroke", 43, 0, 1.0d, 0.0d, "swim_stroke", false, Profile$Type.SWIM_STROKE));
        bxbVar.e(new w97("pool_length", 44, 132, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("threshold_power", 45, 132, 1.0d, 0.0d, "watts", false, profile$Type4));
        bxbVar.e(new w97("pool_length_unit", 46, 0, 1.0d, 0.0d, "", false, Profile$Type.DISPLAY_MEASURE));
        bxbVar.e(new w97("num_active_lengths", 47, 132, 1.0d, 0.0d, "lengths", false, profile$Type4));
        bxbVar.e(new w97("total_work", 48, 134, 1.0d, 0.0d, "J", false, profile$Type3));
        bxbVar.e(new w97("avg_altitude", 49, 132, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.d.get(49).f18167j.add(new da7(126, false, 16, 5.0d, 500.0d));
        bxbVar.e(new w97("max_altitude", 50, 132, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.d.get(50).f18167j.add(new da7(128, false, 16, 5.0d, 500.0d));
        bxbVar.e(new w97("gps_accuracy", 51, 2, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        Profile$Type profile$Type6 = Profile$Type.SINT16;
        bxbVar.e(new w97("avg_grade", 52, 131, 100.0d, 0.0d, "%", false, profile$Type6));
        bxbVar.e(new w97("avg_pos_grade", 53, 131, 100.0d, 0.0d, "%", false, profile$Type6));
        bxbVar.e(new w97("avg_neg_grade", 54, 131, 100.0d, 0.0d, "%", false, profile$Type6));
        bxbVar.e(new w97("max_pos_grade", 55, 131, 100.0d, 0.0d, "%", false, profile$Type6));
        bxbVar.e(new w97("max_neg_grade", 56, 131, 100.0d, 0.0d, "%", false, profile$Type6));
        Profile$Type profile$Type7 = Profile$Type.SINT8;
        bxbVar.e(new w97("avg_temperature", 57, 1, 1.0d, 0.0d, "C", false, profile$Type7));
        bxbVar.e(new w97("max_temperature", 58, 1, 1.0d, 0.0d, "C", false, profile$Type7));
        bxbVar.e(new w97("total_moving_time", 59, 134, 1000.0d, 0.0d, "s", false, profile$Type3));
        bxbVar.e(new w97("avg_pos_vertical_speed", 60, 131, 1000.0d, 0.0d, "m/s", false, profile$Type6));
        bxbVar.e(new w97("avg_neg_vertical_speed", 61, 131, 1000.0d, 0.0d, "m/s", false, profile$Type6));
        bxbVar.e(new w97("max_pos_vertical_speed", 62, 131, 1000.0d, 0.0d, "m/s", false, profile$Type6));
        bxbVar.e(new w97("max_neg_vertical_speed", 63, 131, 1000.0d, 0.0d, "m/s", false, profile$Type6));
        bxbVar.e(new w97("min_heart_rate", 64, 2, 1.0d, 0.0d, "bpm", false, profile$Type5));
        bxbVar.e(new w97("time_in_hr_zone", 65, 134, 1000.0d, 0.0d, "s", false, profile$Type3));
        bxbVar.e(new w97("time_in_speed_zone", 66, 134, 1000.0d, 0.0d, "s", false, profile$Type3));
        bxbVar.e(new w97("time_in_cadence_zone", 67, 134, 1000.0d, 0.0d, "s", false, profile$Type3));
        bxbVar.e(new w97("time_in_power_zone", 68, 134, 1000.0d, 0.0d, "s", false, profile$Type3));
        bxbVar.e(new w97("avg_lap_time", 69, 134, 1000.0d, 0.0d, "s", false, profile$Type3));
        bxbVar.e(new w97("best_lap_index", 70, 132, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("min_altitude", 71, 132, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.d.get(71).f18167j.add(new da7(127, false, 16, 5.0d, 500.0d));
        bxbVar.e(new w97("player_score", 82, 132, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("opponent_score", 83, 132, 1.0d, 0.0d, "", false, profile$Type4));
        Profile$Type profile$Type8 = Profile$Type.STRING;
        bxbVar.e(new w97("opponent_name", 84, 7, 1.0d, 0.0d, "", false, profile$Type8));
        bxbVar.e(new w97("stroke_count", 85, 132, 1.0d, 0.0d, "counts", false, profile$Type4));
        bxbVar.e(new w97("zone_count", 86, 132, 1.0d, 0.0d, "counts", false, profile$Type4));
        bxbVar.e(new w97("max_ball_speed", 87, 132, 100.0d, 0.0d, "m/s", false, profile$Type4));
        bxbVar.e(new w97("avg_ball_speed", 88, 132, 100.0d, 0.0d, "m/s", false, profile$Type4));
        bxbVar.e(new w97("avg_vertical_oscillation", 89, 132, 10.0d, 0.0d, "mm", false, profile$Type4));
        bxbVar.e(new w97("avg_stance_time_percent", 90, 132, 100.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type4));
        bxbVar.e(new w97("avg_stance_time", 91, 132, 10.0d, 0.0d, "ms", false, profile$Type4));
        bxbVar.e(new w97("avg_fractional_cadence", 92, 2, 128.0d, 0.0d, "rpm", false, profile$Type5));
        bxbVar.e(new w97("max_fractional_cadence", 93, 2, 128.0d, 0.0d, "rpm", false, profile$Type5));
        bxbVar.e(new w97("total_fractional_cycles", 94, 2, 128.0d, 0.0d, "cycles", false, profile$Type5));
        bxbVar.e(new w97("avg_total_hemoglobin_conc", 95, 132, 100.0d, 0.0d, "g/dL", false, profile$Type4));
        bxbVar.e(new w97("min_total_hemoglobin_conc", 96, 132, 100.0d, 0.0d, "g/dL", false, profile$Type4));
        bxbVar.e(new w97("max_total_hemoglobin_conc", 97, 132, 100.0d, 0.0d, "g/dL", false, profile$Type4));
        bxbVar.e(new w97("avg_saturated_hemoglobin_percent", 98, 132, 10.0d, 0.0d, "%", false, profile$Type4));
        bxbVar.e(new w97("min_saturated_hemoglobin_percent", 99, 132, 10.0d, 0.0d, "%", false, profile$Type4));
        bxbVar.e(new w97("max_saturated_hemoglobin_percent", 100, 132, 10.0d, 0.0d, "%", false, profile$Type4));
        bxbVar.e(new w97("avg_left_torque_effectiveness", 101, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type5));
        bxbVar.e(new w97("avg_right_torque_effectiveness", 102, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type5));
        bxbVar.e(new w97("avg_left_pedal_smoothness", 103, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type5));
        bxbVar.e(new w97("avg_right_pedal_smoothness", 104, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type5));
        bxbVar.e(new w97("avg_combined_pedal_smoothness", 105, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type5));
        bxbVar.e(new w97("sport_profile_name", 110, 7, 1.0d, 0.0d, "", false, profile$Type8));
        bxbVar.e(new w97("sport_index", 111, 2, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("time_standing", 112, 134, 1000.0d, 0.0d, "s", false, profile$Type3));
        bxbVar.e(new w97("stand_count", 113, 132, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("avg_left_pco", 114, 1, 1.0d, 0.0d, "mm", false, profile$Type7));
        bxbVar.e(new w97("avg_right_pco", 115, 1, 1.0d, 0.0d, "mm", false, profile$Type7));
        bxbVar.e(new w97("avg_left_power_phase", 116, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type5));
        bxbVar.e(new w97("avg_left_power_phase_peak", 117, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type5));
        bxbVar.e(new w97("avg_right_power_phase", 118, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type5));
        bxbVar.e(new w97("avg_right_power_phase_peak", 119, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type5));
        bxbVar.e(new w97("avg_power_position", 120, 132, 1.0d, 0.0d, "watts", false, profile$Type4));
        bxbVar.e(new w97("max_power_position", 121, 132, 1.0d, 0.0d, "watts", false, profile$Type4));
        bxbVar.e(new w97("avg_cadence_position", 122, 2, 1.0d, 0.0d, "rpm", false, profile$Type5));
        bxbVar.e(new w97("max_cadence_position", 123, 2, 1.0d, 0.0d, "rpm", false, profile$Type5));
        bxbVar.e(new w97("enhanced_avg_speed", 124, 134, 1000.0d, 0.0d, "m/s", false, profile$Type3));
        bxbVar.e(new w97("enhanced_max_speed", 125, 134, 1000.0d, 0.0d, "m/s", false, profile$Type3));
        bxbVar.e(new w97("enhanced_avg_altitude", 126, 134, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type3));
        bxbVar.e(new w97("enhanced_min_altitude", 127, 134, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type3));
        bxbVar.e(new w97("enhanced_max_altitude", 128, 134, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type3));
        bxbVar.e(new w97("avg_lev_motor_power", 129, 132, 1.0d, 0.0d, "watts", false, profile$Type4));
        bxbVar.e(new w97("max_lev_motor_power", 130, 132, 1.0d, 0.0d, "watts", false, profile$Type4));
        bxbVar.e(new w97("lev_battery_consumption", 131, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type5));
        bxbVar.e(new w97("avg_vertical_ratio", 132, 132, 100.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type4));
        bxbVar.e(new w97("avg_stance_time_balance", 133, 132, 100.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type4));
        bxbVar.e(new w97("avg_step_length", 134, 132, 10.0d, 0.0d, "mm", false, profile$Type4));
        bxbVar.e(new w97("total_anaerobic_training_effect", 137, 2, 10.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("avg_vam", 139, 132, 1000.0d, 0.0d, "m/s", false, profile$Type4));
        bxbVar.e(new w97("avg_depth", 140, 134, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type3));
        bxbVar.e(new w97("max_depth", 141, 134, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type3));
        bxbVar.e(new w97("surface_interval", 142, 134, 1.0d, 0.0d, "s", false, profile$Type3));
        bxbVar.e(new w97("start_cns", 143, 2, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type5));
        bxbVar.e(new w97("end_cns", 144, 2, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type5));
        bxbVar.e(new w97("start_n2", 145, 132, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type4));
        bxbVar.e(new w97("end_n2", 146, 132, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type4));
        bxbVar.e(new w97("avg_respiration_rate", 147, 2, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.d.get(130).f18167j.add(new da7(169, false, 8, 1.0d, 0.0d));
        bxbVar.e(new w97("max_respiration_rate", 148, 2, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.d.get(131).f18167j.add(new da7(170, false, 8, 1.0d, 0.0d));
        bxbVar.e(new w97("min_respiration_rate", 149, 2, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.d.get(132).f18167j.add(new da7(180, false, 8, 1.0d, 0.0d));
        bxbVar.e(new w97("min_temperature", 150, 1, 1.0d, 0.0d, "C", false, profile$Type7));
        bxbVar.e(new w97("o2_toxicity", O2ToxicityFieldNum, 132, 1.0d, 0.0d, "OTUs", false, profile$Type4));
        bxbVar.e(new w97("dive_number", 156, 134, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("training_load_peak", 168, 133, 65536.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("enhanced_avg_respiration_rate", 169, 132, 100.0d, 0.0d, "Breaths/min", false, profile$Type4));
        bxbVar.e(new w97("enhanced_max_respiration_rate", 170, 132, 100.0d, 0.0d, "Breaths/min", false, profile$Type4));
        bxbVar.e(new w97("enhanced_min_respiration_rate", 180, 132, 100.0d, 0.0d, "", false, profile$Type4));
        Profile$Type profile$Type9 = Profile$Type.FLOAT32;
        bxbVar.e(new w97("total_grit", 181, 136, 1.0d, 0.0d, "kGrit", false, profile$Type9));
        bxbVar.e(new w97("total_flow", 182, 136, 1.0d, 0.0d, "Flow", false, profile$Type9));
        bxbVar.e(new w97("jump_count", 183, 132, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("avg_grit", 186, 136, 1.0d, 0.0d, "kGrit", false, profile$Type9));
        bxbVar.e(new w97("avg_flow", 187, 136, 1.0d, 0.0d, "Flow", false, profile$Type9));
        bxbVar.e(new w97("workout_feel", 192, 2, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("workout_rpe", 193, 2, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("avg_spo2", 194, 2, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type5));
        bxbVar.e(new w97(DBPhysicalMentalStat.AVG_STRESS, 195, 2, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type5));
        bxbVar.e(new w97("sdrr_hrv", 197, 2, 1.0d, 0.0d, "mS", false, profile$Type5));
        bxbVar.e(new w97("rmssd_hrv", 198, 2, 1.0d, 0.0d, "mS", false, profile$Type5));
        bxbVar.e(new w97("total_fractional_ascent", 199, 2, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        bxbVar.e(new w97("total_fractional_descent", 200, 2, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        bxbVar.e(new w97("avg_core_temperature", 208, 132, 100.0d, 0.0d, "C", false, profile$Type4));
        bxbVar.e(new w97("min_core_temperature", 209, 132, 100.0d, 0.0d, "C", false, profile$Type4));
        bxbVar.e(new w97("max_core_temperature", 210, 132, 100.0d, 0.0d, "C", false, profile$Type4));
    }

    public i() {
        super(w07.b(18));
    }

    public Short A() {
        return n(16, 0, 65535);
    }

    public Float B() {
        return k(14, 0, 65535);
    }

    public Short C() {
        return n(17, 0, 65535);
    }

    public Float D() {
        return k(15, 0, 65535);
    }

    public Sport E() {
        Short shN = n(5, 0, 65535);
        if (shN == null) {
            return null;
        }
        return Sport.getByValue(shN);
    }

    public SubSport F() {
        Short shN = n(6, 0, 65535);
        if (shN == null) {
            return null;
        }
        return SubSport.getByValue(shN);
    }

    public Integer G() {
        return l(22, 0, 65535);
    }

    public Integer H() {
        return l(11, 0, 65535);
    }

    public Long I() {
        return m(10, 0, 65535);
    }

    public Integer J() {
        return l(23, 0, 65535);
    }

    public Float K() {
        return k(9, 0, 65535);
    }

    public Float L() {
        return k(59, 0, 65535);
    }

    public Float M() {
        return k(8, 0, 65535);
    }

    public void N(Short sh) {
        v(18, 0, sh, 65535);
    }

    public void O(Short sh) {
        v(16, 0, sh, 65535);
    }

    public void P(Float f) {
        v(14, 0, f, 65535);
    }

    public void Q(Short sh) {
        v(17, 0, sh, 65535);
    }

    public void R(Float f) {
        v(15, 0, f, 65535);
    }

    public void S(Sport sport) {
        v(5, 0, Short.valueOf(sport.value), 65535);
    }

    public void T(s05 s05Var) {
        v(2, 0, s05Var.l(), 65535);
    }

    public void U(SubSport subSport) {
        v(6, 0, Short.valueOf(subSport.value), 65535);
    }

    public void V(Integer num) {
        v(22, 0, num, 65535);
    }

    public void W(Integer num) {
        v(11, 0, num, 65535);
    }

    public void X(Long l2) {
        v(10, 0, l2, 65535);
    }

    public void Y(Integer num) {
        v(23, 0, num, 65535);
    }

    public void Z(Float f) {
        v(9, 0, f, 65535);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public Short a() {
        return n(27, 0, 65535);
    }

    public void a0(Float f) {
        v(59, 0, f, 65535);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public void b(s05 s05Var) {
        v(253, 0, s05Var.l(), 65535);
    }

    public void b0(Float f) {
        v(8, 0, f, 65535);
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
        return n(18, 0, 65535);
    }

    public i(bxb bxbVar) {
        super(bxbVar);
    }
}
