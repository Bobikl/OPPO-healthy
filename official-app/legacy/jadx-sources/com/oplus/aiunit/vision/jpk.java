package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthArchiveRecord;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;

/* JADX INFO: loaded from: classes13.dex */
public class jpk extends bxb {
    public static final int ActivityClassFieldNum = 17;
    public static final int AgeFieldNum = 2;
    public static final int DefaultMaxBikingHeartRateFieldNum = 10;
    public static final int DefaultMaxHeartRateFieldNum = 11;
    public static final int DefaultMaxRunningHeartRateFieldNum = 9;
    public static final int DepthSettingFieldNum = 47;
    public static final int DistSettingFieldNum = 14;
    public static final int DiveCountFieldNum = 49;
    public static final int ElevSettingFieldNum = 6;
    public static final int FriendlyNameFieldNum = 0;
    public static final int GenderFieldNum = 1;
    public static final int GlobalIdFieldNum = 23;
    public static final int HeightFieldNum = 3;
    public static final int HeightSettingFieldNum = 30;
    public static final int HrSettingFieldNum = 12;
    public static final int LanguageFieldNum = 5;
    public static final int LocalIdFieldNum = 22;
    public static final int MessageIndexFieldNum = 254;
    public static final int PositionSettingFieldNum = 18;
    public static final int PowerSettingFieldNum = 16;
    public static final int RestingHeartRateFieldNum = 8;
    public static final int SleepTimeFieldNum = 29;
    public static final int SpeedSettingFieldNum = 13;
    public static final int TemperatureSettingFieldNum = 21;
    public static final int UserRunningStepLengthFieldNum = 31;
    public static final int UserWalkingStepLengthFieldNum = 32;
    public static final int WakeTimeFieldNum = 28;
    public static final int WeightFieldNum = 4;
    public static final int WeightSettingFieldNum = 7;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb(com.coloros.sceneservice.e.e.TABLE_NAME, 3);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        bxbVar.e(new w97("friendly_name", 0, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
        bxbVar.e(new w97("gender", 1, 0, 1.0d, 0.0d, "", false, Profile$Type.GENDER));
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97(DBHealthArchiveRecord.AGE, 2, 2, 1.0d, 0.0d, "years", false, profile$Type));
        bxbVar.e(new w97(Fields.HEIGHT_FIELD, 3, 2, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.UINT16;
        bxbVar.e(new w97("weight", 4, 132, 10.0d, 0.0d, "kg", false, profile$Type2));
        bxbVar.e(new w97("language", 5, 0, 1.0d, 0.0d, "", false, Profile$Type.LANGUAGE));
        Profile$Type profile$Type3 = Profile$Type.DISPLAY_MEASURE;
        bxbVar.e(new w97("elev_setting", 6, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("weight_setting", 7, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("resting_heart_rate", 8, 2, 1.0d, 0.0d, "bpm", false, profile$Type));
        bxbVar.e(new w97("default_max_running_heart_rate", 9, 2, 1.0d, 0.0d, "bpm", false, profile$Type));
        bxbVar.e(new w97("default_max_biking_heart_rate", 10, 2, 1.0d, 0.0d, "bpm", false, profile$Type));
        bxbVar.e(new w97("default_max_heart_rate", 11, 2, 1.0d, 0.0d, "bpm", false, profile$Type));
        bxbVar.e(new w97("hr_setting", 12, 0, 1.0d, 0.0d, "", false, Profile$Type.DISPLAY_HEART));
        bxbVar.e(new w97("speed_setting", 13, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("dist_setting", 14, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("power_setting", 16, 0, 1.0d, 0.0d, "", false, Profile$Type.DISPLAY_POWER));
        bxbVar.e(new w97("activity_class", 17, 0, 1.0d, 0.0d, "", false, Profile$Type.ACTIVITY_CLASS));
        bxbVar.e(new w97("position_setting", 18, 0, 1.0d, 0.0d, "", false, Profile$Type.DISPLAY_POSITION));
        bxbVar.e(new w97("temperature_setting", 21, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("local_id", 22, 132, 1.0d, 0.0d, "", false, Profile$Type.USER_LOCAL_ID));
        bxbVar.e(new w97("global_id", 23, 13, 1.0d, 0.0d, "", false, Profile$Type.BYTE));
        Profile$Type profile$Type4 = Profile$Type.LOCALTIME_INTO_DAY;
        bxbVar.e(new w97("wake_time", 28, 134, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("sleep_time", 29, 134, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("height_setting", 30, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("user_running_step_length", 31, 132, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type2));
        bxbVar.e(new w97("user_walking_step_length", 32, 132, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type2));
        bxbVar.e(new w97("depth_setting", 47, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("dive_count", 49, 134, 1.0d, 0.0d, "", false, Profile$Type.UINT32));
    }

    public jpk(bxb bxbVar) {
        super(bxbVar);
    }
}
