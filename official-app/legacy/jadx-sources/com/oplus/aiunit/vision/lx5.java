package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.ParserTag;

/* JADX INFO: loaded from: classes13.dex */
public class lx5 extends bxb {
    public static final int ApneaCountdownEnabledFieldNum = 12;
    public static final int ApneaCountdownTimeFieldNum = 13;
    public static final int BacklightBrightnessFieldNum = 15;
    public static final int BacklightModeFieldNum = 14;
    public static final int BacklightTimeoutFieldNum = 16;
    public static final int BottomDepthFieldNum = 10;
    public static final int BottomTimeFieldNum = 11;
    public static final int CcrHighSetpointDepthFieldNum = 27;
    public static final int CcrHighSetpointFieldNum = 26;
    public static final int CcrHighSetpointSwitchModeFieldNum = 25;
    public static final int CcrLowSetpointDepthFieldNum = 24;
    public static final int CcrLowSetpointFieldNum = 23;
    public static final int CcrLowSetpointSwitchModeFieldNum = 22;
    public static final int DiveSoundsFieldNum = 35;
    public static final int GasConsumptionDisplayFieldNum = 29;
    public static final int GfHighFieldNum = 3;
    public static final int GfLowFieldNum = 2;
    public static final int HeartRateSourceFieldNum = 20;
    public static final int HeartRateSourceTypeFieldNum = 19;
    public static final int LastStopMultipleFieldNum = 36;
    public static final int MessageIndexFieldNum = 254;
    public static final int ModelFieldNum = 1;
    public static final int NameFieldNum = 0;
    public static final int NoFlyTimeModeFieldNum = 37;
    public static final int Po2CriticalFieldNum = 7;
    public static final int Po2DecoFieldNum = 8;
    public static final int Po2WarnFieldNum = 6;
    public static final int RepeatDiveIntervalFieldNum = 17;
    public static final int SafetyStopEnabledFieldNum = 9;
    public static final int SafetyStopTimeFieldNum = 18;
    public static final int TimestampFieldNum = 253;
    public static final int TravelGasFieldNum = 21;
    public static final int UpKeyEnabledFieldNum = 30;
    public static final int WaterDensityFieldNum = 5;
    public static final int WaterTypeFieldNum = 4;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("dive_settings", 258);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.MESSAGE_INDEX;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("name", 0, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
        bxbVar.e(new w97("model", 1, 0, 1.0d, 0.0d, "", false, Profile$Type.TISSUE_MODEL_TYPE));
        Profile$Type profile$Type2 = Profile$Type.UINT8;
        bxbVar.e(new w97("gf_low", 2, 2, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type2));
        bxbVar.e(new w97("gf_high", 3, 2, 1.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type2));
        bxbVar.e(new w97("water_type", 4, 0, 1.0d, 0.0d, "", false, Profile$Type.WATER_TYPE));
        Profile$Type profile$Type3 = Profile$Type.FLOAT32;
        bxbVar.e(new w97("water_density", 5, 136, 1.0d, 0.0d, "kg/m^3", false, profile$Type3));
        bxbVar.e(new w97("po2_warn", 6, 2, 100.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type2));
        bxbVar.e(new w97("po2_critical", 7, 2, 100.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type2));
        bxbVar.e(new w97("po2_deco", 8, 2, 100.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type2));
        Profile$Type profile$Type4 = Profile$Type.BOOL;
        bxbVar.e(new w97("safety_stop_enabled", 9, 0, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("bottom_depth", 10, 136, 1.0d, 0.0d, "", false, profile$Type3));
        Profile$Type profile$Type5 = Profile$Type.UINT32;
        bxbVar.e(new w97("bottom_time", 11, 134, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("apnea_countdown_enabled", 12, 0, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("apnea_countdown_time", 13, 134, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("backlight_mode", 14, 0, 1.0d, 0.0d, "", false, Profile$Type.DIVE_BACKLIGHT_MODE));
        bxbVar.e(new w97("backlight_brightness", 15, 2, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("backlight_timeout", 16, 2, 1.0d, 0.0d, "", false, Profile$Type.BACKLIGHT_TIMEOUT));
        Profile$Type profile$Type6 = Profile$Type.UINT16;
        bxbVar.e(new w97("repeat_dive_interval", 17, 132, 1.0d, 0.0d, "s", false, profile$Type6));
        bxbVar.e(new w97("safety_stop_time", 18, 132, 1.0d, 0.0d, "s", false, profile$Type6));
        bxbVar.e(new w97("heart_rate_source_type", 19, 0, 1.0d, 0.0d, "", false, Profile$Type.SOURCE_TYPE));
        bxbVar.e(new w97("heart_rate_source", 20, 2, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.d.get(22).k.add(new p2j("heart_rate_antplus_device_type", 2, 1.0d, 0.0d, ""));
        bxbVar.d.get(22).k.get(0).b(19, 1L);
        bxbVar.d.get(22).k.add(new p2j("heart_rate_local_device_type", 2, 1.0d, 0.0d, ""));
        bxbVar.d.get(22).k.get(1).b(19, 5L);
        bxbVar.e(new w97("travel_gas", 21, 132, 1.0d, 0.0d, "", false, profile$Type));
        Profile$Type profile$Type7 = Profile$Type.CCR_SETPOINT_SWITCH_MODE;
        bxbVar.e(new w97("ccr_low_setpoint_switch_mode", 22, 0, 1.0d, 0.0d, "", false, profile$Type7));
        bxbVar.e(new w97("ccr_low_setpoint", 23, 2, 100.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type2));
        bxbVar.e(new w97("ccr_low_setpoint_depth", 24, 134, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        bxbVar.e(new w97("ccr_high_setpoint_switch_mode", 25, 0, 1.0d, 0.0d, "", false, profile$Type7));
        bxbVar.e(new w97("ccr_high_setpoint", 26, 2, 100.0d, 0.0d, ParserTag.TAG_PERCENT, false, profile$Type2));
        bxbVar.e(new w97("ccr_high_setpoint_depth", 27, 134, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type5));
        bxbVar.e(new w97("gas_consumption_display", 29, 0, 1.0d, 0.0d, "", false, Profile$Type.GAS_CONSUMPTION_RATE_TYPE));
        bxbVar.e(new w97("up_key_enabled", 30, 0, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("dive_sounds", 35, 0, 1.0d, 0.0d, "", false, Profile$Type.TONE));
        bxbVar.e(new w97("last_stop_multiple", 36, 2, 10.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("no_fly_time_mode", 37, 0, 1.0d, 0.0d, "", false, Profile$Type.NO_FLY_TIME_MODE));
    }

    public lx5(bxb bxbVar) {
        super(bxbVar);
    }
}
