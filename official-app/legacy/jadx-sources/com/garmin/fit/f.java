package com.garmin.fit;

import com.heytap.sports.record.details.bean.SportSummaryBean;
import com.oplus.aiunit.vision.bxb;
import com.oplus.aiunit.vision.da7;
import com.oplus.aiunit.vision.jxb;
import com.oplus.aiunit.vision.s05;
import com.oplus.aiunit.vision.w97;

/* JADX INFO: loaded from: classes13.dex */
public class f extends bxb implements jxb {
    public static final int AvgRespirationRateFieldNum = 24;
    public static final int AvgSpeedFieldNum = 6;
    public static final int AvgSwimmingCadenceFieldNum = 9;
    public static final int EnhancedAvgRespirationRateFieldNum = 22;
    public static final int EnhancedMaxRespirationRateFieldNum = 23;
    public static final int EventFieldNum = 0;
    public static final int EventGroupFieldNum = 10;
    public static final int EventTypeFieldNum = 1;
    public static final int LengthTypeFieldNum = 12;
    public static final int MaxRespirationRateFieldNum = 25;
    public static final int MessageIndexFieldNum = 254;
    public static final int OpponentScoreFieldNum = 19;
    public static final int PlayerScoreFieldNum = 18;
    public static final int StartTimeFieldNum = 2;
    public static final int StrokeCountFieldNum = 20;
    public static final int SwimStrokeFieldNum = 7;
    public static final int TimestampFieldNum = 253;
    public static final int TotalCaloriesFieldNum = 11;
    public static final int TotalElapsedTimeFieldNum = 3;
    public static final int TotalStrokesFieldNum = 5;
    public static final int TotalTimerTimeFieldNum = 4;
    public static final int ZoneCountFieldNum = 21;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("length", 101);
        h = bxbVar;
        bxbVar.e(new w97("message_index", 254, 132, 1.0d, 0.0d, "", false, Profile$Type.MESSAGE_INDEX));
        Profile$Type profile$Type = Profile$Type.DATE_TIME;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("event", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.EVENT));
        bxbVar.e(new w97("event_type", 1, 0, 1.0d, 0.0d, "", false, Profile$Type.EVENT_TYPE));
        bxbVar.e(new w97("start_time", 2, 134, 1.0d, 0.0d, "", false, profile$Type));
        Profile$Type profile$Type2 = Profile$Type.UINT32;
        bxbVar.e(new w97("total_elapsed_time", 3, 134, 1000.0d, 0.0d, "s", false, profile$Type2));
        bxbVar.e(new w97("total_timer_time", 4, 134, 1000.0d, 0.0d, "s", false, profile$Type2));
        Profile$Type profile$Type3 = Profile$Type.UINT16;
        bxbVar.e(new w97("total_strokes", 5, 132, 1.0d, 0.0d, "strokes", false, profile$Type3));
        bxbVar.e(new w97(SportSummaryBean.AVG_SPEED, 6, 132, 1000.0d, 0.0d, "m/s", false, profile$Type3));
        bxbVar.e(new w97("swim_stroke", 7, 0, 1.0d, 0.0d, "swim_stroke", false, Profile$Type.SWIM_STROKE));
        Profile$Type profile$Type4 = Profile$Type.UINT8;
        bxbVar.e(new w97("avg_swimming_cadence", 9, 2, 1.0d, 0.0d, "strokes/min", false, profile$Type4));
        bxbVar.e(new w97("event_group", 10, 2, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("total_calories", 11, 132, 1.0d, 0.0d, "kcal", false, profile$Type3));
        bxbVar.e(new w97("length_type", 12, 0, 1.0d, 0.0d, "", false, Profile$Type.LENGTH_TYPE));
        bxbVar.e(new w97("player_score", 18, 132, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("opponent_score", 19, 132, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("stroke_count", 20, 132, 1.0d, 0.0d, "counts", false, profile$Type3));
        bxbVar.e(new w97("zone_count", 21, 132, 1.0d, 0.0d, "counts", false, profile$Type3));
        bxbVar.e(new w97("enhanced_avg_respiration_rate", 22, 132, 100.0d, 0.0d, "Breaths/min", false, profile$Type3));
        bxbVar.e(new w97("enhanced_max_respiration_rate", 23, 132, 100.0d, 0.0d, "Breaths/min", false, profile$Type3));
        bxbVar.e(new w97("avg_respiration_rate", 24, 2, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.d.get(20).f18167j.add(new da7(22, false, 8, 1.0d, 0.0d));
        bxbVar.e(new w97("max_respiration_rate", 25, 2, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.d.get(21).f18167j.add(new da7(23, false, 8, 1.0d, 0.0d));
    }

    public f(bxb bxbVar) {
        super(bxbVar);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public Short a() {
        return n(10, 0, 65535);
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
