package com.garmin.fit;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.bean.CoreEntity;
import com.heytap.sports.record.details.bean.SportSummaryBean;
import com.oplus.aiunit.vision.bxb;
import com.oplus.aiunit.vision.da7;
import com.oplus.aiunit.vision.jxb;
import com.oplus.aiunit.vision.p2j;
import com.oplus.aiunit.vision.s05;
import com.oplus.aiunit.vision.w97;
import com.oplus.deepthinker.sdk.app.awareness.capability.impl.ActivityRecognizeEvent;

/* JADX INFO: loaded from: classes13.dex */
public class b extends bxb implements jxb {
    public static final int ActivityTypeFieldNum = 14;
    public static final int Data16FieldNum = 2;
    public static final int DataFieldNum = 3;
    public static final int DeviceIndexFieldNum = 13;
    public static final int EventFieldNum = 0;
    public static final int EventGroupFieldNum = 4;
    public static final int EventTypeFieldNum = 1;
    public static final int FrontGearFieldNum = 10;
    public static final int FrontGearNumFieldNum = 9;
    public static final int OpponentScoreFieldNum = 8;
    public static final int RadarThreatAvgApproachSpeedFieldNum = 23;
    public static final int RadarThreatCountFieldNum = 22;
    public static final int RadarThreatLevelMaxFieldNum = 21;
    public static final int RadarThreatMaxApproachSpeedFieldNum = 24;
    public static final int RearGearFieldNum = 12;
    public static final int RearGearNumFieldNum = 11;
    public static final int ScoreFieldNum = 7;
    public static final int StartTimestampFieldNum = 15;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("event", 21);
        h = bxbVar;
        Profile$Type profile$Type = Profile$Type.DATE_TIME;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, profile$Type));
        bxbVar.e(new w97("event", 0, 0, 1.0d, 0.0d, "", false, Profile$Type.EVENT));
        bxbVar.e(new w97("event_type", 1, 0, 1.0d, 0.0d, "", false, Profile$Type.EVENT_TYPE));
        Profile$Type profile$Type2 = Profile$Type.UINT16;
        bxbVar.e(new w97(CoreEntity.DATA16, 2, 132, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.d.get(3).f18167j.add(new da7(3, false, 16, 1.0d, 0.0d));
        bxbVar.e(new w97("data", 3, 134, 1.0d, 0.0d, "", false, Profile$Type.UINT32));
        bxbVar.d.get(4).k.add(new p2j("timer_trigger", 0, 1.0d, 0.0d, ""));
        bxbVar.d.get(4).k.get(0).b(0, 0L);
        bxbVar.d.get(4).k.add(new p2j("course_point_index", 132, 1.0d, 0.0d, ""));
        bxbVar.d.get(4).k.get(1).b(0, 10L);
        bxbVar.d.get(4).k.add(new p2j("battery_level", 132, 1000.0d, 0.0d, ExifInterface.GPS_MEASUREMENT_INTERRUPTED));
        bxbVar.d.get(4).k.get(2).b(0, 11L);
        bxbVar.d.get(4).k.add(new p2j("virtual_partner_speed", 132, 1000.0d, 0.0d, "m/s"));
        bxbVar.d.get(4).k.get(3).b(0, 12L);
        bxbVar.d.get(4).k.add(new p2j("hr_high_alert", 2, 1.0d, 0.0d, "bpm"));
        bxbVar.d.get(4).k.get(4).b(0, 13L);
        bxbVar.d.get(4).k.add(new p2j("hr_low_alert", 2, 1.0d, 0.0d, "bpm"));
        bxbVar.d.get(4).k.get(5).b(0, 14L);
        bxbVar.d.get(4).k.add(new p2j("speed_high_alert", 134, 1000.0d, 0.0d, "m/s"));
        bxbVar.d.get(4).k.get(6).b(0, 15L);
        bxbVar.d.get(4).k.add(new p2j("speed_low_alert", 134, 1000.0d, 0.0d, "m/s"));
        bxbVar.d.get(4).k.get(7).b(0, 16L);
        bxbVar.d.get(4).k.add(new p2j("cad_high_alert", 132, 1.0d, 0.0d, "rpm"));
        bxbVar.d.get(4).k.get(8).b(0, 17L);
        bxbVar.d.get(4).k.add(new p2j("cad_low_alert", 132, 1.0d, 0.0d, "rpm"));
        bxbVar.d.get(4).k.get(9).b(0, 18L);
        bxbVar.d.get(4).k.add(new p2j("power_high_alert", 132, 1.0d, 0.0d, "watts"));
        bxbVar.d.get(4).k.get(10).b(0, 19L);
        bxbVar.d.get(4).k.add(new p2j("power_low_alert", 132, 1.0d, 0.0d, "watts"));
        bxbVar.d.get(4).k.get(11).b(0, 20L);
        bxbVar.d.get(4).k.add(new p2j("time_duration_alert", 134, 1000.0d, 0.0d, "s"));
        bxbVar.d.get(4).k.get(12).b(0, 23L);
        bxbVar.d.get(4).k.add(new p2j("distance_duration_alert", 134, 100.0d, 0.0d, LogFieldKey.MESSAGE_KEY));
        bxbVar.d.get(4).k.get(13).b(0, 24L);
        bxbVar.d.get(4).k.add(new p2j("calorie_duration_alert", 134, 1.0d, 0.0d, SportSummaryBean.CALORIES));
        bxbVar.d.get(4).k.get(14).b(0, 25L);
        bxbVar.d.get(4).k.add(new p2j("fitness_equipment_state", 0, 1.0d, 0.0d, ""));
        bxbVar.d.get(4).k.get(15).b(0, 27L);
        bxbVar.d.get(4).k.add(new p2j("sport_point", 134, 1.0d, 0.0d, ""));
        bxbVar.d.get(4).k.get(16).b(0, 33L);
        bxbVar.d.get(4).k.get(16).a(new da7(7, false, 16, 1.0d, 0.0d));
        bxbVar.d.get(4).k.get(16).a(new da7(8, false, 16, 1.0d, 0.0d));
        bxbVar.d.get(4).k.add(new p2j("gear_change_data", 134, 1.0d, 0.0d, ""));
        bxbVar.d.get(4).k.get(17).b(0, 42L);
        bxbVar.d.get(4).k.get(17).b(0, 43L);
        bxbVar.d.get(4).k.get(17).a(new da7(11, false, 8, 1.0d, 0.0d));
        bxbVar.d.get(4).k.get(17).a(new da7(12, false, 8, 1.0d, 0.0d));
        bxbVar.d.get(4).k.get(17).a(new da7(9, false, 8, 1.0d, 0.0d));
        bxbVar.d.get(4).k.get(17).a(new da7(10, false, 8, 1.0d, 0.0d));
        bxbVar.d.get(4).k.add(new p2j("rider_position", 0, 1.0d, 0.0d, ""));
        bxbVar.d.get(4).k.get(18).b(0, 44L);
        bxbVar.d.get(4).k.add(new p2j("comm_timeout", 132, 1.0d, 0.0d, ""));
        bxbVar.d.get(4).k.get(19).b(0, 47L);
        bxbVar.d.get(4).k.add(new p2j("dive_alert", 0, 1.0d, 0.0d, ""));
        bxbVar.d.get(4).k.get(20).b(0, 56L);
        bxbVar.d.get(4).k.add(new p2j("auto_activity_detect_duration", 132, 1.0d, 0.0d, "min"));
        bxbVar.d.get(4).k.get(21).b(0, 54L);
        bxbVar.d.get(4).k.add(new p2j("radar_threat_alert", 134, 1.0d, 0.0d, ""));
        bxbVar.d.get(4).k.get(22).b(0, 75L);
        bxbVar.d.get(4).k.get(22).a(new da7(21, false, 8, 1.0d, 0.0d));
        bxbVar.d.get(4).k.get(22).a(new da7(22, false, 8, 1.0d, 0.0d));
        bxbVar.d.get(4).k.get(22).a(new da7(23, false, 8, 10.0d, 0.0d));
        bxbVar.d.get(4).k.get(22).a(new da7(24, false, 8, 10.0d, 0.0d));
        Profile$Type profile$Type3 = Profile$Type.UINT8;
        bxbVar.e(new w97("event_group", 4, 2, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("score", 7, 132, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("opponent_score", 8, 132, 1.0d, 0.0d, "", false, profile$Type2));
        Profile$Type profile$Type4 = Profile$Type.UINT8Z;
        bxbVar.e(new w97("front_gear_num", 9, 10, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("front_gear", 10, 10, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("rear_gear_num", 11, 10, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("rear_gear", 12, 10, 1.0d, 0.0d, "", false, profile$Type4));
        bxbVar.e(new w97("device_index", 13, 2, 1.0d, 0.0d, "", false, Profile$Type.DEVICE_INDEX));
        bxbVar.e(new w97(ActivityRecognizeEvent.BUNDLE_KEY_ACTIVITY_TYPE, 14, 0, 1.0d, 0.0d, "", false, Profile$Type.ACTIVITY_TYPE));
        bxbVar.e(new w97("start_timestamp", 15, 134, 1.0d, 0.0d, "s", false, profile$Type));
        bxbVar.d.get(14).k.add(new p2j("auto_activity_detect_start_timestamp", 134, 1.0d, 0.0d, "s"));
        bxbVar.d.get(14).k.get(0).b(0, 54L);
        bxbVar.e(new w97("radar_threat_level_max", 21, 0, 1.0d, 0.0d, "", false, Profile$Type.RADAR_THREAT_LEVEL_TYPE));
        bxbVar.e(new w97("radar_threat_count", 22, 2, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("radar_threat_avg_approach_speed", 23, 2, 10.0d, 0.0d, "m/s", false, profile$Type3));
        bxbVar.e(new w97("radar_threat_max_approach_speed", 24, 2, 10.0d, 0.0d, "m/s", false, profile$Type3));
    }

    public b(bxb bxbVar) {
        super(bxbVar);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public Short a() {
        return n(4, 0, 65535);
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
