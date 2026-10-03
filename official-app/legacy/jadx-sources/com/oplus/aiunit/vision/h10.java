package com.oplus.aiunit.vision;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.preference.PreferenceManager;
import com.heytap.store.platform.barcode.camera.CameraManager;
import com.heytap.store.platform.barcode.camera.FrontLightMode;

/* JADX INFO: loaded from: classes6.dex */
public final class h10 implements SensorEventListener {
    public float i = 45.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f11958j = 100.0f;
    public final Context k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CameraManager f11959l;
    public Sensor m;

    public h10(Context context) {
        this.k = context;
    }

    public void a(float f) {
        this.f11958j = f;
    }

    public void b(float f) {
        this.i = f;
    }

    public void c(CameraManager cameraManager) {
        this.f11959l = cameraManager;
        if (FrontLightMode.readPref(PreferenceManager.getDefaultSharedPreferences(this.k)) == FrontLightMode.AUTO) {
            SensorManager sensorManager = (SensorManager) this.k.getSystemService(com.heytap.health.gdxui.stars.b.TAG_SENSOR);
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.m = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public void d() {
        if (this.m != null) {
            ((SensorManager) this.k.getSystemService(com.heytap.health.gdxui.stars.b.TAG_SENSOR)).unregisterListener(this);
            this.f11959l = null;
            this.m = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        CameraManager cameraManager = this.f11959l;
        if (cameraManager != null) {
            if (f <= this.i) {
                cameraManager.sensorChanged(true, f);
            } else if (f >= this.f11958j) {
                cameraManager.sensorChanged(false, f);
            }
        }
    }
}
