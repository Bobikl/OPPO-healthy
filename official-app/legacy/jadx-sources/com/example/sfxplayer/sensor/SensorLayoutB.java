package com.example.sfxplayer.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.Scroller;
import com.heytap.health.gdxui.stars.b;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 92\u00020\u00012\u00020\u0002:\u0001\u000eB'\b\u0007\u0012\u0006\u00103\u001a\u000202\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104\u0012\b\b\u0002\u00106\u001a\u00020\n¢\u0006\u0004\b7\u00108J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0014J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001aR\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u0014\u0010'\u001a\u00020$8\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020$8\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010&R\u0014\u0010+\u001a\u00020$8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010-\u001a\u00020$8\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010&R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u0006:"}, d2 = {"Lcom/example/sfxplayer/sensor/SensorLayoutB;", "Landroid/widget/FrameLayout;", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/SensorEvent;", "event", "", "onSensorChanged", "computeScroll", "Landroid/hardware/Sensor;", b.TAG_SENSOR, "", "accuracy", "onAccuracyChanged", "onDetachedFromWindow", "a", "desX", "desY", "b", "Landroid/hardware/SensorManager;", "i", "Landroid/hardware/SensorManager;", "mSensorManager", "j", "Landroid/hardware/Sensor;", "gyroscopeSensor", MapSchema.FIELD_NAME_KEY, "I", "getDirection", "()I", "setDirection", "(I)V", "direction", LogFieldKey.LEVEL_KEY, "xMaxOffset", LogFieldKey.MESSAGE_KEY, "yMaxOffset", "", "n", "D", "minAngleY", "o", "maxAngleY", LogFieldKey.PROCESS_NAME_KEY, "minAngleX", "q", "maxAngleX", "Landroid/widget/Scroller;", "r", "Landroid/widget/Scroller;", "mScroller", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "sfxplayer_debug"}, k = 1, mv = {1, 7, 1})
public final class SensorLayoutB extends FrameLayout implements SensorEventListener {
    public static final int DIRECTION_LEFT = 1;
    public static final int DIRECTION_RIGHT = -1;
    public static final double DT = 0.02d;
    public static final int DURATION = 100;

    @NotNull
    public static final String TAG = "SensorLayout";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public SensorManager mSensorManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Sensor gyroscopeSensor;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int direction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int xMaxOffset;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int yMaxOffset;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final double minAngleY;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final double maxAngleY;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final double minAngleX;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public final double maxAngleX;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Scroller mScroller;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SensorLayoutB(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(Sensor sensor) {
        this.mSensorManager.registerListener(this, sensor, 1);
    }

    public final void b(int desX, int desY) {
        this.mScroller.startScroll(getScrollX(), getScrollY(), desX, desY, 100);
        postInvalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mScroller.computeScrollOffset()) {
            scrollTo(this.mScroller.getCurrX(), this.mScroller.getCurrY());
            postInvalidate();
        }
    }

    public final int getDirection() {
        return this.direction;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(@Nullable Sensor sensor, int accuracy) {
        Log.d("SensorLayout", "onAccuracyChanged:" + accuracy);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mSensorManager.unregisterListener(this, this.gyroscopeSensor);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NotNull SensorEvent event) {
        int i;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.sensor.getType() == 4) {
            float[] fArr = event.values;
            int i2 = 0;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            double degrees = Math.toDegrees(((double) f) * 0.02d);
            double degrees2 = Math.toDegrees(((double) f2) * 0.02d);
            double dMin = Math.min(Math.max(this.minAngleX, degrees), this.maxAngleX);
            double dMin2 = Math.min(Math.max(this.minAngleY, degrees2), this.maxAngleY);
            Log.d("SensorLayout", "角度信息：angleX=" + dMin + "\tangleY=" + dMin2);
            float fAbs = Math.abs(f);
            float fAbs2 = Math.abs(f2);
            float fAbs3 = Math.abs(f3);
            if (fAbs > fAbs2 + fAbs3 && fAbs > 0.1d) {
                i = (int) ((dMin / this.maxAngleX) * ((double) this.xMaxOffset) * ((double) this.direction));
            } else if (fAbs2 <= fAbs + fAbs3 || fAbs2 <= 0.1d) {
                i = 0;
            } else {
                i2 = (int) ((dMin2 / this.maxAngleY) * ((double) this.yMaxOffset) * ((double) this.direction));
                i = 0;
            }
            b(i2, i);
        }
    }

    public final void setDirection(int i) {
        this.direction = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SensorLayoutB(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SensorLayoutB(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SensorLayoutB(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.direction = 1;
        this.xMaxOffset = 60;
        this.yMaxOffset = 60;
        this.minAngleY = -30.0d;
        this.maxAngleY = 30.0d;
        this.minAngleX = -30.0d;
        this.maxAngleX = 30.0d;
        this.mScroller = new Scroller(context);
        Object systemService = context.getSystemService(b.TAG_SENSOR);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.mSensorManager = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(4);
        Intrinsics.checkNotNullExpressionValue(defaultSensor, "mSensorManager.getDefaul…or(Sensor.TYPE_GYROSCOPE)");
        this.gyroscopeSensor = defaultSensor;
        a(defaultSensor);
        setScaleX(1.2f);
        setScaleY(1.2f);
    }
}
