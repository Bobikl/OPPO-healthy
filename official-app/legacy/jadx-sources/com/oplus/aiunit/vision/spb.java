package com.oplus.aiunit.vision;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import com.heytap.health.healthbase.bean.SupportedPhoneBean;
import com.oplus.channel.client.data.Action;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\b*\u0001\u0012\u0018\u0000 \u00182\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/oplus/aiunit/vision/spb;", "Lcom/oplus/aiunit/vision/lx9;", "Landroid/hardware/SensorManager;", "sensorManager", "", "b", "Lcom/oplus/aiunit/vision/kx9;", "listener", "a", Action.LIFE_CIRCLE_VALUE_STOP, "release", "Lcom/oplus/aiunit/vision/kx9;", "Landroid/hardware/Sensor;", "Landroid/hardware/Sensor;", "mMeasureSensor", "c", "Landroid/hardware/SensorManager;", "mSensorManager", "com/oplus/aiunit/vision/spb$b", "d", "Lcom/oplus/aiunit/vision/spb$b;", "mSensorEventListener", "<init>", "()V", "Companion", "heartrate_release"}, k = 1, mv = {1, 8, 0})
public final class spb implements lx9 {

    @NotNull
    public static final String TAG = "MeasureTaker";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public kx9 listener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Sensor mMeasureSensor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SensorManager mSensorManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final b mSensorEventListener = new b();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final List<SupportedPhoneBean.PhoneMeasureHeartRate> f16680e = new ArrayList();

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.spb$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/spb$a;", "", "Landroid/content/Context;", "context", "", "a", "", "MEASURE_SENSOR_TYPE", "I", "", "TAG", "Ljava/lang/String;", "", "Lcom/heytap/health/healthbase/bean/SupportedPhoneBean$PhoneMeasureHeartRate;", "mWhitelist", "Ljava/util/List;", "<init>", "()V", "heartrate_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nMeasureTaker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureTaker.kt\ncom/heytap/health/heartrate/measure/sensor/MeasureTaker$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1855#2,2:103\n*S KotlinDebug\n*F\n+ 1 MeasureTaker.kt\ncom/heytap/health/heartrate/measure/sensor/MeasureTaker$Companion\n*L\n44#1:103,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean a(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            spb.f16680e.clear();
            spb.f16680e.addAll(uu3.a());
            a7b.f(spb.TAG, "check whitelist size:" + spb.f16680e.size());
            boolean z = false;
            for (SupportedPhoneBean.PhoneMeasureHeartRate phoneMeasureHeartRate : spb.f16680e) {
                String model = phoneMeasureHeartRate.getModel();
                StringBuilder sb = new StringBuilder();
                sb.append("checkList:");
                sb.append(model);
                if (Intrinsics.areEqual(phoneMeasureHeartRate.getModel(), Build.MODEL)) {
                    z = true;
                }
            }
            if (!z) {
                a7b.f(spb.TAG, "phone not support heart rate feature");
                return false;
            }
            Object systemService = context.getSystemService(com.heytap.health.gdxui.stars.b.TAG_SENSOR);
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            Sensor defaultSensor = ((SensorManager) systemService).getDefaultSensor(33171061);
            a7b.f(spb.TAG, " check measure sensor is " + (defaultSensor != null));
            return defaultSensor != null;
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/oplus/aiunit/vision/spb$b", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/SensorEvent;", "event", "", "onSensorChanged", "Landroid/hardware/Sensor;", com.heytap.health.gdxui.stars.b.TAG_SENSOR, "", "accuracy", "onAccuracyChanged", "heartrate_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements SensorEventListener {
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(@Nullable Sensor sensor, int accuracy) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(@Nullable SensorEvent event) {
        }
    }

    @JvmStatic
    public static final boolean d(@NotNull Context context) {
        return INSTANCE.a(context);
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
        Sensor defaultSensor = sensorManager.getDefaultSensor(33171061);
        this.mMeasureSensor = defaultSensor;
        sensorManager.registerListener(this.mSensorEventListener, defaultSensor, 5000);
    }

    @Override // com.oplus.aiunit.vision.lx9
    public void release() {
        this.listener = null;
        SensorManager sensorManager = this.mSensorManager;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.mSensorEventListener);
        }
    }

    @Override // com.oplus.aiunit.vision.lx9
    public void stop() {
    }
}
