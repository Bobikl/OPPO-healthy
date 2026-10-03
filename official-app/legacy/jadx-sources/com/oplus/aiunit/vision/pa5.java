package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.garmin.fit.Profile$Type;

/* JADX INFO: loaded from: classes13.dex */
public class pa5 extends bxb {
    public static final int BatteryIdentifierFieldNum = 3;
    public static final int BatteryStatusFieldNum = 2;
    public static final int BatteryVoltageFieldNum = 1;
    public static final int DeviceIndexFieldNum = 0;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("device_aux_battery_info", ixb.DEVICE_AUX_BATTERY_INFO);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("device_index", 0, 2, 1.0d, 0.0d, "", false, Profile$Type.DEVICE_INDEX));
        bxbVar.e(new w97("battery_voltage", 1, 132, 256.0d, 0.0d, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, false, Profile$Type.UINT16));
        bxbVar.e(new w97("battery_status", 2, 2, 1.0d, 0.0d, "", false, Profile$Type.BATTERY_STATUS));
        bxbVar.e(new w97("battery_identifier", 3, 2, 1.0d, 0.0d, "", false, Profile$Type.UINT8));
    }

    public pa5(bxb bxbVar) {
        super(bxbVar);
    }
}
