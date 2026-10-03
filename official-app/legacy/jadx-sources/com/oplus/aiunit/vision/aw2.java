package com.oplus.aiunit.vision;

import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class aw2 extends bxb {
    public static final int CameraEventTypeFieldNum = 1;
    public static final int CameraFileUuidFieldNum = 2;
    public static final int CameraOrientationFieldNum = 3;
    public static final int TimestampFieldNum = 253;
    public static final int TimestampMsFieldNum = 0;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("camera_event", 161);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("timestamp_ms", 0, 132, 1.0d, 0.0d, "ms", false, Profile$Type.UINT16));
        bxbVar.e(new w97("camera_event_type", 1, 0, 1.0d, 0.0d, "", false, Profile$Type.CAMERA_EVENT_TYPE));
        bxbVar.e(new w97("camera_file_uuid", 2, 7, 1.0d, 0.0d, "", false, Profile$Type.STRING));
        bxbVar.e(new w97("camera_orientation", 3, 0, 1.0d, 0.0d, "", false, Profile$Type.CAMERA_ORIENTATION_TYPE));
    }

    public aw2(bxb bxbVar) {
        super(bxbVar);
    }
}
