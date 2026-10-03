package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;
import com.heytap.databaseengine.apiv3.data.Element;

/* JADX INFO: loaded from: classes13.dex */
public class snj extends bxb {
    public static final int PressureFieldNum = 1;
    public static final int SensorFieldNum = 0;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("tank_update", ixb.TANK_UPDATE);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97(com.heytap.health.gdxui.stars.b.TAG_SENSOR, 0, 140, 1.0d, 0.0d, "", false, Profile$Type.ANT_CHANNEL_ID));
        bxbVar.e(new w97(Element.ELEMENT_NAME_PRESSURE, 1, 132, 100.0d, 0.0d, "bar", false, Profile$Type.UINT16));
    }

    public snj(bxb bxbVar) {
        super(bxbVar);
    }
}
