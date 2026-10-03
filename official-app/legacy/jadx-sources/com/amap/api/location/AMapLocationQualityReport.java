package com.amap.api.location;

import com.autonavi.aps.amapapi.utils.c;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;

/* JADX INFO: loaded from: classes12.dex */
public class AMapLocationQualityReport implements Cloneable {
    public static final int GPS_STATUS_MODE_SAVING = 3;
    public static final int GPS_STATUS_NOGPSPERMISSION = 4;
    public static final int GPS_STATUS_NOGPSPROVIDER = 1;
    public static final int GPS_STATUS_OFF = 2;
    public static final int GPS_STATUS_OK = 0;
    private boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f888c = 2;
    private int d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f889e = LanConstants.OPERATOR_UNKNOWN;
    private long f = 0;
    private boolean g = false;
    AMapLocationClientOption.AMapLocationMode a = AMapLocationClientOption.AMapLocationMode.Hight_Accuracy;

    public String getAdviseMessage() {
        StringBuffer stringBuffer = new StringBuffer();
        AMapLocationClientOption.AMapLocationMode aMapLocationMode = this.a;
        if (aMapLocationMode != AMapLocationClientOption.AMapLocationMode.Battery_Saving) {
            int i = this.f888c;
            if (i != 0) {
                if (i == 1) {
                    stringBuffer.append("您的设备没有GPS模块或者GPS模块异常，无法进行GPS定位\n");
                } else if (i == 2) {
                    stringBuffer.append("您的设备关闭了GPS定位功能，开启GPS定位功能有助于提高定位的精确度\n");
                } else if (i == 3) {
                    stringBuffer.append("您的设备当前设置的定位模式不包含GPS定位，选择包含GPS模式的定位模式有助于提高定位的精确度\n");
                } else if (i == 4) {
                    stringBuffer.append("您的设置禁用了GPS定位权限，开启GPS定位权限有助于提高定位的精确度\n");
                }
            } else if (aMapLocationMode == AMapLocationClientOption.AMapLocationMode.Device_Sensors && this.d < 4) {
                stringBuffer.append("当前GPS信号弱，位置更新可能会延迟\n");
            }
        }
        if (this.a != AMapLocationClientOption.AMapLocationMode.Device_Sensors) {
            if (LanConstants.STATE_DISCONNECTED.equals(this.f889e)) {
                stringBuffer.append("您的设备未连接到网络，无法进行网络定位\n");
            } else if ("2G".equals(this.f889e)) {
                stringBuffer.append("您的设备网络状态不太好，网络定位可能会有延迟\n");
            }
            if (!this.b) {
                stringBuffer.append("您的设备WIFI开关已关闭，打开WIFI开关有助于提高定位的成功率\n");
            }
        }
        return stringBuffer.toString();
    }

    public int getGPSSatellites() {
        return this.d;
    }

    public int getGPSStatus() {
        return this.f888c;
    }

    public long getNetUseTime() {
        return this.f;
    }

    public String getNetworkType() {
        return this.f889e;
    }

    public boolean isInstalledHighDangerMockApp() {
        return this.g;
    }

    public boolean isWifiAble() {
        return this.b;
    }

    public void setGPSSatellites(int i) {
        this.d = i;
    }

    public void setGpsStatus(int i) {
        this.f888c = i;
    }

    public void setInstallHighDangerMockApp(boolean z) {
        this.g = z;
    }

    public void setLocationMode(AMapLocationClientOption.AMapLocationMode aMapLocationMode) {
        this.a = aMapLocationMode;
    }

    public void setNetUseTime(long j2) {
        this.f = j2;
    }

    public void setNetworkType(String str) {
        this.f889e = str;
    }

    public void setWifiAble(boolean z) {
        this.b = z;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AMapLocationQualityReport m4470clone() {
        AMapLocationQualityReport aMapLocationQualityReport = new AMapLocationQualityReport();
        try {
            super.clone();
        } catch (Throwable unused) {
        }
        try {
            aMapLocationQualityReport.setGpsStatus(this.f888c);
            aMapLocationQualityReport.setGPSSatellites(this.d);
            aMapLocationQualityReport.setWifiAble(this.b);
            aMapLocationQualityReport.setNetUseTime(this.f);
            aMapLocationQualityReport.setNetworkType(this.f889e);
            aMapLocationQualityReport.setLocationMode(this.a);
            aMapLocationQualityReport.setInstallHighDangerMockApp(this.g);
        } catch (Throwable th) {
            c.a(th, "AMapLocationQualityReport", "clone");
        }
        return aMapLocationQualityReport;
    }
}
