package com.example.sfxplayer.sensor;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u001d\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0001\u0006B'\b\u0007\u0012\u0006\u0010H\u001a\u00020G\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010I\u0012\b\b\u0002\u0010K\u001a\u00020\f¢\u0006\u0004\bL\u0010MJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0007\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u001a\u0010\u000e\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fH\u0014J\b\u0010\u0013\u001a\u00020\u0005H\u0014J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0014\u0010$\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001dR\u0016\u0010'\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010+\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010&R\u0016\u0010-\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010&R\"\u00104\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0016\u00106\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010/R\u0016\u00108\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010/R\u0014\u0010<\u001a\u0002098\u0002X\u0082D¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u0002098\u0002X\u0082D¢\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010@\u001a\u0002098\u0002X\u0082D¢\u0006\u0006\n\u0004\b?\u0010;R\u0014\u0010B\u001a\u0002098\u0002X\u0082D¢\u0006\u0006\n\u0004\bA\u0010;R\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006O"}, d2 = {"Lcom/example/sfxplayer/sensor/SensorLayoutA;", "Landroid/widget/FrameLayout;", "Landroid/hardware/SensorEventListener;", "Landroid/hardware/Sensor;", b.TAG_SENSOR, "", "a", "c", "Landroid/hardware/SensorEvent;", "event", "onSensorChanged", "computeScroll", "", "accuracy", "onAccuracyChanged", "Landroid/view/View;", "changedView", "visibility", "onVisibilityChanged", "onDetachedFromWindow", "destX", "destY", "b", "Landroid/hardware/SensorManager;", "i", "Landroid/hardware/SensorManager;", "mSensorManager", "", "j", "[F", "mAccelerateValues", MapSchema.FIELD_NAME_KEY, "mMagneticValues", LogFieldKey.LEVEL_KEY, "mRMatrix", LogFieldKey.MESSAGE_KEY, "mPhoneAngleValues", "n", "Landroid/hardware/Sensor;", "accelerometerSensor", "o", "magneticSensor", LogFieldKey.PROCESS_NAME_KEY, "gravitySensor", "q", "gyroscopeSensor", "r", "I", "getDirection", "()I", "setDirection", "(I)V", "direction", "s", "xMaxMoveDistance", "t", "yMaxMoveDistance", "", "u", "D", "minDegreeY", "v", "maxDegreeY", "w", "minDegreeX", "x", "maxDegreeX", "Landroid/widget/Scroller;", "y", "Landroid/widget/Scroller;", "mScroller", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "sfxplayer_debug"}, k = 1, mv = {1, 7, 1})
public final class SensorLayoutA extends FrameLayout implements SensorEventListener {
    public static final int DIRECTION_LEFT = 1;
    public static final int DIRECTION_RIGHT = -1;
    public static final int DURATION = 200;

    @NotNull
    public static final String TAG = "SensorLayout";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public SensorManager mSensorManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public float[] mAccelerateValues;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public float[] mMagneticValues;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final float[] mRMatrix;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final float[] mPhoneAngleValues;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Sensor accelerometerSensor;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public Sensor magneticSensor;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public Sensor gravitySensor;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public Sensor gyroscopeSensor;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public int direction;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int xMaxMoveDistance;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int yMaxMoveDistance;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final double minDegreeY;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final double maxDegreeY;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final double minDegreeX;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public final double maxDegreeX;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public final Scroller mScroller;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SensorLayoutA(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(@NotNull Sensor sensor) {
        Intrinsics.checkNotNullParameter(sensor, "sensor");
        this.mSensorManager.registerListener(this, sensor, 1);
    }

    public final void b(int destX, int destY) {
        Log.d("SensorLayout", "目标:" + destX + ", " + destY + "\t final:" + this.mScroller.getFinalX() + ", " + this.mScroller.getFinalY() + "\t  当前:" + getScrollX() + ", " + getScrollY());
        this.mScroller.startScroll(getScrollX(), getScrollY(), destX - getScrollX(), destY - getScrollY(), 200);
        postInvalidate();
    }

    public final void c() {
        this.mSensorManager.unregisterListener(this, this.accelerometerSensor);
        this.mSensorManager.unregisterListener(this, this.magneticSensor);
        this.mSensorManager.unregisterListener(this, this.gravitySensor);
        this.mSensorManager.unregisterListener(this, this.gyroscopeSensor);
        this.mSensorManager.unregisterListener(this, this.accelerometerSensor);
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
        c();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x009a  */
    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(@NotNull SensorEvent event) {
        float[] fArr;
        int finalX;
        boolean z;
        double d;
        double dAbs;
        int i;
        double d2;
        double dAbs2;
        int i2;
        Intrinsics.checkNotNullParameter(event, "event");
        int type = event.sensor.getType();
        boolean z2 = true;
        if (type == 1) {
            this.mAccelerateValues = event.values;
        } else if (type == 2) {
            this.mMagneticValues = event.values;
        }
        float[] fArr2 = this.mAccelerateValues;
        if (fArr2 == null || (fArr = this.mMagneticValues) == null) {
            return;
        }
        SensorManager.getRotationMatrix(this.mRMatrix, null, fArr2, fArr);
        SensorManager.getOrientation(this.mRMatrix, this.mPhoneAngleValues);
        double degrees = Math.toDegrees(this.mPhoneAngleValues[1]);
        double degrees2 = Math.toDegrees(this.mPhoneAngleValues[2]);
        int finalY = 0;
        if (degrees2 <= 0.0d) {
            double d3 = this.minDegreeY;
            if (degrees2 > d3) {
                dAbs = (degrees2 / Math.abs(d3)) * ((double) this.xMaxMoveDistance);
                i = this.direction;
            } else {
                if (degrees2 > 0.0d) {
                    d = this.maxDegreeY;
                    if (degrees2 < d) {
                        dAbs = (degrees2 / Math.abs(d)) * ((double) this.xMaxMoveDistance);
                        i = this.direction;
                    }
                }
                finalX = 0;
                z = false;
            }
            finalX = (int) (dAbs * ((double) i));
            z = true;
        } else {
            if (degrees2 > 0.0d) {
                d = this.maxDegreeY;
                if (degrees2 < d) {
                    dAbs = (degrees2 / Math.abs(d)) * ((double) this.xMaxMoveDistance);
                    i = this.direction;
                    finalX = (int) (dAbs * ((double) i));
                    z = true;
                }
            }
            finalX = 0;
            z = false;
        }
        if (degrees <= 0.0d) {
            double d4 = this.minDegreeX;
            if (degrees > d4) {
                dAbs2 = (degrees / Math.abs(d4)) * ((double) this.yMaxMoveDistance);
                i2 = this.direction;
            } else {
                if (degrees > 0.0d) {
                    d2 = this.maxDegreeX;
                    if (degrees < d2) {
                        dAbs2 = (degrees / Math.abs(d2)) * ((double) this.yMaxMoveDistance);
                        i2 = this.direction;
                    }
                }
                z2 = false;
            }
            finalY = (int) (dAbs2 * ((double) i2));
        } else {
            if (degrees > 0.0d) {
                d2 = this.maxDegreeX;
                if (degrees < d2) {
                    dAbs2 = (degrees / Math.abs(d2)) * ((double) this.yMaxMoveDistance);
                    i2 = this.direction;
                    finalY = (int) (dAbs2 * ((double) i2));
                }
            }
            z2 = false;
        }
        if (!z) {
            finalX = this.mScroller.getFinalX();
        }
        if (!z2) {
            finalY = this.mScroller.getFinalY();
        }
        b(finalX, finalY);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, visibility);
        if (visibility != 0) {
            c();
        } else {
            a(this.accelerometerSensor);
            a(this.magneticSensor);
        }
    }

    public final void setDirection(int i) {
        this.direction = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SensorLayoutA(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SensorLayoutA(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SensorLayoutA(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mRMatrix = new float[9];
        this.mPhoneAngleValues = new float[3];
        this.direction = 1;
        this.xMaxMoveDistance = 60;
        this.yMaxMoveDistance = 60;
        this.minDegreeY = -30.0d;
        this.maxDegreeY = 30.0d;
        this.minDegreeX = -30.0d;
        this.maxDegreeX = 30.0d;
        this.mScroller = new Scroller(context);
        Object systemService = context.getSystemService(b.TAG_SENSOR);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        this.mSensorManager = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        Intrinsics.checkNotNullExpressionValue(defaultSensor, "mSensorManager.getDefaul…ensor.TYPE_ACCELEROMETER)");
        this.accelerometerSensor = defaultSensor;
        Sensor defaultSensor2 = this.mSensorManager.getDefaultSensor(2);
        Intrinsics.checkNotNullExpressionValue(defaultSensor2, "mSensorManager.getDefaul…nsor.TYPE_MAGNETIC_FIELD)");
        this.magneticSensor = defaultSensor2;
        Sensor defaultSensor3 = this.mSensorManager.getDefaultSensor(9);
        Intrinsics.checkNotNullExpressionValue(defaultSensor3, "mSensorManager.getDefaul…nsor(Sensor.TYPE_GRAVITY)");
        this.gravitySensor = defaultSensor3;
        Sensor defaultSensor4 = this.mSensorManager.getDefaultSensor(4);
        Intrinsics.checkNotNullExpressionValue(defaultSensor4, "mSensorManager.getDefaul…or(Sensor.TYPE_GYROSCOPE)");
        this.gyroscopeSensor = defaultSensor4;
    }
}
