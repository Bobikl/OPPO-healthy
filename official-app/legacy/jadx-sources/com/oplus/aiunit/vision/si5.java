package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.garmin.fit.Profile$Type;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;

/* JADX INFO: loaded from: classes13.dex */
public class si5 extends bxb {
    public static final int AntDeviceNumberFieldNum = 21;
    public static final int AntNetworkFieldNum = 22;
    public static final int AntTransmissionTypeFieldNum = 20;
    public static final int BatteryLevelFieldNum = 32;
    public static final int BatteryStatusFieldNum = 11;
    public static final int BatteryVoltageFieldNum = 10;
    public static final int CumOperatingTimeFieldNum = 7;
    public static final int DescriptorFieldNum = 19;
    public static final int DeviceIndexFieldNum = 0;
    public static final int DeviceTypeFieldNum = 1;
    public static final int HardwareVersionFieldNum = 6;
    public static final int ManufacturerFieldNum = 2;
    public static final int ProductFieldNum = 4;
    public static final int ProductNameFieldNum = 27;
    public static final int SensorPositionFieldNum = 18;
    public static final int SerialNumberFieldNum = 3;
    public static final int SoftwareVersionFieldNum = 5;
    public static final int SourceTypeFieldNum = 25;
    public static final int TimestampFieldNum = 253;
    public static final bxb h;

    static {
        bxb bxbVar = new bxb("device_info", 23);
        h = bxbVar;
        bxbVar.e(new w97("timestamp", 253, 134, 1.0d, 0.0d, "s", false, Profile$Type.DATE_TIME));
        bxbVar.e(new w97("device_index", 0, 2, 1.0d, 0.0d, "", false, Profile$Type.DEVICE_INDEX));
        Profile$Type profile$Type = Profile$Type.UINT8;
        bxbVar.e(new w97("device_type", 1, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.d.get(2).k.add(new p2j("ble_device_type", 2, 1.0d, 0.0d, ""));
        bxbVar.d.get(2).k.get(0).b(25, 3L);
        bxbVar.d.get(2).k.add(new p2j("antplus_device_type", 2, 1.0d, 0.0d, ""));
        bxbVar.d.get(2).k.get(1).b(25, 1L);
        bxbVar.d.get(2).k.add(new p2j("ant_device_type", 2, 1.0d, 0.0d, ""));
        bxbVar.d.get(2).k.get(2).b(25, 0L);
        bxbVar.d.get(2).k.add(new p2j("local_device_type", 2, 1.0d, 0.0d, ""));
        bxbVar.d.get(2).k.get(3).b(25, 5L);
        bxbVar.e(new w97("manufacturer", 2, 132, 1.0d, 0.0d, "", false, Profile$Type.MANUFACTURER));
        bxbVar.e(new w97("serial_number", 3, 140, 1.0d, 0.0d, "", false, Profile$Type.UINT32Z));
        Profile$Type profile$Type2 = Profile$Type.UINT16;
        bxbVar.e(new w97("product", 4, 132, 1.0d, 0.0d, "", false, profile$Type2));
        bxbVar.d.get(5).k.add(new p2j("favero_product", 132, 1.0d, 0.0d, ""));
        bxbVar.d.get(5).k.get(0).b(2, 263L);
        bxbVar.d.get(5).k.add(new p2j("garmin_product", 132, 1.0d, 0.0d, ""));
        bxbVar.d.get(5).k.get(1).b(2, 1L);
        bxbVar.d.get(5).k.get(1).b(2, 15L);
        bxbVar.d.get(5).k.get(1).b(2, 13L);
        bxbVar.d.get(5).k.get(1).b(2, 89L);
        bxbVar.e(new w97("software_version", 5, 132, 100.0d, 0.0d, "", false, profile$Type2));
        bxbVar.e(new w97("hardware_version", 6, 2, 1.0d, 0.0d, "", false, profile$Type));
        bxbVar.e(new w97("cum_operating_time", 7, 134, 1.0d, 0.0d, "s", false, Profile$Type.UINT32));
        bxbVar.e(new w97("battery_voltage", 10, 132, 256.0d, 0.0d, ExifInterface.GPS_MEASUREMENT_INTERRUPTED, false, profile$Type2));
        bxbVar.e(new w97("battery_status", 11, 2, 1.0d, 0.0d, "", false, Profile$Type.BATTERY_STATUS));
        bxbVar.e(new w97("sensor_position", 18, 0, 1.0d, 0.0d, "", false, Profile$Type.BODY_LOCATION));
        Profile$Type profile$Type3 = Profile$Type.STRING;
        bxbVar.e(new w97("descriptor", 19, 7, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("ant_transmission_type", 20, 10, 1.0d, 0.0d, "", false, Profile$Type.UINT8Z));
        bxbVar.e(new w97("ant_device_number", 21, 139, 1.0d, 0.0d, "", false, Profile$Type.UINT16Z));
        bxbVar.e(new w97("ant_network", 22, 0, 1.0d, 0.0d, "", false, Profile$Type.ANT_NETWORK));
        bxbVar.e(new w97(HttpConst.SOURCE_TYPE, 25, 0, 1.0d, 0.0d, "", false, Profile$Type.SOURCE_TYPE));
        bxbVar.e(new w97(SensorsBean.PRODUCT_NAME, 27, 7, 1.0d, 0.0d, "", false, profile$Type3));
        bxbVar.e(new w97("battery_level", 32, 2, 1.0d, 0.0d, "%", false, profile$Type));
    }

    public si5(bxb bxbVar) {
        super(bxbVar);
    }
}
