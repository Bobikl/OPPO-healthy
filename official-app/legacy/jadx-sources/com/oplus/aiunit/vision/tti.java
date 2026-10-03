package com.oplus.aiunit.vision;

import android.database.Cursor;
import android.hardware.Sensor;
import android.hardware.SensorManager;

/* JADX INFO: loaded from: classes18.dex */
public class tti {
    public static final String PACKAGE_NAME_STEP_APP = "com.coloros.healthservice";
    public static final String PACKAGE_NAME_STEP_APP_V1 = "com.oplus.healthservice";

    public static void a(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    public static boolean b() {
        return d(PACKAGE_NAME_STEP_APP_V1);
    }

    public static boolean c() {
        if (!m3k.h()) {
            return false;
        }
        SensorManager sensorManager = (SensorManager) b78.a().getSystemService(com.heytap.health.gdxui.stars.b.TAG_SENSOR);
        Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(33171034) : null;
        StringBuilder sb = new StringBuilder();
        sb.append("isExtendStepCounterExist : ");
        sb.append(defaultSensor != null);
        a7b.f("StepUtil", sb.toString());
        if (defaultSensor != null) {
            return b() || d(PACKAGE_NAME_STEP_APP);
        }
        return false;
    }

    public static boolean d(String str) {
        return iba.b(b78.a(), str);
    }
}
