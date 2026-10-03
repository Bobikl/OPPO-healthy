package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes16.dex */
public class mz6 {
    public static boolean a() {
        if (m3k.h()) {
            return (c(tti.PACKAGE_NAME_STEP_APP) || c(tti.PACKAGE_NAME_STEP_APP_V1)) && b(b78.a());
        }
        return false;
    }

    public static boolean b(Context context) {
        if (!m3k.h()) {
            return false;
        }
        SensorManager sensorManager = (SensorManager) context.getSystemService(com.heytap.health.gdxui.stars.b.TAG_SENSOR);
        Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(33171034) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("isExtendStepCounterExist : ");
        sb.append(defaultSensor != null);
        a7b.f("ExtendStepUtil", sb.toString());
        return defaultSensor != null;
    }

    public static boolean c(String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = b78.a().getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            a7b.c("ExtendStepUtil", "exception: ", e2);
            packageInfo = null;
        }
        return packageInfo != null;
    }
}
