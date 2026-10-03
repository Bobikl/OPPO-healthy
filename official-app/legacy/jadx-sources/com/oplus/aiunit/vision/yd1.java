package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.entity.ViewEntity;

/* JADX INFO: loaded from: classes13.dex */
public class yd1 extends bxb {
    public static final int AutoPowerZeroFieldNum = 13;
    public static final int AutoWheelCalFieldNum = 12;
    public static final int AutoWheelsizeFieldNum = 9;
    public static final int BikeCadAntIdFieldNum = 5;
    public static final int BikeCadAntIdTransTypeFieldNum = 22;
    public static final int BikePowerAntIdFieldNum = 7;
    public static final int BikePowerAntIdTransTypeFieldNum = 24;
    public static final int BikeSpdAntIdFieldNum = 4;
    public static final int BikeSpdAntIdTransTypeFieldNum = 21;
    public static final int BikeSpdcadAntIdFieldNum = 6;
    public static final int BikeSpdcadAntIdTransTypeFieldNum = 23;
    public static final int BikeWeightFieldNum = 10;
    public static final int CadEnabledFieldNum = 16;
    public static final int CrankLengthFieldNum = 19;
    public static final int CustomWheelsizeFieldNum = 8;
    public static final int EnabledFieldNum = 20;
    public static final int FrontGearFieldNum = 39;
    public static final int FrontGearNumFieldNum = 38;
    public static final int IdFieldNum = 14;
    public static final int MessageIndexFieldNum = 254;
    public static final int NameFieldNum = 0;
    public static final int OdometerFieldNum = 3;
    public static final int OdometerRolloverFieldNum = 37;
    public static final int PowerCalFactorFieldNum = 11;
    public static final int PowerEnabledFieldNum = 18;
    public static final int RearGearFieldNum = 41;
    public static final int RearGearNumFieldNum = 40;
    public static final int ShimanoDi2EnabledFieldNum = 44;
    public static final int SpdEnabledFieldNum = 15;
    public static final int SpdcadEnabledFieldNum = 17;
    public static final int SportFieldNum = 1;
    public static final int SubSportFieldNum = 2;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("bike_profile", 6);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("name", 0, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
        bxbVar.e(new w97("sport", 1, 0, 1.0d, 0.0d, "", false, Profile$Type.SPORT));
        bxbVar.e(new w97("sub_sport", 2, 0, 1.0d, 0.0d, "", false, Profile$Type.SUB_SPORT));
        bxbVar.e(new w97("odometer", 3, 134, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, Profile$Type.UINT32));
        Profile$Type profile$Type = Profile$Type.UINT16Z;
        bxbVar.e(new w97("bike_spd_ant_id", 4, 139, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("bike_cad_ant_id", 5, 139, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("bike_spdcad_ant_id", 6, 139, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("bike_power_ant_id", 7, 139, 1.0d, 0.0d, "", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.UINT16;
        bxbVar.e(new w97("custom_wheelsize", 8, 132, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type2));
        bxbVar.e(new w97("auto_wheelsize", 9, 132, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type2));
        bxbVar.e(new w97("bike_weight", 10, 132, 10.0d, 0.0d, "kg", false, profile$Type2));
        bxbVar.e(new w97("power_cal_factor", 11, 132, 10.0d, 0.0d, "%", false, profile$Type2));
        Profile$Type profile$Type3 = Profile$Type.BOOL;
        bxbVar.e(new w97("auto_wheel_cal", 12, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("auto_power_zero", 13, 0, 1.0d, 0.0d, "", false, profile$Type3));
        Profile$Type profile$Type4 = Profile$Type.UINT8;
        bxbVar.e(new w97("id", 14, 2, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("spd_enabled", 15, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("cad_enabled", 16, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("spdcad_enabled", 17, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("power_enabled", 18, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("crank_length", 19, 2, 2.0d, -110.0d, "mm", false, profile$Type4));
        bxbVar.e(new w97(ViewEntity.ENABLED, 20, 0, 1.0d, 0.0d, "", false, profile$Type3));
        Profile$Type profile$Type5 = Profile$Type.UINT8Z;
        bxbVar.e(new w97("bike_spd_ant_id_trans_type", 21, 10, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("bike_cad_ant_id_trans_type", 22, 10, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("bike_spdcad_ant_id_trans_type", 23, 10, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("bike_power_ant_id_trans_type", 24, 10, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("odometer_rollover", 37, 2, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("front_gear_num", 38, 10, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("front_gear", 39, 10, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("rear_gear_num", 40, 10, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("rear_gear", 41, 10, 1.0d, 0.0d, "", false, profile$Type5));
        bxbVar.e(new w97("shimano_di2_enabled", 44, 0, 1.0d, 0.0d, "", false, profile$Type3));
    }

    public yd1(bxb bxbVar) {
        super(bxbVar);
    }
}
