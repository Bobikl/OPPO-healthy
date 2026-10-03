package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.record.details.bean.SportSummaryBean;
import com.oplus.deepthinker.sdk.app.awareness.capability.impl.ActivityRecognizeEvent;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes13.dex */
public class qhf extends bxb {
    public static final int AbsolutePressureFieldNum = 91;
    public static final int AccumulatedPowerFieldNum = 29;
    public static final int ActivityTypeFieldNum = 42;
    public static final int AirTimeRemainingFieldNum = 123;
    public static final int AltitudeFieldNum = 2;
    public static final int AscentRateFieldNum = 127;
    public static final int BallSpeedFieldNum = 51;
    public static final int BatterySocFieldNum = 81;
    public static final int Cadence256FieldNum = 52;
    public static final int CadenceFieldNum = 4;
    public static final int CaloriesFieldNum = 33;
    public static final int CnsLoadFieldNum = 97;
    public static final int CombinedPedalSmoothnessFieldNum = 47;
    public static final int CompressedAccumulatedPowerFieldNum = 28;
    public static final int CompressedSpeedDistanceFieldNum = 8;
    public static final int CoreTemperatureFieldNum = 139;
    public static final int CurrentStressFieldNum = 116;
    public static final int CycleLength16FieldNum = 87;
    public static final int CycleLengthFieldNum = 12;
    public static final int CyclesFieldNum = 18;
    public static final int DepthFieldNum = 92;
    public static final int DeviceIndexFieldNum = 62;
    public static final int DistanceFieldNum = 5;
    public static final int EbikeAssistLevelPercentFieldNum = 120;
    public static final int EbikeAssistModeFieldNum = 119;
    public static final int EbikeBatteryLevelFieldNum = 118;
    public static final int EbikeTravelRangeFieldNum = 117;
    public static final int EnhancedAltitudeFieldNum = 78;
    public static final int EnhancedRespirationRateFieldNum = 108;
    public static final int EnhancedSpeedFieldNum = 73;
    public static final int FlowFieldNum = 115;
    public static final int FractionalCadenceFieldNum = 53;
    public static final int GpsAccuracyFieldNum = 31;
    public static final int GradeFieldNum = 9;
    public static final int GritFieldNum = 114;
    public static final int HeartRateFieldNum = 3;
    public static final int LeftPcoFieldNum = 67;
    public static final int LeftPedalSmoothnessFieldNum = 45;
    public static final int LeftPowerPhaseFieldNum = 69;
    public static final int LeftPowerPhasePeakFieldNum = 70;
    public static final int LeftRightBalanceFieldNum = 30;
    public static final int LeftTorqueEffectivenessFieldNum = 43;
    public static final int MotorPowerFieldNum = 82;
    public static final int N2LoadFieldNum = 98;
    public static final int NdlTimeFieldNum = 96;
    public static final int NextStopDepthFieldNum = 93;
    public static final int NextStopTimeFieldNum = 94;
    public static final int Po2FieldNum = 129;
    public static final int PositionLatFieldNum = 0;
    public static final int PositionLongFieldNum = 1;
    public static final int PowerFieldNum = 7;
    public static final int PressureSacFieldNum = 124;
    public static final int ResistanceFieldNum = 10;
    public static final int RespirationRateFieldNum = 99;
    public static final int RightPcoFieldNum = 68;
    public static final int RightPedalSmoothnessFieldNum = 46;
    public static final int RightPowerPhaseFieldNum = 71;
    public static final int RightPowerPhasePeakFieldNum = 72;
    public static final int RightTorqueEffectivenessFieldNum = 44;
    public static final int RmvFieldNum = 126;
    public static final int SaturatedHemoglobinPercentFieldNum = 57;
    public static final int SaturatedHemoglobinPercentMaxFieldNum = 59;
    public static final int SaturatedHemoglobinPercentMinFieldNum = 58;
    public static final int Speed1sFieldNum = 17;
    public static final int SpeedFieldNum = 6;
    public static final int StanceTimeBalanceFieldNum = 84;
    public static final int StanceTimeFieldNum = 41;
    public static final int StanceTimePercentFieldNum = 40;
    public static final int StepLengthFieldNum = 85;
    public static final int StrokeTypeFieldNum = 49;
    public static final int TemperatureFieldNum = 13;
    public static final int Time128FieldNum = 48;
    public static final int TimeFromCourseFieldNum = 11;
    public static final int TimeToSurfaceFieldNum = 95;
    public static final int TimestampFieldNum = 253;
    public static final int TotalCyclesFieldNum = 19;
    public static final int TotalHemoglobinConcFieldNum = 54;
    public static final int TotalHemoglobinConcMaxFieldNum = 56;
    public static final int TotalHemoglobinConcMinFieldNum = 55;
    public static final int VerticalOscillationFieldNum = 39;
    public static final int VerticalRatioFieldNum = 83;
    public static final int VerticalSpeedFieldNum = 32;
    public static final int VolumeSacFieldNum = 125;
    public static final int ZoneFieldNum = 50;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("record", 20);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.SINT32;
        bxbVar.e(new w97("position_lat", 0, 133, 1.0d, 0.0d, "semicircles", false, profile$Type));
        bxbVar.e(new w97("position_long", 1, 133, 1.0d, 0.0d, "semicircles", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.UINT16;
        bxbVar.e(new w97("altitude", 2, 132, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type2));
        bxbVar.d.get(3).f18167j.add(new da7(78, false, 16, 5.0d, 500.0d));
        Profile$Type profile$Type3 = Profile$Type.UINT8;
        bxbVar.e(new w97("heart_rate", 3, 2, 1.0d, 0.0d, "bpm", false, profile$Type3));
        bxbVar.e(new w97("cadence", 4, 2, 1.0d, 0.0d, "rpm", false, profile$Type3));
        Profile$Type profile$Type4 = Profile$Type.UINT32;
        bxbVar.e(new w97("distance", 5, 134, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, true, profile$Type4));
        bxbVar.e(new w97("speed", 6, 132, 1000.0d, 0.0d, "m/s", false, profile$Type2));
        bxbVar.d.get(7).f18167j.add(new da7(73, false, 16, 1000.0d, 0.0d));
        bxbVar.e(new w97("power", 7, 132, 1.0d, 0.0d, "watts", false, profile$Type2));
        bxbVar.e(new w97("compressed_speed_distance", 8, 13, 1.0d, 0.0d, "", false, Profile$Type.BYTE));
        bxbVar.d.get(9).f18167j.add(new da7(6, false, 12, 100.0d, 0.0d));
        bxbVar.d.get(9).f18167j.add(new da7(5, true, 12, 16.0d, 0.0d));
        Profile$Type profile$Type5 = Profile$Type.SINT16;
        bxbVar.e(new w97(JsonToSeedlingCardOptionsConvertor.KEY_GRADE_IN_UPK, 9, 131, 100.0d, 0.0d, "%", false, profile$Type5));
        bxbVar.e(new w97("resistance", 10, 2, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("time_from_course", 11, 133, 1000.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("cycle_length", 12, 2, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type3));
        Profile$Type profile$Type6 = Profile$Type.SINT8;
        bxbVar.e(new w97("temperature", 13, 1, 1.0d, 0.0d, "C", false, profile$Type6));
        bxbVar.e(new w97("speed_1s", 17, 2, 16.0d, 0.0d, "m/s", false, profile$Type3));
        bxbVar.e(new w97("cycles", 18, 2, 1.0d, 0.0d, "cycles", false, profile$Type3));
        bxbVar.d.get(16).f18167j.add(new da7(19, true, 8, 1.0d, 0.0d));
        bxbVar.e(new w97("total_cycles", 19, 134, 1.0d, 0.0d, "cycles", true, profile$Type4));
        bxbVar.e(new w97("compressed_accumulated_power", 28, 132, 1.0d, 0.0d, "watts", false, profile$Type2));
        bxbVar.d.get(18).f18167j.add(new da7(29, true, 16, 1.0d, 0.0d));
        bxbVar.e(new w97("accumulated_power", 29, 134, 1.0d, 0.0d, "watts", true, profile$Type4));
        bxbVar.e(new w97("left_right_balance", 30, 2, 1.0d, 0.0d, "", false, Profile$Type.LEFT_RIGHT_BALANCE));
        bxbVar.e(new w97("gps_accuracy", 31, 2, 1.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type3));
        bxbVar.e(new w97("vertical_speed", 32, 131, 1000.0d, 0.0d, "m/s", false, profile$Type5));
        bxbVar.e(new w97(SportSummaryBean.CALORIES, 33, 132, 1.0d, 0.0d, "kcal", false, profile$Type2));
        bxbVar.e(new w97("vertical_oscillation", 39, 132, 10.0d, 0.0d, "mm", false, profile$Type2));
        bxbVar.e(new w97("stance_time_percent", 40, 132, 100.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type2));
        bxbVar.e(new w97("stance_time", 41, 132, 10.0d, 0.0d, "ms", false, profile$Type2));
        bxbVar.e(new w97(ActivityRecognizeEvent.BUNDLE_KEY_ACTIVITY_TYPE, 42, 0, 1.0d, 0.0d, "", false, Profile$Type.ACTIVITY_TYPE));
        bxbVar.e(new w97("left_torque_effectiveness", 43, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type3));
        bxbVar.e(new w97("right_torque_effectiveness", 44, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type3));
        bxbVar.e(new w97("left_pedal_smoothness", 45, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type3));
        bxbVar.e(new w97("right_pedal_smoothness", 46, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type3));
        bxbVar.e(new w97("combined_pedal_smoothness", 47, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type3));
        bxbVar.e(new w97("time128", 48, 2, 128.0d, 0.0d, "s", false, profile$Type3));
        bxbVar.e(new w97("stroke_type", 49, 0, 1.0d, 0.0d, "", false, Profile$Type.STROKE_TYPE));
        bxbVar.e(new w97("zone", 50, 2, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("ball_speed", 51, 132, 100.0d, 0.0d, "m/s", false, profile$Type2));
        bxbVar.e(new w97("cadence256", 52, 132, 256.0d, 0.0d, "rpm", false, profile$Type2));
        bxbVar.e(new w97("fractional_cadence", 53, 2, 128.0d, 0.0d, "rpm", false, profile$Type3));
        bxbVar.e(new w97("total_hemoglobin_conc", 54, 132, 100.0d, 0.0d, "g/dL", false, profile$Type2));
        bxbVar.e(new w97("total_hemoglobin_conc_min", 55, 132, 100.0d, 0.0d, "g/dL", false, profile$Type2));
        bxbVar.e(new w97("total_hemoglobin_conc_max", 56, 132, 100.0d, 0.0d, "g/dL", false, profile$Type2));
        bxbVar.e(new w97("saturated_hemoglobin_percent", 57, 132, 10.0d, 0.0d, "%", false, profile$Type2));
        bxbVar.e(new w97("saturated_hemoglobin_percent_min", 58, 132, 10.0d, 0.0d, "%", false, profile$Type2));
        bxbVar.e(new w97("saturated_hemoglobin_percent_max", 59, 132, 10.0d, 0.0d, "%", false, profile$Type2));
        bxbVar.e(new w97("device_index", 62, 2, 1.0d, 0.0d, "", false, Profile$Type.DEVICE_INDEX));
        bxbVar.e(new w97("left_pco", 67, 1, 1.0d, 0.0d, "mm", false, profile$Type6));
        bxbVar.e(new w97("right_pco", 68, 1, 1.0d, 0.0d, "mm", false, profile$Type6));
        bxbVar.e(new w97("left_power_phase", 69, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type3));
        bxbVar.e(new w97("left_power_phase_peak", 70, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type3));
        bxbVar.e(new w97("right_power_phase", 71, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type3));
        bxbVar.e(new w97("right_power_phase_peak", 72, 2, 0.7111111d, 0.0d, "degrees", false, profile$Type3));
        bxbVar.e(new w97("enhanced_speed", 73, 134, 1000.0d, 0.0d, "m/s", false, profile$Type4));
        bxbVar.e(new w97("enhanced_altitude", 78, 134, 5.0d, 500.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("battery_soc", 81, 2, 2.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type3));
        bxbVar.e(new w97("motor_power", 82, 132, 1.0d, 0.0d, "watts", false, profile$Type2));
        bxbVar.e(new w97("vertical_ratio", 83, 132, 100.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type2));
        bxbVar.e(new w97("stance_time_balance", 84, 132, 100.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type2));
        bxbVar.e(new w97("step_length", 85, 132, 10.0d, 0.0d, "mm", false, profile$Type2));
        bxbVar.e(new w97("cycle_length16", 87, 132, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type2));
        bxbVar.e(new w97("absolute_pressure", 91, 134, 1.0d, 0.0d, "Pa", false, profile$Type4));
        bxbVar.e(new w97("depth", 92, 134, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("next_stop_depth", 93, 134, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type4));
        bxbVar.e(new w97("next_stop_time", 94, 134, 1.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("time_to_surface", 95, 134, 1.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("ndl_time", 96, 134, 1.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("cns_load", 97, 2, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type3));
        bxbVar.e(new w97("n2_load", 98, 132, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type2));
        bxbVar.e(new w97("respiration_rate", 99, 2, 1.0d, 0.0d, "s", false, profile$Type3));
        bxbVar.d.get(68).f18167j.add(new da7(108, false, 8, 1.0d, 0.0d));
        bxbVar.e(new w97("enhanced_respiration_rate", 108, 132, 100.0d, 0.0d, "Breaths/min", false, profile$Type2));
        Profile$Type profile$Type7 = Profile$Type.FLOAT32;
        bxbVar.e(new w97("grit", 114, 136, 1.0d, 0.0d, "", false, profile$Type7));
        bxbVar.e(new w97("flow", 115, 136, 1.0d, 0.0d, "", false, profile$Type7));
        bxbVar.e(new w97("current_stress", 116, 132, 100.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("ebike_travel_range", 117, 132, 1.0d, 0.0d, "km", false, profile$Type2));
        bxbVar.e(new w97("ebike_battery_level", 118, 2, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type3));
        bxbVar.e(new w97("ebike_assist_mode", 119, 2, 1.0d, 0.0d, "depends on sensor", false, profile$Type3));
        bxbVar.e(new w97("ebike_assist_level_percent", 120, 2, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type3));
        bxbVar.e(new w97("air_time_remaining", 123, 134, 1.0d, 0.0d, "s", false, profile$Type4));
        bxbVar.e(new w97("pressure_sac", 124, 132, 100.0d, 0.0d, "bar/min", false, profile$Type2));
        bxbVar.e(new w97("volume_sac", 125, 132, 100.0d, 0.0d, "L/min", false, profile$Type2));
        bxbVar.e(new w97("rmv", 126, 132, 100.0d, 0.0d, "L/min", false, profile$Type2));
        bxbVar.e(new w97("ascent_rate", 127, 133, 1000.0d, 0.0d, "m/s", false, profile$Type));
        bxbVar.e(new w97("po2", 129, 2, 100.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type3));
        bxbVar.e(new w97("core_temperature", 139, 132, 100.0d, 0.0d, "C", false, profile$Type2));
    }

    public qhf() {
        super(w07.b(20));
    }

    public Short A() {
        return n(4, 0, 65535);
    }

    public Float B() {
        return k(5, 0, 65535);
    }

    public Short C() {
        return n(3, 0, 65535);
    }

    public Integer D() {
        return l(0, 0, 65535);
    }

    public Integer E() {
        return l(1, 0, 65535);
    }

    public Float F() {
        return k(6, 0, 65535);
    }

    public void G(Float f) {
        v(2, 0, f, 65535);
    }

    public void H(Short sh) {
        v(4, 0, sh, 65535);
    }

    public void I(Float f) {
        v(5, 0, f, 65535);
    }

    public void J(Short sh) {
        v(3, 0, sh, 65535);
    }

    public void K(Integer num) {
        v(0, 0, num, 65535);
    }

    public void L(Integer num) {
        v(1, 0, num, 65535);
    }

    public void M(Float f) {
        v(6, 0, f, 65535);
    }

    public void b(s05 s05Var) {
        v(253, 0, s05Var.l(), 65535);
    }

    public s05 getTimestamp() {
        return x(m(253, 0, 65535));
    }

    public Float z() {
        return k(2, 0, 65535);
    }

    public qhf(bxb bxbVar) {
        super(bxbVar);
    }
}
