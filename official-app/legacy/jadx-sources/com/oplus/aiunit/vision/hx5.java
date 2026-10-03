package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.ViewEntity;

/* JADX INFO: loaded from: classes13.dex */
public class hx5 extends bxb {
    public static final int AlarmTypeFieldNum = 3;
    public static final int DepthFieldNum = 0;
    public static final int DiveTypesFieldNum = 5;
    public static final int EnabledFieldNum = 2;
    public static final int IdFieldNum = 6;
    public static final int MessageIndexFieldNum = 254;
    public static final int PopupEnabledFieldNum = 7;
    public static final int RepeatingFieldNum = 10;
    public static final int SoundFieldNum = 4;
    public static final int SpeedFieldNum = 11;
    public static final int TimeFieldNum = 1;
    public static final int TriggerOnAscentFieldNum = 9;
    public static final int TriggerOnDescentFieldNum = 8;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("dive_apnea_alarm", ixb.DIVE_APNEA_ALARM);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        Profile$Type profile$Type = Profile$Type.UINT32;
        bxbVar.e(new w97("depth", 0, 134, 1000.0d, 0.0d, LogFieldKey.MESSAGE_KEY, false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.SINT32;
        bxbVar.e(new w97(ClickApiEntity.TIME, 1, 133, 1.0d, 0.0d, "s", false, profile$Type2));
        Profile$Type profile$Type3 = Profile$Type.BOOL;
        bxbVar.e(new w97(ViewEntity.ENABLED, 2, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("alarm_type", 3, 0, 1.0d, 0.0d, "", false, Profile$Type.DIVE_ALARM_TYPE));
        bxbVar.e(new w97("sound", 4, 0, 1.0d, 0.0d, "", false, Profile$Type.TONE));
        bxbVar.e(new w97("dive_types", 5, 0, 1.0d, 0.0d, "", false, Profile$Type.SUB_SPORT));
        bxbVar.e(new w97("id", 6, 134, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("popup_enabled", 7, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("trigger_on_descent", 8, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("trigger_on_ascent", 9, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("repeating", 10, 0, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("speed", 11, 133, 1000.0d, 0.0d, "mps", false, profile$Type2));
    }

    public hx5(bxb bxbVar) {
        super(bxbVar);
    }
}
