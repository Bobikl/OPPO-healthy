package com.garmin.fit;

import com.oplus.aiunit.vision.bxb;
import com.oplus.aiunit.vision.jxb;
import com.oplus.aiunit.vision.s05;
import com.oplus.aiunit.vision.w97;

/* JADX INFO: loaded from: classes13.dex */
public class a extends bxb implements jxb {
    public static final int EventFieldNum = 3;
    public static final int EventGroupFieldNum = 6;
    public static final int EventTypeFieldNum = 4;
    public static final int LocalTimestampFieldNum = 5;
    public static final int NumSessionsFieldNum = 1;
    public static final int TimestampFieldNum = 253;
    public static final int TotalTimerTimeFieldNum = 0;
    public static final int TypeFieldNum = 2;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("activity", 34);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("total_timer_time", 0, 134, 1000.0d, 0.0d, "s", false, Profile$Type.UINT32));
        bxbVar.e(new w97("num_sessions", 1, 132, 1.0d, 0.0d, "", false, Profile$Type.UINT16));
        bxbVar.e(new w97("type", 2, 0, 1.0d, 0.0d, "", false, Profile$Type.ACTIVITY));
        bxbVar.e(new w97("event", 3, 0, 1.0d, 0.0d, "", false, Profile$Type.EVENT));
        bxbVar.e(new w97("event_type", 4, 0, 1.0d, 0.0d, "", false, Profile$Type.EVENT_TYPE));
        bxbVar.e(new w97("local_timestamp", 5, 134, 1.0d, 0.0d, "", false, Profile$Type.LOCAL_DATE_TIME));
        bxbVar.e(new w97("event_group", 6, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
    }

    public a(bxb bxbVar) {
        super(bxbVar);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public Short a() {
        return n(6, 0, 65535);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public void b(s05 s05Var) {
        v(253, 0, s05Var.l(), 65535);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public void c(EventType eventType) {
        v(4, 0, Short.valueOf(eventType.value), 65535);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public Event getEvent() {
        Short shN = n(3, 0, 65535);
        if (shN == null) {
            return null;
        }
        return Event.getByValue(shN);
    }

    @Override // com.oplus.aiunit.vision.jxb
    public EventType getEventType() {
        Short shN = n(4, 0, 65535);
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
