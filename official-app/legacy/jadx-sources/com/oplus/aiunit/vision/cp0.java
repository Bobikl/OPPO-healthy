package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;

/* JADX INFO: loaded from: classes13.dex */
public class cp0 extends bxb {
    public static final int AccelLateralFieldNum = 4;
    public static final int AccelNormalFieldNum = 5;
    public static final int AttitudeStageCompleteFieldNum = 8;
    public static final int PitchFieldNum = 2;
    public static final int RollFieldNum = 3;
    public static final int StageFieldNum = 7;
    public static final int SystemTimeFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final int TimestampMsFieldNum = 0;
    public static final int TrackFieldNum = 9;
    public static final int TurnRateFieldNum = 6;
    public static final int ValidityFieldNum = 10;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("aviation_attitude", 178);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        Profile$Type profile$Type = Profile$Type.UINT16;
        bxbVar.e(new w97("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, profile$Type));
        bxbVar.e(new w97("system_time", 1, 134, 1.0d, 0.0d, "ms", false, Profile$Type.UINT32));
        Profile$Type profile$Type2 = Profile$Type.SINT16;
        bxbVar.e(new w97(SpeechConstant.KEY_PITCH, 2, 131, 10430.38d, 0.0d, "radians", false, profile$Type2));
        bxbVar.e(new w97("roll", 3, 131, 10430.38d, 0.0d, "radians", false, profile$Type2));
        bxbVar.e(new w97("accel_lateral", 4, 131, 100.0d, 0.0d, "m/s^2", false, profile$Type2));
        bxbVar.e(new w97("accel_normal", 5, 131, 100.0d, 0.0d, "m/s^2", false, profile$Type2));
        bxbVar.e(new w97("turn_rate", 6, 131, 1024.0d, 0.0d, "radians/second", false, profile$Type2));
        bxbVar.e(new w97("stage", 7, 0, 1.0d, 0.0d, "", false, Profile$Type.ATTITUDE_STAGE));
        bxbVar.e(new w97("attitude_stage_complete", 8, 2, 1.0d, 0.0d, "%", false, Profile$Type.UINT8));
        bxbVar.e(new w97("track", 9, 132, 10430.38d, 0.0d, "radians", false, profile$Type));
        bxbVar.e(new w97("validity", 10, 132, 1.0d, 0.0d, "", false, Profile$Type.ATTITUDE_VALIDITY));
    }

    public cp0(bxb bxbVar) {
        super(bxbVar);
    }
}
