package com.oplus.aiunit.vision;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.oplus.channel.client.data.Action;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\b*\u0001\u001e\u0018\u0000 $2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/pl;", "Lcom/oplus/aiunit/vision/lx9;", "Landroid/hardware/SensorManager;", "sensorManager", "", "b", "Lcom/oplus/aiunit/vision/kx9;", "listener", "a", Action.LIFE_CIRCLE_VALUE_STOP, "release", "", "x", "y", "z", "", "timestamp", "Lcom/oplus/aiunit/vision/f69;", "f", "Lcom/oplus/aiunit/vision/kx9;", "Landroid/hardware/Sensor;", "Landroid/hardware/Sensor;", "mAccSensor", "c", "Landroid/hardware/SensorManager;", "mSensorManager", "", "d", "Z", "mStop", "com/oplus/aiunit/vision/pl$b", MapSchema.FIELD_NAME_ENTRY, "Lcom/oplus/aiunit/vision/pl$b;", "mSensorEventListener", "<init>", "()V", "Companion", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class pl implements lx9 {

    @NotNull
    public static final String TAG = "AccelerometerTaker";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public kx9 listener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Sensor mAccSensor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SensorManager mSensorManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public volatile boolean mStop;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final b mSensorEventListener = new b();

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/oplus/aiunit/vision/pl$b", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/SensorEvent;", "event", "", "onSensorChanged", "Landroid/hardware/Sensor;", com.heytap.health.gdxui.stars.b.TAG_SENSOR, "", "accuracy", "onAccuracyChanged", "heartrate_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements SensorEventListener {
        public b() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(@Nullable Sensor sensor, int accuracy) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(@Nullable SensorEvent event) {
            if (pl.this.mStop || event == null) {
                return;
            }
            pl plVar = pl.this;
            float[] fArr = event.values;
            f69 f69VarF = plVar.f(fArr[0] / 9.8f, fArr[1] / 9.8f, fArr[2] / 9.8f, event.timestamp);
            d6b.INSTANCE.d(pl.TAG, "input : " + f69VarF);
            kx9 kx9Var = plVar.listener;
            if (kx9Var != null) {
                kx9Var.a(f69VarF);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.lx9
    public void a(@NotNull kx9 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    @Override // com.oplus.aiunit.vision.lx9
    public void b(@NotNull SensorManager sensorManager) {
        Intrinsics.checkNotNullParameter(sensorManager, "sensorManager");
        this.mSensorManager = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        this.mAccSensor = defaultSensor;
        sensorManager.registerListener(this.mSensorEventListener, defaultSensor, 5000);
        this.mStop = false;
    }

    public final f69 f(float x, float y, float z, long timestamp) {
        f69 f69Var = new f69();
        f69Var.f(x);
        f69Var.g(y);
        f69Var.h(z);
        f69Var.e(timestamp);
        return f69Var;
    }

    @Override // com.oplus.aiunit.vision.lx9
    public void release() {
        this.listener = null;
        this.mStop = false;
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.mSensorEventListener);
        }
    }

    @Override // com.oplus.aiunit.vision.lx9
    public void stop() {
        this.mStop = true;
    }
}
